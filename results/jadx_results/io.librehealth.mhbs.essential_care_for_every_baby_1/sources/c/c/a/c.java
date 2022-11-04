package c.c.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import d.a.c.a.i;
import io.flutter.embedding.engine.h.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class c implements io.flutter.embedding.engine.h.a, i.c {
    static String i;
    private static HandlerThread k;
    private static Handler l;

    /* renamed from: a */
    private Context f616a;

    /* renamed from: b */
    private d.a.c.a.i f617b;

    /* renamed from: c */
    static final Map<String, Integer> f613c = new HashMap();

    /* renamed from: d */
    private static boolean f614d = false;

    /* renamed from: e */
    private static int f615e = 10;
    static int f = 0;
    private static final Object g = new Object();
    private static final Object h = new Object();
    private static int j = 0;
    @SuppressLint({"UseSparseArrays"})
    static final Map<Integer, c.c.a.a> m = new HashMap();

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d.a.c.a.h f618a;

        /* renamed from: b */
        final /* synthetic */ i f619b;

        /* renamed from: c */
        final /* synthetic */ c.c.a.a f620c;

        a(d.a.c.a.h hVar, i iVar, c.c.a.a aVar) {
            c.this = r1;
            this.f618a = hVar;
            this.f619b = iVar;
            this.f620c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.P(this.f620c, new c.c.a.f.e(this.f618a, this.f619b));
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d.a.c.a.h f622a;

        /* renamed from: b */
        final /* synthetic */ i f623b;

        /* renamed from: c */
        final /* synthetic */ c.c.a.a f624c;

        b(d.a.c.a.h hVar, i iVar, c.c.a.a aVar) {
            c.this = r1;
            this.f622a = hVar;
            this.f623b = iVar;
            this.f624c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.c.a.f.e eVar = new c.c.a.f.e(this.f622a, this.f623b);
            boolean e2 = eVar.e();
            boolean h = eVar.h();
            ArrayList arrayList = new ArrayList();
            for (Map map : (List) this.f622a.a("operations")) {
                c.c.a.f.c cVar = new c.c.a.f.c(map, e2);
                String l = cVar.l();
                l.hashCode();
                char c2 = 65535;
                switch (l.hashCode()) {
                    case -1319569547:
                        if (l.equals("execute")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1183792455:
                        if (l.equals("insert")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -838846263:
                        if (l.equals("update")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 107944136:
                        if (l.equals("query")) {
                            c2 = 3;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        if (c.this.r(this.f624c, cVar)) {
                            cVar.q(arrayList);
                        } else {
                            if (!h) {
                                cVar.o(this.f623b);
                                return;
                            }
                            cVar.p(arrayList);
                        }
                    case 1:
                        if (c.this.z(this.f624c, cVar)) {
                            cVar.q(arrayList);
                        } else {
                            if (!h) {
                                cVar.o(this.f623b);
                                return;
                            }
                            cVar.p(arrayList);
                        }
                    case 2:
                        if (c.this.R(this.f624c, cVar)) {
                            cVar.q(arrayList);
                        } else {
                            if (!h) {
                                cVar.o(this.f623b);
                                return;
                            }
                            cVar.p(arrayList);
                        }
                    case 3:
                        if (c.this.P(this.f624c, cVar)) {
                            cVar.q(arrayList);
                        } else {
                            if (!h) {
                                cVar.o(this.f623b);
                                return;
                            }
                            cVar.p(arrayList);
                        }
                    default:
                        i iVar = this.f623b;
                        iVar.a("bad_param", "Batch method '" + l + "' not supported", null);
                        return;
                }
            }
            i iVar2 = this.f623b;
            if (e2) {
                iVar2.b(null);
            } else {
                iVar2.b(arrayList);
            }
        }
    }

    /* renamed from: c.c.a.c$c */
    /* loaded from: classes.dex */
    public class RunnableC0034c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d.a.c.a.h f626a;

        /* renamed from: b */
        final /* synthetic */ i f627b;

        /* renamed from: c */
        final /* synthetic */ c.c.a.a f628c;

        RunnableC0034c(d.a.c.a.h hVar, i iVar, c.c.a.a aVar) {
            c.this = r1;
            this.f626a = hVar;
            this.f627b = iVar;
            this.f628c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.z(this.f628c, new c.c.a.f.e(this.f626a, this.f627b));
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ c.c.a.a f630a;

        /* renamed from: b */
        final /* synthetic */ d.a.c.a.h f631b;

        /* renamed from: c */
        final /* synthetic */ i f632c;

        d(c.c.a.a aVar, d.a.c.a.h hVar, i iVar) {
            c.this = r1;
            this.f630a = aVar;
            this.f631b = hVar;
            this.f632c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.s(this.f630a, this.f631b, this.f632c) == null) {
                return;
            }
            this.f632c.b(null);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d.a.c.a.h f634a;

        /* renamed from: b */
        final /* synthetic */ i f635b;

        /* renamed from: c */
        final /* synthetic */ c.c.a.a f636c;

        e(d.a.c.a.h hVar, i iVar, c.c.a.a aVar) {
            c.this = r1;
            this.f634a = hVar;
            this.f635b = iVar;
            this.f636c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.R(this.f636c, new c.c.a.f.e(this.f634a, this.f635b));
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f638a;

        /* renamed from: b */
        final /* synthetic */ String f639b;

        /* renamed from: c */
        final /* synthetic */ i f640c;

        /* renamed from: d */
        final /* synthetic */ Boolean f641d;

        /* renamed from: e */
        final /* synthetic */ c.c.a.a f642e;
        final /* synthetic */ d.a.c.a.h f;
        final /* synthetic */ boolean g;
        final /* synthetic */ int h;

        f(boolean z, String str, i iVar, Boolean bool, c.c.a.a aVar, d.a.c.a.h hVar, boolean z2, int i) {
            c.this = r1;
            this.f638a = z;
            this.f639b = str;
            this.f640c = iVar;
            this.f641d = bool;
            this.f642e = aVar;
            this.f = hVar;
            this.g = z2;
            this.h = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.h) {
                if (!this.f638a) {
                    File file = new File(new File(this.f639b).getParent());
                    if (!file.exists() && !file.mkdirs() && !file.exists()) {
                        i iVar = this.f640c;
                        iVar.a("sqlite_error", "open_failed " + this.f639b, null);
                        return;
                    }
                }
                try {
                    if (Boolean.TRUE.equals(this.f641d)) {
                        this.f642e.h();
                    } else {
                        this.f642e.g();
                    }
                    synchronized (c.g) {
                        if (this.g) {
                            c.f613c.put(this.f639b, Integer.valueOf(this.h));
                        }
                        c.m.put(Integer.valueOf(this.h), this.f642e);
                    }
                    if (c.c.a.b.b(this.f642e.f611d)) {
                        Log.d("Sqflite", this.f642e.d() + "opened " + this.h + " " + this.f639b);
                    }
                    this.f640c.b(c.B(this.h, false, false));
                } catch (Exception e2) {
                    c.this.y(e2, new c.c.a.f.e(this.f, this.f640c), this.f642e);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ c.c.a.a f643a;

        /* renamed from: b */
        final /* synthetic */ i f644b;

        g(c.c.a.a aVar, i iVar) {
            c.this = r1;
            this.f643a = aVar;
            this.f644b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.h) {
                c.this.n(this.f643a);
            }
            this.f644b.b(null);
        }
    }

    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ c.c.a.a f646a;

        /* renamed from: b */
        final /* synthetic */ String f647b;

        /* renamed from: c */
        final /* synthetic */ i f648c;

        h(c.c.a.a aVar, String str, i iVar) {
            c.this = r1;
            this.f646a = aVar;
            this.f647b = str;
            this.f648c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.h) {
                c.c.a.a aVar = this.f646a;
                if (aVar != null) {
                    c.this.n(aVar);
                }
                try {
                    if (c.c.a.b.c(c.f)) {
                        Log.d("Sqflite", "delete database " + this.f647b);
                    }
                    c.c.a.a.b(this.f647b);
                } catch (Exception e2) {
                    Log.e("Sqflite", "error " + e2 + " while closing database " + c.j);
                }
            }
            this.f648c.b(null);
        }
    }

    /* loaded from: classes.dex */
    public class i implements i.d {

        /* renamed from: a */
        final Handler f650a;

        /* renamed from: b */
        private final i.d f651b;

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Object f652a;

            a(Object obj) {
                i.this = r1;
                this.f652a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.f651b.b(this.f652a);
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f654a;

            /* renamed from: b */
            final /* synthetic */ String f655b;

            /* renamed from: c */
            final /* synthetic */ Object f656c;

            b(String str, String str2, Object obj) {
                i.this = r1;
                this.f654a = str;
                this.f655b = str2;
                this.f656c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.f651b.a(this.f654a, this.f655b, this.f656c);
            }
        }

        /* renamed from: c.c.a.c$i$c */
        /* loaded from: classes.dex */
        class RunnableC0035c implements Runnable {
            RunnableC0035c() {
                i.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.f651b.c();
            }
        }

        private i(c cVar, i.d dVar) {
            this.f650a = new Handler(Looper.getMainLooper());
            this.f651b = dVar;
        }

        /* synthetic */ i(c cVar, i.d dVar, a aVar) {
            this(cVar, dVar);
        }

        @Override // d.a.c.a.i.d
        public void a(String str, String str2, Object obj) {
            this.f650a.post(new b(str, str2, obj));
        }

        @Override // d.a.c.a.i.d
        public void b(Object obj) {
            this.f650a.post(new a(obj));
        }

        @Override // d.a.c.a.i.d
        public void c() {
            this.f650a.post(new RunnableC0035c());
        }
    }

    static boolean A(String str) {
        return str == null || str.equals(":memory:");
    }

    static Map B(int i2, boolean z, boolean z2) {
        Boolean bool = Boolean.TRUE;
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i2));
        if (z) {
            hashMap.put("recovered", bool);
        }
        if (z2) {
            hashMap.put("recoveredInTransaction", bool);
        }
        return hashMap;
    }

    private void C(Context context, d.a.c.a.b bVar) {
        this.f616a = context;
        d.a.c.a.i iVar = new d.a.c.a.i(bVar, "com.tekartik.sqflite");
        this.f617b = iVar;
        iVar.e(this);
    }

    private void D(d.a.c.a.h hVar, i.d dVar) {
        c.c.a.a w = w(hVar, dVar);
        if (w == null) {
            return;
        }
        l.post(new b(hVar, new i(this, dVar, null), w));
    }

    private void E(d.a.c.a.h hVar, i.d dVar) {
        int intValue = ((Integer) hVar.a("id")).intValue();
        c.c.a.a w = w(hVar, dVar);
        if (w == null) {
            return;
        }
        if (c.c.a.b.b(w.f611d)) {
            Log.d("Sqflite", w.d() + "closing " + intValue + " " + w.f609b);
        }
        String str = w.f609b;
        synchronized (g) {
            m.remove(Integer.valueOf(intValue));
            if (w.f608a) {
                f613c.remove(str);
            }
        }
        l.post(new g(w, new i(this, dVar, null)));
    }

    private void F(d.a.c.a.h hVar, i.d dVar) {
        HashMap hashMap = new HashMap();
        if ("get".equals((String) hVar.a("cmd"))) {
            int i2 = f;
            if (i2 > 0) {
                hashMap.put("logLevel", Integer.valueOf(i2));
            }
            Map<Integer, c.c.a.a> map = m;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<Integer, c.c.a.a> entry : map.entrySet()) {
                    c.c.a.a value = entry.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", value.f609b);
                    hashMap3.put("singleInstance", Boolean.valueOf(value.f608a));
                    int i3 = value.f611d;
                    if (i3 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i3));
                    }
                    hashMap2.put(entry.getKey().toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        dVar.b(hashMap);
    }

    private void G(d.a.c.a.h hVar, i.d dVar) {
        c.c.a.e.a.f661a = Boolean.TRUE.equals(hVar.b());
        c.c.a.e.a.f663c = c.c.a.e.a.f662b && c.c.a.e.a.f661a;
        if (!c.c.a.e.a.f661a) {
            f = 0;
        } else if (c.c.a.e.a.f663c) {
            f = 2;
        } else if (c.c.a.e.a.f661a) {
            f = 1;
        }
        dVar.b(null);
    }

    private void H(d.a.c.a.h hVar, i.d dVar) {
        c.c.a.a aVar;
        Map<Integer, c.c.a.a> map;
        String str = (String) hVar.a("path");
        synchronized (g) {
            if (c.c.a.b.c(f)) {
                Log.d("Sqflite", "Look for " + str + " in " + f613c.keySet());
            }
            Map<String, Integer> map2 = f613c;
            Integer num = map2.get(str);
            if (num == null || (aVar = (map = m).get(num)) == null || !aVar.f612e.isOpen()) {
                aVar = null;
            } else {
                if (c.c.a.b.c(f)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar.d());
                    sb.append("found single instance ");
                    sb.append(aVar.f ? "(in transaction) " : "");
                    sb.append(num);
                    sb.append(" ");
                    sb.append(str);
                    Log.d("Sqflite", sb.toString());
                }
                map.remove(num);
                map2.remove(str);
            }
        }
        h hVar2 = new h(aVar, str, new i(this, dVar, null));
        Handler handler = l;
        if (handler != null) {
            handler.post(hVar2);
        } else {
            hVar2.run();
        }
    }

    private void I(d.a.c.a.h hVar, i.d dVar) {
        c.c.a.a w = w(hVar, dVar);
        if (w == null) {
            return;
        }
        l.post(new d(w, hVar, new i(this, dVar, null)));
    }

    private void K(d.a.c.a.h hVar, i.d dVar) {
        c.c.a.a w = w(hVar, dVar);
        if (w == null) {
            return;
        }
        l.post(new RunnableC0034c(hVar, new i(this, dVar, null), w));
    }

    private void L(d.a.c.a.h hVar, i.d dVar) {
        int i2;
        c.c.a.a aVar;
        String str = (String) hVar.a("path");
        Boolean bool = (Boolean) hVar.a("readOnly");
        boolean A = A(str);
        boolean z = !Boolean.FALSE.equals(hVar.a("singleInstance")) && !A;
        if (z) {
            synchronized (g) {
                if (c.c.a.b.c(f)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f613c.keySet());
                }
                Integer num = f613c.get(str);
                if (num != null && (aVar = m.get(num)) != null) {
                    if (aVar.f612e.isOpen()) {
                        if (c.c.a.b.c(f)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(aVar.d());
                            sb.append("re-opened single instance ");
                            sb.append(aVar.f ? "(in transaction) " : "");
                            sb.append(num);
                            sb.append(" ");
                            sb.append(str);
                            Log.d("Sqflite", sb.toString());
                        }
                        dVar.b(B(num.intValue(), true, aVar.f));
                        return;
                    } else if (c.c.a.b.c(f)) {
                        Log.d("Sqflite", aVar.d() + "single instance database of " + str + " not opened");
                    }
                }
            }
        }
        Object obj = g;
        synchronized (obj) {
            i2 = j + 1;
            j = i2;
        }
        c.c.a.a aVar2 = new c.c.a.a(str, i2, z, f);
        i iVar = new i(this, dVar, null);
        synchronized (obj) {
            if (l == null) {
                HandlerThread handlerThread = new HandlerThread("Sqflite", f615e);
                k = handlerThread;
                handlerThread.start();
                l = new Handler(k.getLooper());
                if (c.c.a.b.b(aVar2.f611d)) {
                    Log.d("Sqflite", aVar2.d() + "starting thread" + k + " priority " + f615e);
                }
            }
            if (c.c.a.b.b(aVar2.f611d)) {
                Log.d("Sqflite", aVar2.d() + "opened " + i2 + " " + str);
            }
            l.post(new f(A, str, iVar, bool, aVar2, hVar, z, i2));
        }
    }

    private void N(d.a.c.a.h hVar, i.d dVar) {
        c.c.a.a w = w(hVar, dVar);
        if (w == null) {
            return;
        }
        l.post(new a(hVar, new i(this, dVar, null), w));
    }

    private void O(d.a.c.a.h hVar, i.d dVar) {
        c.c.a.a w = w(hVar, dVar);
        if (w == null) {
            return;
        }
        l.post(new e(hVar, new i(this, dVar, null), w));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [c.c.a.f.f, c.c.a.f.g] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public boolean P(c.c.a.a aVar, c.c.a.f.f fVar) {
        Throwable th;
        Exception e2;
        c.c.a.d d2 = fVar.d();
        ArrayList arrayList = new ArrayList();
        if (c.c.a.b.b(aVar.f611d)) {
            Log.d("Sqflite", aVar.d() + d2);
        }
        boolean z = f614d;
        Cursor cursor = 0;
        try {
            try {
                c.c.a.d i2 = d2.i();
                Cursor rawQuery = aVar.c().rawQuery(i2.e(), i2.b());
                ArrayList arrayList2 = null;
                int i3 = 0;
                while (rawQuery.moveToNext()) {
                    try {
                        if (z) {
                            Map<String, Object> p = p(rawQuery);
                            if (c.c.a.b.b(aVar.f611d)) {
                                Log.d("Sqflite", aVar.d() + Q(p));
                            }
                            arrayList.add(p);
                        } else {
                            if (cursor == 0) {
                                ArrayList arrayList3 = new ArrayList();
                                HashMap hashMap = new HashMap();
                                i3 = rawQuery.getColumnCount();
                                hashMap.put("columns", Arrays.asList(rawQuery.getColumnNames()));
                                hashMap.put("rows", arrayList3);
                                arrayList2 = arrayList3;
                                cursor = hashMap;
                            }
                            arrayList2.add(o(rawQuery, i3));
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        cursor = rawQuery;
                        y(e2, fVar, aVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (z) {
                    fVar.b(arrayList);
                } else {
                    if (cursor == 0) {
                        cursor = new HashMap();
                    }
                    fVar.b(cursor);
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (Exception e4) {
                e2 = e4;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static String Q(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof byte[])) {
            return obj instanceof Map ? u((Map) obj).toString() : obj.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (byte b2 : (byte[]) obj) {
            arrayList.add(Integer.valueOf(b2));
        }
        return arrayList.toString();
    }

    public boolean R(c.c.a.a aVar, c.c.a.f.f fVar) {
        Throwable th;
        Exception e2;
        if (!t(aVar, fVar)) {
            return false;
        }
        Cursor cursor = null;
        if (fVar.e()) {
            fVar.b(null);
            return true;
        }
        try {
            try {
                Cursor rawQuery = aVar.f().rawQuery("SELECT changes()", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                            int i2 = rawQuery.getInt(0);
                            if (c.c.a.b.b(aVar.f611d)) {
                                Log.d("Sqflite", aVar.d() + "changed " + i2);
                            }
                            fVar.b(Integer.valueOf(i2));
                            if (rawQuery != null) {
                                rawQuery.close();
                            }
                            return true;
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        cursor = rawQuery;
                        y(e2, fVar, aVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", aVar.d() + "fail to read changes for Update/Delete");
                fVar.b(null);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (Exception e4) {
                e2 = e4;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void n(c.c.a.a aVar) {
        try {
            if (c.c.a.b.b(aVar.f611d)) {
                Log.d("Sqflite", aVar.d() + "closing database " + k);
            }
            aVar.a();
        } catch (Exception e2) {
            Log.e("Sqflite", "error " + e2 + " while closing database " + j);
        }
        synchronized (g) {
            if (m.isEmpty() && l != null) {
                if (c.c.a.b.b(aVar.f611d)) {
                    Log.d("Sqflite", aVar.d() + "stopping thread" + k);
                }
                k.quit();
                k = null;
                l = null;
            }
        }
    }

    private static List<Object> o(Cursor cursor, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            Object q = q(cursor, i3);
            if (c.c.a.e.a.f663c) {
                String str = null;
                if (q != null) {
                    str = q.getClass().isArray() ? "array(" + q.getClass().getComponentType().getName() + ")" : q.getClass().getName();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("column ");
                sb.append(i3);
                sb.append(" ");
                sb.append(cursor.getType(i3));
                sb.append(": ");
                sb.append(q);
                sb.append(str == null ? "" : " (" + str + ")");
                Log.d("Sqflite", sb.toString());
            }
            arrayList.add(q);
        }
        return arrayList;
    }

    private static Map<String, Object> p(Cursor cursor) {
        Object obj;
        String str;
        HashMap hashMap = new HashMap();
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (c.c.a.e.a.f663c) {
                Log.d("Sqflite", "column " + i2 + " " + cursor.getType(i2));
            }
            int type = cursor.getType(i2);
            if (type == 0) {
                str = columnNames[i2];
                obj = null;
            } else if (type == 1) {
                str = columnNames[i2];
                obj = Long.valueOf(cursor.getLong(i2));
            } else if (type == 2) {
                str = columnNames[i2];
                obj = Double.valueOf(cursor.getDouble(i2));
            } else if (type != 3) {
                if (type == 4) {
                    hashMap.put(columnNames[i2], cursor.getBlob(i2));
                }
            } else {
                str = columnNames[i2];
                obj = cursor.getString(i2);
            }
            hashMap.put(str, obj);
        }
        return hashMap;
    }

    private static Object q(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type != 1) {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type == 4) {
                return cursor.getBlob(i2);
            }
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    public boolean r(c.c.a.a aVar, c.c.a.f.f fVar) {
        if (!t(aVar, fVar)) {
            return false;
        }
        fVar.b(null);
        return true;
    }

    public c.c.a.a s(c.c.a.a aVar, d.a.c.a.h hVar, i.d dVar) {
        if (t(aVar, new c.c.a.f.d(dVar, x(hVar), (Boolean) hVar.a("inTransaction")))) {
            return aVar;
        }
        return null;
    }

    private boolean t(c.c.a.a aVar, c.c.a.f.f fVar) {
        Boolean bool = Boolean.FALSE;
        c.c.a.d d2 = fVar.d();
        if (c.c.a.b.b(aVar.f611d)) {
            Log.d("Sqflite", aVar.d() + d2);
        }
        Boolean f2 = fVar.f();
        try {
            try {
                aVar.f().execSQL(d2.e(), d2.f());
                if (Boolean.TRUE.equals(f2)) {
                    aVar.f = true;
                }
                if (bool.equals(f2)) {
                    aVar.f = false;
                }
                return true;
            } catch (Exception e2) {
                y(e2, fVar, aVar);
                if (bool.equals(f2)) {
                    aVar.f = false;
                }
                return false;
            }
        } catch (Throwable th) {
            if (bool.equals(f2)) {
                aVar.f = false;
            }
            throw th;
        }
    }

    private static Map<String, Object> u(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            hashMap.put(Q(entry.getKey()), value instanceof Map ? u((Map) value) : Q(value));
        }
        return hashMap;
    }

    private c.c.a.a v(int i2) {
        return m.get(Integer.valueOf(i2));
    }

    private c.c.a.a w(d.a.c.a.h hVar, i.d dVar) {
        int intValue = ((Integer) hVar.a("id")).intValue();
        c.c.a.a v = v(intValue);
        if (v != null) {
            return v;
        }
        dVar.a("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    private c.c.a.d x(d.a.c.a.h hVar) {
        return new c.c.a.d((String) hVar.a("sql"), (List) hVar.a("arguments"));
    }

    public void y(Exception exc, c.c.a.f.f fVar, c.c.a.a aVar) {
        String message;
        Map<String, Object> a2;
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            message = "open_failed " + aVar.f609b;
            a2 = null;
        } else {
            boolean z = exc instanceof SQLException;
            message = exc.getMessage();
            a2 = c.c.a.f.h.a(fVar);
        }
        fVar.a("sqlite_error", message, a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean z(c.c.a.a r10, c.c.a.f.f r11) {
        /*
            r9 = this;
            boolean r0 = r9.t(r10, r11)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r11.e()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L14
            r11.b(r2)
            return r3
        L14:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r10.f()     // Catch: java.lang.Throwable -> Lc0 java.lang.Exception -> Lc2
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> Lc0 java.lang.Exception -> Lc2
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L9f
            int r5 = r0.getCount()     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            if (r5 <= 0) goto L9f
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            if (r5 == 0) goto L9f
            int r5 = r0.getInt(r1)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            if (r5 != 0) goto L69
            int r5 = r10.f611d     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            boolean r5 = c.c.a.b.b(r5)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            if (r5 == 0) goto L60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            r5.<init>()     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            java.lang.String r6 = r10.d()     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            r5.append(r6)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            long r6 = r0.getLong(r3)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            r5.append(r6)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            android.util.Log.d(r4, r5)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
        L60:
            r11.b(r2)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            if (r0 == 0) goto L68
            r0.close()
        L68:
            return r3
        L69:
            long r5 = r0.getLong(r3)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            int r2 = r10.f611d     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            boolean r2 = c.c.a.b.b(r2)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            if (r2 == 0) goto L90
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            r2.<init>()     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            java.lang.String r7 = r10.d()     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            r2.append(r7)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            java.lang.String r7 = "inserted "
            r2.append(r7)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            r2.append(r5)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            android.util.Log.d(r4, r2)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
        L90:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            r11.b(r2)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            if (r0 == 0) goto L9c
            r0.close()
        L9c:
            return r3
        L9d:
            r2 = move-exception
            goto Lc6
        L9f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            r5.<init>()     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            java.lang.String r6 = r10.d()     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            r5.append(r6)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            android.util.Log.e(r4, r5)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            r11.b(r2)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lcf
            if (r0 == 0) goto Lbf
            r0.close()
        Lbf:
            return r3
        Lc0:
            r10 = move-exception
            goto Ld1
        Lc2:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        Lc6:
            r9.y(r2, r11, r10)     // Catch: java.lang.Throwable -> Lcf
            if (r0 == 0) goto Lce
            r0.close()
        Lce:
            return r1
        Lcf:
            r10 = move-exception
            r2 = r0
        Ld1:
            if (r2 == 0) goto Ld6
            r2.close()
        Ld6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.c.z(c.c.a.a, c.c.a.f.f):boolean");
    }

    void J(d.a.c.a.h hVar, i.d dVar) {
        if (i == null) {
            i = this.f616a.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.b(i);
    }

    void M(d.a.c.a.h hVar, i.d dVar) {
        Object a2 = hVar.a("queryAsMapList");
        if (a2 != null) {
            f614d = Boolean.TRUE.equals(a2);
        }
        Object a3 = hVar.a("androidThreadPriority");
        if (a3 != null) {
            f615e = ((Integer) a3).intValue();
        }
        Integer a4 = c.c.a.b.a(hVar);
        if (a4 != null) {
            f = a4.intValue();
        }
        dVar.b(null);
    }

    @Override // io.flutter.embedding.engine.h.a
    public void e(a.b bVar) {
        this.f616a = null;
        this.f617b.e(null);
        this.f617b = null;
    }

    @Override // d.a.c.a.i.c
    public void g(d.a.c.a.h hVar, i.d dVar) {
        String str = hVar.f695a;
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c2 = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c2 = 4;
                    break;
                }
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c2 = 5;
                    break;
                }
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c2 = 6;
                    break;
                }
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c2 = 7;
                    break;
                }
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 107944136:
                if (str.equals("query")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c2 = '\f';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                I(hVar, dVar);
                return;
            case 1:
                E(hVar, dVar);
                return;
            case 2:
                M(hVar, dVar);
                return;
            case 3:
                K(hVar, dVar);
                return;
            case 4:
                O(hVar, dVar);
                return;
            case 5:
                H(hVar, dVar);
                return;
            case 6:
                G(hVar, dVar);
                return;
            case 7:
                L(hVar, dVar);
                return;
            case '\b':
                D(hVar, dVar);
                return;
            case '\t':
                F(hVar, dVar);
                return;
            case '\n':
                N(hVar, dVar);
                return;
            case 11:
                dVar.b("Android " + Build.VERSION.RELEASE);
                return;
            case '\f':
                J(hVar, dVar);
                return;
            default:
                dVar.c();
                return;
        }
    }

    @Override // io.flutter.embedding.engine.h.a
    public void h(a.b bVar) {
        C(bVar.a(), bVar.b());
    }
}
