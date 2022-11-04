package gg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
/* loaded from: classes3.dex */
public class m extends a0 {

    /* renamed from: d */
    static final o0 f10854d = new a(m.class, 24);

    /* renamed from: c */
    final byte[] f10855c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return m.F(t1Var.F());
        }
    }

    public m(String str) {
        this.f10855c = ak.q.f(str);
        try {
            G();
        } catch (ParseException e10) {
            throw new IllegalArgumentException("invalid date string: " + e10.getMessage());
        }
    }

    public m(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", r2.f10884c);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.f10855c = ak.q.f(simpleDateFormat.format(date));
    }

    public m(byte[] bArr) {
        if (bArr.length >= 4) {
            this.f10855c = bArr;
            if (O(0) && O(1) && O(2) && O(3)) {
                return;
            }
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }

    private SimpleDateFormat C() {
        SimpleDateFormat simpleDateFormat = L() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : N() ? new SimpleDateFormat("yyyyMMddHHmmssz") : M() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    private String D(String str) {
        String str2;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str2 = "-";
        } else {
            str2 = "+";
        }
        int i10 = rawOffset / 3600000;
        int i11 = (rawOffset - (((i10 * 60) * 60) * 1000)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (L()) {
                    str = P(str);
                }
                SimpleDateFormat C = C();
                if (timeZone.inDaylightTime(C.parse(str + "GMT" + str2 + E(i10) + ":" + E(i11)))) {
                    i10 += str2.equals("+") ? 1 : -1;
                }
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str2 + E(i10) + ":" + E(i11);
    }

    private String E(int i10) {
        if (i10 < 10) {
            return "0" + i10;
        }
        return Integer.toString(i10);
    }

    public static m F(byte[] bArr) {
        return new m(bArr);
    }

    public static m H(j0 j0Var, boolean z10) {
        return (m) f10854d.e(j0Var, z10);
    }

    public static m J(Object obj) {
        if (obj == null || (obj instanceof m)) {
            return (m) obj;
        }
        if (obj instanceof g) {
            a0 b10 = ((g) obj).b();
            if (b10 instanceof m) {
                return (m) b10;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (m) f10854d.b((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
        }
    }

    private boolean O(int i10) {
        byte[] bArr = this.f10855c;
        return bArr.length > i10 && bArr[i10] >= 48 && bArr[i10] <= 57;
    }

    private String P(String str) {
        String str2;
        StringBuilder sb2;
        char charAt;
        String substring = str.substring(14);
        int i10 = 1;
        while (i10 < substring.length() && '0' <= (charAt = substring.charAt(i10)) && charAt <= '9') {
            i10++;
        }
        int i11 = i10 - 1;
        if (i11 > 3) {
            str2 = substring.substring(0, 4) + substring.substring(i10);
            sb2 = new StringBuilder();
        } else if (i11 == 1) {
            str2 = substring.substring(0, i10) + "00" + substring.substring(i10);
            sb2 = new StringBuilder();
        } else if (i11 != 2) {
            return str;
        } else {
            str2 = substring.substring(0, i10) + "0" + substring.substring(i10);
            sb2 = new StringBuilder();
        }
        sb2.append(str.substring(0, 14));
        sb2.append(str2);
        return sb2.toString();
    }

    public Date G() {
        SimpleDateFormat simpleDateFormat;
        String b10 = ak.q.b(this.f10855c);
        if (b10.endsWith("Z")) {
            simpleDateFormat = L() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : N() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'") : M() ? new SimpleDateFormat("yyyyMMddHHmm'Z'") : new SimpleDateFormat("yyyyMMddHH'Z'");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (b10.indexOf(45) > 0 || b10.indexOf(43) > 0) {
            b10 = K();
            simpleDateFormat = C();
        } else {
            simpleDateFormat = L() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : N() ? new SimpleDateFormat("yyyyMMddHHmmss") : M() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (L()) {
            b10 = P(b10);
        }
        return r2.a(simpleDateFormat.parse(b10));
    }

    public String K() {
        int length;
        String b10 = ak.q.b(this.f10855c);
        if (b10.charAt(b10.length() - 1) == 'Z') {
            return b10.substring(0, b10.length() - 1) + "GMT+00:00";
        }
        int length2 = b10.length() - 6;
        char charAt = b10.charAt(length2);
        if ((charAt == '-' || charAt == '+') && b10.indexOf("GMT") == length2 - 3) {
            return b10;
        }
        int length3 = b10.length() - 5;
        char charAt2 = b10.charAt(length3);
        if (charAt2 == '-' || charAt2 == '+') {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b10.substring(0, length3));
            sb2.append("GMT");
            int i10 = length3 + 3;
            sb2.append(b10.substring(length3, i10));
            sb2.append(":");
            sb2.append(b10.substring(i10));
            return sb2.toString();
        }
        char charAt3 = b10.charAt(b10.length() - 3);
        if (charAt3 != '-' && charAt3 != '+') {
            return b10 + D(b10);
        }
        return b10.substring(0, length) + "GMT" + b10.substring(length) + ":00";
    }

    public boolean L() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f10855c;
            if (i10 != bArr.length) {
                if (bArr[i10] == 46 && i10 == 14) {
                    return true;
                }
                i10++;
            } else {
                return false;
            }
        }
    }

    public boolean M() {
        return O(10) && O(11);
    }

    public boolean N() {
        return O(12) && O(13);
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        return ak.a.F(this.f10855c);
    }

    @Override // gg.a0
    public boolean l(a0 a0Var) {
        if (!(a0Var instanceof m)) {
            return false;
        }
        return ak.a.c(this.f10855c, ((m) a0Var).f10855c);
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        yVar.o(z10, 24, this.f10855c);
    }

    @Override // gg.a0
    public final boolean n() {
        return false;
    }

    @Override // gg.a0
    public int q(boolean z10) {
        return y.g(z10, this.f10855c.length);
    }

    @Override // gg.a0
    public a0 w() {
        return new o1(this.f10855c);
    }

    @Override // gg.a0
    public a0 z() {
        return new o1(this.f10855c);
    }
}
