package de.rki.covpass.commonapp.uielements;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import androidx.core.content.a;
import hc.t;
import j8.j;
import j8.p;
import k8.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u0006¨\u0006\u0013"}, d2 = {"Lde/rki/covpass/commonapp/uielements/RoundImageButton;", "Landroid/widget/RelativeLayout;", "Landroid/graphics/drawable/Drawable;", "drawable", "Ltb/e0;", "setIcon", BuildConfig.FLAVOR, "drawableId", "setBackground", "iconId", "description", "setContentDescription", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "defStyleAttributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class RoundImageButton extends RelativeLayout {

    /* renamed from: c */
    private final c f8601c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.e(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.e(context, "context");
        c d10 = c.d(LayoutInflater.from(context));
        t.d(d10, "inflate(LayoutInflater.from(context))");
        this.f8601c = d10;
        addView(d10.a());
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p.f14170v1, 0, 0);
        t.d(obtainStyledAttributes, "context.theme.obtainStyl…         0,\n            )");
        setIcon(obtainStyledAttributes.getResourceId(p.f14176x1, j.d_res_0x7f0700d5));
        setBackground(obtainStyledAttributes.getResourceId(p.f14173w1, j.b_res_0x7f070074));
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ RoundImageButton(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void setBackground(int i10) {
        setBackground(a.d(getContext(), i10));
    }

    private final void setIcon(Drawable drawable) {
        this.f8601c.f14714c.setImageDrawable(drawable);
    }

    public final void setContentDescription(int i10) {
        this.f8601c.f14713b.setContentDescription(getResources().getString(i10));
    }

    public final void setIcon(int i10) {
        setIcon(a.d(getContext(), i10));
    }
}
