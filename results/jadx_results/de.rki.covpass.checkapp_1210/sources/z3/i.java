package z3;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a */
    public int f26453a;

    /* renamed from: b */
    public int f26454b;

    public i() {
    }

    public i(int i10) {
        if (i10 >= 0) {
            this.f26453a = i10;
            this.f26454b = i10 / 2;
            return;
        }
        throw new IllegalArgumentException("Kernel width must be greater than zero not " + i10);
    }

    public i(int i10, int i11) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Kernel width must be greater than zero not " + i10);
        } else if (i11 >= 0 && i11 < i10) {
            this.f26453a = i10;
            this.f26454b = i11;
        } else {
            throw new IllegalArgumentException("The offset must be inside the kernel's bounds. o=" + i11 + " w=" + i10);
        }
    }

    public int a() {
        return this.f26454b;
    }

    public int b() {
        return this.f26453a / 2;
    }

    public int c() {
        return this.f26453a;
    }
}
