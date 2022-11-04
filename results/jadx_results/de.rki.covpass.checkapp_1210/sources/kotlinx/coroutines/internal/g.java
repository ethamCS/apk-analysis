package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.b3;
import kotlinx.coroutines.d3;
import kotlinx.coroutines.k1;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aH\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0012\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00060\nH\u0000\"\u001a\u0010\u0012\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0014\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u0012\u0004\b\u0013\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"T", "Lxb/d;", "Ltb/s;", "result", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Ltb/e0;", "onCancellation", "b", "(Lxb/d;Ljava/lang/Object;Lgc/l;)V", "Lkotlinx/coroutines/internal/f;", BuildConfig.FLAVOR, "d", "Lkotlinx/coroutines/internal/b0;", "a", "Lkotlinx/coroutines/internal/b0;", "getUNDEFINED$annotations", "()V", "UNDEFINED", "getREUSABLE_CLAIMED$annotations", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a */
    private static final b0 f15424a = new b0("UNDEFINED");

    /* renamed from: b */
    public static final b0 f15425b = new b0("REUSABLE_CLAIMED");

    public static final /* synthetic */ b0 a() {
        return f15424a;
    }

    public static final <T> void b(xb.d<? super T> dVar, Object obj, gc.l<? super Throwable, tb.e0> lVar) {
        boolean z10;
        if (!(dVar instanceof f)) {
            dVar.y(obj);
            return;
        }
        f fVar = (f) dVar;
        Object b10 = kotlinx.coroutines.h0.b(obj, lVar);
        if (fVar.f15415x.R0(fVar.b())) {
            fVar.U3 = b10;
            fVar.f15326q = 1;
            fVar.f15415x.u0(fVar.b(), fVar);
            return;
        }
        k1 b11 = b3.f15314a.b();
        if (b11.o1()) {
            fVar.U3 = b10;
            fVar.f15326q = 1;
            b11.k1(fVar);
            return;
        }
        b11.m1(true);
        try {
            a2 a2Var = (a2) fVar.b().i(a2.W0);
            if (a2Var == null || a2Var.j()) {
                z10 = false;
            } else {
                CancellationException w02 = a2Var.w0();
                fVar.a(b10, w02);
                s.a aVar = tb.s.Companion;
                fVar.y(tb.s.c(tb.t.a(w02)));
                z10 = true;
            }
            if (!z10) {
                xb.d<T> dVar2 = fVar.f15416y;
                Object obj2 = fVar.V3;
                xb.g b12 = dVar2.b();
                Object c10 = f0.c(b12, obj2);
                d3<?> g10 = c10 != f0.f15417a ? kotlinx.coroutines.k0.g(dVar2, b12, c10) : null;
                fVar.f15416y.y(obj);
                tb.e0 e0Var = tb.e0.f22152a;
                if (g10 == null || g10.m1()) {
                    f0.a(b12, c10);
                }
            }
            do {
            } while (b11.r1());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(xb.d dVar, Object obj, gc.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }

    public static final boolean d(f<? super tb.e0> fVar) {
        tb.e0 e0Var = tb.e0.f22152a;
        k1 b10 = b3.f15314a.b();
        if (b10.p1()) {
            return false;
        }
        if (b10.o1()) {
            fVar.U3 = e0Var;
            fVar.f15326q = 1;
            b10.k1(fVar);
            return true;
        }
        b10.m1(true);
        try {
            fVar.run();
            do {
            } while (b10.r1());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
