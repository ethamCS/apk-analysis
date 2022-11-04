package androidx.camera.core;

import android.util.Rational;
/* loaded from: classes.dex */
public final class i3 {

    /* renamed from: a */
    private int f2315a;

    /* renamed from: b */
    private Rational f2316b;

    /* renamed from: c */
    private int f2317c;

    /* renamed from: d */
    private int f2318d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b */
        private final Rational f2320b;

        /* renamed from: c */
        private final int f2321c;

        /* renamed from: a */
        private int f2319a = 1;

        /* renamed from: d */
        private int f2322d = 0;

        public a(Rational rational, int i10) {
            this.f2320b = rational;
            this.f2321c = i10;
        }

        public i3 a() {
            androidx.core.util.h.h(this.f2320b, "The crop aspect ratio must be set.");
            return new i3(this.f2319a, this.f2320b, this.f2321c, this.f2322d);
        }

        public a b(int i10) {
            this.f2322d = i10;
            return this;
        }

        public a c(int i10) {
            this.f2319a = i10;
            return this;
        }
    }

    i3(int i10, Rational rational, int i11, int i12) {
        this.f2315a = i10;
        this.f2316b = rational;
        this.f2317c = i11;
        this.f2318d = i12;
    }

    public Rational a() {
        return this.f2316b;
    }

    public int b() {
        return this.f2318d;
    }

    public int c() {
        return this.f2317c;
    }

    public int d() {
        return this.f2315a;
    }
}
