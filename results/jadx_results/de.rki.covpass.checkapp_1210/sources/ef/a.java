package ef;

import ef.c;
import hc.t;
import java.util.Arrays;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010R>\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t8\u0004@BX\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lef/a;", "Lef/c;", "S", BuildConfig.FLAVOR, "Lkotlinx/coroutines/internal/SynchronizedObject;", "l", "()Lef/c;", BuildConfig.FLAVOR, "size", BuildConfig.FLAVOR, "m", "(I)[Lef/c;", "k", "slot", "Ltb/e0;", "n", "(Lef/c;)V", "<set-?>", "slots", "[Lef/c;", "p", "()[Lef/c;", "getSlots$annotations", "()V", "nCollectors", "I", "o", "()I", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class a<S extends c<?>> {

    /* renamed from: c */
    private S[] f9555c;

    /* renamed from: d */
    private int f9556d;

    /* renamed from: q */
    private int f9557q;

    public final S k() {
        S s10;
        synchronized (this) {
            S[] sArr = this.f9555c;
            if (sArr == null) {
                sArr = m(2);
                this.f9555c = sArr;
            } else if (this.f9556d >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                t.d(copyOf, "copyOf(this, newSize)");
                this.f9555c = (S[]) ((c[]) copyOf);
                sArr = (S[]) ((c[]) copyOf);
            }
            int i10 = this.f9557q;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = l();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
            } while (!s10.a(this));
            this.f9557q = i10;
            this.f9556d++;
        }
        return s10;
    }

    protected abstract S l();

    protected abstract S[] m(int i10);

    public final void n(S s10) {
        int i10;
        xb.d<e0>[] b10;
        synchronized (this) {
            int i11 = this.f9556d - 1;
            this.f9556d = i11;
            if (i11 == 0) {
                this.f9557q = 0;
            }
            b10 = s10.b(this);
        }
        for (xb.d<e0> dVar : b10) {
            if (dVar != null) {
                s.a aVar = s.Companion;
                dVar.y(s.c(e0.f22152a));
            }
        }
    }

    public final int o() {
        return this.f9556d;
    }

    public final S[] p() {
        return this.f9555c;
    }
}
