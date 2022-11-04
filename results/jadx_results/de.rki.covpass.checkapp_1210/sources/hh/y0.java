package hh;

import gg.x1;
import gg.y1;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
/* loaded from: classes3.dex */
public class y0 extends gg.t {
    public static final gg.v A4;
    public static final gg.v B4;
    public static final gg.v C4;
    public static final gg.v D4;
    public static final Hashtable F4;
    public static final Hashtable G4;
    public static final Hashtable H4;
    public static final Hashtable I4;
    public static final Hashtable J4;
    public static final Hashtable K4;
    public static final gg.v V3;
    public static final gg.v W3;
    public static final gg.v X3;
    public static final gg.v Y3;
    public static final gg.v Z3;

    /* renamed from: a4 */
    public static final gg.v f12140a4;

    /* renamed from: b4 */
    public static final gg.v f12141b4;

    /* renamed from: c4 */
    public static final gg.v f12142c4;

    /* renamed from: d4 */
    public static final gg.v f12143d4;

    /* renamed from: e4 */
    public static final gg.v f12144e4;

    /* renamed from: f4 */
    public static final gg.v f12145f4;

    /* renamed from: g4 */
    public static final gg.v f12146g4;

    /* renamed from: h4 */
    public static final gg.v f12147h4;

    /* renamed from: i4 */
    public static final gg.v f12148i4;

    /* renamed from: j4 */
    public static final gg.v f12149j4;

    /* renamed from: k4 */
    public static final gg.v f12150k4;

    /* renamed from: l4 */
    public static final gg.v f12151l4;

    /* renamed from: m4 */
    public static final gg.v f12152m4;

    /* renamed from: n4 */
    public static final gg.v f12153n4;

    /* renamed from: o4 */
    public static final gg.v f12154o4;

    /* renamed from: p4 */
    public static final gg.v f12155p4;

    /* renamed from: q4 */
    public static final gg.v f12156q4;

    /* renamed from: r4 */
    public static final gg.v f12157r4;

    /* renamed from: s4 */
    public static final gg.v f12158s4;

    /* renamed from: t4 */
    public static final gg.v f12159t4;

    /* renamed from: u4 */
    public static final gg.v f12160u4;

    /* renamed from: w4 */
    public static final gg.v f12162w4;

    /* renamed from: x4 */
    public static final gg.v f12163x4;

    /* renamed from: y4 */
    public static final gg.v f12164y4;

    /* renamed from: z4 */
    public static final gg.v f12165z4;
    private int U3;

    /* renamed from: c */
    private Vector f12166c = new Vector();

    /* renamed from: d */
    private Vector f12167d = new Vector();

    /* renamed from: q */
    private Vector f12168q = new Vector();

    /* renamed from: x */
    private gg.d0 f12169x;

    /* renamed from: y */
    private boolean f12170y;

    /* renamed from: v4 */
    public static final gg.v f12161v4 = new gg.v("2.5.4.54");
    public static boolean E4 = false;
    private static final Boolean L4 = new Boolean(true);
    private static final Boolean M4 = new Boolean(false);

    static {
        gg.v vVar = new gg.v("2.5.4.6");
        V3 = vVar;
        gg.v vVar2 = new gg.v("2.5.4.10");
        W3 = vVar2;
        gg.v vVar3 = new gg.v("2.5.4.11");
        X3 = vVar3;
        gg.v vVar4 = new gg.v("2.5.4.12");
        Y3 = vVar4;
        gg.v vVar5 = new gg.v("2.5.4.3");
        Z3 = vVar5;
        gg.v vVar6 = new gg.v("2.5.4.5");
        f12140a4 = vVar6;
        gg.v vVar7 = new gg.v("2.5.4.9");
        f12141b4 = vVar7;
        f12142c4 = vVar6;
        gg.v vVar8 = new gg.v("2.5.4.7");
        f12143d4 = vVar8;
        gg.v vVar9 = new gg.v("2.5.4.8");
        f12144e4 = vVar9;
        gg.v vVar10 = new gg.v("2.5.4.4");
        f12145f4 = vVar10;
        gg.v vVar11 = new gg.v("2.5.4.42");
        f12146g4 = vVar11;
        gg.v vVar12 = new gg.v("2.5.4.43");
        f12147h4 = vVar12;
        gg.v vVar13 = new gg.v("2.5.4.44");
        f12148i4 = vVar13;
        gg.v vVar14 = new gg.v("2.5.4.45");
        f12149j4 = vVar14;
        gg.v vVar15 = new gg.v("2.5.4.15");
        f12150k4 = vVar15;
        gg.v vVar16 = new gg.v("2.5.4.17");
        f12151l4 = vVar16;
        gg.v vVar17 = new gg.v("2.5.4.46");
        f12152m4 = vVar17;
        gg.v vVar18 = new gg.v("2.5.4.65");
        f12153n4 = vVar18;
        gg.v vVar19 = new gg.v("1.3.6.1.5.5.7.9.1");
        f12154o4 = vVar19;
        gg.v vVar20 = new gg.v("1.3.6.1.5.5.7.9.2");
        f12155p4 = vVar20;
        gg.v vVar21 = new gg.v("1.3.6.1.5.5.7.9.3");
        f12156q4 = vVar21;
        gg.v vVar22 = new gg.v("1.3.6.1.5.5.7.9.4");
        f12157r4 = vVar22;
        gg.v vVar23 = new gg.v("1.3.6.1.5.5.7.9.5");
        f12158s4 = vVar23;
        gg.v vVar24 = new gg.v("1.3.36.8.3.14");
        f12159t4 = vVar24;
        gg.v vVar25 = new gg.v("2.5.4.16");
        f12160u4 = vVar25;
        gg.v vVar26 = z0.f12181k;
        f12162w4 = vVar26;
        gg.v vVar27 = z0.f12182l;
        f12163x4 = vVar27;
        gg.v vVar28 = zg.q.X1;
        f12164y4 = vVar28;
        gg.v vVar29 = zg.q.Y1;
        f12165z4 = vVar29;
        gg.v vVar30 = zg.q.f26801e2;
        A4 = vVar30;
        B4 = vVar28;
        gg.v vVar31 = new gg.v("0.9.2342.19200300.100.1.25");
        C4 = vVar31;
        gg.v vVar32 = new gg.v("0.9.2342.19200300.100.1.1");
        D4 = vVar32;
        Hashtable hashtable = new Hashtable();
        F4 = hashtable;
        Hashtable hashtable2 = new Hashtable();
        G4 = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        H4 = hashtable3;
        Hashtable hashtable4 = new Hashtable();
        I4 = hashtable4;
        J4 = hashtable;
        K4 = hashtable4;
        hashtable.put(vVar, "C");
        hashtable.put(vVar2, "O");
        hashtable.put(vVar4, "T");
        hashtable.put(vVar3, "OU");
        hashtable.put(vVar5, "CN");
        hashtable.put(vVar8, "L");
        hashtable.put(vVar9, "ST");
        hashtable.put(vVar6, "SERIALNUMBER");
        hashtable.put(vVar28, "E");
        hashtable.put(vVar31, "DC");
        hashtable.put(vVar32, "UID");
        hashtable.put(vVar7, "STREET");
        hashtable.put(vVar10, "SURNAME");
        hashtable.put(vVar11, "GIVENNAME");
        hashtable.put(vVar12, "INITIALS");
        hashtable.put(vVar13, "GENERATION");
        hashtable.put(vVar30, "unstructuredAddress");
        hashtable.put(vVar29, "unstructuredName");
        hashtable.put(vVar14, "UniqueIdentifier");
        hashtable.put(vVar17, "DN");
        hashtable.put(vVar18, "Pseudonym");
        hashtable.put(vVar25, "PostalAddress");
        hashtable.put(vVar24, "NameAtBirth");
        hashtable.put(vVar22, "CountryOfCitizenship");
        hashtable.put(vVar23, "CountryOfResidence");
        hashtable.put(vVar21, "Gender");
        hashtable.put(vVar20, "PlaceOfBirth");
        hashtable.put(vVar19, "DateOfBirth");
        hashtable.put(vVar16, "PostalCode");
        hashtable.put(vVar15, "BusinessCategory");
        hashtable.put(vVar26, "TelephoneNumber");
        hashtable.put(vVar27, "Name");
        hashtable2.put(vVar, "C");
        hashtable2.put(vVar2, "O");
        hashtable2.put(vVar3, "OU");
        hashtable2.put(vVar5, "CN");
        hashtable2.put(vVar8, "L");
        hashtable2.put(vVar9, "ST");
        hashtable2.put(vVar7, "STREET");
        hashtable2.put(vVar31, "DC");
        hashtable2.put(vVar32, "UID");
        hashtable3.put(vVar, "C");
        hashtable3.put(vVar2, "O");
        hashtable3.put(vVar3, "OU");
        hashtable3.put(vVar5, "CN");
        hashtable3.put(vVar8, "L");
        hashtable3.put(vVar9, "ST");
        hashtable3.put(vVar7, "STREET");
        hashtable4.put("c", vVar);
        hashtable4.put("o", vVar2);
        hashtable4.put("t", vVar4);
        hashtable4.put("ou", vVar3);
        hashtable4.put("cn", vVar5);
        hashtable4.put("l", vVar8);
        hashtable4.put("st", vVar9);
        hashtable4.put("sn", vVar6);
        hashtable4.put("serialnumber", vVar6);
        hashtable4.put("street", vVar7);
        hashtable4.put("emailaddress", vVar28);
        hashtable4.put("dc", vVar31);
        hashtable4.put("e", vVar28);
        hashtable4.put("uid", vVar32);
        hashtable4.put("surname", vVar10);
        hashtable4.put("givenname", vVar11);
        hashtable4.put("initials", vVar12);
        hashtable4.put("generation", vVar13);
        hashtable4.put("unstructuredaddress", vVar30);
        hashtable4.put("unstructuredname", vVar29);
        hashtable4.put("uniqueidentifier", vVar14);
        hashtable4.put("dn", vVar17);
        hashtable4.put("pseudonym", vVar18);
        hashtable4.put("postaladdress", vVar25);
        hashtable4.put("nameofbirth", vVar24);
        hashtable4.put("countryofcitizenship", vVar22);
        hashtable4.put("countryofresidence", vVar23);
        hashtable4.put("gender", vVar21);
        hashtable4.put("placeofbirth", vVar20);
        hashtable4.put("dateofbirth", vVar19);
        hashtable4.put("postalcode", vVar16);
        hashtable4.put("businesscategory", vVar15);
        hashtable4.put("telephonenumber", vVar26);
        hashtable4.put("name", vVar27);
    }

    protected y0() {
    }

    public y0(gg.d0 d0Var) {
        Vector vector;
        this.f12169x = d0Var;
        Enumeration H = d0Var.H();
        while (H.hasMoreElements()) {
            gg.e0 E = gg.e0.E(((gg.g) H.nextElement()).b());
            int i10 = 0;
            while (i10 < E.size()) {
                gg.d0 F = gg.d0.F(E.F(i10).b());
                if (F.size() != 2) {
                    throw new IllegalArgumentException("badly sized pair");
                }
                this.f12166c.addElement(gg.v.K(F.G(0)));
                gg.g G = F.G(1);
                if (!(G instanceof gg.g0) || (G instanceof gg.n0)) {
                    try {
                        this.f12167d.addElement("#" + m(bk.f.d(G.b().k("DER"))));
                    } catch (IOException unused) {
                        throw new IllegalArgumentException("cannot encode value");
                    }
                } else {
                    String c10 = ((gg.g0) G).c();
                    if (c10.length() <= 0 || c10.charAt(0) != '#') {
                        vector = this.f12167d;
                    } else {
                        vector = this.f12167d;
                        c10 = "\\" + c10;
                    }
                    vector.addElement(c10);
                }
                this.f12168q.addElement(i10 != 0 ? L4 : M4);
                i10++;
            }
        }
    }

    private void l(StringBuffer stringBuffer, Hashtable hashtable, gg.v vVar, String str) {
        String str2 = (String) hashtable.get(vVar);
        if (str2 == null) {
            str2 = vVar.H();
        }
        stringBuffer.append(str2);
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (length < length2 && stringBuffer.charAt(length) == ' ') {
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 <= length || stringBuffer.charAt(length2) != ' ') {
                break;
            }
            stringBuffer.insert(length2, '\\');
        }
        while (length <= length2) {
            char charAt = stringBuffer.charAt(length);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        length++;
                        continue;
                }
            }
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
    }

    private String m(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 != length; i10++) {
            cArr[i10] = (char) (bArr[i10] & 255);
        }
        return new String(cArr);
    }

    private String n(String str) {
        String g10 = ak.q.g(str.trim());
        if (g10.length() <= 0 || g10.charAt(0) != '#') {
            return g10;
        }
        gg.a0 o10 = o(g10);
        return o10 instanceof gg.g0 ? ak.q.g(((gg.g0) o10).c().trim()) : g10;
    }

    private gg.a0 o(String str) {
        try {
            return gg.a0.u(bk.f.c(str, 1, str.length() - 1));
        } catch (IOException e10) {
            throw new IllegalStateException("unknown encoding in name: " + e10);
        }
    }

    private boolean q(String str, String str2) {
        String n10 = n(str);
        String n11 = n(str2);
        return n10.equals(n11) || s(n10).equals(s(n11));
    }

    public static y0 r(Object obj) {
        if (obj instanceof y0) {
            return (y0) obj;
        }
        if (obj instanceof fh.c) {
            return new y0(gg.d0.F(((fh.c) obj).b()));
        }
        if (obj == null) {
            return null;
        }
        return new y0(gg.d0.F(obj));
    }

    private String s(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            int i10 = 1;
            while (i10 < str.length()) {
                char charAt2 = str.charAt(i10);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                }
                i10++;
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        if (this.f12169x == null) {
            gg.h hVar = new gg.h();
            gg.h hVar2 = new gg.h();
            if (this.f12166c.size() != 0) {
                new gg.h(2).a((gg.v) this.f12166c.elementAt(0));
                String str = (String) this.f12167d.elementAt(0);
                throw null;
            }
            hVar.a(new y1(hVar2));
            this.f12169x = new x1(hVar);
        }
        return this.f12169x;
    }

    @Override // gg.t
    public boolean equals(Object obj) {
        int i10;
        int i11;
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y0) && !(obj instanceof gg.d0)) {
            return false;
        }
        if (b().s(((gg.g) obj).b())) {
            return true;
        }
        try {
            y0 r10 = r(obj);
            int size = this.f12166c.size();
            if (size != r10.f12166c.size()) {
                return false;
            }
            boolean[] zArr = new boolean[size];
            int i12 = -1;
            if (this.f12166c.elementAt(0).equals(r10.f12166c.elementAt(0))) {
                i10 = 1;
                i12 = size;
                i11 = 0;
            } else {
                i11 = size - 1;
                i10 = -1;
            }
            while (i11 != i12) {
                gg.v vVar = (gg.v) this.f12166c.elementAt(i11);
                String str = (String) this.f12167d.elementAt(i11);
                int i13 = 0;
                while (true) {
                    if (i13 >= size) {
                        z10 = false;
                        break;
                    } else if (!zArr[i13] && vVar.s((gg.v) r10.f12166c.elementAt(i13)) && q(str, (String) r10.f12167d.elementAt(i13))) {
                        zArr[i13] = true;
                        z10 = true;
                        break;
                    } else {
                        i13++;
                    }
                }
                if (!z10) {
                    return false;
                }
                i11 += i10;
            }
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // gg.t
    public int hashCode() {
        if (this.f12170y) {
            return this.U3;
        }
        this.f12170y = true;
        for (int i10 = 0; i10 != this.f12166c.size(); i10++) {
            String s10 = s(n((String) this.f12167d.elementAt(i10)));
            int hashCode = this.U3 ^ this.f12166c.elementAt(i10).hashCode();
            this.U3 = hashCode;
            this.U3 = s10.hashCode() ^ hashCode;
        }
        return this.U3;
    }

    public String toString() {
        return u(E4, F4);
    }

    public String u(boolean z10, Hashtable hashtable) {
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        for (int i10 = 0; i10 < this.f12166c.size(); i10++) {
            if (((Boolean) this.f12168q.elementAt(i10)).booleanValue()) {
                stringBuffer2.append('+');
                l(stringBuffer2, hashtable, (gg.v) this.f12166c.elementAt(i10), (String) this.f12167d.elementAt(i10));
            } else {
                stringBuffer2 = new StringBuffer();
                l(stringBuffer2, hashtable, (gg.v) this.f12166c.elementAt(i10), (String) this.f12167d.elementAt(i10));
                vector.addElement(stringBuffer2);
            }
        }
        boolean z11 = true;
        if (z10) {
            for (int size = vector.size() - 1; size >= 0; size--) {
                if (z11) {
                    z11 = false;
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append(vector.elementAt(size).toString());
            }
        } else {
            for (int i11 = 0; i11 < vector.size(); i11++) {
                if (z11) {
                    z11 = false;
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append(vector.elementAt(i11).toString());
            }
        }
        return stringBuffer.toString();
    }
}
