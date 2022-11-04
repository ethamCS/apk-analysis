package a.m;

import android.os.IBinder;
/* loaded from: classes.dex */
class k0 implements m0 {

    /* renamed from: a */
    private final IBinder f366a;

    public k0(IBinder iBinder) {
        this.f366a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k0) && ((k0) obj).f366a.equals(this.f366a);
    }

    public int hashCode() {
        return this.f366a.hashCode();
    }
}
