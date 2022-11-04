package androidx.lifecycle;

import androidx.lifecycle.c;
import androidx.lifecycle.m;
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements s {

    /* renamed from: c */
    private final Object f4276c;

    /* renamed from: d */
    private final c.a f4277d;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4276c = obj;
        this.f4277d = c.f4303c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.s
    public void f(v vVar, m.b bVar) {
        this.f4277d.a(vVar, bVar, this.f4276c);
    }
}
