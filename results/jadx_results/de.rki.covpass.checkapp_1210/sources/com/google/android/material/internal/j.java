package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
final class j {

    /* renamed from: n */
    static final int f7402n = 1;

    /* renamed from: a */
    private CharSequence f7403a;

    /* renamed from: b */
    private final TextPaint f7404b;

    /* renamed from: c */
    private final int f7405c;

    /* renamed from: e */
    private int f7407e;

    /* renamed from: l */
    private boolean f7414l;

    /* renamed from: d */
    private int f7406d = 0;

    /* renamed from: f */
    private Layout.Alignment f7408f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g */
    private int f7409g = Integer.MAX_VALUE;

    /* renamed from: h */
    private float f7410h = 0.0f;

    /* renamed from: i */
    private float f7411i = 1.0f;

    /* renamed from: j */
    private int f7412j = f7402n;

    /* renamed from: k */
    private boolean f7413k = true;

    /* renamed from: m */
    private TextUtils.TruncateAt f7415m = null;

    /* loaded from: classes.dex */
    static class a extends Exception {
    }

    private j(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f7403a = charSequence;
        this.f7404b = textPaint;
        this.f7405c = i10;
        this.f7407e = charSequence.length();
    }

    public static j b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new j(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f7403a == null) {
            this.f7403a = BuildConfig.FLAVOR;
        }
        int max = Math.max(0, this.f7405c);
        CharSequence charSequence = this.f7403a;
        if (this.f7409g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f7404b, max, this.f7415m);
        }
        int min = Math.min(charSequence.length(), this.f7407e);
        this.f7407e = min;
        if (this.f7414l && this.f7409g == 1) {
            this.f7408f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f7406d, min, this.f7404b, max);
        obtain.setAlignment(this.f7408f);
        obtain.setIncludePad(this.f7413k);
        obtain.setTextDirection(this.f7414l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f7415m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f7409g);
        float f10 = this.f7410h;
        if (f10 != 0.0f || this.f7411i != 1.0f) {
            obtain.setLineSpacing(f10, this.f7411i);
        }
        if (this.f7409g > 1) {
            obtain.setHyphenationFrequency(this.f7412j);
        }
        return obtain.build();
    }

    public j c(Layout.Alignment alignment) {
        this.f7408f = alignment;
        return this;
    }

    public j d(TextUtils.TruncateAt truncateAt) {
        this.f7415m = truncateAt;
        return this;
    }

    public j e(int i10) {
        this.f7412j = i10;
        return this;
    }

    public j f(boolean z10) {
        this.f7413k = z10;
        return this;
    }

    public j g(boolean z10) {
        this.f7414l = z10;
        return this;
    }

    public j h(float f10, float f11) {
        this.f7410h = f10;
        this.f7411i = f11;
        return this;
    }

    public j i(int i10) {
        this.f7409g = i10;
        return this;
    }
}
