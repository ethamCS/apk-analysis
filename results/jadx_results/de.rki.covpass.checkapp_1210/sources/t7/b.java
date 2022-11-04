package t7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    static final Comparator<o> f21931a = new c(null);

    /* renamed from: b */
    private static final Comparator<Map.Entry<byte[], byte[]>> f21932b = new C0374b(null);

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21933a;

        static {
            int[] iArr = new int[q.values().length];
            f21933a = iArr;
            try {
                iArr[q.Integer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21933a[q.SimpleValue.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21933a[q.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21933a[q.FloatingPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21933a[q.ByteString.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21933a[q.TextString.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21933a[q.Array.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21933a[q.Map.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: t7.b$b */
    /* loaded from: classes.dex */
    private static final class C0374b implements Comparator<Map.Entry<byte[], byte[]>> {
        private C0374b() {
        }

        /* synthetic */ C0374b(a aVar) {
            this();
        }

        /* renamed from: a */
        public int compare(Map.Entry<byte[], byte[]> entry, Map.Entry<byte[], byte[]> entry2) {
            byte[] key = entry.getKey();
            byte[] key2 = entry2.getKey();
            if (key == null) {
                return key2 == null ? 0 : -1;
            } else if (key2 == null) {
                return 1;
            } else {
                if (key.length == 0) {
                    return key2.length == 0 ? 0 : -1;
                } else if (key2.length == 0) {
                    return 1;
                } else {
                    if (key == key2) {
                        return 0;
                    }
                    if ((key[0] & 224) != (key2[0] & 224)) {
                        return (key[0] & 224) < (key2[0] & 224) ? -1 : 1;
                    } else if (key.length != key2.length) {
                        return key.length < key2.length ? -1 : 1;
                    } else {
                        for (int i10 = 0; i10 < key.length; i10++) {
                            if (key[i10] != key2[i10]) {
                                return (key[i10] & 255) < (key2[i10] & 255) ? -1 : 1;
                            }
                        }
                        return 0;
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements Comparator<o> {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        private static int a(o oVar) {
            if (oVar.x1()) {
                return 6;
            }
            switch (a.f21933a[oVar.s1().ordinal()]) {
                case 1:
                    return oVar.r().z() ? 1 : 0;
                case 2:
                case 3:
                case 4:
                    return 7;
                case 5:
                    return 2;
                case 6:
                    return 3;
                case 7:
                    return 4;
                case 8:
                    return 5;
                default:
                    throw new IllegalStateException();
            }
        }

        /* renamed from: b */
        public int compare(o oVar, o oVar2) {
            byte[] bArr;
            byte[] bArr2;
            if (oVar == null) {
                return oVar2 == null ? 0 : -1;
            } else if (oVar2 == null) {
                return 1;
            } else {
                if (oVar == oVar2) {
                    return 0;
                }
                o O0 = oVar.O0();
                o O02 = oVar2.O0();
                int a10 = a(O0);
                int a11 = a(O02);
                if (a10 != a11) {
                    return a10 < a11 ? -1 : 1;
                }
                if (a10 == 2) {
                    bArr2 = O0.j0();
                    bArr = O02.j0();
                } else {
                    bArr2 = b.c(O0);
                    bArr = b.c(O02);
                }
                if (bArr2.length != bArr.length) {
                    return bArr2.length < bArr.length ? -1 : 1;
                }
                for (int i10 = 0; i10 < bArr2.length; i10++) {
                    if (bArr2[i10] != bArr[i10]) {
                        return (bArr2[i10] & 255) < (bArr[i10] & 255) ? -1 : 1;
                    }
                }
                return 0;
            }
        }
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private static void b(o oVar, int i10) {
        if (oVar.s1() == q.Array) {
            for (int i11 = 0; i11 < oVar.D1(); i11++) {
                if (i10 >= 3 && e(oVar.j1(i11))) {
                    throw new h("Nesting level too deep");
                }
                b(oVar.j1(i11), i10 + 1);
            }
        } else if (oVar.s1() == q.Map) {
            for (o oVar2 : oVar.n1()) {
                if (i10 >= 3 && (e(oVar2) || e(oVar.k1(oVar2)))) {
                    throw new h("Nesting level too deep");
                }
                int i12 = i10 + 1;
                b(oVar2, i12);
                b(oVar.k1(oVar2), i12);
            }
        }
    }

    public static byte[] c(o oVar) {
        return d(oVar, 0);
    }

    private static byte[] d(o oVar, int i10) {
        Throwable th2;
        Throwable th3;
        o O0 = oVar.O0();
        q s12 = O0.s1();
        try {
            ByteArrayOutputStream byteArrayOutputStream = null;
            byte[] bArr = null;
            ByteArrayOutputStream byteArrayOutputStream2 = null;
            if (s12 == q.Array) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        o.g1(byteArrayOutputStream3, 4, O0.D1());
                        for (int i11 = 0; i11 < O0.D1(); i11++) {
                            if (i10 >= 3 && e(O0.j1(i11))) {
                                throw new h("Nesting level too deep");
                            }
                            byte[] d10 = d(O0.j1(i11), i10 + 1);
                            byteArrayOutputStream3.write(d10, 0, d10.length);
                        }
                        byte[] byteArray = byteArrayOutputStream3.toByteArray();
                        try {
                            byteArrayOutputStream3.close();
                        } catch (IOException unused) {
                        }
                        return byteArray;
                    } catch (Throwable th4) {
                        th2 = th4;
                        byteArrayOutputStream = byteArrayOutputStream3;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                }
            } else if (s12 != q.Map) {
                if (s12 != q.SimpleValue && s12 != q.Boolean && s12 != q.ByteString && s12 != q.TextString) {
                    if (s12 == q.FloatingPoint) {
                        long g10 = O0.g();
                        return new byte[]{-5, (byte) ((g10 >> 56) & 255), (byte) ((g10 >> 48) & 255), (byte) ((g10 >> 40) & 255), (byte) ((g10 >> 32) & 255), (byte) ((g10 >> 24) & 255), (byte) ((g10 >> 16) & 255), (byte) ((g10 >> 8) & 255), (byte) (g10 & 255)};
                    } else if (s12 != q.Integer) {
                        throw new IllegalArgumentException("Invalid CBOR type.");
                    }
                }
                return O0.J(g.f21955h);
            } else {
                ArrayList arrayList = new ArrayList();
                for (o oVar2 : O0.n1()) {
                    if (i10 >= 3 && (e(oVar2) || e(O0.k1(oVar2)))) {
                        throw new h("Nesting level too deep");
                    }
                    int i12 = i10 + 1;
                    b(oVar2, i12);
                    b(O0.k1(oVar2), i12);
                    arrayList.add(new AbstractMap.SimpleImmutableEntry(d(oVar2, i12), d(O0.k1(oVar2), i12)));
                }
                Collections.sort(arrayList, f21932b);
                try {
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        o.g1(byteArrayOutputStream4, 5, O0.D1());
                        int i13 = 0;
                        while (i13 < arrayList.size()) {
                            Map.Entry entry = (Map.Entry) arrayList.get(i13);
                            byte[] bArr2 = (byte[]) entry.getKey();
                            if (bArr != null && a(bArr2, bArr)) {
                                throw new h("duplicate canonical CBOR key");
                            }
                            byteArrayOutputStream4.write(bArr2, 0, bArr2.length);
                            byte[] bArr3 = (byte[]) entry.getValue();
                            byteArrayOutputStream4.write(bArr3, 0, bArr3.length);
                            i13++;
                            bArr = bArr2;
                        }
                        byte[] byteArray2 = byteArrayOutputStream4.toByteArray();
                        try {
                            byteArrayOutputStream4.close();
                        } catch (IOException unused3) {
                        }
                        return byteArray2;
                    } catch (Throwable th6) {
                        th3 = th6;
                        byteArrayOutputStream2 = byteArrayOutputStream4;
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th3;
                    }
                } catch (Throwable th7) {
                    th3 = th7;
                }
            }
        } catch (IOException e10) {
            throw new IllegalStateException(e10.toString(), e10);
        }
    }

    private static boolean e(o oVar) {
        return oVar.s1() == q.Array || oVar.s1() == q.Map;
    }
}
