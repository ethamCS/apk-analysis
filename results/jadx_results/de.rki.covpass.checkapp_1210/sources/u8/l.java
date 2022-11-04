package u8;

import android.annotation.SuppressLint;
import androidx.camera.core.n1;
import hc.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.v;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0002H\u0001\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0000\u001a\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¨\u0006\t"}, d2 = {"Lc4/l;", "d", "Landroidx/camera/core/n1;", "c", "image", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "a", "common-app_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class l {
    public static final List<String> a(c4.l lVar) {
        int s10;
        t.e(lVar, "image");
        g2.a a10 = p3.b.a(null, c4.l.class);
        a10.d(lVar);
        List<p2.g> b10 = a10.b();
        t.d(b10, "detector.detections");
        s10 = v.s(b10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (p2.g gVar : b10) {
            arrayList.add(gVar.f18754e4);
        }
        return arrayList;
    }

    public static final List<String> b(c4.l lVar) {
        t.e(lVar, "image");
        return a(d(lVar));
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    public static final c4.l c(n1 n1Var) {
        t.e(n1Var, "<this>");
        c4.l b10 = c4.t.f6256x.b(n1Var.d(), n1Var.a());
        c4.l lVar = b10;
        i3.b.a(n1Var.o0(), m2.a.RGB, lVar, null);
        t.d(b10, "SB_U8.createImage(width,…rmat.RGB, it, null)\n    }");
        return lVar;
    }

    public static final c4.l d(c4.l lVar) {
        t.e(lVar, "<this>");
        c4.l b10 = c4.t.f6256x.b(lVar.f6221x, lVar.f6220q);
        int i10 = lVar.f6220q;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = lVar.f6221x;
            for (int i13 = 0; i13 < i12; i13++) {
                b10.e0(i13, i11, lVar.c0(i11, i13));
            }
        }
        t.d(b10, "transposed");
        return b10;
    }
}
