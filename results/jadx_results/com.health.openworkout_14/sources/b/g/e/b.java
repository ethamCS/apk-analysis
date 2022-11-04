package b.g.e;

import android.graphics.Insets;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e */
    public static final b f2377e = new b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f2378a;

    /* renamed from: b */
    public final int f2379b;

    /* renamed from: c */
    public final int f2380c;

    /* renamed from: d */
    public final int f2381d;

    private b(int i, int i2, int i3, int i4) {
        this.f2378a = i;
        this.f2379b = i2;
        this.f2380c = i3;
        this.f2381d = i4;
    }

    public static b a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f2377e : new b(i, i2, i3, i4);
    }

    public static b b(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets c() {
        return Insets.of(this.f2378a, this.f2379b, this.f2380c, this.f2381d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2381d == bVar.f2381d && this.f2378a == bVar.f2378a && this.f2380c == bVar.f2380c && this.f2379b == bVar.f2379b;
    }

    public int hashCode() {
        return (((((this.f2378a * 31) + this.f2379b) * 31) + this.f2380c) * 31) + this.f2381d;
    }

    public String toString() {
        return "Insets{left=" + this.f2378a + ", top=" + this.f2379b + ", right=" + this.f2380c + ", bottom=" + this.f2381d + '}';
    }
}
