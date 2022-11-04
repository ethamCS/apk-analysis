package androidx.appcompat.widget;
/* loaded from: classes.dex */
class r0 {

    /* renamed from: a */
    private int f1466a = 0;

    /* renamed from: b */
    private int f1467b = 0;

    /* renamed from: c */
    private int f1468c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1469d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1470e = 0;

    /* renamed from: f */
    private int f1471f = 0;

    /* renamed from: g */
    private boolean f1472g = false;

    /* renamed from: h */
    private boolean f1473h = false;

    public int a() {
        return this.f1472g ? this.f1466a : this.f1467b;
    }

    public int b() {
        return this.f1466a;
    }

    public int c() {
        return this.f1467b;
    }

    public int d() {
        return this.f1472g ? this.f1467b : this.f1466a;
    }

    public void e(int i10, int i11) {
        this.f1473h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1470e = i10;
            this.f1466a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1471f = i11;
            this.f1467b = i11;
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
            boolean r0 = r1.f1472g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f1472g = r2
            boolean r0 = r1.f1473h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f1469d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f1470e
        L16:
            r1.f1466a = r2
            int r2 = r1.f1468c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f1468c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f1470e
        L24:
            r1.f1466a = r2
            int r2 = r1.f1469d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f1470e
            r1.f1466a = r2
        L2f:
            int r2 = r1.f1471f
        L31:
            r1.f1467b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.f(boolean):void");
    }

    public void g(int i10, int i11) {
        this.f1468c = i10;
        this.f1469d = i11;
        this.f1473h = true;
        if (this.f1472g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1466a = i11;
            }
            if (i10 == Integer.MIN_VALUE) {
                return;
            }
            this.f1467b = i10;
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1466a = i10;
        }
        if (i11 == Integer.MIN_VALUE) {
            return;
        }
        this.f1467b = i11;
    }
}
