package l9;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\r2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\n\"\u00020\u0010H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u00020\r2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H§@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Ll9/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Ll9/b;", "c", "(Lxb/d;)Ljava/lang/Object;", "rule", BuildConfig.FLAVOR, "g", "(Ll9/b;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Ll9/a;", "descriptions", "Ltb/e0;", "f", "([Ll9/a;Lxb/d;)Ljava/lang/Object;", "Ll9/d;", "boosterRulesWithDescription", "d", "([Ll9/d;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "keep", "add", "h", "(Ljava/util/Collection;Ljava/util/Collection;Lxb/d;)Ljava/lang/Object;", "a", "(Ljava/util/Collection;Lxb/d;)Ljava/lang/Object;", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class e {

    @zb.f(c = "de.rki.covpass.sdk.rules.booster.local.BoosterRulesDao", f = "BoosterRulesDao.kt", l = {32, 41}, m = "insertAll$suspendImpl")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends zb.d {
        Object U3;
        int V3;
        int W3;
        /* synthetic */ Object X3;
        int Z3;

        /* renamed from: x */
        Object f15886x;

        /* renamed from: y */
        Object f15887y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.X3 = obj;
            this.Z3 |= Integer.MIN_VALUE;
            return e.e(e.this, null, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.rules.booster.local.BoosterRulesDao", f = "BoosterRulesDao.kt", l = {47, 48}, m = "replaceAll$suspendImpl")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f15888x;

        /* renamed from: y */
        Object f15889y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return e.i(e.this, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object b(e eVar, Collection collection, xb.d dVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                collection = u.h();
            }
            return eVar.a(collection, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteAll");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3 A[LOOP:0: B:23:0x009d->B:25:0x00a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00e5 -> B:30:0x00e8). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object e(l9.e r23, l9.d[] r24, xb.d r25) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.e.e(l9.e, l9.d[], xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object i(l9.e r5, java.util.Collection r6, java.util.Collection r7, xb.d r8) {
        /*
            boolean r0 = r8 instanceof l9.e.b
            if (r0 == 0) goto L13
            r0 = r8
            l9.e$b r0 = (l9.e.b) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            l9.e$b r0 = new l9.e$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tb.t.b(r8)
            goto L74
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f15889y
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Object r5 = r0.f15888x
            l9.e r5 = (l9.e) r5
            tb.t.b(r8)
            goto L51
        L41:
            tb.t.b(r8)
            r0.f15888x = r5
            r0.f15889y = r7
            r0.W3 = r4
            java.lang.Object r6 = r5.a(r6, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r6 = 0
            l9.d[] r6 = new l9.d[r6]
            java.lang.Object[] r6 = r7.toArray(r6)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            hc.t.c(r6, r7)
            l9.d[] r6 = (l9.d[]) r6
            int r7 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            l9.d[] r6 = (l9.d[]) r6
            r7 = 0
            r0.f15888x = r7
            r0.f15889y = r7
            r0.W3 = r3
            java.lang.Object r5 = r5.d(r6, r0)
            if (r5 != r1) goto L74
            return r1
        L74:
            tb.e0 r5 = tb.e0.f22152a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.e.i(l9.e, java.util.Collection, java.util.Collection, xb.d):java.lang.Object");
    }

    public abstract Object a(Collection<String> collection, xb.d<? super e0> dVar);

    public abstract Object c(xb.d<? super List<l9.b>> dVar);

    public Object d(d[] dVarArr, xb.d<? super e0> dVar) {
        return e(this, dVarArr, dVar);
    }

    public abstract Object f(l9.a[] aVarArr, xb.d<? super e0> dVar);

    public abstract Object g(l9.b bVar, xb.d<? super Long> dVar);

    public Object h(Collection<String> collection, Collection<d> collection2, xb.d<? super e0> dVar) {
        return i(this, collection, collection2, dVar);
    }
}
