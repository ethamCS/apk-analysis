package io.ktor.utils.io.internal;

import io.ktor.utils.io.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.b0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\bJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\r\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lio/ktor/utils/io/internal/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "e", "(Lxb/d;)Ljava/lang/Object;", "Ltb/e0;", "d", "c", "()V", BuildConfig.FLAVOR, "cause", "b", "(Ljava/lang/Throwable;)V", "<init>", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12866a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "suspension");
    private volatile /* synthetic */ Object suspension = null;

    @zb.f(c = "io.ktor.utils.io.internal.AwaitingSlot", f = "AwaitingSlot.kt", l = {28}, m = "sleep")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.internal.a$a */
    /* loaded from: classes.dex */
    public static final class C0195a extends zb.d {
        int V3;

        /* renamed from: x */
        Object f12867x;

        /* renamed from: y */
        /* synthetic */ Object f12868y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0195a(xb.d<? super C0195a> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f12868y = obj;
            this.V3 |= Integer.MIN_VALUE;
            return a.this.d(this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.internal.AwaitingSlot", f = "AwaitingSlot.kt", l = {61}, m = "trySuspend")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends zb.d {
        int V3;

        /* renamed from: x */
        int f12869x;

        /* renamed from: y */
        /* synthetic */ Object f12870y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f12870y = obj;
            this.V3 |= Integer.MIN_VALUE;
            return a.this.e(this);
        }
    }

    public a() {
        s.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(xb.d<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.internal.a.b
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.internal.a$b r0 = (io.ktor.utils.io.internal.a.b) r0
            int r1 = r0.V3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.V3 = r1
            goto L18
        L13:
            io.ktor.utils.io.internal.a$b r0 = new io.ktor.utils.io.internal.a$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f12870y
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.V3
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            int r0 = r0.f12869x
            tb.t.b(r7)
            goto L52
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            tb.t.b(r7)
            r7 = 0
            kotlinx.coroutines.b0 r2 = kotlinx.coroutines.e2.b(r7, r4, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = io.ktor.utils.io.internal.a.f12866a
            boolean r7 = androidx.concurrent.futures.b.a(r5, r6, r7, r2)
            if (r7 == 0) goto L51
            r0.f12869x = r4
            r0.V3 = r4
            java.lang.Object r7 = r2.V0(r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r0 = r4
            goto L52
        L51:
            r0 = r3
        L52:
            if (r0 == 0) goto L55
            r3 = r4
        L55:
            java.lang.Boolean r7 = zb.b.a(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.a.e(xb.d):java.lang.Object");
    }

    public final void b(Throwable th2) {
        b0 b0Var = (b0) f12866a.getAndSet(this, null);
        if (b0Var == null) {
            return;
        }
        if (th2 != null) {
            b0Var.n(th2);
        } else {
            b0Var.V();
        }
    }

    public final void c() {
        b0 b0Var = (b0) f12866a.getAndSet(this, null);
        if (b0Var == null) {
            return;
        }
        b0Var.V();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(xb.d<? super tb.e0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.utils.io.internal.a.C0195a
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.internal.a$a r0 = (io.ktor.utils.io.internal.a.C0195a) r0
            int r1 = r0.V3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.V3 = r1
            goto L18
        L13:
            io.ktor.utils.io.internal.a$a r0 = new io.ktor.utils.io.internal.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12868y
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.V3
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f12867x
            io.ktor.utils.io.internal.a r0 = (io.ktor.utils.io.internal.a) r0
            tb.t.b(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            tb.t.b(r5)
            r0.f12867x = r4
            r0.V3 = r3
            java.lang.Object r5 = r4.e(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4f
            tb.e0 r5 = tb.e0.f22152a
            return r5
        L4f:
            r0.c()
            tb.e0 r5 = tb.e0.f22152a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.a.d(xb.d):java.lang.Object");
    }
}
