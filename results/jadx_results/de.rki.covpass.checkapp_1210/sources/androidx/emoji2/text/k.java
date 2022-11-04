package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
class k {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements c {

        /* renamed from: a */
        private final ByteBuffer f3888a;

        a(ByteBuffer byteBuffer) {
            this.f3888a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.k.c
        public void a(int i10) {
            ByteBuffer byteBuffer = this.f3888a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // androidx.emoji2.text.k.c
        public long b() {
            return k.c(this.f3888a.getInt());
        }

        @Override // androidx.emoji2.text.k.c
        public int c() {
            return this.f3888a.getInt();
        }

        @Override // androidx.emoji2.text.k.c
        public long getPosition() {
            return this.f3888a.position();
        }

        @Override // androidx.emoji2.text.k.c
        public int readUnsignedShort() {
            return k.d(this.f3888a.getShort());
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final long f3889a;

        /* renamed from: b */
        private final long f3890b;

        b(long j10, long j11) {
            this.f3889a = j10;
            this.f3890b = j11;
        }

        long a() {
            return this.f3889a;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i10);

        long b();

        int c();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) {
        long j10;
        cVar.a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.a(6);
            int i10 = 0;
            while (true) {
                if (i10 >= readUnsignedShort) {
                    j10 = -1;
                    break;
                }
                int c10 = cVar.c();
                cVar.a(4);
                j10 = cVar.b();
                cVar.a(4);
                if (1835365473 == c10) {
                    break;
                }
                i10++;
            }
            if (j10 != -1) {
                cVar.a((int) (j10 - cVar.getPosition()));
                cVar.a(12);
                long b10 = cVar.b();
                for (int i11 = 0; i11 < b10; i11++) {
                    int c11 = cVar.c();
                    long b11 = cVar.b();
                    long b12 = cVar.b();
                    if (1164798569 == c11 || 1701669481 == c11) {
                        return new b(b11 + j10, b12);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static x0.b b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return x0.b.h(duplicate);
    }

    static long c(int i10) {
        return i10 & 4294967295L;
    }

    static int d(short s10) {
        return s10 & 65535;
    }
}
