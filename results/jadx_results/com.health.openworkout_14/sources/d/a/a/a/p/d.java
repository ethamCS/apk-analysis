package d.a.a.a.p;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
/* loaded from: classes.dex */
public interface d {

    /* loaded from: classes.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b */
        public static final TypeEvaluator<e> f3670b = new b();

        /* renamed from: a */
        private final e f3671a = new e();

        /* renamed from: a */
        public e evaluate(float f2, e eVar, e eVar2) {
            this.f3671a.a(d.a.a.a.v.a.c(eVar.f3674a, eVar2.f3674a, f2), d.a.a.a.v.a.c(eVar.f3675b, eVar2.f3675b, f2), d.a.a.a.v.a.c(eVar.f3676c, eVar2.f3676c, f2));
            return this.f3671a;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<d, e> {

        /* renamed from: a */
        public static final Property<d, e> f3672a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        /* renamed from: a */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: d.a.a.a.p.d$d */
    /* loaded from: classes.dex */
    public static class C0102d extends Property<d, Integer> {

        /* renamed from: a */
        public static final Property<d, Integer> f3673a = new C0102d("circularRevealScrimColor");

        private C0102d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public float f3674a;

        /* renamed from: b */
        public float f3675b;

        /* renamed from: c */
        public float f3676c;

        private e() {
        }

        public e(float f2, float f3, float f4) {
            this.f3674a = f2;
            this.f3675b = f3;
            this.f3676c = f4;
        }

        public void a(float f2, float f3, float f4) {
            this.f3674a = f2;
            this.f3675b = f3;
            this.f3676c = f4;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
