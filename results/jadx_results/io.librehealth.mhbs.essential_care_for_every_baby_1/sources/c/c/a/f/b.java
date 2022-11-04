package c.c.a.f;

import java.util.List;
/* loaded from: classes.dex */
public abstract class b implements f {
    private Boolean g(String str) {
        Object c2 = c(str);
        if (c2 instanceof Boolean) {
            return (Boolean) c2;
        }
        return null;
    }

    private String i() {
        return (String) c("sql");
    }

    private List<Object> j() {
        return (List) c("arguments");
    }

    @Override // c.c.a.f.f
    public c.c.a.d d() {
        return new c.c.a.d(i(), j());
    }

    @Override // c.c.a.f.f
    public boolean e() {
        return Boolean.TRUE.equals(c("noResult"));
    }

    @Override // c.c.a.f.f
    public Boolean f() {
        return g("inTransaction");
    }

    public boolean h() {
        return Boolean.TRUE.equals(c("continueOnError"));
    }
}
