package hc;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class h implements oc.c, Serializable {
    public static final Object V3 = a.f11760c;
    private final boolean U3;

    /* renamed from: c */
    private transient oc.c f11755c;

    /* renamed from: d */
    protected final Object f11756d;

    /* renamed from: q */
    private final Class f11757q;

    /* renamed from: x */
    private final String f11758x;

    /* renamed from: y */
    private final String f11759y;

    /* loaded from: classes.dex */
    private static class a implements Serializable {

        /* renamed from: c */
        private static final a f11760c = new a();

        private a() {
        }
    }

    public h() {
        this(V3);
    }

    protected h(Object obj) {
        this(obj, null, null, null, false);
    }

    public h(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f11756d = obj;
        this.f11757q = cls;
        this.f11758x = str;
        this.f11759y = str2;
        this.U3 = z10;
    }

    public oc.c b0() {
        oc.c cVar = this.f11755c;
        if (cVar == null) {
            oc.c c02 = c0();
            this.f11755c = c02;
            return c02;
        }
        return cVar;
    }

    protected abstract oc.c c0();

    public Object d0() {
        return this.f11756d;
    }

    @Override // oc.c
    public oc.n e() {
        return f0().e();
    }

    public oc.f e0() {
        Class cls = this.f11757q;
        if (cls == null) {
            return null;
        }
        return this.U3 ? k0.c(cls) : k0.b(cls);
    }

    public oc.c f0() {
        oc.c b02 = b0();
        if (b02 != this) {
            return b02;
        }
        throw new fc.d();
    }

    public String g0() {
        return this.f11759y;
    }

    @Override // oc.c
    public String getName() {
        return this.f11758x;
    }

    @Override // oc.c
    public List<oc.j> getParameters() {
        return f0().getParameters();
    }

    @Override // oc.b
    public List<Annotation> j() {
        return f0().j();
    }

    @Override // oc.c
    public Object p(Map map) {
        return f0().p(map);
    }
}
