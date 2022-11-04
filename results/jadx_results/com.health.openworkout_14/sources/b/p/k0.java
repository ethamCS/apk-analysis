package b.p;

import android.os.IBinder;
/* loaded from: classes.dex */
class k0 implements m0 {

    /* renamed from: a */
    private final IBinder f2749a;

    public k0(IBinder iBinder) {
        this.f2749a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k0) && ((k0) obj).f2749a.equals(this.f2749a);
    }

    public int hashCode() {
        return this.f2749a.hashCode();
    }
}
