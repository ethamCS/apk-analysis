package a.g.l.d0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: b */
    private final int f259b;

    /* renamed from: c */
    private final c f260c;
    private final int d;

    public a(int i, c cVar, int i2) {
        this.f259b = i;
        this.f260c = cVar;
        this.d = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f259b);
        this.f260c.a(this.d, bundle);
    }
}
