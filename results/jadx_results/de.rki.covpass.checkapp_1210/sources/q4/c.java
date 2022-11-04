package q4;

import android.util.Log;
import e4.s;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class c implements s {

    /* renamed from: a */
    private static final Set<String> f19633a = new HashSet();

    @Override // e4.s
    public void a(String str, Throwable th2) {
        Set<String> set = f19633a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        set.add(str);
    }

    @Override // e4.s
    public void b(String str) {
        a(str, null);
    }

    @Override // e4.s
    public void c(String str, Throwable th2) {
        if (e4.c.f9377a) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // e4.s
    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th2) {
        if (e4.c.f9377a) {
            Log.d("LOTTIE", str, th2);
        }
    }
}
