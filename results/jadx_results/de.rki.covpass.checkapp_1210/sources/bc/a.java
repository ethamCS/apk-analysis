package bc;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lbc/a;", "Lac/a;", BuildConfig.FLAVOR, "version", BuildConfig.FLAVOR, "c", BuildConfig.FLAVOR, "cause", "exception", "Ltb/e0;", "a", "<init>", "()V", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class a extends ac.a {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbc/a$a;", BuildConfig.FLAVOR, "<init>", "()V", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 7, 1})
    /* renamed from: bc.a$a */
    /* loaded from: classes.dex */
    public static final class C0080a {

        /* renamed from: a */
        public static final C0080a f5971a = new C0080a();

        /* renamed from: b */
        public static final Integer f5972b;

        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                bc.a$a r0 = new bc.a$a
                r0.<init>()
                bc.a.C0080a.f5971a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L2e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r2 = 1
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L2e
                r0 = r1
            L2e:
                bc.a.C0080a.f5972b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bc.a.C0080a.<clinit>():void");
        }

        private C0080a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0080a.f5972b;
        return num == null || num.intValue() >= i10;
    }

    @Override // ac.a
    public void a(Throwable th2, Throwable th3) {
        t.e(th2, "cause");
        t.e(th3, "exception");
        if (c(19)) {
            th2.addSuppressed(th3);
        } else {
            super.a(th2, th3);
        }
    }
}
