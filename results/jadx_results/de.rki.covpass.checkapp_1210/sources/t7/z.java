package t7;

import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class z {

    /* renamed from: a */
    private static Map<Class<?>, List<a>> f22022a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<a>> f22023b = new HashMap();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final String f22024a;

        /* renamed from: b */
        private final Member f22025b;

        /* renamed from: c */
        private final String f22026c = b(false);

        /* renamed from: d */
        private final String f22027d = b(true);

        public a(String str, Member member) {
            this.f22024a = str;
            this.f22025b = member;
        }

        public String a(boolean z10) {
            return z10 ? this.f22027d : this.f22026c;
        }

        private String b(boolean z10) {
            return this.f22025b instanceof Field ? z10 ? t.u(i(this.f22024a)) : t.v(this.f22024a) : z10 ? t.u(h(this.f22024a)) : t.v(g(this.f22024a));
        }

        public static boolean d(String str) {
            return t.E(str, "get") && !str.equals("getClass");
        }

        public static boolean e(String str) {
            return t.E(str, "is");
        }

        public static boolean f(String str) {
            return t.E(str, "set");
        }

        private static String g(String str) {
            return (!f(str) && !d(str)) ? str : str.substring(3);
        }

        public static String h(String str) {
            if (!f(str) && !d(str)) {
                return e(str) ? str.substring(2) : str;
            }
            return str.substring(3);
        }

        public static String i(String str) {
            return e(str) ? str.substring(2) : str;
        }

        public Object c(Object obj) {
            try {
                Member member = this.f22025b;
                if (member instanceof Method) {
                    return ((Method) member).invoke(obj, new Object[0]);
                }
                if (!(member instanceof Field)) {
                    return null;
                }
                return ((Field) member).get(obj);
            } catch (IllegalAccessException e10) {
                throw ((RuntimeException) new h(BuildConfig.FLAVOR).initCause(e10));
            } catch (InvocationTargetException e11) {
                throw ((RuntimeException) new h(BuildConfig.FLAVOR).initCause(e11));
            }
        }
    }

    public static void a(Date date, u7.f[] fVarArr, int[] iArr) {
        long time = date.getTime();
        t.a(f(time, 1000), fVarArr, iArr);
        iArr[5] = ((int) g(time, 1000)) * 1000000;
    }

    private static <T> List<T> b(List<T> list) {
        boolean z10;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next() == null) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            for (T t10 : list) {
                if (t10 != null) {
                    arrayList.add(t10);
                }
            }
            return arrayList;
        }
        return list;
    }

    public static Object c(Enum<?> r02) {
        return Integer.valueOf(r02.ordinal());
    }

    public static boolean d(InputStream inputStream, long j10) {
        return false;
    }

    private static Method e(List<Method> list, String str, Type type) {
        for (Method method : list) {
            if (a.h(method.getName()).equals(str) && method.getReturnType().equals(type)) {
                return method;
            }
        }
        return null;
    }

    private static long f(long j10, int i10) {
        return j10 >= 0 ? j10 / i10 : (-1) - (((-1) - j10) / i10);
    }

    private static long g(long j10, int i10) {
        return j10 - (f(j10, i10) * i10);
    }

    public static o h(Object obj, y yVar, r rVar, int i10) {
        int length = Array.getLength(obj);
        o D0 = o.D0();
        int i11 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (yVar == null) {
                while (i11 < length) {
                    D0.d(o.O(iArr[i11]));
                    i11++;
                }
            } else {
                while (i11 < length) {
                    D0.d(o.S(Integer.valueOf(iArr[i11]), yVar, rVar, i10 + 1));
                    i11++;
                }
            }
            return D0;
        } else if (!(obj instanceof Integer[])) {
            while (i11 < length) {
                D0.d(o.S(Array.get(obj, i11), yVar, rVar, i10 + 1));
                i11++;
            }
            return D0;
        } else {
            Integer[] numArr = (Integer[]) obj;
            if (yVar == null) {
                while (i11 < length) {
                    D0.d(o.O(numArr[i11].intValue()));
                    i11++;
                }
            } else {
                while (i11 < length) {
                    D0.d(o.S(Integer.valueOf(numArr[i11].intValue()), yVar, rVar, i10 + 1));
                    i11++;
                }
            }
            return D0;
        }
    }

    public static o i(Object obj) {
        if (!(obj instanceof BigDecimal)) {
            if (!(obj instanceof BigInteger)) {
                return null;
            }
            return o.X(u7.f.X(((BigInteger) obj).toByteArray(), false));
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        u7.f X = u7.f.X(bigDecimal.unscaledValue().toByteArray(), false);
        int scale = bigDecimal.scale();
        return scale == Integer.MIN_VALUE ? o.E0(o.P(-scale), o.X(X)).Q0(4) : o.E0(o.O(-scale), o.X(X)).Q0(4);
    }

    public static <K, V> Collection<Map.Entry<K, V>> j(Map<K, V> map) {
        return Collections.unmodifiableMap(map).entrySet();
    }

    public static Iterable<Map.Entry<String, Object>> k(Object obj, boolean z10) {
        List<a> l10 = l(obj.getClass());
        if (l10.size() == 1 && l10.get(0) == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(l10.size());
        for (a aVar : l10) {
            arrayList.add(new AbstractMap.SimpleEntry(aVar.a(z10), aVar.c(obj)));
        }
        return arrayList;
    }

    private static List<a> l(Class<?> cls) {
        return m(cls, false);
    }

    private static List<a> m(Class<?> cls, boolean z10) {
        Method[] methods;
        Field[] fields;
        synchronized ((z10 ? f22023b : f22022a)) {
            List<a> list = (z10 ? f22023b : f22022a).get(cls);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            if (n(cls)) {
                arrayList.add(null);
                (z10 ? f22023b : f22022a).put(cls, arrayList);
                return arrayList;
            }
            ArrayList<Method> arrayList2 = new ArrayList();
            ArrayList<Method> arrayList3 = new ArrayList();
            ArrayList<Method> arrayList4 = new ArrayList();
            TreeMap treeMap = new TreeMap();
            TreeMap treeMap2 = new TreeMap();
            TreeMap treeMap3 = new TreeMap();
            for (Method method : cls.getMethods()) {
                if ((method.getModifiers() & 9) == 1) {
                    String name = method.getName();
                    String h10 = a.h(name);
                    if (a.d(name)) {
                        if (method.getParameterTypes().length == 0 && !method.getReturnType().equals(Void.TYPE)) {
                            treeMap.put(h10, treeMap.containsKey(h10) ? Integer.valueOf(((Integer) treeMap.get(h10)).intValue() + 1) : 1);
                            arrayList2.add(method);
                        }
                    } else if (a.e(name)) {
                        if (method.getParameterTypes().length == 0 && !method.getReturnType().equals(Void.TYPE)) {
                            treeMap.put(h10, treeMap.containsKey(h10) ? Integer.valueOf(((Integer) treeMap.get(h10)).intValue() + 1) : 1);
                            arrayList4.add(method);
                        }
                    } else if (a.f(name) && method.getParameterTypes().length == 1 && method.getReturnType().equals(Void.TYPE)) {
                        treeMap2.put(h10, treeMap2.containsKey(h10) ? Integer.valueOf(((Integer) treeMap2.get(h10)).intValue() + 1) : 1);
                        arrayList3.add(method);
                    }
                }
            }
            if (!z10) {
                for (Method method2 : arrayList2) {
                    if (((Integer) treeMap.get(a.h(method2.getName()))).intValue() <= 1) {
                        arrayList.add(new a(method2.getName(), method2));
                    }
                }
                for (Method method3 : arrayList4) {
                    if (((Integer) treeMap.get(a.h(method3.getName()))).intValue() <= 1) {
                        arrayList.add(new a(method3.getName(), method3));
                    }
                }
            } else {
                for (Method method4 : arrayList3) {
                    String h11 = a.h(method4.getName());
                    if (((Integer) treeMap2.get(h11)).intValue() <= 1 && treeMap.containsKey(h11)) {
                        Method e10 = e(arrayList2, h11, method4.getParameterTypes()[0]);
                        if (e10 == null) {
                            e10 = e(arrayList4, h11, method4.getParameterTypes()[0]);
                        }
                        if (e10 != null) {
                            int size = arrayList.size();
                            arrayList.add(new a(method4.getName(), method4));
                            treeMap3.put(h11, Integer.valueOf(size));
                        }
                    }
                }
            }
            for (Field field : cls.getFields()) {
                if ((field.getModifiers() & 25) == 1) {
                    String i10 = a.i(field.getName());
                    if (!treeMap.containsKey(i10) && !treeMap2.containsKey(i10)) {
                        arrayList.add(new a(field.getName(), field));
                    }
                    int intValue = treeMap3.containsKey(i10) ? ((Integer) treeMap3.get(i10)).intValue() : -1;
                    if (intValue >= 0) {
                        arrayList.set(intValue, null);
                    }
                }
            }
            List<a> b10 = b(arrayList);
            (z10 ? f22023b : f22022a).put(cls, b10);
            return b10;
        }
    }

    private static boolean n(Class<?> cls) {
        boolean z10;
        String name = cls.getName();
        if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("com.sun.")) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                } else if (interfaces[i10].equals(Serializable.class)) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                return true;
            }
        }
        if (!Type.class.isAssignableFrom(cls) && !Method.class.isAssignableFrom(cls) && !Field.class.isAssignableFrom(cls) && !Constructor.class.isAssignableFrom(cls)) {
            if (name.startsWith("com.")) {
                if (name.startsWith("com.sun.rowset") || name.startsWith("com.sun.org.apache.") || name.startsWith("com.sun.jndi.") || name.startsWith("com.mchange.v2.c3p0.")) {
                    return true;
                }
            } else if (name.startsWith("org.springframework.") || name.startsWith("java.io.") || name.startsWith("java.lang.annotation.") || name.startsWith("java.security.SignedObject") || name.startsWith("org.apache.xalan.") || name.startsWith("org.apache.xpath.") || name.startsWith("org.codehaus.groovy.") || name.startsWith("groovy.util.Expando") || name.startsWith("java.util.logging.")) {
            }
            return false;
        }
        return true;
    }

    public static Map<o, o> o() {
        return new LinkedHashMap();
    }

    public static byte[] p(UUID uuid) {
        long leastSignificantBits = uuid.getLeastSignificantBits();
        long mostSignificantBits = uuid.getMostSignificantBits();
        return new byte[]{(byte) ((mostSignificantBits >> 56) & 255), (byte) ((mostSignificantBits >> 48) & 255), (byte) ((mostSignificantBits >> 40) & 255), (byte) ((mostSignificantBits >> 32) & 255), (byte) ((mostSignificantBits >> 24) & 255), (byte) ((mostSignificantBits >> 16) & 255), (byte) ((mostSignificantBits >> 8) & 255), (byte) (mostSignificantBits & 255), (byte) ((leastSignificantBits >> 56) & 255), (byte) ((leastSignificantBits >> 48) & 255), (byte) ((leastSignificantBits >> 40) & 255), (byte) ((leastSignificantBits >> 32) & 255), (byte) ((leastSignificantBits >> 24) & 255), (byte) ((leastSignificantBits >> 16) & 255), (byte) ((leastSignificantBits >> 8) & 255), (byte) (leastSignificantBits & 255)};
    }
}
