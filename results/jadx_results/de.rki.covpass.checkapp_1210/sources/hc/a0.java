package hc;

import java.util.Collection;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001e\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lhc/a0;", "Lhc/j;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "Ljava/lang/Class;", "jClass", "Ljava/lang/Class;", "a", "()Ljava/lang/Class;", BuildConfig.FLAVOR, "Loc/c;", "x", "()Ljava/util/Collection;", "members", "moduleName", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a0 implements j {

    /* renamed from: c */
    private final Class<?> f11746c;

    /* renamed from: d */
    private final String f11747d;

    public a0(Class<?> cls, String str) {
        t.e(cls, "jClass");
        t.e(str, "moduleName");
        this.f11746c = cls;
        this.f11747d = str;
    }

    @Override // hc.j
    public Class<?> a() {
        return this.f11746c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a0) && t.a(a(), ((a0) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }

    @Override // oc.f
    public Collection<oc.c<?>> x() {
        throw new fc.d();
    }
}
