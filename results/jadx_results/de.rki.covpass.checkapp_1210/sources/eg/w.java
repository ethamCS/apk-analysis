package eg;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0002¨\u0006\u000b"}, d2 = {"Leg/w;", BuildConfig.FLAVOR, "Leg/v;", "c", "segment", "Ltb/e0;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "<init>", "()V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a */
    public static final w f9657a = new w();

    /* renamed from: b */
    private static final int f9658b = 65536;

    /* renamed from: c */
    private static final v f9659c = new v(new byte[0], 0, 0, false, false);

    /* renamed from: d */
    private static final int f9660d;

    /* renamed from: e */
    private static final AtomicReference<v>[] f9661e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f9660d = highestOneBit;
        AtomicReference<v>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f9661e = atomicReferenceArr;
    }

    private w() {
    }

    private final AtomicReference<v> a() {
        return f9661e[(int) (Thread.currentThread().getId() & (f9660d - 1))];
    }

    @fc.c
    public static final void b(v vVar) {
        AtomicReference<v> a10;
        v vVar2;
        hc.t.e(vVar, "segment");
        if (vVar.f9655f == null && vVar.f9656g == null) {
            if (vVar.f9653d || (vVar2 = (a10 = f9657a.a()).get()) == f9659c) {
                return;
            }
            int i10 = vVar2 == null ? 0 : vVar2.f9652c;
            if (i10 >= f9658b) {
                return;
            }
            vVar.f9655f = vVar2;
            vVar.f9651b = 0;
            vVar.f9652c = i10 + 8192;
            if (a10.compareAndSet(vVar2, vVar)) {
                return;
            }
            vVar.f9655f = null;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @fc.c
    public static final v c() {
        AtomicReference<v> a10 = f9657a.a();
        v vVar = f9659c;
        v andSet = a10.getAndSet(vVar);
        if (andSet == vVar) {
            return new v();
        }
        if (andSet == null) {
            a10.set(null);
            return new v();
        }
        a10.set(andSet.f9655f);
        andSet.f9655f = null;
        andSet.f9652c = 0;
        return andSet;
    }
}
