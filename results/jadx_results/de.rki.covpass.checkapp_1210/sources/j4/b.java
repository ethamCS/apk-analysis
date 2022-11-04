package j4;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    public String f13976a;

    /* renamed from: b */
    public String f13977b;

    /* renamed from: c */
    public float f13978c;

    /* renamed from: d */
    public a f13979d;

    /* renamed from: e */
    public int f13980e;

    /* renamed from: f */
    public float f13981f;

    /* renamed from: g */
    public float f13982g;

    /* renamed from: h */
    public int f13983h;

    /* renamed from: i */
    public int f13984i;

    /* renamed from: j */
    public float f13985j;

    /* renamed from: k */
    public boolean f13986k;

    /* loaded from: classes.dex */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b() {
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10) {
        this.f13976a = str;
        this.f13977b = str2;
        this.f13978c = f10;
        this.f13979d = aVar;
        this.f13980e = i10;
        this.f13981f = f11;
        this.f13982g = f12;
        this.f13983h = i11;
        this.f13984i = i12;
        this.f13985j = f13;
        this.f13986k = z10;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f13976a.hashCode() * 31) + this.f13977b.hashCode()) * 31) + this.f13978c)) * 31) + this.f13979d.ordinal()) * 31) + this.f13980e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f13981f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f13983h;
    }
}
