package androidx.media;

import java.util.Arrays;
/* loaded from: classes.dex */
class c implements a {

    /* renamed from: a */
    int f280a = 0;

    /* renamed from: b */
    int f281b = 0;

    /* renamed from: c */
    int f282c = 0;

    /* renamed from: d */
    int f283d = -1;

    public int a() {
        return this.f281b;
    }

    public int b() {
        int i = this.f282c;
        int c2 = c();
        if (c2 == 6) {
            i |= 4;
        } else if (c2 == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int c() {
        int i = this.f283d;
        return i != -1 ? i : AudioAttributesCompat.a(false, this.f282c, this.f280a);
    }

    public int d() {
        return this.f280a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f281b == cVar.a() && this.f282c == cVar.b() && this.f280a == cVar.d() && this.f283d == cVar.f283d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f281b), Integer.valueOf(this.f282c), Integer.valueOf(this.f280a), Integer.valueOf(this.f283d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f283d != -1) {
            sb.append(" stream=");
            sb.append(this.f283d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f280a));
        sb.append(" content=");
        sb.append(this.f281b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f282c).toUpperCase());
        return sb.toString();
    }
}
