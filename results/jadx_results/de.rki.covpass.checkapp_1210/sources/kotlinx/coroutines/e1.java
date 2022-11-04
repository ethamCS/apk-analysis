package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a.\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\"\u0018\u0010\u000e\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0010\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"T", "Lkotlinx/coroutines/d1;", BuildConfig.FLAVOR, "mode", "Ltb/e0;", "a", "Lxb/d;", "delegate", BuildConfig.FLAVOR, "undispatched", "d", "e", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e1 {
    public static final <T> void a(d1<? super T> d1Var, int i10) {
        xb.d<? super T> c10 = d1Var.c();
        boolean z10 = i10 == 4;
        if (z10 || !(c10 instanceof kotlinx.coroutines.internal.f) || b(i10) != b(d1Var.f15326q)) {
            d(d1Var, c10, z10);
            return;
        }
        l0 l0Var = ((kotlinx.coroutines.internal.f) c10).f15415x;
        xb.g b10 = c10.b();
        if (l0Var.R0(b10)) {
            l0Var.u0(b10, d1Var);
        } else {
            e(d1Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(d1<? super T> d1Var, xb.d<? super T> dVar, boolean z10) {
        Object obj;
        Object h10 = d1Var.h();
        Throwable d10 = d1Var.d(h10);
        if (d10 != null) {
            s.a aVar = tb.s.Companion;
            obj = tb.t.a(d10);
        } else {
            s.a aVar2 = tb.s.Companion;
            obj = d1Var.e(h10);
        }
        Object c10 = tb.s.c(obj);
        if (!z10) {
            dVar.y(c10);
            return;
        }
        kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) dVar;
        xb.d<T> dVar2 = fVar.f15416y;
        Object obj2 = fVar.V3;
        xb.g b10 = dVar2.b();
        Object c11 = kotlinx.coroutines.internal.f0.c(b10, obj2);
        d3<?> g10 = c11 != kotlinx.coroutines.internal.f0.f15417a ? k0.g(dVar2, b10, c11) : null;
        try {
            fVar.f15416y.y(c10);
            tb.e0 e0Var = tb.e0.f22152a;
        } finally {
            if (g10 == null || g10.m1()) {
                kotlinx.coroutines.internal.f0.a(b10, c11);
            }
        }
    }

    private static final void e(d1<?> d1Var) {
        k1 b10 = b3.f15314a.b();
        if (b10.o1()) {
            b10.k1(d1Var);
            return;
        }
        b10.m1(true);
        try {
            d(d1Var, d1Var.c(), true);
            do {
            } while (b10.r1());
        } finally {
            try {
            } finally {
            }
        }
    }
}
