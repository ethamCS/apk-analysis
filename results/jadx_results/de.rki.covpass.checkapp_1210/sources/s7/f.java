package s7;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    private final q7.b f21502a;

    /* renamed from: b */
    private final c f21503b;

    /* renamed from: c */
    private final s7.a f21504c;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final long f21505a;

        /* renamed from: b */
        private final long f21506b;

        /* renamed from: c */
        private final long f21507c;

        /* renamed from: d */
        private final q7.b f21508d;

        public b(long j10, long j11, long j12, q7.b bVar) {
            this.f21505a = j10;
            this.f21506b = j11;
            this.f21507c = j12;
            this.f21508d = bVar;
        }

        public long a() {
            return this.f21505a + this.f21507c + e();
        }

        public long b() {
            return this.f21505a;
        }

        public long c() {
            return this.f21506b;
        }

        public long d() {
            return this.f21507c;
        }

        public long e() {
            return this.f21508d.d() - this.f21506b;
        }

        public boolean f() {
            return Math.abs((this.f21505a - this.f21506b) - (this.f21508d.b() - this.f21508d.d())) < 1000;
        }
    }

    public f(q7.b bVar, c cVar, s7.a aVar) {
        this.f21502a = bVar;
        this.f21503b = cVar;
        this.f21504c = aVar;
    }

    private static void a(byte b10, byte b11, int i10, long j10) {
        if (b10 != 3) {
            if (b11 != 4 && b11 != 5) {
                throw new a("untrusted mode: " + ((int) b11));
            } else if (i10 != 0 && i10 <= 15) {
                if (j10 == 0) {
                    throw new a("zero transmitTime");
                }
                return;
            } else {
                throw new a("untrusted stratum: " + i10);
            }
        }
        throw new a("unsynchronized server");
    }

    private static long b(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    static long c(byte[] bArr, int i10) {
        return ((b(bArr, i10) - 2208988800L) * 1000) + ((b(bArr, i10 + 4) * 1000) / 4294967296L);
    }

    private static void e(byte[] bArr, int i10, long j10) {
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        long j13 = j11 + 2208988800L;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (j13 >> 24);
        int i12 = i11 + 1;
        bArr[i11] = (byte) (j13 >> 16);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (j13 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (j13 >> 0);
        long j14 = (j12 * 4294967296L) / 1000;
        int i15 = i14 + 1;
        bArr[i14] = (byte) (j14 >> 24);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (j14 >> 16);
        bArr[i16] = (byte) (j14 >> 8);
        bArr[i16 + 1] = (byte) (Math.random() * 255.0d);
    }

    public b d(String str, Long l10) {
        DatagramSocket datagramSocket = null;
        try {
            InetAddress a10 = this.f21503b.a(str);
            datagramSocket = this.f21504c.b();
            datagramSocket.setSoTimeout(l10.intValue());
            byte[] bArr = new byte[48];
            DatagramPacket a11 = this.f21504c.a(bArr, a10, 123);
            bArr[0] = 27;
            long b10 = this.f21502a.b();
            long d10 = this.f21502a.d();
            e(bArr, 40, b10);
            datagramSocket.send(a11);
            byte[] copyOf = Arrays.copyOf(bArr, 48);
            datagramSocket.receive(this.f21504c.c(copyOf));
            long d11 = this.f21502a.d();
            long j10 = b10 + (d11 - d10);
            long c10 = c(copyOf, 24);
            long c11 = c(copyOf, 32);
            long c12 = c(copyOf, 40);
            a((byte) ((copyOf[0] >> 6) & 3), (byte) (copyOf[0] & 7), copyOf[1] & 255, c12);
            b bVar = new b(j10, d11, ((c11 - c10) + (c12 - j10)) / 2, this.f21502a);
            datagramSocket.close();
            return bVar;
        } catch (Throwable th2) {
            if (datagramSocket != null) {
                datagramSocket.close();
            }
            throw th2;
        }
    }
}
