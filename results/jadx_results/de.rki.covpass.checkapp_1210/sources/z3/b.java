package z3;
/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: c */
    public float[] f26447c;

    protected b() {
    }

    public b(int i10) {
        this(i10, i10 / 2);
    }

    public b(int i10, int i11) {
        super(i10, i11);
        this.f26447c = new float[i10];
    }

    public float d() {
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f26447c;
            if (i10 < fArr.length) {
                f10 += fArr[i10];
                i10++;
            } else {
                return f10;
            }
        }
    }

    public b e() {
        b bVar = new b(this.f26453a, this.f26454b);
        System.arraycopy(this.f26447c, 0, bVar.f26447c, 0, bVar.f26453a);
        return bVar;
    }

    public float f(int i10) {
        return this.f26447c[i10];
    }
}
