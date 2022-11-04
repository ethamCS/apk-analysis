package gg;

import java.util.Objects;
/* loaded from: classes3.dex */
public class h {

    /* renamed from: d */
    static final g[] f10819d = new g[0];

    /* renamed from: a */
    private g[] f10820a;

    /* renamed from: b */
    private int f10821b;

    /* renamed from: c */
    private boolean f10822c;

    public h() {
        this(10);
    }

    public h(int i10) {
        if (i10 >= 0) {
            this.f10820a = i10 == 0 ? f10819d : new g[i10];
            this.f10821b = 0;
            this.f10822c = false;
            return;
        }
        throw new IllegalArgumentException("'initialCapacity' must not be negative");
    }

    public static g[] b(g[] gVarArr) {
        return gVarArr.length < 1 ? f10819d : (g[]) gVarArr.clone();
    }

    private void e(int i10) {
        g[] gVarArr = new g[Math.max(this.f10820a.length, i10 + (i10 >> 1))];
        System.arraycopy(this.f10820a, 0, gVarArr, 0, this.f10821b);
        this.f10820a = gVarArr;
        this.f10822c = false;
    }

    public void a(g gVar) {
        Objects.requireNonNull(gVar, "'element' cannot be null");
        int length = this.f10820a.length;
        boolean z10 = true;
        int i10 = this.f10821b + 1;
        if (i10 <= length) {
            z10 = false;
        }
        if (this.f10822c | z10) {
            e(i10);
        }
        this.f10820a[this.f10821b] = gVar;
        this.f10821b = i10;
    }

    public g[] c() {
        int i10 = this.f10821b;
        if (i10 == 0) {
            return f10819d;
        }
        g[] gVarArr = new g[i10];
        System.arraycopy(this.f10820a, 0, gVarArr, 0, i10);
        return gVarArr;
    }

    public g d(int i10) {
        if (i10 < this.f10821b) {
            return this.f10820a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10 + " >= " + this.f10821b);
    }

    public int f() {
        return this.f10821b;
    }

    public g[] g() {
        int i10 = this.f10821b;
        if (i10 == 0) {
            return f10819d;
        }
        g[] gVarArr = this.f10820a;
        if (gVarArr.length == i10) {
            this.f10822c = true;
            return gVarArr;
        }
        g[] gVarArr2 = new g[i10];
        System.arraycopy(gVarArr, 0, gVarArr2, 0, i10);
        return gVarArr2;
    }
}
