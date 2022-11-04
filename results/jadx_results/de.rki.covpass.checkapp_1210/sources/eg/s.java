package eg;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Leg/s;", "Leg/a0;", "Leg/c;", "sink", BuildConfig.FLAVOR, "byteCount", "g1", "Leg/b0;", "m", "Ltb/e0;", "close", "Leg/e;", "upstream", "<init>", "(Leg/e;)V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class s implements a0 {
    private long U3;

    /* renamed from: c */
    private final e f9638c;

    /* renamed from: d */
    private final c f9639d;

    /* renamed from: q */
    private v f9640q;

    /* renamed from: x */
    private int f9641x;

    /* renamed from: y */
    private boolean f9642y;

    public s(e eVar) {
        hc.t.e(eVar, "upstream");
        this.f9638c = eVar;
        c c10 = eVar.c();
        this.f9639d = c10;
        v vVar = c10.f9600c;
        this.f9640q = vVar;
        this.f9641x = vVar == null ? -1 : vVar.f9651b;
    }

    @Override // eg.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9642y = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r5 == r6.f9651b) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    @Override // eg.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long g1(eg.c r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            hc.t.e(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto Lf
            r5 = r4
            goto L10
        Lf:
            r5 = r3
        L10:
            if (r5 == 0) goto L87
            boolean r5 = r8.f9642y
            r5 = r5 ^ r4
            if (r5 == 0) goto L7b
            eg.v r5 = r8.f9640q
            if (r5 == 0) goto L2a
            eg.c r6 = r8.f9639d
            eg.v r6 = r6.f9600c
            if (r5 != r6) goto L2b
            int r5 = r8.f9641x
            hc.t.b(r6)
            int r6 = r6.f9651b
            if (r5 != r6) goto L2b
        L2a:
            r3 = r4
        L2b:
            if (r3 == 0) goto L6f
            if (r2 != 0) goto L30
            return r0
        L30:
            eg.e r0 = r8.f9638c
            long r1 = r8.U3
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.P(r1)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            eg.v r0 = r8.f9640q
            if (r0 != 0) goto L53
            eg.c r0 = r8.f9639d
            eg.v r0 = r0.f9600c
            if (r0 == 0) goto L53
            r8.f9640q = r0
            hc.t.b(r0)
            int r0 = r0.f9651b
            r8.f9641x = r0
        L53:
            eg.c r0 = r8.f9639d
            long r0 = r0.e1()
            long r2 = r8.U3
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            eg.c r2 = r8.f9639d
            long r4 = r8.U3
            r3 = r9
            r6 = r10
            r2.j(r3, r4, r6)
            long r0 = r8.U3
            long r0 = r0 + r10
            r8.U3 = r0
            return r10
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L87:
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r9 = hc.t.l(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.s.g1(eg.c, long):long");
    }

    @Override // eg.a0
    public b0 m() {
        return this.f9638c.m();
    }
}
