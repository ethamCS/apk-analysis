package j$.util.concurrent;
/* loaded from: classes2.dex */
public final class h extends m {

    /* renamed from: e */
    final m[] f13307e;

    public h(m[] mVarArr) {
        super(-1, null, null, null);
        this.f13307e = mVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
        if ((r0 instanceof j$.util.concurrent.h) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
        r0 = ((j$.util.concurrent.h) r0).f13307e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
        return r0.a(r5, r6);
     */
    @Override // j$.util.concurrent.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.concurrent.m a(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            j$.util.concurrent.m[] r0 = r4.f13307e
        L2:
            r1 = 0
            if (r6 == 0) goto L39
            if (r0 == 0) goto L39
            int r2 = r0.length
            if (r2 == 0) goto L39
            int r2 = r2 + (-1)
            r2 = r2 & r5
            j$.util.concurrent.m r0 = j$.util.concurrent.ConcurrentHashMap.tabAt(r0, r2)
            if (r0 != 0) goto L14
            goto L39
        L14:
            int r2 = r0.f13314a
            if (r2 != r5) goto L25
            java.lang.Object r3 = r0.f13315b
            if (r3 == r6) goto L24
            if (r3 == 0) goto L25
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L25
        L24:
            return r0
        L25:
            if (r2 >= 0) goto L35
            boolean r1 = r0 instanceof j$.util.concurrent.h
            if (r1 == 0) goto L30
            j$.util.concurrent.h r0 = (j$.util.concurrent.h) r0
            j$.util.concurrent.m[] r0 = r0.f13307e
            goto L2
        L30:
            j$.util.concurrent.m r5 = r0.a(r5, r6)
            return r5
        L35:
            j$.util.concurrent.m r0 = r0.f13317d
            if (r0 != 0) goto L14
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.h.a(int, java.lang.Object):j$.util.concurrent.m");
    }
}
