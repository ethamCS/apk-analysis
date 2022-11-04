package com.ensody.reactivestate.android;

import androidx.lifecycle.v;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ensody/reactivestate/android/OnResumeObserver;", "Lcom/ensody/reactivestate/android/DisposableObserver;", "Landroidx/lifecycle/v;", "owner", "Ltb/e0;", "onResume", BuildConfig.FLAVOR, "d", "Z", "once", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class OnResumeObserver extends DisposableObserver {

    /* renamed from: d */
    private final boolean f6741d;

    /* renamed from: q */
    private final gc.a<e0> f6742q;

    @Override // com.ensody.reactivestate.android.DisposableObserver, androidx.lifecycle.j
    public void onResume(v vVar) {
        t.e(vVar, "owner");
        this.f6742q.invoke();
        if (this.f6741d) {
            g();
        }
    }
}
