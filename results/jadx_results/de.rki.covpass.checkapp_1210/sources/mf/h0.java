package mf;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p000if.i;
import p000if.j;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\b"}, d2 = {"Llf/a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "desc", "Lmf/g0;", "b", "Lnf/d;", "module", "a", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class h0 {
    public static final SerialDescriptor a(SerialDescriptor serialDescriptor, nf.d dVar) {
        SerialDescriptor a10;
        hc.t.e(serialDescriptor, "<this>");
        hc.t.e(dVar, "module");
        if (!hc.t.a(serialDescriptor.h(), i.a.f12551a)) {
            return serialDescriptor.isInline() ? a(serialDescriptor.q(0), dVar) : serialDescriptor;
        }
        SerialDescriptor b10 = p000if.b.b(dVar, serialDescriptor);
        return (b10 == null || (a10 = a(b10, dVar)) == null) ? serialDescriptor : a10;
    }

    public static final g0 b(lf.a aVar, SerialDescriptor serialDescriptor) {
        hc.t.e(aVar, "<this>");
        hc.t.e(serialDescriptor, "desc");
        p000if.i h10 = serialDescriptor.h();
        if (h10 instanceof p000if.d) {
            return g0.POLY_OBJ;
        }
        if (!hc.t.a(h10, j.b.f12554a)) {
            if (!hc.t.a(h10, j.c.f12555a)) {
                return g0.OBJ;
            }
            SerialDescriptor a10 = a(serialDescriptor.q(0), aVar.a());
            p000if.i h11 = a10.h();
            if ((h11 instanceof p000if.e) || hc.t.a(h11, i.b.f12552a)) {
                return g0.MAP;
            }
            if (!aVar.f().b()) {
                throw q.c(a10);
            }
        }
        return g0.LIST;
    }
}
