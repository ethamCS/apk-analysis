package z6;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
final class c {

    /* renamed from: a */
    private final List<b> f26492a;

    /* renamed from: b */
    private final int f26493b;

    /* renamed from: c */
    private final boolean f26494c;

    public c(List<b> list, int i10, boolean z10) {
        this.f26492a = new ArrayList(list);
        this.f26493b = i10;
        this.f26494c = z10;
    }

    public List<b> a() {
        return this.f26492a;
    }

    public int b() {
        return this.f26493b;
    }

    public boolean c(List<b> list) {
        return this.f26492a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f26492a.equals(cVar.f26492a) && this.f26494c == cVar.f26494c;
    }

    public int hashCode() {
        return this.f26492a.hashCode() ^ Boolean.valueOf(this.f26494c).hashCode();
    }

    public String toString() {
        return "{ " + this.f26492a + " }";
    }
}
