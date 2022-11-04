package ka;

import ga.h;
import java.util.Objects;
/* loaded from: classes.dex */
public class c extends h<c> {

    /* renamed from: c */
    public int f14865c;

    /* renamed from: d */
    public int f14866d;

    public c() {
    }

    public c(int i10, int i11) {
        this.f14865c = i10;
        this.f14866d = i11;
    }

    public double b(c cVar) {
        int i10 = this.f14865c - cVar.f14865c;
        int i11 = this.f14866d - cVar.f14866d;
        return Math.sqrt((i10 * i10) + (i11 * i11));
    }

    public int c(c cVar) {
        int i10 = this.f14865c - cVar.f14865c;
        int i11 = this.f14866d - cVar.f14866d;
        return (i10 * i10) + (i11 * i11);
    }

    public void e(int i10, int i11) {
        this.f14865c = i10;
        this.f14866d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14865c == cVar.f14865c && this.f14866d == cVar.f14866d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14865c), Integer.valueOf(this.f14866d));
    }

    public String toString() {
        return "Point2D_I32{x=" + this.f14865c + ", y=" + this.f14866d + '}';
    }
}
