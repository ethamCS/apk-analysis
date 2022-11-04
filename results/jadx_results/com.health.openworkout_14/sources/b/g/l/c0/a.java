package b.g.l.c0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: b */
    private final int f2520b;

    /* renamed from: c */
    private final c f2521c;

    /* renamed from: d */
    private final int f2522d;

    public a(int i, c cVar, int i2) {
        this.f2520b = i;
        this.f2521c = cVar;
        this.f2522d = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2520b);
        this.f2521c.R(this.f2522d, bundle);
    }
}
