package ob;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a$\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007\u001a\u0016\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007\u001a&\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¨\u0006\u000e"}, d2 = {"Lob/e;", BuildConfig.FLAVOR, "csq", BuildConfig.FLAVOR, "start", "end", "d", BuildConfig.FLAVOR, "c", "a", "b", "length", BuildConfig.FLAVOR, "e", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g {
    public static final e a(e eVar, char c10) {
        int i10;
        hc.t.e(eVar, "<this>");
        ByteBuffer n10 = eVar.n();
        int s10 = eVar.s();
        int j10 = eVar.j();
        boolean z10 = false;
        if (c10 >= 0 && c10 < 128) {
            n10.put(s10, (byte) c10);
            i10 = 1;
        } else {
            if (128 <= c10 && c10 < 2048) {
                n10.put(s10, (byte) (((c10 >> 6) & 31) | 192));
                n10.put(s10 + 1, (byte) ((c10 & '?') | 128));
                i10 = 2;
            } else {
                if (2048 <= c10 && c10 < 0) {
                    n10.put(s10, (byte) (((c10 >> '\f') & 15) | 224));
                    n10.put(s10 + 1, (byte) (((c10 >> 6) & 63) | 128));
                    n10.put(s10 + 2, (byte) ((c10 & '?') | 128));
                    i10 = 3;
                } else {
                    if (0 <= c10 && c10 < 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        pb.g.j(c10);
                        throw new tb.i();
                    }
                    n10.put(s10, (byte) (((c10 >> 18) & 7) | 240));
                    n10.put(s10 + 1, (byte) (((c10 >> '\f') & 63) | 128));
                    n10.put(s10 + 2, (byte) (((c10 >> 6) & 63) | 128));
                    n10.put(s10 + 3, (byte) ((c10 & '?') | 128));
                    i10 = 4;
                }
            }
        }
        if (i10 <= j10 - s10) {
            eVar.b(i10);
            return eVar;
        }
        e(1);
        throw new tb.i();
    }

    public static final e b(e eVar, CharSequence charSequence) {
        hc.t.e(eVar, "<this>");
        return charSequence == null ? b(eVar, "null") : c(eVar, charSequence, 0, charSequence.length());
    }

    public static final e c(e eVar, CharSequence charSequence, int i10, int i11) {
        hc.t.e(eVar, "<this>");
        if (charSequence == null) {
            return c(eVar, "null", i10, i11);
        }
        if (d(eVar, charSequence, i10, i11) == i11) {
            return eVar;
        }
        e(i11 - i10);
        throw new tb.i();
    }

    public static final int d(e eVar, CharSequence charSequence, int i10, int i11) {
        hc.t.e(eVar, "<this>");
        hc.t.e(charSequence, "csq");
        int b10 = pb.g.b(eVar.n(), charSequence, i10, i11, eVar.s(), eVar.j());
        eVar.b(tb.c0.b((short) (b10 & 65535)) & 65535);
        return i10 + (tb.c0.b((short) (b10 >>> 16)) & 65535);
    }

    private static final Void e(int i10) {
        throw new j("Not enough free space available to write " + i10 + " character(s).");
    }
}
