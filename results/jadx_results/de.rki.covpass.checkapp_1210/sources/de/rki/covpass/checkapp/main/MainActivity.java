package de.rki.covpass.checkapp.main;

import android.os.Bundle;
import c8.n;
import d8.h;
import j8.b;
import kotlin.Metadata;
import m7.i;
import m7.v;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lde/rki/covpass/checkapp/main/MainActivity;", "Lj8/b;", "Landroid/os/Bundle;", "savedInstanceState", "Ltb/e0;", "onCreate", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class MainActivity extends b {
    public MainActivity() {
        super(0, 1, null);
    }

    @Override // j8.b, k7.e, androidx.fragment.app.j, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        v vVar;
        i iVar;
        super.onCreate(bundle);
        if (!N().m() || bundle != null) {
            return;
        }
        if (l8.b.b(this).f().a().getValue().intValue() != 0) {
            vVar = N();
            iVar = new n();
        } else {
            vVar = N();
            iVar = new h();
        }
        v.w(vVar, iVar, false, 2, null);
    }
}
