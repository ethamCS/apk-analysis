package j1;

import android.database.Cursor;
import h1.h;
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
public final class g {

    /* renamed from: a */
    public final String f13946a;

    /* renamed from: b */
    public final Map<String, a> f13947b;

    /* renamed from: c */
    public final Set<b> f13948c;

    /* renamed from: d */
    public final Set<d> f13949d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f13950a;

        /* renamed from: b */
        public final String f13951b;

        /* renamed from: c */
        public final int f13952c;

        /* renamed from: d */
        public final boolean f13953d;

        /* renamed from: e */
        public final int f13954e;

        /* renamed from: f */
        public final String f13955f;

        /* renamed from: g */
        private final int f13956g;

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f13950a = str;
            this.f13951b = str2;
            this.f13953d = z10;
            this.f13954e = i10;
            this.f13952c = c(str2);
            this.f13955f = str3;
            this.f13956g = i11;
        }

        private static boolean a(String str) {
            if (str.length() == 0) {
                return false;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (i11 == 0 && charAt != '(') {
                    return false;
                }
                if (charAt == '(') {
                    i10++;
                } else if (charAt == ')' && i10 - 1 == 0 && i11 != str.length() - 1) {
                    return false;
                }
            }
            return i10 == 0;
        }

        public static boolean b(String str, String str2) {
            if (str2 == null) {
                return false;
            }
            if (str.equals(str2)) {
                return true;
            }
            if (!a(str)) {
                return false;
            }
            return str.substring(1, str.length() - 1).trim().equals(str2);
        }

        private static int c(String str) {
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

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f13954e != aVar.f13954e || !this.f13950a.equals(aVar.f13950a) || this.f13953d != aVar.f13953d) {
                return false;
            }
            if (this.f13956g == 1 && aVar.f13956g == 2 && (str3 = this.f13955f) != null && !b(str3, aVar.f13955f)) {
                return false;
            }
            if (this.f13956g == 2 && aVar.f13956g == 1 && (str2 = aVar.f13955f) != null && !b(str2, this.f13955f)) {
                return false;
            }
            int i10 = this.f13956g;
            return (i10 == 0 || i10 != aVar.f13956g || ((str = this.f13955f) == null ? aVar.f13955f == null : b(str, aVar.f13955f))) && this.f13952c == aVar.f13952c;
        }

        public int hashCode() {
            return (((((this.f13950a.hashCode() * 31) + this.f13952c) * 31) + (this.f13953d ? 1231 : 1237)) * 31) + this.f13954e;
        }

        public String toString() {
            return "Column{name='" + this.f13950a + "', type='" + this.f13951b + "', affinity='" + this.f13952c + "', notNull=" + this.f13953d + ", primaryKeyPosition=" + this.f13954e + ", defaultValue='" + this.f13955f + "'}";
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f13957a;

        /* renamed from: b */
        public final String f13958b;

        /* renamed from: c */
        public final String f13959c;

        /* renamed from: d */
        public final List<String> f13960d;

        /* renamed from: e */
        public final List<String> f13961e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f13957a = str;
            this.f13958b = str2;
            this.f13959c = str3;
            this.f13960d = Collections.unmodifiableList(list);
            this.f13961e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f13957a.equals(bVar.f13957a) || !this.f13958b.equals(bVar.f13958b) || !this.f13959c.equals(bVar.f13959c) || !this.f13960d.equals(bVar.f13960d)) {
                return false;
            }
            return this.f13961e.equals(bVar.f13961e);
        }

        public int hashCode() {
            return (((((((this.f13957a.hashCode() * 31) + this.f13958b.hashCode()) * 31) + this.f13959c.hashCode()) * 31) + this.f13960d.hashCode()) * 31) + this.f13961e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f13957a + "', onDelete='" + this.f13958b + "', onUpdate='" + this.f13959c + "', columnNames=" + this.f13960d + ", referenceColumnNames=" + this.f13961e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Comparable<c> {

        /* renamed from: c */
        final int f13962c;

        /* renamed from: d */
        final int f13963d;

        /* renamed from: q */
        final String f13964q;

        /* renamed from: x */
        final String f13965x;

        c(int i10, int i11, String str, String str2) {
            this.f13962c = i10;
            this.f13963d = i11;
            this.f13964q = str;
            this.f13965x = str2;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            int i10 = this.f13962c - cVar.f13962c;
            return i10 == 0 ? this.f13963d - cVar.f13963d : i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final String f13966a;

        /* renamed from: b */
        public final boolean f13967b;

        /* renamed from: c */
        public final List<String> f13968c;

        /* renamed from: d */
        public final List<String> f13969d;

        public d(String str, boolean z10, List<String> list) {
            this(str, z10, list, null);
        }

        public d(String str, boolean z10, List<String> list, List<String> list2) {
            this.f13966a = str;
            this.f13967b = z10;
            this.f13968c = list;
            this.f13969d = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), h.ASC.name()) : list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f13967b != dVar.f13967b || !this.f13968c.equals(dVar.f13968c) || !this.f13969d.equals(dVar.f13969d)) {
                return false;
            }
            return this.f13966a.startsWith("index_") ? dVar.f13966a.startsWith("index_") : this.f13966a.equals(dVar.f13966a);
        }

        public int hashCode() {
            return ((((((this.f13966a.startsWith("index_") ? -1184239155 : this.f13966a.hashCode()) * 31) + (this.f13967b ? 1 : 0)) * 31) + this.f13968c.hashCode()) * 31) + this.f13969d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f13966a + "', unique=" + this.f13967b + ", columns=" + this.f13968c + ", orders=" + this.f13969d + '}';
        }
    }

    public g(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f13946a = str;
        this.f13947b = Collections.unmodifiableMap(map);
        this.f13948c = Collections.unmodifiableSet(set);
        this.f13949d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static g a(m1.g gVar, String str) {
        return new g(str, b(gVar, str), d(gVar, str), f(gVar, str));
    }

    private static Map<String, a> b(m1.g gVar, String str) {
        Cursor Y0 = gVar.Y0("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (Y0.getColumnCount() > 0) {
                int columnIndex = Y0.getColumnIndex("name");
                int columnIndex2 = Y0.getColumnIndex("type");
                int columnIndex3 = Y0.getColumnIndex("notnull");
                int columnIndex4 = Y0.getColumnIndex("pk");
                int columnIndex5 = Y0.getColumnIndex("dflt_value");
                while (Y0.moveToNext()) {
                    String string = Y0.getString(columnIndex);
                    hashMap.put(string, new a(string, Y0.getString(columnIndex2), Y0.getInt(columnIndex3) != 0, Y0.getInt(columnIndex4), Y0.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            Y0.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(m1.g gVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor Y0 = gVar.Y0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = Y0.getColumnIndex("id");
            int columnIndex2 = Y0.getColumnIndex("seq");
            int columnIndex3 = Y0.getColumnIndex("table");
            int columnIndex4 = Y0.getColumnIndex("on_delete");
            int columnIndex5 = Y0.getColumnIndex("on_update");
            List<c> c10 = c(Y0);
            int count = Y0.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                Y0.moveToPosition(i10);
                if (Y0.getInt(columnIndex2) == 0) {
                    int i11 = Y0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c10) {
                        if (cVar.f13962c == i11) {
                            arrayList.add(cVar.f13964q);
                            arrayList2.add(cVar.f13965x);
                        }
                    }
                    hashSet.add(new b(Y0.getString(columnIndex3), Y0.getString(columnIndex4), Y0.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            Y0.close();
        }
    }

    private static d e(m1.g gVar, String str, boolean z10) {
        Cursor Y0 = gVar.Y0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = Y0.getColumnIndex("seqno");
            int columnIndex2 = Y0.getColumnIndex("cid");
            int columnIndex3 = Y0.getColumnIndex("name");
            int columnIndex4 = Y0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (Y0.moveToNext()) {
                    if (Y0.getInt(columnIndex2) >= 0) {
                        int i10 = Y0.getInt(columnIndex);
                        String string = Y0.getString(columnIndex3);
                        String str2 = Y0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        treeMap.put(Integer.valueOf(i10), string);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                ArrayList arrayList2 = new ArrayList(treeMap2.size());
                arrayList2.addAll(treeMap2.values());
                return new d(str, z10, arrayList, arrayList2);
            }
            return null;
        } finally {
            Y0.close();
        }
    }

    private static Set<d> f(m1.g gVar, String str) {
        Cursor Y0 = gVar.Y0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = Y0.getColumnIndex("name");
            int columnIndex2 = Y0.getColumnIndex("origin");
            int columnIndex3 = Y0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (Y0.moveToNext()) {
                    if ("c".equals(Y0.getString(columnIndex2))) {
                        String string = Y0.getString(columnIndex);
                        boolean z10 = true;
                        if (Y0.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        d e10 = e(gVar, string, z10);
                        if (e10 == null) {
                            return null;
                        }
                        hashSet.add(e10);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            Y0.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = this.f13946a;
        if (str == null ? gVar.f13946a != null : !str.equals(gVar.f13946a)) {
            return false;
        }
        Map<String, a> map = this.f13947b;
        if (map == null ? gVar.f13947b != null : !map.equals(gVar.f13947b)) {
            return false;
        }
        Set<b> set2 = this.f13948c;
        if (set2 == null ? gVar.f13948c != null : !set2.equals(gVar.f13948c)) {
            return false;
        }
        Set<d> set3 = this.f13949d;
        if (set3 != null && (set = gVar.f13949d) != null) {
            return set3.equals(set);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f13946a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f13947b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f13948c;
        if (set != null) {
            i10 = set.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "TableInfo{name='" + this.f13946a + "', columns=" + this.f13947b + ", foreignKeys=" + this.f13948c + ", indices=" + this.f13949d + '}';
    }
}
