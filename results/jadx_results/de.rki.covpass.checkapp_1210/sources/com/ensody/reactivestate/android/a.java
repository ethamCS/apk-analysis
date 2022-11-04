package com.ensody.reactivestate.android;

import androidx.fragment.app.Fragment;
import hc.g0;
import hc.j0;
import hc.t;
import hc.v;
import kotlin.Metadata;
import kotlinx.coroutines.h1;
import s4.m;
import s4.n0;
import s4.r;
import s4.r0;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ab\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012(\b\u0002\u0010\u0007\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00062\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0005`\t¨\u0006\f"}, d2 = {"Landroidx/lifecycle/v;", "Ls4/m;", "launcher", "Lkotlin/Function1;", "Ls4/e;", "Ltb/e0;", "Lcom/ensody/reactivestate/AutoRunOnChangeCallback;", "onChange", "Ls4/r0;", "Lcom/ensody/reactivestate/AutoRunCallback;", "observer", "a", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", "Ltb/e0;", "b", "(Ls4/r0;)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.ensody.reactivestate.android.a$a */
    /* loaded from: classes.dex */
    public static final class C0095a extends v implements gc.l<r0, e0> {

        /* renamed from: c */
        final /* synthetic */ g0 f6747c;

        /* renamed from: d */
        final /* synthetic */ j0<s4.e<e0>> f6748d;

        /* renamed from: q */
        final /* synthetic */ gc.l<r0, e0> f6749q;

        /* renamed from: x */
        final /* synthetic */ androidx.lifecycle.v f6750x;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.ensody.reactivestate.android.a$a$a */
        /* loaded from: classes.dex */
        public static final class C0096a extends v implements gc.a<e0> {

            /* renamed from: c */
            final /* synthetic */ g0 f6751c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0096a(g0 g0Var) {
                super(0);
                this.f6751c = g0Var;
            }

            public final void b() {
                this.f6751c.f11754c = false;
            }

            @Override // gc.a
            public /* bridge */ /* synthetic */ e0 invoke() {
                b();
                return e0.f22152a;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.ensody.reactivestate.android.a$a$b */
        /* loaded from: classes.dex */
        public static final class b extends v implements gc.a<e0> {

            /* renamed from: c */
            final /* synthetic */ j0<s4.e<e0>> f6752c;

            /* renamed from: d */
            final /* synthetic */ r f6753d;

            /* renamed from: q */
            final /* synthetic */ androidx.lifecycle.v f6754q;

            @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
            /* renamed from: com.ensody.reactivestate.android.a$a$b$a */
            /* loaded from: classes.dex */
            public static final class C0097a extends v implements gc.a<e0> {

                /* renamed from: c */
                final /* synthetic */ j0<s4.e<e0>> f6755c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0097a(j0<s4.e<e0>> j0Var) {
                    super(0);
                    this.f6755c = j0Var;
                }

                public final void b() {
                    s4.e<e0> eVar;
                    s4.e<e0> eVar2 = this.f6755c.f11764c;
                    if (eVar2 == null) {
                        t.s("autoRunner");
                        eVar = null;
                    } else {
                        eVar = eVar2;
                    }
                    eVar.p();
                }

                @Override // gc.a
                public /* bridge */ /* synthetic */ e0 invoke() {
                    b();
                    return e0.f22152a;
                }
            }

            @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
            /* renamed from: com.ensody.reactivestate.android.a$a$b$b */
            /* loaded from: classes.dex */
            public static final class C0098b extends v implements gc.a<e0> {

                /* renamed from: c */
                final /* synthetic */ j0<s4.e<e0>> f6756c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0098b(j0<s4.e<e0>> j0Var) {
                    super(0);
                    this.f6756c = j0Var;
                }

                public final void b() {
                    s4.e<e0> eVar;
                    s4.e<e0> eVar2 = this.f6756c.f11764c;
                    if (eVar2 == null) {
                        t.s("autoRunner");
                        eVar = null;
                    } else {
                        eVar = eVar2;
                    }
                    eVar.g();
                }

                @Override // gc.a
                public /* bridge */ /* synthetic */ e0 invoke() {
                    b();
                    return e0.f22152a;
                }
            }

            @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
            /* renamed from: com.ensody.reactivestate.android.a$a$b$c */
            /* loaded from: classes.dex */
            public static final class c extends v implements gc.a<e0> {

                /* renamed from: c */
                final /* synthetic */ j0<s4.e<e0>> f6757c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(j0<s4.e<e0>> j0Var) {
                    super(0);
                    this.f6757c = j0Var;
                }

                public final void b() {
                    s4.e<e0> eVar;
                    s4.e<e0> eVar2 = this.f6757c.f11764c;
                    if (eVar2 == null) {
                        t.s("autoRunner");
                        eVar = null;
                    } else {
                        eVar = eVar2;
                    }
                    eVar.g();
                }

                @Override // gc.a
                public /* bridge */ /* synthetic */ e0 invoke() {
                    b();
                    return e0.f22152a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j0<s4.e<e0>> j0Var, r rVar, androidx.lifecycle.v vVar) {
                super(0);
                this.f6752c = j0Var;
                this.f6753d = rVar;
                this.f6754q = vVar;
            }

            public final void b() {
                s4.e<e0> eVar;
                r rVar;
                h1 h1Var;
                s4.e<e0> eVar2 = this.f6752c.f11764c;
                if (eVar2 == null) {
                    t.s("autoRunner");
                    eVar = null;
                } else {
                    eVar = eVar2;
                }
                eVar.g();
                this.f6753d.a(e.k(this.f6754q, new C0097a(this.f6752c)));
                androidx.lifecycle.v vVar = this.f6754q;
                if (vVar instanceof Fragment) {
                    rVar = this.f6753d;
                    h1Var = e.f((Fragment) vVar, new C0098b(this.f6752c));
                } else {
                    rVar = this.f6753d;
                    h1Var = e.d(vVar, new c(this.f6752c));
                }
                rVar.a(h1Var);
            }

            @Override // gc.a
            public /* bridge */ /* synthetic */ e0 invoke() {
                b();
                return e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0095a(g0 g0Var, j0<s4.e<e0>> j0Var, gc.l<? super r0, e0> lVar, androidx.lifecycle.v vVar) {
            super(1);
            this.f6747c = g0Var;
            this.f6748d = j0Var;
            this.f6749q = lVar;
            this.f6750x = vVar;
        }

        public final void b(r0 r0Var) {
            s4.e<e0> eVar;
            t.e(r0Var, "$this$$receiver");
            g0 g0Var = this.f6747c;
            if (!g0Var.f11754c) {
                g0Var.f11754c = true;
                s4.e<e0> eVar2 = this.f6748d.f11764c;
                if (eVar2 == null) {
                    t.s("autoRunner");
                    eVar = null;
                } else {
                    eVar = eVar2;
                }
                r d10 = eVar.d();
                androidx.lifecycle.v vVar = this.f6750x;
                g0 g0Var2 = this.f6747c;
                j0<s4.e<e0>> j0Var = this.f6748d;
                d10.a(new n0(new C0096a(g0Var2)));
                d10.a(e.l(vVar, new b(j0Var, d10, vVar)));
            }
            this.f6749q.invoke(r0Var);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(r0 r0Var) {
            b(r0Var);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<e0> {

        /* renamed from: c */
        final /* synthetic */ j0<s4.e<e0>> f6758c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j0<s4.e<e0>> j0Var) {
            super(0);
            this.f6758c = j0Var;
        }

        public final void b() {
            s4.e<e0> eVar;
            s4.e<e0> eVar2 = this.f6758c.f11764c;
            if (eVar2 == null) {
                t.s("autoRunner");
                eVar = null;
            } else {
                eVar = eVar2;
            }
            eVar.p();
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ e0 invoke() {
            b();
            return e0.f22152a;
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [T, s4.d0, s4.e<tb.e0>, s4.e] */
    public static final s4.e<e0> a(androidx.lifecycle.v vVar, m mVar, gc.l<? super s4.e<e0>, e0> lVar, gc.l<? super r0, e0> lVar2) {
        t.e(vVar, "<this>");
        t.e(mVar, "launcher");
        t.e(lVar2, "observer");
        g0 g0Var = new g0();
        j0 j0Var = new j0();
        ?? eVar = new s4.e(mVar, lVar, null, new C0095a(g0Var, j0Var, lVar2, vVar), 4, null);
        j0Var.f11764c = eVar;
        eVar.d().a(e.k(vVar, new b(j0Var)));
        return eVar;
    }

    public static /* synthetic */ s4.e b(androidx.lifecycle.v vVar, m mVar, gc.l lVar, gc.l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = vVar instanceof m ? (m) vVar : new d(vVar);
        }
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return a(vVar, mVar, lVar, lVar2);
    }
}
