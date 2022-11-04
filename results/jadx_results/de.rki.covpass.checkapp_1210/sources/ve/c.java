package ve;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public abstract class c<T> implements Iterable<T>, ic.a {
    private c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a();

    public abstract void b(int i10, T t10);

    public abstract T get(int i10);

    @Override // java.lang.Iterable
    public abstract Iterator<T> iterator();
}
