package androidx.appcompat.widget;
/* loaded from: classes.dex */
class o0 {

    /* renamed from: a */
    private int f579a = 0;

    /* renamed from: b */
    private int f580b = 0;

    /* renamed from: c */
    private int f581c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f582d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f583e = 0;

    /* renamed from: f */
    private int f584f = 0;

    /* renamed from: g */
    private boolean f585g = false;

    /* renamed from: h */
    private boolean f586h = false;

    public int a() {
        return this.f585g ? this.f579a : this.f580b;
    }

    public int b() {
        return this.f579a;
    }

    public int c() {
        return this.f580b;
    }

    public int d() {
        return this.f585g ? this.f580b : this.f579a;
    }

    public void e(int i, int i2) {
        this.f586h = false;
        if (i != Integer.MIN_VALUE) {
            this.f583e = i;
            this.f579a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f584f = i2;
            this.f580b = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f585g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f585g = r2
            boolean r0 = r1.f586h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f582d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f583e
        L16:
            r1.f579a = r2
            int r2 = r1.f581c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f581c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f583e
        L24:
            r1.f579a = r2
            int r2 = r1.f582d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f583e
            r1.f579a = r2
        L2f:
            int r2 = r1.f584f
        L31:
            r1.f580b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.f(boolean):void");
    }

    public void g(int i, int i2) {
        this.f581c = i;
        this.f582d = i2;
        this.f586h = true;
        if (this.f585g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f579a = i2;
            }
            if (i == Integer.MIN_VALUE) {
                return;
            }
            this.f580b = i;
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f579a = i;
        }
        if (i2 == Integer.MIN_VALUE) {
            return;
        }
        this.f580b = i2;
    }
}
