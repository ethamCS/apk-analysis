package yd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yd.h.b;
import yd.j;
import yd.l;
import yd.q;
import yd.z;
/* loaded from: classes3.dex */
public final class h<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* renamed from: d */
    private static final h f26125d = new h(true);

    /* renamed from: b */
    private boolean f26127b;

    /* renamed from: c */
    private boolean f26128c = false;

    /* renamed from: a */
    private final v<FieldDescriptorType, Object> f26126a = v.o(16);

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26129a;

        /* renamed from: b */
        static final /* synthetic */ int[] f26130b;

        static {
            int[] iArr = new int[z.b.values().length];
            f26130b = iArr;
            try {
                iArr[z.b.f26220q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26130b[z.b.f26221x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26130b[z.b.f26222y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26130b[z.b.U3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26130b[z.b.V3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26130b[z.b.W3.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26130b[z.b.X3.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26130b[z.b.Y3.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26130b[z.b.Z3.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26130b[z.b.f26212c4.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26130b[z.b.f26213d4.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26130b[z.b.f26215f4.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26130b[z.b.f26216g4.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f26130b[z.b.f26217h4.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f26130b[z.b.f26218i4.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f26130b[z.b.f26210a4.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f26130b[z.b.f26211b4.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f26130b[z.b.f26214e4.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[z.c.values().length];
            f26129a = iArr2;
            try {
                iArr2[z.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f26129a[z.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f26129a[z.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f26129a[z.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f26129a[z.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f26129a[z.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f26129a[z.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f26129a[z.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f26129a[z.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        int c();

        boolean e();

        z.b f();

        z.c i();

        boolean k();

        q.a n(q.a aVar, q qVar);
    }

    private h() {
    }

    private h(boolean z10) {
        q();
    }

    private Object c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    private static int d(z.b bVar, int i10, Object obj) {
        int D = f.D(i10);
        if (bVar == z.b.f26210a4) {
            D *= 2;
        }
        return D + e(bVar, obj);
    }

    private static int e(z.b bVar, Object obj) {
        switch (a.f26130b[bVar.ordinal()]) {
            case 1:
                return f.g(((Double) obj).doubleValue());
            case 2:
                return f.m(((Float) obj).floatValue());
            case 3:
                return f.q(((Long) obj).longValue());
            case 4:
                return f.F(((Long) obj).longValue());
            case 5:
                return f.p(((Integer) obj).intValue());
            case 6:
                return f.k(((Long) obj).longValue());
            case 7:
                return f.j(((Integer) obj).intValue());
            case 8:
                return f.b(((Boolean) obj).booleanValue());
            case 9:
                return f.C((String) obj);
            case 10:
                return obj instanceof d ? f.e((d) obj) : f.c((byte[]) obj);
            case 11:
                return f.E(((Integer) obj).intValue());
            case 12:
                return f.x(((Integer) obj).intValue());
            case 13:
                return f.y(((Long) obj).longValue());
            case 14:
                return f.z(((Integer) obj).intValue());
            case 15:
                return f.B(((Long) obj).longValue());
            case 16:
                return f.n((q) obj);
            case 17:
                return obj instanceof l ? f.r((l) obj) : f.t((q) obj);
            case 18:
                return obj instanceof j.a ? f.i(((j.a) obj).c()) : f.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        z.b f10 = bVar.f();
        int c10 = bVar.c();
        if (bVar.e()) {
            int i10 = 0;
            List<Object> list = (List) obj;
            if (bVar.k()) {
                for (Object obj2 : list) {
                    i10 += e(f10, obj2);
                }
                return f.D(c10) + i10 + f.v(i10);
            }
            for (Object obj3 : list) {
                i10 += d(f10, c10, obj3);
            }
            return i10;
        }
        return d(f10, c10, obj);
    }

    public static <T extends b<T>> h<T> g() {
        return f26125d;
    }

    public static int l(z.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.g();
    }

    private boolean o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.i() == z.c.MESSAGE) {
            boolean e10 = key.e();
            Object value = entry.getValue();
            if (e10) {
                for (q qVar : (List) value) {
                    if (!qVar.c()) {
                        return false;
                    }
                }
            } else if (!(value instanceof q)) {
                if (!(value instanceof l)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                return true;
            } else if (!((q) value).c()) {
                return false;
            }
        }
        return true;
    }

    private void s(Map.Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        v<FieldDescriptorType, Object> vVar;
        Object h10;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof l) {
            value = ((l) value).e();
        }
        if (key.e()) {
            Object h11 = h(key);
            if (h11 == null) {
                h11 = new ArrayList();
            }
            for (Object obj2 : (List) value) {
                ((List) h11).add(c(obj2));
            }
            this.f26126a.p(key, h11);
            return;
        }
        if (key.i() != z.c.MESSAGE || (h10 = h(key)) == null) {
            vVar = this.f26126a;
            obj = c(value);
        } else {
            obj = key.n(((q) h10).g(), (q) value).b();
            vVar = this.f26126a;
        }
        vVar.p(key, obj);
    }

    public static <T extends b<T>> h<T> t() {
        return new h<>();
    }

    public static Object u(e eVar, z.b bVar, boolean z10) {
        switch (a.f26130b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.m());
            case 2:
                return Float.valueOf(eVar.q());
            case 3:
                return Long.valueOf(eVar.t());
            case 4:
                return Long.valueOf(eVar.M());
            case 5:
                return Integer.valueOf(eVar.s());
            case 6:
                return Long.valueOf(eVar.p());
            case 7:
                return Integer.valueOf(eVar.o());
            case 8:
                return Boolean.valueOf(eVar.k());
            case 9:
                return z10 ? eVar.J() : eVar.I();
            case 10:
                return eVar.l();
            case 11:
                return Integer.valueOf(eVar.L());
            case 12:
                return Integer.valueOf(eVar.E());
            case 13:
                return Long.valueOf(eVar.F());
            case 14:
                return Integer.valueOf(eVar.G());
            case 15:
                return Long.valueOf(eVar.H());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if ((r3 instanceof yd.j.a) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        if ((r3 instanceof byte[]) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if ((r3 instanceof yd.l) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void w(yd.z.b r2, java.lang.Object r3) {
        /*
            java.util.Objects.requireNonNull(r3)
            int[] r0 = yd.h.a.f26129a
            yd.z$c r2 = r2.b()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L27;
                case 8: goto L1e;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof yd.q
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof yd.l
            if (r2 == 0) goto L30
            goto L31
        L1e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof yd.j.a
            if (r2 == 0) goto L30
            goto L31
        L27:
            boolean r2 = r3 instanceof yd.d
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L30
            goto L31
        L30:
            r0 = r1
        L31:
            r1 = r0
            goto L44
        L33:
            boolean r1 = r3 instanceof java.lang.String
            goto L44
        L36:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r1 = r3 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L44
        L42:
            boolean r1 = r3 instanceof java.lang.Integer
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.h.w(yd.z$b, java.lang.Object):void");
    }

    private static void x(f fVar, z.b bVar, int i10, Object obj) {
        if (bVar == z.b.f26210a4) {
            fVar.Y(i10, (q) obj);
            return;
        }
        fVar.w0(i10, l(bVar, false));
        y(fVar, bVar, obj);
    }

    private static void y(f fVar, z.b bVar, Object obj) {
        switch (a.f26130b[bVar.ordinal()]) {
            case 1:
                fVar.R(((Double) obj).doubleValue());
                return;
            case 2:
                fVar.X(((Float) obj).floatValue());
                return;
            case 3:
                fVar.c0(((Long) obj).longValue());
                return;
            case 4:
                fVar.z0(((Long) obj).longValue());
                return;
            case 5:
                fVar.b0(((Integer) obj).intValue());
                return;
            case 6:
                fVar.V(((Long) obj).longValue());
                return;
            case 7:
                fVar.U(((Integer) obj).intValue());
                return;
            case 8:
                fVar.M(((Boolean) obj).booleanValue());
                return;
            case 9:
                fVar.v0((String) obj);
                return;
            case 10:
                if (obj instanceof d) {
                    fVar.P((d) obj);
                    return;
                } else {
                    fVar.N((byte[]) obj);
                    return;
                }
            case 11:
                fVar.y0(((Integer) obj).intValue());
                return;
            case 12:
                fVar.q0(((Integer) obj).intValue());
                return;
            case 13:
                fVar.r0(((Long) obj).longValue());
                return;
            case 14:
                fVar.s0(((Integer) obj).intValue());
                return;
            case 15:
                fVar.u0(((Long) obj).longValue());
                return;
            case 16:
                fVar.Z((q) obj);
                return;
            case 17:
                fVar.e0((q) obj);
                return;
            case 18:
                fVar.T(obj instanceof j.a ? ((j.a) obj).c() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
    }

    public static void z(b<?> bVar, Object obj, f fVar) {
        z.b f10 = bVar.f();
        int c10 = bVar.c();
        if (!bVar.e()) {
            if (obj instanceof l) {
                x(fVar, f10, c10, ((l) obj).e());
                return;
            } else {
                x(fVar, f10, c10, obj);
                return;
            }
        }
        List<Object> list = (List) obj;
        if (!bVar.k()) {
            for (Object obj2 : list) {
                x(fVar, f10, c10, obj2);
            }
            return;
        }
        fVar.w0(c10, 2);
        int i10 = 0;
        for (Object obj3 : list) {
            i10 += e(f10, obj3);
        }
        fVar.o0(i10);
        for (Object obj4 : list) {
            y(fVar, f10, obj4);
        }
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.e()) {
            w(fielddescriptortype.f(), obj);
            Object h10 = h(fielddescriptortype);
            if (h10 == null) {
                list = new ArrayList();
                this.f26126a.p(fielddescriptortype, list);
            } else {
                list = (List) h10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public h<FieldDescriptorType> clone() {
        h<FieldDescriptorType> t10 = t();
        for (int i10 = 0; i10 < this.f26126a.j(); i10++) {
            Map.Entry<FieldDescriptorType, Object> i11 = this.f26126a.i(i10);
            t10.v(i11.getKey(), i11.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f26126a.k()) {
            t10.v(entry.getKey(), entry.getValue());
        }
        t10.f26128c = this.f26128c;
        return t10;
    }

    public Object h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f26126a.get(fielddescriptortype);
        return obj instanceof l ? ((l) obj).e() : obj;
    }

    public Object i(FieldDescriptorType fielddescriptortype, int i10) {
        if (fielddescriptortype.e()) {
            Object h10 = h(fielddescriptortype);
            if (h10 == null) {
                throw new IndexOutOfBoundsException();
            }
            return ((List) h10).get(i10);
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int j(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.e()) {
            Object h10 = h(fielddescriptortype);
            if (h10 != null) {
                return ((List) h10).size();
            }
            return 0;
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int k() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f26126a.j(); i11++) {
            Map.Entry<FieldDescriptorType, Object> i12 = this.f26126a.i(i11);
            i10 += f(i12.getKey(), i12.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f26126a.k()) {
            i10 += f(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public boolean m(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.e()) {
            return this.f26126a.get(fielddescriptortype) != null;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public boolean n() {
        for (int i10 = 0; i10 < this.f26126a.j(); i10++) {
            if (!o(this.f26126a.i(i10))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f26126a.k()) {
            if (!o(entry)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> p() {
        return this.f26128c ? new l.c(this.f26126a.entrySet().iterator()) : this.f26126a.entrySet().iterator();
    }

    public void q() {
        if (this.f26127b) {
            return;
        }
        this.f26126a.n();
        this.f26127b = true;
    }

    public void r(h<FieldDescriptorType> hVar) {
        for (int i10 = 0; i10 < hVar.f26126a.j(); i10++) {
            s(hVar.f26126a.i(i10));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : hVar.f26126a.k()) {
            s(entry);
        }
    }

    public void v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.e()) {
            w(fielddescriptortype.f(), obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object obj2 : arrayList) {
                w(fielddescriptortype.f(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof l) {
            this.f26128c = true;
        }
        this.f26126a.p(fielddescriptortype, obj);
    }
}
