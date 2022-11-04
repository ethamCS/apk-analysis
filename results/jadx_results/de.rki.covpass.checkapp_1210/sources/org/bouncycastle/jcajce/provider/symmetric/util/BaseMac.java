package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import mi.a;
import mi.s;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.y;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.conscrypt.PSKKeyManager;
import uh.g;
import zh.b1;
import zh.f1;
import zh.j1;
import zh.p1;
/* loaded from: classes3.dex */
public class BaseMac extends MacSpi implements PBE {
    private static final Class gcmSpecClass = ClassUtil.loadClass(BaseMac.class, "javax.crypto.spec.GCMParameterSpec");
    private int keySize;
    private y macEngine;
    private int pbeHash;
    private int scheme;

    public BaseMac(y yVar) {
        this.scheme = 2;
        this.pbeHash = 1;
        this.keySize = 160;
        this.macEngine = yVar;
    }

    public BaseMac(y yVar, int i10, int i11, int i12) {
        this.macEngine = yVar;
        this.scheme = i10;
        this.pbeHash = i11;
        this.keySize = i12;
    }

    private static Hashtable copyMap(Map map) {
        Hashtable hashtable = new Hashtable();
        for (Object obj : map.keySet()) {
            hashtable.put(obj, map.get(obj));
        }
        return hashtable;
    }

    @Override // javax.crypto.MacSpi
    protected byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.macEngine.doFinal(bArr, 0);
        return bArr;
    }

    @Override // javax.crypto.MacSpi
    protected int engineGetMacLength() {
        return this.macEngine.getMacSize();
    }

    @Override // javax.crypto.MacSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        i makePBEMacParameters;
        if (key != null) {
            if (key instanceof ji.i) {
                try {
                    SecretKey secretKey = (SecretKey) key;
                    try {
                        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                        if ((secretKey instanceof PBEKey) && pBEParameterSpec == null) {
                            PBEKey pBEKey = (PBEKey) secretKey;
                            pBEParameterSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                        }
                        int i10 = 1;
                        boolean startsWith = this.macEngine.getAlgorithmName().startsWith("GOST");
                        int i11 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (startsWith) {
                            i10 = 6;
                        } else {
                            y yVar = this.macEngine;
                            if ((yVar instanceof g) && !yVar.getAlgorithmName().startsWith("SHA-1")) {
                                if (this.macEngine.getAlgorithmName().startsWith("SHA-224")) {
                                    i10 = 7;
                                    i11 = 224;
                                } else if (this.macEngine.getAlgorithmName().startsWith("SHA-256")) {
                                    i10 = 4;
                                } else if (this.macEngine.getAlgorithmName().startsWith("SHA-384")) {
                                    i10 = 8;
                                    i11 = 384;
                                } else if (this.macEngine.getAlgorithmName().startsWith("SHA-512")) {
                                    i10 = 9;
                                    i11 = 512;
                                } else if (!this.macEngine.getAlgorithmName().startsWith("RIPEMD160")) {
                                    throw new InvalidAlgorithmParameterException("no PKCS12 mapping for HMAC: " + this.macEngine.getAlgorithmName());
                                } else {
                                    i10 = 2;
                                }
                            }
                            i11 = 160;
                        }
                        makePBEMacParameters = PBE.Util.makePBEMacParameters(secretKey, 2, i10, i11, pBEParameterSpec);
                    } catch (Exception unused) {
                        throw new InvalidAlgorithmParameterException("PKCS12 requires a PBEParameterSpec");
                    }
                } catch (Exception unused2) {
                    throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
                }
            } else if (key instanceof BCPBEKey) {
                BCPBEKey bCPBEKey = (BCPBEKey) key;
                if (bCPBEKey.getParam() != null) {
                    makePBEMacParameters = bCPBEKey.getParam();
                } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                } else {
                    makePBEMacParameters = PBE.Util.makePBEMacParameters(bCPBEKey, algorithmParameterSpec);
                }
            } else if (algorithmParameterSpec instanceof PBEParameterSpec) {
                throw new InvalidAlgorithmParameterException("inappropriate parameter type: " + algorithmParameterSpec.getClass().getName());
            } else {
                makePBEMacParameters = new b1(key.getEncoded());
            }
            b1 b1Var = makePBEMacParameters instanceof f1 ? (b1) makePBEMacParameters.b() : makePBEMacParameters;
            if (algorithmParameterSpec instanceof a) {
                a aVar = (a) algorithmParameterSpec;
                makePBEMacParameters = new zh.a(b1Var, aVar.b(), aVar.c(), aVar.a());
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                makePBEMacParameters = new f1(b1Var, ((IvParameterSpec) algorithmParameterSpec).getIV());
            } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                makePBEMacParameters = new f1(new j1(b1Var.a(), rC2ParameterSpec.getEffectiveKeyBits()), rC2ParameterSpec.getIV());
            } else if (algorithmParameterSpec instanceof s) {
                makePBEMacParameters = new p1.b(copyMap(((s) algorithmParameterSpec).a())).c(b1Var.a()).a();
            } else if (algorithmParameterSpec == null) {
                makePBEMacParameters = new b1(key.getEncoded());
            } else {
                Class cls = gcmSpecClass;
                if (cls != null && cls.isAssignableFrom(algorithmParameterSpec.getClass())) {
                    makePBEMacParameters = GcmSpecUtil.extractAeadParameters(b1Var, algorithmParameterSpec);
                } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("unknown parameter type: " + algorithmParameterSpec.getClass().getName());
                }
            }
            try {
                this.macEngine.init(makePBEMacParameters);
                return;
            } catch (Exception e10) {
                throw new InvalidAlgorithmParameterException("cannot initialize MAC: " + e10.getMessage());
            }
        }
        throw new InvalidKeyException("key is null");
    }

    @Override // javax.crypto.MacSpi
    protected void engineReset() {
        this.macEngine.reset();
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte b10) {
        this.macEngine.update(b10);
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte[] bArr, int i10, int i11) {
        this.macEngine.update(bArr, i10, i11);
    }
}
