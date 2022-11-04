package ob;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a\u001c\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u0003¨\u0006\n"}, d2 = {"Lob/h0;", BuildConfig.FLAVOR, "src", BuildConfig.FLAVOR, "offset", "length", "Ltb/e0;", "b", "Lob/e;", "a", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class i0 {
    public static final void a(h0 h0Var, e eVar, int i10) {
        hc.t.e(h0Var, "<this>");
        hc.t.e(eVar, "src");
        pb.a i11 = pb.h.i(h0Var, 1, null);
        while (true) {
            try {
                int min = Math.min(i10, i11.j() - i11.s());
                m.d(i11, eVar, min);
                i10 -= min;
                if (!(i10 > 0)) {
                    return;
                }
                i11 = pb.h.i(h0Var, 1, i11);
            } finally {
                pb.h.a(h0Var, i11);
            }
        }
    }

    public static final void b(h0 h0Var, byte[] bArr, int i10, int i11) {
        hc.t.e(h0Var, "<this>");
        hc.t.e(bArr, "src");
        pb.a i12 = pb.h.i(h0Var, 1, null);
        while (true) {
            try {
                int min = Math.min(i11, i12.j() - i12.s());
                m.e(i12, bArr, i10, min);
                i10 += min;
                i11 -= min;
                if (!(i11 > 0)) {
                    return;
                }
                i12 = pb.h.i(h0Var, 1, i12);
            } finally {
                pb.h.a(h0Var, i12);
            }
        }
    }

    public static /* synthetic */ void c(h0 h0Var, e eVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = eVar.s() - eVar.p();
        }
        a(h0Var, eVar, i10);
    }

    public static /* synthetic */ void d(h0 h0Var, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length - i10;
        }
        b(h0Var, bArr, i10, i11);
    }
}
