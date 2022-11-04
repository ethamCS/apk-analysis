package kf;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000\u001a!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0010\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\bH\u0000\u001a\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b*\u00020\u000bH\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "(Ljava/util/List;)[Lkotlinx/serialization/descriptors/SerialDescriptor;", "Loc/d;", BuildConfig.FLAVOR, "d", "Loc/n;", BuildConfig.FLAVOR, "c", "kotlinx-serialization-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a */
    private static final SerialDescriptor[] f15255a = new SerialDescriptor[0];

    public static final Set<String> a(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "<this>");
        if (serialDescriptor instanceof k) {
            return ((k) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.m());
        int m10 = serialDescriptor.m();
        for (int i10 = 0; i10 < m10; i10++) {
            hashSet.add(serialDescriptor.n(i10));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] b(List<? extends SerialDescriptor> list) {
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            Object[] array = list.toArray(new SerialDescriptor[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (SerialDescriptor[]) array;
        }
        return f15255a;
    }

    public static final oc.d<Object> c(oc.n nVar) {
        hc.t.e(nVar, "<this>");
        oc.e f10 = nVar.f();
        if (f10 instanceof oc.d) {
            return (oc.d) f10;
        }
        if (!(f10 instanceof oc.o)) {
            throw new IllegalStateException(("Only KClass supported as classifier, got " + f10).toString());
        }
        throw new IllegalStateException(("Captured type paramerer " + f10 + " from generic non-reified function. Such functionality cannot be supported as " + f10 + " is erased, either specify serializer explicitly or make calling function inline with reified " + f10).toString());
    }

    public static final Void d(oc.d<?> dVar) {
        hc.t.e(dVar, "<this>");
        throw new kotlinx.serialization.i("Serializer for class '" + dVar.G() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }
}
