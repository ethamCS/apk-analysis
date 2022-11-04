package hc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: a */
    private final ArrayList<Object> f11776a;

    public o0(int i10) {
        this.f11776a = new ArrayList<>(i10);
    }

    public void a(Object obj) {
        this.f11776a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length <= 0) {
                return;
            }
            ArrayList<Object> arrayList = this.f11776a;
            arrayList.ensureCapacity(arrayList.size() + objArr.length);
            Collections.addAll(this.f11776a, objArr);
        } else if (obj instanceof Collection) {
            this.f11776a.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                this.f11776a.add(obj2);
            }
        } else if (!(obj instanceof Iterator)) {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        } else {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                this.f11776a.add(it.next());
            }
        }
    }

    public int c() {
        return this.f11776a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f11776a.toArray(objArr);
    }
}
