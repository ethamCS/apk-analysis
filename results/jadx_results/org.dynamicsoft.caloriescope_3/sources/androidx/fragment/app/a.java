package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j;
import androidx.fragment.app.n;
import java.io.PrintWriter;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a extends n implements j.k {
    final j r;
    boolean s;
    int t = -1;

    public a(j jVar) {
        this.r = jVar;
    }

    private static boolean b(n.a aVar) {
        Fragment fragment = aVar.f933b;
        return fragment != null && fragment.l && fragment.H != null && !fragment.A && !fragment.z && fragment.J();
    }

    public Fragment a(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f929a.size()) {
            n.a aVar = this.f929a.get(i);
            int i2 = aVar.f932a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f933b;
                    int i3 = fragment3.x;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.x == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f929a.add(i, new n.a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                n.a aVar2 = new n.a(3, fragment4);
                                aVar2.f934c = aVar.f934c;
                                aVar2.e = aVar.e;
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                this.f929a.add(i, aVar2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f929a.remove(i);
                        i--;
                    } else {
                        aVar.f932a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.f933b);
                    Fragment fragment5 = aVar.f933b;
                    if (fragment5 == fragment2) {
                        this.f929a.add(i, new n.a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f929a.add(i, new n.a(9, fragment2));
                        i++;
                        fragment2 = aVar.f933b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.f933b);
            i++;
        }
        return fragment2;
    }

    public void a() {
        int size = this.f929a.size();
        for (int i = 0; i < size; i++) {
            n.a aVar = this.f929a.get(i);
            Fragment fragment = aVar.f933b;
            if (fragment != null) {
                fragment.a(this.f, this.g);
            }
            switch (aVar.f932a) {
                case 1:
                    fragment.b(aVar.f934c);
                    this.r.a(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f932a);
                case 3:
                    fragment.b(aVar.d);
                    this.r.o(fragment);
                    break;
                case 4:
                    fragment.b(aVar.d);
                    this.r.h(fragment);
                    break;
                case 5:
                    fragment.b(aVar.f934c);
                    this.r.t(fragment);
                    break;
                case 6:
                    fragment.b(aVar.d);
                    this.r.d(fragment);
                    break;
                case 7:
                    fragment.b(aVar.f934c);
                    this.r.b(fragment);
                    break;
                case 8:
                    this.r.s(fragment);
                    break;
                case 9:
                    this.r.s(null);
                    break;
                case 10:
                    this.r.a(fragment, aVar.h);
                    break;
            }
            if (!this.p && aVar.f932a != 1 && fragment != null) {
                this.r.l(fragment);
            }
        }
        if (!this.p) {
            j jVar = this.r;
            jVar.a(jVar.q, true);
        }
    }

    public void a(int i) {
        n.a aVar;
        if (!this.h) {
            return;
        }
        if (j.I) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
        }
        int size = this.f929a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f929a.get(i2).f933b;
            if (fragment != null) {
                fragment.r += i;
                if (j.I) {
                    Log.v("FragmentManager", "Bump nesting of " + aVar.f933b + " to " + aVar.f933b.r);
                }
            }
        }
    }

    public void a(Fragment.f fVar) {
        for (int i = 0; i < this.f929a.size(); i++) {
            n.a aVar = this.f929a.get(i);
            if (b(aVar)) {
                aVar.f933b.a(fVar);
            }
        }
    }

    public void a(String str, PrintWriter printWriter) {
        a(str, printWriter, true);
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.f930b != 0 || this.f931c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f930b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f931c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        if (!this.f929a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f929a.size();
            for (int i = 0; i < size; i++) {
                n.a aVar = this.f929a.get(i);
                switch (aVar.f932a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f932a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f933b);
                if (z) {
                    if (aVar.f934c != 0 || aVar.d != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f934c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.d));
                    }
                    if (aVar.e != 0 || aVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                }
            }
        }
    }

    public void a(boolean z) {
        for (int size = this.f929a.size() - 1; size >= 0; size--) {
            n.a aVar = this.f929a.get(size);
            Fragment fragment = aVar.f933b;
            if (fragment != null) {
                fragment.a(j.e(this.f), this.g);
            }
            switch (aVar.f932a) {
                case 1:
                    fragment.b(aVar.f);
                    this.r.o(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f932a);
                case 3:
                    fragment.b(aVar.e);
                    this.r.a(fragment, false);
                    break;
                case 4:
                    fragment.b(aVar.e);
                    this.r.t(fragment);
                    break;
                case 5:
                    fragment.b(aVar.f);
                    this.r.h(fragment);
                    break;
                case 6:
                    fragment.b(aVar.e);
                    this.r.b(fragment);
                    break;
                case 7:
                    fragment.b(aVar.f);
                    this.r.d(fragment);
                    break;
                case 8:
                    this.r.s(null);
                    break;
                case 9:
                    this.r.s(fragment);
                    break;
                case 10:
                    this.r.a(fragment, aVar.g);
                    break;
            }
            if (!this.p && aVar.f932a != 3 && fragment != null) {
                this.r.l(fragment);
            }
        }
        if (this.p || !z) {
            return;
        }
        j jVar = this.r;
        jVar.a(jVar.q, true);
    }

    public boolean a(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f929a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f929a.get(i4).f933b;
            int i5 = fragment != null ? fragment.x : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.f929a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f929a.get(i7).f933b;
                        if ((fragment2 != null ? fragment2.x : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.j.k
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (j.I) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (this.h) {
            this.r.a(this);
            return true;
        }
        return true;
    }

    public Fragment b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f929a.size() - 1; size >= 0; size--) {
            n.a aVar = this.f929a.get(size);
            int i = aVar.f932a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f933b;
                            break;
                        case 10:
                            aVar.h = aVar.g;
                            break;
                    }
                }
                arrayList.add(aVar.f933b);
            }
            arrayList.remove(aVar.f933b);
        }
        return fragment;
    }

    public String b() {
        return this.i;
    }

    public boolean b(int i) {
        int size = this.f929a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f929a.get(i2).f933b;
            int i3 = fragment != null ? fragment.x : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public boolean c() {
        for (int i = 0; i < this.f929a.size(); i++) {
            if (b(this.f929a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void d() {
        if (this.q != null) {
            for (int i = 0; i < this.q.size(); i++) {
                this.q.get(i).run();
            }
            this.q = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
