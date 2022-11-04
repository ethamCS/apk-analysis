package okhttp3.internal.publicsuffix;

import af.p;
import bf.y;
import eg.e;
import eg.k;
import eg.n;
import hc.t;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import pf.d;
import tb.e0;
import ub.c0;
import ub.u;
import yf.h;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "domain", BuildConfig.FLAVOR, "f", "domainLabels", "b", "Ltb/e0;", "e", "d", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", BuildConfig.FLAVOR, "[B", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: f */
    private static final List<String> f18630f;

    /* renamed from: a */
    private final AtomicBoolean f18632a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f18633b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f18634c;

    /* renamed from: d */
    private byte[] f18635d;
    public static final a Companion = new a(null);

    /* renamed from: e */
    private static final byte[] f18629e = {42};

    /* renamed from: g */
    private static final PublicSuffixDatabase f18631g = new PublicSuffixDatabase();

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "labels", BuildConfig.FLAVOR, "labelIndex", BuildConfig.FLAVOR, "b", "([B[[BI)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "c", BuildConfig.FLAVOR, "EXCEPTION_MARKER", "C", BuildConfig.FLAVOR, "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "WILDCARD_LABEL", "[B", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int i12;
            int d10;
            int length = bArr.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = (i13 + length) / 2;
                while (i14 > -1 && bArr[i14] != 10) {
                    i14--;
                }
                int i15 = i14 + 1;
                int i16 = 1;
                while (true) {
                    i11 = i15 + i16;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i16++;
                }
                int i17 = i11 - i15;
                int i18 = i10;
                boolean z11 = false;
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    if (z11) {
                        i12 = 46;
                        z10 = false;
                    } else {
                        z10 = z11;
                        i12 = d.d(bArr2[i18][i19], 255);
                    }
                    d10 = i12 - d.d(bArr[i15 + i20], 255);
                    if (d10 != 0) {
                        break;
                    }
                    i20++;
                    i19++;
                    if (i20 == i17) {
                        break;
                    } else if (bArr2[i18].length != i19) {
                        z11 = z10;
                    } else if (i18 == bArr2.length - 1) {
                        break;
                    } else {
                        i18++;
                        i19 = -1;
                        z11 = true;
                    }
                }
                if (d10 >= 0) {
                    if (d10 <= 0) {
                        int i21 = i17 - i20;
                        int length2 = bArr2[i18].length - i19;
                        int length3 = bArr2.length;
                        for (int i22 = i18 + 1; i22 < length3; i22++) {
                            length2 += bArr2[i22].length;
                        }
                        if (length2 >= i21) {
                            if (length2 <= i21) {
                                Charset charset = StandardCharsets.UTF_8;
                                t.d(charset, "UTF_8");
                                return new String(bArr, i15, i17, charset);
                            }
                        }
                    }
                    i13 = i11 + 1;
                }
                length = i15 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f18631g;
        }
    }

    static {
        List<String> d10;
        d10 = ub.t.d("*");
        f18630f = d10;
    }

    private final List<String> b(List<String> list) {
        List<String> list2;
        String str;
        String str2;
        String str3;
        List<String> x02;
        if (this.f18632a.get() || !this.f18632a.compareAndSet(false, true)) {
            try {
                this.f18633b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (this.f18634c != null) {
            int size = list.size();
            byte[][] bArr = new byte[size];
            for (int i10 = 0; i10 < size; i10++) {
                Charset charset = StandardCharsets.UTF_8;
                t.d(charset, "UTF_8");
                byte[] bytes = list.get(i10).getBytes(charset);
                t.d(bytes, "this as java.lang.String).getBytes(charset)");
                bArr[i10] = bytes;
            }
            int i11 = 0;
            while (true) {
                list2 = null;
                if (i11 >= size) {
                    str = null;
                    break;
                }
                int i12 = i11 + 1;
                a aVar = Companion;
                byte[] bArr2 = this.f18634c;
                if (bArr2 == null) {
                    t.s("publicSuffixListBytes");
                    bArr2 = null;
                }
                String b10 = aVar.b(bArr2, bArr, i11);
                if (b10 != null) {
                    str = b10;
                    break;
                }
                i11 = i12;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                int i13 = 0;
                while (i13 < length) {
                    int i14 = i13 + 1;
                    bArr3[i13] = f18629e;
                    a aVar2 = Companion;
                    byte[] bArr4 = this.f18634c;
                    if (bArr4 == null) {
                        t.s("publicSuffixListBytes");
                        bArr4 = null;
                    }
                    String b11 = aVar2.b(bArr4, bArr3, i13);
                    if (b11 != null) {
                        str2 = b11;
                        break;
                    }
                    i13 = i14;
                }
            }
            str2 = null;
            if (str2 != null) {
                int i15 = size - 1;
                int i16 = 0;
                while (i16 < i15) {
                    int i17 = i16 + 1;
                    a aVar3 = Companion;
                    byte[] bArr5 = this.f18635d;
                    if (bArr5 == null) {
                        t.s("publicSuffixExceptionListBytes");
                        bArr5 = null;
                    }
                    str3 = aVar3.b(bArr5, bArr, i16);
                    if (str3 != null) {
                        break;
                    }
                    i16 = i17;
                }
            }
            str3 = null;
            if (str3 != null) {
                x02 = y.x0(t.l("!", str3), new char[]{'.'}, false, 0, 6, null);
                return x02;
            } else if (str == null && str2 == null) {
                return f18630f;
            } else {
                List<String> x03 = str == null ? null : y.x0(str, new char[]{'.'}, false, 0, 6, null);
                if (x03 == null) {
                    x03 = u.h();
                }
                if (str2 != null) {
                    list2 = y.x0(str2, new char[]{'.'}, false, 0, 6, null);
                }
                if (list2 == null) {
                    list2 = u.h();
                }
                return x03.size() > list2.size() ? x03 : list2;
            }
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
    }

    private final void d() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        e d10 = n.d(new k(n.k(resourceAsStream)));
        th = null;
        try {
            byte[] l02 = d10.l0(d10.readInt());
            byte[] l03 = d10.l0(d10.readInt());
            e0 e0Var = e0.f22152a;
            synchronized (this) {
                t.b(l02);
                this.f18634c = l02;
                t.b(l03);
                this.f18635d = l03;
            }
            this.f18633b.countDown();
        } finally {
        }
    }

    private final void e() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    h.Companion.g().k("Failed to read public suffix list", 5, e10);
                    if (!z10) {
                        return;
                    }
                    Thread.currentThread().interrupt();
                    return;
                }
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> f(String str) {
        List<String> x02;
        Object g02;
        List<String> Q;
        x02 = y.x0(str, new char[]{'.'}, false, 0, 6, null);
        g02 = c0.g0(x02);
        if (t.a(g02, BuildConfig.FLAVOR)) {
            Q = c0.Q(x02, 1);
            return Q;
        }
        return x02;
    }

    public final String c(String str) {
        af.h M;
        af.h p10;
        String x10;
        t.e(str, "domain");
        String unicode = IDN.toUnicode(str);
        t.d(unicode, "unicodeDomain");
        List<String> f10 = f(unicode);
        List<String> b10 = b(f10);
        if (f10.size() != b10.size() || b10.get(0).charAt(0) == '!') {
            char charAt = b10.get(0).charAt(0);
            int size = f10.size();
            int size2 = b10.size();
            if (charAt != '!') {
                size2++;
            }
            M = c0.M(f(str));
            p10 = p.p(M, size - size2);
            x10 = p.x(p10, ".", null, null, 0, null, null, 62, null);
            return x10;
        }
        return null;
    }
}
