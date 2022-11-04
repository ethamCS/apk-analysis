package rk;
/* loaded from: classes3.dex */
public class r {

    /* renamed from: a */
    public float[] f21310a;

    /* renamed from: b */
    public int f21311b;

    public r() {
        this(0);
    }

    public r(int i10) {
        this.f21310a = new float[i10];
        this.f21311b = i10;
    }

    public void a(int i10) {
        float[] fArr = this.f21310a;
        float[] fArr2 = new float[fArr.length + i10];
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        this.f21310a = fArr2;
    }

    public r b(int i10) {
        if (this.f21310a.length < i10) {
            this.f21310a = new float[i10];
        }
        this.f21311b = i10;
        return this;
    }

    public void c(r rVar) {
        b(rVar.f21311b);
        System.arraycopy(rVar.f21310a, 0, this.f21310a, 0, rVar.f21311b);
    }
}
