package o7;
/* loaded from: classes.dex */
public class q implements Comparable<q> {

    /* renamed from: c */
    public final int f17644c;

    /* renamed from: d */
    public final int f17645d;

    public q(int i10, int i11) {
        this.f17644c = i10;
        this.f17645d = i11;
    }

    /* renamed from: a */
    public int compareTo(q qVar) {
        int i10 = this.f17645d * this.f17644c;
        int i11 = qVar.f17645d * qVar.f17644c;
        if (i11 < i10) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    public q b() {
        return new q(this.f17645d, this.f17644c);
    }

    public q d(q qVar) {
        int i10 = this.f17644c;
        int i11 = qVar.f17645d;
        int i12 = i10 * i11;
        int i13 = qVar.f17644c;
        int i14 = this.f17645d;
        return i12 <= i13 * i14 ? new q(i13, (i14 * i13) / i10) : new q((i10 * i11) / i14, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f17644c == qVar.f17644c && this.f17645d == qVar.f17645d;
    }

    public q g(q qVar) {
        int i10 = this.f17644c;
        int i11 = qVar.f17645d;
        int i12 = i10 * i11;
        int i13 = qVar.f17644c;
        int i14 = this.f17645d;
        return i12 >= i13 * i14 ? new q(i13, (i14 * i13) / i10) : new q((i10 * i11) / i14, i11);
    }

    public int hashCode() {
        return (this.f17644c * 31) + this.f17645d;
    }

    public String toString() {
        return this.f17644c + "x" + this.f17645d;
    }
}
