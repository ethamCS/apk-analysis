package androidx.media;

import java.util.Arrays;
/* loaded from: classes.dex */
class c implements a {

    /* renamed from: a */
    int f1267a = 0;

    /* renamed from: b */
    int f1268b = 0;

    /* renamed from: c */
    int f1269c = 0;

    /* renamed from: d */
    int f1270d = -1;

    public int a() {
        return this.f1268b;
    }

    public int b() {
        int i = this.f1269c;
        int c2 = c();
        if (c2 == 6) {
            i |= 4;
        } else if (c2 == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int c() {
        int i = this.f1270d;
        return i != -1 ? i : AudioAttributesCompat.a(false, this.f1269c, this.f1267a);
    }

    public int d() {
        return this.f1267a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1268b == cVar.a() && this.f1269c == cVar.b() && this.f1267a == cVar.d() && this.f1270d == cVar.f1270d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1268b), Integer.valueOf(this.f1269c), Integer.valueOf(this.f1267a), Integer.valueOf(this.f1270d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1270d != -1) {
            sb.append(" stream=");
            sb.append(this.f1270d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f1267a));
        sb.append(" content=");
        sb.append(this.f1268b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1269c).toUpperCase());
        return sb.toString();
    }
}
