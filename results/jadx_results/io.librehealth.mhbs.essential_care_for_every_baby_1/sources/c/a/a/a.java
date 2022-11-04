package c.a.a;

import android.content.Context;
/* loaded from: classes.dex */
public class a {
    public static void a(Context context, int i) {
        if (context != null) {
            try {
                new c.a.a.c.b(context).a().c(i);
                return;
            } catch (UnsupportedOperationException unused) {
                throw new b();
            }
        }
        throw new b();
    }
}
