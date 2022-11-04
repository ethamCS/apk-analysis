package k7;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¨\u0006\n"}, d2 = {BuildConfig.FLAVOR, "T", "Landroidx/fragment/app/w;", BuildConfig.FLAVOR, "recursive", "Lkotlin/Function1;", "Landroidx/fragment/app/Fragment;", "match", "Laf/h;", "a", "android-utils_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class m {

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "Laf/j;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "com.ibm.health.common.android.utils.FragmentWalkerKt$findFragments$1", f = "FragmentWalker.kt", l = {15, 18}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.k implements gc.p<af.j<? super T>, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ androidx.fragment.app.w V3;
        final /* synthetic */ gc.l<Fragment, T> W3;
        final /* synthetic */ boolean X3;

        /* renamed from: q */
        Object f14664q;

        /* renamed from: x */
        Object f14665x;

        /* renamed from: y */
        int f14666y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.fragment.app.w wVar, gc.l<? super Fragment, ? extends T> lVar, boolean z10, xb.d<? super a> dVar) {
            super(2, dVar);
            this.V3 = wVar;
            this.W3 = lVar;
            this.X3 = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007d -> B:11:0x0053). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009d -> B:11:0x0053). Please submit an issue!!! */
        @Override // zb.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object B(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = yb.b.c()
                int r1 = r8.f14666y
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L36
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.f14664q
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r4 = r8.U3
                af.j r4 = (af.j) r4
                tb.t.b(r9)
                r9 = r8
                r5 = r4
                r4 = r1
                goto L53
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f14665x
                androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
                java.lang.Object r4 = r8.f14664q
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r8.U3
                af.j r5 = (af.j) r5
                tb.t.b(r9)
                r9 = r8
                goto L7b
            L36:
                tb.t.b(r9)
                java.lang.Object r9 = r8.U3
                af.j r9 = (af.j) r9
                androidx.fragment.app.w r1 = r8.V3
                java.util.List r1 = r1.x0()
                java.lang.String r4 = "fragments"
                hc.t.d(r1, r4)
                java.util.List r1 = ub.s.q0(r1)
                java.util.Iterator r1 = r1.iterator()
                r5 = r9
                r4 = r1
                r9 = r8
            L53:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto La0
                java.lang.Object r1 = r4.next()
                androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
                gc.l<androidx.fragment.app.Fragment, T> r6 = r9.W3
                java.lang.String r7 = "fragment"
                hc.t.d(r1, r7)
                java.lang.Object r6 = r6.invoke(r1)
                if (r6 == 0) goto L7b
                r9.U3 = r5
                r9.f14664q = r4
                r9.f14665x = r1
                r9.f14666y = r3
                java.lang.Object r6 = r5.d(r6, r9)
                if (r6 != r0) goto L7b
                return r0
            L7b:
                boolean r6 = r9.X3
                if (r6 == 0) goto L53
                androidx.fragment.app.w r1 = r1.S()
                java.lang.String r6 = "fragment.childFragmentManager"
                hc.t.d(r1, r6)
                boolean r6 = r9.X3
                gc.l<androidx.fragment.app.Fragment, T> r7 = r9.W3
                af.h r1 = k7.m.a(r1, r6, r7)
                r9.U3 = r5
                r9.f14664q = r4
                r6 = 0
                r9.f14665x = r6
                r9.f14666y = r2
                java.lang.Object r1 = r5.e(r1, r9)
                if (r1 != r0) goto L53
                return r0
            La0:
                tb.e0 r9 = tb.e0.f22152a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: k7.m.a.B(java.lang.Object):java.lang.Object");
        }

        /* renamed from: W */
        public final Object u(af.j<? super T> jVar, xb.d<? super e0> dVar) {
            return ((a) j(jVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            a aVar = new a(this.V3, this.W3, this.X3, dVar);
            aVar.U3 = obj;
            return aVar;
        }
    }

    public static final <T> af.h<T> a(androidx.fragment.app.w wVar, boolean z10, gc.l<? super Fragment, ? extends T> lVar) {
        af.h<T> b10;
        hc.t.e(wVar, "<this>");
        hc.t.e(lVar, "match");
        b10 = af.l.b(new a(wVar, lVar, z10, null));
        return b10;
    }

    public static /* synthetic */ af.h b(androidx.fragment.app.w wVar, boolean z10, gc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return a(wVar, z10, lVar);
    }
}
