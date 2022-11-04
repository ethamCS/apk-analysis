package kotlinx.serialization.json;

import hc.v;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.h;
import lf.p;
import org.conscrypt.BuildConfig;
import tb.m;
import tb.o;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/KSerializer;", "serializer", BuildConfig.FLAVOR, "b", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "content", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
@h(with = p.class)
/* loaded from: classes3.dex */
public final class JsonNull extends JsonPrimitive {

    /* renamed from: a */
    public static final JsonNull f15603a = new JsonNull();

    /* renamed from: b */
    private static final String f15604b = "null";

    /* renamed from: c */
    private static final /* synthetic */ Lazy<KSerializer<Object>> f15605c;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a extends v implements gc.a<KSerializer<Object>> {

        /* renamed from: c */
        public static final a f15606c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final KSerializer<Object> invoke() {
            return p.f16008a;
        }
    }

    static {
        Lazy<KSerializer<Object>> b10;
        b10 = m.b(o.PUBLICATION, a.f15606c);
        f15605c = b10;
    }

    private JsonNull() {
        super(null);
    }

    private final /* synthetic */ Lazy b() {
        return f15605c;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String a() {
        return f15604b;
    }

    public final KSerializer<JsonNull> serializer() {
        return (KSerializer) b().getValue();
    }
}
