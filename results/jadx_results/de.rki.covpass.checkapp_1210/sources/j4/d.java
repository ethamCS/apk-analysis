package j4;

import java.util.List;
import l4.p;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private final List<p> f13996a;

    /* renamed from: b */
    private final char f13997b;

    /* renamed from: c */
    private final double f13998c;

    /* renamed from: d */
    private final double f13999d;

    /* renamed from: e */
    private final String f14000e;

    /* renamed from: f */
    private final String f14001f;

    public d(List<p> list, char c10, double d10, double d11, String str, String str2) {
        this.f13996a = list;
        this.f13997b = c10;
        this.f13998c = d10;
        this.f13999d = d11;
        this.f14000e = str;
        this.f14001f = str2;
    }

    public static int c(char c10, String str, String str2) {
        return ((((0 + c10) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<p> a() {
        return this.f13996a;
    }

    public double b() {
        return this.f13999d;
    }

    public int hashCode() {
        return c(this.f13997b, this.f14001f, this.f14000e);
    }
}
