package d4;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a */
    List<T> f8335a = new ArrayList();

    /* renamed from: b */
    AbstractC0119a<T> f8336b;

    /* renamed from: d4.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0119a<T> {
        T a();
    }

    public a(AbstractC0119a<T> abstractC0119a) {
        this.f8336b = abstractC0119a;
    }

    public synchronized T a() {
        if (this.f8335a.isEmpty()) {
            return this.f8336b.a();
        }
        List<T> list = this.f8335a;
        return list.remove(list.size() - 1);
    }

    public synchronized void b(T t10) {
        this.f8335a.add(t10);
    }
}
