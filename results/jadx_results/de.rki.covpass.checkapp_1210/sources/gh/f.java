package gh;
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a */
    private String f10980a;

    /* renamed from: b */
    private int f10981b;

    /* renamed from: c */
    private char f10982c;

    /* renamed from: d */
    private StringBuffer f10983d;

    public f(String str) {
        this(str, ',');
    }

    public f(String str, char c10) {
        this.f10983d = new StringBuffer();
        this.f10980a = str;
        this.f10981b = -1;
        this.f10982c = c10;
    }

    public boolean a() {
        return this.f10981b != this.f10980a.length();
    }

    public String b() {
        if (this.f10981b == this.f10980a.length()) {
            return null;
        }
        int i10 = this.f10981b + 1;
        this.f10983d.setLength(0);
        boolean z10 = false;
        boolean z11 = false;
        while (i10 != this.f10980a.length()) {
            char charAt = this.f10980a.charAt(i10);
            if (charAt == '\"') {
                if (!z10) {
                    z11 = !z11;
                }
            } else if (!z10 && !z11) {
                if (charAt == '\\') {
                    this.f10983d.append(charAt);
                    z10 = true;
                } else if (charAt == this.f10982c) {
                    break;
                } else {
                    this.f10983d.append(charAt);
                }
                i10++;
            }
            this.f10983d.append(charAt);
            z10 = false;
            i10++;
        }
        this.f10981b = i10;
        return this.f10983d.toString();
    }
}
