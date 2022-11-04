package ti;
/* loaded from: classes3.dex */
public class w implements q {

    /* renamed from: a */
    volatile int f22436a = 4;

    /* renamed from: b */
    protected int f22437b = -1;

    /* renamed from: c */
    protected i[] f22438c = null;

    /* renamed from: d */
    protected i[] f22439d = null;

    /* renamed from: e */
    protected i f22440e = null;

    /* renamed from: f */
    protected int f22441f = -1;

    public int a() {
        int i10 = this.f22436a;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.f22436a = i11;
            return i11;
        }
        return i10;
    }

    public int b() {
        return this.f22437b;
    }

    public i[] c() {
        return this.f22438c;
    }

    public i[] d() {
        return this.f22439d;
    }

    public int e() {
        return this.f22436a;
    }

    public i f() {
        return this.f22440e;
    }

    public int g() {
        return this.f22441f;
    }

    public boolean h() {
        return this.f22436a <= 0;
    }

    public void i(int i10) {
        this.f22437b = i10;
    }

    public void j(i[] iVarArr) {
        this.f22438c = iVarArr;
    }

    public void k(i[] iVarArr) {
        this.f22439d = iVarArr;
    }

    public void l(int i10) {
        this.f22436a = i10;
    }

    public void m(i iVar) {
        this.f22440e = iVar;
    }

    public void n(int i10) {
        this.f22441f = i10;
    }
}
