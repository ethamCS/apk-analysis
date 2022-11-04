package bb;

import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lbb/h;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", BuildConfig.FLAVOR, "Lbb/i;", "params", "Ljava/util/List;", "a", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    private final String f5835a;

    /* renamed from: b */
    private final List<i> f5836b;

    /* renamed from: c */
    private final double f5837c;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        r8 = bf.v.j(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(java.lang.String r8, java.util.List<bb.i> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "value"
            hc.t.e(r8, r0)
            java.lang.String r0 = "params"
            hc.t.e(r9, r0)
            r7.<init>()
            r7.f5835a = r8
            r7.f5836b = r9
            java.util.Iterator r8 = r9.iterator()
        L15:
            boolean r9 = r8.hasNext()
            r0 = 0
            if (r9 == 0) goto L30
            java.lang.Object r9 = r8.next()
            r1 = r9
            bb.i r1 = (bb.i) r1
            java.lang.String r1 = r1.c()
            java.lang.String r2 = "q"
            boolean r1 = hc.t.a(r1, r2)
            if (r1 == 0) goto L15
            goto L31
        L30:
            r9 = r0
        L31:
            bb.i r9 = (bb.i) r9
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r9 != 0) goto L38
            goto L60
        L38:
            java.lang.String r8 = r9.d()
            if (r8 != 0) goto L3f
            goto L60
        L3f:
            java.lang.Double r8 = bf.o.j(r8)
            if (r8 != 0) goto L46
            goto L60
        L46:
            double r3 = r8.doubleValue()
            r5 = 0
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r5 = 0
            if (r9 > 0) goto L56
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 > 0) goto L56
            r5 = 1
        L56:
            if (r5 == 0) goto L59
            r0 = r8
        L59:
            if (r0 != 0) goto L5c
            goto L60
        L5c:
            double r1 = r0.doubleValue()
        L60:
            r7.f5837c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.h.<init>(java.lang.String, java.util.List):void");
    }

    public final List<i> a() {
        return this.f5836b;
    }

    public final String b() {
        return this.f5835a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hc.t.a(this.f5835a, hVar.f5835a) && hc.t.a(this.f5836b, hVar.f5836b);
    }

    public int hashCode() {
        return (this.f5835a.hashCode() * 31) + this.f5836b.hashCode();
    }

    public String toString() {
        return "HeaderValue(value=" + this.f5835a + ", params=" + this.f5836b + ')';
    }
}
