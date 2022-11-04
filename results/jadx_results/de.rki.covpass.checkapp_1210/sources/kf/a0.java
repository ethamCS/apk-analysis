package kf;

import java.util.Arrays;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u0011"}, d2 = {"Lkf/a0;", "Lkf/x0;", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "isInline", "Z", "()Z", BuildConfig.FLAVOR, "name", "Lkf/v;", "generatedSerializer", "<init>", "(Ljava/lang/String;Lkf/v;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a0 extends x0 {

    /* renamed from: m */
    private final boolean f15146m = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(String str, v<?> vVar) {
        super(str, vVar, 1);
        hc.t.e(str, "name");
        hc.t.e(vVar, "generatedSerializer");
    }

    @Override // kf.x0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (hc.t.a(l(), serialDescriptor.l())) {
                a0 a0Var = (a0) obj;
                if ((a0Var.isInline() && Arrays.equals(f(), a0Var.f())) && m() == serialDescriptor.m()) {
                    int m10 = m();
                    for (int i10 = 0; i10 < m10; i10++) {
                        if (hc.t.a(q(i10).l(), serialDescriptor.q(i10).l()) && hc.t.a(q(i10).h(), serialDescriptor.q(i10).h())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kf.x0
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kf.x0, kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f15146m;
    }
}
