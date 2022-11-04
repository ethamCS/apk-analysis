package mf;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lmf/n;", BuildConfig.FLAVOR, "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "e", "Ltb/e0;", "c", "(I)V", "d", "()I", "<set-?>", "isUnmarkedNull", "Z", "b", "()Z", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a */
    private final kf.r f16634a;

    /* renamed from: b */
    private boolean f16635b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a extends hc.q implements gc.p<SerialDescriptor, Integer, Boolean> {
        a(Object obj) {
            super(2, obj, n.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean i0(SerialDescriptor serialDescriptor, int i10) {
            hc.t.e(serialDescriptor, "p0");
            return Boolean.valueOf(((n) this.f11756d).e(serialDescriptor, i10));
        }

        @Override // gc.p
        public /* bridge */ /* synthetic */ Boolean u(SerialDescriptor serialDescriptor, Integer num) {
            return i0(serialDescriptor, num.intValue());
        }
    }

    public n(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "descriptor");
        this.f16634a = new kf.r(serialDescriptor, new a(this));
    }

    public final boolean e(SerialDescriptor serialDescriptor, int i10) {
        boolean z10 = !serialDescriptor.r(i10) && serialDescriptor.q(i10).o();
        this.f16635b = z10;
        return z10;
    }

    public final boolean b() {
        return this.f16635b;
    }

    public final void c(int i10) {
        this.f16634a.a(i10);
    }

    public final int d() {
        return this.f16634a.d();
    }
}
