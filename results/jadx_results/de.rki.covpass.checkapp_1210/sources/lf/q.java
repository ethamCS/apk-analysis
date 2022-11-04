package lf;

import hc.p0;
import hc.t;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Llf/q;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "b", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class q implements KSerializer<JsonObject> {

    /* renamed from: a */
    public static final q f16010a = new q();

    /* renamed from: b */
    private static final SerialDescriptor f16011b = a.f16012b;

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\f8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\f8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00188\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u00020\b8\u0016X\u0097D¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Llf/q$a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p", "q", BuildConfig.FLAVOR, "name", "k", "n", BuildConfig.FLAVOR, "r", "j", "()Ljava/util/List;", "annotations", "m", "()I", "elementsCount", "isInline", "()Z", "o", "isNullable", "Lif/i;", "h", "()Lif/i;", "kind", "serialName", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "getSerialName$annotations", "()V", "<init>", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    private static final class a implements SerialDescriptor {

        /* renamed from: b */
        public static final a f16012b = new a();

        /* renamed from: c */
        private static final String f16013c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a */
        private final /* synthetic */ SerialDescriptor f16014a = BuiltinSerializersKt.k(BuiltinSerializersKt.serializer(p0.f11777a), h.f15995a).getDescriptor();

        private a() {
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public p000if.i h() {
            return this.f16014a.h();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isInline() {
            return this.f16014a.isInline();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List<Annotation> j() {
            return this.f16014a.j();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int k(String str) {
            t.e(str, "name");
            return this.f16014a.k(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String l() {
            return f16013c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int m() {
            return this.f16014a.m();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String n(int i10) {
            return this.f16014a.n(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean o() {
            return this.f16014a.o();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List<Annotation> p(int i10) {
            return this.f16014a.p(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public SerialDescriptor q(int i10) {
            return this.f16014a.q(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean r(int i10) {
            return this.f16014a.r(i10);
        }
    }

    private q() {
    }

    /* renamed from: a */
    public JsonObject deserialize(Decoder decoder) {
        t.e(decoder, "decoder");
        i.g(decoder);
        return new JsonObject((Map) BuiltinSerializersKt.k(BuiltinSerializersKt.serializer(p0.f11777a), h.f15995a).deserialize(decoder));
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, JsonObject jsonObject) {
        t.e(encoder, "encoder");
        t.e(jsonObject, "value");
        i.h(encoder);
        BuiltinSerializersKt.k(BuiltinSerializersKt.serializer(p0.f11777a), h.f15995a).serialize(encoder, jsonObject);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return f16011b;
    }
}
