package org.bouncycastle.jcajce.provider.asymmetric.util;

import ak.g;
import gg.v;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.p;
import org.conscrypt.PSKKeyManager;
import tg.c;
import ug.b;
import wg.a;
import zg.q;
import zh.a1;
/* loaded from: classes3.dex */
public abstract class BaseAgreementSpi extends KeyAgreementSpi {
    private static final Map<String, v> defaultOids;
    private static final Hashtable des;
    private static final Map<String, Integer> keySizes;
    private static final Map<String, String> nameTable;
    private static final Hashtable oids;
    protected final String kaAlgorithm;
    protected final p kdf;
    protected byte[] ukmParameters;

    static {
        HashMap hashMap = new HashMap();
        defaultOids = hashMap;
        HashMap hashMap2 = new HashMap();
        keySizes = hashMap2;
        HashMap hashMap3 = new HashMap();
        nameTable = hashMap3;
        Hashtable hashtable = new Hashtable();
        oids = hashtable;
        Hashtable hashtable2 = new Hashtable();
        des = hashtable2;
        Integer e10 = g.e(64);
        Integer e11 = g.e(128);
        Integer e12 = g.e(192);
        Integer e13 = g.e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        hashMap2.put("DES", e10);
        hashMap2.put("DESEDE", e12);
        hashMap2.put("BLOWFISH", e11);
        hashMap2.put("AES", e13);
        hashMap2.put(b.f23667x.H(), e11);
        hashMap2.put(b.F.H(), e12);
        hashMap2.put(b.N.H(), e13);
        hashMap2.put(b.f23668y.H(), e11);
        hashMap2.put(b.G.H(), e12);
        v vVar = b.O;
        hashMap2.put(vVar.H(), e13);
        hashMap2.put(b.A.H(), e11);
        hashMap2.put(b.I.H(), e12);
        hashMap2.put(b.Q.H(), e13);
        hashMap2.put(b.f23669z.H(), e11);
        hashMap2.put(b.H.H(), e12);
        hashMap2.put(b.P.H(), e13);
        v vVar2 = b.B;
        hashMap2.put(vVar2.H(), e11);
        hashMap2.put(b.J.H(), e12);
        hashMap2.put(b.R.H(), e13);
        v vVar3 = b.D;
        hashMap2.put(vVar3.H(), e11);
        hashMap2.put(b.L.H(), e12);
        hashMap2.put(b.T.H(), e13);
        hashMap2.put(b.C.H(), e11);
        hashMap2.put(b.K.H(), e12);
        hashMap2.put(b.S.H(), e13);
        v vVar4 = a.f25082d;
        hashMap2.put(vVar4.H(), e11);
        v vVar5 = a.f25083e;
        hashMap2.put(vVar5.H(), e12);
        v vVar6 = a.f25084f;
        hashMap2.put(vVar6.H(), e13);
        v vVar7 = sg.a.f21707d;
        hashMap2.put(vVar7.H(), e11);
        v vVar8 = q.Q3;
        hashMap2.put(vVar8.H(), e12);
        v vVar9 = q.B1;
        hashMap2.put(vVar9.H(), e12);
        v vVar10 = yg.b.f26290e;
        hashMap2.put(vVar10.H(), e10);
        v vVar11 = lg.a.f16022f;
        hashMap2.put(vVar11.H(), e13);
        hashMap2.put(lg.a.f16020d.H(), e13);
        hashMap2.put(lg.a.f16021e.H(), e13);
        v vVar12 = q.I1;
        hashMap2.put(vVar12.H(), g.e(160));
        v vVar13 = q.K1;
        hashMap2.put(vVar13.H(), e13);
        v vVar14 = q.L1;
        hashMap2.put(vVar14.H(), g.e(384));
        v vVar15 = q.M1;
        hashMap2.put(vVar15.H(), g.e(512));
        hashMap.put("DESEDE", vVar9);
        hashMap.put("AES", vVar);
        v vVar16 = a.f25081c;
        hashMap.put("CAMELLIA", vVar16);
        v vVar17 = sg.a.f21704a;
        hashMap.put("SEED", vVar17);
        hashMap.put("DES", vVar10);
        hashMap3.put(c.f22341u.H(), "CAST5");
        hashMap3.put(c.f22343w.H(), "IDEA");
        hashMap3.put(c.f22346z.H(), "Blowfish");
        hashMap3.put(c.A.H(), "Blowfish");
        hashMap3.put(c.B.H(), "Blowfish");
        hashMap3.put(c.C.H(), "Blowfish");
        hashMap3.put(yg.b.f26289d.H(), "DES");
        hashMap3.put(vVar10.H(), "DES");
        hashMap3.put(yg.b.f26292g.H(), "DES");
        hashMap3.put(yg.b.f26291f.H(), "DES");
        hashMap3.put(yg.b.f26293h.H(), "DESede");
        hashMap3.put(vVar9.H(), "DESede");
        hashMap3.put(vVar8.H(), "DESede");
        hashMap3.put(q.R3.H(), "RC2");
        hashMap3.put(vVar12.H(), "HmacSHA1");
        hashMap3.put(q.J1.H(), "HmacSHA224");
        hashMap3.put(vVar13.H(), "HmacSHA256");
        hashMap3.put(vVar14.H(), "HmacSHA384");
        hashMap3.put(vVar15.H(), "HmacSHA512");
        hashMap3.put(a.f25079a.H(), "Camellia");
        hashMap3.put(a.f25080b.H(), "Camellia");
        hashMap3.put(vVar16.H(), "Camellia");
        hashMap3.put(vVar4.H(), "Camellia");
        hashMap3.put(vVar5.H(), "Camellia");
        hashMap3.put(vVar6.H(), "Camellia");
        hashMap3.put(vVar7.H(), "SEED");
        hashMap3.put(vVar17.H(), "SEED");
        hashMap3.put(sg.a.f21705b.H(), "SEED");
        hashMap3.put(vVar11.H(), "GOST28147");
        hashMap3.put(vVar2.H(), "AES");
        hashMap3.put(vVar3.H(), "AES");
        hashMap3.put(vVar3.H(), "AES");
        hashtable.put("DESEDE", vVar9);
        hashtable.put("AES", vVar);
        hashtable.put("DES", vVar10);
        hashtable2.put("DES", "DES");
        hashtable2.put("DESEDE", "DES");
        hashtable2.put(vVar10.H(), "DES");
        hashtable2.put(vVar9.H(), "DES");
        hashtable2.put(vVar8.H(), "DES");
    }

    public BaseAgreementSpi(String str, p pVar) {
        this.kaAlgorithm = str;
        this.kdf = pVar;
    }

    protected static String getAlgorithm(String str) {
        if (str.indexOf(91) > 0) {
            return str.substring(0, str.indexOf(91));
        }
        if (str.startsWith(b.f23666w.H())) {
            return "AES";
        }
        if (str.startsWith(og.a.f18400i.H())) {
            return "Serpent";
        }
        String str2 = nameTable.get(ak.q.k(str));
        return str2 != null ? str2 : str;
    }

    protected static int getKeySize(String str) {
        if (str.indexOf(91) > 0) {
            return Integer.parseInt(str.substring(str.indexOf(91) + 1, str.indexOf(93)));
        }
        String k10 = ak.q.k(str);
        Map<String, Integer> map = keySizes;
        if (map.containsKey(k10)) {
            return map.get(k10).intValue();
        }
        return -1;
    }

    private byte[] getSharedSecretBytes(byte[] bArr, String str, int i10) {
        org.bouncycastle.crypto.q qVar;
        p pVar = this.kdf;
        if (pVar == null) {
            if (i10 <= 0) {
                return bArr;
            }
            int i11 = i10 / 8;
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, 0, bArr2, 0, i11);
            ak.a.g(bArr);
            return bArr2;
        } else if (i10 < 0) {
            throw new NoSuchAlgorithmException("unknown algorithm encountered: " + str);
        } else {
            int i12 = i10 / 8;
            byte[] bArr3 = new byte[i12];
            if (!(pVar instanceof mh.c)) {
                qVar = new a1(bArr, this.ukmParameters);
            } else if (str == null) {
                throw new NoSuchAlgorithmException("algorithm OID is null");
            } else {
                try {
                    qVar = new mh.b(new v(str), i10, bArr, this.ukmParameters);
                } catch (IllegalArgumentException unused) {
                    throw new NoSuchAlgorithmException("no OID for algorithm: " + str);
                }
            }
            this.kdf.init(qVar);
            this.kdf.generateBytes(bArr3, 0, i12);
            ak.a.g(bArr);
            return bArr3;
        }
    }

    public static byte[] trimZeroes(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int i10 = 0;
        while (i10 < bArr.length && bArr[i10] == 0) {
            i10++;
        }
        int length = bArr.length - i10;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i10, bArr2, 0, length);
        return bArr2;
    }

    protected abstract byte[] calcSecret();

    @Override // javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i10) {
        byte[] engineGenerateSecret = engineGenerateSecret();
        if (bArr.length - i10 >= engineGenerateSecret.length) {
            System.arraycopy(engineGenerateSecret, 0, bArr, i10, engineGenerateSecret.length);
            return engineGenerateSecret.length;
        }
        throw new ShortBufferException(this.kaAlgorithm + " key agreement: need " + engineGenerateSecret.length + " bytes");
    }

    @Override // javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) {
        String k10 = ak.q.k(str);
        Hashtable hashtable = oids;
        String H = hashtable.containsKey(k10) ? ((v) hashtable.get(k10)).H() : str;
        byte[] sharedSecretBytes = getSharedSecretBytes(calcSecret(), H, getKeySize(H));
        String algorithm = getAlgorithm(str);
        if (des.containsKey(algorithm)) {
            zh.c.c(sharedSecretBytes);
        }
        return new SecretKeySpec(sharedSecretBytes, algorithm);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() {
        if (this.kdf != null) {
            byte[] calcSecret = calcSecret();
            try {
                return getSharedSecretBytes(calcSecret, null, calcSecret.length * 8);
            } catch (NoSuchAlgorithmException e10) {
                throw new IllegalStateException(e10.getMessage());
            }
        }
        return calcSecret();
    }
}
