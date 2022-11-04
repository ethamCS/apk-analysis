package yd;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes3.dex */
public class n extends AbstractList<String> implements RandomAccess, o {

    /* renamed from: d */
    public static final o f26161d = new n().g();

    /* renamed from: c */
    private final List<Object> f26162c;

    public n() {
        this.f26162c = new ArrayList();
    }

    public n(o oVar) {
        this.f26162c = new ArrayList(oVar.size());
        addAll(oVar);
    }

    private static d b(Object obj) {
        return obj instanceof d ? (d) obj : obj instanceof String ? d.f((String) obj) : d.d((byte[]) obj);
    }

    private static String c(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof d ? ((d) obj).D() : j.b((byte[]) obj);
    }

    /* renamed from: a */
    public void add(int i10, String str) {
        this.f26162c.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        if (collection instanceof o) {
            collection = ((o) collection).j();
        }
        boolean addAll = this.f26162c.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f26162c.clear();
        ((AbstractList) this).modCount++;
    }

    /* renamed from: d */
    public String get(int i10) {
        Object obj = this.f26162c.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String D = dVar.D();
            if (dVar.n()) {
                this.f26162c.set(i10, D);
            }
            return D;
        }
        byte[] bArr = (byte[]) obj;
        String b10 = j.b(bArr);
        if (j.a(bArr)) {
            this.f26162c.set(i10, b10);
        }
        return b10;
    }

    /* renamed from: e */
    public String remove(int i10) {
        Object remove = this.f26162c.remove(i10);
        ((AbstractList) this).modCount++;
        return c(remove);
    }

    /* renamed from: f */
    public String set(int i10, String str) {
        return c(this.f26162c.set(i10, str));
    }

    @Override // yd.o
    public o g() {
        return new x(this);
    }

    @Override // yd.o
    public List<?> j() {
        return Collections.unmodifiableList(this.f26162c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26162c.size();
    }

    @Override // yd.o
    public void v(d dVar) {
        this.f26162c.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // yd.o
    public d x(int i10) {
        Object obj = this.f26162c.get(i10);
        d b10 = b(obj);
        if (b10 != obj) {
            this.f26162c.set(i10, b10);
        }
        return b10;
    }
}
