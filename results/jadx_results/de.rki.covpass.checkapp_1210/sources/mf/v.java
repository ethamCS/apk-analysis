package mf;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0014J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lmf/v;", "Lmf/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "desc", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "Z", "tag", "Lkotlinx/serialization/json/JsonElement;", "d0", "descriptor", "q", "Lkotlinx/serialization/json/JsonArray;", "value", "Lkotlinx/serialization/json/JsonArray;", "t0", "()Lkotlinx/serialization/json/JsonArray;", "Llf/a;", "json", "<init>", "(Llf/a;Lkotlinx/serialization/json/JsonArray;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class v extends c {

    /* renamed from: f */
    private final JsonArray f16648f;

    /* renamed from: g */
    private final int f16649g = r0().size();

    /* renamed from: h */
    private int f16650h = -1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(lf.a aVar, JsonArray jsonArray) {
        super(aVar, jsonArray, null);
        hc.t.e(aVar, "json");
        hc.t.e(jsonArray, "value");
        this.f16648f = jsonArray;
    }

    @Override // kf.q0
    protected String Z(SerialDescriptor serialDescriptor, int i10) {
        hc.t.e(serialDescriptor, "desc");
        return String.valueOf(i10);
    }

    @Override // mf.c
    protected JsonElement d0(String str) {
        hc.t.e(str, "tag");
        return r0().get(Integer.parseInt(str));
    }

    @Override // jf.c
    public int q(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "descriptor");
        int i10 = this.f16650h;
        if (i10 < this.f16649g - 1) {
            int i11 = i10 + 1;
            this.f16650h = i11;
            return i11;
        }
        return -1;
    }

    /* renamed from: t0 */
    public JsonArray r0() {
        return this.f16648f;
    }
}
