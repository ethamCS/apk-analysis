package j$.util;

import java.util.NoSuchElementException;
import java.util.Objects;
/* renamed from: j$.util.i */
/* loaded from: classes2.dex */
public final class C0510i {

    /* renamed from: b */
    private static final C0510i f13382b = new C0510i();

    /* renamed from: a */
    private final Object f13383a;

    private C0510i() {
        this.f13383a = null;
    }

    private C0510i(Object obj) {
        Objects.requireNonNull(obj);
        this.f13383a = obj;
    }

    public static C0510i a() {
        return f13382b;
    }

    public static C0510i d(Object obj) {
        return new C0510i(obj);
    }

    public final Object b() {
        Object obj = this.f13383a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f13383a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0510i) {
            return AbstractC0516o.p(this.f13383a, ((C0510i) obj).f13383a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f13383a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f13383a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
