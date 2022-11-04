package androidx.room.s;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    public final String f1939a;

    /* renamed from: b */
    public final Map<String, a> f1940b;

    /* renamed from: c */
    public final Set<b> f1941c;

    /* renamed from: d */
    public final Set<d> f1942d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final String f1943a;

        /* renamed from: b */
        public final String f1944b;

        /* renamed from: c */
        public final int f1945c;

        /* renamed from: d */
        public final boolean f1946d;

        /* renamed from: e */
        public final int f1947e;

        /* renamed from: f */
        public final String f1948f;

        /* renamed from: g */
        private final int f1949g;

        public a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f1943a = str;
            this.f1944b = str2;
            this.f1946d = z;
            this.f1947e = i;
            this.f1945c = a(str2);
            this.f1948f = str3;
            this.f1949g = i2;
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean b() {
            return this.f1947e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f1947e != aVar.f1947e) {
                    return false;
                }
            } else if (b() != aVar.b()) {
                return false;
            }
            if (!this.f1943a.equals(aVar.f1943a) || this.f1946d != aVar.f1946d) {
                return false;
            }
            if (this.f1949g == 1 && aVar.f1949g == 2 && (str3 = this.f1948f) != null && !str3.equals(aVar.f1948f)) {
                return false;
            }
            if (this.f1949g == 2 && aVar.f1949g == 1 && (str2 = aVar.f1948f) != null && !str2.equals(this.f1948f)) {
                return false;
            }
            int i = this.f1949g;
            return (i == 0 || i != aVar.f1949g || ((str = this.f1948f) == null ? aVar.f1948f == null : str.equals(aVar.f1948f))) && this.f1945c == aVar.f1945c;
        }

        public int hashCode() {
            return (((((this.f1943a.hashCode() * 31) + this.f1945c) * 31) + (this.f1946d ? 1231 : 1237)) * 31) + this.f1947e;
        }

        public String toString() {
            return "Column{name='" + this.f1943a + "', type='" + this.f1944b + "', affinity='" + this.f1945c + "', notNull=" + this.f1946d + ", primaryKeyPosition=" + this.f1947e + ", defaultValue='" + this.f1948f + "'}";
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final String f1950a;

        /* renamed from: b */
        public final String f1951b;

        /* renamed from: c */
        public final String f1952c;

        /* renamed from: d */
        public final List<String> f1953d;

        /* renamed from: e */
        public final List<String> f1954e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f1950a = str;
            this.f1951b = str2;
            this.f1952c = str3;
            this.f1953d = Collections.unmodifiableList(list);
            this.f1954e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f1950a.equals(bVar.f1950a) || !this.f1951b.equals(bVar.f1951b) || !this.f1952c.equals(bVar.f1952c) || !this.f1953d.equals(bVar.f1953d)) {
                return false;
            }
            return this.f1954e.equals(bVar.f1954e);
        }

        public int hashCode() {
            return (((((((this.f1950a.hashCode() * 31) + this.f1951b.hashCode()) * 31) + this.f1952c.hashCode()) * 31) + this.f1953d.hashCode()) * 31) + this.f1954e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f1950a + "', onDelete='" + this.f1951b + "', onUpdate='" + this.f1952c + "', columnNames=" + this.f1953d + ", referenceColumnNames=" + this.f1954e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Comparable<c> {

        /* renamed from: b */
        final int f1955b;

        /* renamed from: c */
        final int f1956c;

        /* renamed from: d */
        final String f1957d;

        /* renamed from: e */
        final String f1958e;

        c(int i, int i2, String str, String str2) {
            this.f1955b = i;
            this.f1956c = i2;
            this.f1957d = str;
            this.f1958e = str2;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            int i = this.f1955b - cVar.f1955b;
            return i == 0 ? this.f1956c - cVar.f1956c : i;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final String f1959a;

        /* renamed from: b */
        public final boolean f1960b;

        /* renamed from: c */
        public final List<String> f1961c;

        public d(String str, boolean z, List<String> list) {
            this.f1959a = str;
            this.f1960b = z;
            this.f1961c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f1960b != dVar.f1960b || !this.f1961c.equals(dVar.f1961c)) {
                return false;
            }
            return this.f1959a.startsWith("index_") ? dVar.f1959a.startsWith("index_") : this.f1959a.equals(dVar.f1959a);
        }

        public int hashCode() {
            return ((((this.f1959a.startsWith("index_") ? -1184239155 : this.f1959a.hashCode()) * 31) + (this.f1960b ? 1 : 0)) * 31) + this.f1961c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f1959a + "', unique=" + this.f1960b + ", columns=" + this.f1961c + '}';
        }
    }

    public e(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f1939a = str;
        this.f1940b = Collections.unmodifiableMap(map);
        this.f1941c = Collections.unmodifiableSet(set);
        this.f1942d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static e a(b.o.a.b bVar, String str) {
        return new e(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    private static Map<String, a> b(b.o.a.b bVar, String str) {
        Cursor V = bVar.V("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (V.getColumnCount() > 0) {
                int columnIndex = V.getColumnIndex("name");
                int columnIndex2 = V.getColumnIndex("type");
                int columnIndex3 = V.getColumnIndex("notnull");
                int columnIndex4 = V.getColumnIndex("pk");
                int columnIndex5 = V.getColumnIndex("dflt_value");
                while (V.moveToNext()) {
                    String string = V.getString(columnIndex);
                    hashMap.put(string, new a(string, V.getString(columnIndex2), V.getInt(columnIndex3) != 0, V.getInt(columnIndex4), V.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            V.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(b.o.a.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor V = bVar.V("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = V.getColumnIndex("id");
            int columnIndex2 = V.getColumnIndex("seq");
            int columnIndex3 = V.getColumnIndex("table");
            int columnIndex4 = V.getColumnIndex("on_delete");
            int columnIndex5 = V.getColumnIndex("on_update");
            List<c> c2 = c(V);
            int count = V.getCount();
            for (int i = 0; i < count; i++) {
                V.moveToPosition(i);
                if (V.getInt(columnIndex2) == 0) {
                    int i2 = V.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c2) {
                        if (cVar.f1955b == i2) {
                            arrayList.add(cVar.f1957d);
                            arrayList2.add(cVar.f1958e);
                        }
                    }
                    hashSet.add(new b(V.getString(columnIndex3), V.getString(columnIndex4), V.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            V.close();
        }
    }

    private static d e(b.o.a.b bVar, String str, boolean z) {
        Cursor V = bVar.V("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = V.getColumnIndex("seqno");
            int columnIndex2 = V.getColumnIndex("cid");
            int columnIndex3 = V.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (V.moveToNext()) {
                    if (V.getInt(columnIndex2) >= 0) {
                        int i = V.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), V.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z, arrayList);
            }
            return null;
        } finally {
            V.close();
        }
    }

    private static Set<d> f(b.o.a.b bVar, String str) {
        Cursor V = bVar.V("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = V.getColumnIndex("name");
            int columnIndex2 = V.getColumnIndex("origin");
            int columnIndex3 = V.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (V.moveToNext()) {
                    if ("c".equals(V.getString(columnIndex2))) {
                        String string = V.getString(columnIndex);
                        boolean z = true;
                        if (V.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        d e2 = e(bVar, string, z);
                        if (e2 == null) {
                            return null;
                        }
                        hashSet.add(e2);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            V.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f1939a;
        if (str == null ? eVar.f1939a != null : !str.equals(eVar.f1939a)) {
            return false;
        }
        Map<String, a> map = this.f1940b;
        if (map == null ? eVar.f1940b != null : !map.equals(eVar.f1940b)) {
            return false;
        }
        Set<b> set2 = this.f1941c;
        if (set2 == null ? eVar.f1941c != null : !set2.equals(eVar.f1941c)) {
            return false;
        }
        Set<d> set3 = this.f1942d;
        if (set3 != null && (set = eVar.f1942d) != null) {
            return set3.equals(set);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f1939a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f1940b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f1941c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TableInfo{name='" + this.f1939a + "', columns=" + this.f1940b + ", foreignKeys=" + this.f1941c + ", indices=" + this.f1942d + '}';
    }
}
