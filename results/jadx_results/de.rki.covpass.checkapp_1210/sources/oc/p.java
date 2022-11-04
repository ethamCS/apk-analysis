package oc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005B\u001b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Loc/p;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", "Loc/q;", "a", "Loc/n;", "b", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "variance", "Loc/q;", "d", "()Loc/q;", "type", "Loc/n;", "c", "()Loc/n;", "<init>", "(Loc/q;Loc/n;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class p {
    public static final a Companion = new a(null);

    /* renamed from: c */
    public static final p f17801c = new p(null, null);

    /* renamed from: a */
    private final q f17802a;

    /* renamed from: b */
    private final n f17803b;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Loc/p$a;", BuildConfig.FLAVOR, "Loc/n;", "type", "Loc/p;", "d", "a", "b", "c", "()Loc/p;", "STAR", "star", "Loc/p;", "getStar$annotations", "()V", "<init>", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fc.c
        public final p a(n nVar) {
            hc.t.e(nVar, "type");
            return new p(q.IN, nVar);
        }

        @fc.c
        public final p b(n nVar) {
            hc.t.e(nVar, "type");
            return new p(q.OUT, nVar);
        }

        public final p c() {
            return p.f17801c;
        }

        @fc.c
        public final p d(n nVar) {
            hc.t.e(nVar, "type");
            return new p(q.INVARIANT, nVar);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17804a;

        static {
            int[] iArr = new int[q.values().length];
            iArr[q.INVARIANT.ordinal()] = 1;
            iArr[q.IN.ordinal()] = 2;
            iArr[q.OUT.ordinal()] = 3;
            f17804a = iArr;
        }
    }

    public p(q qVar, n nVar) {
        String str;
        this.f17802a = qVar;
        this.f17803b = nVar;
        if (!((qVar == null) != (nVar == null) ? false : true)) {
            if (qVar == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + qVar + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public final q a() {
        return this.f17802a;
    }

    public final n b() {
        return this.f17803b;
    }

    public final n c() {
        return this.f17803b;
    }

    public final q d() {
        return this.f17802a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f17802a == pVar.f17802a && hc.t.a(this.f17803b, pVar.f17803b);
    }

    public int hashCode() {
        q qVar = this.f17802a;
        int i10 = 0;
        int hashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        n nVar = this.f17803b;
        if (nVar != null) {
            i10 = nVar.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str;
        StringBuilder sb2;
        q qVar = this.f17802a;
        int i10 = qVar == null ? -1 : b.f17804a[qVar.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                return String.valueOf(this.f17803b);
            }
            if (i10 == 2) {
                sb2 = new StringBuilder();
                str = "in ";
            } else if (i10 != 3) {
                throw new tb.p();
            } else {
                sb2 = new StringBuilder();
                str = "out ";
            }
            sb2.append(str);
            sb2.append(this.f17803b);
            return sb2.toString();
        }
        return "*";
    }
}
