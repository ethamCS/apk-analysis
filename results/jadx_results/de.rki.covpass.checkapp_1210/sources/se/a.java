package se;

import java.util.ArrayList;
/* loaded from: classes3.dex */
public final class a extends ArrayList<m> implements l {
    public a(int i10) {
        super(i10);
    }

    public /* bridge */ boolean c(m mVar) {
        return super.contains(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        return c((m) obj);
    }

    public /* bridge */ int e() {
        return super.size();
    }

    public /* bridge */ int f(m mVar) {
        return super.indexOf(mVar);
    }

    public /* bridge */ int i(m mVar) {
        return super.lastIndexOf(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof m)) {
            return -1;
        }
        return f((m) obj);
    }

    public /* bridge */ boolean k(m mVar) {
        return super.remove(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof m)) {
            return -1;
        }
        return i((m) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        return k((m) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return e();
    }
}
