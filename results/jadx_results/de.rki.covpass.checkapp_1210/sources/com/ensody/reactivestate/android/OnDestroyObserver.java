package com.ensody.reactivestate.android;

import androidx.lifecycle.m;
import androidx.lifecycle.v;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ensody/reactivestate/android/OnDestroyObserver;", "Lcom/ensody/reactivestate/android/DisposableObserver;", "Landroidx/lifecycle/v;", "owner", "Ltb/e0;", "onDestroy", BuildConfig.FLAVOR, "d", "Z", "once", "Landroidx/lifecycle/m;", "lifecycle", "Lkotlin/Function0;", "block", "<init>", "(Landroidx/lifecycle/m;ZLgc/a;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class OnDestroyObserver extends DisposableObserver {

    /* renamed from: d */
    private final boolean f6737d;

    /* renamed from: q */
    private final gc.a<e0> f6738q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnDestroyObserver(m mVar, boolean z10, gc.a<e0> aVar) {
        super(mVar);
        t.e(mVar, "lifecycle");
        t.e(aVar, "block");
        this.f6737d = z10;
        this.f6738q = aVar;
    }

    @Override // com.ensody.reactivestate.android.DisposableObserver, androidx.lifecycle.j
    public void onDestroy(v vVar) {
        t.e(vVar, "owner");
        this.f6738q.invoke();
        if (this.f6737d) {
            g();
        }
    }
}
