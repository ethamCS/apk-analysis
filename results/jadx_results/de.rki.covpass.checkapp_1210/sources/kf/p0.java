package kf;

import java.util.Iterator;
import java.util.Map;
import jf.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001b¢\u0006\u0004\b&\u0010'J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001b8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0001\u0002()¨\u0006*"}, d2 = {"Lkf/p0;", "Key", "Value", "Collection", BuildConfig.FLAVOR, "Builder", "Lkf/a;", BuildConfig.FLAVOR, "Ljf/c;", "decoder", "builder", BuildConfig.FLAVOR, "startIndex", "size", "Ltb/e0;", "o", "(Ljf/c;Ljava/util/Map;II)V", "index", BuildConfig.FLAVOR, "checkIndex", "p", "(Ljf/c;ILjava/util/Map;Z)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/KSerializer;", "keySerializer", "Lkotlinx/serialization/KSerializer;", "m", "()Lkotlinx/serialization/KSerializer;", "valueSerializer", "n", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lkf/h0;", "Lkf/x;", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class p0<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a */
    private final KSerializer<Key> f15219a;

    /* renamed from: b */
    private final KSerializer<Value> f15220b;

    private p0(KSerializer<Key> kSerializer, KSerializer<Value> kSerializer2) {
        super(null);
        this.f15219a = kSerializer;
        this.f15220b = kSerializer2;
    }

    public /* synthetic */ p0(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public abstract SerialDescriptor getDescriptor();

    public final KSerializer<Key> m() {
        return this.f15219a;
    }

    public final KSerializer<Value> n() {
        return this.f15220b;
    }

    /* renamed from: o */
    public final void g(jf.c cVar, Builder builder, int i10, int i11) {
        nc.g i12;
        nc.e h10;
        hc.t.e(cVar, "decoder");
        hc.t.e(builder, "builder");
        if (i11 >= 0) {
            i12 = nc.m.i(0, i11 * 2);
            h10 = nc.m.h(i12, 2);
            int a10 = h10.a();
            int b10 = h10.b();
            int d10 = h10.d();
            if ((d10 <= 0 || a10 > b10) && (d10 >= 0 || b10 > a10)) {
                return;
            }
            while (true) {
                h(cVar, i10 + a10, builder, false);
                if (a10 == b10) {
                    return;
                }
                a10 += d10;
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
    }

    /* renamed from: p */
    public final void h(jf.c cVar, int i10, Builder builder, boolean z10) {
        int i11;
        Object obj;
        Object i12;
        hc.t.e(cVar, "decoder");
        hc.t.e(builder, "builder");
        Object c10 = c.b.c(cVar, getDescriptor(), i10, this.f15219a, null, 8, null);
        boolean z11 = true;
        if (z10) {
            i11 = cVar.q(getDescriptor());
            if (i11 != i10 + 1) {
                z11 = false;
            }
            if (!z11) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + i11).toString());
            }
        } else {
            i11 = i10 + 1;
        }
        int i13 = i11;
        if (!builder.containsKey(c10) || (this.f15220b.getDescriptor().h() instanceof p000if.e)) {
            obj = c.b.c(cVar, getDescriptor(), i13, this.f15220b, null, 8, null);
        } else {
            SerialDescriptor descriptor = getDescriptor();
            KSerializer<Value> kSerializer = this.f15220b;
            i12 = ub.q0.i(builder, c10);
            obj = cVar.C(descriptor, i13, kSerializer, i12);
        }
        builder.put(c10, obj);
    }

    @Override // kotlinx.serialization.j
    public void serialize(Encoder encoder, Collection collection) {
        hc.t.e(encoder, "encoder");
        int e10 = e(collection);
        SerialDescriptor descriptor = getDescriptor();
        jf.d j10 = encoder.j(descriptor, e10);
        Iterator<Map.Entry<? extends Key, ? extends Value>> d10 = d(collection);
        int i10 = 0;
        while (d10.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = d10.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i11 = i10 + 1;
            j10.t(getDescriptor(), i10, m(), key);
            j10.t(getDescriptor(), i11, n(), value);
            i10 = i11 + 1;
        }
        j10.c(descriptor);
    }
}
