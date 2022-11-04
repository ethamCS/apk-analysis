package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.u;
import java.util.HashMap;
import java.util.Map;
@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes.dex */
public class v {

    /* renamed from: b */
    private static final HashMap<Class<?>, String> f1389b = new HashMap<>();

    /* renamed from: a */
    private final HashMap<String, u<? extends l>> f1390a = new HashMap<>();

    public static String c(Class<? extends u> cls) {
        HashMap<Class<?>, String> hashMap = f1389b;
        String str = hashMap.get(cls);
        if (str == null) {
            u.b bVar = (u.b) cls.getAnnotation(u.b.class);
            str = bVar != null ? bVar.value() : null;
            if (!f(str)) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for " + cls.getSimpleName());
            }
            hashMap.put(cls, str);
        }
        return str;
    }

    private static boolean f(String str) {
        return str != null && !str.isEmpty();
    }

    public final u<? extends l> a(u<? extends l> uVar) {
        return b(c(uVar.getClass()), uVar);
    }

    public u<? extends l> b(String str, u<? extends l> uVar) {
        if (f(str)) {
            return this.f1390a.put(str, uVar);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public <T extends u<?>> T d(String str) {
        if (f(str)) {
            u<? extends l> uVar = this.f1390a.get(str);
            if (uVar != null) {
                return uVar;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public Map<String, u<? extends l>> e() {
        return this.f1390a;
    }
}
