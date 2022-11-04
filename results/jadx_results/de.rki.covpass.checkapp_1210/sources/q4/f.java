package q4;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    private float f19638a;

    /* renamed from: b */
    private int f19639b;

    public void a(float f10) {
        float f11 = this.f19638a + f10;
        this.f19638a = f11;
        int i10 = this.f19639b + 1;
        this.f19639b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f19638a = f11 / 2.0f;
            this.f19639b = i10 / 2;
        }
    }
}
