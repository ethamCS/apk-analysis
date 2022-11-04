package ok;
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a */
    public boolean[] f18603a;

    /* renamed from: b */
    public int f18604b;

    public d() {
        this(10);
    }

    public d(int i10) {
        this.f18603a = new boolean[i10];
        this.f18604b = 0;
    }

    public void a(boolean z10) {
        b(z10);
    }

    public void b(boolean z10) {
        boolean[] zArr;
        int i10 = this.f18604b;
        if (i10 == this.f18603a.length) {
            try {
                zArr = new boolean[(i10 * 2) + 5];
            } catch (OutOfMemoryError unused) {
                System.gc();
                zArr = new boolean[(this.f18604b * 3) / 2];
            }
            System.arraycopy(this.f18603a, 0, zArr, 0, this.f18604b);
            this.f18603a = zArr;
        }
        boolean[] zArr2 = this.f18603a;
        int i11 = this.f18604b;
        this.f18604b = i11 + 1;
        zArr2[i11] = z10;
    }

    public void c(int i10) {
        boolean[] zArr = this.f18603a;
        if (zArr.length >= i10) {
            return;
        }
        int i11 = this.f18604b;
        if (i11 == 0) {
            this.f18603a = null;
            this.f18603a = new boolean[i10];
            return;
        }
        boolean[] zArr2 = new boolean[i10];
        System.arraycopy(zArr, 0, zArr2, 0, i11);
        this.f18603a = zArr2;
    }

    public void d() {
        this.f18604b = 0;
    }

    public void e(int i10) {
        c(i10);
        this.f18604b = i10;
    }

    public void f(d dVar) {
        e(dVar.f18604b);
        System.arraycopy(dVar.f18603a, 0, this.f18603a, 0, g());
    }

    public int g() {
        return this.f18604b;
    }
}
