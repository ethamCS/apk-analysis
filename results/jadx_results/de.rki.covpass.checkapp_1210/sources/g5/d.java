package g5;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
/* loaded from: classes.dex */
public interface d {

    /* loaded from: classes.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b */
        public static final TypeEvaluator<e> f10533b = new b();

        /* renamed from: a */
        private final e f10534a = new e();

        /* renamed from: a */
        public e evaluate(float f10, e eVar, e eVar2) {
            this.f10534a.a(n5.a.c(eVar.f10537a, eVar2.f10537a, f10), n5.a.c(eVar.f10538b, eVar2.f10538b, f10), n5.a.c(eVar.f10539c, eVar2.f10539c, f10));
            return this.f10534a;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<d, e> {

        /* renamed from: a */
        public static final Property<d, e> f10535a = new c("circularReveal");

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

    /* renamed from: g5.d$d */
    /* loaded from: classes.dex */
    public static class C0154d extends Property<d, Integer> {

        /* renamed from: a */
        public static final Property<d, Integer> f10536a = new C0154d("circularRevealScrimColor");

        private C0154d(String str) {
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
        public float f10537a;

        /* renamed from: b */
        public float f10538b;

        /* renamed from: c */
        public float f10539c;

        private e() {
        }

        public e(float f10, float f11, float f12) {
            this.f10537a = f10;
            this.f10538b = f11;
            this.f10539c = f12;
        }

        public void a(float f10, float f11, float f12) {
            this.f10537a = f10;
            this.f10538b = f11;
            this.f10539c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
