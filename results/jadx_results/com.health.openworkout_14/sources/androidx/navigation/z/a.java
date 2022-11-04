package androidx.navigation.z;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.l;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
abstract class a implements NavController.b {

    /* renamed from: a */
    private final Context f1407a;

    /* renamed from: b */
    private final Set<Integer> f1408b;

    /* renamed from: c */
    private final WeakReference<b.i.b.c> f1409c;

    /* renamed from: d */
    private b.a.l.a.d f1410d;

    /* renamed from: e */
    private ValueAnimator f1411e;

    public a(Context context, c cVar) {
        this.f1407a = context;
        this.f1408b = cVar.c();
        b.i.b.c b2 = cVar.b();
        if (b2 != null) {
            this.f1409c = new WeakReference<>(b2);
        } else {
            this.f1409c = null;
        }
    }

    private void b(boolean z) {
        boolean z2;
        if (this.f1410d == null) {
            this.f1410d = new b.a.l.a.d(this.f1407a);
            z2 = false;
        } else {
            z2 = true;
        }
        c(this.f1410d, z ? f.b_res_0x7f1000bc : f.a_res_0x7f1000bb);
        float f2 = z ? 0.0f : 1.0f;
        if (!z2) {
            this.f1410d.setProgress(f2);
            return;
        }
        float a2 = this.f1410d.a();
        ValueAnimator valueAnimator = this.f1411e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f1410d, "progress", a2, f2);
        this.f1411e = ofFloat;
        ofFloat.start();
    }

    @Override // androidx.navigation.NavController.b
    public void a(NavController navController, l lVar, Bundle bundle) {
        if (lVar instanceof androidx.navigation.c) {
            return;
        }
        WeakReference<b.i.b.c> weakReference = this.f1409c;
        b.i.b.c cVar = weakReference != null ? weakReference.get() : null;
        if (this.f1409c != null && cVar == null) {
            navController.x(this);
            return;
        }
        CharSequence j = lVar.j();
        boolean z = true;
        if (j != null) {
            StringBuffer stringBuffer = new StringBuffer();
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(j);
            while (matcher.find()) {
                String group = matcher.group(1);
                if (bundle == null || !bundle.containsKey(group)) {
                    throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill label " + ((Object) j));
                }
                matcher.appendReplacement(stringBuffer, "");
                stringBuffer.append(bundle.get(group).toString());
            }
            matcher.appendTail(stringBuffer);
            d(stringBuffer);
        }
        boolean d2 = d.d(lVar, this.f1408b);
        if (cVar == null && d2) {
            c(null, 0);
            return;
        }
        if (cVar == null || !d2) {
            z = false;
        }
        b(z);
    }

    protected abstract void c(Drawable drawable, int i);

    protected abstract void d(CharSequence charSequence);
}
