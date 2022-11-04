package androidx.lifecycle;

import androidx.lifecycle.m;
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements s {

    /* renamed from: c */
    private final k[] f4248c;

    public CompositeGeneratedAdaptersObserver(k[] kVarArr) {
        this.f4248c = kVarArr;
    }

    @Override // androidx.lifecycle.s
    public void f(v vVar, m.b bVar) {
        c0 c0Var = new c0();
        for (k kVar : this.f4248c) {
            kVar.a(vVar, bVar, false, c0Var);
        }
        for (k kVar2 : this.f4248c) {
            kVar2.a(vVar, bVar, true, c0Var);
        }
    }
}
