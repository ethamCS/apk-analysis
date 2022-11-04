package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.l0;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class f implements g1 {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends f {

        /* renamed from: a */
        private final boolean f7856a;

        /* renamed from: b */
        private final byte[] f7857b;

        /* renamed from: c */
        private int f7858c;

        /* renamed from: d */
        private final int f7859d;

        /* renamed from: e */
        private int f7860e;

        /* renamed from: f */
        private int f7861f;

        /* renamed from: g */
        private int f7862g;

        public b(ByteBuffer byteBuffer, boolean z10) {
            super();
            this.f7856a = z10;
            this.f7857b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f7858c = arrayOffset;
            this.f7859d = arrayOffset;
            this.f7860e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean R() {
            return this.f7858c == this.f7860e;
        }

        private byte S() {
            int i10 = this.f7858c;
            if (i10 != this.f7860e) {
                byte[] bArr = this.f7857b;
                this.f7858c = i10 + 1;
                return bArr[i10];
            }
            throw c0.n();
        }

        private <T> T T(h1<T> h1Var, q qVar) {
            int i10 = this.f7862g;
            this.f7862g = u1.c(u1.a(this.f7861f), 4);
            try {
                T a10 = h1Var.a();
                h1Var.e(a10, this, qVar);
                h1Var.f(a10);
                if (this.f7861f == this.f7862g) {
                    return a10;
                }
                throw c0.i();
            } finally {
                this.f7862g = i10;
            }
        }

        private int U() {
            e0(4);
            return V();
        }

        private int V() {
            int i10 = this.f7858c;
            byte[] bArr = this.f7857b;
            this.f7858c = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        private long W() {
            e0(8);
            return X();
        }

        private long X() {
            int i10 = this.f7858c;
            byte[] bArr = this.f7857b;
            this.f7858c = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        private <T> T Y(h1<T> h1Var, q qVar) {
            int b02 = b0();
            e0(b02);
            int i10 = this.f7860e;
            int i11 = this.f7858c + b02;
            this.f7860e = i11;
            try {
                T a10 = h1Var.a();
                h1Var.e(a10, this, qVar);
                h1Var.f(a10);
                if (this.f7858c == i11) {
                    return a10;
                }
                throw c0.i();
            } finally {
                this.f7860e = i10;
            }
        }

        private int b0() {
            int i10;
            int i11 = this.f7858c;
            int i12 = this.f7860e;
            if (i12 != i11) {
                byte[] bArr = this.f7857b;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f7858c = i13;
                    return b10;
                } else if (i12 - i13 < 9) {
                    return (int) d0();
                } else {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                i16 = i14 + 1;
                                byte b11 = bArr[i14];
                                i10 = (i18 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i14 = i16 + 1;
                                    if (bArr[i16] < 0) {
                                        i16 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i16 + 1;
                                            if (bArr[i16] < 0) {
                                                i16 = i14 + 1;
                                                if (bArr[i14] < 0) {
                                                    i14 = i16 + 1;
                                                    if (bArr[i16] < 0) {
                                                        throw c0.g();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i14 = i16;
                    }
                    this.f7858c = i14;
                    return i10;
                }
            }
            throw c0.n();
        }

        private long d0() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte S = S();
                j10 |= (S & Byte.MAX_VALUE) << i10;
                if ((S & 128) == 0) {
                    return j10;
                }
            }
            throw c0.g();
        }

        private void e0(int i10) {
            if (i10 < 0 || i10 > this.f7860e - this.f7858c) {
                throw c0.n();
            }
        }

        private void f0(int i10) {
            if (this.f7858c == i10) {
                return;
            }
            throw c0.n();
        }

        private void g0(int i10) {
            if (u1.b(this.f7861f) == i10) {
                return;
            }
            throw c0.f();
        }

        private void h0(int i10) {
            e0(i10);
            this.f7858c += i10;
        }

        private void i0() {
            int i10 = this.f7862g;
            this.f7862g = u1.c(u1.a(this.f7861f), 4);
            while (u() != Integer.MAX_VALUE && D()) {
            }
            if (this.f7861f == this.f7862g) {
                this.f7862g = i10;
                return;
            }
            throw c0.i();
        }

        private void j0() {
            int i10 = this.f7860e;
            int i11 = this.f7858c;
            if (i10 - i11 >= 10) {
                byte[] bArr = this.f7857b;
                int i12 = 0;
                while (i12 < 10) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        this.f7858c = i13;
                        return;
                    } else {
                        i12++;
                        i11 = i13;
                    }
                }
            }
            k0();
        }

        private void k0() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (S() >= 0) {
                    return;
                }
            }
            throw c0.g();
        }

        private void l0(int i10) {
            e0(i10);
            if ((i10 & 3) == 0) {
                return;
            }
            throw c0.i();
        }

        private void m0(int i10) {
            e0(i10);
            if ((i10 & 7) == 0) {
                return;
            }
            throw c0.i();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void A(List<Float> list) {
            int i10;
            int i11;
            if (!(list instanceof x)) {
                int b10 = u1.b(this.f7861f);
                if (b10 == 2) {
                    int b02 = b0();
                    l0(b02);
                    int i12 = this.f7858c + b02;
                    while (this.f7858c < i12) {
                        list.add(Float.valueOf(Float.intBitsToFloat(V())));
                    }
                    return;
                } else if (b10 != 5) {
                    throw c0.f();
                } else {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f7858c;
                    } while (b0() == this.f7861f);
                    this.f7858c = i10;
                    return;
                }
            }
            x xVar = (x) list;
            int b11 = u1.b(this.f7861f);
            if (b11 == 2) {
                int b03 = b0();
                l0(b03);
                int i13 = this.f7858c + b03;
                while (this.f7858c < i13) {
                    xVar.d(Float.intBitsToFloat(V()));
                }
            } else if (b11 != 5) {
                throw c0.f();
            } else {
                do {
                    xVar.d(readFloat());
                    if (R()) {
                        return;
                    }
                    i11 = this.f7858c;
                } while (b0() == this.f7861f);
                this.f7858c = i11;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int B() {
            g0(0);
            return b0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int C() {
            g0(0);
            return b0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public boolean D() {
            int i10;
            int i11;
            if (R() || (i10 = this.f7861f) == this.f7862g) {
                return false;
            }
            int b10 = u1.b(i10);
            if (b10 == 0) {
                j0();
                return true;
            }
            if (b10 == 1) {
                i11 = 8;
            } else if (b10 == 2) {
                i11 = b0();
            } else if (b10 == 3) {
                i0();
                return true;
            } else if (b10 != 5) {
                throw c0.f();
            } else {
                i11 = 4;
            }
            h0(i11);
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int E() {
            g0(5);
            return U();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void F(List<i> list) {
            int i10;
            if (u1.b(this.f7861f) == 2) {
                do {
                    list.add(z());
                    if (R()) {
                        return;
                    }
                    i10 = this.f7858c;
                } while (b0() == this.f7861f);
                this.f7858c = i10;
                return;
            }
            throw c0.f();
        }

        /* JADX WARN: Finally extract failed */
        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public <K, V> void G(Map<K, V> map, l0.a<K, V> aVar, q qVar) {
            g0(2);
            int b02 = b0();
            e0(b02);
            int i10 = this.f7860e;
            this.f7860e = this.f7858c + b02;
            try {
                throw null;
            } catch (Throwable th2) {
                this.f7860e = i10;
                throw th2;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void H(List<Double> list) {
            int i10;
            int i11;
            if (!(list instanceof n)) {
                int b10 = u1.b(this.f7861f);
                if (b10 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f7858c;
                    } while (b0() == this.f7861f);
                    this.f7858c = i10;
                    return;
                } else if (b10 != 2) {
                    throw c0.f();
                } else {
                    int b02 = b0();
                    m0(b02);
                    int i12 = this.f7858c + b02;
                    while (this.f7858c < i12) {
                        list.add(Double.valueOf(Double.longBitsToDouble(X())));
                    }
                    return;
                }
            }
            n nVar = (n) list;
            int b11 = u1.b(this.f7861f);
            if (b11 == 1) {
                do {
                    nVar.d(readDouble());
                    if (R()) {
                        return;
                    }
                    i11 = this.f7858c;
                } while (b0() == this.f7861f);
                this.f7858c = i11;
            } else if (b11 != 2) {
                throw c0.f();
            } else {
                int b03 = b0();
                m0(b03);
                int i13 = this.f7858c + b03;
                while (this.f7858c < i13) {
                    nVar.d(Double.longBitsToDouble(X()));
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void I(List<Long> list) {
            int i10;
            int i11;
            int i12;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b10 = u1.b(this.f7861f);
                if (b10 == 0) {
                    do {
                        j0Var.e(L());
                        if (R()) {
                            return;
                        }
                        i12 = this.f7858c;
                    } while (b0() == this.f7861f);
                    this.f7858c = i12;
                    return;
                } else if (b10 != 2) {
                    throw c0.f();
                } else {
                    i10 = this.f7858c + b0();
                    while (this.f7858c < i10) {
                        j0Var.e(c0());
                    }
                }
            } else {
                int b11 = u1.b(this.f7861f);
                if (b11 == 0) {
                    do {
                        list.add(Long.valueOf(L()));
                        if (R()) {
                            return;
                        }
                        i11 = this.f7858c;
                    } while (b0() == this.f7861f);
                    this.f7858c = i11;
                    return;
                } else if (b11 != 2) {
                    throw c0.f();
                } else {
                    i10 = this.f7858c + b0();
                    while (this.f7858c < i10) {
                        list.add(Long.valueOf(c0()));
                    }
                }
            }
            f0(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void J(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof j0)) {
                int b10 = u1.b(this.f7861f);
                if (b10 == 1) {
                    do {
                        list.add(Long.valueOf(w()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f7858c;
                    } while (b0() == this.f7861f);
                    this.f7858c = i10;
                    return;
                } else if (b10 != 2) {
                    throw c0.f();
                } else {
                    int b02 = b0();
                    m0(b02);
                    int i12 = this.f7858c + b02;
                    while (this.f7858c < i12) {
                        list.add(Long.valueOf(X()));
                    }
                    return;
                }
            }
            j0 j0Var = (j0) list;
            int b11 = u1.b(this.f7861f);
            if (b11 == 1) {
                do {
                    j0Var.e(w());
                    if (R()) {
                        return;
                    }
                    i11 = this.f7858c;
                } while (b0() == this.f7861f);
                this.f7858c = i11;
            } else if (b11 != 2) {
                throw c0.f();
            } else {
                int b03 = b0();
                m0(b03);
                int i13 = this.f7858c + b03;
                while (this.f7858c < i13) {
                    j0Var.e(X());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public <T> void K(List<T> list, h1<T> h1Var, q qVar) {
            int i10;
            if (u1.b(this.f7861f) == 3) {
                int i11 = this.f7861f;
                do {
                    list.add(T(h1Var, qVar));
                    if (R()) {
                        return;
                    }
                    i10 = this.f7858c;
                } while (b0() == i11);
                this.f7858c = i10;
                return;
            }
            throw c0.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public long L() {
            g0(0);
            return c0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public String M() {
            return Z(true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void N(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof j0)) {
                int b10 = u1.b(this.f7861f);
                if (b10 == 1) {
                    do {
                        list.add(Long.valueOf(h()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f7858c;
                    } while (b0() == this.f7861f);
                    this.f7858c = i10;
                    return;
                } else if (b10 != 2) {
                    throw c0.f();
                } else {
                    int b02 = b0();
                    m0(b02);
                    int i12 = this.f7858c + b02;
                    while (this.f7858c < i12) {
                        list.add(Long.valueOf(X()));
                    }
                    return;
                }
            }
            j0 j0Var = (j0) list;
            int b11 = u1.b(this.f7861f);
            if (b11 == 1) {
                do {
                    j0Var.e(h());
                    if (R()) {
                        return;
                    }
                    i11 = this.f7858c;
                } while (b0() == this.f7861f);
                this.f7858c = i11;
            } else if (b11 != 2) {
                throw c0.f();
            } else {
                int b03 = b0();
                m0(b03);
                int i13 = this.f7858c + b03;
                while (this.f7858c < i13) {
                    j0Var.e(X());
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void O(List<Integer> list) {
            int i10;
            int i11;
            int i12;
            if (list instanceof a0) {
                a0 a0Var = (a0) list;
                int b10 = u1.b(this.f7861f);
                if (b10 == 0) {
                    do {
                        a0Var.d(C());
                        if (R()) {
                            return;
                        }
                        i12 = this.f7858c;
                    } while (b0() == this.f7861f);
                    this.f7858c = i12;
                    return;
                } else if (b10 != 2) {
                    throw c0.f();
                } else {
                    i10 = this.f7858c + b0();
                    while (this.f7858c < i10) {
                        a0Var.d(b0());
                    }
                }
            } else {
                int b11 = u1.b(this.f7861f);
                if (b11 == 0) {
                    do {
                        list.add(Integer.valueOf(C()));
                        if (R()) {
                            return;
                        }
                        i11 = this.f7858c;
                    } while (b0() == this.f7861f);
                    this.f7858c = i11;
                    return;
                } else if (b11 != 2) {
                    throw c0.f();
                } else {
                    i10 = this.f7858c + b0();
                    while (this.f7858c < i10) {
                        list.add(Integer.valueOf(b0()));
                    }
                }
            }
            f0(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void P(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof a0)) {
                int b10 = u1.b(this.f7861f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw c0.f();
                    }
                    int b02 = this.f7858c + b0();
                    while (this.f7858c < b02) {
                        list.add(Integer.valueOf(b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(c()));
                    if (R()) {
                        return;
                    }
                    i10 = this.f7858c;
                } while (b0() == this.f7861f);
                this.f7858c = i10;
                return;
            }
            a0 a0Var = (a0) list;
            int b11 = u1.b(this.f7861f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw c0.f();
                }
                int b03 = this.f7858c + b0();
                while (this.f7858c < b03) {
                    a0Var.d(b0());
                }
                return;
            }
            do {
                a0Var.d(c());
                if (R()) {
                    return;
                }
                i11 = this.f7858c;
            } while (b0() == this.f7861f);
            this.f7858c = i11;
        }

        public String Z(boolean z10) {
            g0(2);
            int b02 = b0();
            if (b02 == 0) {
                return BuildConfig.FLAVOR;
            }
            e0(b02);
            if (z10) {
                byte[] bArr = this.f7857b;
                int i10 = this.f7858c;
                if (!t1.n(bArr, i10, i10 + b02)) {
                    throw c0.e();
                }
            }
            String str = new String(this.f7857b, this.f7858c, b02, b0.f7822a);
            this.f7858c += b02;
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public <T> T a(h1<T> h1Var, q qVar) {
            g0(3);
            return (T) T(h1Var, qVar);
        }

        public void a0(List<String> list, boolean z10) {
            int i10;
            int i11;
            if (u1.b(this.f7861f) == 2) {
                if (!(list instanceof h0) || z10) {
                    do {
                        list.add(Z(z10));
                        if (R()) {
                            return;
                        }
                        i10 = this.f7858c;
                    } while (b0() == this.f7861f);
                    this.f7858c = i10;
                    return;
                }
                h0 h0Var = (h0) list;
                do {
                    h0Var.y(z());
                    if (R()) {
                        return;
                    }
                    i11 = this.f7858c;
                } while (b0() == this.f7861f);
                this.f7858c = i11;
                return;
            }
            throw c0.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void b(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof a0)) {
                int b10 = u1.b(this.f7861f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw c0.f();
                    }
                    int b02 = this.f7858c + b0();
                    while (this.f7858c < b02) {
                        list.add(Integer.valueOf(j.b(b0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(j()));
                    if (R()) {
                        return;
                    }
                    i10 = this.f7858c;
                } while (b0() == this.f7861f);
                this.f7858c = i10;
                return;
            }
            a0 a0Var = (a0) list;
            int b11 = u1.b(this.f7861f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw c0.f();
                }
                int b03 = this.f7858c + b0();
                while (this.f7858c < b03) {
                    a0Var.d(j.b(b0()));
                }
                return;
            }
            do {
                a0Var.d(j());
                if (R()) {
                    return;
                }
                i11 = this.f7858c;
            } while (b0() == this.f7861f);
            this.f7858c = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int c() {
            g0(0);
            return b0();
        }

        public long c0() {
            long j10;
            long j11;
            long j12;
            int i10;
            int i11 = this.f7858c;
            int i12 = this.f7860e;
            if (i12 != i11) {
                byte[] bArr = this.f7857b;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f7858c = i13;
                    return b10;
                } else if (i12 - i13 < 9) {
                    return d0();
                } else {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 >= 0) {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i14 = i16;
                            j10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                long j13 = i18;
                                int i19 = i14 + 1;
                                long j14 = j13 ^ (bArr[i14] << 28);
                                if (j14 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i14 = i19 + 1;
                                    long j15 = j14 ^ (bArr[i19] << 35);
                                    if (j15 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i19 = i14 + 1;
                                        j14 = j15 ^ (bArr[i14] << 42);
                                        if (j14 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i14 = i19 + 1;
                                            j15 = j14 ^ (bArr[i19] << 49);
                                            if (j15 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                int i20 = i14 + 1;
                                                long j16 = (j15 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    i14 = i20 + 1;
                                                    if (bArr[i20] < 0) {
                                                        throw c0.g();
                                                    }
                                                } else {
                                                    i14 = i20;
                                                }
                                                j10 = j16;
                                            }
                                        }
                                    }
                                    j10 = j15 ^ j11;
                                }
                                j10 = j14 ^ j12;
                                i14 = i19;
                            }
                        }
                        this.f7858c = i14;
                        return j10;
                    }
                    i10 = i15 ^ (-128);
                    j10 = i10;
                    this.f7858c = i14;
                    return j10;
                }
            }
            throw c0.n();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public <T> T d(h1<T> h1Var, q qVar) {
            g0(2);
            return (T) Y(h1Var, qVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int e() {
            return this.f7861f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public long f() {
            g0(0);
            return c0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void g(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof a0)) {
                int b10 = u1.b(this.f7861f);
                if (b10 == 2) {
                    int b02 = b0();
                    l0(b02);
                    int i12 = this.f7858c + b02;
                    while (this.f7858c < i12) {
                        list.add(Integer.valueOf(V()));
                    }
                    return;
                } else if (b10 != 5) {
                    throw c0.f();
                } else {
                    do {
                        list.add(Integer.valueOf(r()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f7858c;
                    } while (b0() == this.f7861f);
                    this.f7858c = i10;
                    return;
                }
            }
            a0 a0Var = (a0) list;
            int b11 = u1.b(this.f7861f);
            if (b11 == 2) {
                int b03 = b0();
                l0(b03);
                int i13 = this.f7858c + b03;
                while (this.f7858c < i13) {
                    a0Var.d(V());
                }
            } else if (b11 != 5) {
                throw c0.f();
            } else {
                do {
                    a0Var.d(r());
                    if (R()) {
                        return;
                    }
                    i11 = this.f7858c;
                } while (b0() == this.f7861f);
                this.f7858c = i11;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public long h() {
            g0(1);
            return W();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void i(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof a0)) {
                int b10 = u1.b(this.f7861f);
                if (b10 == 2) {
                    int b02 = b0();
                    l0(b02);
                    int i12 = this.f7858c + b02;
                    while (this.f7858c < i12) {
                        list.add(Integer.valueOf(V()));
                    }
                    return;
                } else if (b10 != 5) {
                    throw c0.f();
                } else {
                    do {
                        list.add(Integer.valueOf(E()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f7858c;
                    } while (b0() == this.f7861f);
                    this.f7858c = i10;
                    return;
                }
            }
            a0 a0Var = (a0) list;
            int b11 = u1.b(this.f7861f);
            if (b11 == 2) {
                int b03 = b0();
                l0(b03);
                int i13 = this.f7858c + b03;
                while (this.f7858c < i13) {
                    a0Var.d(V());
                }
            } else if (b11 != 5) {
                throw c0.f();
            } else {
                do {
                    a0Var.d(E());
                    if (R()) {
                        return;
                    }
                    i11 = this.f7858c;
                } while (b0() == this.f7861f);
                this.f7858c = i11;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int j() {
            g0(0);
            return j.b(b0());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void k(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof j0)) {
                int b10 = u1.b(this.f7861f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw c0.f();
                    }
                    int b02 = this.f7858c + b0();
                    while (this.f7858c < b02) {
                        list.add(Long.valueOf(j.c(c0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(l()));
                    if (R()) {
                        return;
                    }
                    i10 = this.f7858c;
                } while (b0() == this.f7861f);
                this.f7858c = i10;
                return;
            }
            j0 j0Var = (j0) list;
            int b11 = u1.b(this.f7861f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw c0.f();
                }
                int b03 = this.f7858c + b0();
                while (this.f7858c < b03) {
                    j0Var.e(j.c(c0()));
                }
                return;
            }
            do {
                j0Var.e(l());
                if (R()) {
                    return;
                }
                i11 = this.f7858c;
            } while (b0() == this.f7861f);
            this.f7858c = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public long l() {
            g0(0);
            return j.c(c0());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void m(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof a0)) {
                int b10 = u1.b(this.f7861f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw c0.f();
                    }
                    int b02 = this.f7858c + b0();
                    while (this.f7858c < b02) {
                        list.add(Integer.valueOf(b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(B()));
                    if (R()) {
                        return;
                    }
                    i10 = this.f7858c;
                } while (b0() == this.f7861f);
                this.f7858c = i10;
                return;
            }
            a0 a0Var = (a0) list;
            int b11 = u1.b(this.f7861f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw c0.f();
                }
                int b03 = this.f7858c + b0();
                while (this.f7858c < b03) {
                    a0Var.d(b0());
                }
                return;
            }
            do {
                a0Var.d(B());
                if (R()) {
                    return;
                }
                i11 = this.f7858c;
            } while (b0() == this.f7861f);
            this.f7858c = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public <T> T n(Class<T> cls, q qVar) {
            g0(3);
            return (T) T(d1.a().d(cls), qVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void o(List<Boolean> list) {
            int i10;
            int i11;
            int i12;
            if (list instanceof g) {
                g gVar = (g) list;
                int b10 = u1.b(this.f7861f);
                if (b10 == 0) {
                    do {
                        gVar.e(t());
                        if (R()) {
                            return;
                        }
                        i12 = this.f7858c;
                    } while (b0() == this.f7861f);
                    this.f7858c = i12;
                    return;
                } else if (b10 != 2) {
                    throw c0.f();
                } else {
                    i10 = this.f7858c + b0();
                    while (this.f7858c < i10) {
                        gVar.e(b0() != 0);
                    }
                }
            } else {
                int b11 = u1.b(this.f7861f);
                if (b11 == 0) {
                    do {
                        list.add(Boolean.valueOf(t()));
                        if (R()) {
                            return;
                        }
                        i11 = this.f7858c;
                    } while (b0() == this.f7861f);
                    this.f7858c = i11;
                    return;
                } else if (b11 != 2) {
                    throw c0.f();
                } else {
                    i10 = this.f7858c + b0();
                    while (this.f7858c < i10) {
                        list.add(Boolean.valueOf(b0() != 0));
                    }
                }
            }
            f0(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public String p() {
            return Z(false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public <T> void q(List<T> list, h1<T> h1Var, q qVar) {
            int i10;
            if (u1.b(this.f7861f) == 2) {
                int i11 = this.f7861f;
                do {
                    list.add(Y(h1Var, qVar));
                    if (R()) {
                        return;
                    }
                    i10 = this.f7858c;
                } while (b0() == i11);
                this.f7858c = i10;
                return;
            }
            throw c0.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int r() {
            g0(5);
            return U();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public double readDouble() {
            g0(1);
            return Double.longBitsToDouble(W());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public float readFloat() {
            g0(5);
            return Float.intBitsToFloat(U());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public <T> T s(Class<T> cls, q qVar) {
            g0(2);
            return (T) Y(d1.a().d(cls), qVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public boolean t() {
            g0(0);
            return b0() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int u() {
            if (R()) {
                return Integer.MAX_VALUE;
            }
            int b02 = b0();
            this.f7861f = b02;
            if (b02 != this.f7862g) {
                return u1.a(b02);
            }
            return Integer.MAX_VALUE;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void v(List<String> list) {
            a0(list, false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public long w() {
            g0(1);
            return W();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void x(List<Long> list) {
            int i10;
            int i11;
            int i12;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b10 = u1.b(this.f7861f);
                if (b10 == 0) {
                    do {
                        j0Var.e(f());
                        if (R()) {
                            return;
                        }
                        i12 = this.f7858c;
                    } while (b0() == this.f7861f);
                    this.f7858c = i12;
                    return;
                } else if (b10 != 2) {
                    throw c0.f();
                } else {
                    i10 = this.f7858c + b0();
                    while (this.f7858c < i10) {
                        j0Var.e(c0());
                    }
                }
            } else {
                int b11 = u1.b(this.f7861f);
                if (b11 == 0) {
                    do {
                        list.add(Long.valueOf(f()));
                        if (R()) {
                            return;
                        }
                        i11 = this.f7858c;
                    } while (b0() == this.f7861f);
                    this.f7858c = i11;
                    return;
                } else if (b11 != 2) {
                    throw c0.f();
                } else {
                    i10 = this.f7858c + b0();
                    while (this.f7858c < i10) {
                        list.add(Long.valueOf(c0()));
                    }
                }
            }
            f0(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void y(List<String> list) {
            a0(list, true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public i z() {
            g0(2);
            int b02 = b0();
            if (b02 == 0) {
                return i.f7878d;
            }
            e0(b02);
            i i02 = this.f7856a ? i.i0(this.f7857b, this.f7858c, b02) : i.k(this.f7857b, this.f7858c, b02);
            this.f7858c += b02;
            return i02;
        }
    }

    private f() {
    }

    public static f Q(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z10);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
