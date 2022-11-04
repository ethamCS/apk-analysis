package ta;

import kotlin.Metadata;
import ta.i;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¨\u0006\u0003"}, d2 = {"Lna/b;", "Ltb/e0;", "b", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private static final fb.a<e0> f22046a = new fb.a<>("ValidateMark");

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lta/i$b;", "Ltb/e0;", "b", "(Lta/i$b;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<i.b, e0> {

        /* renamed from: c */
        final /* synthetic */ na.b<?> f22047c;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lza/c;", "response", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.features.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", l = {39, 44}, m = "invokeSuspend")
        /* renamed from: ta.f$a$a */
        /* loaded from: classes.dex */
        public static final class C0377a extends zb.l implements gc.p<za.c, xb.d<? super e0>, Object> {
            int U3;
            /* synthetic */ Object V3;

            /* renamed from: y */
            int f22048y;

            C0377a(xb.d<? super C0377a> dVar) {
                super(2, dVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
            @Override // zb.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object B(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = yb.b.c()
                    int r1 = r8.U3
                    r2 = 300(0x12c, float:4.2E-43)
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L29
                    if (r1 == r4) goto L23
                    if (r1 != r3) goto L1b
                    int r0 = r8.f22048y
                    java.lang.Object r1 = r8.V3
                    za.c r1 = (za.c) r1
                    tb.t.b(r9)
                    goto L98
                L1b:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L23:
                    int r1 = r8.f22048y
                    tb.t.b(r9)
                    goto L74
                L29:
                    tb.t.b(r9)
                    java.lang.Object r9 = r8.V3
                    za.c r9 = (za.c) r9
                    oa.b r1 = r9.c()
                    fb.b r1 = r1.c1()
                    fb.a r5 = ta.j.b()
                    java.lang.Object r1 = r1.c(r5)
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L4b
                    tb.e0 r9 = tb.e0.f22152a
                    return r9
                L4b:
                    bb.w r1 = r9.i()
                    int r1 = r1.b0()
                    oa.b r9 = r9.c()
                    if (r1 < r2) goto Ld3
                    fb.b r5 = r9.c1()
                    fb.a r6 = ta.f.a()
                    boolean r5 = r5.b(r6)
                    if (r5 == 0) goto L69
                    goto Ld3
                L69:
                    r8.f22048y = r1
                    r8.U3 = r4
                    java.lang.Object r9 = oa.e.a(r9, r8)
                    if (r9 != r0) goto L74
                    return r0
                L74:
                    oa.b r9 = (oa.b) r9
                    fb.b r5 = r9.c1()
                    fb.a r6 = ta.f.a()
                    tb.e0 r7 = tb.e0.f22152a
                    r5.a(r6, r7)
                    za.c r9 = r9.g()
                    r8.V3 = r9
                    r8.f22048y = r1
                    r8.U3 = r3
                    r3 = 0
                    java.lang.Object r3 = za.h.b(r9, r3, r8, r4, r3)
                    if (r3 != r0) goto L95
                    return r0
                L95:
                    r0 = r1
                    r1 = r9
                    r9 = r3
                L98:
                    java.lang.String r9 = (java.lang.String) r9
                    r3 = 400(0x190, float:5.6E-43)
                    r5 = 0
                    if (r2 > r0) goto La3
                    if (r0 >= r3) goto La3
                    r2 = r4
                    goto La4
                La3:
                    r2 = r5
                La4:
                    if (r2 != 0) goto Lcd
                    r2 = 500(0x1f4, float:7.0E-43)
                    if (r3 > r0) goto Lae
                    if (r0 >= r2) goto Lae
                    r3 = r4
                    goto Laf
                Lae:
                    r3 = r5
                Laf:
                    if (r3 != 0) goto Lc7
                    if (r2 > r0) goto Lb8
                    r2 = 600(0x258, float:8.41E-43)
                    if (r0 >= r2) goto Lb8
                    goto Lb9
                Lb8:
                    r4 = r5
                Lb9:
                    if (r4 == 0) goto Lc1
                    ta.z r0 = new ta.z
                    r0.<init>(r1, r9)
                    throw r0
                Lc1:
                    ta.w r0 = new ta.w
                    r0.<init>(r1, r9)
                    throw r0
                Lc7:
                    ta.c r0 = new ta.c
                    r0.<init>(r1, r9)
                    throw r0
                Lcd:
                    ta.v r0 = new ta.v
                    r0.<init>(r1, r9)
                    throw r0
                Ld3:
                    tb.e0 r9 = tb.e0.f22152a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: ta.f.a.C0377a.B(java.lang.Object):java.lang.Object");
            }

            /* renamed from: d0 */
            public final Object u(za.c cVar, xb.d<? super e0> dVar) {
                return ((C0377a) j(cVar, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                C0377a c0377a = new C0377a(dVar);
                c0377a.V3 = obj;
                return c0377a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(na.b<?> bVar) {
            super(1);
            this.f22047c = bVar;
        }

        public final void b(i.b bVar) {
            hc.t.e(bVar, "$this$HttpResponseValidator");
            bVar.d(this.f22047c.e());
            bVar.e(new C0377a(null));
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(i.b bVar) {
            b(bVar);
            return e0.f22152a;
        }
    }

    public static final void b(na.b<?> bVar) {
        hc.t.e(bVar, "<this>");
        j.a(bVar, new a(bVar));
    }
}
