package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;
/* loaded from: classes.dex */
public class b0 extends ToggleButton {

    /* renamed from: b */
    private final y f655b;

    public b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public b0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        y yVar = new y(this);
        this.f655b = yVar;
        yVar.a(attributeSet, i);
    }
}
