package de.rki.covpass.commonapp.uielements;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.accessibility.d;
import androidx.core.view.y;
import androidx.core.widget.j;
import hc.t;
import j8.o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lde/rki/covpass/commonapp/uielements/CenteredTitleToolbar;", "Landroidx/appcompat/widget/Toolbar;", "Landroid/widget/TextView;", "getCenteredTextView", BuildConfig.FLAVOR, "resId", "Ltb/e0;", "setTitle", BuildConfig.FLAVOR, "title", "G4", "Landroid/widget/TextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class CenteredTitleToolbar extends Toolbar {
    private final TextView G4;

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"de/rki/covpass/commonapp/uielements/CenteredTitleToolbar$a", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/d;", "info", "Ltb/e0;", "g", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, d dVar) {
            t.e(view, "host");
            t.e(dVar, "info");
            super.g(view, dVar);
            dVar.g0(true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CenteredTitleToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.e(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenteredTitleToolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.e(context, "context");
        TextView textView = new TextView(context);
        this.G4 = textView;
        j.o(textView, o.e_res_0x7f11012d);
        y.o0(textView, new a());
        addView(textView);
    }

    public /* synthetic */ CenteredTitleToolbar(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final TextView getCenteredTextView() {
        TextView textView = this.G4;
        textView.setGravity(17);
        Toolbar.e eVar = new Toolbar.e(-2, -2);
        eVar.f706a = 17;
        textView.setLayoutParams(eVar);
        return textView;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(int i10) {
        getCenteredTextView().setText(i10);
        requestLayout();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        getCenteredTextView().setText(charSequence);
    }
}
