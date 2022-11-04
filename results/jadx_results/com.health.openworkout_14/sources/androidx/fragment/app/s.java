package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class s {

    /* renamed from: a */
    private final ArrayList<Fragment> f1119a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, r> f1120b = new HashMap<>();

    public void a(Fragment fragment) {
        if (this.f1119a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f1119a) {
            this.f1119a.add(fragment);
        }
        fragment.l = true;
    }

    public void b() {
        this.f1120b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f1120b.containsKey(str);
    }

    public void d(int i) {
        Iterator<Fragment> it = this.f1119a.iterator();
        while (it.hasNext()) {
            r rVar = this.f1120b.get(it.next().f1016f);
            if (rVar != null) {
                rVar.q(i);
            }
        }
        for (r rVar2 : this.f1120b.values()) {
            if (rVar2 != null) {
                rVar2.q(i);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f1120b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (r rVar : this.f1120b.values()) {
                printWriter.print(str);
                if (rVar != null) {
                    Fragment i = rVar.i();
                    printWriter.println(i);
                    i.j(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f1119a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f1119a.get(i2).toString());
            }
        }
    }

    public Fragment f(String str) {
        r rVar = this.f1120b.get(str);
        if (rVar != null) {
            return rVar.i();
        }
        return null;
    }

    public Fragment g(int i) {
        for (int size = this.f1119a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1119a.get(size);
            if (fragment != null && fragment.w == i) {
                return fragment;
            }
        }
        for (r rVar : this.f1120b.values()) {
            if (rVar != null) {
                Fragment i2 = rVar.i();
                if (i2.w == i) {
                    return i2;
                }
            }
        }
        return null;
    }

    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f1119a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f1119a.get(size);
                if (fragment != null && str.equals(fragment.y)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (r rVar : this.f1120b.values()) {
                if (rVar != null) {
                    Fragment i = rVar.i();
                    if (str.equals(i.y)) {
                        return i;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public Fragment i(String str) {
        Fragment l;
        for (r rVar : this.f1120b.values()) {
            if (rVar != null && (l = rVar.i().l(str)) != null) {
                return l;
            }
        }
        return null;
    }

    public Fragment j(Fragment fragment) {
        ViewGroup viewGroup = fragment.G;
        View view = fragment.H;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.f1119a.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f1119a.get(indexOf);
                if (fragment2.G == viewGroup && fragment2.H != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public List<Fragment> k() {
        ArrayList arrayList = new ArrayList();
        Iterator<r> it = this.f1120b.values().iterator();
        while (it.hasNext()) {
            r next = it.next();
            arrayList.add(next != null ? next.i() : null);
        }
        return arrayList;
    }

    public r l(String str) {
        return this.f1120b.get(str);
    }

    public List<Fragment> m() {
        ArrayList arrayList;
        if (this.f1119a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1119a) {
            arrayList = new ArrayList(this.f1119a);
        }
        return arrayList;
    }

    public void n(r rVar) {
        this.f1120b.put(rVar.i().f1016f, rVar);
    }

    public void o(r rVar) {
        Fragment i = rVar.i();
        for (r rVar2 : this.f1120b.values()) {
            if (rVar2 != null) {
                Fragment i2 = rVar2.i();
                if (i.f1016f.equals(i2.i)) {
                    i2.f1018h = i;
                    i2.i = null;
                }
            }
        }
        this.f1120b.put(i.f1016f, null);
        String str = i.i;
        if (str != null) {
            i.f1018h = f(str);
        }
    }

    public void p(Fragment fragment) {
        synchronized (this.f1119a) {
            this.f1119a.remove(fragment);
        }
        fragment.l = false;
    }

    public void q() {
        this.f1120b.clear();
    }

    public void r(List<String> list) {
        this.f1119a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f2 = f(str);
                if (f2 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (m.p0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f2);
                }
                a(f2);
            }
        }
    }

    public ArrayList<q> s() {
        ArrayList<q> arrayList = new ArrayList<>(this.f1120b.size());
        for (r rVar : this.f1120b.values()) {
            if (rVar != null) {
                Fragment i = rVar.i();
                q o = rVar.o();
                arrayList.add(o);
                if (m.p0(2)) {
                    Log.v("FragmentManager", "Saved state of " + i + ": " + o.n);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<String> t() {
        synchronized (this.f1119a) {
            if (this.f1119a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f1119a.size());
            Iterator<Fragment> it = this.f1119a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f1016f);
                if (m.p0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f1016f + "): " + next);
                }
            }
            return arrayList;
        }
    }
}
