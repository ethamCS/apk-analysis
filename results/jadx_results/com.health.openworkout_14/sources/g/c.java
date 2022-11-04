package g;

import e.h0;
import e.j0;
import g.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.Unit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends h.a {

    /* renamed from: a */
    private boolean f4492a = true;

    /* loaded from: classes.dex */
    static final class a implements h<j0, j0> {

        /* renamed from: a */
        static final a f4493a = new a();

        a() {
        }

        /* renamed from: b */
        public j0 a(j0 j0Var) {
            try {
                return y.a(j0Var);
            } finally {
                j0Var.close();
            }
        }
    }

    /* loaded from: classes.dex */
    static final class b implements h<h0, h0> {

        /* renamed from: a */
        static final b f4494a = new b();

        b() {
        }

        @Override // g.h
        public /* bridge */ /* synthetic */ h0 a(h0 h0Var) {
            h0 h0Var2 = h0Var;
            b(h0Var2);
            return h0Var2;
        }

        public h0 b(h0 h0Var) {
            return h0Var;
        }
    }

    /* renamed from: g.c$c */
    /* loaded from: classes.dex */
    static final class C0118c implements h<j0, j0> {

        /* renamed from: a */
        static final C0118c f4495a = new C0118c();

        C0118c() {
        }

        @Override // g.h
        public /* bridge */ /* synthetic */ j0 a(j0 j0Var) {
            j0 j0Var2 = j0Var;
            b(j0Var2);
            return j0Var2;
        }

        public j0 b(j0 j0Var) {
            return j0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d implements h<Object, String> {

        /* renamed from: a */
        static final d f4496a = new d();

        d() {
        }

        /* renamed from: b */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    /* loaded from: classes.dex */
    static final class e implements h<j0, Unit> {

        /* renamed from: a */
        static final e f4497a = new e();

        e() {
        }

        /* renamed from: b */
        public Unit a(j0 j0Var) {
            j0Var.close();
            return Unit.INSTANCE;
        }
    }

    /* loaded from: classes.dex */
    static final class f implements h<j0, Void> {

        /* renamed from: a */
        static final f f4498a = new f();

        f() {
        }

        /* renamed from: b */
        public Void a(j0 j0Var) {
            j0Var.close();
            return null;
        }
    }

    @Override // g.h.a
    @Nullable
    public h<?, h0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, u uVar) {
        if (h0.class.isAssignableFrom(y.h(type))) {
            return b.f4494a;
        }
        return null;
    }

    @Override // g.h.a
    @Nullable
    public h<j0, ?> d(Type type, Annotation[] annotationArr, u uVar) {
        if (type == j0.class) {
            return y.l(annotationArr, g.a0.w.class) ? C0118c.f4495a : a.f4493a;
        } else if (type == Void.class) {
            return f.f4498a;
        } else {
            if (!this.f4492a || type != Unit.class) {
                return null;
            }
            try {
                return e.f4497a;
            } catch (NoClassDefFoundError unused) {
                this.f4492a = false;
                return null;
            }
        }
    }
}
