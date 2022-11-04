package kotlinx.serialization;

import hc.p0;
import hc.t;
import hc.v;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
import p000if.d;
import p000if.i;
import tb.e0;
import tb.m;
import tb.o;
import ub.u;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lkotlinx/serialization/e;", BuildConfig.FLAVOR, "T", "Lkf/b;", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "Ljava/util/List;", "_annotations", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Loc/d;", "baseClass", "Loc/d;", "e", "()Loc/d;", "<init>", "(Loc/d;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e<T> extends kf.b<T> {

    /* renamed from: a */
    private final oc.d<T> f15589a;

    /* renamed from: b */
    private List<? extends Annotation> f15590b;

    /* renamed from: c */
    private final Lazy f15591c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.a<SerialDescriptor> {

        /* renamed from: c */
        final /* synthetic */ e<T> f15592c;

        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "T", "Lif/a;", "Ltb/e0;", "b", "(Lif/a;)V"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.serialization.e$a$a */
        /* loaded from: classes3.dex */
        public static final class C0235a extends v implements gc.l<p000if.a, e0> {

            /* renamed from: c */
            final /* synthetic */ e<T> f15593c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0235a(e<T> eVar) {
                super(1);
                this.f15593c = eVar;
            }

            public final void b(p000if.a aVar) {
                t.e(aVar, "$this$buildSerialDescriptor");
                p000if.a.b(aVar, "type", BuiltinSerializersKt.serializer(p0.f11777a).getDescriptor(), null, false, 12, null);
                p000if.a.b(aVar, "value", p000if.h.d("kotlinx.serialization.Polymorphic<" + this.f15593c.e().G() + '>', i.a.f12551a, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
                aVar.h(((e) this.f15593c).f15590b);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(p000if.a aVar) {
                b(aVar);
                return e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e<T> eVar) {
            super(0);
            this.f15592c = eVar;
        }

        /* renamed from: b */
        public final SerialDescriptor invoke() {
            return p000if.b.c(p000if.h.c("kotlinx.serialization.Polymorphic", d.a.f12522a, new SerialDescriptor[0], new C0235a(this.f15592c)), this.f15592c.e());
        }
    }

    public e(oc.d<T> dVar) {
        List<? extends Annotation> h10;
        Lazy b10;
        t.e(dVar, "baseClass");
        this.f15589a = dVar;
        h10 = u.h();
        this.f15590b = h10;
        b10 = m.b(o.PUBLICATION, new a(this));
        this.f15591c = b10;
    }

    @Override // kf.b
    public oc.d<T> e() {
        return this.f15589a;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f15591c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + e() + ')';
    }
}
