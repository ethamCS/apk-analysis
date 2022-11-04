package b.g.j;

import android.annotation.SuppressLint;
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
    private final Spannable f2469b;

    /* renamed from: c */
    private final a f2470c;

    /* renamed from: d */
    private final PrecomputedText f2471d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final TextPaint f2472a;

        /* renamed from: b */
        private final TextDirectionHeuristic f2473b;

        /* renamed from: c */
        private final int f2474c;

        /* renamed from: d */
        private final int f2475d;

        /* renamed from: b.g.j.c$a$a */
        /* loaded from: classes.dex */
        public static class C0049a {

            /* renamed from: a */
            private final TextPaint f2476a;

            /* renamed from: b */
            private TextDirectionHeuristic f2477b;

            /* renamed from: c */
            private int f2478c;

            /* renamed from: d */
            private int f2479d;

            public C0049a(TextPaint textPaint) {
                this.f2476a = textPaint;
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    this.f2478c = 1;
                    this.f2479d = 1;
                } else {
                    this.f2479d = 0;
                    this.f2478c = 0;
                }
                this.f2477b = i >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public a a() {
                return new a(this.f2476a, this.f2477b, this.f2478c, this.f2479d);
            }

            public C0049a b(int i) {
                this.f2478c = i;
                return this;
            }

            public C0049a c(int i) {
                this.f2479d = i;
                return this;
            }

            public C0049a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2477b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f2472a = params.getTextPaint();
            this.f2473b = params.getTextDirection();
            this.f2474c = params.getBreakStrategy();
            this.f2475d = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }

        @SuppressLint({"NewApi"})
        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f2472a = textPaint;
            this.f2473b = textDirectionHeuristic;
            this.f2474c = i;
            this.f2475d = i2;
        }

        public boolean a(a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i < 23 || (this.f2474c == aVar.b() && this.f2475d == aVar.c())) && this.f2472a.getTextSize() == aVar.e().getTextSize() && this.f2472a.getTextScaleX() == aVar.e().getTextScaleX() && this.f2472a.getTextSkewX() == aVar.e().getTextSkewX()) {
                if ((i >= 21 && (this.f2472a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f2472a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) || this.f2472a.getFlags() != aVar.e().getFlags()) {
                    return false;
                }
                if (i >= 24) {
                    if (!this.f2472a.getTextLocales().equals(aVar.e().getTextLocales())) {
                        return false;
                    }
                } else if (i >= 17 && !this.f2472a.getTextLocale().equals(aVar.e().getTextLocale())) {
                    return false;
                }
                return this.f2472a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f2472a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f2474c;
        }

        public int c() {
            return this.f2475d;
        }

        public TextDirectionHeuristic d() {
            return this.f2473b;
        }

        public TextPaint e() {
            return this.f2472a;
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
            return Build.VERSION.SDK_INT < 18 || this.f2473b == aVar.d();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return b.g.k.c.b(Float.valueOf(this.f2472a.getTextSize()), Float.valueOf(this.f2472a.getTextScaleX()), Float.valueOf(this.f2472a.getTextSkewX()), Float.valueOf(this.f2472a.getLetterSpacing()), Integer.valueOf(this.f2472a.getFlags()), this.f2472a.getTextLocales(), this.f2472a.getTypeface(), Boolean.valueOf(this.f2472a.isElegantTextHeight()), this.f2473b, Integer.valueOf(this.f2474c), Integer.valueOf(this.f2475d));
            }
            if (i >= 21) {
                return b.g.k.c.b(Float.valueOf(this.f2472a.getTextSize()), Float.valueOf(this.f2472a.getTextScaleX()), Float.valueOf(this.f2472a.getTextSkewX()), Float.valueOf(this.f2472a.getLetterSpacing()), Integer.valueOf(this.f2472a.getFlags()), this.f2472a.getTextLocale(), this.f2472a.getTypeface(), Boolean.valueOf(this.f2472a.isElegantTextHeight()), this.f2473b, Integer.valueOf(this.f2474c), Integer.valueOf(this.f2475d));
            }
            if (i < 18 && i < 17) {
                return b.g.k.c.b(Float.valueOf(this.f2472a.getTextSize()), Float.valueOf(this.f2472a.getTextScaleX()), Float.valueOf(this.f2472a.getTextSkewX()), Integer.valueOf(this.f2472a.getFlags()), this.f2472a.getTypeface(), this.f2473b, Integer.valueOf(this.f2474c), Integer.valueOf(this.f2475d));
            }
            return b.g.k.c.b(Float.valueOf(this.f2472a.getTextSize()), Float.valueOf(this.f2472a.getTextScaleX()), Float.valueOf(this.f2472a.getTextSkewX()), Integer.valueOf(this.f2472a.getFlags()), this.f2472a.getTextLocale(), this.f2472a.getTypeface(), this.f2473b, Integer.valueOf(this.f2474c), Integer.valueOf(this.f2475d));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00df  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 325
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b.g.j.c.a.toString():java.lang.String");
        }
    }

    public a a() {
        return this.f2470c;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f2469b;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f2469b.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f2469b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f2469b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f2469b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f2471d.getSpans(i, i2, cls) : (T[]) this.f2469b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f2469b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2469b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2471d.removeSpan(obj);
                return;
            } else {
                this.f2469b.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2471d.setSpan(obj, i, i2, i3);
                return;
            } else {
                this.f2469b.setSpan(obj, i, i2, i3);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f2469b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f2469b.toString();
    }
}
