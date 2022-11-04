package hf;

import hc.n;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0012\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\u000f"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "g", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "e", "index", BuildConfig.FLAVOR, "h", BuildConfig.FLAVOR, "bits", BuildConfig.FLAVOR, "f", "kotlinx-serialization-cbor"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a */
    private static final int f11905a = Float.floatToIntBits(0.5f);

    public static final byte[] e(Iterable<byte[]> iterable) {
        int i10 = 0;
        int i11 = 0;
        for (byte[] bArr : iterable) {
            i11 += bArr.length;
        }
        byte[] bArr2 = new byte[i11];
        for (byte[] bArr3 : iterable) {
            ub.l.g(bArr3, bArr2, i10, 0, 0, 12, null);
            i10 += bArr3.length;
        }
        return bArr2;
    }

    public static final float f(short s10) {
        int i10 = 0;
        boolean z10 = (32768 & s10) != 0;
        int i11 = (s10 >> 10) & 31;
        int i12 = s10 & 1023;
        if (i11 != 0) {
            i10 = i11 != 31 ? i11 + 112 : 255;
        } else if (i12 != 0) {
            n nVar = n.f11774a;
            float intBitsToFloat = Float.intBitsToFloat(f11905a + i12) - 0.5f;
            return z10 ? -intBitsToFloat : intBitsToFloat;
        } else {
            i12 = 0;
        }
        n nVar2 = n.f11774a;
        float intBitsToFloat2 = Float.intBitsToFloat((i12 << 13) | (i10 << 23));
        return z10 ? -intBitsToFloat2 : intBitsToFloat2;
    }

    public static final int g(SerialDescriptor serialDescriptor, String str) {
        int k10 = serialDescriptor.k(str);
        if (k10 != -3) {
            return k10;
        }
        throw new kotlinx.serialization.i(serialDescriptor.l() + " does not contain element with name '" + str + ". You can enable 'CborBuilder.ignoreUnknownKeys' property to ignore unknown keys");
    }

    public static final boolean h(SerialDescriptor serialDescriptor, int i10) {
        Object obj;
        Iterator<T> it = serialDescriptor.p(i10).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Annotation) obj) instanceof gf.a) {
                break;
            }
        }
        return obj != null;
    }
}
