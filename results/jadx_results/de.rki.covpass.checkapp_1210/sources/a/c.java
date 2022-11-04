package a;

import j$.util.Collection$EL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    public static final byte[] f2a = {6, 8, 42, -122, 72, -50, 61, 3, 1, 7};

    /* renamed from: b */
    public static final byte[] f3b = {6, 5, 43, -127, 4, 0, 34};

    /* renamed from: c */
    public static final byte[] f4c = {6, 5, 43, -127, 4, 0, 35};

    /* renamed from: d */
    public static final byte[] f5d = {6, 7, 42, -122, 72, -50, 61, 2, 1};

    /* renamed from: e */
    public static final byte[] f6e = {6, 3, 43, 101, 110};

    /* renamed from: f */
    public static final byte[] f7f = {6, 3, 43, 101, 111};

    /* renamed from: g */
    public static final byte[] f8g = {6, 3, 43, 101, 112};

    /* renamed from: h */
    public static final byte[] f9h = {6, 3, 43, 101, 113};

    /* renamed from: i */
    public static final byte[] f10i = {6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1};

    /* renamed from: j */
    private static final byte[] f11j = {48};

    /* renamed from: k */
    private static final byte[] f12k = {4};

    /* renamed from: l */
    private static final byte[] f13l = {3};

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f14a;

        /* renamed from: b */
        public byte[] f15b;

        /* renamed from: c */
        public ArrayList<a> f16c;

        public a(int i10, ArrayList<a> arrayList) {
            this.f14a = i10;
            this.f16c = arrayList;
        }

        public a(int i10, byte[] bArr) {
            this.f14a = i10;
            this.f15b = bArr;
        }

        private static String a(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder(bArr.length * 2);
            int length = bArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                sb2.append(String.format("%02x", Integer.valueOf(bArr[i10] & 255)));
            }
            return sb2.toString();
        }

        private static String b(int i10) {
            return i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? i10 != 48 ? Integer.toString(i10) : "SEQUENCE" : "OBJECTIDENTIFIER" : "NULL" : "OCTETSTRING" : "BITSTRING" : "INTEGER";
        }

        public String toString() {
            StringBuilder sb2;
            String b10 = b(this.f14a);
            if (this.f16c != null) {
                sb2 = new StringBuilder();
                sb2.append("TagValue{tag=");
                sb2.append(b10);
                sb2.append(", size = ");
                sb2.append(this.f16c.size());
                sb2.append("}");
            } else {
                sb2 = new StringBuilder();
                sb2.append("TagValue{tag=");
                sb2.append(b10);
                sb2.append(", value=");
                sb2.append(a(this.f15b));
                sb2.append('}');
            }
            return sb2.toString();
        }
    }

    private static byte[] b(int i10) {
        if (i10 <= 127) {
            return new byte[]{(byte) i10};
        }
        if (i10 >= 256) {
            throw new f("Error in ASN1.GetLength");
        }
        return new byte[]{-127, (byte) i10};
    }

    public static a c(int i10, byte[] bArr) {
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        byte b10 = bArr[i10];
        if ((bArr[i10] & 32) == 32) {
            int[] d10 = d(i10 + 1, bArr);
            int i13 = d10[1];
            if (i10 + i13 > bArr.length) {
                throw new f("Invalid sequence");
            }
            int i14 = i10 + d10[0] + 1;
            while (i13 > 0) {
                byte b11 = bArr[i14];
                int i15 = i14 + 1;
                int[] d11 = d(i15, bArr);
                if (d11[1] > i13) {
                    throw new f("Invalid sequence");
                }
                if ((b11 & 32) != 0) {
                    arrayList.add(c(i14, bArr));
                    i14 += d11[0] + 1 + d11[1];
                    i11 = d11[0] + 1;
                    i12 = d11[1];
                } else {
                    if (b11 == 6) {
                        arrayList.add(new a(b11, Arrays.copyOfRange(bArr, i14, d11[1] + i14 + d11[0] + 1)));
                    } else {
                        arrayList.add(new a(b11, Arrays.copyOfRange(bArr, d11[0] + i14 + 1, i15 + d11[0] + d11[1])));
                    }
                    i14 += d11[0] + 1 + d11[1];
                    i11 = d11[0] + 1;
                    i12 = d11[1];
                }
                i13 -= i11 + i12;
            }
            return new a(b10, arrayList);
        }
        throw new f("Invalid structure");
    }

    private static int[] d(int i10, byte[] bArr) {
        if ((bArr[i10] & 128) == 0) {
            return new int[]{1, bArr[i10]};
        }
        if (bArr[i10] == 128) {
            throw new f("Indefinite length encoding not supported");
        }
        int i11 = bArr[i10] & Byte.MAX_VALUE;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * PSKKeyManager.MAX_KEY_LENGTH_BYTES) + (bArr[i13 + i10 + 1] & 255);
        }
        return new int[]{i11 + 1, i12};
    }

    public static ArrayList<a> e(ArrayList<a> arrayList) {
        a c10 = c(0, arrayList.get(2).f15b);
        ArrayList<a> arrayList2 = c10.f16c;
        if (c10.f14a == 48) {
            if (arrayList2.size() < 2 || arrayList2.size() > 4) {
                throw new f("Invalid ECPrivateKey");
            }
            if (arrayList2.get(0).f14a != 2 && arrayList.get(0).f15b[0] != 1) {
                throw new f("Invalid ECPrivateKey");
            }
            if (arrayList2.get(1).f14a != 4) {
                throw new f("Invalid ECPrivateKey");
            }
            if (arrayList2.size() > 2) {
                if ((arrayList2.get(2).f14a & 255) != 160) {
                    if (arrayList2.size() != 3 || (arrayList2.get(2).f14a & 255) != 161) {
                        throw new f("Invalid ECPrivateKey");
                    }
                } else if (arrayList2.size() == 4 && (arrayList2.get(3).f14a & 255) != 161) {
                    throw new f("Invalid ECPrivateKey");
                }
            }
            return arrayList2;
        }
        throw new f("Invalid ECPrivateKey");
    }

    public static ArrayList<a> f(ArrayList<a> arrayList) {
        a c10 = c(0, arrayList.get(2).f15b);
        ArrayList<a> arrayList2 = c10.f16c;
        if (c10.f14a == 48) {
            if (arrayList2.size() < 8 || arrayList2.size() > 11) {
                throw new f("Invalid RSAPrivateKey");
            }
            if (arrayList2.get(0).f14a != 2 && arrayList.get(0).f15b[0] != 1) {
                throw new f("Invalid RSAPrivateKey");
            }
            Iterator<a> it = c10.f16c.iterator();
            while (it.hasNext()) {
                if (it.next().f14a != 2) {
                    throw new f("Invalid RSAPrivateKey");
                }
            }
            return arrayList2;
        }
        throw new f("Invalid RSAPrivateKey");
    }

    public static ArrayList<a> g(byte[] bArr) {
        a c10 = c(0, bArr);
        if (c10.f14a == 48) {
            ArrayList<a> arrayList = c10.f16c;
            if (arrayList.size() != 3 && arrayList.size() != 4) {
                throw new f("Invalid PKCS8 structure");
            }
            if (arrayList.get(0).f14a != 2 && arrayList.get(0).f15b[0] != 0) {
                throw new f("Invalid PKCS8 structure");
            }
            if (arrayList.get(1).f14a != 48) {
                throw new f("Invalid PKCS8 structure");
            }
            if (arrayList.get(1).f16c.isEmpty() || arrayList.get(1).f16c.size() > 2) {
                throw new f("Invalid PKCS8 structure");
            }
            if (arrayList.get(1).f16c.get(0).f14a != 6) {
                throw new f("Invalid PKCS8 structure");
            }
            if (arrayList.get(2).f14a != 4) {
                throw new f("Invalid PKCS8 structure");
            }
            if (arrayList.size() == 4 && arrayList.get(3).f14a != 160) {
                throw new f("Invalid PKCS8 structure");
            }
            return arrayList;
        }
        throw new f("Invalid PKCS8 structure");
    }

    public static ArrayList<a> h(byte[] bArr) {
        a c10 = c(0, bArr);
        if (c10.f14a == 48) {
            ArrayList<a> arrayList = c10.f16c;
            if (arrayList.size() != 2) {
                throw new f("Invalid SPKI");
            }
            if (arrayList.get(0).f14a != 48) {
                throw new f("Invalid SPKI");
            }
            if (arrayList.get(0).f16c.isEmpty() || arrayList.get(0).f16c.size() > 2) {
                throw new f("Invalid SPKI");
            }
            if (arrayList.get(0).f16c.get(0).f14a != 6) {
                throw new f("Invalid SPKI");
            }
            if (arrayList.get(1).f14a != 3) {
                throw new f("Invalid SPKI");
            }
            return arrayList;
        }
        throw new f("Invalid SPKI");
    }

    public static byte[] i(byte[] bArr, byte[] bArr2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(l(bArr));
        arrayList.add(l(bArr2));
        return j(arrayList);
    }

    private static byte[] j(ArrayList<byte[]> arrayList) {
        byte[] k10 = k(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(f11j);
        arrayList2.add(b(k10.length));
        arrayList2.add(k10);
        return k(arrayList2);
    }

    private static byte[] k(ArrayList<byte[]> arrayList) {
        byte[] bArr = new byte[((Integer) Collection$EL.stream(arrayList).map(b.f1a).reduce(0, a.a.f0a)).intValue()];
        Iterator<byte[]> it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            byte[] next = it.next();
            System.arraycopy(next, 0, bArr, i10, next.length);
            i10 += next.length;
        }
        return bArr;
    }

    private static byte[] l(byte[] bArr) {
        int i10 = 0;
        while (i10 < bArr.length && bArr[i10] == 0) {
            i10++;
        }
        if (i10 == bArr.length) {
            return new byte[]{2, 1, 0};
        }
        int i11 = (bArr[i10] & 128) != 0 ? 1 : 0;
        int length = bArr.length - i10;
        byte[] bArr2 = new byte[length + 2 + i11];
        bArr2[0] = 2;
        bArr2[1] = (byte) (length + i11);
        System.arraycopy(bArr, i10, bArr2, i11 + 2, length);
        return bArr2;
    }

    public static /* synthetic */ Integer m(byte[] bArr) {
        return Integer.valueOf(bArr.length);
    }
}
