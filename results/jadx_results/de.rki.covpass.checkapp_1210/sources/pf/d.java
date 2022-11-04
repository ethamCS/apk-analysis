package pf;

import bf.k;
import bf.y;
import eg.e;
import eg.f;
import eg.q;
import hc.p0;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import nc.g;
import nc.m;
import of.a0;
import of.b0;
import of.c0;
import of.r;
import of.t;
import of.u;
import of.x;
import org.conscrypt.BuildConfig;
import tb.e0;
import ub.k0;
import ub.q0;
import ub.v;
@Metadata(bv = {}, d1 = {"\u0000à\u0001\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b\u001a-\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010 \u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010!\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010&\u001a\u00020\u0018*\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\n\u0010'\u001a\u00020\u0018*\u00020\u0006\u001a\n\u0010(\u001a\u00020\b*\u00020\u0006\u001a\u000e\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u001a)\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0\f\"\u00020+¢\u0006\u0004\b-\u0010.\u001a \u00102\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u000100\u001a\n\u00103\u001a\u00020\u0018*\u00020$\u001a\u0010\u00107\u001a\u000206*\b\u0012\u0004\u0012\u00020504\u001a\u0010\u00108\u001a\b\u0012\u0004\u0012\u00020504*\u000206\u001a\u0012\u00109\u001a\u00020\b*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014\u001a\n\u0010<\u001a\u00020;*\u00020:\u001a\u0015\u0010?\u001a\u00020\u0018*\u00020=2\u0006\u0010>\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010A\u001a\u00020\u0018*\u00020@2\u0006\u0010>\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u0000*\u00020\u00182\u0006\u0010>\u001a\u00020\u0000H\u0086\u0004\u001a\u0012\u0010E\u001a\u00020\u0004*\u00020C2\u0006\u0010D\u001a\u00020\u0018\u001a\n\u0010G\u001a\u00020\u0018*\u00020F\u001a\u001a\u0010J\u001a\u00020\b*\u00020H2\u0006\u0010/\u001a\u00020\u00182\u0006\u0010I\u001a\u000200\u001a\u001a\u0010L\u001a\u00020\b*\u00020H2\u0006\u0010K\u001a\u00020\u00182\u0006\u0010I\u001a\u000200\u001a\u0012\u0010O\u001a\u00020\b*\u00020M2\u0006\u0010N\u001a\u00020F\u001a\u0012\u0010R\u001a\u00020\u0018*\u00020P2\u0006\u0010Q\u001a\u00020=\u001a\u0014\u0010S\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u001a\n\u0010U\u001a\u00020\u0000*\u00020T\u001a\u0012\u0010W\u001a\u00020\u0000*\u00020\u00062\u0006\u0010V\u001a\u00020\u0000\u001a\u0014\u0010X\u001a\u00020\u0018*\u0004\u0018\u00010\u00062\u0006\u0010V\u001a\u00020\u0018\u001a\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u000004\"\u0004\b\u0000\u0010Y*\b\u0012\u0004\u0012\u00028\u000004\u001a/\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u000004\"\u0004\b\u0000\u0010Y2\u0012\u0010[\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\b\\\u0010]\u001a.\u0010^\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010_\"\u0004\b\u0000\u0010R\"\u0004\b\u0001\u0010^*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010_\u001a\n\u0010a\u001a\u00020\u0004*\u00020`\u001a\n\u0010b\u001a\u00020\u0004*\u00020M\u001a\u0012\u0010f\u001a\u00020\b*\u00020c2\u0006\u0010e\u001a\u00020d\u001a\n\u0010g\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010h\u001a\u00020\u0006*\u00020\u0018\u001a'\u0010k\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000i2\u0006\u0010j\u001a\u00028\u0000H\u0000¢\u0006\u0004\bk\u0010l\u001a \u0010q\u001a\u00020p*\u00060mj\u0002`n2\u0010\u0010o\u001a\f\u0012\b\u0012\u00060mj\u0002`n04¨\u0006r"}, d2 = {BuildConfig.FLAVOR, "arrayLength", "offset", "count", "Ltb/e0;", "l", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "daemon", "Ljava/util/concurrent/ThreadFactory;", "M", BuildConfig.FLAVOR, "other", "Ljava/util/Comparator;", "comparator", "E", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "u", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lof/u;", "includeDefaultPort", "S", "value", BuildConfig.FLAVOR, "x", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "o", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "z", "B", "Y", "delimiters", "q", BuildConfig.FLAVOR, "delimiter", "p", "y", "i", "H", "format", BuildConfig.FLAVOR, "args", "t", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "k", "I", BuildConfig.FLAVOR, "Lwf/c;", "Lof/t;", "P", "O", "j", "Lof/r;", "Lof/r$c;", "g", BuildConfig.FLAVOR, "mask", "d", BuildConfig.FLAVOR, "e", "f", "Leg/d;", "medium", "b0", "Leg/e;", "J", "Leg/a0;", "timeUnit", "L", "timeout", "s", "Ljava/net/Socket;", "source", "G", "Leg/c;", "b", "K", "D", "Lof/b0;", "v", "defaultValue", "W", "X", "T", "U", "elements", "w", "([Ljava/lang/Object;)Ljava/util/List;", "V", BuildConfig.FLAVOR, "Ljava/io/Closeable;", "m", "n", "Lxf/a;", "Ljava/io/File;", "file", "F", "R", "Q", BuildConfig.FLAVOR, "element", "c", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", BuildConfig.FLAVOR, "a0", "okhttp"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    public static final byte[] f19188a;

    /* renamed from: c */
    public static final c0 f19190c;

    /* renamed from: d */
    public static final a0 f19191d;

    /* renamed from: e */
    private static final q f19192e;

    /* renamed from: f */
    public static final TimeZone f19193f;

    /* renamed from: i */
    public static final String f19196i;

    /* renamed from: b */
    public static final t f19189b = t.Companion.g(new String[0]);

    /* renamed from: g */
    private static final k f19194g = new k("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: h */
    public static final boolean f19195h = false;

    static {
        String p02;
        String q02;
        byte[] bArr = new byte[0];
        f19188a = bArr;
        f19190c = c0.a.c(c0.Companion, bArr, null, 1, null);
        f19191d = a0.a.b(a0.Companion, bArr, null, 0, 0, 7, null);
        q.a aVar = q.Companion;
        f.a aVar2 = f.Companion;
        f19192e = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        hc.t.b(timeZone);
        f19193f = timeZone;
        String name = x.class.getName();
        hc.t.d(name, "OkHttpClient::class.java.name");
        p02 = y.p0(name, "okhttp3.");
        q02 = y.q0(p02, "Client");
        f19196i = q02;
    }

    public static /* synthetic */ int A(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return z(str, i10, i11);
    }

    public static final int B(String str, int i10, int i11) {
        hc.t.e(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                int i13 = i12 - 1;
                char charAt = str.charAt(i12);
                boolean z10 = false;
                if ((((charAt == '\t' || charAt == '\n') || charAt == '\f') || charAt == '\r') || charAt == ' ') {
                    z10 = true;
                }
                if (!z10) {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12 = i13;
            }
        }
        return i10;
    }

    public static /* synthetic */ int C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return B(str, i10, i11);
    }

    public static final int D(String str, int i10) {
        hc.t.e(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            int i11 = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != '\t') {
                return i10;
            }
            i10 = i11;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        hc.t.e(strArr, "<this>");
        hc.t.e(strArr2, "other");
        hc.t.e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            i10++;
            int length2 = strArr2.length;
            int i11 = 0;
            while (true) {
                if (i11 < length2) {
                    String str2 = strArr2[i11];
                    i11++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public static final boolean F(xf.a aVar, File file) {
        hc.t.e(aVar, "<this>");
        hc.t.e(file, "file");
        eg.y c10 = aVar.c(file);
        th = null;
        try {
            try {
                aVar.a(file);
                return true;
            } catch (IOException unused) {
                e0 e0Var = e0.f22152a;
                dc.b.a(c10, th);
                aVar.a(file);
                return false;
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } finally {
                dc.b.a(c10, th2);
            }
        }
    }

    public static final boolean G(Socket socket, e eVar) {
        hc.t.e(socket, "<this>");
        hc.t.e(eVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z10 = !eVar.g0();
                socket.setSoTimeout(soTimeout);
                return z10;
            } catch (Throwable th2) {
                socket.setSoTimeout(soTimeout);
                throw th2;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean H(String str) {
        boolean v10;
        boolean v11;
        boolean v12;
        boolean v13;
        hc.t.e(str, "name");
        v10 = bf.x.v(str, "Authorization", true);
        if (!v10) {
            v11 = bf.x.v(str, "Cookie", true);
            if (v11) {
                return true;
            }
            v12 = bf.x.v(str, "Proxy-Authorization", true);
            if (v12) {
                return true;
            }
            v13 = bf.x.v(str, "Set-Cookie", true);
            return v13;
        }
        return true;
    }

    public static final int I(char c10) {
        boolean z10 = true;
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (!('a' <= c10 && c10 < 'g')) {
            c11 = 'A';
            if ('A' > c10 || c10 >= 'G') {
                z10 = false;
            }
            if (!z10) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final int J(e eVar) {
        hc.t.e(eVar, "<this>");
        return d(eVar.readByte(), 255) | (d(eVar.readByte(), 255) << 16) | (d(eVar.readByte(), 255) << 8);
    }

    public static final int K(eg.c cVar, byte b10) {
        hc.t.e(cVar, "<this>");
        int i10 = 0;
        while (!cVar.g0() && cVar.M(0L) == b10) {
            i10++;
            cVar.readByte();
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
        r11.m().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
        r11.m().d(r0 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
        if (r5 != Long.MAX_VALUE) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean L(eg.a0 r11, int r12, java.util.concurrent.TimeUnit r13) {
        /*
            java.lang.String r0 = "<this>"
            hc.t.e(r11, r0)
            java.lang.String r0 = "timeUnit"
            hc.t.e(r13, r0)
            long r0 = java.lang.System.nanoTime()
            eg.b0 r2 = r11.m()
            boolean r2 = r2.e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L27
            eg.b0 r2 = r11.m()
            long r5 = r2.c()
            long r5 = r5 - r0
            goto L28
        L27:
            r5 = r3
        L28:
            eg.b0 r2 = r11.m()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.d(r12)
            eg.c r12 = new eg.c     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L76
            r12.<init>()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L76
        L3e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.g1(r12, r7)     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L76
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L4e
            r12.e()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L76
            goto L3e
        L4e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
        L53:
            eg.b0 r11 = r11.m()
            r11.a()
            goto L7c
        L5b:
            eg.b0 r11 = r11.m()
            long r0 = r0 + r5
            r11.d(r0)
            goto L7c
        L64:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            eg.b0 r11 = r11.m()
            if (r13 != 0) goto L71
            r11.a()
            goto L75
        L71:
            long r0 = r0 + r5
            r11.d(r0)
        L75:
            throw r12
        L76:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
            goto L53
        L7c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.d.L(eg.a0, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final ThreadFactory M(final String str, final boolean z10) {
        hc.t.e(str, "name");
        return new ThreadFactory() { // from class: pf.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread N;
                N = d.N(str, z10, runnable);
                return N;
            }
        };
    }

    public static final Thread N(String str, boolean z10, Runnable runnable) {
        hc.t.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List<wf.c> O(t tVar) {
        g i10;
        int s10;
        hc.t.e(tVar, "<this>");
        i10 = m.i(0, tVar.size());
        s10 = v.s(i10, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<Integer> it = i10.iterator();
        while (it.hasNext()) {
            int b10 = ((k0) it).b();
            arrayList.add(new wf.c(tVar.b(b10), tVar.i(b10)));
        }
        return arrayList;
    }

    public static final t P(List<wf.c> list) {
        hc.t.e(list, "<this>");
        t.a aVar = new t.a();
        for (wf.c cVar : list) {
            aVar.c(cVar.a().e0(), cVar.b().e0());
        }
        return aVar.d();
    }

    public static final String Q(int i10) {
        String hexString = Integer.toHexString(i10);
        hc.t.d(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String R(long j10) {
        String hexString = Long.toHexString(j10);
        hc.t.d(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String S(u uVar, boolean z10) {
        boolean N;
        String str;
        hc.t.e(uVar, "<this>");
        N = y.N(uVar.h(), ":", false, 2, null);
        if (N) {
            str = '[' + uVar.h() + ']';
        } else {
            str = uVar.h();
        }
        if (z10 || uVar.l() != u.Companion.c(uVar.p())) {
            return str + ':' + uVar.l();
        }
        return str;
    }

    public static /* synthetic */ String T(u uVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return S(uVar, z10);
    }

    public static final <T> List<T> U(List<? extends T> list) {
        List H0;
        hc.t.e(list, "<this>");
        H0 = ub.c0.H0(list);
        List<T> unmodifiableList = Collections.unmodifiableList(H0);
        hc.t.d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> V(Map<K, ? extends V> map) {
        Map<K, V> h10;
        hc.t.e(map, "<this>");
        if (map.isEmpty()) {
            h10 = q0.h();
            return h10;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        hc.t.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long W(String str, long j10) {
        hc.t.e(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int X(String str, int i10) {
        Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        if (valueOf == null) {
            return i10;
        }
        long longValue = valueOf.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue >= 0) {
            return (int) longValue;
        }
        return 0;
    }

    public static final String Y(String str, int i10, int i11) {
        hc.t.e(str, "<this>");
        int z10 = z(str, i10, i11);
        String substring = str.substring(z10, B(str, z10, i11));
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String Z(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return Y(str, i10, i11);
    }

    public static final Throwable a0(Exception exc, List<? extends Exception> list) {
        hc.t.e(exc, "<this>");
        hc.t.e(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception exc2 : list) {
            tb.f.a(exc, exc2);
        }
        return exc;
    }

    public static final void b0(eg.d dVar, int i10) {
        hc.t.e(dVar, "<this>");
        dVar.i0((i10 >>> 16) & 255);
        dVar.i0((i10 >>> 8) & 255);
        dVar.i0(i10 & 255);
    }

    public static final <E> void c(List<E> list, E e10) {
        hc.t.e(list, "<this>");
        if (!list.contains(e10)) {
            list.add(e10);
        }
    }

    public static final int d(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int e(short s10, int i10) {
        return s10 & i10;
    }

    public static final long f(int i10, long j10) {
        return i10 & j10;
    }

    public static final r.c g(final r rVar) {
        hc.t.e(rVar, "<this>");
        return new r.c() { // from class: pf.c
            @Override // of.r.c
            public final r a(of.e eVar) {
                r h10;
                h10 = d.h(r.this, eVar);
                return h10;
            }
        };
    }

    public static final r h(r rVar, of.e eVar) {
        hc.t.e(rVar, "$this_asFactory");
        hc.t.e(eVar, "it");
        return rVar;
    }

    public static final boolean i(String str) {
        hc.t.e(str, "<this>");
        return f19194g.h(str);
    }

    public static final boolean j(u uVar, u uVar2) {
        hc.t.e(uVar, "<this>");
        hc.t.e(uVar2, "other");
        return hc.t.a(uVar.h(), uVar2.h()) && uVar.l() == uVar2.l() && hc.t.a(uVar.p(), uVar2.p());
    }

    public static final int k(String str, long j10, TimeUnit timeUnit) {
        hc.t.e(str, "name");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        boolean z10 = true;
        if (i10 >= 0) {
            if (!(timeUnit != null)) {
                throw new IllegalStateException("unit == null".toString());
            }
            long millis = timeUnit.toMillis(j10);
            if (!(millis <= 2147483647L)) {
                throw new IllegalArgumentException(hc.t.l(str, " too large.").toString());
            }
            if (millis == 0 && i10 > 0) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException(hc.t.l(str, " too small.").toString());
            }
            return (int) millis;
        }
        throw new IllegalStateException(hc.t.l(str, " < 0").toString());
    }

    public static final void l(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) {
        hc.t.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) {
        hc.t.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!hc.t.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String str) {
        int E;
        hc.t.e(strArr, "<this>");
        hc.t.e(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        hc.t.d(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        E = ub.m.E(strArr2);
        strArr2[E] = str;
        return strArr2;
    }

    public static final int p(String str, char c10, int i10, int i11) {
        hc.t.e(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static final int q(String str, String str2, int i10, int i11) {
        boolean M;
        hc.t.e(str, "<this>");
        hc.t.e(str2, "delimiters");
        while (i10 < i11) {
            int i12 = i10 + 1;
            M = y.M(str2, str.charAt(i10), false, 2, null);
            if (M) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return p(str, c10, i10, i11);
    }

    public static final boolean s(eg.a0 a0Var, int i10, TimeUnit timeUnit) {
        hc.t.e(a0Var, "<this>");
        hc.t.e(timeUnit, "timeUnit");
        try {
            return L(a0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String str, Object... objArr) {
        hc.t.e(str, "format");
        hc.t.e(objArr, "args");
        p0 p0Var = p0.f11777a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        hc.t.d(format, "format(locale, format, *args)");
        return format;
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        hc.t.e(strArr, "<this>");
        hc.t.e(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                int length = strArr.length;
                int i10 = 0;
                while (i10 < length) {
                    String str = strArr[i10];
                    i10++;
                    Iterator a10 = hc.d.a(strArr2);
                    while (a10.hasNext()) {
                        if (comparator.compare(str, (String) a10.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long v(b0 b0Var) {
        hc.t.e(b0Var, "<this>");
        String a10 = b0Var.s().a("Content-Length");
        if (a10 == null) {
            return -1L;
        }
        return W(a10, -1L);
    }

    @SafeVarargs
    public static final <T> List<T> w(T... tArr) {
        List k10;
        hc.t.e(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        k10 = ub.u.k(Arrays.copyOf(objArr, objArr.length));
        List<T> unmodifiableList = Collections.unmodifiableList(k10);
        hc.t.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int x(String[] strArr, String str, Comparator<String> comparator) {
        hc.t.e(strArr, "<this>");
        hc.t.e(str, "value");
        hc.t.e(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        hc.t.e(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char charAt = str.charAt(i10);
            if (hc.t.f(charAt, 31) <= 0 || hc.t.f(charAt, 127) >= 0) {
                return i10;
            }
            i10 = i11;
        }
        return -1;
    }

    public static final int z(String str, int i10, int i11) {
        hc.t.e(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            char charAt = str.charAt(i10);
            boolean z10 = false;
            if ((((charAt == '\t' || charAt == '\n') || charAt == '\f') || charAt == '\r') || charAt == ' ') {
                z10 = true;
            }
            if (!z10) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }
}
