package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: c */
    private final int f3606c;

    /* renamed from: d */
    private final d f3607d;

    /* renamed from: q */
    private final int f3608q;

    public a(int i10, d dVar, int i11) {
        this.f3606c = i10;
        this.f3607d = dVar;
        this.f3608q = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3606c);
        this.f3607d.N(this.f3608q, bundle);
    }
}
