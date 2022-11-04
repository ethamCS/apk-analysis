package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import gg.r1;
import gg.v;
import hh.b;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import nh.n;
import nh.o;
import nh.s;
import nh.t;
import org.bouncycastle.crypto.a;
import org.bouncycastle.crypto.r;
import ph.c;
import qh.n0;
import zg.q;
import zh.n1;
/* loaded from: classes3.dex */
public class DigestSignatureSpi extends SignatureSpi {
    private b algId;
    private a cipher;
    private r digest;

    /* loaded from: classes3.dex */
    public static class MD2 extends DigestSignatureSpi {
        public MD2() {
            super(q.F1, new n(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MD4 extends DigestSignatureSpi {
        public MD4() {
            super(q.G1, new o(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MD5 extends DigestSignatureSpi {
        public MD5() {
            super(q.H1, ei.a.a(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class RIPEMD128 extends DigestSignatureSpi {
        public RIPEMD128() {
            super(ch.b.f6574c, new nh.r(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class RIPEMD160 extends DigestSignatureSpi {
        public RIPEMD160() {
            super(ch.b.f6573b, new s(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class RIPEMD256 extends DigestSignatureSpi {
        public RIPEMD256() {
            super(ch.b.f6575d, new t(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA1 extends DigestSignatureSpi {
        public SHA1() {
            super(yg.b.f26294i, ei.a.b(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA224 extends DigestSignatureSpi {
        public SHA224() {
            super(ug.b.f23641f, ei.a.c(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA256 extends DigestSignatureSpi {
        public SHA256() {
            super(ug.b.f23635c, ei.a.d(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA384 extends DigestSignatureSpi {
        public SHA384() {
            super(ug.b.f23637d, ei.a.e(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_224 extends DigestSignatureSpi {
        public SHA3_224() {
            super(ug.b.f23647i, ei.a.f(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_256 extends DigestSignatureSpi {
        public SHA3_256() {
            super(ug.b.f23649j, ei.a.g(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_384 extends DigestSignatureSpi {
        public SHA3_384() {
            super(ug.b.f23651k, ei.a.h(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_512 extends DigestSignatureSpi {
        public SHA3_512() {
            super(ug.b.f23653l, ei.a.i(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512 extends DigestSignatureSpi {
        public SHA512() {
            super(ug.b.f23639e, ei.a.j(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_224 extends DigestSignatureSpi {
        public SHA512_224() {
            super(ug.b.f23643g, ei.a.k(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_256 extends DigestSignatureSpi {
        public SHA512_256() {
            super(ug.b.f23645h, ei.a.l(), new c(new n0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class noneRSA extends DigestSignatureSpi {
        public noneRSA() {
            super(new nh.q(), new c(new n0()));
        }
    }

    protected DigestSignatureSpi(v vVar, r rVar, a aVar) {
        this.digest = rVar;
        this.cipher = aVar;
        this.algId = new b(vVar, r1.f10880d);
    }

    protected DigestSignatureSpi(r rVar, a aVar) {
        this.digest = rVar;
        this.cipher = aVar;
        this.algId = null;
    }

    private byte[] derEncode(byte[] bArr) {
        b bVar = this.algId;
        return bVar == null ? bArr : new hh.r(bVar, bArr).k("DER");
    }

    private String getType(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass().getName();
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        if (privateKey instanceof RSAPrivateKey) {
            n1 generatePrivateKeyParameter = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) privateKey);
            this.digest.reset();
            this.cipher.init(true, generatePrivateKeyParameter);
            return;
        }
        throw new InvalidKeyException("Supplied key (" + getType(privateKey) + ") is not a RSAPrivateKey instance");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        if (publicKey instanceof RSAPublicKey) {
            n1 generatePublicKeyParameter = RSAUtil.generatePublicKeyParameter((RSAPublicKey) publicKey);
            this.digest.reset();
            this.cipher.init(false, generatePublicKeyParameter);
            return;
        }
        throw new InvalidKeyException("Supplied key (" + getType(publicKey) + ") is not a RSAPublicKey instance");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            byte[] derEncode = derEncode(bArr);
            return this.cipher.a(derEncode, 0, derEncode.length);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new SignatureException("key too small for signature type");
        } catch (Exception e10) {
            throw new SignatureException(e10.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b10) {
        this.digest.update(b10);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i10, int i11) {
        this.digest.update(bArr, i10, i11);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        byte[] a10;
        byte[] derEncode;
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            a10 = this.cipher.a(bArr, 0, bArr.length);
            derEncode = derEncode(bArr2);
        } catch (Exception unused) {
        }
        if (a10.length == derEncode.length) {
            return ak.a.u(a10, derEncode);
        }
        if (a10.length != derEncode.length - 2) {
            ak.a.u(derEncode, derEncode);
            return false;
        }
        derEncode[1] = (byte) (derEncode[1] - 2);
        derEncode[3] = (byte) (derEncode[3] - 2);
        int i10 = derEncode[3] + 4;
        int i11 = i10 + 2;
        int i12 = 0;
        for (int i13 = 0; i13 < derEncode.length - i11; i13++) {
            i12 |= a10[i10 + i13] ^ derEncode[i11 + i13];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            i12 |= a10[i14] ^ derEncode[i14];
        }
        return i12 == 0;
    }
}
