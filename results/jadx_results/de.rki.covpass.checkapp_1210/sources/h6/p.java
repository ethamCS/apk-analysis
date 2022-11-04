package h6;
/* loaded from: classes.dex */
public abstract class p extends Exception {

    /* renamed from: c */
    protected static final boolean f11358c;

    /* renamed from: d */
    protected static final StackTraceElement[] f11359d;

    static {
        f11358c = System.getProperty("surefire.test.class.path") != null;
        f11359d = new StackTraceElement[0];
    }

    public p() {
    }

    public p(Throwable th2) {
        super(th2);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
