package io.ktor.utils.io;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0000\u001a\u001f\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a)\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lio/ktor/utils/io/h;", BuildConfig.FLAVOR, "limit", "Lob/u;", "e", "(Lio/ktor/utils/io/h;JLxb/d;)Ljava/lang/Object;", "f", "(Lio/ktor/utils/io/h;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "a", BuildConfig.FLAVOR, "dst", BuildConfig.FLAVOR, "d", "(Lio/ktor/utils/io/h;[BLxb/d;)Ljava/lang/Object;", "Lio/ktor/utils/io/k;", "b", "(Lio/ktor/utils/io/h;Lio/ktor/utils/io/k;JLxb/d;)Ljava/lang/Object;", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class j {

    @zb.f(c = "io.ktor.utils.io.ByteReadChannelKt", f = "ByteReadChannel.kt", l = {271}, m = "copyAndClose")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends zb.d {
        int U3;

        /* renamed from: x */
        Object f12917x;

        /* renamed from: y */
        /* synthetic */ Object f12918y;

        a(xb.d<? super a> dVar) {
            super(dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f12918y = obj;
            this.U3 |= Integer.MIN_VALUE;
            return j.b(null, null, 0L, this);
        }
    }

    public static final boolean a(h hVar) {
        hc.t.e(hVar, "<this>");
        return hVar.g(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.ktor.utils.io.h r4, io.ktor.utils.io.k r5, long r6, xb.d<? super java.lang.Long> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.j.a
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.j$a r0 = (io.ktor.utils.io.j.a) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            io.ktor.utils.io.j$a r0 = new io.ktor.utils.io.j$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f12918y
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.U3
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f12917x
            r5 = r4
            io.ktor.utils.io.k r5 = (io.ktor.utils.io.k) r5
            tb.t.b(r8)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            tb.t.b(r8)
            r0.f12917x = r5
            r0.U3 = r3
            java.lang.Object r8 = io.ktor.utils.io.i.b(r4, r5, r6, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            java.lang.Number r8 = (java.lang.Number) r8
            long r6 = r8.longValue()
            io.ktor.utils.io.l.a(r5)
            java.lang.Long r4 = zb.b.d(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.b(io.ktor.utils.io.h, io.ktor.utils.io.k, long, xb.d):java.lang.Object");
    }

    public static /* synthetic */ Object c(h hVar, k kVar, long j10, xb.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return b(hVar, kVar, j10, dVar);
    }

    public static final Object d(h hVar, byte[] bArr, xb.d<? super Integer> dVar) {
        return hVar.i(bArr, 0, bArr.length, dVar);
    }

    public static final Object e(h hVar, long j10, xb.d<? super ob.u> dVar) {
        return hVar.l(j10, 0, dVar);
    }

    public static final Object f(h hVar, xb.d<? super ob.u> dVar) {
        return hVar.l(Long.MAX_VALUE, 0, dVar);
    }
}
