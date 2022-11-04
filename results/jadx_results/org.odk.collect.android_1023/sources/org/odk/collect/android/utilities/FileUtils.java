package org.odk.collect.android.utilities;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import org.javarosa.xform.parse.XFormParser;
import org.kxml2.kdom.Document;
import org.kxml2.kdom.Element;
/* loaded from: classes.dex */
public class FileUtils {
    public static final String BASE64_RSA_PUBLIC_KEY = "base64RsaPublicKey";
    public static final String FORMID = "formid";
    public static final String SUBMISSIONURI = "submission";
    public static final String TITLE = "title";
    public static final String VALID_FILENAME = "[ _\\-A-Za-z0-9]*.x[ht]*ml";
    public static final String VERSION = "version";
    private static final String t = "FileUtils";

    public static boolean createFolder(String path) {
        File dir = new File(path);
        if (dir.exists()) {
            return true;
        }
        boolean made = dir.mkdirs();
        return made;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x014c -> B:60:0x0039). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0152 -> B:60:0x0039). Please submit an issue!!! */
    public static byte[] getFileAsBytes(File file) {
        InputStream is;
        Throwable th;
        byte[] bArr = null;
        InputStream is2 = null;
        try {
            try {
                is = new FileInputStream(file);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e) {
            e = e;
            Log.e(t, "Cannot find " + file.getName());
            e.printStackTrace();
            try {
                is2.close();
            } catch (IOException e2) {
                Log.e(t, "Cannot close input stream for " + file.getName());
                e2.printStackTrace();
            }
            return bArr;
        }
        try {
            try {
                long length = file.length();
                if (length > 2147483647L) {
                    Log.e(t, "File " + file.getName() + "is too large");
                    try {
                        is.close();
                        is2 = is;
                    } catch (IOException e3) {
                        Log.e(t, "Cannot close input stream for " + file.getName());
                        e3.printStackTrace();
                        is2 = is;
                    }
                } else {
                    byte[] bytes = new byte[(int) length];
                    int offset = 0;
                    int read = 0;
                    while (offset < bytes.length && read >= 0) {
                        try {
                            read = is.read(bytes, offset, bytes.length - offset);
                            offset += read;
                        } catch (IOException e4) {
                            Log.e(t, "Cannot read " + file.getName());
                            e4.printStackTrace();
                            try {
                                is.close();
                                is2 = is;
                            } catch (IOException e5) {
                                Log.e(t, "Cannot close input stream for " + file.getName());
                                e5.printStackTrace();
                                is2 = is;
                            }
                        }
                    }
                    if (offset < bytes.length) {
                        try {
                            throw new IOException("Could not completely read file " + file.getName());
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            try {
                                is.close();
                                is2 = is;
                            } catch (IOException e7) {
                                Log.e(t, "Cannot close input stream for " + file.getName());
                                e7.printStackTrace();
                                is2 = is;
                            }
                        }
                    } else {
                        try {
                            is.close();
                            is2 = is;
                            bArr = bytes;
                        } catch (IOException e8) {
                            Log.e(t, "Cannot close input stream for " + file.getName());
                            e8.printStackTrace();
                            is2 = is;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                is2 = is;
                try {
                    is2.close();
                    throw th;
                } catch (IOException e9) {
                    Log.e(t, "Cannot close input stream for " + file.getName());
                    e9.printStackTrace();
                }
            }
        } catch (FileNotFoundException e10) {
            e = e10;
            is2 = is;
            Log.e(t, "Cannot find " + file.getName());
            e.printStackTrace();
            is2.close();
            return bArr;
        }
        return bArr;
    }

    public static String getMd5Hash(File file) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] chunk = new byte[EncryptionUtils.SYMMETRIC_KEY_LENGTH];
            long lLength = file.length();
            if (lLength > 2147483647L) {
                Log.e(t, "File " + file.getName() + "is too large");
                return null;
            }
            int length = (int) lLength;
            InputStream is = new FileInputStream(file);
            int l = 0;
            while (l + EncryptionUtils.SYMMETRIC_KEY_LENGTH < length) {
                is.read(chunk, 0, EncryptionUtils.SYMMETRIC_KEY_LENGTH);
                md.update(chunk, 0, EncryptionUtils.SYMMETRIC_KEY_LENGTH);
                l += EncryptionUtils.SYMMETRIC_KEY_LENGTH;
            }
            int remaining = length - l;
            if (remaining > 0) {
                is.read(chunk, 0, remaining);
                md.update(chunk, 0, remaining);
            }
            byte[] messageDigest = md.digest();
            BigInteger number = new BigInteger(1, messageDigest);
            String md5 = number.toString(16);
            while (md5.length() < 32) {
                md5 = "0" + md5;
            }
            is.close();
            return md5;
        } catch (FileNotFoundException e) {
            Log.e("No Cache File", e.getMessage());
            return null;
        } catch (IOException e2) {
            Log.e("Problem reading from file", e2.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e3) {
            Log.e("MD5", e3.getMessage());
            return null;
        }
    }

    public static Bitmap getBitmapScaledToDisplay(File f, int screenHeight, int screenWidth) {
        BitmapFactory.Options o = new BitmapFactory.Options();
        o.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(f.getAbsolutePath(), o);
        int heightScale = o.outHeight / screenHeight;
        int widthScale = o.outWidth / screenWidth;
        int scale = Math.max(widthScale, heightScale);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inInputShareable = true;
        options.inPurgeable = true;
        options.inSampleSize = scale;
        Bitmap b = BitmapFactory.decodeFile(f.getAbsolutePath(), options);
        if (b != null) {
            Log.i(t, "Screen is " + screenHeight + "x" + screenWidth + ".  Image has been scaled down by " + scale + " to " + b.getHeight() + "x" + b.getWidth());
        }
        return b;
    }

    public static void copyFile(File sourceFile, File destFile) {
        if (sourceFile.exists()) {
            try {
                FileChannel src = new FileInputStream(sourceFile).getChannel();
                FileChannel dst = new FileOutputStream(destFile).getChannel();
                dst.transferFrom(src, 0L, src.size());
                src.close();
                dst.close();
                return;
            } catch (FileNotFoundException e) {
                Log.e(t, "FileNotFoundExeception while copying audio");
                e.printStackTrace();
                return;
            } catch (IOException e2) {
                Log.e(t, "IOExeception while copying audio");
                e2.printStackTrace();
                return;
            }
        }
        Log.e(t, "Source file does not exist: " + sourceFile.getAbsolutePath());
    }

    public static HashMap<String, String> parseXML(File xmlFile) {
        InputStreamReader isr;
        HashMap<String, String> fields = new HashMap<>();
        try {
            InputStream is = new FileInputStream(xmlFile);
            try {
                isr = new InputStreamReader(is, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                Log.w(t, "UTF 8 encoding unavailable, trying default encoding");
                isr = new InputStreamReader(is);
            }
            if (isr != null) {
                try {
                    Document doc = XFormParser.getXMLDocument(isr);
                    String html = doc.getRootElement().getNamespace();
                    Element head = doc.getRootElement().getElement(html, "head");
                    Element title = head.getElement(html, TITLE);
                    if (title != null) {
                        fields.put(TITLE, XFormParser.getXMLText(title, true));
                    }
                    Element model = getChildElement(head, "model");
                    Element cur = getChildElement(model, "instance");
                    int idx = cur.getChildCount();
                    int i = 0;
                    while (i < idx && (cur.isText(i) || cur.getType(i) != 2)) {
                        i++;
                    }
                    if (i < idx) {
                        Element cur2 = cur.getElement(i);
                        String id = cur2.getAttributeValue(null, "id");
                        String xmlns = cur2.getNamespace();
                        String version = cur2.getAttributeValue(null, "version");
                        String uiVersion = cur2.getAttributeValue(null, "uiVersion");
                        if (uiVersion != null) {
                            Log.e(t, "Obsolete use of uiVersion -- IGNORED -- only using version: " + version);
                        }
                        if (id != null) {
                            xmlns = id;
                        }
                        fields.put(FORMID, xmlns);
                        if (version == null) {
                            version = null;
                        }
                        fields.put("version", version);
                        try {
                            Element submission = model.getElement("http://www.w3.org/2002/xforms", SUBMISSIONURI);
                            String submissionUri = submission.getAttributeValue(null, "action");
                            if (submissionUri == null) {
                                submissionUri = null;
                            }
                            fields.put(SUBMISSIONURI, submissionUri);
                            String base64RsaPublicKey = submission.getAttributeValue(null, "base64RsaPublicKey");
                            fields.put("base64RsaPublicKey", (base64RsaPublicKey == null || base64RsaPublicKey.trim().length() == 0) ? null : base64RsaPublicKey.trim());
                        } catch (Exception e2) {
                            Log.i(t, xmlFile.getAbsolutePath() + " does not have a submission element");
                        }
                    } else {
                        throw new IllegalStateException(xmlFile.getAbsolutePath() + " could not be parsed");
                    }
                } finally {
                    try {
                        isr.close();
                    } catch (IOException e3) {
                        Log.w(t, xmlFile.getAbsolutePath() + " Error closing form reader");
                        e3.printStackTrace();
                    }
                }
            }
            return fields;
        } catch (FileNotFoundException e1) {
            throw new IllegalStateException(e1);
        }
    }

    private static Element getChildElement(Element parent, String childName) {
        int c = parent.getChildCount();
        for (int i = 0; i < c; i++) {
            if (parent.getType(i) == 2 && parent.getElement(i).getName().equalsIgnoreCase(childName)) {
                Element e = parent.getElement(i);
                return e;
            }
        }
        return null;
    }
}
