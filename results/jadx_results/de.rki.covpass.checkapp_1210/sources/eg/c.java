package eg;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0087\u0001B\t¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\b\u0010\u0005\u001a\u00020\u0000H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0016J\b\u0010\u0007\u001a\u00020\u0000H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J \u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\nJ\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\nH\u0087\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\nH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001dH\u0016J\b\u0010\"\u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020\nH\u0016J\b\u0010%\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020'H\u0016J\u0018\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010-\u001a\u00020,H\u0016J\u0010\u0010.\u001a\u00020,2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u00101\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0016J\u0018\u00102\u001a\u00020,2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00100\u001a\u00020/H\u0016J\b\u00103\u001a\u00020,H\u0016J\u0010\u00105\u001a\u00020,2\u0006\u00104\u001a\u00020\nH\u0016J\b\u00106\u001a\u00020\u001dH\u0016J\b\u00108\u001a\u000207H\u0016J\u0010\u00109\u001a\u0002072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010:\u001a\u00020\f2\u0006\u0010*\u001a\u000207H\u0016J \u0010;\u001a\u00020\u001d2\u0006\u0010*\u001a\u0002072\u0006\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u001dH\u0016J\u0010\u0010;\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020<H\u0016J\u0006\u0010=\u001a\u00020\fJ\u0010\u0010>\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010@\u001a\u00020\u00002\u0006\u0010?\u001a\u00020$H\u0016J\u0010\u0010B\u001a\u00020\u00002\u0006\u0010A\u001a\u00020,H\u0016J \u0010E\u001a\u00020\u00002\u0006\u0010A\u001a\u00020,2\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001dH\u0016J\u0010\u0010G\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u001dH\u0016J(\u0010H\u001a\u00020\u00002\u0006\u0010A\u001a\u00020,2\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001d2\u0006\u00100\u001a\u00020/H\u0016J\u0010\u0010J\u001a\u00020\u00002\u0006\u0010I\u001a\u000207H\u0016J \u0010K\u001a\u00020\u00002\u0006\u0010I\u001a\u0002072\u0006\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u001dH\u0016J\u0010\u0010L\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020<H\u0016J\u0010\u0010N\u001a\u00020\n2\u0006\u0010I\u001a\u00020MH\u0016J\u0010\u0010P\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u001dH\u0016J\u0010\u0010R\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u001dH\u0016J\u0010\u0010T\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u001dH\u0016J\u0010\u0010V\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\nH\u0016J\u0010\u0010W\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\nH\u0016J\u0010\u0010X\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\nH\u0016J\u0017\u0010[\u001a\u00020Z2\u0006\u0010Y\u001a\u00020\u001dH\u0000¢\u0006\u0004\b[\u0010\\J\u0018\u0010]\u001a\u00020\f2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010^\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010a\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00162\u0006\u0010_\u001a\u00020\n2\u0006\u0010`\u001a\u00020\nH\u0016J\u0010\u0010c\u001a\u00020\n2\u0006\u0010b\u001a\u00020$H\u0016J\u0018\u0010d\u001a\u00020\n2\u0006\u0010b\u001a\u00020$2\u0006\u0010_\u001a\u00020\nH\u0016J\u0010\u0010f\u001a\u00020\n2\u0006\u0010e\u001a\u00020$H\u0016J\u0018\u0010g\u001a\u00020\n2\u0006\u0010e\u001a\u00020$2\u0006\u0010_\u001a\u00020\nH\u0016J\u0018\u0010h\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010b\u001a\u00020$H\u0016J(\u0010j\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010b\u001a\u00020$2\u0006\u0010i\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u001dH\u0016J\b\u0010k\u001a\u00020\fH\u0016J\b\u0010l\u001a\u00020\bH\u0016J\b\u0010m\u001a\u00020\fH\u0016J\b\u0010o\u001a\u00020nH\u0016J\u0013\u0010r\u001a\u00020\b2\b\u0010q\u001a\u0004\u0018\u00010pH\u0096\u0002J\b\u0010s\u001a\u00020\u001dH\u0016J\b\u0010t\u001a\u00020,H\u0016J\u0006\u0010S\u001a\u00020\u0000J\b\u0010u\u001a\u00020\u0000H\u0016J\u0006\u0010v\u001a\u00020$J\u000e\u0010w\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\u001dJ\u0012\u0010z\u001a\u00020x2\b\b\u0002\u0010y\u001a\u00020xH\u0007R,\u0010|\u001a\u00020\n2\u0006\u0010{\u001a\u00020\n8G@@X\u0086\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0084\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0088\u0001"}, d2 = {"Leg/c;", "Leg/e;", "Leg/d;", BuildConfig.FLAVOR, "Ljava/nio/channels/ByteChannel;", "E", "B", "p", BuildConfig.FLAVOR, "g0", BuildConfig.FLAVOR, "byteCount", "Ltb/e0;", "N0", "P", "J0", "Ljava/io/InputStream;", "d1", "out", "offset", "j", "h", BuildConfig.FLAVOR, "readByte", "pos", "M", "(J)B", BuildConfig.FLAVOR, "readShort", BuildConfig.FLAVOR, "readInt", "readLong", "D0", "z0", "v0", "b1", "Leg/f;", "w0", "F", "Leg/q;", "options", "Q", "sink", "Z0", BuildConfig.FLAVOR, "O0", "R0", "Ljava/nio/charset/Charset;", "charset", "M0", "K0", "b0", "limit", "y0", "V0", BuildConfig.FLAVOR, "u0", "l0", "readFully", "read", "Ljava/nio/ByteBuffer;", "e", "skip", "byteString", "j1", "string", "t1", "beginIndex", "endIndex", "u1", "codePoint", "v1", "s1", "source", "k1", "l1", "write", "Leg/a0;", "G0", "b", "m1", "s", "r1", "i", "p1", "v", "q1", "n1", "o1", "minimumCapacity", "Leg/v;", "i1", "(I)Leg/v;", "O", "g1", "fromIndex", "toIndex", "V", "bytes", "X", "W", "targetBytes", "Y", "e0", "f0", "bytesOffset", "h0", "flush", "isOpen", "close", "Leg/b0;", "m", BuildConfig.FLAVOR, "other", "equals", "hashCode", "toString", "f", "f1", "h1", "Leg/c$a;", "unsafeCursor", "j0", "<set-?>", "size", "J", "e1", "()J", "c1", "(J)V", "c", "()Leg/c;", "buffer", "<init>", "()V", "a", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: c */
    public v f9600c;

    /* renamed from: d */
    private long f9601d;

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\tH\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Leg/c$a;", "Ljava/io/Closeable;", BuildConfig.FLAVOR, "e", BuildConfig.FLAVOR, "offset", "h", "newSize", "f", "Ltb/e0;", "close", "Leg/v;", "segment", "Leg/v;", "b", "()Leg/v;", "i", "(Leg/v;)V", "<init>", "()V", "okio"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a implements Closeable {

        /* renamed from: c */
        public c f9602c;

        /* renamed from: d */
        public boolean f9603d;

        /* renamed from: q */
        private v f9604q;

        /* renamed from: y */
        public byte[] f9606y;

        /* renamed from: x */
        public long f9605x = -1;
        public int U3 = -1;
        public int V3 = -1;

        public final v b() {
            return this.f9604q;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f9602c != null) {
                this.f9602c = null;
                i(null);
                this.f9605x = -1L;
                this.f9606y = null;
                this.U3 = -1;
                this.V3 = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int e() {
            long j10 = this.f9605x;
            c cVar = this.f9602c;
            hc.t.b(cVar);
            if (j10 != cVar.e1()) {
                long j11 = this.f9605x;
                return h(j11 == -1 ? 0L : j11 + (this.V3 - this.U3));
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        public final long f(long j10) {
            c cVar = this.f9602c;
            if (cVar != null) {
                if (!this.f9603d) {
                    throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
                }
                long e12 = cVar.e1();
                int i10 = (j10 > e12 ? 1 : (j10 == e12 ? 0 : -1));
                int i11 = 1;
                if (i10 <= 0) {
                    if (!(j10 >= 0)) {
                        throw new IllegalArgumentException(hc.t.l("newSize < 0: ", Long.valueOf(j10)).toString());
                    }
                    long j11 = e12 - j10;
                    while (true) {
                        if (j11 <= 0) {
                            break;
                        }
                        v vVar = cVar.f9600c;
                        hc.t.b(vVar);
                        v vVar2 = vVar.f9656g;
                        hc.t.b(vVar2);
                        int i12 = vVar2.f9652c;
                        long j12 = i12 - vVar2.f9651b;
                        if (j12 > j11) {
                            vVar2.f9652c = i12 - ((int) j11);
                            break;
                        }
                        cVar.f9600c = vVar2.b();
                        w.b(vVar2);
                        j11 -= j12;
                    }
                    i(null);
                    this.f9605x = j10;
                    this.f9606y = null;
                    this.U3 = -1;
                    this.V3 = -1;
                } else if (i10 > 0) {
                    long j13 = j10 - e12;
                    boolean z10 = true;
                    while (j13 > 0) {
                        v i13 = cVar.i1(i11);
                        int min = (int) Math.min(j13, 8192 - i13.f9652c);
                        i13.f9652c += min;
                        j13 -= min;
                        if (z10) {
                            i(i13);
                            this.f9605x = e12;
                            this.f9606y = i13.f9650a;
                            int i14 = i13.f9652c;
                            this.U3 = i14 - min;
                            this.V3 = i14;
                            z10 = false;
                        }
                        i11 = 1;
                    }
                }
                cVar.c1(j10);
                return e12;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int h(long j10) {
            v vVar;
            c cVar = this.f9602c;
            if (cVar != null) {
                int i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
                if (i10 < 0 || j10 > cVar.e1()) {
                    throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + cVar.e1());
                } else if (i10 == 0 || j10 == cVar.e1()) {
                    i(null);
                    this.f9605x = j10;
                    this.f9606y = null;
                    this.U3 = -1;
                    this.V3 = -1;
                    return -1;
                } else {
                    long j11 = 0;
                    long e12 = cVar.e1();
                    v vVar2 = cVar.f9600c;
                    if (b() != null) {
                        long j12 = this.f9605x;
                        int i11 = this.U3;
                        v b10 = b();
                        hc.t.b(b10);
                        long j13 = j12 - (i11 - b10.f9651b);
                        if (j13 > j10) {
                            vVar2 = b();
                            e12 = j13;
                            vVar = vVar2;
                        } else {
                            vVar = b();
                            j11 = j13;
                        }
                    } else {
                        vVar = vVar2;
                    }
                    if (e12 - j10 > j10 - j11) {
                        while (true) {
                            hc.t.b(vVar);
                            int i12 = vVar.f9652c;
                            int i13 = vVar.f9651b;
                            if (j10 < (i12 - i13) + j11) {
                                break;
                            }
                            j11 += i12 - i13;
                            vVar = vVar.f9655f;
                        }
                    } else {
                        while (e12 > j10) {
                            hc.t.b(vVar2);
                            vVar2 = vVar2.f9656g;
                            hc.t.b(vVar2);
                            e12 -= vVar2.f9652c - vVar2.f9651b;
                        }
                        j11 = e12;
                        vVar = vVar2;
                    }
                    if (this.f9603d) {
                        hc.t.b(vVar);
                        if (vVar.f9653d) {
                            v f10 = vVar.f();
                            if (cVar.f9600c == vVar) {
                                cVar.f9600c = f10;
                            }
                            vVar = vVar.c(f10);
                            v vVar3 = vVar.f9656g;
                            hc.t.b(vVar3);
                            vVar3.b();
                        }
                    }
                    i(vVar);
                    this.f9605x = j10;
                    hc.t.b(vVar);
                    this.f9606y = vVar.f9650a;
                    int i14 = vVar.f9651b + ((int) (j10 - j11));
                    this.U3 = i14;
                    int i15 = vVar.f9652c;
                    this.V3 = i15;
                    return i15 - i14;
                }
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final void i(v vVar) {
            this.f9604q = vVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"eg/c$b", "Ljava/io/InputStream;", BuildConfig.FLAVOR, "read", BuildConfig.FLAVOR, "sink", "offset", "byteCount", "available", "Ltb/e0;", "close", BuildConfig.FLAVOR, "toString", "okio"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b extends InputStream {
        b() {
            c.this = r1;
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.e1(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (c.this.e1() > 0) {
                return c.this.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            hc.t.e(bArr, "sink");
            return c.this.read(bArr, i10, i11);
        }

        public String toString() {
            return c.this + ".inputStream()";
        }
    }

    public static /* synthetic */ a s0(c cVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = f0.c();
        }
        return cVar.j0(aVar);
    }

    /* renamed from: B */
    public c t0() {
        return this;
    }

    public short D0() {
        return f0.g(readShort());
    }

    @Override // eg.e
    public c E() {
        return this;
    }

    @Override // eg.e
    public f F(long j10) {
        if (j10 >= 0 && j10 <= 2147483647L) {
            if (e1() < j10) {
                throw new EOFException();
            }
            if (j10 < 4096) {
                return new f(l0(j10));
            }
            f h12 = h1((int) j10);
            skip(j10);
            return h12;
        }
        throw new IllegalArgumentException(hc.t.l("byteCount: ", Long.valueOf(j10)).toString());
    }

    @Override // eg.d
    public long G0(a0 a0Var) {
        hc.t.e(a0Var, "source");
        long j10 = 0;
        while (true) {
            long g12 = a0Var.g1(this, 8192L);
            if (g12 == -1) {
                return j10;
            }
            j10 += g12;
        }
    }

    @Override // eg.e
    public e J0() {
        return n.d(new s(this));
    }

    public String K0(long j10, Charset charset) {
        hc.t.e(charset, "charset");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0 && j10 <= 2147483647L) {
            if (this.f9601d < j10) {
                throw new EOFException();
            }
            if (i10 == 0) {
                return BuildConfig.FLAVOR;
            }
            v vVar = this.f9600c;
            hc.t.b(vVar);
            int i11 = vVar.f9651b;
            if (i11 + j10 > vVar.f9652c) {
                return new String(l0(j10), charset);
            }
            int i12 = (int) j10;
            String str = new String(vVar.f9650a, i11, i12, charset);
            int i13 = vVar.f9651b + i12;
            vVar.f9651b = i13;
            this.f9601d -= j10;
            if (i13 == vVar.f9652c) {
                this.f9600c = vVar.b();
                w.b(vVar);
            }
            return str;
        }
        throw new IllegalArgumentException(hc.t.l("byteCount: ", Long.valueOf(j10)).toString());
    }

    public final byte M(long j10) {
        f0.b(e1(), j10, 1L);
        v vVar = this.f9600c;
        if (vVar == null) {
            hc.t.b(null);
            throw null;
        } else if (e1() - j10 < j10) {
            long e12 = e1();
            while (e12 > j10) {
                vVar = vVar.f9656g;
                hc.t.b(vVar);
                e12 -= vVar.f9652c - vVar.f9651b;
            }
            hc.t.b(vVar);
            return vVar.f9650a[(int) ((vVar.f9651b + j10) - e12)];
        } else {
            long j11 = 0;
            while (true) {
                long j12 = (vVar.f9652c - vVar.f9651b) + j11;
                if (j12 > j10) {
                    hc.t.b(vVar);
                    return vVar.f9650a[(int) ((vVar.f9651b + j10) - j11)];
                }
                vVar = vVar.f9655f;
                hc.t.b(vVar);
                j11 = j12;
            }
        }
    }

    public String M0(Charset charset) {
        hc.t.e(charset, "charset");
        return K0(this.f9601d, charset);
    }

    @Override // eg.e
    public void N0(long j10) {
        if (this.f9601d >= j10) {
            return;
        }
        throw new EOFException();
    }

    @Override // eg.y
    public void O(c cVar, long j10) {
        v vVar;
        v vVar2;
        hc.t.e(cVar, "source");
        if (cVar != this) {
            f0.b(cVar.e1(), 0L, j10);
            while (j10 > 0) {
                v vVar3 = cVar.f9600c;
                hc.t.b(vVar3);
                int i10 = vVar3.f9652c;
                hc.t.b(cVar.f9600c);
                if (j10 < i10 - vVar.f9651b) {
                    v vVar4 = this.f9600c;
                    if (vVar4 != null) {
                        hc.t.b(vVar4);
                        vVar2 = vVar4.f9656g;
                    } else {
                        vVar2 = null;
                    }
                    if (vVar2 != null && vVar2.f9654e) {
                        if ((vVar2.f9652c + j10) - (vVar2.f9653d ? 0 : vVar2.f9651b) <= 8192) {
                            v vVar5 = cVar.f9600c;
                            hc.t.b(vVar5);
                            vVar5.g(vVar2, (int) j10);
                            cVar.c1(cVar.e1() - j10);
                            c1(e1() + j10);
                            return;
                        }
                    }
                    v vVar6 = cVar.f9600c;
                    hc.t.b(vVar6);
                    cVar.f9600c = vVar6.e((int) j10);
                }
                v vVar7 = cVar.f9600c;
                hc.t.b(vVar7);
                long j11 = vVar7.f9652c - vVar7.f9651b;
                cVar.f9600c = vVar7.b();
                v vVar8 = this.f9600c;
                if (vVar8 == null) {
                    this.f9600c = vVar7;
                    vVar7.f9656g = vVar7;
                    vVar7.f9655f = vVar7;
                } else {
                    hc.t.b(vVar8);
                    v vVar9 = vVar8.f9656g;
                    hc.t.b(vVar9);
                    vVar9.c(vVar7).a();
                }
                cVar.c1(cVar.e1() - j11);
                c1(e1() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public String O0() {
        return K0(this.f9601d, bf.d.f5986b);
    }

    @Override // eg.e
    public boolean P(long j10) {
        return this.f9601d >= j10;
    }

    @Override // eg.e
    public int Q(q qVar) {
        hc.t.e(qVar, "options");
        int f10 = fg.a.f(this, qVar, false, 2, null);
        if (f10 == -1) {
            return -1;
        }
        skip(qVar.e()[f10].W());
        return f10;
    }

    public String R0(long j10) {
        return K0(j10, bf.d.f5986b);
    }

    public long V(byte b10, long j10, long j11) {
        v vVar;
        int i10;
        long j12 = 0;
        boolean z10 = false;
        if (0 <= j10 && j10 <= j11) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(("size=" + e1() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > e1()) {
            j11 = e1();
        }
        long j13 = j11;
        if (j10 == j13 || (vVar = this.f9600c) == null) {
            return -1L;
        }
        if (e1() - j10 < j10) {
            j12 = e1();
            while (j12 > j10) {
                vVar = vVar.f9656g;
                hc.t.b(vVar);
                j12 -= vVar.f9652c - vVar.f9651b;
            }
            while (j12 < j13) {
                byte[] bArr = vVar.f9650a;
                int min = (int) Math.min(vVar.f9652c, (vVar.f9651b + j13) - j12);
                i10 = (int) ((vVar.f9651b + j10) - j12);
                while (i10 < min) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                j12 += vVar.f9652c - vVar.f9651b;
                vVar = vVar.f9655f;
                hc.t.b(vVar);
                j10 = j12;
            }
            return -1L;
        }
        while (true) {
            long j14 = (vVar.f9652c - vVar.f9651b) + j12;
            if (j14 > j10) {
                break;
            }
            vVar = vVar.f9655f;
            hc.t.b(vVar);
            j12 = j14;
        }
        while (j12 < j13) {
            byte[] bArr2 = vVar.f9650a;
            int min2 = (int) Math.min(vVar.f9652c, (vVar.f9651b + j13) - j12);
            i10 = (int) ((vVar.f9651b + j10) - j12);
            while (i10 < min2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            j12 += vVar.f9652c - vVar.f9651b;
            vVar = vVar.f9655f;
            hc.t.b(vVar);
            j10 = j12;
        }
        return -1L;
        return (i10 - vVar.f9651b) + j12;
    }

    public int V0() {
        int i10;
        int i11;
        int i12;
        if (e1() != 0) {
            byte M = M(0L);
            boolean z10 = false;
            if ((M & 128) == 0) {
                i12 = M & Byte.MAX_VALUE;
                i10 = 0;
                i11 = 1;
            } else if ((M & 224) == 192) {
                i12 = M & 31;
                i11 = 2;
                i10 = 128;
            } else if ((M & 240) == 224) {
                i12 = M & 15;
                i11 = 3;
                i10 = 2048;
            } else if ((M & 248) != 240) {
                skip(1L);
                return 65533;
            } else {
                i12 = M & 7;
                i11 = 4;
                i10 = 65536;
            }
            long j10 = i11;
            if (e1() < j10) {
                throw new EOFException("size < " + i11 + ": " + e1() + " (to read code point prefixed 0x" + f0.h(M) + ')');
            }
            if (1 < i11) {
                int i13 = 1;
                while (true) {
                    int i14 = i13 + 1;
                    long j11 = i13;
                    byte M2 = M(j11);
                    if ((M2 & 192) != 128) {
                        skip(j11);
                        return 65533;
                    }
                    i12 = (i12 << 6) | (M2 & 63);
                    if (i14 >= i11) {
                        break;
                    }
                    i13 = i14;
                }
            }
            skip(j10);
            if (i12 > 1114111) {
                return 65533;
            }
            if (55296 <= i12 && i12 <= 57343) {
                z10 = true;
            }
            if (z10 || i12 < i10) {
                return 65533;
            }
            return i12;
        }
        throw new EOFException();
    }

    public long W(f fVar, long j10) {
        hc.t.e(fVar, "bytes");
        if (fVar.W() > 0) {
            long j11 = 0;
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(hc.t.l("fromIndex < 0: ", Long.valueOf(j10)).toString());
            }
            v vVar = this.f9600c;
            if (vVar != null) {
                if (e1() - j10 < j10) {
                    long e12 = e1();
                    while (e12 > j10) {
                        vVar = vVar.f9656g;
                        hc.t.b(vVar);
                        e12 -= vVar.f9652c - vVar.f9651b;
                    }
                    byte[] y10 = fVar.y();
                    byte b10 = y10[0];
                    int W = fVar.W();
                    long e13 = (e1() - W) + 1;
                    long j12 = e12;
                    long j13 = j10;
                    while (j12 < e13) {
                        byte[] bArr = vVar.f9650a;
                        int min = (int) Math.min(vVar.f9652c, (vVar.f9651b + e13) - j12);
                        int i10 = (int) ((vVar.f9651b + j13) - j12);
                        if (i10 < min) {
                            while (true) {
                                int i11 = i10 + 1;
                                if (bArr[i10] == b10 && fg.a.c(vVar, i11, y10, 1, W)) {
                                    return (i10 - vVar.f9651b) + j12;
                                }
                                if (i11 >= min) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        j12 += vVar.f9652c - vVar.f9651b;
                        vVar = vVar.f9655f;
                        hc.t.b(vVar);
                        j13 = j12;
                    }
                } else {
                    while (true) {
                        long j14 = (vVar.f9652c - vVar.f9651b) + j11;
                        if (j14 > j10) {
                            break;
                        }
                        vVar = vVar.f9655f;
                        hc.t.b(vVar);
                        j11 = j14;
                    }
                    byte[] y11 = fVar.y();
                    byte b11 = y11[0];
                    int W2 = fVar.W();
                    long e14 = (e1() - W2) + 1;
                    long j15 = j11;
                    long j16 = j10;
                    while (j15 < e14) {
                        byte[] bArr2 = vVar.f9650a;
                        long j17 = e14;
                        int min2 = (int) Math.min(vVar.f9652c, (vVar.f9651b + e14) - j15);
                        int i12 = (int) ((vVar.f9651b + j16) - j15);
                        if (i12 < min2) {
                            while (true) {
                                int i13 = i12 + 1;
                                if (bArr2[i12] == b11 && fg.a.c(vVar, i13, y11, 1, W2)) {
                                    return (i12 - vVar.f9651b) + j15;
                                }
                                if (i13 >= min2) {
                                    break;
                                }
                                i12 = i13;
                            }
                        }
                        j15 += vVar.f9652c - vVar.f9651b;
                        vVar = vVar.f9655f;
                        hc.t.b(vVar);
                        j16 = j15;
                        e14 = j17;
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @Override // eg.e
    public long X(f fVar) {
        hc.t.e(fVar, "bytes");
        return W(fVar, 0L);
    }

    @Override // eg.e
    public long Y(f fVar) {
        hc.t.e(fVar, "targetBytes");
        return e0(fVar, 0L);
    }

    @Override // eg.e
    public void Z0(c cVar, long j10) {
        hc.t.e(cVar, "sink");
        if (e1() >= j10) {
            cVar.O(this, j10);
        } else {
            cVar.O(this, e1());
            throw new EOFException();
        }
    }

    @Override // eg.e
    public String b0() {
        return y0(Long.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098 A[EDGE_INSN: B:41:0x0098->B:36:0x0098 ?: BREAK  , SYNTHETIC] */
    @Override // eg.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long b1() {
        /*
            r14 = this;
            long r0 = r14.e1()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La2
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            eg.v r6 = r14.f9600c
            hc.t.b(r6)
            byte[] r7 = r6.f9650a
            int r8 = r6.f9651b
            int r9 = r6.f9652c
        L18:
            if (r8 >= r9) goto L84
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L70
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L70
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            eg.c r0 = new eg.c
            r0.<init>()
            eg.c r0 = r0.A(r4)
            eg.c r0 = r0.i0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.O0()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = hc.t.l(r2, r0)
            r1.<init>(r0)
            throw r1
        L70:
            if (r0 == 0) goto L74
            r1 = 1
            goto L84
        L74:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = eg.f0.h(r10)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = hc.t.l(r2, r1)
            r0.<init>(r1)
            throw r0
        L84:
            if (r8 != r9) goto L90
            eg.v r7 = r6.b()
            r14.f9600c = r7
            eg.w.b(r6)
            goto L92
        L90:
            r6.f9651b = r8
        L92:
            if (r1 != 0) goto L98
            eg.v r6 = r14.f9600c
            if (r6 != 0) goto Ld
        L98:
            long r1 = r14.e1()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.c1(r1)
            return r4
        La2:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.c.b1():long");
    }

    @Override // eg.e, eg.d
    public c c() {
        return this;
    }

    public final void c1(long j10) {
        this.f9601d = j10;
    }

    @Override // eg.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // eg.e
    public InputStream d1() {
        return new b();
    }

    public final void e() {
        skip(e1());
    }

    public long e0(f fVar, long j10) {
        int i10;
        hc.t.e(fVar, "targetBytes");
        long j11 = 0;
        if (j10 >= 0) {
            v vVar = this.f9600c;
            if (vVar == null) {
                return -1L;
            }
            if (e1() - j10 < j10) {
                j11 = e1();
                while (j11 > j10) {
                    vVar = vVar.f9656g;
                    hc.t.b(vVar);
                    j11 -= vVar.f9652c - vVar.f9651b;
                }
                if (fVar.W() == 2) {
                    byte p10 = fVar.p(0);
                    byte p11 = fVar.p(1);
                    while (j11 < e1()) {
                        byte[] bArr = vVar.f9650a;
                        i10 = (int) ((vVar.f9651b + j10) - j11);
                        int i11 = vVar.f9652c;
                        while (i10 < i11) {
                            byte b10 = bArr[i10];
                            if (b10 != p10 && b10 != p11) {
                                i10++;
                            }
                        }
                        j11 += vVar.f9652c - vVar.f9651b;
                        vVar = vVar.f9655f;
                        hc.t.b(vVar);
                        j10 = j11;
                    }
                    return -1L;
                }
                byte[] y10 = fVar.y();
                while (j11 < e1()) {
                    byte[] bArr2 = vVar.f9650a;
                    i10 = (int) ((vVar.f9651b + j10) - j11);
                    int i12 = vVar.f9652c;
                    while (i10 < i12) {
                        byte b11 = bArr2[i10];
                        int length = y10.length;
                        int i13 = 0;
                        while (i13 < length) {
                            byte b12 = y10[i13];
                            i13++;
                            if (b11 == b12) {
                            }
                        }
                        i10++;
                    }
                    j11 += vVar.f9652c - vVar.f9651b;
                    vVar = vVar.f9655f;
                    hc.t.b(vVar);
                    j10 = j11;
                }
                return -1L;
            }
            while (true) {
                long j12 = (vVar.f9652c - vVar.f9651b) + j11;
                if (j12 > j10) {
                    break;
                }
                vVar = vVar.f9655f;
                hc.t.b(vVar);
                j11 = j12;
            }
            if (fVar.W() == 2) {
                byte p12 = fVar.p(0);
                byte p13 = fVar.p(1);
                while (j11 < e1()) {
                    byte[] bArr3 = vVar.f9650a;
                    i10 = (int) ((vVar.f9651b + j10) - j11);
                    int i14 = vVar.f9652c;
                    while (i10 < i14) {
                        byte b13 = bArr3[i10];
                        if (b13 != p12 && b13 != p13) {
                            i10++;
                        }
                    }
                    j11 += vVar.f9652c - vVar.f9651b;
                    vVar = vVar.f9655f;
                    hc.t.b(vVar);
                    j10 = j11;
                }
                return -1L;
            }
            byte[] y11 = fVar.y();
            while (j11 < e1()) {
                byte[] bArr4 = vVar.f9650a;
                i10 = (int) ((vVar.f9651b + j10) - j11);
                int i15 = vVar.f9652c;
                while (i10 < i15) {
                    byte b14 = bArr4[i10];
                    int length2 = y11.length;
                    int i16 = 0;
                    while (i16 < length2) {
                        byte b15 = y11[i16];
                        i16++;
                        if (b14 == b15) {
                        }
                    }
                    i10++;
                }
                j11 += vVar.f9652c - vVar.f9651b;
                vVar = vVar.f9655f;
                hc.t.b(vVar);
                j10 = j11;
            }
            return -1L;
            return (i10 - vVar.f9651b) + j11;
        }
        throw new IllegalArgumentException(hc.t.l("fromIndex < 0: ", Long.valueOf(j10)).toString());
    }

    public final long e1() {
        return this.f9601d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (e1() != cVar.e1()) {
                return false;
            }
            if (e1() != 0) {
                v vVar = this.f9600c;
                hc.t.b(vVar);
                v vVar2 = cVar.f9600c;
                hc.t.b(vVar2);
                int i10 = vVar.f9651b;
                int i11 = vVar2.f9651b;
                long j10 = 0;
                while (j10 < e1()) {
                    long min = Math.min(vVar.f9652c - i10, vVar2.f9652c - i11);
                    if (0 < min) {
                        long j11 = 0;
                        while (true) {
                            j11++;
                            int i12 = i10 + 1;
                            int i13 = i11 + 1;
                            if (vVar.f9650a[i10] != vVar2.f9650a[i11]) {
                                return false;
                            }
                            if (j11 >= min) {
                                i10 = i12;
                                i11 = i13;
                                break;
                            }
                            i10 = i12;
                            i11 = i13;
                        }
                    }
                    if (i10 == vVar.f9652c) {
                        vVar = vVar.f9655f;
                        hc.t.b(vVar);
                        i10 = vVar.f9651b;
                    }
                    if (i11 == vVar2.f9652c) {
                        vVar2 = vVar2.f9655f;
                        hc.t.b(vVar2);
                        i11 = vVar2.f9651b;
                    }
                    j10 += min;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public c clone() {
        return i();
    }

    public boolean f0(long j10, f fVar) {
        hc.t.e(fVar, "bytes");
        return h0(j10, fVar, 0, fVar.W());
    }

    public final f f1() {
        if (e1() <= 2147483647L) {
            return h1((int) e1());
        }
        throw new IllegalStateException(hc.t.l("size > Int.MAX_VALUE: ", Long.valueOf(e1())).toString());
    }

    @Override // eg.d, eg.y, java.io.Flushable
    public void flush() {
    }

    @Override // eg.e
    public boolean g0() {
        return this.f9601d == 0;
    }

    @Override // eg.a0
    public long g1(c cVar, long j10) {
        hc.t.e(cVar, "sink");
        if (j10 >= 0) {
            if (e1() == 0) {
                return -1L;
            }
            if (j10 > e1()) {
                j10 = e1();
            }
            cVar.O(this, j10);
            return j10;
        }
        throw new IllegalArgumentException(hc.t.l("byteCount < 0: ", Long.valueOf(j10)).toString());
    }

    public final long h() {
        long e12 = e1();
        if (e12 == 0) {
            return 0L;
        }
        v vVar = this.f9600c;
        hc.t.b(vVar);
        v vVar2 = vVar.f9656g;
        hc.t.b(vVar2);
        int i10 = vVar2.f9652c;
        if (i10 < 8192 && vVar2.f9654e) {
            e12 -= i10 - vVar2.f9651b;
        }
        return e12;
    }

    public boolean h0(long j10, f fVar, int i10, int i11) {
        hc.t.e(fVar, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || e1() - j10 < i11 || fVar.W() - i10 < i11) {
            return false;
        }
        if (i11 > 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (M(i12 + j10) != fVar.p(i12 + i10)) {
                    return false;
                }
                if (i13 >= i11) {
                    break;
                }
                i12 = i13;
            }
        }
        return true;
    }

    public final f h1(int i10) {
        if (i10 == 0) {
            return f.f9610x;
        }
        f0.b(e1(), 0L, i10);
        v vVar = this.f9600c;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            hc.t.b(vVar);
            int i14 = vVar.f9652c;
            int i15 = vVar.f9651b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            vVar = vVar.f9655f;
        }
        byte[][] bArr = new byte[i13];
        int[] iArr = new int[i13 * 2];
        v vVar2 = this.f9600c;
        int i16 = 0;
        while (i11 < i10) {
            hc.t.b(vVar2);
            bArr[i16] = vVar2.f9650a;
            i11 += vVar2.f9652c - vVar2.f9651b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = vVar2.f9651b;
            vVar2.f9653d = true;
            i16++;
            vVar2 = vVar2.f9655f;
        }
        return new x(bArr, iArr);
    }

    public int hashCode() {
        v vVar = this.f9600c;
        if (vVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = vVar.f9652c;
            for (int i12 = vVar.f9651b; i12 < i11; i12++) {
                i10 = (i10 * 31) + vVar.f9650a[i12];
            }
            vVar = vVar.f9655f;
            hc.t.b(vVar);
        } while (vVar != this.f9600c);
        return i10;
    }

    public final c i() {
        c cVar = new c();
        if (e1() != 0) {
            v vVar = this.f9600c;
            hc.t.b(vVar);
            v d10 = vVar.d();
            cVar.f9600c = d10;
            d10.f9656g = d10;
            d10.f9655f = d10;
            for (v vVar2 = vVar.f9655f; vVar2 != vVar; vVar2 = vVar2.f9655f) {
                v vVar3 = d10.f9656g;
                hc.t.b(vVar3);
                hc.t.b(vVar2);
                vVar3.c(vVar2.d());
            }
            cVar.c1(e1());
        }
        return cVar;
    }

    public final v i1(int i10) {
        boolean z10 = true;
        if (i10 < 1 || i10 > 8192) {
            z10 = false;
        }
        if (z10) {
            v vVar = this.f9600c;
            if (vVar != null) {
                hc.t.b(vVar);
                v vVar2 = vVar.f9656g;
                hc.t.b(vVar2);
                return (vVar2.f9652c + i10 > 8192 || !vVar2.f9654e) ? vVar2.c(w.c()) : vVar2;
            }
            v c10 = w.c();
            this.f9600c = c10;
            c10.f9656g = c10;
            c10.f9655f = c10;
            return c10;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final c j(c cVar, long j10, long j11) {
        hc.t.e(cVar, "out");
        f0.b(e1(), j10, j11);
        if (j11 != 0) {
            cVar.c1(cVar.e1() + j11);
            v vVar = this.f9600c;
            while (true) {
                hc.t.b(vVar);
                int i10 = vVar.f9652c;
                int i11 = vVar.f9651b;
                if (j10 >= i10 - i11) {
                    j10 -= i10 - i11;
                    vVar = vVar.f9655f;
                }
            }
            while (j11 > 0) {
                hc.t.b(vVar);
                v d10 = vVar.d();
                int i12 = d10.f9651b + ((int) j10);
                d10.f9651b = i12;
                d10.f9652c = Math.min(i12 + ((int) j11), d10.f9652c);
                v vVar2 = cVar.f9600c;
                if (vVar2 == null) {
                    d10.f9656g = d10;
                    d10.f9655f = d10;
                    cVar.f9600c = d10;
                } else {
                    hc.t.b(vVar2);
                    v vVar3 = vVar2.f9656g;
                    hc.t.b(vVar3);
                    vVar3.c(d10);
                }
                j11 -= d10.f9652c - d10.f9651b;
                vVar = vVar.f9655f;
                j10 = 0;
            }
        }
        return this;
    }

    public final a j0(a aVar) {
        hc.t.e(aVar, "unsafeCursor");
        return fg.a.a(this, aVar);
    }

    /* renamed from: j1 */
    public c k0(f fVar) {
        hc.t.e(fVar, "byteString");
        fVar.f0(this, 0, fVar.W());
        return this;
    }

    /* renamed from: k1 */
    public c r0(byte[] bArr) {
        hc.t.e(bArr, "source");
        return o(bArr, 0, bArr.length);
    }

    @Override // eg.e
    public byte[] l0(long j10) {
        if (j10 >= 0 && j10 <= 2147483647L) {
            if (e1() < j10) {
                throw new EOFException();
            }
            byte[] bArr = new byte[(int) j10];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException(hc.t.l("byteCount: ", Long.valueOf(j10)).toString());
    }

    /* renamed from: l1 */
    public c o(byte[] bArr, int i10, int i11) {
        hc.t.e(bArr, "source");
        long j10 = i11;
        f0.b(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            v i13 = i1(1);
            int min = Math.min(i12 - i10, 8192 - i13.f9652c);
            int i14 = i10 + min;
            ub.l.e(bArr, i13.f9650a, i13.f9652c, i10, i14);
            i13.f9652c += min;
            i10 = i14;
        }
        c1(e1() + j10);
        return this;
    }

    @Override // eg.a0
    public b0 m() {
        return b0.f9596d;
    }

    /* renamed from: m1 */
    public c i0(int i10) {
        v i12 = i1(1);
        byte[] bArr = i12.f9650a;
        int i11 = i12.f9652c;
        i12.f9652c = i11 + 1;
        bArr[i11] = (byte) i10;
        c1(e1() + 1);
        return this;
    }

    /* renamed from: n1 */
    public c T0(long j10) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return i0(48);
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return Q0("-9223372036854775808");
            }
            z10 = true;
        }
        if (j10 >= 100000000) {
            i11 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i11 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i11 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i11 = 2;
        }
        if (z10) {
            i11++;
        }
        v i12 = i1(i11);
        byte[] bArr = i12.f9650a;
        int i13 = i12.f9652c + i11;
        while (j10 != 0) {
            long j11 = 10;
            i13--;
            bArr[i13] = fg.a.b()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i13 - 1] = (byte) 45;
        }
        i12.f9652c += i11;
        c1(e1() + i11);
        return this;
    }

    /* renamed from: o1 */
    public c A(long j10) {
        if (j10 == 0) {
            return i0(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        v i12 = i1(i10);
        byte[] bArr = i12.f9650a;
        int i11 = i12.f9652c;
        for (int i13 = (i11 + i10) - 1; i13 >= i11; i13--) {
            bArr[i13] = fg.a.b()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        i12.f9652c += i10;
        c1(e1() + i10);
        return this;
    }

    /* renamed from: p */
    public c L() {
        return this;
    }

    /* renamed from: p1 */
    public c U(int i10) {
        v i12 = i1(4);
        byte[] bArr = i12.f9650a;
        int i11 = i12.f9652c;
        int i13 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 16) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((i10 >>> 8) & 255);
        bArr[i15] = (byte) (i10 & 255);
        i12.f9652c = i15 + 1;
        c1(e1() + 4);
        return this;
    }

    public c q1(long j10) {
        v i12 = i1(8);
        byte[] bArr = i12.f9650a;
        int i10 = i12.f9652c;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        int i13 = i11 + 1;
        bArr[i11] = (byte) ((j10 >>> 48) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((j10 >>> 40) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((j10 >>> 32) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) ((j10 >>> 24) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) ((j10 >>> 16) & 255);
        int i18 = i17 + 1;
        bArr[i17] = (byte) ((j10 >>> 8) & 255);
        bArr[i18] = (byte) (j10 & 255);
        i12.f9652c = i18 + 1;
        c1(e1() + 8);
        return this;
    }

    /* renamed from: r1 */
    public c N(int i10) {
        v i12 = i1(2);
        byte[] bArr = i12.f9650a;
        int i11 = i12.f9652c;
        int i13 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i13] = (byte) (i10 & 255);
        i12.f9652c = i13 + 1;
        c1(e1() + 2);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        hc.t.e(byteBuffer, "sink");
        v vVar = this.f9600c;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), vVar.f9652c - vVar.f9651b);
        byteBuffer.put(vVar.f9650a, vVar.f9651b, min);
        int i10 = vVar.f9651b + min;
        vVar.f9651b = i10;
        this.f9601d -= min;
        if (i10 == vVar.f9652c) {
            this.f9600c = vVar.b();
            w.b(vVar);
        }
        return min;
    }

    public int read(byte[] bArr, int i10, int i11) {
        hc.t.e(bArr, "sink");
        f0.b(bArr.length, i10, i11);
        v vVar = this.f9600c;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(i11, vVar.f9652c - vVar.f9651b);
        byte[] bArr2 = vVar.f9650a;
        int i12 = vVar.f9651b;
        ub.l.e(bArr2, bArr, i10, i12, i12 + min);
        vVar.f9651b += min;
        c1(e1() - min);
        if (vVar.f9651b == vVar.f9652c) {
            this.f9600c = vVar.b();
            w.b(vVar);
        }
        return min;
    }

    @Override // eg.e
    public byte readByte() {
        if (e1() != 0) {
            v vVar = this.f9600c;
            hc.t.b(vVar);
            int i10 = vVar.f9651b;
            int i11 = vVar.f9652c;
            int i12 = i10 + 1;
            byte b10 = vVar.f9650a[i10];
            c1(e1() - 1);
            if (i12 == i11) {
                this.f9600c = vVar.b();
                w.b(vVar);
            } else {
                vVar.f9651b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    @Override // eg.e
    public void readFully(byte[] bArr) {
        hc.t.e(bArr, "sink");
        int i10 = 0;
        while (i10 < bArr.length) {
            int read = read(bArr, i10, bArr.length - i10);
            if (read == -1) {
                throw new EOFException();
            }
            i10 += read;
        }
    }

    @Override // eg.e
    public int readInt() {
        if (e1() >= 4) {
            v vVar = this.f9600c;
            hc.t.b(vVar);
            int i10 = vVar.f9651b;
            int i11 = vVar.f9652c;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = vVar.f9650a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & 255) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & 255);
            c1(e1() - 4);
            if (i17 == i11) {
                this.f9600c = vVar.b();
                w.b(vVar);
            } else {
                vVar.f9651b = i17;
            }
            return i18;
        }
        throw new EOFException();
    }

    @Override // eg.e
    public long readLong() {
        if (e1() >= 8) {
            v vVar = this.f9600c;
            hc.t.b(vVar);
            int i10 = vVar.f9651b;
            int i11 = vVar.f9652c;
            if (i11 - i10 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = vVar.f9650a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = i13 + 1;
            int i15 = i14 + 1;
            int i16 = i15 + 1;
            int i17 = i16 + 1;
            long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i12] & 255) << 48) | ((bArr[i13] & 255) << 40) | ((bArr[i14] & 255) << 32) | ((bArr[i15] & 255) << 24) | ((bArr[i16] & 255) << 16);
            int i18 = i17 + 1;
            int i19 = i18 + 1;
            long j11 = j10 | ((bArr[i17] & 255) << 8) | (bArr[i18] & 255);
            c1(e1() - 8);
            if (i19 == i11) {
                this.f9600c = vVar.b();
                w.b(vVar);
            } else {
                vVar.f9651b = i19;
            }
            return j11;
        }
        throw new EOFException();
    }

    @Override // eg.e
    public short readShort() {
        if (e1() >= 2) {
            v vVar = this.f9600c;
            hc.t.b(vVar);
            int i10 = vVar.f9651b;
            int i11 = vVar.f9652c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = vVar.f9650a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            c1(e1() - 2);
            if (i13 == i11) {
                this.f9600c = vVar.b();
                w.b(vVar);
            } else {
                vVar.f9651b = i13;
            }
            return (short) i14;
        }
        throw new EOFException();
    }

    public c s1(String str, int i10, int i11, Charset charset) {
        hc.t.e(str, "string");
        hc.t.e(charset, "charset");
        boolean z10 = true;
        if (i10 >= 0) {
            if (!(i11 >= i10)) {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
            }
            if (i11 > str.length()) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
            } else if (hc.t.a(charset, bf.d.f5986b)) {
                return x(str, i10, i11);
            } else {
                String substring = str.substring(i10, i11);
                hc.t.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes = substring.getBytes(charset);
                hc.t.d(bytes, "(this as java.lang.String).getBytes(charset)");
                return o(bytes, 0, bytes.length);
            }
        }
        throw new IllegalArgumentException(hc.t.l("beginIndex < 0: ", Integer.valueOf(i10)).toString());
    }

    @Override // eg.e
    public void skip(long j10) {
        while (j10 > 0) {
            v vVar = this.f9600c;
            if (vVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j10, vVar.f9652c - vVar.f9651b);
            long j11 = min;
            c1(e1() - j11);
            j10 -= j11;
            int i10 = vVar.f9651b + min;
            vVar.f9651b = i10;
            if (i10 == vVar.f9652c) {
                this.f9600c = vVar.b();
                w.b(vVar);
            }
        }
    }

    /* renamed from: t1 */
    public c Q0(String str) {
        hc.t.e(str, "string");
        return x(str, 0, str.length());
    }

    public String toString() {
        return f1().toString();
    }

    public byte[] u0() {
        return l0(e1());
    }

    /* renamed from: u1 */
    public c x(String str, int i10, int i11) {
        char charAt;
        long e12;
        long j10;
        hc.t.e(str, "string");
        if (i10 >= 0) {
            if (!(i11 >= i10)) {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
            }
            if (!(i11 <= str.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
            }
            while (i10 < i11) {
                char charAt2 = str.charAt(i10);
                if (charAt2 < 128) {
                    v i12 = i1(1);
                    byte[] bArr = i12.f9650a;
                    int i13 = i12.f9652c - i10;
                    int min = Math.min(i11, 8192 - i13);
                    int i14 = i10 + 1;
                    bArr[i10 + i13] = (byte) charAt2;
                    while (true) {
                        i10 = i14;
                        if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                            break;
                        }
                        i14 = i10 + 1;
                        bArr[i10 + i13] = (byte) charAt;
                    }
                    int i15 = i12.f9652c;
                    int i16 = (i13 + i10) - i15;
                    i12.f9652c = i15 + i16;
                    c1(e1() + i16);
                } else {
                    if (charAt2 < 2048) {
                        v i17 = i1(2);
                        byte[] bArr2 = i17.f9650a;
                        int i18 = i17.f9652c;
                        bArr2[i18] = (byte) ((charAt2 >> 6) | 192);
                        bArr2[i18 + 1] = (byte) ((charAt2 & '?') | 128);
                        i17.f9652c = i18 + 2;
                        e12 = e1();
                        j10 = 2;
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        v i19 = i1(3);
                        byte[] bArr3 = i19.f9650a;
                        int i20 = i19.f9652c;
                        bArr3[i20] = (byte) ((charAt2 >> '\f') | 224);
                        bArr3[i20 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr3[i20 + 2] = (byte) ((charAt2 & '?') | 128);
                        i19.f9652c = i20 + 3;
                        e12 = e1();
                        j10 = 3;
                    } else {
                        int i21 = i10 + 1;
                        char charAt3 = i21 < i11 ? str.charAt(i21) : (char) 0;
                        if (charAt2 <= 56319) {
                            if (56320 <= charAt3 && charAt3 <= 57343) {
                                int i22 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                                v i110 = i1(4);
                                byte[] bArr4 = i110.f9650a;
                                int i23 = i110.f9652c;
                                bArr4[i23] = (byte) ((i22 >> 18) | 240);
                                bArr4[i23 + 1] = (byte) (((i22 >> 12) & 63) | 128);
                                bArr4[i23 + 2] = (byte) (((i22 >> 6) & 63) | 128);
                                bArr4[i23 + 3] = (byte) ((i22 & 63) | 128);
                                i110.f9652c = i23 + 4;
                                c1(e1() + 4);
                                i10 += 2;
                            }
                        }
                        i0(63);
                        i10 = i21;
                    }
                    c1(e12 + j10);
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(hc.t.l("beginIndex < 0: ", Integer.valueOf(i10)).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
        c1(e1() - r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (r6 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
        if (r5 >= r14) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
        if (e1() == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
        if (r6 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + eg.f0.h(M(0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
        if (r6 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
        return r8;
     */
    @Override // eg.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long v0() {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.c.v0():long");
    }

    public c v1(int i10) {
        long e12;
        long j10;
        if (i10 < 128) {
            i0(i10);
        } else {
            if (i10 < 2048) {
                v i12 = i1(2);
                byte[] bArr = i12.f9650a;
                int i11 = i12.f9652c;
                bArr[i11] = (byte) ((i10 >> 6) | 192);
                bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
                i12.f9652c = i11 + 2;
                e12 = e1();
                j10 = 2;
            } else {
                boolean z10 = false;
                if (55296 <= i10 && i10 <= 57343) {
                    z10 = true;
                }
                if (z10) {
                    i0(63);
                } else if (i10 < 65536) {
                    v i13 = i1(3);
                    byte[] bArr2 = i13.f9650a;
                    int i14 = i13.f9652c;
                    bArr2[i14] = (byte) ((i10 >> 12) | 224);
                    bArr2[i14 + 1] = (byte) (((i10 >> 6) & 63) | 128);
                    bArr2[i14 + 2] = (byte) ((i10 & 63) | 128);
                    i13.f9652c = i14 + 3;
                    e12 = e1();
                    j10 = 3;
                } else if (i10 > 1114111) {
                    throw new IllegalArgumentException(hc.t.l("Unexpected code point: 0x", f0.i(i10)));
                } else {
                    v i15 = i1(4);
                    byte[] bArr3 = i15.f9650a;
                    int i16 = i15.f9652c;
                    bArr3[i16] = (byte) ((i10 >> 18) | 240);
                    bArr3[i16 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                    bArr3[i16 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                    bArr3[i16 + 3] = (byte) ((i10 & 63) | 128);
                    i15.f9652c = i16 + 4;
                    e12 = e1();
                    j10 = 4;
                }
            }
            c1(e12 + j10);
        }
        return this;
    }

    public f w0() {
        return F(e1());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        hc.t.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            v i12 = i1(1);
            int min = Math.min(i10, 8192 - i12.f9652c);
            byteBuffer.get(i12.f9650a, i12.f9652c, min);
            i10 -= min;
            i12.f9652c += min;
        }
        this.f9601d += remaining;
        return remaining;
    }

    @Override // eg.e
    public String y0(long j10) {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            byte b10 = (byte) 10;
            long V = V(b10, 0L, j11);
            if (V != -1) {
                return fg.a.d(this, V);
            }
            if (j11 < e1() && M(j11 - 1) == ((byte) 13) && M(j11) == b10) {
                return fg.a.d(this, j11);
            }
            c cVar = new c();
            j(cVar, 0L, Math.min(32, e1()));
            throw new EOFException("\\n not found: limit=" + Math.min(e1(), j10) + " content=" + cVar.w0().x() + (char) 8230);
        }
        throw new IllegalArgumentException(hc.t.l("limit < 0: ", Long.valueOf(j10)).toString());
    }

    public int z0() {
        return f0.f(readInt());
    }
}
