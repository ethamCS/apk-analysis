package com.ensody.reactivestate.android;

import androidx.lifecycle.m;
import androidx.lifecycle.v;
import hc.t;
import kotlin.Metadata;
import kotlinx.coroutines.h1;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\"\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ensody/reactivestate/android/DisposableObserver;", "Landroidx/lifecycle/f;", "Lkotlinx/coroutines/h1;", "Lcom/ensody/reactivestate/Disposable;", "Ltb/e0;", "g", "Landroidx/lifecycle/m;", "c", "Landroidx/lifecycle/m;", "lifecycle", "<init>", "(Landroidx/lifecycle/m;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
abstract class DisposableObserver implements androidx.lifecycle.f, h1 {

    /* renamed from: c */
    private final m f6734c;

    public DisposableObserver(m mVar) {
        t.e(mVar, "lifecycle");
        this.f6734c = mVar;
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void c(v vVar) {
        androidx.lifecycle.e.a(this, vVar);
    }

    @Override // kotlinx.coroutines.h1
    public void g() {
        this.f6734c.c(this);
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void onDestroy(v vVar) {
        androidx.lifecycle.e.b(this, vVar);
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void onPause(v vVar) {
        androidx.lifecycle.e.c(this, vVar);
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void onResume(v vVar) {
        androidx.lifecycle.e.d(this, vVar);
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void onStart(v vVar) {
        androidx.lifecycle.e.e(this, vVar);
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void onStop(v vVar) {
        androidx.lifecycle.e.f(this, vVar);
    }
}
