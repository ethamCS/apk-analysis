package rc;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000fJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lrc/k0;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "Ljava/lang/ClassLoader;", "temporaryStrongRef", "Ljava/lang/ClassLoader;", "getTemporaryStrongRef", "()Ljava/lang/ClassLoader;", "a", "(Ljava/lang/ClassLoader;)V", "classLoader", "<init>", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
final class k0 {

    /* renamed from: a */
    private final WeakReference<ClassLoader> f20705a;

    /* renamed from: b */
    private final int f20706b;

    /* renamed from: c */
    private ClassLoader f20707c;

    public k0(ClassLoader classLoader) {
        hc.t.e(classLoader, "classLoader");
        this.f20705a = new WeakReference<>(classLoader);
        this.f20706b = System.identityHashCode(classLoader);
        this.f20707c = classLoader;
    }

    public final void a(ClassLoader classLoader) {
        this.f20707c = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k0) && this.f20705a.get() == ((k0) obj).f20705a.get();
    }

    public int hashCode() {
        return this.f20706b;
    }

    public String toString() {
        String classLoader;
        ClassLoader classLoader2 = this.f20705a.get();
        return (classLoader2 == null || (classLoader = classLoader2.toString()) == null) ? "<null>" : classLoader;
    }
}
