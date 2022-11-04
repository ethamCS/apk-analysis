package m7;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/Fragment;", BuildConfig.FLAVOR, "skip", "Lm7/v;", "a", "navigation_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class g {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Lm7/v;", "b", "(Ljava/lang/Object;)Lm7/v;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<Object, v> {

        /* renamed from: c */
        public static final a f16403c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final v invoke(Object obj) {
            hc.t.e(obj, "it");
            x xVar = obj instanceof x ? (x) obj : null;
            if (xVar != null) {
                return xVar.N();
            }
            return null;
        }
    }

    public static final v a(Fragment fragment, int i10) {
        hc.t.e(fragment, "<this>");
        return (v) f.a(fragment, i10, a.f16403c);
    }

    public static /* synthetic */ v b(Fragment fragment, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return a(fragment, i10);
    }
}
