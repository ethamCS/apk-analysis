package af;

import java.util.Iterator;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Laf/j;", "T", BuildConfig.FLAVOR, "value", "Ltb/e0;", "d", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "iterator", "f", "(Ljava/util/Iterator;Lxb/d;)Ljava/lang/Object;", "Laf/h;", "sequence", "e", "(Laf/h;Lxb/d;)Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public abstract class j<T> {
    public abstract Object d(T t10, xb.d<? super e0> dVar);

    public final Object e(h<? extends T> hVar, xb.d<? super e0> dVar) {
        Object c10;
        Object f10 = f(hVar.iterator(), dVar);
        c10 = yb.d.c();
        return f10 == c10 ? f10 : e0.f22152a;
    }

    public abstract Object f(Iterator<? extends T> it, xb.d<? super e0> dVar);
}
