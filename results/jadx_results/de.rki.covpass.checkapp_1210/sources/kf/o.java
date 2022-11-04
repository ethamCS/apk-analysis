package kf;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0007\u001a\u00020\u0006*\u00028\u0001H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t*\u00028\u0001H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lkf/o;", "E", BuildConfig.FLAVOR, "C", "B", "Lkf/n;", BuildConfig.FLAVOR, "p", "(Ljava/util/Collection;)I", BuildConfig.FLAVOR, "o", "(Ljava/util/Collection;)Ljava/util/Iterator;", "Lkotlinx/serialization/KSerializer;", "element", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class o<E, C extends Collection<? extends E>, B> extends n<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(KSerializer<E> kSerializer) {
        super(kSerializer, null);
        hc.t.e(kSerializer, "element");
    }

    /* renamed from: o */
    public Iterator<E> d(C c10) {
        hc.t.e(c10, "<this>");
        return c10.iterator();
    }

    /* renamed from: p */
    public int e(C c10) {
        hc.t.e(c10, "<this>");
        return c10.size();
    }
}
