package oa;

import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"Loa/b;", "a", "(Loa/b;Lxb/d;)Ljava/lang/Object;", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e {

    @zb.f(c = "io.ktor.client.call.SavedCallKt", f = "SavedCall.kt", l = {60}, m = "save")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends zb.d {
        /* synthetic */ Object U3;
        int V3;

        /* renamed from: x */
        Object f17725x;

        /* renamed from: y */
        Object f17726y;

        a(xb.d<? super a> dVar) {
            super(dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.V3 |= Integer.MIN_VALUE;
            return e.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(oa.b r5, xb.d<? super oa.b> r6) {
        /*
            boolean r0 = r6 instanceof oa.e.a
            if (r0 == 0) goto L13
            r0 = r6
            oa.e$a r0 = (oa.e.a) r0
            int r1 = r0.V3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.V3 = r1
            goto L18
        L13:
            oa.e$a r0 = new oa.e$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.V3
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f17726y
            na.a r5 = (na.a) r5
            java.lang.Object r0 = r0.f17725x
            oa.b r0 = (oa.b) r0
            tb.t.b(r6)
            goto L5b
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            tb.t.b(r6)
            na.a r6 = r5.d()
            if (r6 == 0) goto L81
            za.c r2 = r5.g()
            io.ktor.utils.io.h r2 = r2.d()
            r0.f17725x = r5
            r0.f17726y = r6
            r0.V3 = r3
            java.lang.Object r0 = io.ktor.utils.io.j.f(r2, r0)
            if (r0 != r1) goto L57
            return r1
        L57:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L5b:
            ob.u r6 = (ob.u) r6
            r1 = 0
            r2 = 0
            byte[] r6 = ob.l0.c(r6, r1, r3, r2)
            oa.f r1 = new oa.f
            r1.<init>(r5, r6)
            oa.g r5 = new oa.g
            ya.b r2 = r0.f()
            r5.<init>(r1, r2)
            r1.m(r5)
            oa.h r5 = new oa.h
            za.c r0 = r0.g()
            r5.<init>(r1, r6, r0)
            r1.n(r5)
            return r1
        L81:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Failed to save call in different native thread."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.e.a(oa.b, xb.d):java.lang.Object");
    }
}
