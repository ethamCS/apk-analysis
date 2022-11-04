package u6;

import java.nio.charset.StandardCharsets;
/* loaded from: classes.dex */
final class h {

    /* renamed from: a */
    private final String f23136a;

    /* renamed from: b */
    private l f23137b;

    /* renamed from: c */
    private h6.f f23138c;

    /* renamed from: d */
    private h6.f f23139d;

    /* renamed from: e */
    private final StringBuilder f23140e;

    /* renamed from: f */
    int f23141f;

    /* renamed from: g */
    private int f23142g;

    /* renamed from: h */
    private k f23143h;

    /* renamed from: i */
    private int f23144i;

    public h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 == '?' && str.charAt(i10) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c10);
        }
        this.f23136a = sb2.toString();
        this.f23137b = l.FORCE_NONE;
        this.f23140e = new StringBuilder(str.length());
        this.f23142g = -1;
    }

    private int h() {
        return this.f23136a.length() - this.f23144i;
    }

    public int a() {
        return this.f23140e.length();
    }

    public StringBuilder b() {
        return this.f23140e;
    }

    public char c() {
        return this.f23136a.charAt(this.f23141f);
    }

    public String d() {
        return this.f23136a;
    }

    public int e() {
        return this.f23142g;
    }

    public int f() {
        return h() - this.f23141f;
    }

    public k g() {
        return this.f23143h;
    }

    public boolean i() {
        return this.f23141f < h();
    }

    public void j() {
        this.f23142g = -1;
    }

    public void k() {
        this.f23143h = null;
    }

    public void l(h6.f fVar, h6.f fVar2) {
        this.f23138c = fVar;
        this.f23139d = fVar2;
    }

    public void m(int i10) {
        this.f23144i = i10;
    }

    public void n(l lVar) {
        this.f23137b = lVar;
    }

    public void o(int i10) {
        this.f23142g = i10;
    }

    public void p() {
        q(a());
    }

    public void q(int i10) {
        k kVar = this.f23143h;
        if (kVar == null || i10 > kVar.a()) {
            this.f23143h = k.l(i10, this.f23137b, this.f23138c, this.f23139d, true);
        }
    }

    public void r(char c10) {
        this.f23140e.append(c10);
    }

    public void s(String str) {
        this.f23140e.append(str);
    }
}
