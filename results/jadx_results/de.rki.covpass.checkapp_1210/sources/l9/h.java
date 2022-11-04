package l9;

import android.database.Cursor;
import androidx.room.i0;
import androidx.room.j0;
import dgca.verifier.app.engine.data.RuleCertificateType;
import h1.l;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import m1.k;
import tb.e0;
/* loaded from: classes.dex */
public final class h extends l9.e {

    /* renamed from: a */
    private final i0 f15895a;

    /* renamed from: b */
    private final h1.g<l9.b> f15896b;

    /* renamed from: c */
    private final o9.a f15897c = new o9.a();

    /* renamed from: d */
    private final h1.g<l9.a> f15898d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h1.g<l9.b> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i0 i0Var) {
            super(i0Var);
            h.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR ABORT INTO `booster_rules` (`ruleId`,`identifier`,`type`,`version`,`schemaVersion`,`engine`,`engineVersion`,`ruleCertificateType`,`validFrom`,`validTo`,`affectedString`,`logic`,`countryCode`,`region`,`hash`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: k */
        public void g(k kVar, l9.b bVar) {
            kVar.A0(1, bVar.j());
            if (bVar.f() == null) {
                kVar.a0(2);
            } else {
                kVar.K(2, bVar.f());
            }
            if (bVar.l() == null) {
                kVar.a0(3);
            } else {
                kVar.K(3, h.this.t(bVar.l()));
            }
            if (bVar.o() == null) {
                kVar.a0(4);
            } else {
                kVar.K(4, bVar.o());
            }
            if (bVar.k() == null) {
                kVar.a0(5);
            } else {
                kVar.K(5, bVar.k());
            }
            if (bVar.c() == null) {
                kVar.a0(6);
            } else {
                kVar.K(6, bVar.c());
            }
            if (bVar.d() == null) {
                kVar.a0(7);
            } else {
                kVar.K(7, bVar.d());
            }
            if (bVar.i() == null) {
                kVar.a0(8);
            } else {
                kVar.K(8, h.this.v(bVar.i()));
            }
            kVar.A0(9, h.this.f15897c.f(bVar.m()));
            kVar.A0(10, h.this.f15897c.f(bVar.n()));
            String a10 = h.this.f15897c.a(bVar.a());
            if (a10 == null) {
                kVar.a0(11);
            } else {
                kVar.K(11, a10);
            }
            if (bVar.g() == null) {
                kVar.a0(12);
            } else {
                kVar.K(12, bVar.g());
            }
            if (bVar.b() == null) {
                kVar.a0(13);
            } else {
                kVar.K(13, bVar.b());
            }
            if (bVar.h() == null) {
                kVar.a0(14);
            } else {
                kVar.K(14, bVar.h());
            }
            if (bVar.e() == null) {
                kVar.a0(15);
            } else {
                kVar.K(15, bVar.e());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends h1.g<l9.a> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i0 i0Var) {
            super(i0Var);
            h.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR ABORT INTO `booster_rules_descriptions` (`descriptionId`,`ruleContainerId`,`lang`,`desc`) VALUES (nullif(?, 0),?,?,?)";
        }

        /* renamed from: k */
        public void g(k kVar, l9.a aVar) {
            kVar.A0(1, aVar.d());
            kVar.A0(2, aVar.f());
            if (aVar.e() == null) {
                kVar.a0(3);
            } else {
                kVar.K(3, aVar.e());
            }
            if (aVar.c() == null) {
                kVar.a0(4);
            } else {
                kVar.K(4, aVar.c());
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Callable<Long> {

        /* renamed from: a */
        final /* synthetic */ l9.b f15901a;

        c(l9.b bVar) {
            h.this = r1;
            this.f15901a = bVar;
        }

        /* renamed from: a */
        public Long call() {
            h.this.f15895a.e();
            try {
                long j10 = h.this.f15896b.j(this.f15901a);
                h.this.f15895a.D();
                return Long.valueOf(j10);
            } finally {
                h.this.f15895a.i();
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ l9.a[] f15903a;

        d(l9.a[] aVarArr) {
            h.this = r1;
            this.f15903a = aVarArr;
        }

        /* renamed from: a */
        public e0 call() {
            h.this.f15895a.e();
            try {
                h.this.f15898d.i(this.f15903a);
                h.this.f15895a.D();
                return e0.f22152a;
            } finally {
                h.this.f15895a.i();
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements Callable<List<l9.b>> {

        /* renamed from: a */
        final /* synthetic */ l f15905a;

        e(l lVar) {
            h.this = r1;
            this.f15905a = lVar;
        }

        /* renamed from: a */
        public List<l9.b> call() {
            String str;
            int i10;
            String str2;
            int i11;
            String str3;
            int i12;
            String str4;
            Cursor c10 = j1.c.c(h.this.f15895a, this.f15905a, false, null);
            try {
                int e10 = j1.b.e(c10, "ruleId");
                int e11 = j1.b.e(c10, "identifier");
                int e12 = j1.b.e(c10, "type");
                int e13 = j1.b.e(c10, "version");
                int e14 = j1.b.e(c10, "schemaVersion");
                int e15 = j1.b.e(c10, "engine");
                int e16 = j1.b.e(c10, "engineVersion");
                int e17 = j1.b.e(c10, "ruleCertificateType");
                int e18 = j1.b.e(c10, "validFrom");
                int e19 = j1.b.e(c10, "validTo");
                int e20 = j1.b.e(c10, "affectedString");
                int e21 = j1.b.e(c10, "logic");
                int e22 = j1.b.e(c10, "countryCode");
                int e23 = j1.b.e(c10, "region");
                int e24 = j1.b.e(c10, "hash");
                int i13 = e22;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    long j10 = c10.getLong(e10);
                    String string = c10.isNull(e11) ? null : c10.getString(e11);
                    int i14 = e10;
                    k9.b u10 = h.this.u(c10.getString(e12));
                    String string2 = c10.isNull(e13) ? null : c10.getString(e13);
                    String string3 = c10.isNull(e14) ? null : c10.getString(e14);
                    String string4 = c10.isNull(e15) ? null : c10.getString(e15);
                    String string5 = c10.isNull(e16) ? null : c10.getString(e16);
                    RuleCertificateType w9 = h.this.w(c10.getString(e17));
                    ZonedDateTime c11 = h.this.f15897c.c(Long.valueOf(c10.getLong(e18)));
                    ZonedDateTime c12 = h.this.f15897c.c(Long.valueOf(c10.getLong(e19)));
                    List<String> b10 = h.this.f15897c.b(c10.isNull(e20) ? null : c10.getString(e20));
                    if (c10.isNull(e21)) {
                        i10 = i13;
                        str = null;
                    } else {
                        str = c10.getString(e21);
                        i10 = i13;
                    }
                    if (c10.isNull(i10)) {
                        i11 = e23;
                        str2 = null;
                    } else {
                        str2 = c10.getString(i10);
                        i11 = e23;
                    }
                    if (c10.isNull(i11)) {
                        i13 = i10;
                        i12 = e24;
                        str3 = null;
                    } else {
                        i13 = i10;
                        str3 = c10.getString(i11);
                        i12 = e24;
                    }
                    if (c10.isNull(i12)) {
                        e24 = i12;
                        str4 = null;
                    } else {
                        e24 = i12;
                        str4 = c10.getString(i12);
                    }
                    arrayList.add(new l9.b(j10, string, u10, string2, string3, string4, string5, w9, c11, c12, b10, str, str2, str3, str4));
                    e23 = i11;
                    e10 = i14;
                }
                return arrayList;
            } finally {
                c10.close();
                this.f15905a.j();
            }
        }
    }

    /* loaded from: classes.dex */
    class f implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ Collection f15907a;

        f(Collection collection) {
            h.this = r1;
            this.f15907a = collection;
        }

        /* renamed from: a */
        public e0 call() {
            StringBuilder b10 = j1.f.b();
            b10.append("DELETE FROM booster_rules WHERE identifier NOT IN (");
            j1.f.a(b10, this.f15907a.size());
            b10.append(")");
            k f10 = h.this.f15895a.f(b10.toString());
            int i10 = 1;
            for (String str : this.f15907a) {
                if (str == null) {
                    f10.a0(i10);
                } else {
                    f10.K(i10, str);
                }
                i10++;
            }
            h.this.f15895a.e();
            try {
                f10.S();
                h.this.f15895a.D();
                return e0.f22152a;
            } finally {
                h.this.f15895a.i();
            }
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class g {

        /* renamed from: a */
        static final /* synthetic */ int[] f15909a;

        /* renamed from: b */
        static final /* synthetic */ int[] f15910b;

        static {
            int[] iArr = new int[RuleCertificateType.values().length];
            f15910b = iArr;
            try {
                iArr[RuleCertificateType.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15910b[RuleCertificateType.TEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15910b[RuleCertificateType.VACCINATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15910b[RuleCertificateType.RECOVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[k9.b.values().length];
            f15909a = iArr2;
            try {
                iArr2[k9.b.BOOSTERNOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public h(i0 i0Var) {
        this.f15895a = i0Var;
        this.f15896b = new a(i0Var);
        this.f15898d = new b(i0Var);
    }

    public /* synthetic */ Object A(l9.d[] dVarArr, xb.d dVar) {
        return super.d(dVarArr, dVar);
    }

    public /* synthetic */ Object B(Collection collection, Collection collection2, xb.d dVar) {
        return super.h(collection, collection2, dVar);
    }

    public String t(k9.b bVar) {
        if (bVar == null) {
            return null;
        }
        if (g.f15909a[bVar.ordinal()] == 1) {
            return "BOOSTERNOTIFICATION";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + bVar);
    }

    public k9.b u(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("BOOSTERNOTIFICATION")) {
            return k9.b.BOOSTERNOTIFICATION;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    public String v(RuleCertificateType ruleCertificateType) {
        if (ruleCertificateType == null) {
            return null;
        }
        int i10 = g.f15910b[ruleCertificateType.ordinal()];
        if (i10 == 1) {
            return "GENERAL";
        }
        if (i10 == 2) {
            return "TEST";
        }
        if (i10 == 3) {
            return "VACCINATION";
        }
        if (i10 == 4) {
            return "RECOVERY";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + ruleCertificateType);
    }

    public RuleCertificateType w(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1479689691:
                if (str.equals("VACCINATION")) {
                    c10 = 0;
                    break;
                }
                break;
            case -16486507:
                if (str.equals("RECOVERY")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2571410:
                if (str.equals("TEST")) {
                    c10 = 2;
                    break;
                }
                break;
            case 637834440:
                if (str.equals("GENERAL")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return RuleCertificateType.VACCINATION;
            case 1:
                return RuleCertificateType.RECOVERY;
            case 2:
                return RuleCertificateType.TEST;
            case 3:
                return RuleCertificateType.GENERAL;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
    }

    public static List<Class<?>> z() {
        return Collections.emptyList();
    }

    @Override // l9.e
    public Object a(Collection<String> collection, xb.d<? super e0> dVar) {
        return h1.f.b(this.f15895a, true, new f(collection), dVar);
    }

    @Override // l9.e
    public Object c(xb.d<? super List<l9.b>> dVar) {
        l f10 = l.f("SELECT * from booster_rules", 0);
        return h1.f.a(this.f15895a, false, j1.c.a(), new e(f10), dVar);
    }

    @Override // l9.e
    public Object d(final l9.d[] dVarArr, xb.d<? super e0> dVar) {
        return j0.d(this.f15895a, new gc.l() { // from class: l9.g
            @Override // gc.l
            public final Object invoke(Object obj) {
                Object A;
                A = h.this.A(dVarArr, (xb.d) obj);
                return A;
            }
        }, dVar);
    }

    @Override // l9.e
    public Object f(l9.a[] aVarArr, xb.d<? super e0> dVar) {
        return h1.f.b(this.f15895a, true, new d(aVarArr), dVar);
    }

    @Override // l9.e
    public Object g(l9.b bVar, xb.d<? super Long> dVar) {
        return h1.f.b(this.f15895a, true, new c(bVar), dVar);
    }

    @Override // l9.e
    public Object h(final Collection<String> collection, final Collection<l9.d> collection2, xb.d<? super e0> dVar) {
        return j0.d(this.f15895a, new gc.l() { // from class: l9.f
            @Override // gc.l
            public final Object invoke(Object obj) {
                Object B;
                B = h.this.B(collection, collection2, (xb.d) obj);
                return B;
            }
        }, dVar);
    }
}
