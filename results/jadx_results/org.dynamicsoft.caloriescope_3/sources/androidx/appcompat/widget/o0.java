package androidx.appcompat.widget;

import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
class o0 {

    /* renamed from: a */
    private int f720a = 0;

    /* renamed from: b */
    private int f721b = 0;

    /* renamed from: c */
    private int f722c = RecyclerView.UNDEFINED_DURATION;
    private int d = RecyclerView.UNDEFINED_DURATION;
    private int e = 0;
    private int f = 0;
    private boolean g = false;
    private boolean h = false;

    public int a() {
        return this.g ? this.f720a : this.f721b;
    }

    public void a(int i, int i2) {
        this.h = false;
        if (i != Integer.MIN_VALUE) {
            this.e = i;
            this.f720a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f = i2;
            this.f721b = i2;
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
    public void a(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.g
            if (r2 != r0) goto L5
            return
        L5:
            r1.g = r2
            boolean r0 = r1.h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.e
        L16:
            r1.f720a = r2
            int r2 = r1.f722c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f722c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.e
        L24:
            r1.f720a = r2
            int r2 = r1.d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.e
            r1.f720a = r2
        L2f:
            int r2 = r1.f
        L31:
            r1.f721b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.a(boolean):void");
    }

    public int b() {
        return this.f720a;
    }

    public void b(int i, int i2) {
        this.f722c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f720a = i2;
            }
            if (i == Integer.MIN_VALUE) {
                return;
            }
            this.f721b = i;
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f720a = i;
        }
        if (i2 == Integer.MIN_VALUE) {
            return;
        }
        this.f721b = i2;
    }

    public int c() {
        return this.f721b;
    }

    public int d() {
        return this.g ? this.f721b : this.f720a;
    }
}
