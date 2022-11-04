package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.f0;
import androidx.fragment.app.w;
import androidx.lifecycle.m;
import java.io.PrintWriter;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a extends f0 implements w.j, w.o {

    /* renamed from: t */
    final w f3978t;

    /* renamed from: u */
    boolean f3979u;

    /* renamed from: v */
    int f3980v;

    /* renamed from: w */
    boolean f3981w;

    public a(w wVar) {
        super(wVar.w0(), wVar.y0() != null ? wVar.y0().i().getClassLoader() : null);
        this.f3980v = -1;
        this.f3981w = false;
        this.f3978t = wVar;
    }

    public void A() {
        w wVar;
        for (int size = this.f4073c.size() - 1; size >= 0; size--) {
            f0.a aVar = this.f4073c.get(size);
            Fragment fragment = aVar.f4091b;
            if (fragment != null) {
                fragment.f3904c4 = this.f3981w;
                fragment.f2(true);
                fragment.e2(w.p1(this.f4078h));
                fragment.j2(this.f4087q, this.f4086p);
            }
            switch (aVar.f4090a) {
                case 1:
                    fragment.X1(aVar.f4093d, aVar.f4094e, aVar.f4095f, aVar.f4096g);
                    this.f3978t.t1(fragment, true);
                    this.f3978t.l1(fragment);
                    continue;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4090a);
                case 3:
                    fragment.X1(aVar.f4093d, aVar.f4094e, aVar.f4095f, aVar.f4096g);
                    this.f3978t.j(fragment);
                    continue;
                case 4:
                    fragment.X1(aVar.f4093d, aVar.f4094e, aVar.f4095f, aVar.f4096g);
                    this.f3978t.x1(fragment);
                    continue;
                case 5:
                    fragment.X1(aVar.f4093d, aVar.f4094e, aVar.f4095f, aVar.f4096g);
                    this.f3978t.t1(fragment, true);
                    this.f3978t.I0(fragment);
                    continue;
                case 6:
                    fragment.X1(aVar.f4093d, aVar.f4094e, aVar.f4095f, aVar.f4096g);
                    this.f3978t.o(fragment);
                    continue;
                case 7:
                    fragment.X1(aVar.f4093d, aVar.f4094e, aVar.f4095f, aVar.f4096g);
                    this.f3978t.t1(fragment, true);
                    this.f3978t.y(fragment);
                    continue;
                case 8:
                    wVar = this.f3978t;
                    fragment = null;
                    break;
                case 9:
                    wVar = this.f3978t;
                    break;
                case 10:
                    this.f3978t.u1(fragment, aVar.f4097h);
                    continue;
            }
            wVar.v1(fragment);
        }
    }

    public Fragment B(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f4073c.size()) {
            f0.a aVar = this.f4073c.get(i10);
            int i11 = aVar.f4090a;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fragment fragment3 = aVar.f4091b;
                    int i12 = fragment3.f3916n4;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.f3916n4 == i12) {
                            if (fragment4 == fragment3) {
                                z10 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f4073c.add(i10, new f0.a(9, fragment4, true));
                                    i10++;
                                    fragment2 = null;
                                }
                                f0.a aVar2 = new f0.a(3, fragment4, true);
                                aVar2.f4093d = aVar.f4093d;
                                aVar2.f4095f = aVar.f4095f;
                                aVar2.f4094e = aVar.f4094e;
                                aVar2.f4096g = aVar.f4096g;
                                this.f4073c.add(i10, aVar2);
                                arrayList.remove(fragment4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f4073c.remove(i10);
                        i10--;
                    } else {
                        aVar.f4090a = 1;
                        aVar.f4092c = true;
                        arrayList.add(fragment3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList.remove(aVar.f4091b);
                    Fragment fragment5 = aVar.f4091b;
                    if (fragment5 == fragment2) {
                        this.f4073c.add(i10, new f0.a(9, fragment5));
                        i10++;
                        fragment2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f4073c.add(i10, new f0.a(9, fragment2, true));
                        aVar.f4092c = true;
                        i10++;
                        fragment2 = aVar.f4091b;
                    }
                }
                i10++;
            }
            arrayList.add(aVar.f4091b);
            i10++;
        }
        return fragment2;
    }

    public String C() {
        return this.f4081k;
    }

    public void D() {
        if (this.f4089s != null) {
            for (int i10 = 0; i10 < this.f4089s.size(); i10++) {
                this.f4089s.get(i10).run();
            }
            this.f4089s = null;
        }
    }

    public Fragment E(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f4073c.size() - 1; size >= 0; size--) {
            f0.a aVar = this.f4073c.get(size);
            int i10 = aVar.f4090a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f4091b;
                            break;
                        case 10:
                            aVar.f4098i = aVar.f4097h;
                            break;
                    }
                }
                arrayList.add(aVar.f4091b);
            }
            arrayList.remove(aVar.f4091b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.w.o
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (w.L0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f4079i) {
            this.f3978t.i(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.f0
    public int h() {
        return w(false);
    }

    @Override // androidx.fragment.app.f0
    public int i() {
        return w(true);
    }

    @Override // androidx.fragment.app.f0
    public void j() {
        l();
        this.f3978t.d0(this, false);
    }

    @Override // androidx.fragment.app.f0
    public void k() {
        l();
        this.f3978t.d0(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.f0
    public void m(int i10, Fragment fragment, String str, int i11) {
        super.m(i10, fragment, str, i11);
        fragment.f3911i4 = this.f3978t;
    }

    @Override // androidx.fragment.app.f0
    public f0 n(Fragment fragment) {
        w wVar = fragment.f3911i4;
        if (wVar == null || wVar == this.f3978t) {
            return super.n(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.f0
    public boolean o() {
        return this.f4073c.isEmpty();
    }

    @Override // androidx.fragment.app.f0
    public f0 p(Fragment fragment) {
        w wVar = fragment.f3911i4;
        if (wVar == null || wVar == this.f3978t) {
            return super.p(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.f0
    public f0 s(Fragment fragment, m.c cVar) {
        if (fragment.f3911i4 != this.f3978t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f3978t);
        } else if (cVar == m.c.INITIALIZED && fragment.f3903c > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
        } else if (cVar != m.c.DESTROYED) {
            return super.s(fragment, cVar);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3980v >= 0) {
            sb2.append(" #");
            sb2.append(this.f3980v);
        }
        if (this.f4081k != null) {
            sb2.append(" ");
            sb2.append(this.f4081k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public void v(int i10) {
        f0.a aVar;
        if (!this.f4079i) {
            return;
        }
        if (w.L0(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
        }
        int size = this.f4073c.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f4073c.get(i11).f4091b;
            if (fragment != null) {
                fragment.f3910h4 += i10;
                if (w.L0(2)) {
                    Log.v("FragmentManager", "Bump nesting of " + aVar.f4091b + " to " + aVar.f4091b.f3910h4);
                }
            }
        }
    }

    int w(boolean z10) {
        if (!this.f3979u) {
            if (w.L0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new l0("FragmentManager"));
                x("  ", printWriter);
                printWriter.close();
            }
            this.f3979u = true;
            this.f3980v = this.f4079i ? this.f3978t.m() : -1;
            this.f3978t.a0(this, z10);
            return this.f3980v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void x(String str, PrintWriter printWriter) {
        y(str, printWriter, true);
    }

    public void y(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4081k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3980v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3979u);
            if (this.f4078h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4078h));
            }
            if (this.f4074d != 0 || this.f4075e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4074d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4075e));
            }
            if (this.f4076f != 0 || this.f4077g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4076f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4077g));
            }
            if (this.f4082l != 0 || this.f4083m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4082l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4083m);
            }
            if (this.f4084n != 0 || this.f4085o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4084n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4085o);
            }
        }
        if (!this.f4073c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f4073c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f0.a aVar = this.f4073c.get(i10);
                switch (aVar.f4090a) {
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
                        str2 = "cmd=" + aVar.f4090a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f4091b);
                if (z10) {
                    if (aVar.f4093d != 0 || aVar.f4094e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f4093d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f4094e));
                    }
                    if (aVar.f4095f != 0 || aVar.f4096g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f4095f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f4096g));
                    }
                }
            }
        }
    }

    public void z() {
        w wVar;
        int size = this.f4073c.size();
        for (int i10 = 0; i10 < size; i10++) {
            f0.a aVar = this.f4073c.get(i10);
            Fragment fragment = aVar.f4091b;
            if (fragment != null) {
                fragment.f3904c4 = this.f3981w;
                fragment.f2(false);
                fragment.e2(this.f4078h);
                fragment.j2(this.f4086p, this.f4087q);
            }
            switch (aVar.f4090a) {
                case 1:
                    fragment.X1(aVar.f4093d, aVar.f4094e, aVar.f4095f, aVar.f4096g);
                    this.f3978t.t1(fragment, false);
                    this.f3978t.j(fragment);
                    continue;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4090a);
                case 3:
                    fragment.X1(aVar.f4093d, aVar.f4094e, aVar.f4095f, aVar.f4096g);
                    this.f3978t.l1(fragment);
                    continue;
                case 4:
                    fragment.X1(aVar.f4093d, aVar.f4094e, aVar.f4095f, aVar.f4096g);
                    this.f3978t.I0(fragment);
                    continue;
                case 5:
                    fragment.X1(aVar.f4093d, aVar.f4094e, aVar.f4095f, aVar.f4096g);
                    this.f3978t.t1(fragment, false);
                    this.f3978t.x1(fragment);
                    continue;
                case 6:
                    fragment.X1(aVar.f4093d, aVar.f4094e, aVar.f4095f, aVar.f4096g);
                    this.f3978t.y(fragment);
                    continue;
                case 7:
                    fragment.X1(aVar.f4093d, aVar.f4094e, aVar.f4095f, aVar.f4096g);
                    this.f3978t.t1(fragment, false);
                    this.f3978t.o(fragment);
                    continue;
                case 8:
                    wVar = this.f3978t;
                    break;
                case 9:
                    wVar = this.f3978t;
                    fragment = null;
                    break;
                case 10:
                    this.f3978t.u1(fragment, aVar.f4098i);
                    continue;
            }
            wVar.v1(fragment);
        }
    }
}
