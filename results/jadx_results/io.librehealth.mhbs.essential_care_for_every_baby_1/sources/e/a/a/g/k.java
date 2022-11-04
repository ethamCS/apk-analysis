package e.a.a.g;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a */
    private static String f842a = "MapUtils";

    public static <T> c.b.a.a.f<T> a(Object obj, Class<T> cls) {
        if (obj == null) {
            return c.b.a.a.f.a();
        }
        try {
            if (cls.isInstance(obj)) {
                return c.b.a.a.f.b(cls.cast(obj));
            }
        } catch (Exception unused) {
            String str = f842a;
            d.a.b.a(str, "Argument is not a type of " + c.b.a.a.f.class.getSimpleName());
        }
        return c.b.a.a.f.a();
    }

    public static <T> c.b.a.a.f<T> b(Map map, String str, Class<T> cls) {
        Object obj;
        char c2;
        char c3;
        if (c(map, str).booleanValue()) {
            return c.b.a.a.f.a();
        }
        try {
            obj = map.get(str);
            if (Number.class.isAssignableFrom(cls)) {
                String lowerCase = cls.getSimpleName().toLowerCase();
                if (lowerCase.equals("long") && (obj instanceof String)) {
                    Matcher matcher = Pattern.compile("0x\\w{2}?(\\w{6})", 2).matcher((String) obj);
                    if (matcher.find()) {
                        String group = matcher.group(0);
                        Long l = 0L;
                        if (!m.c(group).booleanValue()) {
                            l = Long.valueOf(l.longValue() + Long.parseLong(group, 16));
                        }
                        return c.b.a.a.f.b(cls.cast(l));
                    }
                }
                if (obj instanceof Number) {
                    switch (lowerCase.hashCode()) {
                        case -1325958191:
                            if (lowerCase.equals("double")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3039496:
                            if (lowerCase.equals("byte")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3327612:
                            if (lowerCase.equals("long")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 97526364:
                            if (lowerCase.equals("float")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 109413500:
                            if (lowerCase.equals("short")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1958052158:
                            if (lowerCase.equals("integer")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    if (c3 == 0) {
                        obj = Integer.valueOf(((Number) obj).intValue());
                    } else if (c3 == 1) {
                        obj = Double.valueOf(((Number) obj).doubleValue());
                    } else if (c3 == 2) {
                        obj = Float.valueOf(((Number) obj).floatValue());
                    } else if (c3 == 3) {
                        obj = Long.valueOf(((Number) obj).longValue());
                    } else if (c3 == 4) {
                        obj = Short.valueOf(((Number) obj).shortValue());
                    } else if (c3 == 5) {
                        obj = Byte.valueOf(((Number) obj).byteValue());
                    }
                }
            }
        } catch (Exception unused) {
            String str2 = f842a;
            d.a.b.a(str2, str + " is not a type of " + c.b.a.a.f.class.getSimpleName());
        }
        if (!(obj instanceof List) || !cls.isArray()) {
            if (cls.isInstance(obj)) {
                return c.b.a.a.f.b(cls.cast(obj));
            }
            return c.b.a.a.f.a();
        }
        String lowerCase2 = cls.getComponentType().getSimpleName().toLowerCase();
        switch (lowerCase2.hashCode()) {
            case -1325958191:
                if (lowerCase2.equals("double")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3039496:
                if (lowerCase2.equals("byte")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3327612:
                if (lowerCase2.equals("long")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 97526364:
                if (lowerCase2.equals("float")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 109413500:
                if (lowerCase2.equals("short")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1958052158:
                if (lowerCase2.equals("integer")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            obj = c.b.a.b.a.g((List) obj);
        } else if (c2 == 1) {
            obj = c.b.a.b.e.f((List) obj);
        } else if (c2 == 2) {
            obj = c.b.a.b.f.f((List) obj);
        } else if (c2 == 3 || c2 == 4 || c2 == 5) {
            obj = c.b.a.b.c.f((List) obj);
        }
        return c.b.a.a.f.b(cls.cast(obj));
    }

    public static Boolean c(Map map, String str) {
        Object obj;
        Boolean bool = Boolean.TRUE;
        return (map == null || map.isEmpty() || !map.containsKey(str) || (obj = map.get(str)) == null) ? bool : (!(obj instanceof String) || !((String) obj).isEmpty()) ? (!(obj instanceof Map) || !((Map) obj).isEmpty()) ? Boolean.FALSE : bool : bool;
    }
}
