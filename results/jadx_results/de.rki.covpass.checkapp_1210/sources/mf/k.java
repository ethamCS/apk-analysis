package mf;

import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ;\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lmf/k;", BuildConfig.FLAVOR, "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lmf/k$a;", "key", "value", "Ltb/e0;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lmf/k$a;Ljava/lang/Object;)V", "Lkotlin/Function0;", "defaultValue", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lmf/k$a;Lgc/a;)Ljava/lang/Object;", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lmf/k$a;)Ljava/lang/Object;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a */
    private final Map<SerialDescriptor, Map<a<Object>, Object>> f16631a = j.a(1);

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmf/k$a;", BuildConfig.FLAVOR, "T", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a<T> {
    }

    public final <T> T a(SerialDescriptor serialDescriptor, a<T> aVar) {
        hc.t.e(serialDescriptor, "descriptor");
        hc.t.e(aVar, "key");
        Map<a<Object>, Object> map = this.f16631a.get(serialDescriptor);
        Object obj = map != null ? map.get(aVar) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    public final <T> T b(SerialDescriptor serialDescriptor, a<T> aVar, gc.a<? extends T> aVar2) {
        hc.t.e(serialDescriptor, "descriptor");
        hc.t.e(aVar, "key");
        hc.t.e(aVar2, "defaultValue");
        T t10 = (T) a(serialDescriptor, aVar);
        if (t10 != null) {
            return t10;
        }
        T invoke = aVar2.invoke();
        c(serialDescriptor, aVar, invoke);
        return invoke;
    }

    public final <T> void c(SerialDescriptor serialDescriptor, a<T> aVar, T t10) {
        hc.t.e(serialDescriptor, "descriptor");
        hc.t.e(aVar, "key");
        hc.t.e(t10, "value");
        Map<SerialDescriptor, Map<a<Object>, Object>> map = this.f16631a;
        Map<a<Object>, Object> map2 = map.get(serialDescriptor);
        if (map2 == null) {
            map2 = j.a(1);
            map.put(serialDescriptor, map2);
        }
        map2.put(aVar, t10);
    }
}
