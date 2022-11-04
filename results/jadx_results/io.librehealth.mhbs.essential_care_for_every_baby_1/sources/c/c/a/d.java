package c.c.a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private final String f659a;

    /* renamed from: b */
    private final List<Object> f660b;

    public d(String str, List<Object> list) {
        this.f659a = str;
        this.f660b = list == null ? new ArrayList<>() : list;
    }

    private static Map<String, Object> a(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            hashMap.put(j(entry.getKey()), value instanceof Map ? a((Map) value) : j(value));
        }
        return hashMap;
    }

    private String[] c(List<Object> list) {
        return (String[]) h(list).toArray(new String[0]);
    }

    private Object[] g(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object obj : list) {
                arrayList.add(k(obj));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    private List<String> h(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object obj : list) {
                arrayList.add(j(obj));
            }
        }
        return arrayList;
    }

    private static String j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof byte[])) {
            return obj instanceof Map ? a((Map) obj).toString() : obj.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (byte b2 : (byte[]) obj) {
            arrayList.add(Integer.valueOf(b2));
        }
        return arrayList.toString();
    }

    private static Object k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (c.c.a.e.a.f663c) {
            Log.d("Sqflite", "arg " + obj.getClass().getCanonicalName() + " " + j(obj));
        }
        if (obj instanceof List) {
            List list = (List) obj;
            byte[] bArr = new byte[list.size()];
            for (int i = 0; i < list.size(); i++) {
                bArr[i] = (byte) ((Integer) list.get(i)).intValue();
            }
            obj = bArr;
        }
        if (c.c.a.e.a.f663c) {
            Log.d("Sqflite", "arg " + obj.getClass().getCanonicalName() + " " + j(obj));
        }
        return obj;
    }

    public String[] b() {
        return c(this.f660b);
    }

    public List<Object> d() {
        return this.f660b;
    }

    public String e() {
        return this.f659a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f659a;
            if (str != null) {
                if (!str.equals(dVar.f659a)) {
                    return false;
                }
            } else if (dVar.f659a != null) {
                return false;
            }
            if (this.f660b.size() != dVar.f660b.size()) {
                return false;
            }
            for (int i = 0; i < this.f660b.size(); i++) {
                if (!(this.f660b.get(i) instanceof byte[]) || !(dVar.f660b.get(i) instanceof byte[])) {
                    if (!this.f660b.get(i).equals(dVar.f660b.get(i))) {
                        return false;
                    }
                } else if (!Arrays.equals((byte[]) this.f660b.get(i), (byte[]) dVar.f660b.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public Object[] f() {
        return g(this.f660b);
    }

    public int hashCode() {
        String str = this.f659a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public d i() {
        if (this.f660b.size() == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int length = this.f659a.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = this.f659a.charAt(i3);
            if (charAt == '?') {
                int i4 = i3 + 1;
                if (i4 < length && Character.isDigit(this.f659a.charAt(i4))) {
                    return this;
                }
                i++;
                if (i2 >= this.f660b.size()) {
                    return this;
                }
                int i5 = i2 + 1;
                Object obj = this.f660b.get(i2);
                if ((obj instanceof Integer) || (obj instanceof Long)) {
                    sb.append(obj.toString());
                    i2 = i5;
                } else {
                    arrayList.add(obj);
                    i2 = i5;
                }
            }
            sb.append(charAt);
        }
        return i != this.f660b.size() ? this : new d(sb.toString(), arrayList);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f659a);
        List<Object> list = this.f660b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + h(this.f660b);
        }
        sb.append(str);
        return sb.toString();
    }
}
