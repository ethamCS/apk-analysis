package org.conscrypt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactorySpi;
import javax.net.ssl.ManagerFactoryParameters;
import org.conscrypt.io.IoUtils;
/* loaded from: classes3.dex */
public class KeyManagerFactoryImpl extends KeyManagerFactorySpi {
    private KeyStore keyStore;
    private char[] pwd;

    @Override // javax.net.ssl.KeyManagerFactorySpi
    protected KeyManager[] engineGetKeyManagers() {
        if (this.keyStore != null) {
            return new KeyManager[]{new KeyManagerImpl(this.keyStore, this.pwd)};
        }
        throw new IllegalStateException("KeyManagerFactory is not initialized");
    }

    @Override // javax.net.ssl.KeyManagerFactorySpi
    protected void engineInit(KeyStore keyStore, char[] cArr) {
        Throwable th2;
        FileNotFoundException e10;
        IOException e11;
        CertificateException e12;
        FileInputStream fileInputStream;
        if (keyStore != null) {
            this.keyStore = keyStore;
            if (cArr != null) {
                this.pwd = (char[]) cArr.clone();
                return;
            } else {
                this.pwd = EmptyArray.CHAR;
                return;
            }
        }
        this.keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        String property = System.getProperty("javax.net.ssl.keyStore");
        FileInputStream fileInputStream2 = null;
        if (property == null || property.equalsIgnoreCase("NONE") || property.isEmpty()) {
            try {
                this.keyStore.load(null, null);
                return;
            } catch (IOException e13) {
                throw new KeyStoreException(e13);
            } catch (CertificateException e14) {
                throw new KeyStoreException(e14);
            }
        }
        String property2 = System.getProperty("javax.net.ssl.keyStorePassword");
        if (property2 == null) {
            this.pwd = EmptyArray.CHAR;
        } else {
            this.pwd = property2.toCharArray();
        }
        try {
            try {
                fileInputStream = new FileInputStream(new File(property));
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (FileNotFoundException e15) {
            e10 = e15;
        } catch (IOException e16) {
            e11 = e16;
        } catch (CertificateException e17) {
            e12 = e17;
        }
        try {
            this.keyStore.load(fileInputStream, this.pwd);
            IoUtils.closeQuietly(fileInputStream);
        } catch (FileNotFoundException e18) {
            e10 = e18;
            throw new KeyStoreException(e10);
        } catch (IOException e19) {
            e11 = e19;
            throw new KeyStoreException(e11);
        } catch (CertificateException e20) {
            e12 = e20;
            throw new KeyStoreException(e12);
        } catch (Throwable th4) {
            th2 = th4;
            fileInputStream2 = fileInputStream;
            IoUtils.closeQuietly(fileInputStream2);
            throw th2;
        }
    }

    @Override // javax.net.ssl.KeyManagerFactorySpi
    protected void engineInit(ManagerFactoryParameters managerFactoryParameters) {
        throw new InvalidAlgorithmParameterException("ManagerFactoryParameters not supported");
    }
}
