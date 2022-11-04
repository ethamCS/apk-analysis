package org.bouncycastle.jcajce.provider.asymmetric.ec;

import ak.q;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.CipherSpi;
import javax.crypto.NoSuchPaddingException;
import nh.a0;
import nh.h0;
import nh.p;
import nh.s;
import nh.v;
import nh.w;
import nh.x;
import nh.y;
import ni.a;
import ni.c;
import org.bouncycastle.crypto.l;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.conscrypt.PSKKeyManager;
import qh.s0;
import zh.b;
import zh.g1;
/* loaded from: classes3.dex */
public class GMCipherSpi extends CipherSpi {
    private s0 engine;
    private b key;
    private SecureRandom random;
    private final c helper = new a();
    private int state = -1;
    private ErasableOutputStream buffer = new ErasableOutputStream();

    /* loaded from: classes3.dex */
    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            ak.a.y(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2 extends GMCipherSpi {
        public SM2() {
            super(new s0());
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withBlake2b extends GMCipherSpi {
        public SM2withBlake2b() {
            super(new s0(new nh.a(512)));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withBlake2s extends GMCipherSpi {
        public SM2withBlake2s() {
            super(new s0(new nh.b((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withMD5 extends GMCipherSpi {
        public SM2withMD5() {
            super(new s0(new p()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withRMD extends GMCipherSpi {
        public SM2withRMD() {
            super(new s0(new s()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withSha1 extends GMCipherSpi {
        public SM2withSha1() {
            super(new s0(new v()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withSha224 extends GMCipherSpi {
        public SM2withSha224() {
            super(new s0(new w()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withSha256 extends GMCipherSpi {
        public SM2withSha256() {
            super(new s0(new x()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withSha384 extends GMCipherSpi {
        public SM2withSha384() {
            super(new s0(new y()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withSha512 extends GMCipherSpi {
        public SM2withSha512() {
            super(new s0(new a0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withWhirlpool extends GMCipherSpi {
        public SM2withWhirlpool() {
            super(new s0(new h0()));
        }
    }

    public GMCipherSpi(s0 s0Var) {
        this.engine = s0Var;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        byte[] engineDoFinal = engineDoFinal(bArr, i10, i11);
        System.arraycopy(engineDoFinal, 0, bArr2, i12, engineDoFinal.length);
        return engineDoFinal.length;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i10, int i11) {
        byte[] j10;
        if (i11 != 0) {
            this.buffer.write(bArr, i10, i11);
        }
        try {
            int i12 = this.state;
            if (i12 == 1 || i12 == 3) {
                try {
                    this.engine.f(true, new g1(this.key, this.random));
                    j10 = this.engine.j(this.buffer.getBuf(), 0, this.buffer.size());
                    return j10;
                } catch (Exception e10) {
                    throw new BadBlockException("unable to process block", e10);
                }
            } else if (i12 != 2 && i12 != 4) {
                throw new IllegalStateException("cipher not initialised");
            } else {
                try {
                    this.engine.f(false, this.key);
                    j10 = this.engine.j(this.buffer.getBuf(), 0, this.buffer.size());
                    return j10;
                } catch (Exception e11) {
                    throw new BadBlockException("unable to process block", e11);
                }
            }
        } finally {
            this.buffer.erase();
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof qi.a) {
            return ((qi.a) key).getParameters().a().t();
        }
        throw new IllegalArgumentException("not an EC key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        int i11 = this.state;
        if (i11 == 1 || i11 == 3 || i11 == 2 || i11 == 4) {
            return this.engine.e(i10);
        }
        throw new IllegalStateException("cipher not initialised");
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        if (algorithmParameters == null) {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
            return;
        }
        throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + algorithmParameters.getClass().getName());
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new IllegalArgumentException("cannot handle supplied parameter spec: " + e10.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        b bVar;
        if (i10 == 1 || i10 == 3) {
            if (!(key instanceof PublicKey)) {
                throw new InvalidKeyException("must be passed public EC key for encryption");
            }
            bVar = ECUtils.generatePublicKeyParameter((PublicKey) key);
        } else if (i10 != 2 && i10 != 4) {
            throw new InvalidKeyException("must be passed EC key");
        } else {
            if (!(key instanceof PrivateKey)) {
                throw new InvalidKeyException("must be passed private EC key for decryption");
            }
            bVar = ECUtil.generatePrivateKeyParameter((PrivateKey) key);
        }
        this.key = bVar;
        if (secureRandom != null) {
            this.random = secureRandom;
        } else {
            this.random = l.b();
        }
        this.state = i10;
        this.buffer.reset();
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        if (q.k(str).equals("NONE")) {
            return;
        }
        throw new IllegalArgumentException("can't support mode " + str);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) {
        if (q.k(str).equals("NOPADDING")) {
            return;
        }
        throw new NoSuchPaddingException("padding not available with IESCipher");
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        this.buffer.write(bArr, i10, i11);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i10, int i11) {
        this.buffer.write(bArr, i10, i11);
        return null;
    }
}
