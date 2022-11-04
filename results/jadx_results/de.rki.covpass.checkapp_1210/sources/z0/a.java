package z0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes.dex */
public class a {
    private static SimpleDateFormat T;
    private static SimpleDateFormat U;
    private static final d[] Y;
    private static final d[] Z;

    /* renamed from: a0 */
    private static final d[] f26372a0;

    /* renamed from: b0 */
    private static final d[] f26373b0;

    /* renamed from: c0 */
    private static final d[] f26374c0;

    /* renamed from: e0 */
    private static final d[] f26376e0;

    /* renamed from: f0 */
    private static final d[] f26377f0;

    /* renamed from: g0 */
    private static final d[] f26378g0;

    /* renamed from: h0 */
    private static final d[] f26379h0;

    /* renamed from: i0 */
    static final d[][] f26380i0;

    /* renamed from: m0 */
    private static final HashMap<Integer, d>[] f26384m0;

    /* renamed from: n0 */
    private static final HashMap<String, d>[] f26385n0;

    /* renamed from: q0 */
    static final Charset f26388q0;

    /* renamed from: r0 */
    static final byte[] f26389r0;

    /* renamed from: s0 */
    private static final byte[] f26390s0;

    /* renamed from: t0 */
    private static final Pattern f26391t0;

    /* renamed from: u0 */
    private static final Pattern f26393u0;

    /* renamed from: v0 */
    private static final Pattern f26395v0;

    /* renamed from: w0 */
    private static final Pattern f26397w0;

    /* renamed from: a */
    private String f26401a;

    /* renamed from: b */
    private FileDescriptor f26402b;

    /* renamed from: c */
    private AssetManager.AssetInputStream f26403c;

    /* renamed from: d */
    private int f26404d;

    /* renamed from: e */
    private boolean f26405e;

    /* renamed from: f */
    private final HashMap<String, c>[] f26406f;

    /* renamed from: g */
    private Set<Integer> f26407g;

    /* renamed from: h */
    private ByteOrder f26408h;

    /* renamed from: i */
    private boolean f26409i;

    /* renamed from: j */
    private boolean f26410j;

    /* renamed from: k */
    private boolean f26411k;

    /* renamed from: l */
    private int f26412l;

    /* renamed from: m */
    private int f26413m;

    /* renamed from: n */
    private byte[] f26414n;

    /* renamed from: o */
    private int f26415o;

    /* renamed from: p */
    private int f26416p;

    /* renamed from: q */
    private int f26417q;

    /* renamed from: r */
    private int f26418r;

    /* renamed from: s */
    private int f26419s;

    /* renamed from: t */
    private boolean f26420t;

    /* renamed from: u */
    private static final boolean f26392u = Log.isLoggable("ExifInterface", 3);

    /* renamed from: v */
    private static final List<Integer> f26394v = Arrays.asList(1, 6, 3, 8);

    /* renamed from: w */
    private static final List<Integer> f26396w = Arrays.asList(2, 7, 4, 5);

    /* renamed from: x */
    public static final int[] f26398x = {8, 8, 8};

    /* renamed from: y */
    public static final int[] f26399y = {4};

    /* renamed from: z */
    public static final int[] f26400z = {8};
    static final byte[] A = {-1, -40, -1};
    private static final byte[] B = {102, 116, 121, 112};
    private static final byte[] C = {109, 105, 102, 49};
    private static final byte[] D = {104, 101, 105, 99};
    private static final byte[] E = {79, 76, 89, 77, 80, 0};
    private static final byte[] F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] G = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] H = {101, 88, 73, 102};
    private static final byte[] I = {73, 72, 68, 82};
    private static final byte[] J = {73, 69, 78, 68};
    private static final byte[] K = {82, 73, 70, 70};
    private static final byte[] L = {87, 69, 66, 80};
    private static final byte[] M = {69, 88, 73, 70};
    private static final byte[] N = {-99, 1, 42};
    private static final byte[] O = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] P = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] Q = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] R = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] S = "ANMF".getBytes(Charset.defaultCharset());
    static final String[] V = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: d0 */
    private static final d f26375d0 = new d("StripOffsets", 273, 3);

    /* renamed from: j0 */
    private static final d[] f26381j0 = {new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: k0 */
    private static final d f26382k0 = new d("JPEGInterchangeFormat", 513, 4);

    /* renamed from: l0 */
    private static final d f26383l0 = new d("JPEGInterchangeFormatLength", 514, 4);

    /* renamed from: o0 */
    private static final HashSet<String> f26386o0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));

    /* renamed from: p0 */
    private static final HashMap<Integer, Integer> f26387p0 = new HashMap<>();

    /* renamed from: z0.a$a */
    /* loaded from: classes.dex */
    public class C0465a extends MediaDataSource {

        /* renamed from: c */
        long f26421c;

        /* renamed from: d */
        final /* synthetic */ b f26422d;

        C0465a(b bVar) {
            a.this = r1;
            this.f26422d = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f26421c;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f26422d.available()) {
                        return -1;
                    }
                    this.f26422d.h(j10);
                    this.f26421c = j10;
                }
                if (i11 > this.f26422d.available()) {
                    i11 = this.f26422d.available();
                }
                int read = this.f26422d.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f26421c += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f26421c = -1L;
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: c */
        private DataInputStream f26425c;

        /* renamed from: d */
        private ByteOrder f26426d;

        /* renamed from: q */
        final int f26427q;

        /* renamed from: x */
        int f26428x;

        /* renamed from: y */
        private static final ByteOrder f26424y = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder U3 = ByteOrder.BIG_ENDIAN;

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.f26426d = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f26425c = dataInputStream;
            int available = dataInputStream.available();
            this.f26427q = available;
            this.f26428x = 0;
            this.f26425c.mark(available);
            this.f26426d = byteOrder;
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f26425c.available();
        }

        public int b() {
            return this.f26427q;
        }

        public int e() {
            return this.f26428x;
        }

        public long f() {
            return readInt() & 4294967295L;
        }

        public void h(long j10) {
            int i10 = this.f26428x;
            if (i10 > j10) {
                this.f26428x = 0;
                this.f26425c.reset();
                this.f26425c.mark(this.f26427q);
            } else {
                j10 -= i10;
            }
            int i11 = (int) j10;
            if (skipBytes(i11) == i11) {
                return;
            }
            throw new IOException("Couldn't seek up to the byteCount");
        }

        public void i(ByteOrder byteOrder) {
            this.f26426d = byteOrder;
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i10) {
            this.f26425c.mark(i10);
        }

        @Override // java.io.InputStream
        public int read() {
            this.f26428x++;
            return this.f26425c.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int read = this.f26425c.read(bArr, i10, i11);
            this.f26428x += read;
            return read;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f26428x++;
            return this.f26425c.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            int i10 = this.f26428x + 1;
            this.f26428x = i10;
            if (i10 <= this.f26427q) {
                int read = this.f26425c.read();
                if (read < 0) {
                    throw new EOFException();
                }
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f26428x += 2;
            return this.f26425c.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            int length = this.f26428x + bArr.length;
            this.f26428x = length;
            if (length <= this.f26427q) {
                if (this.f26425c.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) {
            int i12 = this.f26428x + i11;
            this.f26428x = i12;
            if (i12 <= this.f26427q) {
                if (this.f26425c.read(bArr, i10, i11) != i11) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int readInt() {
            int i10 = this.f26428x + 4;
            this.f26428x = i10;
            if (i10 <= this.f26427q) {
                int read = this.f26425c.read();
                int read2 = this.f26425c.read();
                int read3 = this.f26425c.read();
                int read4 = this.f26425c.read();
                if ((read | read2 | read3 | read4) < 0) {
                    throw new EOFException();
                }
                ByteOrder byteOrder = this.f26426d;
                if (byteOrder == f26424y) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == U3) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f26426d);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            int i10 = this.f26428x + 8;
            this.f26428x = i10;
            if (i10 <= this.f26427q) {
                int read = this.f26425c.read();
                int read2 = this.f26425c.read();
                int read3 = this.f26425c.read();
                int read4 = this.f26425c.read();
                int read5 = this.f26425c.read();
                int read6 = this.f26425c.read();
                int read7 = this.f26425c.read();
                int read8 = this.f26425c.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                    throw new EOFException();
                }
                ByteOrder byteOrder = this.f26426d;
                if (byteOrder == f26424y) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == U3) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.f26426d);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            int i10 = this.f26428x + 2;
            this.f26428x = i10;
            if (i10 <= this.f26427q) {
                int read = this.f26425c.read();
                int read2 = this.f26425c.read();
                if ((read | read2) < 0) {
                    throw new EOFException();
                }
                ByteOrder byteOrder = this.f26426d;
                if (byteOrder == f26424y) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == U3) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f26426d);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f26428x += 2;
            return this.f26425c.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f26428x++;
            return this.f26425c.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            int i10 = this.f26428x + 2;
            this.f26428x = i10;
            if (i10 <= this.f26427q) {
                int read = this.f26425c.read();
                int read2 = this.f26425c.read();
                if ((read | read2) < 0) {
                    throw new EOFException();
                }
                ByteOrder byteOrder = this.f26426d;
                if (byteOrder == f26424y) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == U3) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f26426d);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            int min = Math.min(i10, this.f26427q - this.f26428x);
            int i11 = 0;
            while (i11 < min) {
                i11 += this.f26425c.skipBytes(min - i11);
            }
            this.f26428x += i11;
            return i11;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final int f26429a;

        /* renamed from: b */
        public final int f26430b;

        /* renamed from: c */
        public final long f26431c;

        /* renamed from: d */
        public final byte[] f26432d;

        c(int i10, int i11, long j10, byte[] bArr) {
            this.f26429a = i10;
            this.f26430b = i11;
            this.f26431c = j10;
            this.f26432d = bArr;
        }

        c(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f26388q0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.W[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new c(4, jArr.length, wrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.W[5] * eVarArr.length]);
            wrap.order(byteOrder);
            for (e eVar : eVarArr) {
                wrap.putInt((int) eVar.f26437a);
                wrap.putInt((int) eVar.f26438b);
            }
            return new c(5, eVarArr.length, wrap.array());
        }

        public static c f(int i10, ByteOrder byteOrder) {
            return g(new int[]{i10}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.W[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new c(3, iArr.length, wrap.array());
        }

        public double h(ByteOrder byteOrder) {
            Object k10 = k(byteOrder);
            if (k10 != null) {
                if (k10 instanceof String) {
                    return Double.parseDouble((String) k10);
                }
                if (k10 instanceof long[]) {
                    long[] jArr = (long[]) k10;
                    if (jArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return jArr[0];
                } else if (k10 instanceof int[]) {
                    int[] iArr = (int[]) k10;
                    if (iArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return iArr[0];
                } else if (k10 instanceof double[]) {
                    double[] dArr = (double[]) k10;
                    if (dArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return dArr[0];
                } else if (!(k10 instanceof e[])) {
                    throw new NumberFormatException("Couldn't find a double value");
                } else {
                    e[] eVarArr = (e[]) k10;
                    if (eVarArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return eVarArr[0].a();
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int i(ByteOrder byteOrder) {
            Object k10 = k(byteOrder);
            if (k10 != null) {
                if (k10 instanceof String) {
                    return Integer.parseInt((String) k10);
                }
                if (k10 instanceof long[]) {
                    long[] jArr = (long[]) k10;
                    if (jArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return (int) jArr[0];
                } else if (!(k10 instanceof int[])) {
                    throw new NumberFormatException("Couldn't find a integer value");
                } else {
                    int[] iArr = (int[]) k10;
                    if (iArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return iArr[0];
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String j(ByteOrder byteOrder) {
            Object k10 = k(byteOrder);
            if (k10 == null) {
                return null;
            }
            if (k10 instanceof String) {
                return (String) k10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (k10 instanceof long[]) {
                long[] jArr = (long[]) k10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (k10 instanceof int[]) {
                int[] iArr = (int[]) k10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (k10 instanceof double[]) {
                double[] dArr = (double[]) k10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (!(k10 instanceof e[])) {
                return null;
            } else {
                e[] eVarArr = (e[]) k10;
                while (i10 < eVarArr.length) {
                    sb2.append(eVarArr[i10].f26437a);
                    sb2.append('/');
                    sb2.append(eVarArr[i10].f26438b);
                    i10++;
                    if (i10 != eVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019c: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:137:0x019c */
        /* JADX WARN: Removed duplicated region for block: B:160:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object k(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.a.c.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + a.V[this.f26429a] + ", data length:" + this.f26432d.length + ")";
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final int f26433a;

        /* renamed from: b */
        public final String f26434b;

        /* renamed from: c */
        public final int f26435c;

        /* renamed from: d */
        public final int f26436d;

        d(String str, int i10, int i11) {
            this.f26434b = str;
            this.f26433a = i10;
            this.f26435c = i11;
            this.f26436d = -1;
        }

        d(String str, int i10, int i11, int i12) {
            this.f26434b = str;
            this.f26433a = i10;
            this.f26435c = i11;
            this.f26436d = i12;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f26435c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f26436d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public final long f26437a;

        /* renamed from: b */
        public final long f26438b;

        e(long j10, long j11) {
            if (j11 == 0) {
                this.f26437a = 0L;
                this.f26438b = 1L;
                return;
            }
            this.f26437a = j10;
            this.f26438b = j11;
        }

        public double a() {
            return this.f26437a / this.f26438b;
        }

        public String toString() {
            return this.f26437a + "/" + this.f26438b;
        }
    }

    static {
        d[] dVarArr;
        d[] dVarArr2 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        Y = dVarArr2;
        d[] dVarArr3 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        Z = dVarArr3;
        d[] dVarArr4 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f26372a0 = dVarArr4;
        d[] dVarArr5 = {new d("InteroperabilityIndex", 1, 2)};
        f26373b0 = dVarArr5;
        d[] dVarArr6 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f26374c0 = dVarArr6;
        d[] dVarArr7 = {new d("ThumbnailImage", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f26376e0 = dVarArr7;
        d[] dVarArr8 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f26377f0 = dVarArr8;
        d[] dVarArr9 = {new d("AspectFrame", 4371, 3)};
        f26378g0 = dVarArr9;
        d[] dVarArr10 = {new d("ColorSpace", 55, 3)};
        f26379h0 = dVarArr10;
        d[][] dVarArr11 = {dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr6, dVarArr2, dVarArr7, dVarArr8, dVarArr9, dVarArr10};
        f26380i0 = dVarArr11;
        f26384m0 = new HashMap[dVarArr11.length];
        f26385n0 = new HashMap[dVarArr11.length];
        Charset forName = Charset.forName("US-ASCII");
        f26388q0 = forName;
        f26389r0 = "Exif\u0000\u0000".getBytes(forName);
        f26390s0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        T = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr12 = f26380i0;
            if (i10 >= dVarArr12.length) {
                HashMap<Integer, Integer> hashMap = f26387p0;
                d[] dVarArr13 = f26381j0;
                hashMap.put(Integer.valueOf(dVarArr13[0].f26433a), 5);
                hashMap.put(Integer.valueOf(dVarArr13[1].f26433a), 1);
                hashMap.put(Integer.valueOf(dVarArr13[2].f26433a), 2);
                hashMap.put(Integer.valueOf(dVarArr13[3].f26433a), 3);
                hashMap.put(Integer.valueOf(dVarArr13[4].f26433a), 7);
                hashMap.put(Integer.valueOf(dVarArr13[5].f26433a), 8);
                f26391t0 = Pattern.compile(".*[1-9].*");
                f26393u0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f26395v0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f26397w0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f26384m0[i10] = new HashMap<>();
            f26385n0[i10] = new HashMap<>();
            for (d dVar : dVarArr12[i10]) {
                f26384m0[i10].put(Integer.valueOf(dVar.f26433a), dVar);
                f26385n0[i10].put(dVar.f26434b, dVar);
            }
            i10++;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public a(InputStream inputStream, int i10) {
        d[][] dVarArr = f26380i0;
        this.f26406f = new HashMap[dVarArr.length];
        this.f26407g = new HashSet(dVarArr.length);
        this.f26408h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.f26401a = null;
        if (i10 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            if (!w(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f26405e = true;
            this.f26403c = null;
            this.f26402b = null;
            inputStream = bufferedInputStream;
        } else {
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f26403c = (AssetManager.AssetInputStream) inputStream;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (D(fileInputStream.getFD())) {
                        this.f26403c = null;
                        this.f26402b = fileInputStream.getFD();
                    }
                }
                this.f26403c = null;
            }
            this.f26402b = null;
        }
        H(inputStream);
    }

    private boolean A(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = G;
            if (i10 < bArr2.length) {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    private boolean B(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean C(byte[] bArr) {
        Throwable th2;
        boolean z10 = false;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder K2 = K(bVar2);
                this.f26408h = K2;
                bVar2.i(K2);
                if (bVar2.readShort() == 85) {
                    z10 = true;
                }
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th2;
            }
        } catch (Exception unused2) {
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private static boolean D(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f26392u) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean E(HashMap hashMap) {
        c cVar;
        int i10;
        c cVar2 = (c) hashMap.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.k(this.f26408h);
            int[] iArr2 = f26398x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f26404d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((i10 = cVar.i(this.f26408h)) == 1 && Arrays.equals(iArr, f26400z)) || (i10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (f26392u) {
            Log.d("ExifInterface", "Unsupported data type value");
            return false;
        }
        return false;
    }

    private boolean F(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.f26408h) <= 512 && cVar2.i(this.f26408h) <= 512;
    }

    private boolean G(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = K;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = L;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[K.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else if (bArr[i10] != bArr2[i10]) {
                return false;
            } else {
                i10++;
            }
        }
    }

    private void H(InputStream inputStream) {
        boolean z10;
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        for (int i10 = 0; i10 < f26380i0.length; i10++) {
            try {
                try {
                    this.f26406f[i10] = new HashMap<>();
                } catch (IOException e10) {
                    boolean z11 = f26392u;
                    if (z11) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    a();
                    if (!z11) {
                        return;
                    }
                }
            } finally {
                a();
                if (f26392u) {
                    J();
                }
            }
        }
        if (!this.f26405e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f26404d = m(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        b bVar = new b(inputStream);
        if (!this.f26405e) {
            switch (this.f26404d) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    q(bVar);
                    break;
                case 4:
                    k(bVar, 0, 0);
                    a();
                    if (!f26392u) {
                        return;
                    }
                    J();
                    return;
                case 7:
                    n(bVar);
                    break;
                case 9:
                    p(bVar);
                    a();
                    if (!f26392u) {
                        return;
                    }
                    J();
                    return;
                case 10:
                    r(bVar);
                    a();
                    if (!f26392u) {
                        return;
                    }
                    J();
                    return;
                case 12:
                    j(bVar);
                    break;
                case 13:
                    o(bVar);
                    a();
                    if (!f26392u) {
                        return;
                    }
                    J();
                    return;
                case 14:
                    t(bVar);
                    if (!z10) {
                        return;
                    }
                    return;
            }
        } else {
            s(bVar);
        }
        bVar.h(this.f26416p);
        O(bVar);
        a();
        if (!f26392u) {
            return;
        }
        J();
    }

    private void I(b bVar, int i10) {
        ByteOrder K2 = K(bVar);
        this.f26408h = K2;
        bVar.i(K2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i11 = this.f26404d;
        if (i11 != 7 && i11 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8 || readInt >= i10) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i12 = readInt - 8;
        if (i12 <= 0 || bVar.skipBytes(i12) == i12) {
            return;
        }
        throw new IOException("Couldn't jump to first Ifd: " + i12);
    }

    private void J() {
        for (int i10 = 0; i10 < this.f26406f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f26406f[i10].size());
            for (Map.Entry<String, c> entry : this.f26406f[i10].entrySet()) {
                c value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.j(this.f26408h) + "'");
            }
        }
    }

    private ByteOrder K(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f26392u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f26392u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    private void L(byte[] bArr, int i10) {
        b bVar = new b(bArr);
        I(bVar, bArr.length);
        M(bVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void M(z0.a.b r30, int r31) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.a.M(z0.a$b, int):void");
    }

    private void N(b bVar, int i10) {
        c cVar = this.f26406f[i10].get("ImageLength");
        c cVar2 = this.f26406f[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = this.f26406f[i10].get("JPEGInterchangeFormat");
            c cVar4 = this.f26406f[i10].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int i11 = cVar3.i(this.f26408h);
            int i12 = cVar3.i(this.f26408h);
            bVar.h(i11);
            byte[] bArr = new byte[i12];
            bVar.read(bArr);
            k(new b(bArr), i11, i10);
        }
    }

    private void O(b bVar) {
        HashMap<String, c> hashMap = this.f26406f[4];
        c cVar = hashMap.get("Compression");
        if (cVar != null) {
            int i10 = cVar.i(this.f26408h);
            this.f26415o = i10;
            if (i10 != 1) {
                if (i10 != 6) {
                    if (i10 != 7) {
                        return;
                    }
                }
            }
            if (!E(hashMap)) {
                return;
            }
            v(bVar, hashMap);
            return;
        }
        this.f26415o = 6;
        u(bVar, hashMap);
    }

    private static boolean P(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private void Q(int i10, int i11) {
        String str;
        if (this.f26406f[i10].isEmpty() || this.f26406f[i11].isEmpty()) {
            if (!f26392u) {
                return;
            }
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
            return;
        }
        c cVar = this.f26406f[i10].get("ImageLength");
        c cVar2 = this.f26406f[i10].get("ImageWidth");
        c cVar3 = this.f26406f[i11].get("ImageLength");
        c cVar4 = this.f26406f[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (!f26392u) {
                return;
            }
            str = "First image does not contain valid size information";
        } else if (cVar3 != null && cVar4 != null) {
            int i12 = cVar.i(this.f26408h);
            int i13 = cVar2.i(this.f26408h);
            int i14 = cVar3.i(this.f26408h);
            int i15 = cVar4.i(this.f26408h);
            if (i12 >= i14 || i13 >= i15) {
                return;
            }
            HashMap<String, c>[] hashMapArr = this.f26406f;
            HashMap<String, c> hashMap = hashMapArr[i10];
            hashMapArr[i10] = hashMapArr[i11];
            hashMapArr[i11] = hashMap;
            return;
        } else if (!f26392u) {
            return;
        } else {
            str = "Second image does not contain valid size information";
        }
        Log.d("ExifInterface", str);
    }

    private void R(b bVar, int i10) {
        c cVar;
        c cVar2;
        StringBuilder sb2;
        String arrays;
        c cVar3 = this.f26406f[i10].get("DefaultCropSize");
        c cVar4 = this.f26406f[i10].get("SensorTopBorder");
        c cVar5 = this.f26406f[i10].get("SensorLeftBorder");
        c cVar6 = this.f26406f[i10].get("SensorBottomBorder");
        c cVar7 = this.f26406f[i10].get("SensorRightBorder");
        if (cVar3 == null) {
            if (cVar4 == null || cVar5 == null || cVar6 == null || cVar7 == null) {
                N(bVar, i10);
                return;
            }
            int i11 = cVar4.i(this.f26408h);
            int i12 = cVar6.i(this.f26408h);
            int i13 = cVar7.i(this.f26408h);
            int i14 = cVar5.i(this.f26408h);
            if (i12 <= i11 || i13 <= i14) {
                return;
            }
            c f10 = c.f(i12 - i11, this.f26408h);
            c f11 = c.f(i13 - i14, this.f26408h);
            this.f26406f[i10].put("ImageLength", f10);
            this.f26406f[i10].put("ImageWidth", f11);
        } else if (cVar3.f26429a == 5) {
            e[] eVarArr = (e[]) cVar3.k(this.f26408h);
            if (eVarArr != null && eVarArr.length == 2) {
                cVar2 = c.d(eVarArr[0], this.f26408h);
                cVar = c.d(eVarArr[1], this.f26408h);
                this.f26406f[i10].put("ImageWidth", cVar2);
                this.f26406f[i10].put("ImageLength", cVar);
                return;
            }
            sb2 = new StringBuilder();
            sb2.append("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(eVarArr);
            sb2.append(arrays);
            Log.w("ExifInterface", sb2.toString());
        } else {
            int[] iArr = (int[]) cVar3.k(this.f26408h);
            if (iArr != null && iArr.length == 2) {
                cVar2 = c.f(iArr[0], this.f26408h);
                cVar = c.f(iArr[1], this.f26408h);
                this.f26406f[i10].put("ImageWidth", cVar2);
                this.f26406f[i10].put("ImageLength", cVar);
                return;
            }
            sb2 = new StringBuilder();
            sb2.append("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(iArr);
            sb2.append(arrays);
            Log.w("ExifInterface", sb2.toString());
        }
    }

    private void S() {
        Q(0, 5);
        Q(0, 4);
        Q(5, 4);
        c cVar = this.f26406f[1].get("PixelXDimension");
        c cVar2 = this.f26406f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f26406f[0].put("ImageWidth", cVar);
            this.f26406f[0].put("ImageLength", cVar2);
        }
        if (this.f26406f[4].isEmpty() && F(this.f26406f[5])) {
            HashMap<String, c>[] hashMapArr = this.f26406f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!F(this.f26406f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    private void a() {
        String f10 = f("DateTimeOriginal");
        if (f10 != null && f("DateTime") == null) {
            this.f26406f[0].put("DateTime", c.a(f10));
        }
        if (f("ImageWidth") == null) {
            this.f26406f[0].put("ImageWidth", c.b(0L, this.f26408h));
        }
        if (f("ImageLength") == null) {
            this.f26406f[0].put("ImageLength", c.b(0L, this.f26408h));
        }
        if (f("Orientation") == null) {
            this.f26406f[0].put("Orientation", c.b(0L, this.f26408h));
        }
        if (f("LightSource") == null) {
            this.f26406f[1].put("LightSource", c.b(0L, this.f26408h));
        }
    }

    private static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i10])));
        }
        return sb2.toString();
    }

    private static double c(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble;
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private static long[] d(Object obj) {
        if (!(obj instanceof int[])) {
            if (!(obj instanceof long[])) {
                return null;
            }
            return (long[]) obj;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    private c i(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (f26392u) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f26380i0.length; i10++) {
            c cVar = this.f26406f[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    private void j(b bVar) {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C0465a(bVar));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            String str3 = null;
            if ("yes".equals(extractMetadata3)) {
                str3 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str3 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str2 = null;
                str = null;
            }
            if (str3 != null) {
                this.f26406f[0].put("ImageWidth", c.f(Integer.parseInt(str3), this.f26408h));
            }
            if (str2 != null) {
                this.f26406f[0].put("ImageLength", c.f(Integer.parseInt(str2), this.f26408h));
            }
            if (str != null) {
                int i10 = 1;
                int parseInt = Integer.parseInt(str);
                if (parseInt == 90) {
                    i10 = 6;
                } else if (parseInt == 180) {
                    i10 = 3;
                } else if (parseInt == 270) {
                    i10 = 8;
                }
                this.f26406f[0].put("Orientation", c.f(i10, this.f26408h));
            }
            if (extractMetadata != null && extractMetadata2 != null) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                bVar.h(parseInt2);
                byte[] bArr = new byte[6];
                if (bVar.read(bArr) != 6) {
                    throw new IOException("Can't read identifier");
                }
                int i11 = parseInt2 + 6;
                int i12 = parseInt3 - 6;
                if (!Arrays.equals(bArr, f26389r0)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] bArr2 = new byte[i12];
                if (bVar.read(bArr2) != i12) {
                    throw new IOException("Can't read exif");
                }
                this.f26416p = i11;
                L(bArr2, 0);
            }
            if (f26392u) {
                Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str2 + ", rotation " + str);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a6, code lost:
        r22.i(r21.f26408h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ab, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k(z0.a.b r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.a.k(z0.a$b, int, int):void");
    }

    private int m(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (y(bArr)) {
            return 4;
        }
        if (B(bArr)) {
            return 9;
        }
        if (x(bArr)) {
            return 12;
        }
        if (z(bArr)) {
            return 7;
        }
        if (C(bArr)) {
            return 10;
        }
        if (A(bArr)) {
            return 13;
        }
        return G(bArr) ? 14 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n(z0.a.b r7) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.a.n(z0.a$b):void");
    }

    private void o(b bVar) {
        if (f26392u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.i(ByteOrder.BIG_ENDIAN);
        byte[] bArr = G;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i11 = i10 + 4;
                if (i11 == 16 && !Arrays.equals(bArr2, I)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, J)) {
                    return;
                }
                if (Arrays.equals(bArr2, H)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f26416p = i11;
                        L(bArr3, 0);
                        S();
                        O(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i12 = readInt + 4;
                bVar.skipBytes(i12);
                length = i11 + i12;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void p(b bVar) {
        boolean z10 = f26392u;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.h(i10);
        bVar.read(bArr4);
        k(new b(bArr4), i10, 5);
        bVar.h(i12);
        bVar.i(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f26375d0.f26433a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c f10 = c.f(readShort, this.f26408h);
                c f11 = c.f(readShort2, this.f26408h);
                this.f26406f[0].put("ImageLength", f10);
                this.f26406f[0].put("ImageWidth", f11);
                if (!f26392u) {
                    return;
                }
                Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    private void q(b bVar) {
        c cVar;
        I(bVar, bVar.available());
        M(bVar, 0);
        R(bVar, 0);
        R(bVar, 5);
        R(bVar, 4);
        S();
        if (this.f26404d != 8 || (cVar = this.f26406f[1].get("MakerNote")) == null) {
            return;
        }
        b bVar2 = new b(cVar.f26432d);
        bVar2.i(this.f26408h);
        bVar2.h(6L);
        M(bVar2, 9);
        c cVar2 = this.f26406f[9].get("ColorSpace");
        if (cVar2 == null) {
            return;
        }
        this.f26406f[1].put("ColorSpace", cVar2);
    }

    private void r(b bVar) {
        if (f26392u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + bVar);
        }
        q(bVar);
        c cVar = this.f26406f[0].get("JpgFromRaw");
        if (cVar != null) {
            k(new b(cVar.f26432d), (int) cVar.f26431c, 5);
        }
        c cVar2 = this.f26406f[0].get("ISO");
        c cVar3 = this.f26406f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f26406f[1].put("PhotographicSensitivity", cVar2);
    }

    private void s(b bVar) {
        byte[] bArr = f26389r0;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f26416p = bArr.length;
        L(bArr2, 0);
    }

    private void t(b bVar) {
        if (f26392u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.i(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(K.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(L.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i10 = skipBytes + 4 + 4;
                if (Arrays.equals(M, bArr)) {
                    byte[] bArr2 = new byte[readInt2];
                    if (bVar.read(bArr2) == readInt2) {
                        this.f26416p = i10;
                        L(bArr2, 0);
                        O(new b(bArr2));
                        return;
                    }
                    throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                int i11 = i10 + readInt2;
                if (i11 == readInt) {
                    return;
                }
                if (i11 > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                int skipBytes2 = bVar.skipBytes(readInt2);
                if (skipBytes2 != readInt2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                skipBytes = i10 + skipBytes2;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void u(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i10 = cVar.i(this.f26408h);
        int i11 = cVar2.i(this.f26408h);
        if (this.f26404d == 7) {
            i10 += this.f26417q;
        }
        int min = Math.min(i11, bVar.b() - i10);
        if (i10 > 0 && min > 0) {
            this.f26409i = true;
            if (this.f26401a == null && this.f26403c == null && this.f26402b == null) {
                byte[] bArr = new byte[min];
                bVar.skip(i10);
                bVar.read(bArr);
                this.f26414n = bArr;
            }
            this.f26412l = i10;
            this.f26413m = min;
        }
        if (!f26392u) {
            return;
        }
        Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i10 + ", length: " + min);
    }

    private void v(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("StripOffsets");
        c cVar2 = (c) hashMap.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] d10 = d(cVar.k(this.f26408h));
        long[] d11 = d(cVar2.k(this.f26408h));
        if (d10 == null || d10.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
        } else if (d11 == null || d11.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
        } else if (d10.length != d11.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
        } else {
            long j10 = 0;
            for (long j11 : d11) {
                j10 += j11;
            }
            int i10 = (int) j10;
            byte[] bArr = new byte[i10];
            this.f26411k = true;
            this.f26410j = true;
            this.f26409i = true;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < d10.length; i13++) {
                int i14 = (int) d10[i13];
                int i15 = (int) d11[i13];
                if (i13 < d10.length - 1 && i14 + i15 != d10[i13 + 1]) {
                    this.f26411k = false;
                }
                int i16 = i14 - i11;
                if (i16 < 0) {
                    Log.d("ExifInterface", "Invalid strip offset value");
                    return;
                }
                long j12 = i16;
                if (bVar.skip(j12) != j12) {
                    Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                    return;
                }
                int i17 = i11 + i16;
                byte[] bArr2 = new byte[i15];
                if (bVar.read(bArr2) != i15) {
                    Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                    return;
                }
                i11 = i17 + i15;
                System.arraycopy(bArr2, 0, bArr, i12, i15);
                i12 += i15;
            }
            this.f26414n = bArr;
            if (!this.f26411k) {
                return;
            }
            this.f26412l = (int) d10[0];
            this.f26413m = i10;
        }
    }

    private static boolean w(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f26389r0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f26389r0;
            if (i10 < bArr3.length) {
                if (bArr2[i10] != bArr3[i10]) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    private boolean x(byte[] bArr) {
        Throwable th2;
        Exception e10;
        b bVar;
        long readInt;
        byte[] bArr2;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e11) {
                e10 = e11;
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.read(bArr2);
        } catch (Exception e12) {
            e10 = e12;
            bVar2 = bVar;
            if (f26392u) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e10);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th4) {
            th2 = th4;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th2;
        }
        if (!Arrays.equals(bArr2, B)) {
            bVar.close();
            return false;
        }
        long j10 = 16;
        if (readInt == 1) {
            readInt = bVar.readLong();
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j10 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j11 = readInt - j10;
        if (j11 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z10 = false;
        boolean z11 = false;
        for (long j12 = 0; j12 < j11 / 4; j12++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j12 != 1) {
                if (Arrays.equals(bArr3, C)) {
                    z10 = true;
                } else if (Arrays.equals(bArr3, D)) {
                    z11 = true;
                }
                if (z10 && z11) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean y(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = A;
            if (i10 < bArr2.length) {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    private boolean z(byte[] bArr) {
        Throwable th2;
        boolean z10 = false;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder K2 = K(bVar2);
                this.f26408h = K2;
                bVar2.i(K2);
                short readShort = bVar2.readShort();
                if (readShort == 20306 || readShort == 21330) {
                    z10 = true;
                }
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th2;
            }
        } catch (Exception unused2) {
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public double e(double d10) {
        double g10 = g("GPSAltitude", -1.0d);
        int i10 = -1;
        int h10 = h("GPSAltitudeRef", -1);
        if (g10 < 0.0d || h10 < 0) {
            return d10;
        }
        if (h10 != 1) {
            i10 = 1;
        }
        return g10 * i10;
    }

    public String f(String str) {
        String str2;
        Objects.requireNonNull(str, "tag shouldn't be null");
        c i10 = i(str);
        if (i10 != null) {
            if (!f26386o0.contains(str)) {
                return i10.j(this.f26408h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i11 = i10.f26429a;
                if (i11 == 5 || i11 == 10) {
                    e[] eVarArr = (e[]) i10.k(this.f26408h);
                    if (eVarArr != null && eVarArr.length == 3) {
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) eVarArr[0].f26437a) / ((float) eVarArr[0].f26438b))), Integer.valueOf((int) (((float) eVarArr[1].f26437a) / ((float) eVarArr[1].f26438b))), Integer.valueOf((int) (((float) eVarArr[2].f26437a) / ((float) eVarArr[2].f26438b))));
                    }
                    str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr);
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + i10.f26429a;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(i10.h(this.f26408h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public double g(String str, double d10) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        c i10 = i(str);
        if (i10 == null) {
            return d10;
        }
        try {
            return i10.h(this.f26408h);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    public int h(String str, int i10) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        c i11 = i(str);
        if (i11 == null) {
            return i10;
        }
        try {
            return i11.i(this.f26408h);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public double[] l() {
        String f10 = f("GPSLatitude");
        String f11 = f("GPSLatitudeRef");
        String f12 = f("GPSLongitude");
        String f13 = f("GPSLongitudeRef");
        if (f10 == null || f11 == null || f12 == null || f13 == null) {
            return null;
        }
        try {
            return new double[]{c(f10, f11), c(f12, f13)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", f10, f11, f12, f13));
            return null;
        }
    }
}
