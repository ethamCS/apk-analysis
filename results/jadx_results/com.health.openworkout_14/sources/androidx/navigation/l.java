package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class l {

    /* renamed from: b */
    private final String f1348b;

    /* renamed from: c */
    private n f1349c;

    /* renamed from: d */
    private int f1350d;

    /* renamed from: e */
    private String f1351e;

    /* renamed from: f */
    private CharSequence f1352f;

    /* renamed from: g */
    private ArrayList<i> f1353g;

    /* renamed from: h */
    private b.d.h<d> f1354h;
    private HashMap<String, e> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Comparable<a> {

        /* renamed from: b */
        private final l f1355b;

        /* renamed from: c */
        private final Bundle f1356c;

        /* renamed from: d */
        private final boolean f1357d;

        /* renamed from: e */
        private final boolean f1358e;

        /* renamed from: f */
        private final int f1359f;

        a(l lVar, Bundle bundle, boolean z, boolean z2, int i) {
            this.f1355b = lVar;
            this.f1356c = bundle;
            this.f1357d = z;
            this.f1358e = z2;
            this.f1359f = i;
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            boolean z = this.f1357d;
            if (!z || aVar.f1357d) {
                if (!z && aVar.f1357d) {
                    return -1;
                }
                Bundle bundle = this.f1356c;
                if (bundle != null && aVar.f1356c == null) {
                    return 1;
                }
                if (bundle == null && aVar.f1356c != null) {
                    return -1;
                }
                if (bundle != null) {
                    int size = bundle.size() - aVar.f1356c.size();
                    if (size > 0) {
                        return 1;
                    }
                    if (size < 0) {
                        return -1;
                    }
                }
                boolean z2 = this.f1358e;
                if (z2 && !aVar.f1358e) {
                    return 1;
                }
                if (!z2 && aVar.f1358e) {
                    return -1;
                }
                return this.f1359f - aVar.f1359f;
            }
            return 1;
        }

        public l b() {
            return this.f1355b;
        }

        public Bundle c() {
            return this.f1356c;
        }
    }

    static {
        new HashMap();
    }

    public l(u<? extends l> uVar) {
        this(v.c(uVar.getClass()));
    }

    public l(String str) {
        this.f1348b = str;
    }

    public static String h(Context context, int i) {
        if (i <= 16777215) {
            return Integer.toString(i);
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i);
        }
    }

    public final void a(String str, e eVar) {
        if (this.i == null) {
            this.i = new HashMap<>();
        }
        this.i.put(str, eVar);
    }

    public final void b(i iVar) {
        if (this.f1353g == null) {
            this.f1353g = new ArrayList<>();
        }
        this.f1353g.add(iVar);
    }

    public Bundle c(Bundle bundle) {
        HashMap<String, e> hashMap;
        if (bundle != null || ((hashMap = this.i) != null && !hashMap.isEmpty())) {
            Bundle bundle2 = new Bundle();
            HashMap<String, e> hashMap2 = this.i;
            if (hashMap2 != null) {
                for (Map.Entry<String, e> entry : hashMap2.entrySet()) {
                    entry.getValue().e(entry.getKey(), bundle2);
                }
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
                HashMap<String, e> hashMap3 = this.i;
                if (hashMap3 != null) {
                    for (Map.Entry<String, e> entry2 : hashMap3.entrySet()) {
                        if (!entry2.getValue().f(entry2.getKey(), bundle)) {
                            throw new IllegalArgumentException("Wrong argument type for '" + entry2.getKey() + "' in argument bundle. " + entry2.getValue().b().c() + " expected.");
                        }
                    }
                }
            }
            return bundle2;
        }
        return null;
    }

    public int[] d() {
        ArrayDeque arrayDeque = new ArrayDeque();
        l lVar = this;
        while (true) {
            n l = lVar.l();
            if (l == null || l.x() != lVar.i()) {
                arrayDeque.addFirst(lVar);
            }
            if (l == null) {
                break;
            }
            lVar = l;
        }
        int[] iArr = new int[arrayDeque.size()];
        int i = 0;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            iArr[i] = ((l) it.next()).i();
            i++;
        }
        return iArr;
    }

    public final d e(int i) {
        b.d.h<d> hVar = this.f1354h;
        d g2 = hVar == null ? null : hVar.g(i);
        if (g2 != null) {
            return g2;
        }
        if (l() == null) {
            return null;
        }
        return l().e(i);
    }

    public final Map<String, e> f() {
        HashMap<String, e> hashMap = this.i;
        return hashMap == null ? Collections.emptyMap() : Collections.unmodifiableMap(hashMap);
    }

    public String g() {
        if (this.f1351e == null) {
            this.f1351e = Integer.toString(this.f1350d);
        }
        return this.f1351e;
    }

    public final int i() {
        return this.f1350d;
    }

    public final CharSequence j() {
        return this.f1352f;
    }

    public final String k() {
        return this.f1348b;
    }

    public final n l() {
        return this.f1349c;
    }

    public a m(k kVar) {
        ArrayList<i> arrayList = this.f1353g;
        if (arrayList == null) {
            return null;
        }
        Iterator<i> it = arrayList.iterator();
        a aVar = null;
        while (it.hasNext()) {
            i next = it.next();
            Uri c2 = kVar.c();
            Bundle c3 = c2 != null ? next.c(c2, f()) : null;
            String a2 = kVar.a();
            boolean z = a2 != null && a2.equals(next.b());
            String b2 = kVar.b();
            int d2 = b2 != null ? next.d(b2) : -1;
            if (c3 != null || z || d2 > -1) {
                a aVar2 = new a(this, c3, next.e(), z, d2);
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }

    public void n(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.navigation.y.a.v);
        p(obtainAttributes.getResourceId(androidx.navigation.y.a.x, 0));
        this.f1351e = h(context, this.f1350d);
        q(obtainAttributes.getText(androidx.navigation.y.a.w));
        obtainAttributes.recycle();
    }

    public final void o(int i, d dVar) {
        if (s()) {
            if (i == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            if (this.f1354h == null) {
                this.f1354h = new b.d.h<>();
            }
            this.f1354h.m(i, dVar);
            return;
        }
        throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void p(int i) {
        this.f1350d = i;
        this.f1351e = null;
    }

    public final void q(CharSequence charSequence) {
        this.f1352f = charSequence;
    }

    public final void r(n nVar) {
        this.f1349c = nVar;
    }

    boolean s() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f1351e;
        if (str == null) {
            sb.append("0x");
            str = Integer.toHexString(this.f1350d);
        }
        sb.append(str);
        sb.append(")");
        if (this.f1352f != null) {
            sb.append(" label=");
            sb.append(this.f1352f);
        }
        return sb.toString();
    }
}
