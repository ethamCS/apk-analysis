package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: e */
    private static final q f7863e = q.b();

    /* renamed from: a */
    private i f7864a;

    /* renamed from: b */
    private q f7865b;

    /* renamed from: c */
    protected volatile s0 f7866c;

    /* renamed from: d */
    private volatile i f7867d;

    protected void a(s0 s0Var) {
        i iVar;
        if (this.f7866c != null) {
            return;
        }
        synchronized (this) {
            if (this.f7866c != null) {
                return;
            }
            try {
                if (this.f7864a != null) {
                    this.f7866c = s0Var.i().a(this.f7864a, this.f7865b);
                    iVar = this.f7864a;
                } else {
                    this.f7866c = s0Var;
                    iVar = i.f7878d;
                }
                this.f7867d = iVar;
            } catch (c0 unused) {
                this.f7866c = s0Var;
                this.f7867d = i.f7878d;
            }
        }
    }

    public int b() {
        if (this.f7867d != null) {
            return this.f7867d.size();
        }
        i iVar = this.f7864a;
        if (iVar != null) {
            return iVar.size();
        }
        if (this.f7866c == null) {
            return 0;
        }
        return this.f7866c.e();
    }

    public s0 c(s0 s0Var) {
        a(s0Var);
        return this.f7866c;
    }

    public s0 d(s0 s0Var) {
        s0 s0Var2 = this.f7866c;
        this.f7864a = null;
        this.f7867d = null;
        this.f7866c = s0Var;
        return s0Var2;
    }

    public i e() {
        if (this.f7867d != null) {
            return this.f7867d;
        }
        i iVar = this.f7864a;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (this.f7867d != null) {
                return this.f7867d;
            }
            this.f7867d = this.f7866c == null ? i.f7878d : this.f7866c.l();
            return this.f7867d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        s0 s0Var = this.f7866c;
        s0 s0Var2 = f0Var.f7866c;
        return (s0Var == null && s0Var2 == null) ? e().equals(f0Var.e()) : (s0Var == null || s0Var2 == null) ? s0Var != null ? s0Var.equals(f0Var.c(s0Var.f())) : c(s0Var2.f()).equals(s0Var2) : s0Var.equals(s0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
