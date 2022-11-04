package z9;

import bf.a0;
import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0005\u001a\u00020\u0000*\u00020\u0001¨\u0006\u0006"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "c", BuildConfig.FLAVOR, "b", "a", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class k {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR, "b", "(B)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.l<Byte, CharSequence> {

        /* renamed from: c */
        public static final a f26557c = new a();

        a() {
            super(1);
        }

        public final CharSequence b(byte b10) {
            return k.b(b10);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b10) {
            return b(b10.byteValue());
        }
    }

    public static final byte[] a(String str) {
        List<String> T0;
        int s10;
        byte[] B0;
        int a10;
        t.e(str, "<this>");
        if (str.length() % 2 == 0) {
            T0 = a0.T0(str, 2);
            s10 = ub.v.s(T0, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (String str2 : T0) {
                a10 = bf.b.a(16);
                arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, a10)));
            }
            B0 = c0.B0(arrayList);
            return B0;
        }
        throw new IllegalStateException("Must have an even length".toString());
    }

    public static final String b(byte b10) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        t.d(format, "format(this, *args)");
        return format;
    }

    public static final String c(byte[] bArr) {
        String O;
        t.e(bArr, "<this>");
        O = ub.m.O(bArr, BuildConfig.FLAVOR, null, null, 0, null, a.f26557c, 30, null);
        return O;
    }
}
