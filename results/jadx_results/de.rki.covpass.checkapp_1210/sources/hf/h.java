package hf;

import hc.t;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lhf/h;", "Lhf/l;", "Ltb/e0;", "I", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "F", "Lgf/b;", "cbor", "Lhf/f;", "encoder", "<init>", "(Lgf/b;Lhf/f;)V", "kotlinx-serialization-cbor"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class h extends l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gf.b bVar, f fVar) {
        super(bVar, fVar);
        t.e(bVar, "cbor");
        t.e(fVar, "encoder");
    }

    @Override // hf.l, jf.b
    public boolean F(SerialDescriptor serialDescriptor, int i10) {
        t.e(serialDescriptor, "descriptor");
        return true;
    }

    @Override // hf.l
    protected void I() {
        H().n();
    }
}
