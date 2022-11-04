package t7;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.UUID;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes.dex */
public final class o implements Comparable<o> {

    /* renamed from: c */
    private final int f21984c;

    /* renamed from: d */
    private final Object f21985d;

    /* renamed from: q */
    private final int f21986q;

    /* renamed from: x */
    private final int f21987x;

    /* renamed from: y */
    public static final o f21983y = D(20);
    public static final o U3 = M(Double.NaN);
    public static final o V3 = M(Double.NEGATIVE_INFINITY);
    public static final o W3 = D(22);
    public static final o X3 = M(Double.POSITIVE_INFINITY);
    public static final o Y3 = D(21);
    public static final o Z3 = D(23);

    /* renamed from: a4 */
    public static final o f21974a4 = C(0);

    /* renamed from: b4 */
    private static final u7.f f21975b4 = u7.f.Y(1).a1(64).n1(u7.f.Z(1));

    /* renamed from: c4 */
    private static final u7.f[] f21976c4 = new u7.f[0];

    /* renamed from: d4 */
    private static final int[] f21977d4 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 5, 9, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 5, 9, -1, -1, -1, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, -1, -1, -1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 5, 9, -1, -1, -1, -1};

    /* renamed from: e4 */
    private static final byte[] f21978e4 = {102, 97, 108, 115, 101};

    /* renamed from: f4 */
    private static final byte[] f21979f4 = {110, 117, 108, 108};

    /* renamed from: g4 */
    private static final byte[] f21980g4 = {116, 114, 117, 101};

    /* renamed from: h4 */
    private static final o[] f21981h4 = z0();

    /* renamed from: i4 */
    private static final g f21982i4 = new g("allowempty=1");

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21988a;

        static {
            int[] iArr = new int[q.values().length];
            f21988a = iArr;
            try {
                iArr[q.Integer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21988a[q.FloatingPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21988a[q.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21988a[q.Map.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21988a[q.TextString.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21988a[q.ByteString.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21988a[q.Boolean.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21988a[q.SimpleValue.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    o(int i10, Object obj) {
        this.f21984c = i10;
        this.f21985d = obj;
        this.f21987x = 0;
        this.f21986q = 0;
    }

    o(o oVar, int i10, int i11) {
        this.f21984c = 6;
        this.f21985d = oVar;
        this.f21987x = i10;
        this.f21986q = i11;
    }

    private static void A(int i10, int i11) {
        if (i11 >= i10) {
            if (i11 > i10) {
                throw new h("Too many bytes. There is data beyond the decoded CBOR Object.");
            }
            return;
        }
        throw new h("Premature end of data");
    }

    private static int A0(List<o> list, List<o> list2) {
        if (list == null) {
            return list2 == null ? 0 : -1;
        } else if (list2 == null) {
            return 1;
        } else {
            int size = list.size();
            int size2 = list2.size();
            if (size != size2) {
                return size < size2 ? -1 : 1;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int compareTo = list.get(i10).compareTo(list2.get(i10));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return 0;
        }
    }

    private static void B(long j10, long j11) {
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i10 >= 0) {
            if (i10 > 0) {
                throw new h("Too many bytes. There is data beyond the decoded CBOR Object.");
            }
            return;
        }
        throw new h("Premature end of data");
    }

    private static u7.f B0(int i10, int i11) {
        return i11 != 0 ? u7.f.X(new byte[]{(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 24) & 255), (byte) (i11 & 255), (byte) ((i11 >> 8) & 255), (byte) ((i11 >> 16) & 255), (byte) ((i11 >> 24) & 255), 0}, true) : i10 != 0 ? u7.f.X(new byte[]{(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 24) & 255), 0}, true) : u7.f.Y(0);
    }

    private static o C(int i10) {
        return new o(0, Long.valueOf(i10));
    }

    private static int C0(Map<o, o> map, Map<o, o> map2) {
        if (map == null) {
            return map2 == null ? 0 : -1;
        } else if (map2 == null) {
            return 1;
        } else {
            if (map == map2) {
                return 0;
            }
            int size = map.size();
            int size2 = map2.size();
            if (size == 0 && size2 == 0) {
                return 0;
            }
            if (size == 0) {
                return -1;
            }
            if (size2 == 0) {
                return 1;
            }
            if (size != size2) {
                return size < size2 ? -1 : 1;
            }
            ArrayList arrayList = new ArrayList(map.keySet());
            ArrayList arrayList2 = new ArrayList(map2.keySet());
            int size3 = arrayList.size();
            arrayList2.size();
            for (int i10 = 0; i10 < size3; i10++) {
                o oVar = (o) arrayList.get(i10);
                o oVar2 = (o) arrayList2.get(i10);
                if (oVar == null) {
                    return -1;
                }
                int compareTo = oVar.compareTo(oVar2);
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = map.get(oVar).compareTo(map2.get(oVar2));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            }
            return 0;
        }
    }

    private static o D(int i10) {
        return new o(7, Integer.valueOf(i10));
    }

    public static o D0() {
        return new o(4, new ArrayList());
    }

    public static o E0(o oVar, o oVar2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(oVar);
        arrayList.add(oVar2);
        return new o(4, arrayList);
    }

    public static o F(byte[] bArr) {
        return G(bArr, g.f21955h);
    }

    static o F0(o oVar, o oVar2, o oVar3) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(oVar);
        arrayList.add(oVar2);
        arrayList.add(oVar3);
        return new o(4, arrayList);
    }

    public static o G(byte[] bArr, g gVar) {
        Throwable th2;
        ByteArrayInputStream byteArrayInputStream;
        String q02;
        Objects.requireNonNull(gVar, "options");
        Objects.requireNonNull(bArr, "data");
        ByteArrayInputStream byteArrayInputStream2 = null;
        if (bArr.length == 0) {
            if (!gVar.b()) {
                throw new h("data is empty.");
            }
            return null;
        }
        int i10 = bArr[0] & 255;
        int i11 = f21977d4[i10];
        if (i11 == -1) {
            throw new h("Unexpected data encountered");
        }
        if (i11 != 0) {
            A(i11, bArr.length);
            if (!gVar.c() || ((i10 >= 0 && i10 < 24) || (i10 >= 32 && i10 < 56))) {
                return n0(i10, bArr);
            }
        }
        if (i10 == 192 && !gVar.c() && (q02 = q0(bArr, 1)) != null) {
            return new o(T(q02), 0, 0);
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            int available = byteArrayInputStream.available();
            o J0 = J0(byteArrayInputStream, gVar);
            B(bArr.length, available - byteArrayInputStream.available());
            try {
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
            return J0;
        } catch (Throwable th4) {
            th2 = th4;
            byteArrayInputStream2 = byteArrayInputStream;
            if (byteArrayInputStream2 != null) {
                try {
                    byteArrayInputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }

    public static o G0() {
        return new o(5, new TreeMap());
    }

    private static byte[] H(u7.f fVar) {
        if (fVar.H1()) {
            return new byte[]{0};
        }
        if (fVar.I1() < 0) {
            fVar = fVar.b(1).L0();
        }
        byte[] r12 = fVar.r1(false);
        int i10 = 0;
        while (i10 < r12.length && r12[i10] == 0) {
            i10++;
        }
        if (i10 <= 0) {
            return r12;
        }
        int length = r12.length - i10;
        byte[] bArr = new byte[length];
        System.arraycopy(r12, i10, bArr, 0, length);
        return bArr;
    }

    public static o H0() {
        return new o(5, z.o());
    }

    private static List<Object> I0(List<Object> list, Object obj, Object obj2) {
        if (list == null) {
            list = new ArrayList<>(4);
            list.add(obj);
        }
        for (Object obj3 : list) {
            if (obj3 == obj2) {
                throw new IllegalArgumentException("Circular reference in data structure");
            }
        }
        list.add(obj2);
        return list;
    }

    public static o J0(InputStream inputStream, g gVar) {
        Objects.requireNonNull(gVar, "options");
        try {
            return new p(inputStream, gVar).d();
        } catch (IOException e10) {
            throw new h("I/O error occurred.", e10);
        }
    }

    public static o K(long j10, int i10) {
        if (i10 != 2) {
            if (i10 == 4) {
                return new o(8, Long.valueOf(t.G((int) (j10 & 4294967295L))));
            }
            if (i10 != 8) {
                throw new IllegalArgumentException("byteCount");
            }
            return new o(8, Long.valueOf(j10));
        }
        return new o(8, Long.valueOf(t.A((int) (j10 & 65535))));
    }

    public static o L(byte b10) {
        return O(b10 & 255);
    }

    private static byte[] L0(byte[] bArr) {
        if (bArr.length < 24) {
            byte[] bArr2 = new byte[bArr.length + 1];
            bArr2[0] = (byte) (bArr.length | 96);
            System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
            return bArr2;
        } else if (bArr.length <= 255) {
            byte[] bArr3 = new byte[bArr.length + 2];
            bArr3[0] = 120;
            bArr3[1] = (byte) bArr.length;
            System.arraycopy(bArr, 0, bArr3, 2, bArr.length);
            return bArr3;
        } else if (bArr.length > 65535) {
            byte[] r02 = r0(3, bArr.length);
            byte[] bArr4 = new byte[bArr.length + r02.length];
            System.arraycopy(r02, 0, bArr4, 0, r02.length);
            System.arraycopy(bArr, 0, bArr4, r02.length, bArr.length);
            return bArr4;
        } else {
            byte[] bArr5 = new byte[bArr.length + 3];
            bArr5[0] = 121;
            bArr5[1] = (byte) ((bArr.length >> 8) & 255);
            bArr5[2] = (byte) (bArr.length & 255);
            System.arraycopy(bArr, 0, bArr5, 3, bArr.length);
            return bArr5;
        }
    }

    public static o M(double d10) {
        return new o(8, Long.valueOf(t.r(d10)));
    }

    public static o N(float f10) {
        return new o(8, Long.valueOf(t.G(t.I(f10))));
    }

    public static o O(int i10) {
        return (i10 < 0 || i10 >= 24) ? (i10 < -24 || i10 >= 0) ? P(i10) : f21981h4[32 - (i10 + 1)] : f21981h4[i10];
    }

    public static o P(long j10) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        return (i10 < 0 || j10 >= 24) ? (j10 < -24 || i10 >= 0) ? new o(0, Long.valueOf(j10)) : f21981h4[32 - ((int) (j10 + 1))] : f21981h4[(int) j10];
    }

    public static o Q(Object obj) {
        return R(obj, y.f22020b);
    }

    public static o R(Object obj, y yVar) {
        return S(obj, yVar, null, 0);
    }

    public static o S(Object obj, y yVar, r rVar, int i10) {
        Objects.requireNonNull(yVar, "options");
        if (i10 < 100) {
            if (obj == null) {
                return W3;
            }
            if (obj instanceof o) {
                return U((o) obj);
            }
            if (obj instanceof String) {
                return T((String) obj);
            }
            if (obj instanceof Integer) {
                return O(((Integer) obj).intValue());
            }
            if (obj instanceof Long) {
                return P(((Long) obj).longValue());
            }
            byte[] bArr = null;
            u7.f fVar = obj instanceof u7.f ? (u7.f) obj : null;
            if (fVar != null) {
                return X(fVar);
            }
            u7.d dVar = obj instanceof u7.d ? (u7.d) obj : null;
            if (dVar != null) {
                return V(dVar);
            }
            u7.e eVar = obj instanceof u7.e ? (u7.e) obj : null;
            if (eVar != null) {
                return W(eVar);
            }
            u7.h hVar = obj instanceof u7.h ? (u7.h) obj : null;
            if (hVar != null) {
                return Y(hVar);
            }
            if (obj instanceof Short) {
                return Z(((Short) obj).shortValue());
            }
            if (obj instanceof Character) {
                return O(((Character) obj).charValue());
            }
            if (obj instanceof Boolean) {
                return a0(((Boolean) obj).booleanValue());
            }
            if (obj instanceof Byte) {
                return L(((Byte) obj).byteValue());
            }
            if (obj instanceof Float) {
                return N(((Float) obj).floatValue());
            }
            if (obj instanceof Double) {
                return M(((Double) obj).doubleValue());
            }
            if (obj instanceof byte[]) {
                bArr = (byte[]) obj;
            }
            if (bArr != null) {
                return b0(bArr);
            }
            if (obj instanceof Map) {
                o G0 = G0();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    int i11 = i10 + 1;
                    G0.C1(S(entry.getKey(), yVar, rVar, i11), S(entry.getValue(), yVar, rVar, i11));
                }
                return G0;
            } else if (obj.getClass().isArray()) {
                return z.h(obj, yVar, rVar, i10);
            } else {
                if (obj instanceof Iterable) {
                    o D0 = D0();
                    for (Object obj2 : (Iterable) obj) {
                        D0.d(S(obj2, yVar, rVar, i10 + 1));
                    }
                    return D0;
                } else if (obj instanceof Enum) {
                    return Q(z.c((Enum) obj));
                } else {
                    if (obj instanceof Date) {
                        return new d().b((Date) obj);
                    }
                    if (obj instanceof URI) {
                        return new s().a((URI) obj);
                    }
                    if (obj instanceof UUID) {
                        return new u().a((UUID) obj);
                    }
                    o i12 = z.i(obj);
                    if (i12 != null) {
                        return i12;
                    }
                    o G02 = G0();
                    for (Map.Entry<String, Object> entry2 : z.k(obj, yVar.a())) {
                        G02.B1(entry2.getKey(), S(entry2.getValue(), yVar, rVar, i10 + 1));
                    }
                    return G02;
                }
            }
        }
        throw new h("Nesting depth too high");
    }

    public static void S0(long j10, OutputStream outputStream) {
        int i10;
        Objects.requireNonNull(outputStream, "stream");
        if (j10 >= 0) {
            i10 = 0;
        } else {
            j10 = -(j10 + 1);
            i10 = 1;
        }
        c1(i10, j10, outputStream);
    }

    public static o T(String str) {
        if (str == null) {
            return W3;
        }
        if (str.length() == 0) {
            return o0(96);
        }
        long b10 = v7.a.b(str, false);
        if (b10 < 0) {
            throw new IllegalArgumentException("String contains an unpaired surrogate code point.");
        }
        return new o(((long) str.length()) == b10 ? 10 : 3, str);
    }

    public static void T0(String str, OutputStream outputStream, g gVar) {
        Objects.requireNonNull(outputStream, "stream");
        Objects.requireNonNull(gVar, "options");
        if (str == null) {
            outputStream.write(246);
        } else if (gVar.g() && !gVar.c()) {
            d1(str, outputStream);
        } else {
            c1(3, v7.a.b(str, true), outputStream);
            v7.a.i(str, outputStream, true);
        }
    }

    public static o U(o oVar) {
        return oVar == null ? W3 : oVar;
    }

    public static void U0(u7.f fVar, OutputStream outputStream) {
        int i10;
        byte b10;
        int i11;
        int i12;
        Objects.requireNonNull(outputStream, "stream");
        if (fVar != null) {
            if (fVar.I1() < 0) {
                fVar = fVar.d(u7.f.Y(1)).L0();
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (fVar.C()) {
                c1(i10, fVar.u1(), outputStream);
                return;
            }
            byte[] r12 = fVar.r1(true);
            int length = r12.length;
            while (length > 0 && r12[length - 1] == 0) {
                length--;
            }
            if (length != 0) {
                int i13 = length >> 1;
                int i14 = length - 1;
                int i15 = 0;
                while (i15 < i13) {
                    byte b11 = r12[i15];
                    r12[i15] = r12[i14];
                    r12[i14] = b11;
                    i15++;
                    i14--;
                }
            }
            switch (length) {
                case 0:
                    b10 = (byte) (i10 << 5);
                    break;
                case 1:
                    b1(i10, r12[0] & 255, outputStream);
                    return;
                case 2:
                    i11 = (i10 << 5) | 25;
                    outputStream.write((byte) i11);
                    break;
                case 3:
                    i12 = (i10 << 5) | 26;
                    outputStream.write((byte) i12);
                    outputStream.write(0);
                    break;
                case 4:
                    i11 = (i10 << 5) | 26;
                    outputStream.write((byte) i11);
                    break;
                case 5:
                    outputStream.write((byte) ((i10 << 5) | 27));
                    outputStream.write(0);
                    outputStream.write(0);
                    outputStream.write(0);
                    break;
                case 6:
                    outputStream.write((byte) ((i10 << 5) | 27));
                    outputStream.write(0);
                    outputStream.write(0);
                    break;
                case 7:
                    i12 = (i10 << 5) | 27;
                    outputStream.write((byte) i12);
                    outputStream.write(0);
                    break;
                case 8:
                    i11 = (i10 << 5) | 27;
                    outputStream.write((byte) i11);
                    break;
                default:
                    outputStream.write(i10 == 0 ? -62 : -61);
                    b1(2, length, outputStream);
                    break;
            }
            outputStream.write(r12, 0, length);
            return;
        }
        b10 = 246;
        outputStream.write(b10);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    public static o V(u7.d dVar) {
        o oVar;
        o X;
        if (dVar == null) {
            return W3;
        }
        int i10 = 4;
        if (dVar.I() || dVar.J() || (dVar.i0() && dVar.j0())) {
            ?? i02 = dVar.i0();
            int i11 = i02;
            if (dVar.I()) {
                i11 = i02 + 2;
            }
            int i12 = i11;
            if (dVar.M()) {
                i12 = i11 + 4;
            }
            int i13 = i12;
            if (dVar.N()) {
                i13 = i12 + 6;
            }
            oVar = F0(X(dVar.e0()), X(dVar.g0()), O(i13));
            i10 = 268;
        } else {
            u7.f e02 = dVar.e0();
            if (e02.C()) {
                X = P(e02.u1());
            } else {
                if (e02.m0() > 64) {
                    i10 = 264;
                }
                X = X(e02);
            }
            oVar = E0(X, X(dVar.f0()));
        }
        return oVar.Q0(i10);
    }

    private static List<Object> V0(Object obj, o oVar, OutputStream outputStream, List<Object> list, g gVar) {
        if (oVar == null) {
            outputStream.write(246);
        } else {
            int m12 = oVar.m1();
            if (m12 == 4) {
                list = I0(list, obj, oVar.r1());
                oVar.e1(outputStream);
                X0(oVar.p(), outputStream, list, gVar);
            } else if (m12 == 5) {
                list = I0(list, obj, oVar.r1());
                oVar.e1(outputStream);
                Z0(oVar.q(), outputStream, list, gVar);
            } else {
                oVar.f1(outputStream, gVar);
            }
            list.remove(list.size() - 1);
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    public static o W(u7.e eVar) {
        o oVar;
        o X;
        if (eVar == null) {
            return W3;
        }
        int i10 = 5;
        if (eVar.x() || eVar.y() || (eVar.S() && eVar.T())) {
            ?? S = eVar.S();
            int i11 = S;
            if (eVar.x()) {
                i11 = S + 2;
            }
            int i12 = i11;
            if (eVar.B()) {
                i12 = i11 + 4;
            }
            int i13 = i12;
            if (eVar.C()) {
                i13 = i12 + 6;
            }
            oVar = F0(X(eVar.O()), X(eVar.Q()), O(i13));
            i10 = 269;
        } else {
            u7.f O = eVar.O();
            if (O.C()) {
                X = P(O.u1());
            } else {
                if (O.m0() > 64) {
                    i10 = 265;
                }
                X = X(O);
            }
            oVar = E0(X, X(eVar.P()));
        }
        return oVar.Q0(i10);
    }

    public static int W0(OutputStream outputStream, long j10, int i10, boolean z10) {
        int H;
        Objects.requireNonNull(outputStream, "outputStream");
        if (z10) {
            if (i10 == 8) {
                int q10 = t.q(j10);
                if (q10 != -1) {
                    return W0(outputStream, q10, 2, false);
                }
                if (t.p(j10)) {
                    return W0(outputStream, t.s(j10), 4, false);
                }
            } else if (i10 == 4 && (H = t.H((float) j10)) != -1) {
                return W0(outputStream, H, 2, false);
            }
        }
        if (i10 == 2) {
            outputStream.write(new byte[]{-7, (byte) ((j10 >> 8) & 255), (byte) (j10 & 255)}, 0, 3);
            return 3;
        } else if (i10 == 4) {
            outputStream.write(new byte[]{-6, (byte) ((j10 >> 24) & 255), (byte) ((j10 >> 16) & 255), (byte) ((j10 >> 8) & 255), (byte) (j10 & 255)}, 0, 5);
            return 5;
        } else if (i10 != 8) {
            throw new IllegalArgumentException("byteCount");
        } else {
            outputStream.write(new byte[]{-5, (byte) ((j10 >> 56) & 255), (byte) ((j10 >> 48) & 255), (byte) ((j10 >> 40) & 255), (byte) ((j10 >> 32) & 255), (byte) ((j10 >> 24) & 255), (byte) ((j10 >> 16) & 255), (byte) ((j10 >> 8) & 255), (byte) (j10 & 255)}, 0, 9);
            return 9;
        }
    }

    public static o X(u7.f fVar) {
        if (fVar == null) {
            return W3;
        }
        if (fVar.C()) {
            return P(fVar.u1());
        }
        if (fVar.l0().C1(64) <= 0) {
            return new o(1, fVar);
        }
        return c0(H(fVar), fVar.I1() < 0 ? 3 : 2);
    }

    private static void X0(List<o> list, OutputStream outputStream, List<Object> list2, g gVar) {
        b1(4, list.size(), outputStream);
        for (o oVar : list) {
            list2 = V0(list, oVar, outputStream, list2, gVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int, boolean] */
    public static o Y(u7.h hVar) {
        o oVar;
        int i10;
        if (hVar == null) {
            return W3;
        }
        if (hVar.q() || hVar.r() || (hVar.I() && hVar.J())) {
            ?? I = hVar.I();
            int i11 = I;
            if (hVar.q()) {
                i11 = I + 2;
            }
            int i12 = i11;
            if (hVar.v()) {
                i12 = i11 + 4;
            }
            int i13 = i12;
            if (hVar.w()) {
                i13 = i12 + 6;
            }
            oVar = F0(X(hVar.G()), X(hVar.E()), O(i13));
            i10 = 270;
        } else {
            i10 = 30;
            oVar = E0(X(hVar.F()), X(hVar.E()));
        }
        return oVar.Q0(i10);
    }

    private static void Y0(List<o> list, OutputStream outputStream, g gVar) {
        X0(list, outputStream, null, gVar);
    }

    public static o Z(short s10) {
        return (s10 < 0 || s10 >= 24) ? (s10 < -24 || s10 >= 0) ? P(s10) : f21981h4[32 - (s10 + 1)] : f21981h4[s10];
    }

    private static void Z0(Map<o, o> map, OutputStream outputStream, List<Object> list, g gVar) {
        b1(5, map.size(), outputStream);
        for (Map.Entry<o, o> entry : map.entrySet()) {
            list = V0(map, entry.getValue(), outputStream, V0(map, entry.getKey(), outputStream, list, gVar), gVar);
        }
    }

    public static o a0(boolean z10) {
        return z10 ? Y3 : f21983y;
    }

    private static void a1(Map<o, o> map, OutputStream outputStream, g gVar) {
        Z0(map, outputStream, null, gVar);
    }

    public static o b0(byte[] bArr) {
        if (bArr == null) {
            return W3;
        }
        System.arraycopy(bArr, 0, new byte[bArr.length], 0, bArr.length);
        return new o(2, bArr);
    }

    private static int b1(int i10, int i11, OutputStream outputStream) {
        byte[] s02 = s0(i10, i11);
        outputStream.write(s02, 0, s02.length);
        return s02.length;
    }

    public static o c0(Object obj, int i10) {
        if (i10 >= 0) {
            return Q(obj).Q0(i10);
        }
        throw new IllegalArgumentException("smallTag(" + i10 + ") is less than 0");
    }

    private static int c1(int i10, long j10, OutputStream outputStream) {
        byte[] r02 = r0(i10, j10);
        outputStream.write(r02, 0, r02.length);
        return r02.length;
    }

    public static o d0(Object obj, u7.f fVar) {
        Objects.requireNonNull(fVar, "bigintTag");
        if (fVar.I1() < 0) {
            throw new IllegalArgumentException("tagEInt's sign(" + fVar.I1() + ") is less than 0");
        } else if (fVar.compareTo(f21975b4) <= 0) {
            return Q(obj).R0(fVar);
        } else {
            throw new IllegalArgumentException("tag more than 18446744073709551615 (" + fVar + ")");
        }
    }

    private static void d1(String str, OutputStream outputStream) {
        int i10;
        byte[] p02 = p0(str, -1);
        if (p02 != null) {
            outputStream.write(p02, 0, p02.length);
            return;
        }
        int min = Math.min(4096, str.length());
        if (min < 4096) {
            min = Math.min(4096, min * 3);
        }
        byte[] bArr = new byte[min];
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        while (i11 < str.length()) {
            int charAt = str.charAt(i11);
            if (charAt <= 127) {
                if (i12 >= 4096) {
                    if (!z10) {
                        outputStream.write(127);
                    }
                    b1(3, i12, outputStream);
                    outputStream.write(bArr, 0, i12);
                    i12 = 0;
                    z10 = true;
                }
                bArr[i12] = (byte) charAt;
                i12++;
            } else if (charAt <= 2047) {
                if (i12 + 2 > 4096) {
                    if (!z10) {
                        outputStream.write(127);
                    }
                    b1(3, i12, outputStream);
                    outputStream.write(bArr, 0, i12);
                    i12 = 0;
                    z10 = true;
                }
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((charAt >> 6) & 31) | 192);
                i12 = i13 + 1;
                bArr[i13] = (byte) ((charAt & 63) | 128);
            } else {
                if ((charAt & 64512) == 55296 && (i10 = i11 + 1) < str.length() && (str.charAt(i10) & 64512) == 56320) {
                    charAt = ((charAt & 1023) << 10) + 65536 + (str.charAt(i10) & 1023);
                    i11 = i10;
                } else if ((63488 & charAt) == 55296) {
                    charAt = 65533;
                }
                if (charAt <= 65535) {
                    if (i12 + 3 > 4096) {
                        if (!z10) {
                            outputStream.write(127);
                        }
                        b1(3, i12, outputStream);
                        outputStream.write(bArr, 0, i12);
                        i12 = 0;
                        z10 = true;
                    }
                    int i14 = i12 + 1;
                    bArr[i12] = (byte) (((charAt >> 12) & 15) | 224);
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) (((charAt >> 6) & 63) | 128);
                    bArr[i15] = (byte) ((charAt & 63) | 128);
                    i12 = i15 + 1;
                } else {
                    if (i12 + 4 > 4096) {
                        if (!z10) {
                            outputStream.write(127);
                        }
                        b1(3, i12, outputStream);
                        outputStream.write(bArr, 0, i12);
                        i12 = 0;
                        z10 = true;
                    }
                    int i16 = i12 + 1;
                    bArr[i12] = (byte) (((charAt >> 18) & 7) | 240);
                    int i17 = i16 + 1;
                    bArr[i16] = (byte) (((charAt >> 12) & 63) | 128);
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) (((charAt >> 6) & 63) | 128);
                    i12 = i18 + 1;
                    bArr[i18] = (byte) ((charAt & 63) | 128);
                }
            }
            i11++;
        }
        b1(3, i12, outputStream);
        outputStream.write(bArr, 0, i12);
        if (!z10) {
            return;
        }
        outputStream.write(-1);
    }

    public static o e0(String str) {
        return new o(3, str);
    }

    private void e1(OutputStream outputStream) {
        long j10;
        for (o oVar = this; oVar.x1(); oVar = (o) oVar.f21985d) {
            int i10 = oVar.f21987x;
            int i11 = oVar.f21986q;
            if (i11 == 0 && (i10 >> 16) == 0) {
                b1(6, i10, outputStream);
            } else {
                if (i11 == 0) {
                    j10 = i10 & 4294967295L;
                } else {
                    int i12 = i11 >> 16;
                    if (i12 == 0) {
                        j10 = ((i11 & 4294967295L) << 32) | (i10 & 4294967295L);
                    } else {
                        outputStream.write(new byte[]{-37, (byte) ((i11 >> 24) & 255), (byte) (i12 & 255), (byte) ((i11 >> 8) & 255), (byte) (i11 & 255), (byte) ((i10 >> 24) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 8) & 255), (byte) (i10 & 255)}, 0, 9);
                    }
                }
                c1(6, j10, outputStream);
            }
        }
    }

    public static o f0(byte[] bArr) {
        return new o(2, bArr);
    }

    public static o g0(byte[] bArr) {
        return new o(9, bArr);
    }

    public static int g1(OutputStream outputStream, int i10, int i11) {
        Objects.requireNonNull(outputStream, "outputStream");
        if (i10 < 0) {
            throw new IllegalArgumentException("majorType(" + i10 + ") is less than 0");
        } else if (i10 > 7) {
            throw new IllegalArgumentException("majorType(" + i10 + ") is more than 7");
        } else if (i11 < 0) {
            throw new IllegalArgumentException("value(" + i11 + ") is less than 0");
        } else if (i10 != 7) {
            return b1(i10, i11, outputStream);
        } else {
            if (i11 > 255) {
                throw new IllegalArgumentException("value(" + i11 + ") is more than 255");
            } else if (i11 <= 23) {
                outputStream.write((byte) (i11 + 224));
                return 1;
            } else if (i11 < 32) {
                throw new IllegalArgumentException("value is from 24 to 31 and major type is 7");
            } else {
                outputStream.write(-8);
                outputStream.write((byte) i11);
                return 2;
            }
        }
    }

    public static o h0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("simpleValue(" + i10 + ") is less than 0");
        } else if (i10 > 255) {
            throw new IllegalArgumentException("simpleValue(" + i10 + ") is more than 255");
        } else if (i10 < 24 || i10 >= 32) {
            return i10 < 32 ? f21981h4[i10 + 224] : new o(7, Integer.valueOf(i10));
        } else {
            throw new IllegalArgumentException("Simple value is from 24 to 31: " + i10);
        }
    }

    private static byte[] k0(long j10, int i10) {
        int q10 = t.q(j10);
        if (q10 != -1) {
            return i10 != 0 ? new byte[]{(byte) i10, -7, (byte) ((q10 >> 8) & 255), (byte) (q10 & 255)} : new byte[]{-7, (byte) ((q10 >> 8) & 255), (byte) (q10 & 255)};
        } else if (!t.p(j10)) {
            return l0(j10, i10);
        } else {
            int s10 = t.s(j10);
            return i10 != 0 ? new byte[]{(byte) i10, -6, (byte) ((s10 >> 24) & 255), (byte) ((s10 >> 16) & 255), (byte) ((s10 >> 8) & 255), (byte) (s10 & 255)} : new byte[]{-6, (byte) ((s10 >> 24) & 255), (byte) ((s10 >> 16) & 255), (byte) ((s10 >> 8) & 255), (byte) (s10 & 255)};
        }
    }

    private int l(int i10, int i11) {
        n j10 = n.j(this);
        if (j10 != null) {
            return j10.q().i(j10.s(), i10, i11);
        }
        throw new IllegalStateException("not a number type");
    }

    private static byte[] l0(long j10, int i10) {
        return i10 != 0 ? new byte[]{(byte) i10, -5, (byte) ((j10 >> 56) & 255), (byte) ((j10 >> 48) & 255), (byte) ((j10 >> 40) & 255), (byte) ((j10 >> 32) & 255), (byte) ((j10 >> 24) & 255), (byte) ((j10 >> 16) & 255), (byte) ((j10 >> 8) & 255), (byte) (j10 & 255)} : new byte[]{-5, (byte) ((j10 >> 56) & 255), (byte) ((j10 >> 48) & 255), (byte) ((j10 >> 40) & 255), (byte) ((j10 >> 32) & 255), (byte) ((j10 >> 24) & 255), (byte) ((j10 >> 16) & 255), (byte) ((j10 >> 8) & 255), (byte) (j10 & 255)};
    }

    public static int m0(int i10) {
        return f21977d4[i10];
    }

    private final int m1() {
        o oVar = this;
        while (true) {
            int i10 = oVar.f21984c;
            if (i10 == 6) {
                oVar = (o) oVar.f21985d;
            } else {
                return i10;
            }
        }
    }

    public static o n0(int i10, byte[] bArr) {
        long j10;
        long j11;
        byte b10;
        o oVar = f21981h4[i10];
        if (oVar != null) {
            return oVar;
        }
        int i11 = i10 >> 5;
        if ((i10 & 28) != 24) {
            if (i11 == 2) {
                int i12 = i10 - 64;
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, 1, bArr2, 0, i12);
                return new o(2, bArr2);
            } else if (i11 != 3) {
                if (i10 == 128) {
                    return D0();
                }
                if (i10 != 160) {
                    throw new h("Unexpected data encountered");
                }
                return H0();
            } else {
                int i13 = i10 - 96;
                byte[] bArr3 = new byte[i13];
                System.arraycopy(bArr, 1, bArr3, 0, i13);
                if (!t.g(bArr3)) {
                    throw new h("Invalid encoding");
                }
                return new o(9, bArr3);
            }
        }
        switch (i10 & 31) {
            case 24:
                j10 = bArr[1] & 255;
                break;
            case 25:
                j11 = (bArr[1] & 255) << 8;
                b10 = bArr[2];
                j10 = j11 | (b10 & 255);
                break;
            case 26:
                j11 = ((bArr[3] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 24);
                b10 = bArr[4];
                j10 = j11 | (b10 & 255);
                break;
            case 27:
                j11 = ((bArr[3] & 255) << 40) | ((bArr[2] & 255) << 48) | ((bArr[1] & 255) << 56) | ((bArr[4] & 255) << 32) | ((bArr[5] & 255) << 24) | ((bArr[6] & 255) << 16) | ((bArr[7] & 255) << 8);
                b10 = bArr[8];
                j10 = j11 | (b10 & 255);
                break;
            default:
                throw new h("Unexpected data encountered");
        }
        if (i11 == 0) {
            return (j10 >> 63) == 0 ? new o(0, Long.valueOf(j10)) : X(B0((int) (j10 & 4294967295L), (int) ((j10 >> 32) & 4294967295L)));
        } else if (i11 == 1) {
            if ((j10 >> 63) == 0) {
                return new o(0, Long.valueOf((-1) - j10));
            }
            return X(u7.f.Z(-1L).n1(B0((int) (j10 & 4294967295L), (int) ((j10 >> 32) & 4294967295L))));
        } else if (i11 != 7) {
            throw new h("Unexpected data encountered");
        } else {
            if (i10 >= 249 && i10 <= 251) {
                if (i10 == 249) {
                    j10 = t.A((int) j10);
                } else if (i10 == 250) {
                    j10 = t.G((int) j10);
                }
                return new o(8, Long.valueOf(j10));
            } else if (i10 != 248) {
                throw new h("Unexpected data encountered");
            } else {
                int i14 = (int) j10;
                if (i14 < 32) {
                    throw new h("Invalid overlong simple value");
                }
                return new o(7, Integer.valueOf(i14));
            }
        }
    }

    public static o o0(int i10) {
        return f21981h4[i10];
    }

    private List<o> p() {
        return (List) r1();
    }

    private static byte[] p0(String str, int i10) {
        int i11;
        int i12;
        if (str.length() <= 255) {
            int length = str.length();
            boolean z10 = true;
            int i13 = length < 24 ? 1 : 2;
            if (i10 >= 0) {
                i13++;
            }
            byte[] bArr = new byte[i13 + length];
            if (i10 >= 0) {
                bArr[0] = (byte) i10;
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (length < 24) {
                bArr[i11] = (byte) (str.length() + 96);
                i12 = i11 + 1;
            } else {
                bArr[i11] = 120;
                bArr[i11 + 1] = (byte) str.length();
                i12 = i11 + 2;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= str.length()) {
                    break;
                }
                char charAt = str.charAt(i14);
                if (charAt >= 128) {
                    z10 = false;
                    break;
                }
                bArr[i14 + i12] = (byte) charAt;
                i14++;
            }
            if (!z10) {
                return null;
            }
            return bArr;
        }
        return null;
    }

    private Map<o, o> q() {
        return (Map) r1();
    }

    private static String q0(byte[] bArr, int i10) {
        int i11;
        int length = bArr.length;
        if (length <= i10 || (i11 = bArr[i10] & 255) < 96 || i11 >= 120) {
            return null;
        }
        int i12 = i10 + 1;
        A((i11 - 96) + i12, length);
        for (int i13 = i12; i13 < length; i13++) {
            if ((bArr[i13] & Byte.MIN_VALUE) != 0) {
                return null;
            }
        }
        char[] cArr = new char[length - i12];
        for (int i14 = i12; i14 < length; i14++) {
            cArr[i14 - i12] = (char) (bArr[i14] & 255);
        }
        return new String(cArr);
    }

    private static byte[] r0(int i10, long j10) {
        if (j10 >= 0) {
            return j10 < 24 ? new byte[]{(byte) (((byte) j10) | ((byte) (i10 << 5)))} : j10 <= 255 ? new byte[]{(byte) ((i10 << 5) | 24), (byte) (j10 & 255)} : j10 <= 65535 ? new byte[]{(byte) ((i10 << 5) | 25), (byte) ((j10 >> 8) & 255), (byte) (j10 & 255)} : j10 <= 4294967295L ? new byte[]{(byte) ((i10 << 5) | 26), (byte) ((j10 >> 24) & 255), (byte) ((j10 >> 16) & 255), (byte) ((j10 >> 8) & 255), (byte) (j10 & 255)} : new byte[]{(byte) ((i10 << 5) | 27), (byte) ((j10 >> 56) & 255), (byte) ((j10 >> 48) & 255), (byte) ((j10 >> 40) & 255), (byte) ((j10 >> 32) & 255), (byte) ((j10 >> 24) & 255), (byte) ((j10 >> 16) & 255), (byte) ((j10 >> 8) & 255), (byte) (j10 & 255)};
        }
        throw new IllegalArgumentException("value(" + j10 + ") is less than 0");
    }

    private final Object r1() {
        o oVar = this;
        while (true) {
            int i10 = oVar.f21984c;
            Object obj = oVar.f21985d;
            if (i10 == 6) {
                oVar = (o) obj;
            } else {
                return obj;
            }
        }
    }

    private static byte[] s0(int i10, int i11) {
        if (i11 >= 0) {
            return i11 < 24 ? new byte[]{(byte) (((byte) (i10 << 5)) | ((byte) i11))} : i11 <= 255 ? new byte[]{(byte) ((i10 << 5) | 24), (byte) (i11 & 255)} : i11 <= 65535 ? new byte[]{(byte) ((i10 << 5) | 25), (byte) ((i11 >> 8) & 255), (byte) (i11 & 255)} : new byte[]{(byte) ((i10 << 5) | 26), (byte) ((i11 >> 24) & 255), (byte) ((i11 >> 16) & 255), (byte) ((i11 >> 8) & 255), (byte) (i11 & 255)};
        }
        throw new IllegalArgumentException("value(" + i11 + ") is less than 0");
    }

    private static boolean t(List<o> list, List<o> list2) {
        int size;
        if (list == null) {
            return list2 == null;
        } else if (list2 == null || (size = list.size()) != list2.size()) {
            return false;
        } else {
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = list.get(i10);
                o oVar2 = list2.get(i10);
                if (oVar == null) {
                    if (oVar2 != null) {
                        return false;
                    }
                } else if (!oVar.i1(oVar2)) {
                    return false;
                }
            }
            return true;
        }
    }

    private static int v(List<o> list) {
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i10 = 589 + size;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + list.get(i11).hashCode();
        }
        return i10;
    }

    private static boolean w(Map<o, o> map, Map<o, o> map2) {
        if (map == null) {
            return map2 == null;
        } else if (map2 == null || map.size() != map2.size()) {
            return false;
        } else {
            for (Map.Entry<o, o> entry : map.entrySet()) {
                o oVar = map2.get(entry.getKey());
                if (oVar == null ? map2.containsKey(entry.getKey()) : true) {
                    o value = entry.getValue();
                    if (value == null) {
                        if (oVar == null) {
                        }
                    } else if (!value.i1(oVar)) {
                    }
                }
                return false;
            }
            return true;
        }
    }

    private static int x(Map<o, o> map) {
        return map.size() * 19;
    }

    private static o[] z0() {
        o[] oVarArr = new o[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i10 = 0; i10 < 24; i10++) {
            oVarArr[i10] = new o(0, Long.valueOf(i10));
        }
        for (int i11 = 32; i11 < 56; i11++) {
            oVarArr[i11] = new o(0, Long.valueOf((-1) - (i11 - 32)));
        }
        oVarArr[96] = new o(3, BuildConfig.FLAVOR);
        for (int i12 = 224; i12 < 248; i12++) {
            oVarArr[i12] = new o(7, Integer.valueOf(i12 - 224));
        }
        return oVarArr;
    }

    public void A1(int i10, o oVar) {
        if (s1() != q.Array) {
            if (s1() != q.Map) {
                throw new IllegalStateException("Not an array or map");
            }
            q().put(O(i10), oVar);
            return;
        }
        Objects.requireNonNull(oVar, "value");
        List<o> p10 = p();
        if (i10 < 0 || i10 >= p10.size()) {
            throw new IllegalArgumentException("index");
        }
        p10.set(i10, oVar);
    }

    public void B1(String str, o oVar) {
        Objects.requireNonNull(str, "key");
        Objects.requireNonNull(oVar, "value");
        o T = T(str);
        if (s1() == q.Map) {
            q().put(T, oVar);
            return;
        }
        throw new IllegalStateException("Not a map");
    }

    public void C1(o oVar, o oVar2) {
        Objects.requireNonNull(oVar, "key");
        Objects.requireNonNull(oVar2, "value");
        if (s1() == q.Map) {
            q().put(oVar, oVar2);
        } else if (s1() != q.Array) {
            throw new IllegalStateException("Not an array or map");
        } else {
            if (!oVar.w1() || !oVar.r().x()) {
                throw new IllegalArgumentException("Not an integer");
            }
            if (!oVar.r().d()) {
                throw new IllegalArgumentException("key");
            }
            List<o> p10 = p();
            int F = oVar.r().F();
            if (F < 0 || F >= p10.size()) {
                throw new IllegalArgumentException("key");
            }
            p10.set(F, oVar2);
        }
    }

    public final int D1() {
        if (s1() == q.Array) {
            return p().size();
        }
        if (s1() != q.Map) {
            return 0;
        }
        return q().size();
    }

    public boolean E(o oVar) {
        if (oVar == null) {
            oVar = W3;
        }
        if (s1() == q.Map) {
            return q().containsKey(oVar);
        }
        return false;
    }

    public byte[] I() {
        return J(g.f21955h);
    }

    public byte[] J(g gVar) {
        boolean z10;
        byte b10;
        Throwable th2;
        Objects.requireNonNull(gVar, "options");
        if (gVar.c()) {
            return b.c(this);
        }
        boolean x12 = x1();
        if (x1()) {
            if (!((o) this.f21985d).x1() && this.f21986q == 0) {
                int i10 = this.f21987x;
                if ((i10 >> 16) == 0 && i10 < 24) {
                    b10 = (byte) (i10 + 192);
                    z10 = false;
                }
            }
            b10 = 0;
            z10 = true;
        } else {
            b10 = 0;
            z10 = false;
        }
        if (!z10) {
            int m12 = m1();
            if (m12 == 0) {
                long longValue = ((Long) r1()).longValue();
                byte[] r02 = longValue >= 0 ? r0(0, longValue) : r0(1, -(longValue + 1));
                if (!x12) {
                    return r02;
                }
                byte[] bArr = new byte[r02.length + 1];
                System.arraycopy(r02, 0, bArr, 1, r02.length);
                bArr[0] = b10;
                return bArr;
            }
            if (m12 != 3) {
                switch (m12) {
                    case 7:
                        if (x12) {
                            byte[] bArr2 = {b10, -12};
                            if (u1()) {
                                bArr2[1] = -12;
                                return bArr2;
                            } else if (y1()) {
                                bArr2[1] = -11;
                                return bArr2;
                            } else if (v1()) {
                                bArr2[1] = -10;
                                return bArr2;
                            } else if (z1()) {
                                bArr2[1] = -9;
                                return bArr2;
                            }
                        } else if (u1()) {
                            return new byte[]{-12};
                        } else {
                            if (y1()) {
                                return new byte[]{-11};
                            }
                            if (v1()) {
                                return new byte[]{-10};
                            }
                            if (z1()) {
                                return new byte[]{-9};
                            }
                        }
                        break;
                    case 8:
                        boolean d10 = gVar.d();
                        long g10 = g();
                        return d10 ? l0(g10, b10 & 255) : k0(g10, b10 & 255);
                    case 9:
                        if (!x12 && !gVar.g()) {
                            return L0((byte[]) r1());
                        }
                        break;
                }
            }
            byte[] p02 = p0(s(), x12 ? b10 & 255 : -1);
            if (p02 != null) {
                return p02;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(16);
            try {
                f1(byteArrayOutputStream2, gVar);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException unused) {
                }
                return byteArray;
            } catch (Throwable th3) {
                th2 = th3;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                try {
                    throw th2;
                } catch (IOException e10) {
                    throw new h("I/O Error occurred", e10);
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public boolean K0(o oVar) {
        Objects.requireNonNull(oVar, "obj");
        if (s1() != q.Map) {
            if (s1() != q.Array) {
                throw new IllegalStateException("Not a map or array");
            }
            return p().remove(oVar);
        }
        Map<o, o> q10 = q();
        if (!q10.containsKey(oVar)) {
            return false;
        }
        q10.remove(oVar);
        return true;
    }

    public String M0() {
        return N0(w.f22006h);
    }

    public String N0(w wVar) {
        Objects.requireNonNull(wVar, "options");
        int i10 = a.f21988a[s1().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                long g10 = g();
                return t.m(g10) ? t.o(g10) : "null";
            } else if (i10 == 7 || i10 == 8) {
                return y1() ? "true" : u1() ? "false" : "null";
            } else {
                StringBuilder sb2 = new StringBuilder();
                try {
                    m.d(this, new b0(sb2), wVar);
                    return sb2.toString();
                } catch (IOException e10) {
                    throw new IllegalStateException("Internal error", e10);
                }
            }
        }
        return h().toString();
    }

    public o O0() {
        o oVar = this;
        while (oVar.f21984c == 6) {
            oVar = (o) oVar.f21985d;
        }
        return oVar;
    }

    public o P0() {
        return this.f21984c == 6 ? (o) this.f21985d : this;
    }

    public o Q0(int i10) {
        if (i10 >= 0) {
            return new o(this, i10, 0);
        }
        throw new IllegalArgumentException("smallTag(" + i10 + ") is less than 0");
    }

    public o R0(u7.f fVar) {
        int i10;
        Objects.requireNonNull(fVar, "bigintTag");
        if (fVar.I1() < 0) {
            throw new IllegalArgumentException("tagEInt's sign(" + fVar.I1() + ") is less than 0");
        } else if (fVar.B()) {
            return Q0(fVar.s1());
        } else {
            if (fVar.compareTo(f21975b4) > 0) {
                throw new IllegalArgumentException("tag more than 18446744073709551615 (" + fVar + ")");
            }
            byte[] r12 = fVar.r1(true);
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 < Math.min(4, r12.length)) {
                    i13 |= (r12[i12] & 255) << (i12 * 8);
                    i12++;
                }
            }
            for (i10 = 4; i10 < Math.min(8, r12.length); i10++) {
                i11 |= (r12[i10] & 255) << (i10 * 8);
            }
            return new o(this, i13, i11);
        }
    }

    public o a(Object obj) {
        if (s1() == q.Array) {
            p().add(Q(obj));
            return this;
        }
        throw new IllegalStateException("Not an array");
    }

    public o b(Object obj, Object obj2) {
        o oVar;
        o oVar2;
        if (s1() == q.Map) {
            o oVar3 = null;
            if (obj == null) {
                oVar = W3;
            } else {
                o oVar4 = obj instanceof o ? (o) obj : null;
                oVar = oVar4 == null ? Q(obj) : oVar4;
            }
            if (obj2 == null) {
                oVar2 = W3;
            } else {
                if (obj2 instanceof o) {
                    oVar3 = (o) obj2;
                }
                oVar2 = oVar3 == null ? Q(obj2) : oVar3;
            }
            Map<o, o> q10 = q();
            if (q10.containsKey(oVar)) {
                throw new IllegalArgumentException("Key already exists");
            }
            q10.put(oVar, oVar2);
            return this;
        }
        throw new IllegalStateException("Not a map");
    }

    public o d(o oVar) {
        if (s1() == q.Array) {
            p().add(oVar);
            return this;
        }
        throw new IllegalStateException("Not an array");
    }

    public boolean equals(Object obj) {
        return i1(obj instanceof o ? (o) obj : null);
    }

    public void f1(OutputStream outputStream, g gVar) {
        Objects.requireNonNull(outputStream, "stream");
        Objects.requireNonNull(gVar, "options");
        if (gVar.c()) {
            byte[] c10 = b.c(this);
            outputStream.write(c10, 0, c10.length);
            return;
        }
        e1(outputStream);
        switch (m1()) {
            case 0:
                S0(((Long) r1()).longValue(), outputStream);
                return;
            case 1:
                U0((u7.f) r1(), outputStream);
                return;
            case 2:
            case 9:
                byte[] bArr = (byte[]) r1();
                b1(s1() == q.ByteString ? 2 : 3, bArr.length, outputStream);
                outputStream.write(bArr, 0, bArr.length);
                return;
            case 3:
            case 10:
                T0((String) r1(), outputStream, gVar);
                return;
            case 4:
                Y0(p(), outputStream, gVar);
                return;
            case 5:
                a1(q(), outputStream, gVar);
                return;
            case 6:
            default:
                throw new IllegalArgumentException("Unexpected data type");
            case 7:
                int q12 = q1();
                if (q12 < 24) {
                    q12 += 224;
                } else {
                    outputStream.write(248);
                }
                outputStream.write((byte) q12);
                return;
            case 8:
                W0(outputStream, g(), 8, !gVar.d());
                return;
        }
    }

    public long g() {
        if (a.f21988a[s1().ordinal()] == 2) {
            return ((Long) r1()).longValue();
        }
        throw new IllegalStateException("Not a floating-point type");
    }

    public u7.f h() {
        int m12 = m1();
        if (m12 != 0) {
            if (m12 != 1) {
                throw new IllegalStateException("Not an integer type");
            }
            return (u7.f) r1();
        }
        return u7.f.Z(((Long) r1()).longValue());
    }

    /* renamed from: h1 */
    public int compareTo(o oVar) {
        int j10;
        if (oVar == null) {
            return 1;
        }
        if (this == oVar) {
            return 0;
        }
        int i10 = this.f21984c;
        int i11 = oVar.f21984c;
        Object obj = this.f21985d;
        Object obj2 = oVar.f21985d;
        if (i10 != i11) {
            if ((i11 == 0 && i10 == 1) || (i10 == 0 && i11 == 1)) {
                return t.b(I(), oVar.I());
            }
            if ((i11 == 3 || i11 == 10) && i10 == 9) {
                j10 = t.k((String) obj2, (byte[]) obj);
            } else if ((i10 == 3 || i10 == 10) && i11 == 9) {
                return t.k((String) obj, (byte[]) obj2);
            } else {
                if ((i10 == 3 && i11 == 10) || (i11 == 3 && i10 == 10)) {
                    j10 = t.j((String) obj2, (String) obj);
                } else if ((i10 == 3 || i10 == 10) && i11 == 9) {
                    return t.k((String) obj, (byte[]) obj2);
                } else {
                    if (i10 == 9 || i10 == 10) {
                        i10 = 3;
                    }
                    if (i11 == 9 || i11 == 10) {
                        i11 = 3;
                    }
                    if (i10 >= i11) {
                        return 1;
                    }
                }
            }
            return -j10;
        }
        switch (i10) {
            case 0:
                long longValue = ((Long) obj).longValue();
                long longValue2 = ((Long) obj2).longValue();
                int i12 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                if (i12 >= 0 && longValue2 >= 0) {
                    int i13 = (longValue > longValue2 ? 1 : (longValue == longValue2 ? 0 : -1));
                    if (i13 != 0) {
                        if (i13 >= 0) {
                            return 1;
                        }
                    }
                    return 0;
                } else if (i12 <= 0 && longValue2 <= 0) {
                    int i14 = (longValue > longValue2 ? 1 : (longValue == longValue2 ? 0 : -1));
                    if (i14 != 0) {
                        if (i14 < 0) {
                            return 1;
                        }
                    }
                    return 0;
                } else if (i12 < 0 && longValue2 >= 0) {
                    return 1;
                }
                break;
            case 1:
                return t.b(I(), oVar.I());
            case 2:
            case 9:
                return t.c((byte[]) obj, (byte[]) obj2);
            case 3:
                return t.j((String) obj, (String) obj2);
            case 4:
                return A0((ArrayList) obj, (ArrayList) obj2);
            case 5:
                return C0((Map) obj, (Map) obj2);
            case 6:
                int compareTo = p1().compareTo(oVar.p1());
                return compareTo == 0 ? ((o) obj).compareTo((o) obj2) : compareTo;
            case 7:
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                if (intValue != intValue2) {
                    if (intValue >= intValue2) {
                        return 1;
                    }
                }
                return 0;
            case 8:
                return t.b(k0(g(), 0), k0(oVar.g(), 0));
            case 10:
                String str = (String) obj;
                String str2 = (String) obj2;
                int length = str.length();
                int length2 = str2.length();
                if (length >= length2) {
                    if (length <= length2) {
                        return str.compareTo(str2);
                    }
                    return 1;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected data type");
        }
        return -1;
    }

    public int hashCode() {
        int i10;
        long j10;
        Object obj = this.f21985d;
        if (obj != null) {
            int i11 = this.f21984c;
            if (i11 != 0) {
                switch (i11) {
                    case 2:
                        i10 = t.e(j0());
                        break;
                    case 3:
                    case 10:
                        i10 = t.K((String) obj);
                        break;
                    case 4:
                        i10 = v(p());
                        break;
                    case 5:
                        i10 = x(q());
                        break;
                    case 6:
                        i10 = (obj.hashCode() * 651869483) + this.f21987x + this.f21986q;
                        break;
                    case 7:
                        i10 = ((Integer) obj).intValue();
                        break;
                    case 8:
                        j10 = g();
                        break;
                    case 9:
                        i10 = t.O((byte[]) obj);
                        break;
                    default:
                        i10 = obj.hashCode();
                        break;
                }
                return 651869431 + (i10 * 651869479);
            }
            j10 = ((Long) obj).longValue();
            i10 = (int) ((j10 >> 32) | j10);
            return 651869431 + (i10 * 651869479);
        }
        return 651869431;
    }

    public u7.f[] i0() {
        if (!x1()) {
            return f21976c4;
        }
        if (!x1()) {
            return new u7.f[]{B0(this.f21987x, this.f21986q)};
        }
        ArrayList arrayList = new ArrayList();
        for (o oVar = this; oVar.x1(); oVar = (o) oVar.f21985d) {
            arrayList.add(B0(oVar.f21987x, oVar.f21986q));
        }
        return (u7.f[]) arrayList.toArray(new u7.f[0]);
    }

    public boolean i1(o oVar) {
        byte[] bArr = null;
        Map map = null;
        List list = null;
        if (!(oVar instanceof o)) {
            oVar = null;
        }
        if (oVar == null) {
            return false;
        }
        if (this == oVar) {
            return true;
        }
        int i10 = this.f21984c;
        if ((i10 == 3 || i10 == 10) && oVar.f21984c == 9) {
            return t.J((String) this.f21985d, (byte[]) oVar.f21985d);
        }
        int i11 = oVar.f21984c;
        if ((i11 == 3 || i11 == 10) && i10 == 9) {
            return t.J((String) oVar.f21985d, (byte[]) this.f21985d);
        }
        if ((i11 == 3 && i10 == 10) || (i10 == 3 && i11 == 10)) {
            Object obj = this.f21985d;
            Object obj2 = oVar.f21985d;
            return obj == null ? obj2 == null : obj.equals(obj2);
        } else if (i10 != i11) {
            return false;
        } else {
            if (i10 != 2) {
                if (i10 == 4) {
                    List<o> p10 = p();
                    Object obj3 = oVar.f21985d;
                    if (obj3 instanceof List) {
                        list = (List) obj3;
                    }
                    return t(p10, list);
                } else if (i10 == 5) {
                    Object obj4 = oVar.f21985d;
                    if (obj4 instanceof Map) {
                        map = (Map) obj4;
                    }
                    return w(q(), map);
                } else if (i10 == 6) {
                    if (this.f21987x != oVar.f21987x || this.f21986q != oVar.f21986q) {
                        return false;
                    }
                    Object obj5 = this.f21985d;
                    Object obj6 = oVar.f21985d;
                    if (obj5 == null) {
                        if (obj6 != null) {
                            return false;
                        }
                    } else if (!obj5.equals(obj6)) {
                        return false;
                    }
                    return true;
                } else if (i10 == 8) {
                    return g() == oVar.g();
                } else if (i10 != 9) {
                    Object obj7 = this.f21985d;
                    Object obj8 = oVar.f21985d;
                    return obj7 == null ? obj8 == null : obj7.equals(obj8);
                }
            }
            byte[] bArr2 = (byte[]) this.f21985d;
            Object obj9 = oVar.f21985d;
            if (obj9 instanceof byte[]) {
                bArr = (byte[]) obj9;
            }
            return t.d(bArr2, bArr);
        }
    }

    public int j() {
        return l(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public byte[] j0() {
        if (m1() == 2) {
            return (byte[]) r1();
        }
        throw new IllegalStateException("Not a byte String");
    }

    public o j1(int i10) {
        if (s1() == q.Array) {
            List<o> p10 = p();
            if (i10 >= 0 && i10 < p10.size()) {
                return p10.get(i10);
            }
            throw new IllegalArgumentException("index");
        } else if (s1() != q.Map) {
            throw new IllegalStateException("Not an array or map");
        } else {
            Map<o, o> q10 = q();
            o O = O(i10);
            if (q10.containsKey(O)) {
                return q10.get(O);
            }
            return null;
        }
    }

    public o k1(o oVar) {
        Objects.requireNonNull(oVar, "key");
        if (s1() == q.Map) {
            Map<o, o> q10 = q();
            if (q10.containsKey(oVar)) {
                return q10.get(oVar);
            }
            return null;
        } else if (s1() != q.Array) {
            throw new IllegalStateException("Not an array or map");
        } else {
            if (!oVar.w1() || !oVar.r().x()) {
                throw new IllegalArgumentException("Not an integer");
            }
            if (!oVar.r().d()) {
                throw new IllegalArgumentException("key");
            }
            List<o> p10 = p();
            int F = oVar.r().F();
            if (F >= 0 && F < p10.size()) {
                return p10.get(F);
            }
            throw new IllegalArgumentException("key");
        }
    }

    public final Collection<Map.Entry<o, o>> l1() {
        if (s1() == q.Map) {
            return z.j(q());
        }
        throw new IllegalStateException("Not a map");
    }

    public int m() {
        int m12 = m1();
        if (m12 != 0) {
            if (m12 != 1) {
                throw new IllegalStateException("Not an integer type");
            }
            return ((u7.f) r1()).s1();
        }
        long longValue = ((Long) r1()).longValue();
        if (longValue >= -2147483648L && longValue <= 2147483647L) {
            return (int) longValue;
        }
        throw new ArithmeticException();
    }

    public final Collection<o> n1() {
        if (s1() == q.Map) {
            return q().keySet();
        }
        throw new IllegalStateException("Not a map");
    }

    public long o() {
        int m12 = m1();
        if (m12 != 0) {
            if (m12 != 1) {
                throw new IllegalStateException("Not an integer type");
            }
            return ((u7.f) r1()).u1();
        }
        return ((Long) r1()).longValue();
    }

    public final u7.f o1() {
        int i10;
        if (!x1()) {
            return u7.f.Y(-1);
        }
        o oVar = this;
        for (o oVar2 = (o) this.f21985d; oVar2.x1(); oVar2 = (o) oVar2.f21985d) {
            oVar = oVar2;
        }
        int i11 = oVar.f21986q;
        return (i11 != 0 || (i10 = oVar.f21987x) < 0 || i10 >= 65536) ? B0(oVar.f21987x, i11) : u7.f.Z(i10);
    }

    public final u7.f p1() {
        int i10;
        if (!x1()) {
            return u7.f.Y(-1);
        }
        int i11 = this.f21986q;
        return (i11 != 0 || (i10 = this.f21987x) < 0 || i10 >= 65536) ? B0(this.f21987x, i11) : u7.f.Y(i10);
    }

    public final int q1() {
        if (m1() == 7) {
            return ((Integer) r1()).intValue();
        }
        return -1;
    }

    public n r() {
        n j10 = n.j(this);
        if (j10 != null) {
            return j10;
        }
        throw new IllegalStateException("Not a number type");
    }

    public String s() {
        int m12 = m1();
        if (m12 != 3) {
            if (m12 == 9) {
                return v7.a.c((byte[]) r1(), false);
            }
            if (m12 != 10) {
                throw new IllegalStateException("Not a text String type");
            }
        }
        return (String) r1();
    }

    public final q s1() {
        switch (m1()) {
            case 0:
            case 1:
                return q.Integer;
            case 2:
                return q.ByteString;
            case 3:
            case 9:
            case 10:
                return q.TextString;
            case 4:
                return q.Array;
            case 5:
                return q.Map;
            case 6:
            default:
                throw new IllegalStateException("Unexpected data type");
            case 7:
                return (((Integer) r1()).intValue() == 21 || ((Integer) r1()).intValue() == 20) ? q.Boolean : q.SimpleValue;
            case 8:
                return q.FloatingPoint;
        }
    }

    public boolean t0(int i10) {
        if (i10 >= 0) {
            return x1() && u0(u7.f.Y(i10));
        }
        throw new IllegalArgumentException("tagValue(" + i10 + ") is less than 0");
    }

    public final Collection<o> t1() {
        if (s1() == q.Map) {
            return q().values();
        }
        if (s1() != q.Array) {
            throw new IllegalStateException("Not a map or array");
        }
        return Collections.unmodifiableList(p());
    }

    public String toString() {
        return c.a(this, 0);
    }

    public boolean u0(u7.f fVar) {
        Objects.requireNonNull(fVar, "bigTagValue");
        if (fVar.I1() >= 0) {
            if (x1()) {
                return o1().equals(fVar);
            }
            return false;
        }
        throw new IllegalArgumentException("bigTagValue(" + fVar + ") is less than 0");
    }

    public final boolean u1() {
        return m1() == 7 && ((Integer) r1()).intValue() == 20;
    }

    public boolean v0(int i10) {
        if (i10 >= 0) {
            return x1() && this.f21986q == 0 && this.f21987x == i10;
        }
        throw new IllegalArgumentException("tagValue(" + i10 + ") is less than 0");
    }

    public final boolean v1() {
        return m1() == 7 && ((Integer) r1()).intValue() == 22;
    }

    public boolean w0() {
        return x1() && !((o) this.f21985d).x1();
    }

    public final boolean w1() {
        return n.A(this);
    }

    public boolean x0(int i10) {
        return w0() && v0(i10);
    }

    public final boolean x1() {
        return this.f21984c == 6;
    }

    public boolean y() {
        int m12 = m1();
        if (m12 == 0) {
            long longValue = ((Long) r1()).longValue();
            return longValue >= -2147483648L && longValue <= 2147483647L;
        } else if (m12 == 1) {
            return ((u7.f) r1()).B();
        } else {
            return false;
        }
    }

    public boolean y0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("tagValue(" + i10 + ") is less than 0");
        }
        for (o oVar = this; oVar.x1(); oVar = (o) oVar.f21985d) {
            if (oVar.f21986q == 0 && i10 == oVar.f21987x) {
                return true;
            }
        }
        return false;
    }

    public final boolean y1() {
        return m1() == 7 && ((Integer) r1()).intValue() == 21;
    }

    public boolean z() {
        int m12 = m1();
        if (m12 != 0) {
            if (m12 == 1) {
                return ((u7.f) r1()).C();
            }
            return false;
        }
        return true;
    }

    public final boolean z1() {
        return m1() == 7 && ((Integer) r1()).intValue() == 23;
    }
}
