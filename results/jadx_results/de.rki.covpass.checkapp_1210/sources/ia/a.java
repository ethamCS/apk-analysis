package ia;

import ga.i;
import java.io.Serializable;
/* loaded from: classes.dex */
public class a extends i implements Serializable {
    public a() {
        e();
    }

    public a(a aVar) {
        f(aVar);
    }

    /* renamed from: c */
    public a a() {
        return new a(this);
    }

    public void e() {
        this.X3 = 1.0f;
        this.f21316y = 1.0f;
        this.f21312c = 1.0f;
        this.W3 = 0.0f;
        this.V3 = 0.0f;
        this.U3 = 0.0f;
        this.f21315x = 0.0f;
        this.f21314q = 0.0f;
        this.f21313d = 0.0f;
    }

    public void f(a aVar) {
        super.b(aVar);
    }

    public String toString() {
        return getClass().getSimpleName() + String.format("[ %5.2fe %5.2fe %5.2fe ; %5.2fe %5.2fe %5.2fe ; %5.2fe %5.2fe %5.2fe ]", Float.valueOf(this.f21312c), Float.valueOf(this.f21313d), Float.valueOf(this.f21314q), Float.valueOf(this.f21315x), Float.valueOf(this.f21316y), Float.valueOf(this.U3), Float.valueOf(this.V3), Float.valueOf(this.W3), Float.valueOf(this.X3));
    }
}
