package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class a<T extends h<T>> {

    /* renamed from: a */
    private final Map<Integer, T> f7329a = new HashMap();

    /* renamed from: b */
    private final Set<Integer> f7330b = new HashSet();

    /* renamed from: c */
    private b f7331c;

    /* renamed from: d */
    private boolean f7332d;

    /* renamed from: e */
    private boolean f7333e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.a$a */
    /* loaded from: classes.dex */
    public class C0106a implements h.a<T> {
        C0106a() {
            a.this = r1;
        }

        /* renamed from: b */
        public void a(T t10, boolean z10) {
            if (!z10) {
                a aVar = a.this;
                if (!aVar.r(t10, aVar.f7333e)) {
                    return;
                }
            } else if (!a.this.g(t10)) {
                return;
            }
            a.this.m();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Set<Integer> set);
    }

    public boolean g(h<T> hVar) {
        int id2 = hVar.getId();
        if (this.f7330b.contains(Integer.valueOf(id2))) {
            return false;
        }
        T t10 = this.f7329a.get(Integer.valueOf(k()));
        if (t10 != null) {
            r(t10, false);
        }
        boolean add = this.f7330b.add(Integer.valueOf(id2));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return add;
    }

    public void m() {
        b bVar = this.f7331c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    public boolean r(h<T> hVar, boolean z10) {
        int id2 = hVar.getId();
        if (!this.f7330b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z10 && this.f7330b.size() == 1 && this.f7330b.contains(Integer.valueOf(id2))) {
            hVar.setChecked(true);
            return false;
        }
        boolean remove = this.f7330b.remove(Integer.valueOf(id2));
        if (hVar.isChecked()) {
            hVar.setChecked(false);
        }
        return remove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(T t10) {
        this.f7329a.put(Integer.valueOf(t10.getId()), t10);
        if (t10.isChecked()) {
            g(t10);
        }
        t10.setInternalOnCheckedChangeListener(new C0106a());
    }

    public void f(int i10) {
        T t10 = this.f7329a.get(Integer.valueOf(i10));
        if (t10 != null && g(t10)) {
            m();
        }
    }

    public void h() {
        boolean z10 = !this.f7330b.isEmpty();
        for (T t10 : this.f7329a.values()) {
            r(t10, false);
        }
        if (z10) {
            m();
        }
    }

    public Set<Integer> i() {
        return new HashSet(this.f7330b);
    }

    public List<Integer> j(ViewGroup viewGroup) {
        Set<Integer> i10 = i();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof h) && i10.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int k() {
        if (!this.f7332d || this.f7330b.isEmpty()) {
            return -1;
        }
        return this.f7330b.iterator().next().intValue();
    }

    public boolean l() {
        return this.f7332d;
    }

    public void n(T t10) {
        t10.setInternalOnCheckedChangeListener(null);
        this.f7329a.remove(Integer.valueOf(t10.getId()));
        this.f7330b.remove(Integer.valueOf(t10.getId()));
    }

    public void o(b bVar) {
        this.f7331c = bVar;
    }

    public void p(boolean z10) {
        this.f7333e = z10;
    }

    public void q(boolean z10) {
        if (this.f7332d != z10) {
            this.f7332d = z10;
            h();
        }
    }
}
