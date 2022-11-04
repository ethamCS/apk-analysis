package mf;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nf.f;
import org.conscrypt.BuildConfig;
import p000if.i;
import p000if.j;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J\u001c\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002JB\u0010\u0010\u001a\u00020\u0006\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042 \u0010\u000f\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\fH\u0016JF\u0010\u0015\u001a\u00020\u0006\"\b\b\u0000\u0010\u0011*\u00020\t\"\b\b\u0001\u0010\u0012*\u00028\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016J<\u0010\u0018\u001a\u00020\u0006\"\b\b\u0000\u0010\u0011*\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00160\fH\u0016J@\u0010\u001c\u001a\u00020\u0006\"\b\b\u0000\u0010\u0011*\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u001e\u0010\u001b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u001a0\fH\u0016¨\u0006\""}, d2 = {"Lmf/z;", "Lnf/f;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Loc/d;", "actualClass", "Ltb/e0;", "g", "f", BuildConfig.FLAVOR, "T", "kClass", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "provider", "d", "Base", "Sub", "baseClass", "actualSerializer", "a", "Lkotlinx/serialization/j;", "defaultSerializerProvider", "c", BuildConfig.FLAVOR, "Lkotlinx/serialization/b;", "defaultDeserializerProvider", "b", BuildConfig.FLAVOR, "useArrayPolymorphism", "discriminator", "<init>", "(ZLjava/lang/String;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class z implements nf.f {

    /* renamed from: a */
    private final boolean f16663a;

    /* renamed from: b */
    private final String f16664b;

    public z(boolean z10, String str) {
        hc.t.e(str, "discriminator");
        this.f16663a = z10;
        this.f16664b = str;
    }

    private final void f(SerialDescriptor serialDescriptor, oc.d<?> dVar) {
        int m10 = serialDescriptor.m();
        for (int i10 = 0; i10 < m10; i10++) {
            String n10 = serialDescriptor.n(i10);
            if (hc.t.a(n10, this.f16664b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + dVar + " has property '" + n10 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void g(SerialDescriptor serialDescriptor, oc.d<?> dVar) {
        p000if.i h10 = serialDescriptor.h();
        if ((h10 instanceof p000if.d) || hc.t.a(h10, i.a.f12551a)) {
            throw new IllegalArgumentException("Serializer for " + dVar.G() + " can't be registered as a subclass for polymorphic serialization because its kind " + h10 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        } else if (this.f16663a) {
        } else {
            if (!hc.t.a(h10, j.b.f12554a) && !hc.t.a(h10, j.c.f12555a) && !(h10 instanceof p000if.e) && !(h10 instanceof i.b)) {
                return;
            }
            throw new IllegalArgumentException("Serializer for " + dVar.G() + " of kind " + h10 + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    @Override // nf.f
    public <Base, Sub extends Base> void a(oc.d<Base> dVar, oc.d<Sub> dVar2, KSerializer<Sub> kSerializer) {
        hc.t.e(dVar, "baseClass");
        hc.t.e(dVar2, "actualClass");
        hc.t.e(kSerializer, "actualSerializer");
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        g(descriptor, dVar2);
        if (!this.f16663a) {
            f(descriptor, dVar2);
        }
    }

    @Override // nf.f
    public <Base> void b(oc.d<Base> dVar, gc.l<? super String, ? extends kotlinx.serialization.b<? extends Base>> lVar) {
        hc.t.e(dVar, "baseClass");
        hc.t.e(lVar, "defaultDeserializerProvider");
    }

    @Override // nf.f
    public <Base> void c(oc.d<Base> dVar, gc.l<? super Base, ? extends kotlinx.serialization.j<? super Base>> lVar) {
        hc.t.e(dVar, "baseClass");
        hc.t.e(lVar, "defaultSerializerProvider");
    }

    @Override // nf.f
    public <T> void d(oc.d<T> dVar, gc.l<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> lVar) {
        hc.t.e(dVar, "kClass");
        hc.t.e(lVar, "provider");
    }

    @Override // nf.f
    public <T> void e(oc.d<T> dVar, KSerializer<T> kSerializer) {
        f.a.a(this, dVar, kSerializer);
    }
}
