package p000if;

import hc.t;
import kf.g1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import oc.d;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000\"$\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lnf/d;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "b", "Loc/d;", "context", "c", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Loc/d;", "getCapturedKClass$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "capturedKClass", "kotlinx-serialization-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: if.b */
/* loaded from: classes3.dex */
public final class b {
    public static final d<?> a(SerialDescriptor serialDescriptor) {
        t.e(serialDescriptor, "<this>");
        if (serialDescriptor instanceof c) {
            return ((c) serialDescriptor).f12520b;
        }
        if (!(serialDescriptor instanceof g1)) {
            return null;
        }
        return a(((g1) serialDescriptor).b());
    }

    public static final SerialDescriptor b(nf.d dVar, SerialDescriptor serialDescriptor) {
        KSerializer c10;
        t.e(dVar, "<this>");
        t.e(serialDescriptor, "descriptor");
        d<?> a10 = a(serialDescriptor);
        if (a10 == null || (c10 = nf.d.c(dVar, a10, null, 2, null)) == null) {
            return null;
        }
        return c10.getDescriptor();
    }

    public static final SerialDescriptor c(SerialDescriptor serialDescriptor, d<?> dVar) {
        t.e(serialDescriptor, "<this>");
        t.e(dVar, "context");
        return new c(serialDescriptor, dVar);
    }
}
