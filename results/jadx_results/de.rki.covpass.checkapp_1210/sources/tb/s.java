package tb;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@fc.b
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u001a\u001bB\u0016\b\u0001\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\rø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0088\u0001\u0017\u0092\u0001\u0004\u0018\u00010\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Ltb/s;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", BuildConfig.FLAVOR, "g", "(Ljava/lang/Object;)Ljava/lang/Throwable;", BuildConfig.FLAVOR, "k", "(Ljava/lang/Object;)Ljava/lang/String;", BuildConfig.FLAVOR, "h", "(Ljava/lang/Object;)I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "e", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "j", "(Ljava/lang/Object;)Z", "isSuccess", "i", "isFailure", "value", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "b", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class s<T> implements Serializable {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private final Object f22169c;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltb/s$a;", BuildConfig.FLAVOR, "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Ltb/s$b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "exception", "<init>", "(Ljava/lang/Throwable;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: c */
        public final Throwable f22170c;

        public b(Throwable th2) {
            hc.t.e(th2, "exception");
            this.f22170c = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && hc.t.a(this.f22170c, ((b) obj).f22170c);
        }

        public int hashCode() {
            return this.f22170c.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f22170c + ')';
        }
    }

    private /* synthetic */ s(Object obj) {
        this.f22169c = obj;
    }

    public static final /* synthetic */ s b(Object obj) {
        return new s(obj);
    }

    public static <T> Object c(Object obj) {
        return obj;
    }

    public static boolean e(Object obj, Object obj2) {
        return (obj2 instanceof s) && hc.t.a(obj, ((s) obj2).n());
    }

    public static final boolean f(Object obj, Object obj2) {
        return hc.t.a(obj, obj2);
    }

    public static final Throwable g(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f22170c;
        }
        return null;
    }

    public static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean i(Object obj) {
        return obj instanceof b;
    }

    public static final boolean j(Object obj) {
        return !(obj instanceof b);
    }

    public static String k(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f22169c, obj);
    }

    public int hashCode() {
        return h(this.f22169c);
    }

    public final /* synthetic */ Object n() {
        return this.f22169c;
    }

    public String toString() {
        return k(this.f22169c);
    }
}
