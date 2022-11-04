package androidx.lifecycle;

import androidx.lifecycle.v0;
/* loaded from: classes.dex */
public final /* synthetic */ class w0 {
    static {
        v0.b.a aVar = v0.b.Companion;
    }

    public static s0 a(v0.b bVar, Class cls) {
        hc.t.e(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static s0 b(v0.b bVar, Class cls, e1.a aVar) {
        hc.t.e(cls, "modelClass");
        hc.t.e(aVar, "extras");
        return bVar.a(cls);
    }
}
