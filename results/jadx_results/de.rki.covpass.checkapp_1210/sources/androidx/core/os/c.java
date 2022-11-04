package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000e"}, d2 = {"Landroidx/core/os/c;", BuildConfig.FLAVOR, "Landroid/os/Bundle;", "bundle", BuildConfig.FLAVOR, "key", "Landroid/util/Size;", "value", "Ltb/e0;", "a", "Landroid/util/SizeF;", "b", "<init>", "()V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class c {

    /* renamed from: a */
    public static final c f3494a = new c();

    private c() {
    }

    @fc.c
    public static final void a(Bundle bundle, String str, Size size) {
        t.e(bundle, "bundle");
        t.e(str, "key");
        bundle.putSize(str, size);
    }

    @fc.c
    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        t.e(bundle, "bundle");
        t.e(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
