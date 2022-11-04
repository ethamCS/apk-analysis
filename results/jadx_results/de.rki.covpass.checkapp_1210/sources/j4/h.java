package j4;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    private final String f14007a;

    /* renamed from: b */
    public final float f14008b;

    /* renamed from: c */
    public final float f14009c;

    public h(String str, float f10, float f11) {
        this.f14007a = str;
        this.f14009c = f11;
        this.f14008b = f10;
    }

    public boolean a(String str) {
        if (this.f14007a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f14007a.endsWith("\r")) {
            String str2 = this.f14007a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
