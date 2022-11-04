package kf;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b(\u0010)J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00028\u0001H$¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r*\u00028\u0001H$¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0002H$¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\b*\u00028\u0002H$¢\u0006\u0004\b\u0012\u0010\fJ\u0013\u0010\u0013\u001a\u00028\u0001*\u00028\u0002H$¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00028\u0002*\u00028\u0001H$¢\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u0017*\u00028\u00022\u0006\u0010\u0016\u001a\u00020\bH$¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010#\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00022\b\b\u0002\u0010\"\u001a\u00020!H$¢\u0006\u0004\b#\u0010$J/\u0010&\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010%\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH$¢\u0006\u0004\b&\u0010'\u0082\u0001\u0002*+¨\u0006,"}, d2 = {"Lkf/a;", "Element", "Collection", "Builder", "Lkotlinx/serialization/KSerializer;", "Ljf/c;", "decoder", "builder", BuildConfig.FLAVOR, "j", "(Ljf/c;Ljava/lang/Object;)I", "e", "(Ljava/lang/Object;)I", BuildConfig.FLAVOR, "d", "(Ljava/lang/Object;)Ljava/util/Iterator;", "a", "()Ljava/lang/Object;", "b", "l", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "size", "Ltb/e0;", "c", "(Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Decoder;", "previous", "f", "(Lkotlinx/serialization/encoding/Decoder;Ljava/lang/Object;)Ljava/lang/Object;", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "index", BuildConfig.FLAVOR, "checkIndex", "h", "(Ljf/c;ILjava/lang/Object;Z)V", "startIndex", "g", "(Ljf/c;Ljava/lang/Object;II)V", "<init>", "()V", "Lkf/n;", "Lkf/p0;", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class a<Element, Collection, Builder> implements KSerializer<Collection> {
    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void i(a aVar, jf.c cVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 8) != 0) {
                z10 = true;
            }
            aVar.h(cVar, i10, obj, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
    }

    private final int j(jf.c cVar, Builder builder) {
        int e10 = cVar.e(getDescriptor());
        c(builder, e10);
        return e10;
    }

    protected abstract Builder a();

    protected abstract int b(Builder builder);

    protected abstract void c(Builder builder, int i10);

    public abstract Iterator<Element> d(Collection collection);

    @Override // kotlinx.serialization.b
    public Collection deserialize(Decoder decoder) {
        hc.t.e(decoder, "decoder");
        return f(decoder, null);
    }

    public abstract int e(Collection collection);

    public final Collection f(Decoder decoder, Collection collection) {
        Builder builder;
        hc.t.e(decoder, "decoder");
        if (collection == null || (builder = k(collection)) == null) {
            builder = a();
        }
        int b10 = b(builder);
        jf.c b11 = decoder.b(getDescriptor());
        if (!b11.r()) {
            while (true) {
                int q10 = b11.q(getDescriptor());
                if (q10 == -1) {
                    break;
                }
                i(this, b11, b10 + q10, builder, false, 8, null);
            }
        } else {
            g(b11, builder, b10, j(b11, builder));
        }
        b11.c(getDescriptor());
        return l(builder);
    }

    protected abstract void g(jf.c cVar, Builder builder, int i10, int i11);

    protected abstract void h(jf.c cVar, int i10, Builder builder, boolean z10);

    public abstract Builder k(Collection collection);

    protected abstract Collection l(Builder builder);
}
