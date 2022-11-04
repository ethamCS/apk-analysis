package rc;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¨\u0006\u0006"}, d2 = {BuildConfig.FLAVOR, "T", "Ljava/lang/Class;", "jClass", "Lrc/h;", "a", "kotlin-reflection"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private static ze.b<String, Object> f20632a;

    static {
        ze.b<String, Object> b10 = ze.b.b();
        hc.t.d(b10, "empty<String, Any>()");
        f20632a = b10;
    }

    public static final <T> h<T> a(Class<T> cls) {
        h<T> hVar;
        ze.b<String, Object> f10;
        String str;
        hc.t.e(cls, "jClass");
        String name = cls.getName();
        Object c10 = f20632a.c(name);
        Class<T> cls2 = null;
        if (c10 instanceof WeakReference) {
            h<T> hVar2 = (h) ((WeakReference) c10).get();
            if (hVar2 != null) {
                cls2 = hVar2.a();
            }
            if (hc.t.a(cls2, cls)) {
                return hVar2;
            }
        } else if (c10 != null) {
            for (WeakReference weakReference : (WeakReference[]) c10) {
                h<T> hVar3 = (h) weakReference.get();
                if (hc.t.a(hVar3 != null ? hVar3.a() : null, cls)) {
                    return hVar3;
                }
            }
            int length = ((Object[]) c10).length;
            WeakReference[] weakReferenceArr = new WeakReference[length + 1];
            System.arraycopy(c10, 0, weakReferenceArr, 0, length);
            hVar = new h<>(cls);
            weakReferenceArr[length] = new WeakReference(hVar);
            f10 = f20632a.f(name, weakReferenceArr);
            str = "K_CLASS_CACHE.plus(name, newArray)";
            hc.t.d(f10, str);
            f20632a = f10;
            return hVar;
        }
        hVar = new h<>(cls);
        f10 = f20632a.f(name, new WeakReference(hVar));
        str = "K_CLASS_CACHE.plus(name, WeakReference(newKClass))";
        hc.t.d(f10, str);
        f20632a = f10;
        return hVar;
    }
}
