package ob;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a\u001c\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a&\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¨\u0006\u000b"}, d2 = {"Lob/z;", BuildConfig.FLAVOR, "dst", BuildConfig.FLAVOR, "offset", "length", "Ltb/e0;", "d", "Lob/e;", "c", "a", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a0 {
    public static final int a(z zVar, byte[] bArr, int i10, int i11) {
        Throwable th2;
        hc.t.e(zVar, "<this>");
        hc.t.e(bArr, "dst");
        boolean z10 = true;
        pb.a f10 = pb.h.f(zVar, 1);
        int i12 = i11;
        if (f10 != null) {
            while (true) {
                try {
                    int min = Math.min(i12, f10.s() - f10.p());
                    m.b(f10, bArr, i10, min);
                    i12 -= min;
                    i10 += min;
                    if (!(i12 > 0)) {
                        break;
                    }
                    try {
                        pb.a h10 = pb.h.h(zVar, f10);
                        if (h10 == null) {
                            z10 = false;
                            break;
                        }
                        f10 = h10;
                    } catch (Throwable th3) {
                        th2 = th3;
                        z10 = false;
                        if (z10) {
                            pb.h.c(zVar, f10);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
            if (z10) {
                pb.h.c(zVar, f10);
            }
        }
        return i11 - i12;
    }

    public static /* synthetic */ int b(z zVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length - i10;
        }
        return a(zVar, bArr, i10, i11);
    }

    public static final void c(z zVar, e eVar, int i10) {
        Throwable th2;
        hc.t.e(zVar, "<this>");
        hc.t.e(eVar, "dst");
        boolean z10 = true;
        pb.a f10 = pb.h.f(zVar, 1);
        if (f10 != null) {
            while (true) {
                try {
                    int min = Math.min(i10, f10.s() - f10.p());
                    m.a(f10, eVar, min);
                    i10 -= min;
                    if (!(i10 > 0)) {
                        break;
                    }
                    try {
                        pb.a h10 = pb.h.h(zVar, f10);
                        if (h10 == null) {
                            z10 = false;
                            break;
                        }
                        f10 = h10;
                    } catch (Throwable th3) {
                        th2 = th3;
                        z10 = false;
                        if (z10) {
                            pb.h.c(zVar, f10);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
            if (z10) {
                pb.h.c(zVar, f10);
            }
        }
        if (i10 <= 0) {
            return;
        }
        l0.a(i10);
        throw new tb.i();
    }

    public static final void d(z zVar, byte[] bArr, int i10, int i11) {
        Throwable th2;
        hc.t.e(zVar, "<this>");
        hc.t.e(bArr, "dst");
        boolean z10 = true;
        pb.a f10 = pb.h.f(zVar, 1);
        if (f10 != null) {
            while (true) {
                try {
                    int min = Math.min(i11, f10.s() - f10.p());
                    m.b(f10, bArr, i10, min);
                    i11 -= min;
                    i10 += min;
                    if (!(i11 > 0)) {
                        break;
                    }
                    try {
                        pb.a h10 = pb.h.h(zVar, f10);
                        if (h10 == null) {
                            z10 = false;
                            break;
                        }
                        f10 = h10;
                    } catch (Throwable th3) {
                        th2 = th3;
                        z10 = false;
                        if (z10) {
                            pb.h.c(zVar, f10);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
            if (z10) {
                pb.h.c(zVar, f10);
            }
        }
        if (i11 <= 0) {
            return;
        }
        l0.a(i11);
        throw new tb.i();
    }
}
