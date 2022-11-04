package k0;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a */
    private a f14539a;

    /* renamed from: b */
    private String f14540b;

    /* renamed from: c */
    private int f14541c = 0;

    /* renamed from: d */
    private String f14542d = null;

    /* renamed from: e */
    public int f14543e = 0;

    /* renamed from: f */
    ArrayList<b> f14544f = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        public double a(float f10) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        int f14545a;

        /* renamed from: b */
        float f14546b;
    }

    public float a(float f10) {
        return (float) this.f14539a.a(f10);
    }

    public String toString() {
        String str = this.f14540b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f14544f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            str = str + "[" + next.f14545a + " , " + decimalFormat.format(next.f14546b) + "] ";
        }
        return str;
    }
}
