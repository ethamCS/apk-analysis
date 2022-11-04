package q2;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    protected final x3.c f19496a;

    /* renamed from: b */
    protected final int f19497b;

    /* renamed from: c */
    protected c4.l f19498c;

    /* renamed from: d */
    protected int f19499d;

    /* renamed from: e */
    protected int f19500e;

    /* renamed from: f */
    protected int f19501f;

    /* renamed from: g */
    protected int f19502g;

    /* renamed from: h */
    protected int[] f19503h;

    /* renamed from: i */
    protected int[] f19504i;

    public c(x3.c cVar) {
        int i10;
        this.f19496a = cVar;
        int i11 = 0;
        if (x3.c.EIGHT == cVar) {
            i10 = 8;
            this.f19504i = new int[8];
            while (i11 < 8) {
                this.f19504i[i11] = (((i11 + 4) % 8) + 2) % 8;
                i11++;
            }
        } else if (x3.c.FOUR != cVar) {
            throw new IllegalArgumentException("Connectivity rule must be 4 or 8 not " + cVar);
        } else {
            i10 = 4;
            this.f19504i = new int[4];
            while (i11 < 4) {
                this.f19504i[i11] = (((i11 + 2) % 4) + 1) % 4;
                i11++;
            }
        }
        this.f19497b = i10;
        this.f19503h = new int[this.f19497b];
    }

    private void b(int[] iArr, int i10) {
        iArr[0] = 1;
        iArr[1] = i10;
        iArr[2] = -1;
        iArr[3] = -i10;
    }

    private void c(int[] iArr, int i10) {
        iArr[0] = 1;
        iArr[1] = i10 + 1;
        iArr[2] = i10;
        iArr[3] = i10 - 1;
        iArr[4] = -1;
        iArr[5] = (-1) - i10;
        iArr[6] = -i10;
        iArr[7] = 1 - i10;
    }

    public void a(c4.l lVar) {
        this.f19498c = lVar;
        if (this.f19496a == x3.c.EIGHT) {
            c(this.f19503h, lVar.f6219d);
        } else {
            b(this.f19503h, lVar.f6219d);
        }
    }
}
