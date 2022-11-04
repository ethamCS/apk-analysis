package fg;

import eg.f;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0007\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002\u001a\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0002\" \u0010\u000f\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Leg/f;", "Leg/c;", "buffer", BuildConfig.FLAVOR, "offset", "byteCount", "Ltb/e0;", "d", BuildConfig.FLAVOR, "c", "e", BuildConfig.FLAVOR, "s", "codePointCount", BuildConfig.FLAVOR, "HEX_DIGIT_CHARS", "[C", "f", "()[C", "getHEX_DIGIT_CHARS$annotations", "()V", "okio"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a */
    private static final char[] f10199a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Removed duplicated region for block: B:254:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0083 A[EDGE_INSN: B:257:0x0083->B:53:0x0083 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fg.b.c(byte[], int):int");
    }

    public static final void d(f fVar, eg.c cVar, int i10, int i11) {
        t.e(fVar, "<this>");
        t.e(cVar, "buffer");
        cVar.o(fVar.r(), i10, i11);
    }

    public static final int e(char c10) {
        boolean z10 = true;
        if ('0' <= c10 && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (!('a' <= c10 && c10 <= 'f')) {
            c11 = 'A';
            if ('A' > c10 || c10 > 'F') {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException(t.l("Unexpected hex digit: ", Character.valueOf(c10)));
            }
        }
        return (c10 - c11) + 10;
    }

    public static final char[] f() {
        return f10199a;
    }
}
