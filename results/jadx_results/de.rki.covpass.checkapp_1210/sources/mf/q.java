package mf;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a \u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u001a \u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0000\u001a \u0010\u0017\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0016\u0010\u0019\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u001a"}, d2 = {BuildConfig.FLAVOR, "offset", BuildConfig.FLAVOR, "message", "Lmf/m;", "d", BuildConfig.FLAVOR, "input", "e", BuildConfig.FLAVOR, "value", "output", "Lmf/o;", "b", "Lmf/a;", "result", BuildConfig.FLAVOR, "i", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "keyDescriptor", "c", "key", "a", "j", "f", "g", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class q {
    public static final m a(Number number, String str, String str2) {
        hc.t.e(number, "value");
        hc.t.e(str, "key");
        hc.t.e(str2, "output");
        return d(-1, j(number, str, str2));
    }

    public static final o b(Number number, String str) {
        hc.t.e(number, "value");
        hc.t.e(str, "output");
        return new o("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) h(str, 0, 1, null)));
    }

    public static final o c(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "keyDescriptor");
        return new o("Value of type '" + serialDescriptor.l() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.h() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final m d(int i10, String str) {
        hc.t.e(str, "message");
        if (i10 >= 0) {
            str = "Unexpected JSON token at offset " + i10 + ": " + str;
        }
        return new m(str);
    }

    public static final m e(int i10, String str, CharSequence charSequence) {
        hc.t.e(str, "message");
        hc.t.e(charSequence, "input");
        return d(i10, str + "\nJSON input: " + ((Object) g(charSequence, i10)));
    }

    public static final m f(String str, String str2) {
        hc.t.e(str, "key");
        hc.t.e(str2, "input");
        return d(-1, "Encountered unknown key '" + str + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) h(str2, 0, 1, null)));
    }

    private static final CharSequence g(CharSequence charSequence, int i10) {
        int b10;
        int d10;
        int length;
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str = ".....";
        if (i10 == -1) {
            if (charSequence.length() - 60 <= 0) {
                return charSequence;
            }
            return str + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i11 = i10 - 30;
        int i12 = i10 + 30;
        String str2 = i11 <= 0 ? BuildConfig.FLAVOR : str;
        if (i12 >= charSequence.length()) {
            str = BuildConfig.FLAVOR;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        b10 = nc.m.b(i11, 0);
        d10 = nc.m.d(i12, charSequence.length());
        sb2.append(charSequence.subSequence(b10, d10).toString());
        sb2.append(str);
        return sb2.toString();
    }

    static /* synthetic */ CharSequence h(CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        return g(charSequence, i10);
    }

    public static final Void i(a aVar, Number number) {
        hc.t.e(aVar, "<this>");
        hc.t.e(number, "result");
        a.x(aVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new tb.i();
    }

    private static final String j(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) h(str2, 0, 1, null));
    }
}
