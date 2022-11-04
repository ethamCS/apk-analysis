package d;

import android.content.Context;
import android.content.Intent;
import d.a;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, d2 = {"Ld/c;", "Ld/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", BuildConfig.FLAVOR, "resultCode", "intent", "f", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "Ld/a$a;", "e", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c extends a<String, Boolean> {
    /* renamed from: d */
    public Intent a(Context context, String str) {
        t.e(context, "context");
        t.e(str, "input");
        return b.Companion.a(new String[]{str});
    }

    /* renamed from: e */
    public a.C0117a<Boolean> b(Context context, String str) {
        t.e(context, "context");
        t.e(str, "input");
        if (androidx.core.content.a.a(context, str) == 0) {
            return new a.C0117a<>(Boolean.TRUE);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        if (r5 == true) goto L19;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean c(int r5, android.content.Intent r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L2c
            r0 = -1
            if (r5 == r0) goto L6
            goto L2c
        L6:
            java.lang.String r5 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            int[] r5 = r6.getIntArrayExtra(r5)
            r6 = 1
            r0 = 0
            if (r5 == 0) goto L26
            int r1 = r5.length
            r2 = r0
        L12:
            if (r2 >= r1) goto L22
            r3 = r5[r2]
            if (r3 != 0) goto L1a
            r3 = r6
            goto L1b
        L1a:
            r3 = r0
        L1b:
            if (r3 == 0) goto L1f
            r5 = r6
            goto L23
        L1f:
            int r2 = r2 + 1
            goto L12
        L22:
            r5 = r0
        L23:
            if (r5 != r6) goto L26
            goto L27
        L26:
            r6 = r0
        L27:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            return r5
        L2c:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d.c.c(int, android.content.Intent):java.lang.Boolean");
    }
}
