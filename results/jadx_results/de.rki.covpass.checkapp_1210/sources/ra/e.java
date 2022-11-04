package ra;

import bf.y;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ta.t;
import ta.u;
import zb.f;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a9\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Ljava/net/HttpURLConnection;", "Lya/d;", "requestData", "Ltb/e0;", "d", "Lta/t$b;", "timeoutAttributes", "c", "T", "request", "Lkotlin/Function1;", "block", "e", "(Ljava/net/HttpURLConnection;Lya/d;Lgc/l;Lxb/d;)Ljava/lang/Object;", "Lxb/g;", "callContext", "Lio/ktor/utils/io/h;", "a", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "ktor-client-android"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @f(c = "io.ktor.client.engine.android.AndroidURLConnectionUtilsKt", f = "AndroidURLConnectionUtils.kt", l = {58}, m = "timeoutAwareConnection")
    /* loaded from: classes.dex */
    public static final class a<T> extends zb.d {
        /* synthetic */ Object U3;
        int V3;

        /* renamed from: x */
        Object f20577x;

        /* renamed from: y */
        Object f20578y;

        a(xb.d<? super a> dVar) {
            super(dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.V3 |= Integer.MIN_VALUE;
            return e.e(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002c -> B:5:0x0018). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final io.ktor.utils.io.h a(java.net.HttpURLConnection r4, xb.g r5, ya.d r6) {
        /*
            java.lang.String r0 = "<this>"
            hc.t.e(r4, r0)
            java.lang.String r0 = "callContext"
            hc.t.e(r5, r0)
            java.lang.String r0 = "request"
            hc.t.e(r6, r0)
            r0 = 8192(0x2000, float:1.14794E-41)
            r1 = 0
            java.io.InputStream r2 = r4.getInputStream()     // Catch: java.io.IOException -> L28
            if (r2 != 0) goto L1a
        L18:
            r2 = r1
            goto L3c
        L1a:
            boolean r3 = r2 instanceof java.io.BufferedInputStream     // Catch: java.io.IOException -> L28
            if (r3 == 0) goto L21
            java.io.BufferedInputStream r2 = (java.io.BufferedInputStream) r2     // Catch: java.io.IOException -> L28
            goto L3c
        L21:
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> L28
            r3.<init>(r2, r0)     // Catch: java.io.IOException -> L28
            r2 = r3
            goto L3c
        L28:
            java.io.InputStream r4 = r4.getErrorStream()
            if (r4 != 0) goto L2f
            goto L18
        L2f:
            boolean r2 = r4 instanceof java.io.BufferedInputStream
            if (r2 == 0) goto L37
            java.io.BufferedInputStream r4 = (java.io.BufferedInputStream) r4
            r2 = r4
            goto L3c
        L37:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r2.<init>(r4, r0)
        L3c:
            if (r2 != 0) goto L3f
            goto L52
        L3f:
            rb.f r4 = gb.a.a()
            io.ktor.utils.io.h r4 = io.ktor.utils.io.jvm.javaio.h.a(r2, r5, r4)
            if (r4 != 0) goto L4a
            goto L52
        L4a:
            kotlinx.coroutines.q0 r5 = kotlinx.coroutines.r0.a(r5)
            io.ktor.utils.io.h r1 = eb.c.a(r5, r4, r6)
        L52:
            if (r1 != 0) goto L5a
            io.ktor.utils.io.h$a r4 = io.ktor.utils.io.h.Companion
            io.ktor.utils.io.h r1 = r4.a()
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.e.a(java.net.HttpURLConnection, xb.g, ya.d):io.ktor.utils.io.h");
    }

    private static final boolean b(Throwable th2) {
        if (!(th2 instanceof SocketTimeoutException)) {
            if (!(th2 instanceof ConnectException)) {
                return false;
            }
            String message = th2.getMessage();
            if (!(message == null ? false : y.N(message, "timed out", false, 2, null))) {
                return false;
            }
        }
        return true;
    }

    private static final void c(HttpURLConnection httpURLConnection, t.b bVar) {
        Long d10 = bVar.d();
        if (d10 == null) {
            return;
        }
        long longValue = d10.longValue();
        if (longValue == Long.MAX_VALUE) {
            return;
        }
        if (httpURLConnection.getConnectTimeout() != 0 && httpURLConnection.getConnectTimeout() <= longValue) {
            return;
        }
        httpURLConnection.setConnectTimeout(u.c(longValue));
    }

    public static final void d(HttpURLConnection httpURLConnection, ya.d dVar) {
        hc.t.e(httpURLConnection, "<this>");
        hc.t.e(dVar, "requestData");
        t.b bVar = (t.b) dVar.c(t.f22120d);
        if (bVar == null) {
            return;
        }
        Long c10 = bVar.c();
        if (c10 != null) {
            httpURLConnection.setConnectTimeout(u.c(c10.longValue()));
        }
        Long e10 = bVar.e();
        if (e10 != null) {
            httpURLConnection.setReadTimeout(u.c(e10.longValue()));
        }
        c(httpURLConnection, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(java.net.HttpURLConnection r4, ya.d r5, gc.l<? super java.net.HttpURLConnection, ? extends T> r6, xb.d<? super T> r7) {
        /*
            boolean r0 = r7 instanceof ra.e.a
            if (r0 == 0) goto L13
            r0 = r7
            ra.e$a r0 = (ra.e.a) r0
            int r1 = r0.V3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.V3 = r1
            goto L18
        L13:
            ra.e$a r0 = new ra.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.V3
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f20578y
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r5 = r0.f20577x
            ya.d r5 = (ya.d) r5
            tb.t.b(r7)
            goto L4f
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            tb.t.b(r7)
            java.lang.Object r4 = r6.invoke(r4)     // Catch: java.lang.Throwable -> L41
            return r4
        L41:
            r4 = move-exception
            r0.f20577x = r5
            r0.f20578y = r4
            r0.V3 = r3
            java.lang.Object r6 = kotlinx.coroutines.g3.a(r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            boolean r6 = b(r4)
            if (r6 == 0) goto L59
            eb.a r4 = ta.u.a(r5, r4)
        L59:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.e.e(java.net.HttpURLConnection, ya.d, gc.l, xb.d):java.lang.Object");
    }
}
