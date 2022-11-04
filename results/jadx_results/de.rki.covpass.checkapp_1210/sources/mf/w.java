package mf;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.conscrypt.BuildConfig;
import ub.q0;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lmf/w;", "Lmf/u;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "desc", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "Z", "descriptor", "q", "tag", "Lkotlinx/serialization/json/JsonElement;", "d0", "Ltb/e0;", "c", "Lkotlinx/serialization/json/JsonObject;", "value", "Lkotlinx/serialization/json/JsonObject;", "v0", "()Lkotlinx/serialization/json/JsonObject;", "Llf/a;", "json", "<init>", "(Llf/a;Lkotlinx/serialization/json/JsonObject;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class w extends u {

    /* renamed from: k */
    private final JsonObject f16651k;

    /* renamed from: l */
    private final List<String> f16652l;

    /* renamed from: m */
    private final int f16653m;

    /* renamed from: n */
    private int f16654n = -1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(lf.a aVar, JsonObject jsonObject) {
        super(aVar, jsonObject, null, null, 12, null);
        List<String> F0;
        hc.t.e(aVar, "json");
        hc.t.e(jsonObject, "value");
        this.f16651k = jsonObject;
        F0 = ub.c0.F0(r0().keySet());
        this.f16652l = F0;
        this.f16653m = F0.size() * 2;
    }

    @Override // mf.u, kf.q0
    protected String Z(SerialDescriptor serialDescriptor, int i10) {
        hc.t.e(serialDescriptor, "desc");
        return this.f16652l.get(i10 / 2);
    }

    @Override // mf.u, mf.c, jf.c
    public void c(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "descriptor");
    }

    @Override // mf.u, mf.c
    protected JsonElement d0(String str) {
        Object i10;
        hc.t.e(str, "tag");
        if (this.f16654n % 2 == 0) {
            return lf.g.a(str);
        }
        i10 = q0.i(r0(), str);
        return (JsonElement) i10;
    }

    @Override // mf.u, jf.c
    public int q(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "descriptor");
        int i10 = this.f16654n;
        if (i10 < this.f16653m - 1) {
            int i11 = i10 + 1;
            this.f16654n = i11;
            return i11;
        }
        return -1;
    }

    @Override // mf.u
    /* renamed from: v0 */
    public JsonObject r0() {
        return this.f16651k;
    }
}
