package lf;

import hc.t;
import hc.v;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p000if.d;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Llf/h;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "b", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class h implements KSerializer<JsonElement> {

    /* renamed from: a */
    public static final h f15995a = new h();

    /* renamed from: b */
    private static final SerialDescriptor f15996b = p000if.h.c("kotlinx.serialization.json.JsonElement", d.b.f12523a, new SerialDescriptor[0], a.f15997c);

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lif/a;", "Ltb/e0;", "b", "(Lif/a;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    static final class a extends v implements gc.l<p000if.a, e0> {

        /* renamed from: c */
        public static final a f15997c = new a();

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: lf.h$a$a */
        /* loaded from: classes3.dex */
        public static final class C0241a extends v implements gc.a<SerialDescriptor> {

            /* renamed from: c */
            public static final C0241a f15998c = new C0241a();

            C0241a() {
                super(0);
            }

            /* renamed from: b */
            public final SerialDescriptor invoke() {
                return r.f16015a.getDescriptor();
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class b extends v implements gc.a<SerialDescriptor> {

            /* renamed from: c */
            public static final b f15999c = new b();

            b() {
                super(0);
            }

            /* renamed from: b */
            public final SerialDescriptor invoke() {
                return p.f16008a.getDescriptor();
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class c extends v implements gc.a<SerialDescriptor> {

            /* renamed from: c */
            public static final c f16000c = new c();

            c() {
                super(0);
            }

            /* renamed from: b */
            public final SerialDescriptor invoke() {
                return n.f16006a.getDescriptor();
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class d extends v implements gc.a<SerialDescriptor> {

            /* renamed from: c */
            public static final d f16001c = new d();

            d() {
                super(0);
            }

            /* renamed from: b */
            public final SerialDescriptor invoke() {
                return q.f16010a.getDescriptor();
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class e extends v implements gc.a<SerialDescriptor> {

            /* renamed from: c */
            public static final e f16002c = new e();

            e() {
                super(0);
            }

            /* renamed from: b */
            public final SerialDescriptor invoke() {
                return lf.b.f15965a.getDescriptor();
            }
        }

        a() {
            super(1);
        }

        public final void b(p000if.a aVar) {
            SerialDescriptor f10;
            SerialDescriptor f11;
            SerialDescriptor f12;
            SerialDescriptor f13;
            SerialDescriptor f14;
            t.e(aVar, "$this$buildSerialDescriptor");
            f10 = i.f(C0241a.f15998c);
            p000if.a.b(aVar, "JsonPrimitive", f10, null, false, 12, null);
            f11 = i.f(b.f15999c);
            p000if.a.b(aVar, "JsonNull", f11, null, false, 12, null);
            f12 = i.f(c.f16000c);
            p000if.a.b(aVar, "JsonLiteral", f12, null, false, 12, null);
            f13 = i.f(d.f16001c);
            p000if.a.b(aVar, "JsonObject", f13, null, false, 12, null);
            f14 = i.f(e.f16002c);
            p000if.a.b(aVar, "JsonArray", f14, null, false, 12, null);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(p000if.a aVar) {
            b(aVar);
            return e0.f22152a;
        }
    }

    private h() {
    }

    /* renamed from: a */
    public JsonElement deserialize(Decoder decoder) {
        t.e(decoder, "decoder");
        return i.d(decoder).v();
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, JsonElement jsonElement) {
        kotlinx.serialization.b bVar;
        t.e(encoder, "encoder");
        t.e(jsonElement, "value");
        i.h(encoder);
        if (jsonElement instanceof JsonPrimitive) {
            bVar = r.f16015a;
        } else if (jsonElement instanceof JsonObject) {
            bVar = q.f16010a;
        } else if (!(jsonElement instanceof JsonArray)) {
            return;
        } else {
            bVar = b.f15965a;
        }
        encoder.e(bVar, jsonElement);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return f15996b;
    }
}
