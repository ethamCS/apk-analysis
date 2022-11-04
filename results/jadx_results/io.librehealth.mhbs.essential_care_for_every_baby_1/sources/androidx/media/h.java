package androidx.media;

import android.text.TextUtils;
/* loaded from: classes.dex */
class h implements f {

    /* renamed from: a */
    private String f286a;

    /* renamed from: b */
    private int f287b;

    /* renamed from: c */
    private int f288c;

    public h(String str, int i, int i2) {
        this.f286a = str;
        this.f287b = i;
        this.f288c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return TextUtils.equals(this.f286a, hVar.f286a) && this.f287b == hVar.f287b && this.f288c == hVar.f288c;
    }

    public int hashCode() {
        return b.c.g.a.a(this.f286a, Integer.valueOf(this.f287b), Integer.valueOf(this.f288c));
    }
}
