package oj;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes3.dex */
public class a0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a extends ObjectInputStream {

        /* renamed from: q */
        private static final Set f18481q;

        /* renamed from: c */
        private final Class f18482c;

        /* renamed from: d */
        private boolean f18483d = false;

        static {
            HashSet hashSet = new HashSet();
            f18481q = hashSet;
            hashSet.add("java.util.TreeMap");
            hashSet.add("java.lang.Integer");
            hashSet.add("java.lang.Number");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
            hashSet.add("java.util.ArrayList");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
            hashSet.add("[B");
            hashSet.add("java.util.LinkedList");
            hashSet.add("java.util.Stack");
            hashSet.add("java.util.Vector");
            hashSet.add("[Ljava.lang.Object;");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        a(Class cls, InputStream inputStream) {
            super(inputStream);
            this.f18482c = cls;
        }

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
            if (!this.f18483d) {
                if (!objectStreamClass.getName().equals(this.f18482c.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
                this.f18483d = true;
            } else if (!f18481q.contains(objectStreamClass.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public static long a(byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr, "in == null");
        long j10 = 0;
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            j10 = (j10 << 8) | (bArr[i12] & 255);
        }
        return j10;
    }

    public static int b(int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (((i10 >> i12) & 1) == 0) {
                return i12;
            }
        }
        return 0;
    }

    public static byte[] c(byte[] bArr) {
        Objects.requireNonNull(bArr, "in == null");
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[][] d(byte[][] bArr) {
        if (!k(bArr)) {
            byte[][] bArr2 = new byte[bArr.length];
            for (int i10 = 0; i10 < bArr.length; i10++) {
                bArr2[i10] = new byte[bArr[i10].length];
                System.arraycopy(bArr[i10], 0, bArr2[i10], 0, bArr[i10].length);
            }
            return bArr2;
        }
        throw new NullPointerException("in has null pointers");
    }

    public static void e(byte[] bArr, byte[] bArr2, int i10) {
        Objects.requireNonNull(bArr, "dst == null");
        Objects.requireNonNull(bArr2, "src == null");
        if (i10 >= 0) {
            if (bArr2.length + i10 > bArr.length) {
                throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
            }
            for (int i11 = 0; i11 < bArr2.length; i11++) {
                bArr[i10 + i11] = bArr2[i11];
            }
            return;
        }
        throw new IllegalArgumentException("offset hast to be >= 0");
    }

    public static Object f(byte[] bArr, Class cls) {
        a aVar = new a(cls, new ByteArrayInputStream(bArr));
        Object readObject = aVar.readObject();
        if (aVar.available() == 0) {
            if (!cls.isInstance(readObject)) {
                throw new IOException("unexpected class found in ObjectInputStream");
            }
            return readObject;
        }
        throw new IOException("unexpected data found at end of ObjectInputStream");
    }

    public static byte[] g(byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr, "src == null");
        if (i10 >= 0) {
            if (i11 < 0) {
                throw new IllegalArgumentException("length hast to be >= 0");
            }
            if (i10 + i11 > bArr.length) {
                throw new IllegalArgumentException("offset + length must not be greater then size of source array");
            }
            byte[] bArr2 = new byte[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                bArr2[i12] = bArr[i10 + i12];
            }
            return bArr2;
        }
        throw new IllegalArgumentException("offset hast to be >= 0");
    }

    public static int h(org.bouncycastle.crypto.r rVar) {
        Objects.requireNonNull(rVar, "digest == null");
        String algorithmName = rVar.getAlgorithmName();
        if (algorithmName.equals("SHAKE128")) {
            return 32;
        }
        if (!algorithmName.equals("SHAKE256")) {
            return rVar.getDigestSize();
        }
        return 64;
    }

    public static int i(long j10, int i10) {
        return (int) (j10 & ((1 << i10) - 1));
    }

    public static long j(long j10, int i10) {
        return j10 >> i10;
    }

    public static boolean k(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(int i10, long j10) {
        if (j10 >= 0) {
            return j10 < (1 << i10);
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static boolean m(long j10, int i10, int i11) {
        return j10 != 0 && (j10 + 1) % ((long) Math.pow((double) (1 << i10), (double) i11)) == 0;
    }

    public static boolean n(long j10, int i10, int i11) {
        return j10 != 0 && j10 % ((long) Math.pow((double) (1 << i10), (double) (i11 + 1))) == 0;
    }

    public static int o(int i10) {
        int i11 = 0;
        while (true) {
            i10 >>= 1;
            if (i10 != 0) {
                i11++;
            } else {
                return i11;
            }
        }
    }

    public static byte[] p(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] q(long j10, int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            bArr[i11] = (byte) j10;
            j10 >>>= 8;
        }
        return bArr;
    }
}
