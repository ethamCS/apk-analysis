package qd;

import fc.c;
import hc.t;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nc.m;
import ub.l;
import ub.p0;
import ub.u;
import vd.e;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final EnumC0322a f19778a;

    /* renamed from: b */
    private final e f19779b;

    /* renamed from: c */
    private final String[] f19780c;

    /* renamed from: d */
    private final String[] f19781d;

    /* renamed from: e */
    private final String[] f19782e;

    /* renamed from: f */
    private final String f19783f;

    /* renamed from: g */
    private final int f19784g;

    /* renamed from: h */
    private final String f19785h;

    /* renamed from: i */
    private final byte[] f19786i;

    /* renamed from: qd.a$a */
    /* loaded from: classes.dex */
    public enum EnumC0322a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        
        public static final C0323a Companion = new C0323a(null);

        /* renamed from: d */
        private static final Map<Integer, EnumC0322a> f19787d;

        /* renamed from: c */
        private final int f19791c;

        /* renamed from: qd.a$a$a */
        /* loaded from: classes.dex */
        public static final class C0323a {
            private C0323a() {
            }

            public /* synthetic */ C0323a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @c
            public final EnumC0322a a(int i10) {
                EnumC0322a enumC0322a = (EnumC0322a) EnumC0322a.f19787d.get(Integer.valueOf(i10));
                return enumC0322a == null ? EnumC0322a.UNKNOWN : enumC0322a;
            }
        }

        static {
            int d10;
            int b10;
            EnumC0322a[] values = values();
            d10 = p0.d(values.length);
            b10 = m.b(d10, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
            for (EnumC0322a enumC0322a : values) {
                linkedHashMap.put(Integer.valueOf(enumC0322a.f19791c), enumC0322a);
            }
            f19787d = linkedHashMap;
        }

        EnumC0322a(int i10) {
            this.f19791c = i10;
        }

        @c
        public static final EnumC0322a h(int i10) {
            return Companion.a(i10);
        }
    }

    public a(EnumC0322a enumC0322a, e eVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        t.e(enumC0322a, "kind");
        t.e(eVar, "metadataVersion");
        this.f19778a = enumC0322a;
        this.f19779b = eVar;
        this.f19780c = strArr;
        this.f19781d = strArr2;
        this.f19782e = strArr3;
        this.f19783f = str;
        this.f19784g = i10;
        this.f19785h = str2;
        this.f19786i = bArr;
    }

    private final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public final String[] a() {
        return this.f19780c;
    }

    public final String[] b() {
        return this.f19781d;
    }

    public final EnumC0322a c() {
        return this.f19778a;
    }

    public final e d() {
        return this.f19779b;
    }

    public final String e() {
        String str = this.f19783f;
        if (this.f19778a == EnumC0322a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List<String> f() {
        List<String> h10;
        String[] strArr = this.f19780c;
        List<String> list = null;
        if (!(this.f19778a == EnumC0322a.MULTIFILE_CLASS)) {
            strArr = null;
        }
        if (strArr != null) {
            list = l.d(strArr);
        }
        if (list == null) {
            h10 = u.h();
            return h10;
        }
        return list;
    }

    public final String[] g() {
        return this.f19782e;
    }

    public final boolean i() {
        return h(this.f19784g, 2);
    }

    public final boolean j() {
        return h(this.f19784g, 64) && !h(this.f19784g, 32);
    }

    public final boolean k() {
        return h(this.f19784g, 16) && !h(this.f19784g, 32);
    }

    public String toString() {
        return this.f19778a + " version=" + this.f19779b;
    }
}
