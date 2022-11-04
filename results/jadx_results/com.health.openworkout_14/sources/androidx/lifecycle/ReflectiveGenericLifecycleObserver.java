package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.e;
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements g {

    /* renamed from: a */
    private final Object f1215a;

    /* renamed from: b */
    private final a.C0019a f1216b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1215a = obj;
        this.f1216b = a.f1222c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.g
    public void d(i iVar, e.a aVar) {
        this.f1216b.a(iVar, aVar, this.f1215a);
    }
}
