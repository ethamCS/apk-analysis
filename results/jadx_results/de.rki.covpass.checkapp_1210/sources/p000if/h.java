package p000if;

import bf.x;
import gc.l;
import hc.t;
import hc.v;
import java.util.List;
import kf.e1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
import p000if.j;
import tb.e0;
import ub.m;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b\u001aI\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000e2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {BuildConfig.FLAVOR, "serialName", BuildConfig.FLAVOR, "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameters", "Lkotlin/Function1;", "Lif/a;", "Ltb/e0;", "builderAction", "b", "(Ljava/lang/String;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lgc/l;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lif/e;", "kind", "a", "Lif/i;", "builder", "c", "(Ljava/lang/String;Lif/i;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lgc/l;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: if.h */
/* loaded from: classes3.dex */
public final class h {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lif/a;", "Ltb/e0;", "b", "(Lif/a;)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: if.h$a */
    /* loaded from: classes3.dex */
    public static final class a extends v implements l<p000if.a, e0> {

        /* renamed from: c */
        public static final a f12550c = new a();

        a() {
            super(1);
        }

        public final void b(p000if.a aVar) {
            t.e(aVar, "$this$null");
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(p000if.a aVar) {
            b(aVar);
            return e0.f22152a;
        }
    }

    public static final SerialDescriptor a(String str, e eVar) {
        boolean x10;
        t.e(str, "serialName");
        t.e(eVar, "kind");
        x10 = x.x(str);
        if (!x10) {
            return e1.a(str, eVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final SerialDescriptor b(String str, SerialDescriptor[] serialDescriptorArr, l<? super p000if.a, e0> lVar) {
        boolean x10;
        List i02;
        t.e(str, "serialName");
        t.e(serialDescriptorArr, "typeParameters");
        t.e(lVar, "builderAction");
        x10 = x.x(str);
        if (!x10) {
            p000if.a aVar = new p000if.a(str);
            lVar.invoke(aVar);
            j.a aVar2 = j.a.f12553a;
            int size = aVar.f().size();
            i02 = m.i0(serialDescriptorArr);
            return new f(str, aVar2, size, i02, aVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final SerialDescriptor c(String str, i iVar, SerialDescriptor[] serialDescriptorArr, l<? super p000if.a, e0> lVar) {
        boolean x10;
        List i02;
        t.e(str, "serialName");
        t.e(iVar, "kind");
        t.e(serialDescriptorArr, "typeParameters");
        t.e(lVar, "builder");
        x10 = x.x(str);
        if (!x10) {
            if (!(!t.a(iVar, j.a.f12553a))) {
                throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
            }
            p000if.a aVar = new p000if.a(str);
            lVar.invoke(aVar);
            int size = aVar.f().size();
            i02 = m.i0(serialDescriptorArr);
            return new f(str, iVar, size, i02, aVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static /* synthetic */ SerialDescriptor d(String str, i iVar, SerialDescriptor[] serialDescriptorArr, l lVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            lVar = a.f12550c;
        }
        return c(str, iVar, serialDescriptorArr, lVar);
    }
}
