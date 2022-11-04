package androidx.camera.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a */
    private final List<w1> f2303a;

    /* renamed from: b */
    private final List<w1> f2304b;

    /* renamed from: c */
    private final List<w1> f2305c;

    /* renamed from: d */
    private final long f2306d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final List<w1> f2307a = new ArrayList();

        /* renamed from: b */
        final List<w1> f2308b = new ArrayList();

        /* renamed from: c */
        final List<w1> f2309c = new ArrayList();

        /* renamed from: d */
        long f2310d = 5000;

        public a(w1 w1Var, int i10) {
            a(w1Var, i10);
        }

        public a a(w1 w1Var, int i10) {
            boolean z10 = false;
            androidx.core.util.h.b(w1Var != null, "Point cannot be null.");
            if (i10 >= 1 && i10 <= 7) {
                z10 = true;
            }
            androidx.core.util.h.b(z10, "Invalid metering mode " + i10);
            if ((i10 & 1) != 0) {
                this.f2307a.add(w1Var);
            }
            if ((i10 & 2) != 0) {
                this.f2308b.add(w1Var);
            }
            if ((i10 & 4) != 0) {
                this.f2309c.add(w1Var);
            }
            return this;
        }

        public i0 b() {
            return new i0(this);
        }
    }

    i0(a aVar) {
        this.f2303a = Collections.unmodifiableList(aVar.f2307a);
        this.f2304b = Collections.unmodifiableList(aVar.f2308b);
        this.f2305c = Collections.unmodifiableList(aVar.f2309c);
        this.f2306d = aVar.f2310d;
    }

    public long a() {
        return this.f2306d;
    }

    public List<w1> b() {
        return this.f2304b;
    }

    public List<w1> c() {
        return this.f2303a;
    }

    public List<w1> d() {
        return this.f2305c;
    }

    public boolean e() {
        return this.f2306d > 0;
    }
}
