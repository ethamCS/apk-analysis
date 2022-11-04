package com.ensody.reactivestate.android;

import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import hc.t;
import hc.v;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/lifecycle/y0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class k extends v implements gc.a<y0> {

    /* renamed from: c */
    final /* synthetic */ gc.a f6794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(gc.a aVar) {
        super(0);
        this.f6794c = aVar;
    }

    /* renamed from: b */
    public final y0 invoke() {
        y0 I = ((z0) this.f6794c.invoke()).I();
        t.d(I, "ownerProducer().viewModelStore");
        return I;
    }
}
