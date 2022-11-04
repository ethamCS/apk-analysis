package m7;

import androidx.fragment.app.Fragment;
import hc.k0;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u00020\u0005\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\f\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\b\u001a\u0018\u0010\r\u001a\u0004\u0018\u00010\t2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000b\"\u0018\u0010\u0011\u001a\u00020\u0003*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/fragment/app/j;", "Lm7/x;", "T", BuildConfig.FLAVOR, "containerId", "Lm7/v;", "a", "(Landroidx/fragment/app/j;I)Lm7/v;", "Landroidx/fragment/app/Fragment;", BuildConfig.FLAVOR, "e", "Loc/d;", "cls", "f", "Lm7/a0;", "d", "(Lm7/a0;)I", "androidScreenOrientation", "navigation_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class w {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16431a;

        static {
            int[] iArr = new int[a0.values().length];
            iArr[a0.PORTRAIT.ordinal()] = 1;
            iArr[a0.LANDSCAPE.ordinal()] = 2;
            iArr[a0.SENSOR.ordinal()] = 3;
            iArr[a0.USER.ordinal()] = 4;
            f16431a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends androidx.fragment.app.j & x> v a(T t10, int i10) {
        hc.t.e(t10, "<this>");
        androidx.fragment.app.w m02 = t10.m0();
        hc.t.d(m02, "supportFragmentManager");
        return new v(t10, m02, t10, i10);
    }

    public static /* synthetic */ v b(androidx.fragment.app.j jVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 16908290;
        }
        return a(jVar, i10);
    }

    public static final int d(a0 a0Var) {
        int i10 = a.f16431a[a0Var.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return 0;
            }
            if (i10 == 3) {
                return 10;
            }
            if (i10 != 4) {
                throw new tb.p();
            }
            return 13;
        }
        return 1;
    }

    public static final String e(Fragment fragment) {
        hc.t.e(fragment, "<this>");
        return f(k0.b(fragment.getClass()));
    }

    public static final String f(oc.d<? extends Fragment> dVar) {
        hc.t.e(dVar, "cls");
        if (f0.class.isAssignableFrom(fc.a.b(dVar))) {
            return null;
        }
        return fc.a.b(dVar).getName();
    }
}
