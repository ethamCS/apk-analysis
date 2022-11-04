package oe;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public class d1 {

    /* renamed from: a */
    private final boolean f17931a;

    /* renamed from: b */
    private final boolean f17932b;

    /* renamed from: c */
    private final boolean f17933c;

    /* renamed from: d */
    private final se.p f17934d;

    /* renamed from: e */
    private final h f17935e;

    /* renamed from: f */
    private final i f17936f;

    /* renamed from: g */
    private int f17937g;

    /* renamed from: h */
    private boolean f17938h;

    /* renamed from: i */
    private ArrayDeque<se.k> f17939i;

    /* renamed from: j */
    private Set<se.k> f17940j;

    /* loaded from: classes3.dex */
    public interface a {

        /* renamed from: oe.d1$a$a */
        /* loaded from: classes3.dex */
        public static final class C0279a implements a {

            /* renamed from: a */
            private boolean f17941a;

            @Override // oe.d1.a
            public void a(gc.a<Boolean> aVar) {
                hc.t.e(aVar, "block");
                if (this.f17941a) {
                    return;
                }
                this.f17941a = aVar.invoke().booleanValue();
            }

            public final boolean b() {
                return this.f17941a;
            }
        }

        void a(gc.a<Boolean> aVar);
    }

    /* loaded from: classes3.dex */
    public enum b {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* loaded from: classes3.dex */
    public static abstract class c {

        /* loaded from: classes3.dex */
        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        /* loaded from: classes3.dex */
        public static final class b extends c {

            /* renamed from: a */
            public static final b f17946a = new b();

            private b() {
                super(null);
            }

            @Override // oe.d1.c
            public se.k a(d1 d1Var, se.i iVar) {
                hc.t.e(d1Var, "state");
                hc.t.e(iVar, "type");
                return d1Var.j().x0(iVar);
            }
        }

        /* renamed from: oe.d1$c$c */
        /* loaded from: classes3.dex */
        public static final class C0280c extends c {

            /* renamed from: a */
            public static final C0280c f17947a = new C0280c();

            private C0280c() {
                super(null);
            }

            @Override // oe.d1.c
            public /* bridge */ /* synthetic */ se.k a(d1 d1Var, se.i iVar) {
                return (se.k) b(d1Var, iVar);
            }

            public Void b(d1 d1Var, se.i iVar) {
                hc.t.e(d1Var, "state");
                hc.t.e(iVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* loaded from: classes3.dex */
        public static final class d extends c {

            /* renamed from: a */
            public static final d f17948a = new d();

            private d() {
                super(null);
            }

            @Override // oe.d1.c
            public se.k a(d1 d1Var, se.i iVar) {
                hc.t.e(d1Var, "state");
                hc.t.e(iVar, "type");
                return d1Var.j().x(iVar);
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract se.k a(d1 d1Var, se.i iVar);
    }

    public d1(boolean z10, boolean z11, boolean z12, se.p pVar, h hVar, i iVar) {
        hc.t.e(pVar, "typeSystemContext");
        hc.t.e(hVar, "kotlinTypePreparator");
        hc.t.e(iVar, "kotlinTypeRefiner");
        this.f17931a = z10;
        this.f17932b = z11;
        this.f17933c = z12;
        this.f17934d = pVar;
        this.f17935e = hVar;
        this.f17936f = iVar;
    }

    public static /* synthetic */ Boolean d(d1 d1Var, se.i iVar, se.i iVar2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return d1Var.c(iVar, iVar2, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
    }

    public Boolean c(se.i iVar, se.i iVar2, boolean z10) {
        hc.t.e(iVar, "subType");
        hc.t.e(iVar2, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque<se.k> arrayDeque = this.f17939i;
        hc.t.b(arrayDeque);
        arrayDeque.clear();
        Set<se.k> set = this.f17940j;
        hc.t.b(set);
        set.clear();
        this.f17938h = false;
    }

    public boolean f(se.i iVar, se.i iVar2) {
        hc.t.e(iVar, "subType");
        hc.t.e(iVar2, "superType");
        return true;
    }

    public b g(se.k kVar, se.d dVar) {
        hc.t.e(kVar, "subType");
        hc.t.e(dVar, "superType");
        return b.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque<se.k> h() {
        return this.f17939i;
    }

    public final Set<se.k> i() {
        return this.f17940j;
    }

    public final se.p j() {
        return this.f17934d;
    }

    public final void k() {
        this.f17938h = true;
        if (this.f17939i == null) {
            this.f17939i = new ArrayDeque<>(4);
        }
        if (this.f17940j == null) {
            this.f17940j = ye.f.Companion.a();
        }
    }

    public final boolean l(se.i iVar) {
        hc.t.e(iVar, "type");
        return this.f17933c && this.f17934d.m(iVar);
    }

    public final boolean m() {
        return this.f17931a;
    }

    public final boolean n() {
        return this.f17932b;
    }

    public final se.i o(se.i iVar) {
        hc.t.e(iVar, "type");
        return this.f17935e.a(iVar);
    }

    public final se.i p(se.i iVar) {
        hc.t.e(iVar, "type");
        return this.f17936f.a(iVar);
    }

    public boolean q(gc.l<? super a, tb.e0> lVar) {
        hc.t.e(lVar, "block");
        a.C0279a c0279a = new a.C0279a();
        lVar.invoke(c0279a);
        return c0279a.b();
    }
}
