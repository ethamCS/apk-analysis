package kf;

import jf.c;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017J'\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lkf/b;", BuildConfig.FLAVOR, "T", "Lkotlinx/serialization/KSerializer;", "Ljf/c;", "compositeDecoder", "b", "(Ljf/c;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", BuildConfig.FLAVOR, "klassName", "Lkotlinx/serialization/b;", "c", "Lkotlinx/serialization/j;", "d", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/j;", "Loc/d;", "e", "()Loc/d;", "baseClass", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class b<T> implements KSerializer<T> {
    public final T b(jf.c cVar) {
        return (T) c.b.c(cVar, getDescriptor(), 1, kotlinx.serialization.f.a(this, cVar, cVar.k(getDescriptor(), 0)), null, 8, null);
    }

    public kotlinx.serialization.b<? extends T> c(jf.c cVar, String str) {
        hc.t.e(cVar, "decoder");
        return cVar.a().d(e(), str);
    }

    public kotlinx.serialization.j<T> d(Encoder encoder, T t10) {
        hc.t.e(encoder, "encoder");
        hc.t.e(t10, "value");
        return encoder.a().e(e(), t10);
    }

    @Override // kotlinx.serialization.b
    public final T deserialize(Decoder decoder) {
        T t10;
        hc.t.e(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        jf.c b10 = decoder.b(descriptor);
        hc.j0 j0Var = new hc.j0();
        if (b10.r()) {
            t10 = (T) b(b10);
        } else {
            t10 = null;
            while (true) {
                int q10 = b10.q(getDescriptor());
                if (q10 != -1) {
                    if (q10 == 0) {
                        j0Var.f11764c = (T) b10.k(getDescriptor(), q10);
                    } else if (q10 != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) j0Var.f11764c;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(q10);
                        throw new kotlinx.serialization.i(sb2.toString());
                    } else {
                        T t11 = j0Var.f11764c;
                        if (t11 == null) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                        j0Var.f11764c = t11;
                        t10 = (T) c.b.c(b10, getDescriptor(), q10, kotlinx.serialization.f.a(this, b10, (String) t11), null, 8, null);
                    }
                } else if (t10 == null) {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) j0Var.f11764c)).toString());
                }
            }
        }
        b10.c(descriptor);
        return t10;
    }

    public abstract oc.d<T> e();

    @Override // kotlinx.serialization.j
    public final void serialize(Encoder encoder, T t10) {
        hc.t.e(encoder, "encoder");
        hc.t.e(t10, "value");
        kotlinx.serialization.j<? super T> b10 = kotlinx.serialization.f.b(this, encoder, t10);
        SerialDescriptor descriptor = getDescriptor();
        jf.d b11 = encoder.b(descriptor);
        b11.E(getDescriptor(), 0, b10.getDescriptor().l());
        b11.t(getDescriptor(), 1, b10, t10);
        b11.c(descriptor);
    }
}
