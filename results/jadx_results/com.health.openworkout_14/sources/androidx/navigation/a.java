package androidx.navigation;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a */
    private final int f1281a;

    public a(int i) {
        this.f1281a = i;
    }

    @Override // androidx.navigation.m
    public int a() {
        return this.f1281a;
    }

    @Override // androidx.navigation.m
    public Bundle b() {
        return new Bundle();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && a() == ((a) obj).a();
    }

    public int hashCode() {
        return 31 + a();
    }

    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + a() + ")";
    }
}
