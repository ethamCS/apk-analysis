package ac;

import hc.t;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lac/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "cause", "exception", "Ltb/e0;", "a", "Llc/c;", "b", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class a {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lac/a$a;", BuildConfig.FLAVOR, "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ac.a$a */
    /* loaded from: classes.dex */
    public static final class C0003a {

        /* renamed from: a */
        public static final C0003a f242a = new C0003a();

        /* renamed from: b */
        public static final Method f243b;

        /* renamed from: c */
        public static final Method f244c;

        /* JADX WARN: Removed duplicated region for block: B:12:0x003f A[LOOP:0: B:3:0x0015->B:12:0x003f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[EDGE_INSN: B:23:0x0043->B:14:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                ac.a$a r0 = new ac.a$a
                r0.<init>()
                ac.a.C0003a.f242a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                hc.t.d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = hc.t.a(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                hc.t.d(r7, r8)
                java.lang.Object r7 = ub.i.V(r7)
                boolean r7 = hc.t.a(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = r3
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                ac.a.C0003a.f243b = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = hc.t.a(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                ac.a.C0003a.f244c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ac.a.C0003a.<clinit>():void");
        }

        private C0003a() {
        }
    }

    public void a(Throwable th2, Throwable th3) {
        t.e(th2, "cause");
        t.e(th3, "exception");
        Method method = C0003a.f243b;
        if (method != null) {
            method.invoke(th2, th3);
        }
    }

    public lc.c b() {
        return new lc.b();
    }
}
