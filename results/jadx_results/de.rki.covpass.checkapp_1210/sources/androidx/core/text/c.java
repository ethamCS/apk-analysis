package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
/* loaded from: classes.dex */
public class c implements Spannable {

    /* renamed from: x */
    private static final Object f3570x = new Object();

    /* renamed from: c */
    private final Spannable f3571c;

    /* renamed from: d */
    private final a f3572d;

    /* renamed from: q */
    private final PrecomputedText f3573q;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final TextPaint f3574a;

        /* renamed from: b */
        private final TextDirectionHeuristic f3575b;

        /* renamed from: c */
        private final int f3576c;

        /* renamed from: d */
        private final int f3577d;

        /* renamed from: e */
        final PrecomputedText.Params f3578e;

        /* renamed from: androidx.core.text.c$a$a */
        /* loaded from: classes.dex */
        public static class C0036a {

            /* renamed from: a */
            private final TextPaint f3579a;

            /* renamed from: c */
            private int f3581c = 1;

            /* renamed from: d */
            private int f3582d = 1;

            /* renamed from: b */
            private TextDirectionHeuristic f3580b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0036a(TextPaint textPaint) {
                this.f3579a = textPaint;
            }

            public a a() {
                return new a(this.f3579a, this.f3580b, this.f3581c, this.f3582d);
            }

            public C0036a b(int i10) {
                this.f3581c = i10;
                return this;
            }

            public C0036a c(int i10) {
                this.f3582d = i10;
                return this;
            }

            public C0036a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f3580b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f3574a = params.getTextPaint();
            this.f3575b = params.getTextDirection();
            this.f3576c = params.getBreakStrategy();
            this.f3577d = params.getHyphenationFrequency();
            this.f3578e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            this.f3578e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build() : null;
            this.f3574a = textPaint;
            this.f3575b = textDirectionHeuristic;
            this.f3576c = i10;
            this.f3577d = i11;
        }

        public boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (this.f3576c == aVar.b() && this.f3577d == aVar.c() && this.f3574a.getTextSize() == aVar.e().getTextSize() && this.f3574a.getTextScaleX() == aVar.e().getTextScaleX() && this.f3574a.getTextSkewX() == aVar.e().getTextSkewX() && this.f3574a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f3574a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f3574a.getFlags() == aVar.e().getFlags()) {
                if (i10 >= 24) {
                    if (!this.f3574a.getTextLocales().equals(aVar.e().getTextLocales())) {
                        return false;
                    }
                } else if (!this.f3574a.getTextLocale().equals(aVar.e().getTextLocale())) {
                    return false;
                }
                return this.f3574a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f3574a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f3576c;
        }

        public int c() {
            return this.f3577d;
        }

        public TextDirectionHeuristic d() {
            return this.f3575b;
        }

        public TextPaint e() {
            return this.f3574a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f3575b == aVar.d();
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? androidx.core.util.c.b(Float.valueOf(this.f3574a.getTextSize()), Float.valueOf(this.f3574a.getTextScaleX()), Float.valueOf(this.f3574a.getTextSkewX()), Float.valueOf(this.f3574a.getLetterSpacing()), Integer.valueOf(this.f3574a.getFlags()), this.f3574a.getTextLocales(), this.f3574a.getTypeface(), Boolean.valueOf(this.f3574a.isElegantTextHeight()), this.f3575b, Integer.valueOf(this.f3576c), Integer.valueOf(this.f3577d)) : androidx.core.util.c.b(Float.valueOf(this.f3574a.getTextSize()), Float.valueOf(this.f3574a.getTextScaleX()), Float.valueOf(this.f3574a.getTextSkewX()), Float.valueOf(this.f3574a.getLetterSpacing()), Integer.valueOf(this.f3574a.getFlags()), this.f3574a.getTextLocale(), this.f3574a.getTypeface(), Boolean.valueOf(this.f3574a.isElegantTextHeight()), this.f3575b, Integer.valueOf(this.f3576c), Integer.valueOf(this.f3577d));
        }

        public String toString() {
            StringBuilder sb2;
            Object textLocale;
            StringBuilder sb3 = new StringBuilder("{");
            sb3.append("textSize=" + this.f3574a.getTextSize());
            sb3.append(", textScaleX=" + this.f3574a.getTextScaleX());
            sb3.append(", textSkewX=" + this.f3574a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb3.append(", letterSpacing=" + this.f3574a.getLetterSpacing());
            sb3.append(", elegantTextHeight=" + this.f3574a.isElegantTextHeight());
            if (i10 >= 24) {
                sb2 = new StringBuilder();
                sb2.append(", textLocale=");
                textLocale = this.f3574a.getTextLocales();
            } else {
                sb2 = new StringBuilder();
                sb2.append(", textLocale=");
                textLocale = this.f3574a.getTextLocale();
            }
            sb2.append(textLocale);
            sb3.append(sb2.toString());
            sb3.append(", typeface=" + this.f3574a.getTypeface());
            if (i10 >= 26) {
                sb3.append(", variationSettings=" + this.f3574a.getFontVariationSettings());
            }
            sb3.append(", textDir=" + this.f3575b);
            sb3.append(", breakStrategy=" + this.f3576c);
            sb3.append(", hyphenationFrequency=" + this.f3577d);
            sb3.append("}");
            return sb3.toString();
        }
    }

    public a a() {
        return this.f3572d;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f3571c;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f3571c.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3571c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3571c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3571c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f3573q.getSpans(i10, i11, cls) : (T[]) this.f3571c.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3571c.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f3571c.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3573q.removeSpan(obj);
                return;
            } else {
                this.f3571c.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3573q.setSpan(obj, i10, i11, i12);
                return;
            } else {
                this.f3571c.setSpan(obj, i10, i11, i12);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f3571c.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f3571c.toString();
    }
}
