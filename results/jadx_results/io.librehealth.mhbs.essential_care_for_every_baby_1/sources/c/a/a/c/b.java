package c.a.a.c;

import android.content.Context;
import java.util.HashMap;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private Context f374a;

    /* renamed from: b */
    private HashMap<String, a> f375b;

    public b(Context context) {
        this.f374a = context;
        HashMap<String, a> hashMap = new HashMap<>();
        this.f375b = hashMap;
        hashMap.put("com.sec.android.app.launcher", new f(context));
        this.f375b.put("com.lge.launcher2", new d(context));
        this.f375b.put("com.sonyericsson.home", new g(context));
        this.f375b.put("com.htc.launcher", new c(context));
    }

    private String b(Context context) {
        return new c.a.a.c.h.a().a(context);
    }

    public a a() {
        String b2 = b(this.f374a);
        return this.f375b.containsKey(b2) ? this.f375b.get(b2) : new e();
    }
}
