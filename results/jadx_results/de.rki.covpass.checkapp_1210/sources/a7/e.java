package a7;
/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: c */
    private final String f193c;

    /* renamed from: d */
    private final String f194d;

    public e(o6.a aVar, String str, String str2) {
        super(aVar);
        this.f193c = str2;
        this.f194d = str;
    }

    private void k(StringBuilder sb2, int i10) {
        int f10 = b().f(i10, 16);
        if (f10 == 38400) {
            return;
        }
        sb2.append('(');
        sb2.append(this.f193c);
        sb2.append(')');
        int i11 = f10 % 32;
        int i12 = f10 / 32;
        int i13 = (i12 % 12) + 1;
        int i14 = i12 / 12;
        if (i14 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i14);
        if (i13 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i13);
        if (i11 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i11);
    }

    @Override // a7.j
    public String d() {
        if (c().l() == 84) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 8);
            j(sb2, 48, 20);
            k(sb2, 68);
            return sb2.toString();
        }
        throw h6.m.b();
    }

    @Override // a7.i
    protected void h(StringBuilder sb2, int i10) {
        sb2.append('(');
        sb2.append(this.f194d);
        sb2.append(i10 / 100000);
        sb2.append(')');
    }

    @Override // a7.i
    protected int i(int i10) {
        return i10 % 100000;
    }
}
