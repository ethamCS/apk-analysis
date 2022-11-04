package gg;
/* loaded from: classes3.dex */
public class y2 {

    /* renamed from: a */
    private String f10923a;

    /* renamed from: b */
    private int f10924b = 0;

    public y2(String str) {
        this.f10923a = str;
    }

    public boolean a() {
        return this.f10924b != -1;
    }

    public String b() {
        int i10 = this.f10924b;
        if (i10 == -1) {
            return null;
        }
        int indexOf = this.f10923a.indexOf(46, i10);
        if (indexOf == -1) {
            String substring = this.f10923a.substring(this.f10924b);
            this.f10924b = -1;
            return substring;
        }
        String substring2 = this.f10923a.substring(this.f10924b, indexOf);
        this.f10924b = indexOf + 1;
        return substring2;
    }
}
