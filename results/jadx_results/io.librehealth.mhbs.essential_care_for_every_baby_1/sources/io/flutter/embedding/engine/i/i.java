package io.flutter.embedding.engine.i;

import d.a.c.a.i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a */
    public final d.a.c.a.i f1010a;

    /* renamed from: b */
    private h f1011b;

    /* renamed from: c */
    final i.c f1012c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements i.c {
        a() {
            i.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x0107 A[Catch: JSONException -> 0x01d4, TryCatch #2 {JSONException -> 0x01d4, blocks: (B:6:0x002c, B:7:0x0030, B:9:0x0035, B:12:0x0040, B:15:0x004a, B:18:0x0055, B:21:0x005f, B:24:0x006a, B:27:0x0074, B:30:0x007e, B:33:0x0088, B:36:0x0092, B:39:0x009d, B:44:0x00ab, B:45:0x00b0, B:46:0x00c9, B:47:0x00d8, B:48:0x00dd, B:50:0x00e1, B:51:0x00e6, B:53:0x00fb, B:55:0x0107, B:56:0x0114, B:59:0x0137, B:60:0x013b, B:61:0x0140, B:64:0x0163, B:67:0x017f, B:70:0x019c, B:71:0x01a1, B:73:0x01b5, B:74:0x01ba, B:76:0x01ce, B:65:0x0168), top: B:80:0x002c, inners: #3, #7, #8, #9 }] */
        @Override // d.a.c.a.i.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void g(d.a.c.a.h r6, d.a.c.a.i.d r7) {
            /*
                Method dump skipped, instructions count: 566
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.i.i.a.g(d.a.c.a.h, d.a.c.a.i$d):void");
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f1014a;

        /* renamed from: b */
        static final /* synthetic */ int[] f1015b;

        static {
            int[] iArr = new int[k.values().length];
            f1015b = iArr;
            try {
                iArr[k.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1015b[k.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[f.values().length];
            f1014a = iArr2;
            try {
                iArr2[f.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1014a[f.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1014a[f.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1014a[f.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final int f1016a;

        /* renamed from: b */
        public final String f1017b;

        public c(int i, String str) {
            this.f1016a = i;
            this.f1017b = str;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");
        

        /* renamed from: a */
        private String f1021a;

        d(String str) {
            this.f1021a = str;
        }

        static d a(String str) {
            d[] values;
            for (d dVar : values()) {
                if (dVar.f1021a.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        PLAIN_TEXT("text/plain");
        

        /* renamed from: a */
        private String f1024a;

        e(String str) {
            this.f1024a = str;
        }

        static e a(String str) {
            e[] values;
            for (e eVar : values()) {
                if (eVar.f1024a.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
        

        /* renamed from: a */
        private String f1029a;

        f(String str) {
            this.f1029a = str;
        }

        static f a(String str) {
            f[] values;
            for (f fVar : values()) {
                if (fVar.f1029a.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");
        

        /* renamed from: a */
        private final String f1034a;

        g(String str) {
            this.f1034a = str;
        }

        static g a(String str) {
            g[] values;
            for (g gVar : values()) {
                String str2 = gVar.f1034a;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        void d();

        void e(int i);

        void f(c cVar);

        void g(g gVar);

        void h(List<k> list);

        void i();

        void j(String str);

        boolean k();

        void l(EnumC0053i enumC0053i);

        CharSequence m(e eVar);

        void n(j jVar);
    }

    /* renamed from: io.flutter.embedding.engine.i.i$i */
    /* loaded from: classes.dex */
    public enum EnumC0053i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");
        

        /* renamed from: a */
        private final String f1038a;

        EnumC0053i(String str) {
            this.f1038a = str;
        }

        static EnumC0053i a(String str) {
            EnumC0053i[] values;
            for (EnumC0053i enumC0053i : values()) {
                if (enumC0053i.f1038a.equals(str)) {
                    return enumC0053i;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a */
        public final Integer f1039a;

        /* renamed from: b */
        public final d f1040b;

        /* renamed from: c */
        public final Integer f1041c;

        /* renamed from: d */
        public final d f1042d;

        /* renamed from: e */
        public final Integer f1043e;

        public j(Integer num, d dVar, Integer num2, d dVar2, Integer num3) {
            this.f1039a = num;
            this.f1040b = dVar;
            this.f1041c = num2;
            this.f1042d = dVar2;
            this.f1043e = num3;
        }
    }

    /* loaded from: classes.dex */
    public enum k {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
        

        /* renamed from: a */
        private String f1047a;

        k(String str) {
            this.f1047a = str;
        }

        static k a(String str) {
            k[] values;
            for (k kVar : values()) {
                if (kVar.f1047a.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public i(io.flutter.embedding.engine.e.a aVar) {
        a aVar2 = new a();
        this.f1012c = aVar2;
        d.a.c.a.i iVar = new d.a.c.a.i(aVar, "flutter/platform", d.a.c.a.e.f694a);
        this.f1010a = iVar;
        iVar.e(aVar2);
    }

    public c f(JSONObject jSONObject) {
        int i = jSONObject.getInt("primaryColor");
        if (i != 0) {
            i |= -16777216;
        }
        return new c(i, jSONObject.getString("label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L38
            java.lang.String r4 = r10.getString(r1)
            io.flutter.embedding.engine.i.i$f r4 = io.flutter.embedding.engine.i.i.f.a(r4)
            int[] r8 = io.flutter.embedding.engine.i.i.b.f1014a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L30
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L2a
            if (r4 == r5) goto L27
            goto L32
        L27:
            r2 = r2 | 8
            goto L32
        L2a:
            r2 = r2 | 2
            goto L32
        L2d:
            r2 = r2 | 4
            goto L32
        L30:
            r2 = r2 | 1
        L32:
            if (r3 != 0) goto L35
            r3 = r2
        L35:
            int r1 = r1 + 1
            goto L4
        L38:
            if (r2 == 0) goto L57
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L4c;
                case 5: goto L4a;
                case 6: goto L4d;
                case 7: goto L4d;
                case 8: goto L49;
                case 9: goto L4d;
                case 10: goto L46;
                case 11: goto L45;
                case 12: goto L4d;
                case 13: goto L4d;
                case 14: goto L4d;
                case 15: goto L42;
                default: goto L41;
            }
        L41:
            goto L53
        L42:
            r10 = 13
            return r10
        L45:
            return r6
        L46:
            r10 = 11
            return r10
        L49:
            return r1
        L4a:
            r10 = 12
        L4c:
            return r10
        L4d:
            if (r3 == r6) goto L56
            if (r3 == r5) goto L55
            if (r3 == r1) goto L54
        L53:
            return r7
        L54:
            return r1
        L55:
            return r10
        L56:
            return r0
        L57:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.i.i.g(org.json.JSONArray):int");
    }

    public j h(JSONObject jSONObject) {
        Integer num = null;
        d a2 = !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.a(jSONObject.getString("systemNavigationBarIconBrightness")) : null;
        Integer valueOf = !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null;
        d a3 = !jSONObject.isNull("statusBarIconBrightness") ? d.a(jSONObject.getString("statusBarIconBrightness")) : null;
        Integer valueOf2 = !jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null;
        if (!jSONObject.isNull("systemNavigationBarDividerColor")) {
            num = Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor"));
        }
        return new j(valueOf2, a3, valueOf, a2, num);
    }

    public List<k> i(JSONArray jSONArray) {
        k kVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            int i2 = b.f1015b[k.a(jSONArray.getString(i)).ordinal()];
            if (i2 == 1) {
                kVar = k.TOP_OVERLAYS;
            } else if (i2 == 2) {
                kVar = k.BOTTOM_OVERLAYS;
            }
            arrayList.add(kVar);
        }
        return arrayList;
    }

    public void j(h hVar) {
        this.f1011b = hVar;
    }
}
