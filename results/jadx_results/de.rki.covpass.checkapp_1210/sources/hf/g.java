package hf;

import hc.t;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lhf/g;", "Lhf/k;", "Ltb/e0;", "O", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", BuildConfig.FLAVOR, "q", "Lgf/b;", "cbor", "Lhf/c;", "decoder", "<init>", "(Lgf/b;Lhf/c;)V", "kotlinx-serialization-cbor"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class g extends k {

    /* renamed from: g */
    private int f11895g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gf.b bVar, c cVar) {
        super(bVar, cVar);
        t.e(bVar, "cbor");
        t.e(cVar, "decoder");
    }

    @Override // hf.k
    protected void O() {
        N(J().A());
    }

    @Override // hf.k, jf.c
    public int q(SerialDescriptor serialDescriptor) {
        t.e(serialDescriptor, "descriptor");
        if ((K() || !J().c()) && (!K() || this.f11895g < L())) {
            int i10 = this.f11895g;
            this.f11895g = i10 + 1;
            return i10;
        }
        return -1;
    }
}
