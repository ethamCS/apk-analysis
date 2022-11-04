package a.g.j;

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

    /* renamed from: b */
    private final Spannable f225b;

    /* renamed from: c */
    private final a f226c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final TextPaint f227a;

        /* renamed from: b */
        private final TextDirectionHeuristic f228b;

        /* renamed from: c */
        private final int f229c;
        private final int d;
        final PrecomputedText.Params e = null;

        /* renamed from: a.g.j.c$a$a */
        /* loaded from: classes.dex */
        public static class C0012a {

            /* renamed from: a */
            private final TextPaint f230a;

            /* renamed from: b */
            private TextDirectionHeuristic f231b;

            /* renamed from: c */
            private int f232c;
            private int d;

            public C0012a(TextPaint textPaint) {
                this.f230a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f232c = 1;
                    this.d = 1;
                } else {
                    this.d = 0;
                    this.f232c = 0;
                }
                this.f231b = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public C0012a a(int i) {
                this.f232c = i;
                return this;
            }

            public C0012a a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f231b = textDirectionHeuristic;
                return this;
            }

            public a a() {
                return new a(this.f230a, this.f231b, this.f232c, this.d);
            }

            public C0012a b(int i) {
                this.d = i;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f227a = params.getTextPaint();
            this.f228b = params.getTextDirection();
            this.f229c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f227a = textPaint;
            this.f228b = textDirectionHeuristic;
            this.f229c = i;
            this.d = i2;
        }

        public int a() {
            return this.f229c;
        }

        public boolean a(a aVar) {
            PrecomputedText.Params params = this.e;
            if (params != null) {
                return params.equals(aVar.e);
            }
            if ((Build.VERSION.SDK_INT >= 23 && (this.f229c != aVar.a() || this.d != aVar.b())) || this.f227a.getTextSize() != aVar.d().getTextSize() || this.f227a.getTextScaleX() != aVar.d().getTextScaleX() || this.f227a.getTextSkewX() != aVar.d().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f227a.getLetterSpacing() != aVar.d().getLetterSpacing() || !TextUtils.equals(this.f227a.getFontFeatureSettings(), aVar.d().getFontFeatureSettings()))) || this.f227a.getFlags() != aVar.d().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f227a.getTextLocales().equals(aVar.d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f227a.getTextLocale().equals(aVar.d().getTextLocale())) {
                return false;
            }
            return this.f227a.getTypeface() == null ? aVar.d().getTypeface() == null : this.f227a.getTypeface().equals(aVar.d().getTypeface());
        }

        public int b() {
            return this.d;
        }

        public TextDirectionHeuristic c() {
            return this.f228b;
        }

        public TextPaint d() {
            return this.f227a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f228b == aVar.c();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return a.g.k.c.a(Float.valueOf(this.f227a.getTextSize()), Float.valueOf(this.f227a.getTextScaleX()), Float.valueOf(this.f227a.getTextSkewX()), Float.valueOf(this.f227a.getLetterSpacing()), Integer.valueOf(this.f227a.getFlags()), this.f227a.getTextLocales(), this.f227a.getTypeface(), Boolean.valueOf(this.f227a.isElegantTextHeight()), this.f228b, Integer.valueOf(this.f229c), Integer.valueOf(this.d));
            }
            if (i >= 21) {
                return a.g.k.c.a(Float.valueOf(this.f227a.getTextSize()), Float.valueOf(this.f227a.getTextScaleX()), Float.valueOf(this.f227a.getTextSkewX()), Float.valueOf(this.f227a.getLetterSpacing()), Integer.valueOf(this.f227a.getFlags()), this.f227a.getTextLocale(), this.f227a.getTypeface(), Boolean.valueOf(this.f227a.isElegantTextHeight()), this.f228b, Integer.valueOf(this.f229c), Integer.valueOf(this.d));
            }
            if (i < 18 && i < 17) {
                return a.g.k.c.a(Float.valueOf(this.f227a.getTextSize()), Float.valueOf(this.f227a.getTextScaleX()), Float.valueOf(this.f227a.getTextSkewX()), Integer.valueOf(this.f227a.getFlags()), this.f227a.getTypeface(), this.f228b, Integer.valueOf(this.f229c), Integer.valueOf(this.d));
            }
            return a.g.k.c.a(Float.valueOf(this.f227a.getTextSize()), Float.valueOf(this.f227a.getTextScaleX()), Float.valueOf(this.f227a.getTextSkewX()), Integer.valueOf(this.f227a.getFlags()), this.f227a.getTextLocale(), this.f227a.getTypeface(), this.f228b, Integer.valueOf(this.f229c), Integer.valueOf(this.d));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00e3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a.g.j.c.a.toString():java.lang.String");
        }
    }

    public a a() {
        return this.f226c;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f225b.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f225b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f225b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f225b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f225b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f225b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f225b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f225b.removeSpan(obj);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f225b.setSpan(obj, i, i2, i3);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f225b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f225b.toString();
    }
}
