package androidx.navigation;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private final int f1286a;

    /* renamed from: b */
    private r f1287b;

    /* renamed from: c */
    private Bundle f1288c;

    public d(int i) {
        this(i, null);
    }

    public d(int i, r rVar) {
        this(i, rVar, null);
    }

    public d(int i, r rVar, Bundle bundle) {
        this.f1286a = i;
        this.f1287b = rVar;
        this.f1288c = bundle;
    }

    public Bundle a() {
        return this.f1288c;
    }

    public int b() {
        return this.f1286a;
    }

    public r c() {
        return this.f1287b;
    }

    public void d(Bundle bundle) {
        this.f1288c = bundle;
    }

    public void e(r rVar) {
        this.f1287b = rVar;
    }
}
