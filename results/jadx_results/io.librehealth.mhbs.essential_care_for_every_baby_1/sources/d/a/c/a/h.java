package d.a.c.a;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public final String f695a;

    /* renamed from: b */
    public final Object f696b;

    public h(String str, Object obj) {
        this.f695a = str;
        this.f696b = obj;
    }

    public <T> T a(String str) {
        Object obj = this.f696b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        if (!(obj instanceof JSONObject)) {
            throw new ClassCastException();
        }
        return (T) ((JSONObject) obj).opt(str);
    }

    public <T> T b() {
        return (T) this.f696b;
    }
}
