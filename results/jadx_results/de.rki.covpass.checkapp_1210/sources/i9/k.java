package i9;

import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Li9/k;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Li9/o;", "b", "(Lxb/d;)Ljava/lang/Object;", "rule", BuildConfig.FLAVOR, "e", "(Li9/o;Lxb/d;)Ljava/lang/Object;", "list", "Ltb/e0;", "c", "(Ljava/util/List;Lxb/d;)Ljava/lang/Object;", "add", "f", "a", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class k {

    @zb.f(c = "de.rki.covpass.sdk.revocation.database.RevocationKidDao", f = "RevocationKidDao.kt", l = {30}, m = "insertAll$suspendImpl")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f12447x;

        /* renamed from: y */
        Object f12448y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(dVar);
            k.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return k.d(k.this, null, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.revocation.database.RevocationKidDao", f = "RevocationKidDao.kt", l = {36, 37}, m = "replaceAll$suspendImpl")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f12449x;

        /* renamed from: y */
        Object f12450y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(dVar);
            k.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return k.g(k.this, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object d(i9.k r5, java.util.List r6, xb.d r7) {
        /*
            boolean r0 = r7 instanceof i9.k.a
            if (r0 == 0) goto L13
            r0 = r7
            i9.k$a r0 = (i9.k.a) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            i9.k$a r0 = new i9.k$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f12448y
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.f12447x
            i9.k r6 = (i9.k) r6
            tb.t.b(r7)
            goto L43
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            tb.t.b(r7)
            java.util.Iterator r6 = r6.iterator()
            r4 = r6
            r6 = r5
            r5 = r4
        L43:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r5.next()
            i9.o r7 = (i9.o) r7
            r0.f12447x = r6
            r0.f12448y = r5
            r0.W3 = r3
            java.lang.Object r7 = r6.e(r7, r0)
            if (r7 != r1) goto L43
            return r1
        L5c:
            tb.e0 r5 = tb.e0.f22152a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.k.d(i9.k, java.util.List, xb.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object g(i9.k r5, java.util.List r6, xb.d r7) {
        /*
            boolean r0 = r7 instanceof i9.k.b
            if (r0 == 0) goto L13
            r0 = r7
            i9.k$b r0 = (i9.k.b) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            i9.k$b r0 = new i9.k$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tb.t.b(r7)
            goto L5f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f12450y
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r0.f12449x
            i9.k r5 = (i9.k) r5
            tb.t.b(r7)
            goto L51
        L41:
            tb.t.b(r7)
            r0.f12449x = r5
            r0.f12450y = r6
            r0.W3 = r4
            java.lang.Object r7 = r5.a(r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            r7 = 0
            r0.f12449x = r7
            r0.f12450y = r7
            r0.W3 = r3
            java.lang.Object r5 = r5.c(r6, r0)
            if (r5 != r1) goto L5f
            return r1
        L5f:
            tb.e0 r5 = tb.e0.f22152a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.k.g(i9.k, java.util.List, xb.d):java.lang.Object");
    }

    public abstract Object a(xb.d<? super e0> dVar);

    public abstract Object b(xb.d<? super List<o>> dVar);

    public Object c(List<o> list, xb.d<? super e0> dVar) {
        return d(this, list, dVar);
    }

    public abstract Object e(o oVar, xb.d<? super Long> dVar);

    public Object f(List<o> list, xb.d<? super e0> dVar) {
        return g(this, list, dVar);
    }
}
