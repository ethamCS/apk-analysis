package vd;

import hc.t;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.BuildConfig;
import rd.l;
import rd.n;
import rd.q;
import rd.u;
import tb.r;
import td.b;
import ub.c0;
import ub.v;
import ud.a;
import vd.d;
import yd.i;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public static final i f24018a = new i();

    /* renamed from: b */
    private static final yd.g f24019b;

    static {
        yd.g d10 = yd.g.d();
        ud.a.a(d10);
        t.d(d10, "newInstance().apply(JvmP…f::registerAllExtensions)");
        f24019b = d10;
    }

    private i() {
    }

    public static /* synthetic */ d.a d(i iVar, n nVar, td.c cVar, td.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return iVar.c(nVar, cVar, gVar, z10);
    }

    @fc.c
    public static final boolean f(n nVar) {
        t.e(nVar, "proto");
        b.C0392b a10 = c.f23999a.a();
        Object I = nVar.I(ud.a.f23539e);
        t.d(I, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean d10 = a10.d(((Number) I).intValue());
        t.d(d10, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return d10.booleanValue();
    }

    private final String g(q qVar, td.c cVar) {
        if (qVar.N0()) {
            return b.b(cVar.b(qVar.y0()));
        }
        return null;
    }

    @fc.c
    public static final r<f, rd.c> h(byte[] bArr, String[] strArr) {
        t.e(bArr, "bytes");
        t.e(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new r<>(f24018a.k(byteArrayInputStream, strArr), rd.c.Y1(byteArrayInputStream, f24019b));
    }

    @fc.c
    public static final r<f, rd.c> i(String[] strArr, String[] strArr2) {
        t.e(strArr, "data");
        t.e(strArr2, "strings");
        byte[] e10 = a.e(strArr);
        t.d(e10, "decodeBytes(data)");
        return h(e10, strArr2);
    }

    @fc.c
    public static final r<f, rd.i> j(String[] strArr, String[] strArr2) {
        t.e(strArr, "data");
        t.e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.e(strArr));
        return new r<>(f24018a.k(byteArrayInputStream, strArr2), rd.i.g1(byteArrayInputStream, f24019b));
    }

    private final f k(InputStream inputStream, String[] strArr) {
        a.e f02 = a.e.f0(inputStream, f24019b);
        t.d(f02, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new f(f02, strArr);
    }

    @fc.c
    public static final r<f, l> l(byte[] bArr, String[] strArr) {
        t.e(bArr, "bytes");
        t.e(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new r<>(f24018a.k(byteArrayInputStream, strArr), l.F0(byteArrayInputStream, f24019b));
    }

    @fc.c
    public static final r<f, l> m(String[] strArr, String[] strArr2) {
        t.e(strArr, "data");
        t.e(strArr2, "strings");
        byte[] e10 = a.e(strArr);
        t.d(e10, "decodeBytes(data)");
        return l(e10, strArr2);
    }

    public final yd.g a() {
        return f24019b;
    }

    public final d.b b(rd.d dVar, td.c cVar, td.g gVar) {
        String str;
        int s10;
        t.e(dVar, "proto");
        t.e(cVar, "nameResolver");
        t.e(gVar, "typeTable");
        i.f<rd.d, a.c> fVar = ud.a.f23535a;
        t.d(fVar, "constructorSignature");
        a.c cVar2 = (a.c) td.e.a(dVar, fVar);
        String string = (cVar2 == null || !cVar2.b0()) ? "<init>" : cVar.getString(cVar2.V());
        if (cVar2 == null || !cVar2.W()) {
            List<u> o02 = dVar.o0();
            t.d(o02, "proto.valueParameterList");
            s10 = v.s(o02, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (u uVar : o02) {
                i iVar = f24018a;
                t.d(uVar, "it");
                String g10 = iVar.g(td.f.n(uVar, gVar), cVar);
                if (g10 == null) {
                    return null;
                }
                arrayList.add(g10);
            }
            str = c0.e0(arrayList, BuildConfig.FLAVOR, "(", ")V", 0, null, null, 56, null);
        } else {
            str = cVar.getString(cVar2.N());
        }
        return new d.b(string, str);
    }

    public final d.a c(n nVar, td.c cVar, td.g gVar, boolean z10) {
        String str;
        t.e(nVar, "proto");
        t.e(cVar, "nameResolver");
        t.e(gVar, "typeTable");
        i.f<n, a.d> fVar = ud.a.f23538d;
        t.d(fVar, "propertySignature");
        a.d dVar = (a.d) td.e.a(nVar, fVar);
        if (dVar == null) {
            return null;
        }
        a.b c02 = dVar.h0() ? dVar.c0() : null;
        if (c02 == null && z10) {
            return null;
        }
        int E0 = (c02 == null || !c02.b0()) ? nVar.E0() : c02.V();
        if (c02 == null || !c02.W()) {
            str = g(td.f.k(nVar, gVar), cVar);
            if (str == null) {
                return null;
            }
        } else {
            str = cVar.getString(c02.N());
        }
        return new d.a(cVar.getString(E0), str);
    }

    public final d.b e(rd.i iVar, td.c cVar, td.g gVar) {
        String str;
        List l10;
        int s10;
        List<q> o02;
        int s11;
        String e02;
        t.e(iVar, "proto");
        t.e(cVar, "nameResolver");
        t.e(gVar, "typeTable");
        i.f<rd.i, a.c> fVar = ud.a.f23536b;
        t.d(fVar, "methodSignature");
        a.c cVar2 = (a.c) td.e.a(iVar, fVar);
        int F0 = (cVar2 == null || !cVar2.b0()) ? iVar.F0() : cVar2.V();
        if (cVar2 == null || !cVar2.W()) {
            l10 = ub.u.l(td.f.h(iVar, gVar));
            List<u> R0 = iVar.R0();
            t.d(R0, "proto.valueParameterList");
            s10 = v.s(R0, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (u uVar : R0) {
                t.d(uVar, "it");
                arrayList.add(td.f.n(uVar, gVar));
            }
            o02 = c0.o0(l10, arrayList);
            s11 = v.s(o02, 10);
            ArrayList arrayList2 = new ArrayList(s11);
            for (q qVar : o02) {
                String g10 = f24018a.g(qVar, cVar);
                if (g10 == null) {
                    return null;
                }
                arrayList2.add(g10);
            }
            String g11 = g(td.f.j(iVar, gVar), cVar);
            if (g11 == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            e02 = c0.e0(arrayList2, BuildConfig.FLAVOR, "(", ")", 0, null, null, 56, null);
            sb2.append(e02);
            sb2.append(g11);
            str = sb2.toString();
        } else {
            str = cVar.getString(cVar2.N());
        }
        return new d.b(cVar.getString(F0), str);
    }
}
