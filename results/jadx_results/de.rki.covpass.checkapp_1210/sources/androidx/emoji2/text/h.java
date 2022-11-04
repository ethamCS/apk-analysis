package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* loaded from: classes.dex */
public abstract class h extends ReplacementSpan {

    /* renamed from: d */
    private final f f3872d;

    /* renamed from: c */
    private final Paint.FontMetricsInt f3871c = new Paint.FontMetricsInt();

    /* renamed from: q */
    private short f3873q = -1;

    /* renamed from: x */
    private short f3874x = -1;

    /* renamed from: y */
    private float f3875y = 1.0f;

    public h(f fVar) {
        androidx.core.util.h.h(fVar, "metadata cannot be null");
        this.f3872d = fVar;
    }

    public final f a() {
        return this.f3872d;
    }

    public final int b() {
        return this.f3873q;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f3871c);
        Paint.FontMetricsInt fontMetricsInt2 = this.f3871c;
        this.f3875y = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f3872d.e();
        this.f3874x = (short) (this.f3872d.e() * this.f3875y);
        short i12 = (short) (this.f3872d.i() * this.f3875y);
        this.f3873q = i12;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f3871c;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i12;
    }
}
