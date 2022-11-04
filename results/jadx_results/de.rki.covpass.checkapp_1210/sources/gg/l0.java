package gg;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
/* loaded from: classes3.dex */
public class l0 extends a0 {

    /* renamed from: d */
    static final o0 f10851d = new a(l0.class, 23);

    /* renamed from: c */
    final byte[] f10852c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return l0.C(t1Var.F());
        }
    }

    l0(byte[] bArr) {
        if (bArr.length >= 2) {
            this.f10852c = bArr;
            if (G(0) && G(1)) {
                return;
            }
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }

    public static l0 C(byte[] bArr) {
        return new l0(bArr);
    }

    private boolean G(int i10) {
        byte[] bArr = this.f10852c;
        return bArr.length > i10 && bArr[i10] >= 48 && bArr[i10] <= 57;
    }

    public Date D() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return r2.a(simpleDateFormat.parse(E()));
    }

    public String E() {
        StringBuilder sb2;
        String str;
        String F = F();
        if (F.charAt(0) < '5') {
            sb2 = new StringBuilder();
            str = "20";
        } else {
            sb2 = new StringBuilder();
            str = "19";
        }
        sb2.append(str);
        sb2.append(F);
        return sb2.toString();
    }

    public String F() {
        StringBuilder sb2;
        String substring;
        String b10 = ak.q.b(this.f10852c);
        if (b10.indexOf(45) >= 0 || b10.indexOf(43) >= 0) {
            int indexOf = b10.indexOf(45);
            if (indexOf < 0) {
                indexOf = b10.indexOf(43);
            }
            if (indexOf == b10.length() - 3) {
                b10 = b10 + "00";
            }
            if (indexOf == 10) {
                sb2 = new StringBuilder();
                sb2.append(b10.substring(0, 10));
                sb2.append("00GMT");
                sb2.append(b10.substring(10, 13));
                sb2.append(":");
                substring = b10.substring(13, 15);
            } else {
                sb2 = new StringBuilder();
                sb2.append(b10.substring(0, 12));
                sb2.append("GMT");
                sb2.append(b10.substring(12, 15));
                sb2.append(":");
                substring = b10.substring(15, 17);
            }
        } else if (b10.length() == 11) {
            sb2 = new StringBuilder();
            sb2.append(b10.substring(0, 10));
            substring = "00GMT+00:00";
        } else {
            sb2 = new StringBuilder();
            sb2.append(b10.substring(0, 12));
            substring = "GMT+00:00";
        }
        sb2.append(substring);
        return sb2.toString();
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        return ak.a.F(this.f10852c);
    }

    @Override // gg.a0
    public boolean l(a0 a0Var) {
        if (!(a0Var instanceof l0)) {
            return false;
        }
        return ak.a.c(this.f10852c, ((l0) a0Var).f10852c);
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        yVar.o(z10, 23, this.f10852c);
    }

    @Override // gg.a0
    public final boolean n() {
        return false;
    }

    @Override // gg.a0
    public int q(boolean z10) {
        return y.g(z10, this.f10852c.length);
    }

    public String toString() {
        return ak.q.b(this.f10852c);
    }
}
