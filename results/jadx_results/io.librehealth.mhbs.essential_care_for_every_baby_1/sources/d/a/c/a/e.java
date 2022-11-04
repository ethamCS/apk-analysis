package d.a.c.a;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: a */
    public static final e f694a = new e();

    private e() {
    }

    @Override // d.a.c.a.j
    public ByteBuffer a(String str, String str2, Object obj, String str3) {
        return d.f693a.b(new JSONArray().put(str).put(f.a(str2)).put(f.a(obj)).put(f.a(str3)));
    }

    @Override // d.a.c.a.j
    public ByteBuffer b(h hVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", hVar.f695a);
            jSONObject.put("args", f.a(hVar.f696b));
            return d.f693a.b(jSONObject);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // d.a.c.a.j
    public ByteBuffer c(String str, String str2, Object obj) {
        return d.f693a.b(new JSONArray().put(str).put(f.a(str2)).put(f.a(obj)));
    }

    @Override // d.a.c.a.j
    public ByteBuffer d(Object obj) {
        return d.f693a.b(new JSONArray().put(f.a(obj)));
    }

    @Override // d.a.c.a.j
    public h e(ByteBuffer byteBuffer) {
        try {
            Object a2 = d.f693a.a(byteBuffer);
            if (a2 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) a2;
                Object obj = jSONObject.get("method");
                Object g = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new h((String) obj, g);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + a2);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // d.a.c.a.j
    public Object f(ByteBuffer byteBuffer) {
        try {
            Object a2 = d.f693a.a(byteBuffer);
            if (a2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) a2;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g = g(jSONArray.opt(1));
                    Object g2 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g == null || (g instanceof String))) {
                        throw new c((String) obj, (String) g, g2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + a2);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
