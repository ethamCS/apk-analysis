package b.a.a.a.r;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
/* loaded from: classes.dex */
public interface d {

    /* loaded from: classes.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b */
        public static final TypeEvaluator<e> f1235b = new b();

        /* renamed from: a */
        private final e f1236a = new e();

        /* renamed from: a */
        public e evaluate(float f, e eVar, e eVar2) {
            this.f1236a.a(b.a.a.a.w.a.a(eVar.f1239a, eVar2.f1239a, f), b.a.a.a.w.a.a(eVar.f1240b, eVar2.f1240b, f), b.a.a.a.w.a.a(eVar.f1241c, eVar2.f1241c, f));
            return this.f1236a;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<d, e> {

        /* renamed from: a */
        public static final Property<d, e> f1237a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        /* renamed from: a */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: a */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: b.a.a.a.r.d$d */
    /* loaded from: classes.dex */
    public static class C0053d extends Property<d, Integer> {

        /* renamed from: a */
        public static final Property<d, Integer> f1238a = new C0053d("circularRevealScrimColor");

        private C0053d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public float f1239a;

        /* renamed from: b */
        public float f1240b;

        /* renamed from: c */
        public float f1241c;

        private e() {
        }

        public e(float f, float f2, float f3) {
            this.f1239a = f;
            this.f1240b = f2;
            this.f1241c = f3;
        }

        public void a(float f, float f2, float f3) {
            this.f1239a = f;
            this.f1240b = f2;
            this.f1241c = f3;
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
