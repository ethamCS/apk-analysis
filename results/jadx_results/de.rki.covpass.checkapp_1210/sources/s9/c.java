package s9;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import ub.u;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\r\"\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\n2\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Ls9/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Ls9/a;", "c", "(Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "keep", "add", "Ltb/e0;", "e", "(Ljava/util/Collection;Ljava/util/Collection;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "covPassValueSetLocal", "d", "([Ls9/a;Lxb/d;)Ljava/lang/Object;", "a", "(Ljava/util/Collection;Lxb/d;)Ljava/lang/Object;", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class c {

    @zb.f(c = "de.rki.covpass.sdk.rules.local.valuesets.CovPassValueSetsDao", f = "CovPassValueSetsDao.kt", l = {25, 26}, m = "replace$suspendImpl")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f21545x;

        /* renamed from: y */
        Object f21546y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(dVar);
            c.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return c.f(c.this, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object b(c cVar, Collection collection, xb.d dVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                collection = u.h();
            }
            return cVar.a(collection, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteAll");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object f(s9.c r5, java.util.Collection r6, java.util.Collection r7, xb.d r8) {
        /*
            boolean r0 = r8 instanceof s9.c.a
            if (r0 == 0) goto L13
            r0 = r8
            s9.c$a r0 = (s9.c.a) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            s9.c$a r0 = new s9.c$a
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
            java.lang.Object r5 = r0.f21546y
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Object r5 = r0.f21545x
            s9.c r5 = (s9.c) r5
            tb.t.b(r8)
            goto L51
        L41:
            tb.t.b(r8)
            r0.f21545x = r5
            r0.f21546y = r7
            r0.W3 = r4
            java.lang.Object r6 = r5.a(r6, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r6 = 0
            s9.a[] r6 = new s9.a[r6]
            java.lang.Object[] r6 = r7.toArray(r6)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            hc.t.c(r6, r7)
            s9.a[] r6 = (s9.a[]) r6
            int r7 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            s9.a[] r6 = (s9.a[]) r6
            r7 = 0
            r0.f21545x = r7
            r0.f21546y = r7
            r0.W3 = r3
            java.lang.Object r5 = r5.d(r6, r0)
            if (r5 != r1) goto L74
            return r1
        L74:
            tb.e0 r5 = tb.e0.f22152a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.c.f(s9.c, java.util.Collection, java.util.Collection, xb.d):java.lang.Object");
    }

    public abstract Object a(Collection<String> collection, xb.d<? super e0> dVar);

    public abstract Object c(xb.d<? super List<s9.a>> dVar);

    public abstract Object d(s9.a[] aVarArr, xb.d<? super e0> dVar);

    public Object e(Collection<String> collection, Collection<s9.a> collection2, xb.d<? super e0> dVar) {
        return f(this, collection, collection2, dVar);
    }
}
