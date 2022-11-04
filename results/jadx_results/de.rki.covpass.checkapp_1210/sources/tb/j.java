package tb;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0011J \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0011\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¨\u0006\u0012"}, d2 = {"Ltb/j;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "major", "minor", "patch", "b", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "hashCode", "a", "<init>", "(III)V", "(II)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class j implements Comparable<j> {
    public static final a Companion = new a(null);

    /* renamed from: y */
    public static final j f22156y = k.a();

    /* renamed from: c */
    private final int f22157c;

    /* renamed from: d */
    private final int f22158d;

    /* renamed from: q */
    private final int f22159q;

    /* renamed from: x */
    private final int f22160x;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Ltb/j$a;", BuildConfig.FLAVOR, "Ltb/j;", "CURRENT", "Ltb/j;", BuildConfig.FLAVOR, "MAX_COMPONENT_VALUE", "I", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j(int i10, int i11) {
        this(i10, i11, 0);
    }

    public j(int i10, int i11, int i12) {
        this.f22157c = i10;
        this.f22158d = i11;
        this.f22159q = i12;
        this.f22160x = b(i10, i11, i12);
    }

    private final int b(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new nc.g(0, 255).i(i10) && new nc.g(0, 255).i(i11) && new nc.g(0, 255).i(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    /* renamed from: a */
    public int compareTo(j jVar) {
        hc.t.e(jVar, "other");
        return this.f22160x - jVar.f22160x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        j jVar = obj instanceof j ? (j) obj : null;
        return jVar != null && this.f22160x == jVar.f22160x;
    }

    public int hashCode() {
        return this.f22160x;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22157c);
        sb2.append('.');
        sb2.append(this.f22158d);
        sb2.append('.');
        sb2.append(this.f22159q);
        return sb2.toString();
    }
}
