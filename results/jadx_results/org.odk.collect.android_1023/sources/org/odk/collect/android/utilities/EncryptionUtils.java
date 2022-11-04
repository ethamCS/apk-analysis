package org.odk.collect.android.utilities;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.javarosa.core.services.Logger;
import org.kxml2.io.KXmlSerializer;
import org.kxml2.kdom.Document;
import org.kxml2.kdom.Element;
import org.odk.collect.android.logic.FormController;
/* loaded from: classes.dex */
public class EncryptionUtils {
    public static final String ASYMMETRIC_ALGORITHM = "RSA/NONE/OAEPWithSHA256AndMGF1Padding";
    private static final String BASE64_ENCRYPTED_ELEMENT_SIGNATURE = "base64EncryptedElementSignature";
    private static final String BASE64_ENCRYPTED_KEY = "base64EncryptedKey";
    private static final String DATA = "data";
    private static final String ENCRYPTED = "encrypted";
    private static final String ENCRYPTED_XML_FILE = "encryptedXmlFile";
    private static final String FILE = "file";
    private static final String ID = "id";
    private static final String INSTANCE_ID = "instanceID";
    public static final int IV_BYTE_LENGTH = 16;
    private static final String MEDIA = "media";
    private static final String META = "meta";
    private static final String NEW_LINE = "\n";
    public static final String RSA_ALGORITHM = "RSA";
    public static final String SYMMETRIC_ALGORITHM = "AES/CFB/PKCS5Padding";
    public static final int SYMMETRIC_KEY_LENGTH = 256;
    public static final String UTF_8 = "UTF-8";
    private static final String VERSION = "version";
    private static final String XML_ENCRYPTED_TAG_NAMESPACE = "http://www.opendatakit.org/xforms/encrypted";
    private static final String XML_OPENROSA_NAMESPACE = "http://openrosa.org/xforms";
    private static final String t = "EncryptionUtils";

    private EncryptionUtils() {
    }

    /* loaded from: classes.dex */
    public static final class EncryptedFormInformation {
        public final String base64RsaEncryptedSymmetricKey;
        public final String formId;
        public final String formVersion;
        public final FormController.InstanceMetadata instanceMetadata;
        public final byte[] ivSeedArray;
        public final PublicKey rsaPublicKey;
        public final SecretKeySpec symmetricKey;
        public final Base64Wrapper wrapper;
        private int ivCounter = 0;
        public final StringBuilder elementSignatureSource = new StringBuilder();

        EncryptedFormInformation(String formId, String formVersion, FormController.InstanceMetadata instanceMetadata, PublicKey rsaPublicKey, Base64Wrapper wrapper) {
            this.formId = formId;
            this.formVersion = formVersion;
            this.instanceMetadata = instanceMetadata;
            this.rsaPublicKey = rsaPublicKey;
            this.wrapper = wrapper;
            SecureRandom r = new SecureRandom();
            byte[] key = new byte[32];
            r.nextBytes(key);
            SecretKeySpec sk = new SecretKeySpec(key, EncryptionUtils.SYMMETRIC_ALGORITHM);
            this.symmetricKey = sk;
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(instanceMetadata.instanceId.getBytes("UTF-8"));
                md.update(key);
                byte[] messageDigest = md.digest();
                this.ivSeedArray = new byte[16];
                for (int i = 0; i < 16; i++) {
                    this.ivSeedArray[i] = messageDigest[i % messageDigest.length];
                }
                try {
                    Cipher pkCipher = Cipher.getInstance(EncryptionUtils.ASYMMETRIC_ALGORITHM);
                    pkCipher.init(1, rsaPublicKey);
                    byte[] pkEncryptedKey = pkCipher.doFinal(key);
                    String alg = pkCipher.getAlgorithm();
                    Log.i(EncryptionUtils.t, "AlgorithmUsed: " + alg);
                    this.base64RsaEncryptedSymmetricKey = wrapper.encodeToString(pkEncryptedKey);
                    appendElementSignatureSource(formId);
                    if (formVersion != null) {
                        appendElementSignatureSource(formVersion.toString());
                    }
                    appendElementSignatureSource(this.base64RsaEncryptedSymmetricKey);
                    appendElementSignatureSource(instanceMetadata.instanceId);
                } catch (InvalidKeyException e) {
                    Log.e(EncryptionUtils.t, "Unable to encrypt the symmetric key");
                    e.printStackTrace();
                    throw new IllegalArgumentException(e.getMessage());
                } catch (NoSuchAlgorithmException e2) {
                    Log.e(EncryptionUtils.t, "Unable to encrypt the symmetric key");
                    e2.printStackTrace();
                    throw new IllegalArgumentException(e2.getMessage());
                } catch (BadPaddingException e3) {
                    Log.e(EncryptionUtils.t, "Unable to encrypt the symmetric key");
                    e3.printStackTrace();
                    throw new IllegalArgumentException(e3.getMessage());
                } catch (IllegalBlockSizeException e4) {
                    Log.e(EncryptionUtils.t, "Unable to encrypt the symmetric key");
                    e4.printStackTrace();
                    throw new IllegalArgumentException(e4.getMessage());
                } catch (NoSuchPaddingException e5) {
                    Log.e(EncryptionUtils.t, "Unable to encrypt the symmetric key");
                    e5.printStackTrace();
                    throw new IllegalArgumentException(e5.getMessage());
                }
            } catch (UnsupportedEncodingException e6) {
                Log.e(EncryptionUtils.t, e6.toString());
                e6.printStackTrace();
                throw new IllegalArgumentException(e6.getMessage());
            } catch (NoSuchAlgorithmException e7) {
                Log.e(EncryptionUtils.t, e7.toString());
                e7.printStackTrace();
                throw new IllegalArgumentException(e7.getMessage());
            }
        }

        public void appendElementSignatureSource(String value) {
            this.elementSignatureSource.append(value).append(EncryptionUtils.NEW_LINE);
        }

        public void appendFileSignatureSource(File file) {
            String md5Hash = FileUtils.getMd5Hash(file);
            appendElementSignatureSource(file.getName() + "::" + md5Hash);
        }

        public String getBase64EncryptedElementSignature() {
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(this.elementSignatureSource.toString().getBytes("UTF-8"));
                byte[] messageDigest = md.digest();
                try {
                    Cipher pkCipher = Cipher.getInstance(EncryptionUtils.ASYMMETRIC_ALGORITHM);
                    pkCipher.init(1, this.rsaPublicKey);
                    byte[] pkEncryptedKey = pkCipher.doFinal(messageDigest);
                    return this.wrapper.encodeToString(pkEncryptedKey);
                } catch (InvalidKeyException e) {
                    Log.e(EncryptionUtils.t, "Unable to encrypt the symmetric key");
                    e.printStackTrace();
                    throw new IllegalArgumentException(e.getMessage());
                } catch (NoSuchAlgorithmException e2) {
                    Log.e(EncryptionUtils.t, "Unable to encrypt the symmetric key");
                    e2.printStackTrace();
                    throw new IllegalArgumentException(e2.getMessage());
                } catch (BadPaddingException e3) {
                    Log.e(EncryptionUtils.t, "Unable to encrypt the symmetric key");
                    e3.printStackTrace();
                    throw new IllegalArgumentException(e3.getMessage());
                } catch (IllegalBlockSizeException e4) {
                    Log.e(EncryptionUtils.t, "Unable to encrypt the symmetric key");
                    e4.printStackTrace();
                    throw new IllegalArgumentException(e4.getMessage());
                } catch (NoSuchPaddingException e5) {
                    Log.e(EncryptionUtils.t, "Unable to encrypt the symmetric key");
                    e5.printStackTrace();
                    throw new IllegalArgumentException(e5.getMessage());
                }
            } catch (UnsupportedEncodingException e6) {
                Log.e(EncryptionUtils.t, e6.toString());
                e6.printStackTrace();
                throw new IllegalArgumentException(e6.getMessage());
            } catch (NoSuchAlgorithmException e7) {
                Log.e(EncryptionUtils.t, e7.toString());
                e7.printStackTrace();
                throw new IllegalArgumentException(e7.getMessage());
            }
        }

        public Cipher getCipher() throws InvalidKeyException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchPaddingException {
            byte[] bArr = this.ivSeedArray;
            int length = this.ivCounter % this.ivSeedArray.length;
            bArr[length] = (byte) (bArr[length] + 1);
            this.ivCounter++;
            IvParameterSpec baseIv = new IvParameterSpec(this.ivSeedArray);
            Cipher c = Cipher.getInstance(EncryptionUtils.SYMMETRIC_ALGORITHM);
            c.init(1, this.symmetricKey, baseIv);
            return c;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:102:0x01d9
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:92)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static org.odk.collect.android.utilities.EncryptionUtils.EncryptedFormInformation getEncryptedFormInformation(android.net.Uri r26, org.odk.collect.android.logic.FormController.InstanceMetadata r27) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.odk.collect.android.utilities.EncryptionUtils.getEncryptedFormInformation(android.net.Uri, org.odk.collect.android.logic.FormController$InstanceMetadata):org.odk.collect.android.utilities.EncryptionUtils$EncryptedFormInformation");
    }

    private static void encryptFile(File file, EncryptedFormInformation formInfo) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
        File encryptedFile = new File(file.getParentFile(), file.getName() + ".enc");
        formInfo.appendFileSignatureSource(file);
        try {
            Cipher c = formInfo.getCipher();
            OutputStream fout = new CipherOutputStream(new FileOutputStream(encryptedFile), c);
            InputStream fin = new FileInputStream(file);
            byte[] buffer = new byte[Logger.MAX_MSG_LENGTH];
            for (int len = fin.read(buffer); len != -1; len = fin.read(buffer)) {
                fout.write(buffer, 0, len);
            }
            fin.close();
            fout.flush();
            fout.close();
            Log.i(t, "Encrpyted:" + file.getName() + " -> " + encryptedFile.getName());
        } catch (IOException e) {
            Log.e(t, "Error encrypting: " + file.getName() + " -> " + encryptedFile.getName());
            e.printStackTrace();
            throw e;
        } catch (InvalidAlgorithmParameterException e2) {
            Log.e(t, "Error encrypting: " + file.getName() + " -> " + encryptedFile.getName());
            e2.printStackTrace();
            throw e2;
        } catch (InvalidKeyException e3) {
            Log.e(t, "Error encrypting: " + file.getName() + " -> " + encryptedFile.getName());
            e3.printStackTrace();
            throw e3;
        } catch (NoSuchAlgorithmException e4) {
            Log.e(t, "Error encrypting: " + file.getName() + " -> " + encryptedFile.getName());
            e4.printStackTrace();
            throw e4;
        } catch (NoSuchPaddingException e5) {
            Log.e(t, "Error encrypting: " + file.getName() + " -> " + encryptedFile.getName());
            e5.printStackTrace();
            throw e5;
        }
    }

    public static boolean deletePlaintextFiles(File instanceXml) {
        File instanceDir = instanceXml.getParentFile();
        boolean allSuccessful = true;
        File[] allFiles = instanceDir.listFiles();
        for (File f : allFiles) {
            if (!f.equals(instanceXml) && !f.isDirectory() && !f.getName().endsWith(".enc")) {
                allSuccessful &= f.delete();
            }
        }
        return allSuccessful;
    }

    private static List<File> encryptSubmissionFiles(File instanceXml, File submissionXml, EncryptedFormInformation formInfo) {
        File instanceDir = instanceXml.getParentFile();
        File[] allFiles = instanceDir.listFiles();
        List<File> filesToProcess = new ArrayList<>();
        for (File f : allFiles) {
            if (!f.equals(instanceXml) && !f.equals(submissionXml) && !f.isDirectory() && !f.getName().startsWith(".")) {
                if (f.getName().endsWith(".enc")) {
                    f.delete();
                } else {
                    filesToProcess.add(f);
                }
            }
        }
        for (File f2 : filesToProcess) {
            try {
                encryptFile(f2, formInfo);
            } catch (IOException e) {
                return null;
            } catch (InvalidAlgorithmParameterException e2) {
                return null;
            } catch (InvalidKeyException e3) {
                return null;
            } catch (NoSuchAlgorithmException e4) {
                return null;
            } catch (NoSuchPaddingException e5) {
                return null;
            }
        }
        try {
            encryptFile(submissionXml, formInfo);
            return filesToProcess;
        } catch (IOException e6) {
            return null;
        } catch (InvalidAlgorithmParameterException e7) {
            return null;
        } catch (InvalidKeyException e8) {
            return null;
        } catch (NoSuchAlgorithmException e9) {
            return null;
        } catch (NoSuchPaddingException e10) {
            return null;
        }
    }

    public static boolean generateEncryptedSubmission(File instanceXml, File submissionXml, EncryptedFormInformation formInfo) {
        if (!submissionXml.exists() || !submissionXml.isFile()) {
            Log.e(t, "No submission.xml found");
            return false;
        }
        List<File> mediaFiles = encryptSubmissionFiles(instanceXml, submissionXml, formInfo);
        return mediaFiles != null && writeSubmissionManifest(formInfo, submissionXml, mediaFiles);
    }

    private static boolean writeSubmissionManifest(EncryptedFormInformation formInfo, File submissionXml, List<File> mediaFiles) {
        Document d = new Document();
        d.setStandalone(true);
        d.setEncoding("UTF-8");
        Element e = d.createElement(XML_ENCRYPTED_TAG_NAMESPACE, DATA);
        e.setPrefix(null, XML_ENCRYPTED_TAG_NAMESPACE);
        e.setAttribute(null, ID, formInfo.formId);
        if (formInfo.formVersion != null) {
            e.setAttribute(null, "version", formInfo.formVersion);
        }
        e.setAttribute(null, ENCRYPTED, "yes");
        d.addChild(0, 2, e);
        Element c = d.createElement(XML_ENCRYPTED_TAG_NAMESPACE, BASE64_ENCRYPTED_KEY);
        c.addChild(0, 4, formInfo.base64RsaEncryptedSymmetricKey);
        int idx = 0 + 1;
        e.addChild(0, 2, c);
        Element c2 = d.createElement(XML_OPENROSA_NAMESPACE, META);
        c2.setPrefix("orx", XML_OPENROSA_NAMESPACE);
        Element instanceTag = d.createElement(XML_OPENROSA_NAMESPACE, INSTANCE_ID);
        instanceTag.addChild(0, 4, formInfo.instanceMetadata.instanceId);
        c2.addChild(0, 2, instanceTag);
        int idx2 = idx + 1;
        e.addChild(idx, 2, c2);
        e.addChild(idx2, 7, NEW_LINE);
        int idx3 = idx2 + 1;
        for (File file : mediaFiles) {
            Element c3 = d.createElement(XML_ENCRYPTED_TAG_NAMESPACE, MEDIA);
            Element fileTag = d.createElement(XML_ENCRYPTED_TAG_NAMESPACE, FILE);
            fileTag.addChild(0, 4, file.getName() + ".enc");
            c3.addChild(0, 2, fileTag);
            int idx4 = idx3 + 1;
            e.addChild(idx3, 2, c3);
            idx3 = idx4 + 1;
            e.addChild(idx4, 7, NEW_LINE);
        }
        Element c4 = d.createElement(XML_ENCRYPTED_TAG_NAMESPACE, ENCRYPTED_XML_FILE);
        c4.addChild(0, 4, submissionXml.getName() + ".enc");
        int idx5 = idx3 + 1;
        e.addChild(idx3, 2, c4);
        Element c5 = d.createElement(XML_ENCRYPTED_TAG_NAMESPACE, BASE64_ENCRYPTED_ELEMENT_SIGNATURE);
        c5.addChild(0, 4, formInfo.getBase64EncryptedElementSignature());
        int i = idx5 + 1;
        e.addChild(idx5, 2, c5);
        try {
            FileOutputStream out = new FileOutputStream(submissionXml);
            OutputStreamWriter writer = new OutputStreamWriter(out, "UTF-8");
            KXmlSerializer serializer = new KXmlSerializer();
            serializer.setOutput(writer);
            d.writeChildren(serializer);
            serializer.flush();
            writer.flush();
            writer.close();
            return true;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            Log.e(t, "Error writing submission.xml for encrypted submission: " + submissionXml.getParentFile().getName());
            return false;
        } catch (UnsupportedEncodingException ex2) {
            ex2.printStackTrace();
            Log.e(t, "Error writing submission.xml for encrypted submission: " + submissionXml.getParentFile().getName());
            return false;
        } catch (IOException ex3) {
            ex3.printStackTrace();
            Log.e(t, "Error writing submission.xml for encrypted submission: " + submissionXml.getParentFile().getName());
            return false;
        }
    }
}
