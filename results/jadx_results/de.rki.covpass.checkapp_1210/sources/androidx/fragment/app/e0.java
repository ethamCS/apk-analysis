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
public class e0 {

    /* renamed from: a */
    private final ArrayList<Fragment> f4066a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, d0> f4067b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, c0> f4068c = new HashMap<>();

    /* renamed from: d */
    private z f4069d;

    public void A(z zVar) {
        this.f4069d = zVar;
    }

    public c0 B(String str, c0 c0Var) {
        return c0Var != null ? this.f4068c.put(str, c0Var) : this.f4068c.remove(str);
    }

    public void a(Fragment fragment) {
        if (this.f4066a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f4066a) {
            this.f4066a.add(fragment);
        }
        fragment.f3901a4 = true;
    }

    public void b() {
        this.f4067b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f4067b.get(str) != null;
    }

    public void d(int i10) {
        for (d0 d0Var : this.f4067b.values()) {
            if (d0Var != null) {
                d0Var.u(i10);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f4067b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (d0 d0Var : this.f4067b.values()) {
                printWriter.print(str);
                if (d0Var != null) {
                    Fragment k10 = d0Var.k();
                    printWriter.println(k10);
                    k10.z(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f4066a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f4066a.get(i10).toString());
            }
        }
    }

    public Fragment f(String str) {
        d0 d0Var = this.f4067b.get(str);
        if (d0Var != null) {
            return d0Var.k();
        }
        return null;
    }

    public Fragment g(int i10) {
        for (int size = this.f4066a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f4066a.get(size);
            if (fragment != null && fragment.f3915m4 == i10) {
                return fragment;
            }
        }
        for (d0 d0Var : this.f4067b.values()) {
            if (d0Var != null) {
                Fragment k10 = d0Var.k();
                if (k10.f3915m4 == i10) {
                    return k10;
                }
            }
        }
        return null;
    }

    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f4066a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f4066a.get(size);
                if (fragment != null && str.equals(fragment.f3917o4)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (d0 d0Var : this.f4067b.values()) {
                if (d0Var != null) {
                    Fragment k10 = d0Var.k();
                    if (str.equals(k10.f3917o4)) {
                        return k10;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public Fragment i(String str) {
        Fragment D;
        for (d0 d0Var : this.f4067b.values()) {
            if (d0Var != null && (D = d0Var.k().D(str)) != null) {
                return D;
            }
        }
        return null;
    }

    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f3926w4;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f4066a.indexOf(fragment);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f4066a.get(i10);
            if (fragment2.f3926w4 == viewGroup && (view2 = fragment2.f3928x4) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f4066a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f4066a.get(indexOf);
            if (fragment3.f3926w4 == viewGroup && (view = fragment3.f3928x4) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List<d0> k() {
        ArrayList arrayList = new ArrayList();
        for (d0 d0Var : this.f4067b.values()) {
            if (d0Var != null) {
                arrayList.add(d0Var);
            }
        }
        return arrayList;
    }

    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        Iterator<d0> it = this.f4067b.values().iterator();
        while (it.hasNext()) {
            d0 next = it.next();
            arrayList.add(next != null ? next.k() : null);
        }
        return arrayList;
    }

    public ArrayList<c0> m() {
        return new ArrayList<>(this.f4068c.values());
    }

    public d0 n(String str) {
        return this.f4067b.get(str);
    }

    public List<Fragment> o() {
        ArrayList arrayList;
        if (this.f4066a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4066a) {
            arrayList = new ArrayList(this.f4066a);
        }
        return arrayList;
    }

    public z p() {
        return this.f4069d;
    }

    public c0 q(String str) {
        return this.f4068c.get(str);
    }

    public void r(d0 d0Var) {
        Fragment k10 = d0Var.k();
        if (c(k10.U3)) {
            return;
        }
        this.f4067b.put(k10.U3, d0Var);
        if (k10.f3922s4) {
            if (k10.f3921r4) {
                this.f4069d.f(k10);
            } else {
                this.f4069d.p(k10);
            }
            k10.f3922s4 = false;
        }
        if (!w.L0(2)) {
            return;
        }
        Log.v("FragmentManager", "Added fragment to active set " + k10);
    }

    public void s(d0 d0Var) {
        Fragment k10 = d0Var.k();
        if (k10.f3921r4) {
            this.f4069d.p(k10);
        }
        if (this.f4067b.put(k10.U3, null) != null && w.L0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k10);
        }
    }

    public void t() {
        Iterator<Fragment> it = this.f4066a.iterator();
        while (it.hasNext()) {
            d0 d0Var = this.f4067b.get(it.next().U3);
            if (d0Var != null) {
                d0Var.m();
            }
        }
        for (d0 d0Var2 : this.f4067b.values()) {
            if (d0Var2 != null) {
                d0Var2.m();
                Fragment k10 = d0Var2.k();
                if (k10.f3902b4 && !k10.E0()) {
                    if (k10.f3904c4 && !this.f4068c.containsKey(k10.U3)) {
                        d0Var2.s();
                    }
                    s(d0Var2);
                }
            }
        }
    }

    public void u(Fragment fragment) {
        synchronized (this.f4066a) {
            this.f4066a.remove(fragment);
        }
        fragment.f3901a4 = false;
    }

    public void v() {
        this.f4067b.clear();
    }

    public void w(List<String> list) {
        this.f4066a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f10 = f(str);
                if (f10 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (w.L0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f10);
                }
                a(f10);
            }
        }
    }

    public void x(ArrayList<c0> arrayList) {
        this.f4068c.clear();
        Iterator<c0> it = arrayList.iterator();
        while (it.hasNext()) {
            c0 next = it.next();
            this.f4068c.put(next.f3995d, next);
        }
    }

    public ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f4067b.size());
        for (d0 d0Var : this.f4067b.values()) {
            if (d0Var != null) {
                Fragment k10 = d0Var.k();
                d0Var.s();
                arrayList.add(k10.U3);
                if (w.L0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k10 + ": " + k10.f3905d);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<String> z() {
        synchronized (this.f4066a) {
            if (this.f4066a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f4066a.size());
            Iterator<Fragment> it = this.f4066a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.U3);
                if (w.L0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.U3 + "): " + next);
                }
            }
            return arrayList;
        }
    }
}
