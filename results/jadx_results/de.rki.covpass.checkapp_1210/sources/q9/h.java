package q9;

import android.database.Cursor;
import androidx.room.i0;
import androidx.room.j0;
import dgca.verifier.app.engine.data.RuleCertificateType;
import dgca.verifier.app.engine.data.Type;
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
public final class h extends q9.e {

    /* renamed from: a */
    private final i0 f19734a;

    /* renamed from: b */
    private final h1.g<q9.b> f19735b;

    /* renamed from: c */
    private final o9.a f19736c = new o9.a();

    /* renamed from: d */
    private final h1.g<q9.a> f19737d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h1.g<q9.b> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i0 i0Var) {
            super(i0Var);
            h.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR ABORT INTO `covpass_domestic_rules` (`ruleId`,`identifier`,`type`,`version`,`schemaVersion`,`engine`,`engineVersion`,`ruleCertificateType`,`validFrom`,`validTo`,`affectedString`,`logic`,`countryCode`,`region`,`hash`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: k */
        public void g(k kVar, q9.b bVar) {
            kVar.A0(1, bVar.j());
            if (bVar.f() == null) {
                kVar.a0(2);
            } else {
                kVar.K(2, bVar.f());
            }
            if (bVar.l() == null) {
                kVar.a0(3);
            } else {
                kVar.K(3, h.this.w(bVar.l()));
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
                kVar.K(8, h.this.u(bVar.i()));
            }
            kVar.A0(9, h.this.f19736c.f(bVar.m()));
            kVar.A0(10, h.this.f19736c.f(bVar.n()));
            String a10 = h.this.f19736c.a(bVar.a());
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
    public class b extends h1.g<q9.a> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i0 i0Var) {
            super(i0Var);
            h.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR ABORT INTO `domestic_rules_descriptions` (`descriptionId`,`ruleContainerId`,`lang`,`desc`) VALUES (nullif(?, 0),?,?,?)";
        }

        /* renamed from: k */
        public void g(k kVar, q9.a aVar) {
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
        final /* synthetic */ q9.b f19740a;

        c(q9.b bVar) {
            h.this = r1;
            this.f19740a = bVar;
        }

        /* renamed from: a */
        public Long call() {
            h.this.f19734a.e();
            try {
                long j10 = h.this.f19735b.j(this.f19740a);
                h.this.f19734a.D();
                return Long.valueOf(j10);
            } finally {
                h.this.f19734a.i();
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ q9.a[] f19742a;

        d(q9.a[] aVarArr) {
            h.this = r1;
            this.f19742a = aVarArr;
        }

        /* renamed from: a */
        public e0 call() {
            h.this.f19734a.e();
            try {
                h.this.f19737d.i(this.f19742a);
                h.this.f19734a.D();
                return e0.f22152a;
            } finally {
                h.this.f19734a.i();
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements Callable<List<q9.b>> {

        /* renamed from: a */
        final /* synthetic */ l f19744a;

        e(l lVar) {
            h.this = r1;
            this.f19744a = lVar;
        }

        /* renamed from: a */
        public List<q9.b> call() {
            String str;
            int i10;
            String str2;
            int i11;
            String str3;
            int i12;
            String str4;
            Cursor c10 = j1.c.c(h.this.f19734a, this.f19744a, false, null);
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
                    Type x10 = h.this.x(c10.getString(e12));
                    String string2 = c10.isNull(e13) ? null : c10.getString(e13);
                    String string3 = c10.isNull(e14) ? null : c10.getString(e14);
                    String string4 = c10.isNull(e15) ? null : c10.getString(e15);
                    String string5 = c10.isNull(e16) ? null : c10.getString(e16);
                    RuleCertificateType v10 = h.this.v(c10.getString(e17));
                    ZonedDateTime c11 = h.this.f19736c.c(Long.valueOf(c10.getLong(e18)));
                    ZonedDateTime c12 = h.this.f19736c.c(Long.valueOf(c10.getLong(e19)));
                    List<String> b10 = h.this.f19736c.b(c10.isNull(e20) ? null : c10.getString(e20));
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
                    arrayList.add(new q9.b(j10, string, x10, string2, string3, string4, string5, v10, c11, c12, b10, str, str2, str3, str4));
                    e23 = i11;
                    e10 = i14;
                }
                return arrayList;
            } finally {
                c10.close();
                this.f19744a.j();
            }
        }
    }

    /* loaded from: classes.dex */
    class f implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ Collection f19746a;

        f(Collection collection) {
            h.this = r1;
            this.f19746a = collection;
        }

        /* renamed from: a */
        public e0 call() {
            StringBuilder b10 = j1.f.b();
            b10.append("DELETE FROM covpass_domestic_rules WHERE identifier NOT IN (");
            j1.f.a(b10, this.f19746a.size());
            b10.append(")");
            k f10 = h.this.f19734a.f(b10.toString());
            int i10 = 1;
            for (String str : this.f19746a) {
                if (str == null) {
                    f10.a0(i10);
                } else {
                    f10.K(i10, str);
                }
                i10++;
            }
            h.this.f19734a.e();
            try {
                f10.S();
                h.this.f19734a.D();
                return e0.f22152a;
            } finally {
                h.this.f19734a.i();
            }
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class g {

        /* renamed from: a */
        static final /* synthetic */ int[] f19748a;

        /* renamed from: b */
        static final /* synthetic */ int[] f19749b;

        static {
            int[] iArr = new int[RuleCertificateType.values().length];
            f19749b = iArr;
            try {
                iArr[RuleCertificateType.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19749b[RuleCertificateType.TEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19749b[RuleCertificateType.VACCINATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19749b[RuleCertificateType.RECOVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Type.values().length];
            f19748a = iArr2;
            try {
                iArr2[Type.INVALIDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19748a[Type.ACCEPTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19748a[Type.TWOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19748a[Type.TWOGPLUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19748a[Type.THREEG.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19748a[Type.THREEGPLUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19748a[Type.MASK.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public h(i0 i0Var) {
        this.f19734a = i0Var;
        this.f19735b = new a(i0Var);
        this.f19737d = new b(i0Var);
    }

    public static List<Class<?>> B() {
        return Collections.emptyList();
    }

    public /* synthetic */ Object C(q9.d[] dVarArr, xb.d dVar) {
        return super.e(dVarArr, dVar);
    }

    public /* synthetic */ Object D(Collection collection, Collection collection2, xb.d dVar) {
        return super.i(collection, collection2, dVar);
    }

    public String u(RuleCertificateType ruleCertificateType) {
        if (ruleCertificateType == null) {
            return null;
        }
        int i10 = g.f19749b[ruleCertificateType.ordinal()];
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

    public RuleCertificateType v(String str) {
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

    public String w(Type type) {
        if (type == null) {
            return null;
        }
        switch (g.f19748a[type.ordinal()]) {
            case 1:
                return "INVALIDATION";
            case 2:
                return "ACCEPTANCE";
            case 3:
                return "TWOG";
            case 4:
                return "TWOGPLUS";
            case 5:
                return "THREEG";
            case 6:
                return "THREEGPLUS";
            case 7:
                return "MASK";
            default:
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + type);
        }
    }

    public Type x(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1821113719:
                if (str.equals("THREEG")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1694646347:
                if (str.equals("TWOGPLUS")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1448619170:
                if (str.equals("INVALIDATION")) {
                    c10 = 2;
                    break;
                }
                break;
            case -741499305:
                if (str.equals("ACCEPTANCE")) {
                    c10 = 3;
                    break;
                }
                break;
            case -581755997:
                if (str.equals("THREEGPLUS")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2359020:
                if (str.equals("MASK")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2588571:
                if (str.equals("TWOG")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return Type.THREEG;
            case 1:
                return Type.TWOGPLUS;
            case 2:
                return Type.INVALIDATION;
            case 3:
                return Type.ACCEPTANCE;
            case 4:
                return Type.THREEGPLUS;
            case 5:
                return Type.MASK;
            case 6:
                return Type.TWOG;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
    }

    private void y(i0.d<ArrayList<q9.a>> dVar) {
        if (dVar.j()) {
            return;
        }
        if (dVar.p() > 999) {
            i0.d<ArrayList<q9.a>> dVar2 = new i0.d<>(999);
            int p10 = dVar.p();
            int i10 = 0;
            int i11 = 0;
            while (i10 < p10) {
                dVar2.l(dVar.k(i10), dVar.q(i10));
                i10++;
                i11++;
                if (i11 == 999) {
                    y(dVar2);
                    dVar2 = new i0.d<>(999);
                    i11 = 0;
                }
            }
            if (i11 <= 0) {
                return;
            }
            y(dVar2);
            return;
        }
        StringBuilder b10 = j1.f.b();
        b10.append("SELECT `descriptionId`,`ruleContainerId`,`lang`,`desc` FROM `domestic_rules_descriptions` WHERE `ruleContainerId` IN (");
        int p11 = dVar.p();
        j1.f.a(b10, p11);
        b10.append(")");
        l f10 = l.f(b10.toString(), p11 + 0);
        int i12 = 1;
        for (int i13 = 0; i13 < dVar.p(); i13++) {
            f10.A0(i12, dVar.k(i13));
            i12++;
        }
        Cursor c10 = j1.c.c(this.f19734a, f10, false, null);
        try {
            int d10 = j1.b.d(c10, "ruleContainerId");
            if (d10 == -1) {
                return;
            }
            while (c10.moveToNext()) {
                ArrayList<q9.a> g10 = dVar.g(c10.getLong(d10));
                if (g10 != null) {
                    g10.add(new q9.a(c10.getLong(0), c10.getLong(1), c10.isNull(2) ? null : c10.getString(2), c10.isNull(3) ? null : c10.getString(3)));
                }
            }
        } finally {
            c10.close();
        }
    }

    @Override // q9.e
    public Object a(Collection<String> collection, xb.d<? super e0> dVar) {
        return h1.f.b(this.f19734a, true, new f(collection), dVar);
    }

    @Override // q9.e
    public Object c(xb.d<? super List<q9.b>> dVar) {
        l f10 = l.f("SELECT * from covpass_domestic_rules", 0);
        return h1.f.a(this.f19734a, false, j1.c.a(), new e(f10), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x023f A[Catch: all -> 0x02b6, TryCatch #1 {all -> 0x02b6, blocks: (B:21:0x00b1, B:22:0x00c6, B:24:0x00cc, B:26:0x00dc, B:29:0x00f0, B:30:0x0106, B:32:0x010c, B:34:0x0112, B:36:0x0118, B:38:0x011e, B:40:0x0124, B:42:0x012a, B:44:0x0130, B:46:0x0136, B:48:0x013c, B:50:0x0142, B:52:0x0148, B:54:0x0150, B:56:0x0158, B:58:0x0162, B:60:0x016c, B:70:0x0192, B:73:0x01a1, B:74:0x01a9, B:77:0x01ba, B:78:0x01c0, B:81:0x01c9, B:82:0x01cf, B:85:0x01d8, B:86:0x01de, B:89:0x01e7, B:90:0x01ed, B:93:0x021b, B:94:0x021f, B:97:0x022e, B:98:0x0234, B:101:0x023f, B:102:0x0247, B:105:0x0250, B:106:0x0256, B:109:0x025f, B:110:0x0265, B:111:0x0270, B:113:0x0280, B:114:0x0285, B:115:0x02a4), top: B:128:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0250 A[Catch: all -> 0x02b6, TryCatch #1 {all -> 0x02b6, blocks: (B:21:0x00b1, B:22:0x00c6, B:24:0x00cc, B:26:0x00dc, B:29:0x00f0, B:30:0x0106, B:32:0x010c, B:34:0x0112, B:36:0x0118, B:38:0x011e, B:40:0x0124, B:42:0x012a, B:44:0x0130, B:46:0x0136, B:48:0x013c, B:50:0x0142, B:52:0x0148, B:54:0x0150, B:56:0x0158, B:58:0x0162, B:60:0x016c, B:70:0x0192, B:73:0x01a1, B:74:0x01a9, B:77:0x01ba, B:78:0x01c0, B:81:0x01c9, B:82:0x01cf, B:85:0x01d8, B:86:0x01de, B:89:0x01e7, B:90:0x01ed, B:93:0x021b, B:94:0x021f, B:97:0x022e, B:98:0x0234, B:101:0x023f, B:102:0x0247, B:105:0x0250, B:106:0x0256, B:109:0x025f, B:110:0x0265, B:111:0x0270, B:113:0x0280, B:114:0x0285, B:115:0x02a4), top: B:128:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025f A[Catch: all -> 0x02b6, TryCatch #1 {all -> 0x02b6, blocks: (B:21:0x00b1, B:22:0x00c6, B:24:0x00cc, B:26:0x00dc, B:29:0x00f0, B:30:0x0106, B:32:0x010c, B:34:0x0112, B:36:0x0118, B:38:0x011e, B:40:0x0124, B:42:0x012a, B:44:0x0130, B:46:0x0136, B:48:0x013c, B:50:0x0142, B:52:0x0148, B:54:0x0150, B:56:0x0158, B:58:0x0162, B:60:0x016c, B:70:0x0192, B:73:0x01a1, B:74:0x01a9, B:77:0x01ba, B:78:0x01c0, B:81:0x01c9, B:82:0x01cf, B:85:0x01d8, B:86:0x01de, B:89:0x01e7, B:90:0x01ed, B:93:0x021b, B:94:0x021f, B:97:0x022e, B:98:0x0234, B:101:0x023f, B:102:0x0247, B:105:0x0250, B:106:0x0256, B:109:0x025f, B:110:0x0265, B:111:0x0270, B:113:0x0280, B:114:0x0285, B:115:0x02a4), top: B:128:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0280 A[Catch: all -> 0x02b6, TryCatch #1 {all -> 0x02b6, blocks: (B:21:0x00b1, B:22:0x00c6, B:24:0x00cc, B:26:0x00dc, B:29:0x00f0, B:30:0x0106, B:32:0x010c, B:34:0x0112, B:36:0x0118, B:38:0x011e, B:40:0x0124, B:42:0x012a, B:44:0x0130, B:46:0x0136, B:48:0x013c, B:50:0x0142, B:52:0x0148, B:54:0x0150, B:56:0x0158, B:58:0x0162, B:60:0x016c, B:70:0x0192, B:73:0x01a1, B:74:0x01a9, B:77:0x01ba, B:78:0x01c0, B:81:0x01c9, B:82:0x01cf, B:85:0x01d8, B:86:0x01de, B:89:0x01e7, B:90:0x01ed, B:93:0x021b, B:94:0x021f, B:97:0x022e, B:98:0x0234, B:101:0x023f, B:102:0x0247, B:105:0x0250, B:106:0x0256, B:109:0x025f, B:110:0x0265, B:111:0x0270, B:113:0x0280, B:114:0x0285, B:115:0x02a4), top: B:128:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a1 A[Catch: all -> 0x02b6, TryCatch #1 {all -> 0x02b6, blocks: (B:21:0x00b1, B:22:0x00c6, B:24:0x00cc, B:26:0x00dc, B:29:0x00f0, B:30:0x0106, B:32:0x010c, B:34:0x0112, B:36:0x0118, B:38:0x011e, B:40:0x0124, B:42:0x012a, B:44:0x0130, B:46:0x0136, B:48:0x013c, B:50:0x0142, B:52:0x0148, B:54:0x0150, B:56:0x0158, B:58:0x0162, B:60:0x016c, B:70:0x0192, B:73:0x01a1, B:74:0x01a9, B:77:0x01ba, B:78:0x01c0, B:81:0x01c9, B:82:0x01cf, B:85:0x01d8, B:86:0x01de, B:89:0x01e7, B:90:0x01ed, B:93:0x021b, B:94:0x021f, B:97:0x022e, B:98:0x0234, B:101:0x023f, B:102:0x0247, B:105:0x0250, B:106:0x0256, B:109:0x025f, B:110:0x0265, B:111:0x0270, B:113:0x0280, B:114:0x0285, B:115:0x02a4), top: B:128:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ba A[Catch: all -> 0x02b6, TryCatch #1 {all -> 0x02b6, blocks: (B:21:0x00b1, B:22:0x00c6, B:24:0x00cc, B:26:0x00dc, B:29:0x00f0, B:30:0x0106, B:32:0x010c, B:34:0x0112, B:36:0x0118, B:38:0x011e, B:40:0x0124, B:42:0x012a, B:44:0x0130, B:46:0x0136, B:48:0x013c, B:50:0x0142, B:52:0x0148, B:54:0x0150, B:56:0x0158, B:58:0x0162, B:60:0x016c, B:70:0x0192, B:73:0x01a1, B:74:0x01a9, B:77:0x01ba, B:78:0x01c0, B:81:0x01c9, B:82:0x01cf, B:85:0x01d8, B:86:0x01de, B:89:0x01e7, B:90:0x01ed, B:93:0x021b, B:94:0x021f, B:97:0x022e, B:98:0x0234, B:101:0x023f, B:102:0x0247, B:105:0x0250, B:106:0x0256, B:109:0x025f, B:110:0x0265, B:111:0x0270, B:113:0x0280, B:114:0x0285, B:115:0x02a4), top: B:128:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c9 A[Catch: all -> 0x02b6, TryCatch #1 {all -> 0x02b6, blocks: (B:21:0x00b1, B:22:0x00c6, B:24:0x00cc, B:26:0x00dc, B:29:0x00f0, B:30:0x0106, B:32:0x010c, B:34:0x0112, B:36:0x0118, B:38:0x011e, B:40:0x0124, B:42:0x012a, B:44:0x0130, B:46:0x0136, B:48:0x013c, B:50:0x0142, B:52:0x0148, B:54:0x0150, B:56:0x0158, B:58:0x0162, B:60:0x016c, B:70:0x0192, B:73:0x01a1, B:74:0x01a9, B:77:0x01ba, B:78:0x01c0, B:81:0x01c9, B:82:0x01cf, B:85:0x01d8, B:86:0x01de, B:89:0x01e7, B:90:0x01ed, B:93:0x021b, B:94:0x021f, B:97:0x022e, B:98:0x0234, B:101:0x023f, B:102:0x0247, B:105:0x0250, B:106:0x0256, B:109:0x025f, B:110:0x0265, B:111:0x0270, B:113:0x0280, B:114:0x0285, B:115:0x02a4), top: B:128:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d8 A[Catch: all -> 0x02b6, TryCatch #1 {all -> 0x02b6, blocks: (B:21:0x00b1, B:22:0x00c6, B:24:0x00cc, B:26:0x00dc, B:29:0x00f0, B:30:0x0106, B:32:0x010c, B:34:0x0112, B:36:0x0118, B:38:0x011e, B:40:0x0124, B:42:0x012a, B:44:0x0130, B:46:0x0136, B:48:0x013c, B:50:0x0142, B:52:0x0148, B:54:0x0150, B:56:0x0158, B:58:0x0162, B:60:0x016c, B:70:0x0192, B:73:0x01a1, B:74:0x01a9, B:77:0x01ba, B:78:0x01c0, B:81:0x01c9, B:82:0x01cf, B:85:0x01d8, B:86:0x01de, B:89:0x01e7, B:90:0x01ed, B:93:0x021b, B:94:0x021f, B:97:0x022e, B:98:0x0234, B:101:0x023f, B:102:0x0247, B:105:0x0250, B:106:0x0256, B:109:0x025f, B:110:0x0265, B:111:0x0270, B:113:0x0280, B:114:0x0285, B:115:0x02a4), top: B:128:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e7 A[Catch: all -> 0x02b6, TryCatch #1 {all -> 0x02b6, blocks: (B:21:0x00b1, B:22:0x00c6, B:24:0x00cc, B:26:0x00dc, B:29:0x00f0, B:30:0x0106, B:32:0x010c, B:34:0x0112, B:36:0x0118, B:38:0x011e, B:40:0x0124, B:42:0x012a, B:44:0x0130, B:46:0x0136, B:48:0x013c, B:50:0x0142, B:52:0x0148, B:54:0x0150, B:56:0x0158, B:58:0x0162, B:60:0x016c, B:70:0x0192, B:73:0x01a1, B:74:0x01a9, B:77:0x01ba, B:78:0x01c0, B:81:0x01c9, B:82:0x01cf, B:85:0x01d8, B:86:0x01de, B:89:0x01e7, B:90:0x01ed, B:93:0x021b, B:94:0x021f, B:97:0x022e, B:98:0x0234, B:101:0x023f, B:102:0x0247, B:105:0x0250, B:106:0x0256, B:109:0x025f, B:110:0x0265, B:111:0x0270, B:113:0x0280, B:114:0x0285, B:115:0x02a4), top: B:128:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021b A[Catch: all -> 0x02b6, TryCatch #1 {all -> 0x02b6, blocks: (B:21:0x00b1, B:22:0x00c6, B:24:0x00cc, B:26:0x00dc, B:29:0x00f0, B:30:0x0106, B:32:0x010c, B:34:0x0112, B:36:0x0118, B:38:0x011e, B:40:0x0124, B:42:0x012a, B:44:0x0130, B:46:0x0136, B:48:0x013c, B:50:0x0142, B:52:0x0148, B:54:0x0150, B:56:0x0158, B:58:0x0162, B:60:0x016c, B:70:0x0192, B:73:0x01a1, B:74:0x01a9, B:77:0x01ba, B:78:0x01c0, B:81:0x01c9, B:82:0x01cf, B:85:0x01d8, B:86:0x01de, B:89:0x01e7, B:90:0x01ed, B:93:0x021b, B:94:0x021f, B:97:0x022e, B:98:0x0234, B:101:0x023f, B:102:0x0247, B:105:0x0250, B:106:0x0256, B:109:0x025f, B:110:0x0265, B:111:0x0270, B:113:0x0280, B:114:0x0285, B:115:0x02a4), top: B:128:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022e A[Catch: all -> 0x02b6, TryCatch #1 {all -> 0x02b6, blocks: (B:21:0x00b1, B:22:0x00c6, B:24:0x00cc, B:26:0x00dc, B:29:0x00f0, B:30:0x0106, B:32:0x010c, B:34:0x0112, B:36:0x0118, B:38:0x011e, B:40:0x0124, B:42:0x012a, B:44:0x0130, B:46:0x0136, B:48:0x013c, B:50:0x0142, B:52:0x0148, B:54:0x0150, B:56:0x0158, B:58:0x0162, B:60:0x016c, B:70:0x0192, B:73:0x01a1, B:74:0x01a9, B:77:0x01ba, B:78:0x01c0, B:81:0x01c9, B:82:0x01cf, B:85:0x01d8, B:86:0x01de, B:89:0x01e7, B:90:0x01ed, B:93:0x021b, B:94:0x021f, B:97:0x022e, B:98:0x0234, B:101:0x023f, B:102:0x0247, B:105:0x0250, B:106:0x0256, B:109:0x025f, B:110:0x0265, B:111:0x0270, B:113:0x0280, B:114:0x0285, B:115:0x02a4), top: B:128:0x00b1 }] */
    @Override // q9.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<q9.d> d(java.lang.String r38, j$.time.ZonedDateTime r39, dgca.verifier.app.engine.data.Type r40, dgca.verifier.app.engine.data.RuleCertificateType r41, dgca.verifier.app.engine.data.RuleCertificateType r42) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.h.d(java.lang.String, j$.time.ZonedDateTime, dgca.verifier.app.engine.data.Type, dgca.verifier.app.engine.data.RuleCertificateType, dgca.verifier.app.engine.data.RuleCertificateType):java.util.List");
    }

    @Override // q9.e
    public Object e(final q9.d[] dVarArr, xb.d<? super e0> dVar) {
        return j0.d(this.f19734a, new gc.l() { // from class: q9.g
            @Override // gc.l
            public final Object invoke(Object obj) {
                Object C;
                C = h.this.C(dVarArr, (xb.d) obj);
                return C;
            }
        }, dVar);
    }

    @Override // q9.e
    public Object g(q9.a[] aVarArr, xb.d<? super e0> dVar) {
        return h1.f.b(this.f19734a, true, new d(aVarArr), dVar);
    }

    @Override // q9.e
    public Object h(q9.b bVar, xb.d<? super Long> dVar) {
        return h1.f.b(this.f19734a, true, new c(bVar), dVar);
    }

    @Override // q9.e
    public Object i(final Collection<String> collection, final Collection<q9.d> collection2, xb.d<? super e0> dVar) {
        return j0.d(this.f19734a, new gc.l() { // from class: q9.f
            @Override // gc.l
            public final Object invoke(Object obj) {
                Object D;
                D = h.this.D(collection, collection2, (xb.d) obj);
                return D;
            }
        }, dVar);
    }
}
