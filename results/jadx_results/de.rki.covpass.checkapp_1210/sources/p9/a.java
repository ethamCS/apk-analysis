package p9;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import zb.f;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0097@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lp9/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lp9/d;", "b", "(Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "countries", "Ltb/e0;", "d", "(Ljava/util/Collection;Lxb/d;)Ljava/lang/Object;", "country", "c", "(Lp9/d;Lxb/d;)Ljava/lang/Object;", "a", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class a {

    @f(c = "de.rki.covpass.sdk.rules.local.countries.CountriesDao", f = "CountriesDao.kt", l = {21, 23}, m = "insertAll$suspendImpl")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: p9.a$a */
    /* loaded from: classes.dex */
    public static final class C0297a extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f19001x;

        /* renamed from: y */
        Object f19002y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0297a(xb.d<? super C0297a> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return a.e(a.this, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object e(p9.a r11, java.util.Collection r12, xb.d r13) {
        /*
            boolean r0 = r13 instanceof p9.a.C0297a
            if (r0 == 0) goto L13
            r0 = r13
            p9.a$a r0 = (p9.a.C0297a) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            p9.a$a r0 = new p9.a$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r11 = r0.f19002y
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r0.f19001x
            p9.a r12 = (p9.a) r12
            tb.t.b(r13)
            goto L60
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            java.lang.Object r11 = r0.f19002y
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r11 = r0.f19001x
            p9.a r11 = (p9.a) r11
            tb.t.b(r13)
            goto L59
        L49:
            tb.t.b(r13)
            r0.f19001x = r11
            r0.f19002y = r12
            r0.W3 = r4
            java.lang.Object r13 = r11.a(r0)
            if (r13 != r1) goto L59
            return r1
        L59:
            java.util.Iterator r12 = r12.iterator()
            r10 = r12
            r12 = r11
            r11 = r10
        L60:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L84
            java.lang.Object r13 = r11.next()
            r7 = r13
            java.lang.String r7 = (java.lang.String) r7
            p9.d r13 = new p9.d
            r5 = 0
            r8 = 1
            r9 = 0
            r4 = r13
            r4.<init>(r5, r7, r8, r9)
            r0.f19001x = r12
            r0.f19002y = r11
            r0.W3 = r3
            java.lang.Object r13 = r12.c(r13, r0)
            if (r13 != r1) goto L60
            return r1
        L84:
            tb.e0 r11 = tb.e0.f22152a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.a.e(p9.a, java.util.Collection, xb.d):java.lang.Object");
    }

    public abstract Object a(xb.d<? super e0> dVar);

    public abstract Object b(xb.d<? super List<d>> dVar);

    public abstract Object c(d dVar, xb.d<? super e0> dVar2);

    public Object d(Collection<String> collection, xb.d<? super e0> dVar) {
        return e(this, collection, dVar);
    }
}
