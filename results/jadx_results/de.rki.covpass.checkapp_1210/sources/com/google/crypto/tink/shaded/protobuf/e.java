package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.u1;
import com.google.crypto.tink.shaded.protobuf.z;
import java.util.Objects;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7845a;

        static {
            int[] iArr = new int[u1.b.values().length];
            f7845a = iArr;
            try {
                iArr[u1.b.f8024q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7845a[u1.b.f8025x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7845a[u1.b.f8026y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7845a[u1.b.U3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7845a[u1.b.V3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7845a[u1.b.f8017d4.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7845a[u1.b.W3.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7845a[u1.b.f8020g4.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7845a[u1.b.X3.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7845a[u1.b.f8019f4.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7845a[u1.b.Y3.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7845a[u1.b.f8021h4.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7845a[u1.b.f8022i4.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7845a[u1.b.f8018e4.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7845a[u1.b.f8016c4.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7845a[u1.b.Z3.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7845a[u1.b.f8014a4.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7845a[u1.b.f8015b4.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public int f7846a;

        /* renamed from: b */
        public long f7847b;

        /* renamed from: c */
        public Object f7848c;

        /* renamed from: d */
        public final q f7849d;

        public b(q qVar) {
            Objects.requireNonNull(qVar);
            this.f7849d = qVar;
        }
    }

    public static int A(int i10, byte[] bArr, int i11, int i12, b0.i<?> iVar, b bVar) {
        a0 a0Var = (a0) iVar;
        int I = I(bArr, i11, bVar);
        while (true) {
            a0Var.d(j.b(bVar.f7846a));
            if (I >= i12) {
                break;
            }
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f7846a) {
                break;
            }
            I = I(bArr, I2, bVar);
        }
        return I;
    }

    public static int B(int i10, byte[] bArr, int i11, int i12, b0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int L = L(bArr, i11, bVar);
        while (true) {
            j0Var.e(j.c(bVar.f7847b));
            if (L >= i12) {
                break;
            }
            int I = I(bArr, L, bVar);
            if (i10 != bVar.f7846a) {
                break;
            }
            L = L(bArr, I, bVar);
        }
        return L;
    }

    public static int C(byte[] bArr, int i10, b bVar) {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7846a;
        if (i11 >= 0) {
            if (i11 == 0) {
                bVar.f7848c = BuildConfig.FLAVOR;
                return I;
            }
            bVar.f7848c = new String(bArr, I, i11, b0.f7822a);
            return I + i11;
        }
        throw c0.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002e -> B:6:0x000c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0017 -> B:9:0x001b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int D(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.b0.i<?> r8, com.google.crypto.tink.shaded.protobuf.e.b r9) {
        /*
            int r6 = I(r5, r6, r9)
            int r0 = r9.f7846a
            if (r0 < 0) goto L3f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
        Lc:
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.b0.f7822a
            r2.<init>(r5, r6, r0, r3)
        L17:
            r8.add(r2)
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L3e
            int r0 = I(r5, r6, r9)
            int r2 = r9.f7846a
            if (r4 == r2) goto L26
            goto L3e
        L26:
            int r6 = I(r5, r0, r9)
            int r0 = r9.f7846a
            if (r0 < 0) goto L39
            if (r0 != 0) goto L31
            goto Lc
        L31:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.b0.f7822a
            r2.<init>(r5, r6, r0, r3)
            goto L17
        L39:
            com.google.crypto.tink.shaded.protobuf.c0 r4 = com.google.crypto.tink.shaded.protobuf.c0.h()
            throw r4
        L3e:
            return r6
        L3f:
            com.google.crypto.tink.shaded.protobuf.c0 r4 = com.google.crypto.tink.shaded.protobuf.c0.h()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.D(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.b0$i, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0023). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0036 -> B:6:0x000c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int E(int r5, byte[] r6, int r7, int r8, com.google.crypto.tink.shaded.protobuf.b0.i<?> r9, com.google.crypto.tink.shaded.protobuf.e.b r10) {
        /*
            int r7 = I(r6, r7, r10)
            int r0 = r10.f7846a
            if (r0 < 0) goto L59
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
        Lc:
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.t1.n(r6, r7, r2)
            if (r3 == 0) goto L54
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.b0.f7822a
            r3.<init>(r6, r7, r0, r4)
        L1f:
            r9.add(r3)
            r7 = r2
        L23:
            if (r7 >= r8) goto L53
            int r0 = I(r6, r7, r10)
            int r2 = r10.f7846a
            if (r5 == r2) goto L2e
            goto L53
        L2e:
            int r7 = I(r6, r0, r10)
            int r0 = r10.f7846a
            if (r0 < 0) goto L4e
            if (r0 != 0) goto L39
            goto Lc
        L39:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.t1.n(r6, r7, r2)
            if (r3 == 0) goto L49
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.b0.f7822a
            r3.<init>(r6, r7, r0, r4)
            goto L1f
        L49:
            com.google.crypto.tink.shaded.protobuf.c0 r5 = com.google.crypto.tink.shaded.protobuf.c0.e()
            throw r5
        L4e:
            com.google.crypto.tink.shaded.protobuf.c0 r5 = com.google.crypto.tink.shaded.protobuf.c0.h()
            throw r5
        L53:
            return r7
        L54:
            com.google.crypto.tink.shaded.protobuf.c0 r5 = com.google.crypto.tink.shaded.protobuf.c0.e()
            throw r5
        L59:
            com.google.crypto.tink.shaded.protobuf.c0 r5 = com.google.crypto.tink.shaded.protobuf.c0.h()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.E(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.b0$i, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    public static int F(byte[] bArr, int i10, b bVar) {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7846a;
        if (i11 >= 0) {
            if (i11 == 0) {
                bVar.f7848c = BuildConfig.FLAVOR;
                return I;
            }
            bVar.f7848c = t1.e(bArr, I, i11);
            return I + i11;
        }
        throw c0.h();
    }

    public static int G(int i10, byte[] bArr, int i11, int i12, p1 p1Var, b bVar) {
        if (u1.a(i10) != 0) {
            int b10 = u1.b(i10);
            if (b10 == 0) {
                int L = L(bArr, i11, bVar);
                p1Var.n(i10, Long.valueOf(bVar.f7847b));
                return L;
            } else if (b10 == 1) {
                p1Var.n(i10, Long.valueOf(j(bArr, i11)));
                return i11 + 8;
            } else if (b10 == 2) {
                int I = I(bArr, i11, bVar);
                int i13 = bVar.f7846a;
                if (i13 < 0) {
                    throw c0.h();
                }
                if (i13 > bArr.length - I) {
                    throw c0.n();
                }
                p1Var.n(i10, i13 == 0 ? i.f7878d : i.k(bArr, I, i13));
                return I + i13;
            } else if (b10 != 3) {
                if (b10 != 5) {
                    throw c0.c();
                }
                p1Var.n(i10, Integer.valueOf(h(bArr, i11)));
                return i11 + 4;
            } else {
                p1 l10 = p1.l();
                int i14 = (i10 & (-8)) | 4;
                int i15 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int I2 = I(bArr, i11, bVar);
                    int i16 = bVar.f7846a;
                    i15 = i16;
                    if (i16 == i14) {
                        i11 = I2;
                        break;
                    }
                    int G = G(i15, bArr, I2, i12, l10, bVar);
                    i15 = i16;
                    i11 = G;
                }
                if (i11 > i12 || i15 != i14) {
                    throw c0.i();
                }
                p1Var.n(i10, l10);
                return i11;
            }
        }
        throw c0.c();
    }

    public static int H(int i10, byte[] bArr, int i11, b bVar) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 < 0) {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                bVar.f7846a = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            bVar.f7846a = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        bVar.f7846a = i14 | i13;
        return i15;
    }

    public static int I(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            bVar.f7846a = b10;
            return i11;
        }
        return H(b10, bArr, i11, bVar);
    }

    public static int J(int i10, byte[] bArr, int i11, int i12, b0.i<?> iVar, b bVar) {
        a0 a0Var = (a0) iVar;
        int I = I(bArr, i11, bVar);
        while (true) {
            a0Var.d(bVar.f7846a);
            if (I >= i12) {
                break;
            }
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f7846a) {
                break;
            }
            I = I(bArr, I2, bVar);
        }
        return I;
    }

    static int K(long j10, byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= (b11 & Byte.MAX_VALUE) << i12;
            i11 = i13;
            b10 = b11;
        }
        bVar.f7847b = j11;
        return i11;
    }

    public static int L(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            bVar.f7847b = j10;
            return i11;
        }
        return K(j10, bArr, i11, bVar);
    }

    public static int M(int i10, byte[] bArr, int i11, int i12, b0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int L = L(bArr, i11, bVar);
        while (true) {
            j0Var.e(bVar.f7847b);
            if (L >= i12) {
                break;
            }
            int I = I(bArr, L, bVar);
            if (i10 != bVar.f7846a) {
                break;
            }
            L = L(bArr, I, bVar);
        }
        return L;
    }

    public static int N(int i10, byte[] bArr, int i11, int i12, b bVar) {
        if (u1.a(i10) != 0) {
            int b10 = u1.b(i10);
            if (b10 == 0) {
                return L(bArr, i11, bVar);
            }
            if (b10 == 1) {
                return i11 + 8;
            }
            if (b10 == 2) {
                return I(bArr, i11, bVar) + bVar.f7846a;
            }
            if (b10 != 3) {
                if (b10 != 5) {
                    throw c0.c();
                }
                return i11 + 4;
            }
            int i13 = (i10 & (-8)) | 4;
            int i14 = 0;
            while (i11 < i12) {
                i11 = I(bArr, i11, bVar);
                i14 = bVar.f7846a;
                if (i14 == i13) {
                    break;
                }
                i11 = N(i14, bArr, i11, i12, bVar);
            }
            if (i11 <= i12 && i14 == i13) {
                return i11;
            }
            throw c0.i();
        }
        throw c0.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        r9 = L(r8, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r12.f7847b == 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r12.f7847b != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
        r11.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r9 >= r10) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0 = I(r8, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r7 == r12.f7846a) goto L10;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0029 -> B:4:0x0010). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x0012 -> B:6:0x0013). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(int r7, byte[] r8, int r9, int r10, com.google.crypto.tink.shaded.protobuf.b0.i<?> r11, com.google.crypto.tink.shaded.protobuf.e.b r12) {
        /*
            com.google.crypto.tink.shaded.protobuf.g r11 = (com.google.crypto.tink.shaded.protobuf.g) r11
            int r9 = L(r8, r9, r12)
            long r0 = r12.f7847b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L12
        L10:
            r0 = r1
            goto L13
        L12:
            r0 = r4
        L13:
            r11.e(r0)
            if (r9 >= r10) goto L2c
            int r0 = I(r8, r9, r12)
            int r5 = r12.f7846a
            if (r7 == r5) goto L21
            goto L2c
        L21:
            int r9 = L(r8, r0, r12)
            long r5 = r12.f7847b
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L12
            goto L10
        L2c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.a(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.b0$i, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    public static int b(byte[] bArr, int i10, b bVar) {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7846a;
        if (i11 >= 0) {
            if (i11 > bArr.length - I) {
                throw c0.n();
            }
            if (i11 == 0) {
                bVar.f7848c = i.f7878d;
                return I;
            }
            bVar.f7848c = i.k(bArr, I, i11);
            return I + i11;
        }
        throw c0.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = I(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r2 == r7.f7846a) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        r4 = I(r3, r0, r7);
        r0 = r7.f7846a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r0 < 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0 > (r3.length - r4)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r0 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        throw com.google.crypto.tink.shaded.protobuf.c0.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        throw com.google.crypto.tink.shaded.protobuf.c0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r0 == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        r6.add(com.google.crypto.tink.shaded.protobuf.i.f7878d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        r6.add(com.google.crypto.tink.shaded.protobuf.i.k(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r4 >= r5) goto L21;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0033 -> B:7:0x000e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0014 -> B:9:0x001c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r2, byte[] r3, int r4, int r5, com.google.crypto.tink.shaded.protobuf.b0.i<?> r6, com.google.crypto.tink.shaded.protobuf.e.b r7) {
        /*
            int r4 = I(r3, r4, r7)
            int r0 = r7.f7846a
            if (r0 < 0) goto L46
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L41
            if (r0 != 0) goto L14
        Le:
            com.google.crypto.tink.shaded.protobuf.i r0 = com.google.crypto.tink.shaded.protobuf.i.f7878d
            r6.add(r0)
            goto L1c
        L14:
            com.google.crypto.tink.shaded.protobuf.i r1 = com.google.crypto.tink.shaded.protobuf.i.k(r3, r4, r0)
            r6.add(r1)
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L40
            int r0 = I(r3, r4, r7)
            int r1 = r7.f7846a
            if (r2 == r1) goto L27
            goto L40
        L27:
            int r4 = I(r3, r0, r7)
            int r0 = r7.f7846a
            if (r0 < 0) goto L3b
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L36
            if (r0 != 0) goto L14
            goto Le
        L36:
            com.google.crypto.tink.shaded.protobuf.c0 r2 = com.google.crypto.tink.shaded.protobuf.c0.n()
            throw r2
        L3b:
            com.google.crypto.tink.shaded.protobuf.c0 r2 = com.google.crypto.tink.shaded.protobuf.c0.h()
            throw r2
        L40:
            return r4
        L41:
            com.google.crypto.tink.shaded.protobuf.c0 r2 = com.google.crypto.tink.shaded.protobuf.c0.n()
            throw r2
        L46:
            com.google.crypto.tink.shaded.protobuf.c0 r2 = com.google.crypto.tink.shaded.protobuf.c0.h()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.c(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.b0$i, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    public static double d(byte[] bArr, int i10) {
        return Double.longBitsToDouble(j(bArr, i10));
    }

    public static int e(int i10, byte[] bArr, int i11, int i12, b0.i<?> iVar, b bVar) {
        n nVar = (n) iVar;
        nVar.d(d(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f7846a) {
                break;
            }
            nVar.d(d(bArr, I));
            i13 = I + 8;
        }
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int f(int r7, byte[] r8, int r9, int r10, com.google.crypto.tink.shaded.protobuf.z.c<?, ?> r11, com.google.crypto.tink.shaded.protobuf.z.e<?, ?> r12, com.google.crypto.tink.shaded.protobuf.o1<com.google.crypto.tink.shaded.protobuf.p1, com.google.crypto.tink.shaded.protobuf.p1> r13, com.google.crypto.tink.shaded.protobuf.e.b r14) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.f(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.z$c, com.google.crypto.tink.shaded.protobuf.z$e, com.google.crypto.tink.shaded.protobuf.o1, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    public static int g(int i10, byte[] bArr, int i11, int i12, Object obj, s0 s0Var, o1<p1, p1> o1Var, b bVar) {
        z.e a10 = bVar.f7849d.a(s0Var, i10 >>> 3);
        if (a10 == null) {
            return G(i10, bArr, i11, i12, v0.v(obj), bVar);
        }
        z.c cVar = (z.c) obj;
        cVar.N();
        return f(i10, bArr, i11, i12, cVar, a10, o1Var, bVar);
    }

    public static int h(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int i(int i10, byte[] bArr, int i11, int i12, b0.i<?> iVar, b bVar) {
        a0 a0Var = (a0) iVar;
        a0Var.d(h(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f7846a) {
                break;
            }
            a0Var.d(h(bArr, I));
            i13 = I + 4;
        }
        return i13;
    }

    public static long j(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int k(int i10, byte[] bArr, int i11, int i12, b0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        j0Var.e(j(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f7846a) {
                break;
            }
            j0Var.e(j(bArr, I));
            i13 = I + 8;
        }
        return i13;
    }

    public static float l(byte[] bArr, int i10) {
        return Float.intBitsToFloat(h(bArr, i10));
    }

    public static int m(int i10, byte[] bArr, int i11, int i12, b0.i<?> iVar, b bVar) {
        x xVar = (x) iVar;
        xVar.d(l(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f7846a) {
                break;
            }
            xVar.d(l(bArr, I));
            i13 = I + 4;
        }
        return i13;
    }

    public static int n(h1 h1Var, byte[] bArr, int i10, int i11, int i12, b bVar) {
        v0 v0Var = (v0) h1Var;
        Object a10 = v0Var.a();
        int c02 = v0Var.c0(a10, bArr, i10, i11, i12, bVar);
        v0Var.f(a10);
        bVar.f7848c = a10;
        return c02;
    }

    public static int o(h1 h1Var, int i10, byte[] bArr, int i11, int i12, b0.i<?> iVar, b bVar) {
        int i13 = (i10 & (-8)) | 4;
        int n10 = n(h1Var, bArr, i11, i12, i13, bVar);
        while (true) {
            iVar.add(bVar.f7848c);
            if (n10 >= i12) {
                break;
            }
            int I = I(bArr, n10, bVar);
            if (i10 != bVar.f7846a) {
                break;
            }
            n10 = n(h1Var, bArr, I, i12, i13, bVar);
        }
        return n10;
    }

    public static int p(h1 h1Var, byte[] bArr, int i10, int i11, b bVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = H(i13, bArr, i12, bVar);
            i13 = bVar.f7846a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw c0.n();
        }
        Object a10 = h1Var.a();
        int i15 = i13 + i14;
        h1Var.c(a10, bArr, i14, i15, bVar);
        h1Var.f(a10);
        bVar.f7848c = a10;
        return i15;
    }

    public static int q(h1<?> h1Var, int i10, byte[] bArr, int i11, int i12, b0.i<?> iVar, b bVar) {
        int p10 = p(h1Var, bArr, i11, i12, bVar);
        while (true) {
            iVar.add(bVar.f7848c);
            if (p10 >= i12) {
                break;
            }
            int I = I(bArr, p10, bVar);
            if (i10 != bVar.f7846a) {
                break;
            }
            p10 = p(h1Var, bArr, I, i12, bVar);
        }
        return p10;
    }

    public static int r(byte[] bArr, int i10, b0.i<?> iVar, b bVar) {
        g gVar = (g) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7846a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            gVar.e(bVar.f7847b != 0);
        }
        if (I == i11) {
            return I;
        }
        throw c0.n();
    }

    public static int s(byte[] bArr, int i10, b0.i<?> iVar, b bVar) {
        n nVar = (n) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7846a + I;
        while (I < i11) {
            nVar.d(d(bArr, I));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw c0.n();
    }

    public static int t(byte[] bArr, int i10, b0.i<?> iVar, b bVar) {
        a0 a0Var = (a0) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7846a + I;
        while (I < i11) {
            a0Var.d(h(bArr, I));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw c0.n();
    }

    public static int u(byte[] bArr, int i10, b0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7846a + I;
        while (I < i11) {
            j0Var.e(j(bArr, I));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw c0.n();
    }

    public static int v(byte[] bArr, int i10, b0.i<?> iVar, b bVar) {
        x xVar = (x) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7846a + I;
        while (I < i11) {
            xVar.d(l(bArr, I));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw c0.n();
    }

    public static int w(byte[] bArr, int i10, b0.i<?> iVar, b bVar) {
        a0 a0Var = (a0) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7846a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            a0Var.d(j.b(bVar.f7846a));
        }
        if (I == i11) {
            return I;
        }
        throw c0.n();
    }

    public static int x(byte[] bArr, int i10, b0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7846a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            j0Var.e(j.c(bVar.f7847b));
        }
        if (I == i11) {
            return I;
        }
        throw c0.n();
    }

    public static int y(byte[] bArr, int i10, b0.i<?> iVar, b bVar) {
        a0 a0Var = (a0) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7846a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            a0Var.d(bVar.f7846a);
        }
        if (I == i11) {
            return I;
        }
        throw c0.n();
    }

    public static int z(byte[] bArr, int i10, b0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7846a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            j0Var.e(bVar.f7847b);
        }
        if (I == i11) {
            return I;
        }
        throw c0.n();
    }
}
