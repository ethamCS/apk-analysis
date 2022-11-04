package androidx.recyclerview.widget;
/* loaded from: classes.dex */
public class c implements o {

    /* renamed from: a */
    final o f1663a;

    /* renamed from: b */
    int f1664b = 0;

    /* renamed from: c */
    int f1665c = -1;

    /* renamed from: d */
    int f1666d = -1;

    /* renamed from: e */
    Object f1667e = null;

    public c(o oVar) {
        this.f1663a = oVar;
    }

    @Override // androidx.recyclerview.widget.o
    public void a(int i, int i2) {
        int i3;
        if (this.f1664b == 2 && (i3 = this.f1665c) >= i && i3 <= i + i2) {
            this.f1666d += i2;
            this.f1665c = i;
            return;
        }
        e();
        this.f1665c = i;
        this.f1666d = i2;
        this.f1664b = 2;
    }

    @Override // androidx.recyclerview.widget.o
    public void b(int i, int i2) {
        int i3;
        if (this.f1664b == 1 && i >= (i3 = this.f1665c)) {
            int i4 = this.f1666d;
            if (i <= i3 + i4) {
                this.f1666d = i4 + i2;
                this.f1665c = Math.min(i, i3);
                return;
            }
        }
        e();
        this.f1665c = i;
        this.f1666d = i2;
        this.f1664b = 1;
    }

    @Override // androidx.recyclerview.widget.o
    public void c(int i, int i2) {
        e();
        this.f1663a.c(i, i2);
    }

    @Override // androidx.recyclerview.widget.o
    public void d(int i, int i2, Object obj) {
        int i3;
        if (this.f1664b == 3) {
            int i4 = this.f1665c;
            int i5 = this.f1666d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f1667e == obj) {
                this.f1665c = Math.min(i, i4);
                this.f1666d = Math.max(i5 + i4, i3) - this.f1665c;
                return;
            }
        }
        e();
        this.f1665c = i;
        this.f1666d = i2;
        this.f1667e = obj;
        this.f1664b = 3;
    }

    public void e() {
        int i = this.f1664b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f1663a.b(this.f1665c, this.f1666d);
        } else if (i == 2) {
            this.f1663a.a(this.f1665c, this.f1666d);
        } else if (i == 3) {
            this.f1663a.d(this.f1665c, this.f1666d, this.f1667e);
        }
        this.f1667e = null;
        this.f1664b = 0;
    }
}
