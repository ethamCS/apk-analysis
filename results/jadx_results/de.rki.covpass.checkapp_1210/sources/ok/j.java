package ok;

import java.util.ArrayDeque;
/* loaded from: classes3.dex */
public class j<T> {

    /* renamed from: a */
    protected a<T> f18615a;

    /* renamed from: b */
    protected a<T> f18616b;

    /* renamed from: c */
    protected int f18617c;

    /* renamed from: d */
    protected final ArrayDeque<a<T>> f18618d = new ArrayDeque<>();

    /* loaded from: classes3.dex */
    public static class a<T> {

        /* renamed from: a */
        public a<T> f18619a;

        /* renamed from: b */
        public a<T> f18620b;

        /* renamed from: c */
        public T f18621c;

        public void a() {
            this.f18619a = null;
            this.f18620b = null;
            this.f18621c = null;
        }
    }

    public a<T> a() {
        return this.f18615a;
    }

    public a<T> b() {
        return this.f18616b;
    }

    public a<T> c(a<T> aVar, T t10) {
        a<T> f10 = f();
        f10.f18621c = t10;
        f10.f18620b = aVar;
        a<T> aVar2 = aVar.f18619a;
        f10.f18619a = aVar2;
        if (aVar2 != null) {
            aVar2.f18620b = f10;
        } else {
            this.f18616b = f10;
        }
        aVar.f18619a = f10;
        this.f18617c++;
        return f10;
    }

    public a<T> d(T t10) {
        a<T> f10 = f();
        f10.f18621c = t10;
        a<T> aVar = this.f18616b;
        if (aVar == null) {
            this.f18616b = f10;
            this.f18615a = f10;
        } else {
            f10.f18620b = aVar;
            aVar.f18619a = f10;
            this.f18616b = f10;
        }
        this.f18617c++;
        return f10;
    }

    public void e(a<T> aVar) {
        a<T> aVar2 = aVar.f18619a;
        a<T> aVar3 = aVar.f18620b;
        if (aVar2 == null) {
            this.f18616b = aVar3;
        } else {
            aVar2.f18620b = aVar3;
        }
        a<T> aVar4 = aVar.f18620b;
        if (aVar4 == null) {
            this.f18615a = aVar2;
        } else {
            aVar4.f18619a = aVar2;
        }
        this.f18617c--;
        aVar.a();
        this.f18618d.push(aVar);
    }

    protected a<T> f() {
        return this.f18618d.isEmpty() ? new a<>() : this.f18618d.pop();
    }

    public void g() {
        a<T> aVar = this.f18615a;
        while (aVar != null) {
            a<T> aVar2 = aVar.f18619a;
            aVar.a();
            this.f18618d.add(aVar);
            aVar = aVar2;
        }
        this.f18616b = null;
        this.f18615a = null;
        this.f18617c = 0;
    }

    public int h() {
        return this.f18617c;
    }
}
