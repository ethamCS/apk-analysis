package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.l;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public class n extends l implements Iterable<l> {
    final b.d.h<l> j = new b.d.h<>();
    private int k;
    private String l;

    /* loaded from: classes.dex */
    public class a implements Iterator<l> {

        /* renamed from: b */
        private int f1360b = -1;

        /* renamed from: c */
        private boolean f1361c = false;

        a() {
            n.this = r1;
        }

        /* renamed from: a */
        public l next() {
            if (hasNext()) {
                this.f1361c = true;
                b.d.h<l> hVar = n.this.j;
                int i = this.f1360b + 1;
                this.f1360b = i;
                return hVar.q(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1360b + 1 < n.this.j.p();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f1361c) {
                n.this.j.q(this.f1360b).r(null);
                n.this.j.o(this.f1360b);
                this.f1360b--;
                this.f1361c = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
    }

    public n(u<? extends n> uVar) {
        super(uVar);
    }

    @Override // androidx.navigation.l
    public String g() {
        return i() != 0 ? super.g() : "the root navigation";
    }

    @Override // java.lang.Iterable
    public final Iterator<l> iterator() {
        return new a();
    }

    @Override // androidx.navigation.l
    public l.a m(k kVar) {
        l.a m = super.m(kVar);
        Iterator<l> it = iterator();
        while (it.hasNext()) {
            l.a m2 = it.next().m(kVar);
            if (m2 != null && (m == null || m2.compareTo(m) > 0)) {
                m = m2;
            }
        }
        return m;
    }

    @Override // androidx.navigation.l
    public void n(Context context, AttributeSet attributeSet) {
        super.n(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.navigation.y.a.t);
        y(obtainAttributes.getResourceId(androidx.navigation.y.a.u, 0));
        this.l = l.h(context, this.k);
        obtainAttributes.recycle();
    }

    public final void t(l lVar) {
        if (lVar.i() != 0) {
            l g2 = this.j.g(lVar.i());
            if (g2 == lVar) {
                return;
            }
            if (lVar.l() != null) {
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
            if (g2 != null) {
                g2.r(null);
            }
            lVar.r(this);
            this.j.m(lVar.i(), lVar);
            return;
        }
        throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
    }

    @Override // androidx.navigation.l
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        l u = u(x());
        if (u == null) {
            str = this.l;
            if (str == null) {
                sb.append("0x");
                str = Integer.toHexString(this.k);
            }
        } else {
            sb.append("{");
            sb.append(u.toString());
            str = "}";
        }
        sb.append(str);
        return sb.toString();
    }

    public final l u(int i) {
        return v(i, true);
    }

    public final l v(int i, boolean z) {
        l g2 = this.j.g(i);
        if (g2 != null) {
            return g2;
        }
        if (z && l() != null) {
            return l().u(i);
        }
        return null;
    }

    public String w() {
        if (this.l == null) {
            this.l = Integer.toString(this.k);
        }
        return this.l;
    }

    public final int x() {
        return this.k;
    }

    public final void y(int i) {
        this.k = i;
        this.l = null;
    }
}
