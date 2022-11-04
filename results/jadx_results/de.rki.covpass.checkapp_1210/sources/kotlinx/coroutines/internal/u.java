package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.m2;
import kotlinx.coroutines.z0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u001e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lkotlinx/coroutines/internal/u;", "Lkotlinx/coroutines/m2;", "Lkotlinx/coroutines/z0;", BuildConfig.FLAVOR, "k1", "Lxb/g;", "context", BuildConfig.FLAVOR, "R0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "j1", BuildConfig.FLAVOR, "timeMillis", "Lkotlinx/coroutines/p;", "Ltb/e0;", "continuation", "l1", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "q", "Ljava/lang/Throwable;", "cause", "x", "Ljava/lang/String;", "errorHint", "h1", "()Lkotlinx/coroutines/m2;", "immediate", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class u extends m2 implements z0 {

    /* renamed from: q */
    private final Throwable f15460q;

    /* renamed from: x */
    private final String f15461x;

    public u(Throwable th2, String str) {
        this.f15460q = th2;
        this.f15461x = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Void k1() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f15460q
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f15461x
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f15460q
            r1.<init>(r0, r2)
            throw r1
        L36:
            kotlinx.coroutines.internal.t.d()
            tb.i r0 = new tb.i
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.u.k1():java.lang.Void");
    }

    @Override // kotlinx.coroutines.l0
    public boolean R0(xb.g gVar) {
        k1();
        throw new tb.i();
    }

    @Override // kotlinx.coroutines.m2
    public m2 h1() {
        return this;
    }

    /* renamed from: j1 */
    public Void u0(xb.g gVar, Runnable runnable) {
        k1();
        throw new tb.i();
    }

    /* renamed from: l1 */
    public Void b(long j10, kotlinx.coroutines.p<? super tb.e0> pVar) {
        k1();
        throw new tb.i();
    }

    @Override // kotlinx.coroutines.m2, kotlinx.coroutines.l0
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f15460q != null) {
            str = ", cause=" + this.f15460q;
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }
}
