package mb;

import hc.t;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import ob.h0;
import ob.k0;
import ob.r;
import ob.u;
import ob.z;
import org.conscrypt.BuildConfig;
import pb.h;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\b\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007\u001a\"\u0010\u000e\u001a\u00020\r*\u00060\tj\u0002`\n2\u0006\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0007\u001a\f\u0010\u0010\u001a\u00020\u000f*\u00020\u000bH\u0000\u001a\u0018\u0010\u0013\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u001a0\u0010\u0015\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¨\u0006\u0016"}, d2 = {"Ljava/nio/charset/CharsetEncoder;", "Lio/ktor/utils/io/charsets/CharsetEncoder;", BuildConfig.FLAVOR, "input", BuildConfig.FLAVOR, "fromIndex", "toIndex", "Lob/u;", "c", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "Lob/z;", "max", BuildConfig.FLAVOR, "a", BuildConfig.FLAVOR, "g", "Lob/h0;", "dst", "e", "destination", "f", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b {
    public static final String a(CharsetDecoder charsetDecoder, z zVar, int i10) {
        t.e(charsetDecoder, "<this>");
        t.e(zVar, "input");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10, g(zVar)));
        a.a(charsetDecoder, zVar, sb2, i10);
        String sb3 = sb2.toString();
        t.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public static /* synthetic */ String b(CharsetDecoder charsetDecoder, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return a(charsetDecoder, zVar, i10);
    }

    public static final u c(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11) {
        t.e(charsetEncoder, "<this>");
        t.e(charSequence, "input");
        r a10 = k0.a(0);
        try {
            f(charsetEncoder, a10, charSequence, i10, i11);
            return a10.q1();
        } catch (Throwable th2) {
            a10.z0();
            throw th2;
        }
    }

    public static /* synthetic */ u d(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return c(charsetEncoder, charSequence, i10, i11);
    }

    private static final int e(CharsetEncoder charsetEncoder, h0 h0Var) {
        pb.a i10 = h.i(h0Var, 1, null);
        int i11 = 1;
        int i12 = 0;
        while (true) {
            try {
                int j10 = i10.j() - i10.s();
                i11 = a.e(charsetEncoder, i10) ? 0 : i11 + 1;
                i12 += j10 - (i10.j() - i10.s());
                if (!(i11 > 0)) {
                    return i12;
                }
                i10 = h.i(h0Var, 1, i10);
            } finally {
                h.a(h0Var, i10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        throw new java.lang.IllegalStateException("Check failed.".toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int f(java.nio.charset.CharsetEncoder r8, ob.h0 r9, java.lang.CharSequence r10, int r11, int r12) {
        /*
            java.lang.String r0 = "<this>"
            hc.t.e(r8, r0)
            java.lang.String r0 = "destination"
            hc.t.e(r9, r0)
            java.lang.String r0 = "input"
            hc.t.e(r10, r0)
            r0 = 0
            if (r11 < r12) goto L13
            return r0
        L13:
            r1 = 0
            r2 = 1
            pb.a r1 = pb.h.i(r9, r2, r1)
            r3 = r0
        L1a:
            int r4 = r1.j()     // Catch: java.lang.Throwable -> L60
            int r5 = r1.s()     // Catch: java.lang.Throwable -> L60
            int r4 = r4 - r5
            int r5 = mb.a.f(r8, r10, r11, r12, r1)     // Catch: java.lang.Throwable -> L60
            if (r5 < 0) goto L2b
            r6 = r2
            goto L2c
        L2b:
            r6 = r0
        L2c:
            if (r6 == 0) goto L54
            int r11 = r11 + r5
            int r6 = r1.j()     // Catch: java.lang.Throwable -> L60
            int r7 = r1.s()     // Catch: java.lang.Throwable -> L60
            int r6 = r6 - r7
            int r4 = r4 - r6
            int r3 = r3 + r4
            if (r11 < r12) goto L3e
            r4 = r0
            goto L44
        L3e:
            if (r5 != 0) goto L43
            r4 = 8
            goto L44
        L43:
            r4 = r2
        L44:
            if (r4 > 0) goto L4f
            pb.h.a(r9, r1)
            int r8 = e(r8, r9)
            int r3 = r3 + r8
            return r3
        L4f:
            pb.a r1 = pb.h.i(r9, r4, r1)     // Catch: java.lang.Throwable -> L60
            goto L1a
        L54:
            java.lang.String r8 = "Check failed."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L60
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L60
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L60
            throw r10     // Catch: java.lang.Throwable -> L60
        L60:
            r8 = move-exception
            pb.h.a(r9, r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.b.f(java.nio.charset.CharsetEncoder, ob.h0, java.lang.CharSequence, int, int):int");
    }

    public static final long g(z zVar) {
        t.e(zVar, "<this>");
        if (zVar instanceof u) {
            return ((u) zVar).D0();
        }
        if (!(zVar instanceof ob.a)) {
            return 16L;
        }
        return Math.max(((ob.a) zVar).D0(), 16L);
    }
}
