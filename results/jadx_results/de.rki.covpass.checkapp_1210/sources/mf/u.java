package mf;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.conscrypt.BuildConfig;
import p000if.i;
import ub.q0;
import ub.y0;
import ub.z0;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lmf/u;", "Lmf/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "tag", BuildConfig.FLAVOR, "u0", "t0", "q", "l", "desc", "Z", "Lkotlinx/serialization/json/JsonElement;", "d0", "Ljf/c;", "b", "Ltb/e0;", "c", "Lkotlinx/serialization/json/JsonObject;", "value", "Lkotlinx/serialization/json/JsonObject;", "v0", "()Lkotlinx/serialization/json/JsonObject;", "Llf/a;", "json", "polyDiscriminator", "polyDescriptor", "<init>", "(Llf/a;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class u extends c {

    /* renamed from: f */
    private final JsonObject f16643f;

    /* renamed from: g */
    private final String f16644g;

    /* renamed from: h */
    private final SerialDescriptor f16645h;

    /* renamed from: i */
    private int f16646i;

    /* renamed from: j */
    private boolean f16647j;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    /* synthetic */ class a extends hc.q implements gc.a<Map<String, ? extends Integer>> {
        a(Object obj) {
            super(0, obj, r.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
        }

        /* renamed from: i0 */
        public final Map<String, Integer> invoke() {
            return r.a((SerialDescriptor) this.f11756d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(lf.a aVar, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor) {
        super(aVar, jsonObject, null);
        hc.t.e(aVar, "json");
        hc.t.e(jsonObject, "value");
        this.f16643f = jsonObject;
        this.f16644g = str;
        this.f16645h = serialDescriptor;
    }

    public /* synthetic */ u(lf.a aVar, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, jsonObject, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : serialDescriptor);
    }

    private final boolean t0(SerialDescriptor serialDescriptor, int i10) {
        boolean z10 = !d().f().f() && !serialDescriptor.r(i10) && serialDescriptor.q(i10).o();
        this.f16647j = z10;
        return z10;
    }

    private final boolean u0(SerialDescriptor serialDescriptor, int i10, String str) {
        lf.a d10 = d();
        SerialDescriptor q10 = serialDescriptor.q(i10);
        if (q10.o() || !(d0(str) instanceof JsonNull)) {
            if (hc.t.a(q10.h(), i.b.f12552a)) {
                JsonElement d02 = d0(str);
                String str2 = null;
                JsonPrimitive jsonPrimitive = d02 instanceof JsonPrimitive ? (JsonPrimitive) d02 : null;
                if (jsonPrimitive != null) {
                    str2 = lf.g.d(jsonPrimitive);
                }
                if (str2 != null && r.d(q10, d10, str2) == -3) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // kf.q0
    protected String Z(SerialDescriptor serialDescriptor, int i10) {
        Object obj;
        boolean z10;
        hc.t.e(serialDescriptor, "desc");
        String n10 = serialDescriptor.n(i10);
        if (this.f16610e.j() && !r0().keySet().contains(n10)) {
            Map map = (Map) lf.s.a(d()).b(serialDescriptor, r.c(), new a(serialDescriptor));
            Iterator<T> it = r0().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Integer num = (Integer) map.get((String) obj);
                if (num != null && num.intValue() == i10) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            String str = (String) obj;
            return str == null ? n10 : str;
        }
        return n10;
    }

    @Override // mf.c, kotlinx.serialization.encoding.Decoder
    public jf.c b(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "descriptor");
        return serialDescriptor == this.f16645h ? this : super.b(serialDescriptor);
    }

    @Override // mf.c, jf.c
    public void c(SerialDescriptor serialDescriptor) {
        Set<String> set;
        hc.t.e(serialDescriptor, "descriptor");
        if (this.f16610e.g() || (serialDescriptor.h() instanceof p000if.d)) {
            return;
        }
        if (!this.f16610e.j()) {
            set = kf.e0.a(serialDescriptor);
        } else {
            Set<String> a10 = kf.e0.a(serialDescriptor);
            Map map = (Map) lf.s.a(d()).a(serialDescriptor, r.c());
            Set keySet = map != null ? map.keySet() : null;
            if (keySet == null) {
                keySet = y0.b();
            }
            set = z0.h(a10, keySet);
        }
        for (String str : r0().keySet()) {
            if (!set.contains(str) && !hc.t.a(str, this.f16644g)) {
                throw q.f(str, r0().toString());
            }
        }
    }

    @Override // mf.c
    protected JsonElement d0(String str) {
        Object i10;
        hc.t.e(str, "tag");
        i10 = q0.i(r0(), str);
        return (JsonElement) i10;
    }

    @Override // mf.c, kf.l1, kotlinx.serialization.encoding.Decoder
    public boolean l() {
        return !this.f16647j && super.l();
    }

    @Override // jf.c
    public int q(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "descriptor");
        while (this.f16646i < serialDescriptor.m()) {
            int i10 = this.f16646i;
            this.f16646i = i10 + 1;
            String U = U(serialDescriptor, i10);
            int i11 = this.f16646i - 1;
            this.f16647j = false;
            if (r0().containsKey(U) || t0(serialDescriptor, i11)) {
                if (!this.f16610e.d() || !u0(serialDescriptor, i11, U)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    /* renamed from: v0 */
    public JsonObject r0() {
        return this.f16643f;
    }
}
