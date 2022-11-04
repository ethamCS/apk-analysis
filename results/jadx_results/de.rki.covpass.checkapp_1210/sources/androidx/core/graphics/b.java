package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e */
    public static final b f3451e = new b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f3452a;

    /* renamed from: b */
    public final int f3453b;

    /* renamed from: c */
    public final int f3454c;

    /* renamed from: d */
    public final int f3455d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private b(int i10, int i11, int i12, int i13) {
        this.f3452a = i10;
        this.f3453b = i11;
        this.f3454c = i12;
        this.f3455d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f3452a, bVar2.f3452a), Math.max(bVar.f3453b, bVar2.f3453b), Math.max(bVar.f3454c, bVar2.f3454c), Math.max(bVar.f3455d, bVar2.f3455d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f3451e : new b(i10, i11, i12, i13);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f3452a, this.f3453b, this.f3454c, this.f3455d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3455d == bVar.f3455d && this.f3452a == bVar.f3452a && this.f3454c == bVar.f3454c && this.f3453b == bVar.f3453b;
    }

    public int hashCode() {
        return (((((this.f3452a * 31) + this.f3453b) * 31) + this.f3454c) * 31) + this.f3455d;
    }

    public String toString() {
        return "Insets{left=" + this.f3452a + ", top=" + this.f3453b + ", right=" + this.f3454c + ", bottom=" + this.f3455d + '}';
    }
}
