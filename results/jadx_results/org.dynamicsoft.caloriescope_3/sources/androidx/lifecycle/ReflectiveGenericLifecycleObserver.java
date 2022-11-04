package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.e;
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements f {

    /* renamed from: a */
    private final Object f974a;

    /* renamed from: b */
    private final a.C0041a f975b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f974a = obj;
        this.f975b = a.f977c.a(obj.getClass());
    }

    @Override // androidx.lifecycle.f
    public void a(h hVar, e.a aVar) {
        this.f975b.a(hVar, aVar, this.f974a);
    }
}
