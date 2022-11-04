package gh;

import ak.q;
import gg.a0;
import gg.g;
import gg.g0;
import gg.n0;
import gg.v;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
/* loaded from: classes3.dex */
public class d {
    public static void a(StringBuffer stringBuffer, fh.b bVar, Hashtable hashtable) {
        if (!bVar.q()) {
            if (bVar.m() == null) {
                return;
            }
            b(stringBuffer, bVar.m(), hashtable);
            return;
        }
        fh.a[] o10 = bVar.o();
        boolean z10 = true;
        for (int i10 = 0; i10 != o10.length; i10++) {
            if (z10) {
                z10 = false;
            } else {
                stringBuffer.append('+');
            }
            b(stringBuffer, o10[i10], hashtable);
        }
    }

    public static void b(StringBuffer stringBuffer, fh.a aVar, Hashtable hashtable) {
        String str = (String) hashtable.get(aVar.m());
        if (str == null) {
            str = aVar.m().H();
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(q(aVar.n()));
    }

    private static boolean c(fh.a aVar, fh.a aVar2) {
        if (aVar == aVar2) {
            return true;
        }
        return aVar != null && aVar2 != null && aVar.m().s(aVar2.m()) && d(aVar.n()).equals(d(aVar2.n()));
    }

    public static String d(g gVar) {
        return e(q(gVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
        if (r5 >= r0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(java.lang.String r7) {
        /*
            int r0 = r7.length()
            r1 = 0
            if (r0 <= 0) goto L1d
            char r0 = r7.charAt(r1)
            r2 = 35
            if (r0 != r2) goto L1d
            gg.a0 r0 = h(r7)
            boolean r2 = r0 instanceof gg.g0
            if (r2 == 0) goto L1d
            gg.g0 r0 = (gg.g0) r0
            java.lang.String r7 = r0.c()
        L1d:
            java.lang.String r7 = ak.q.g(r7)
            int r0 = r7.length()
            r2 = 2
            if (r0 >= r2) goto L29
            return r7
        L29:
            int r0 = r0 + (-1)
        L2b:
            r2 = 32
            r3 = 92
            if (r1 >= r0) goto L42
            char r4 = r7.charAt(r1)
            if (r4 != r3) goto L42
            int r4 = r1 + 1
            char r4 = r7.charAt(r4)
            if (r4 != r2) goto L42
            int r1 = r1 + 2
            goto L2b
        L42:
            int r4 = r1 + 1
            r5 = r0
        L45:
            if (r5 <= r4) goto L58
            int r6 = r5 + (-1)
            char r6 = r7.charAt(r6)
            if (r6 != r3) goto L58
            char r6 = r7.charAt(r5)
            if (r6 != r2) goto L58
            int r5 = r5 + (-2)
            goto L45
        L58:
            if (r1 > 0) goto L5c
            if (r5 >= r0) goto L62
        L5c:
            int r5 = r5 + 1
            java.lang.String r7 = r7.substring(r1, r5)
        L62:
            java.lang.String r7 = l(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.d.e(java.lang.String):java.lang.String");
    }

    private static int f(char c10) {
        if ('0' > c10 || c10 > '9') {
            return (('a' > c10 || c10 > 'f') ? c10 - 'A' : c10 - 'a') + 10;
        }
        return c10 - '0';
    }

    public static v g(String str, Hashtable hashtable) {
        if (q.k(str).startsWith("OID.")) {
            return new v(str.substring(4));
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return new v(str);
        }
        v vVar = (v) hashtable.get(q.g(str));
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalArgumentException("Unknown object id - " + str + " - passed to distinguished name");
    }

    private static a0 h(String str) {
        try {
            return a0.u(bk.f.c(str, 1, str.length() - 1));
        } catch (IOException e10) {
            throw new IllegalStateException("unknown encoding in name: " + e10);
        }
    }

    private static boolean i(char c10) {
        return ('0' <= c10 && c10 <= '9') || ('a' <= c10 && c10 <= 'f') || ('A' <= c10 && c10 <= 'F');
    }

    public static boolean j(fh.b bVar, fh.b bVar2) {
        if (bVar.size() != bVar2.size()) {
            return false;
        }
        fh.a[] o10 = bVar.o();
        fh.a[] o11 = bVar2.o();
        if (o10.length != o11.length) {
            return false;
        }
        for (int i10 = 0; i10 != o10.length; i10++) {
            if (!c(o10[i10], o11[i10])) {
                return false;
            }
        }
        return true;
    }

    public static fh.b[] k(String str, fh.e eVar) {
        f fVar = new f(str);
        fh.d dVar = new fh.d(eVar);
        while (fVar.a()) {
            String b10 = fVar.b();
            if (b10.indexOf(43) > 0) {
                f fVar2 = new f(b10, '+');
                f fVar3 = new f(fVar2.b(), '=');
                String b11 = fVar3.b();
                if (!fVar3.a()) {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
                String b12 = fVar3.b();
                v d10 = eVar.d(b11.trim());
                if (fVar2.a()) {
                    Vector vector = new Vector();
                    Vector vector2 = new Vector();
                    while (true) {
                        vector.addElement(d10);
                        vector2.addElement(o(b12));
                        if (!fVar2.a()) {
                            dVar.c(m(vector), n(vector2));
                            break;
                        }
                        f fVar4 = new f(fVar2.b(), '=');
                        String b13 = fVar4.b();
                        if (!fVar4.a()) {
                            throw new IllegalArgumentException("badly formatted directory string");
                        }
                        b12 = fVar4.b();
                        d10 = eVar.d(b13.trim());
                    }
                } else {
                    dVar.e(d10, o(b12));
                }
            } else {
                f fVar5 = new f(b10, '=');
                String b14 = fVar5.b();
                if (!fVar5.a()) {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
                dVar.e(eVar.d(b14.trim()), o(fVar5.b()));
            }
        }
        return dVar.f().o();
    }

    public static String l(String str) {
        if (str.indexOf("  ") < 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char charAt = str.charAt(0);
        stringBuffer.append(charAt);
        for (int i10 = 1; i10 < str.length(); i10++) {
            char charAt2 = str.charAt(i10);
            if (charAt != ' ' || charAt2 != ' ') {
                stringBuffer.append(charAt2);
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    private static v[] m(Vector vector) {
        int size = vector.size();
        v[] vVarArr = new v[size];
        for (int i10 = 0; i10 != size; i10++) {
            vVarArr[i10] = (v) vector.elementAt(i10);
        }
        return vVarArr;
    }

    private static String[] n(Vector vector) {
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 != size; i10++) {
            strArr[i10] = (String) vector.elementAt(i10);
        }
        return strArr;
    }

    private static String o(String str) {
        int i10;
        if (str.length() == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (charArray[0] == '\\' && charArray[1] == '#') {
            i10 = 2;
            stringBuffer.append("\\#");
        } else {
            i10 = 0;
        }
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        char c10 = 0;
        while (i10 != charArray.length) {
            char c11 = charArray[i10];
            if (c11 != ' ') {
                z12 = true;
            }
            if (c11 != '\"') {
                if (c11 == '\\' && !z10 && !z11) {
                    i11 = stringBuffer.length();
                    z10 = true;
                } else if (c11 != ' ' || z10 || z12) {
                    if (z10 && i(c11)) {
                        if (c10 != 0) {
                            stringBuffer.append((char) ((f(c10) * 16) + f(c11)));
                            z10 = false;
                            c10 = 0;
                        } else {
                            c10 = c11;
                        }
                    }
                }
                i10++;
            } else if (!z10) {
                z11 = !z11;
                z10 = false;
                i10++;
            }
            stringBuffer.append(c11);
            z10 = false;
            i10++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i11 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public static g p(String str, int i10) {
        int length = (str.length() - i10) / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 != length; i11++) {
            int i12 = (i11 * 2) + i10;
            char charAt = str.charAt(i12);
            bArr[i11] = (byte) (f(str.charAt(i12 + 1)) | (f(charAt) << 4));
        }
        return a0.u(bArr);
    }

    public static String q(g gVar) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!(gVar instanceof g0) || (gVar instanceof n0)) {
            try {
                stringBuffer.append('#');
                stringBuffer.append(bk.f.f(gVar.b().k("DER")));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String c10 = ((g0) gVar).c();
            if (c10.length() > 0 && c10.charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(c10);
        }
        int length = stringBuffer.length();
        int i10 = 2;
        if (stringBuffer.length() < 2 || stringBuffer.charAt(0) != '\\' || stringBuffer.charAt(1) != '#') {
            i10 = 0;
        }
        while (i10 != length) {
            char charAt = stringBuffer.charAt(i10);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i10++;
                        continue;
                }
            }
            stringBuffer.insert(i10, "\\");
            i10 += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            for (int i11 = 0; stringBuffer.length() > i11 && stringBuffer.charAt(i11) == ' '; i11 += 2) {
                stringBuffer.insert(i11, "\\");
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= 0 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, '\\');
        }
        return stringBuffer.toString();
    }
}
