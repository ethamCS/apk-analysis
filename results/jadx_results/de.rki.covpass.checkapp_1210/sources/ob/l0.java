package ob;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\"\u0010\u000b\u001a\u00020\n*\u00020\u00052\f\b\u0002\u0010\b\u001a\u00060\u0006j\u0002`\u00072\b\b\u0002\u0010\t\u001a\u00020\u0001\u001a \u0010\r\u001a\u00020\n*\u00020\u00052\u0006\u0010\f\u001a\u00020\u00012\f\b\u0002\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u001a4\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00012\f\b\u0002\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u001a$\u0010\u0015\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0001H\u0001¨\u0006\u0019"}, d2 = {"Lob/u;", BuildConfig.FLAVOR, "n", BuildConfig.FLAVOR, "b", "Lob/z;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "max", BuildConfig.FLAVOR, "d", "bytesCount", "f", "Lob/h0;", BuildConfig.FLAVOR, "text", "fromIndex", "toIndex", "Ltb/e0;", "h", "j", "size", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class l0 {
    public static final Void a(int i10) {
        throw new EOFException("Premature end of stream: expected " + i10 + " bytes");
    }

    public static final byte[] b(u uVar, int i10) {
        hc.t.e(uVar, "<this>");
        if (i10 != 0) {
            byte[] bArr = new byte[i10];
            a0.d(uVar, bArr, 0, i10);
            return bArr;
        }
        return pb.h.f19029a;
    }

    public static /* synthetic */ byte[] c(u uVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            long D0 = uVar.D0();
            if (D0 > 2147483647L) {
                throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
            }
            i10 = (int) D0;
        }
        return b(uVar, i10);
    }

    public static final String d(z zVar, Charset charset, int i10) {
        hc.t.e(zVar, "<this>");
        hc.t.e(charset, "charset");
        CharsetDecoder newDecoder = charset.newDecoder();
        hc.t.d(newDecoder, "charset.newDecoder()");
        return mb.b.a(newDecoder, zVar, i10);
    }

    public static /* synthetic */ String e(z zVar, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = bf.d.f5986b;
        }
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return d(zVar, charset, i10);
    }

    public static final String f(z zVar, int i10, Charset charset) {
        hc.t.e(zVar, "<this>");
        hc.t.e(charset, "charset");
        CharsetDecoder newDecoder = charset.newDecoder();
        hc.t.d(newDecoder, "charset.newDecoder()");
        return mb.a.b(newDecoder, zVar, i10);
    }

    public static /* synthetic */ String g(z zVar, int i10, Charset charset, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = bf.d.f5986b;
        }
        return f(zVar, i10, charset);
    }

    public static final void h(h0 h0Var, CharSequence charSequence, int i10, int i11, Charset charset) {
        hc.t.e(h0Var, "<this>");
        hc.t.e(charSequence, "text");
        hc.t.e(charset, "charset");
        if (charset == bf.d.f5986b) {
            j(h0Var, charSequence, i10, i11);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        hc.t.d(newEncoder, "charset.newEncoder()");
        mb.b.f(newEncoder, h0Var, charSequence, i10, i11);
    }

    public static /* synthetic */ void i(h0 h0Var, CharSequence charSequence, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        if ((i12 & 8) != 0) {
            charset = bf.d.f5986b;
        }
        h(h0Var, charSequence, i10, i11, charset);
    }

    private static final void j(h0 h0Var, CharSequence charSequence, int i10, int i11) {
        pb.a i12 = pb.h.i(h0Var, 1, null);
        while (true) {
            try {
                int b10 = pb.g.b(i12.n(), charSequence, i10, i11, i12.s(), i12.j());
                int b11 = tb.c0.b((short) (b10 >>> 16)) & 65535;
                i10 += b11;
                i12.b(tb.c0.b((short) (b10 & 65535)) & 65535);
                int i13 = (b11 != 0 || i10 >= i11) ? i10 < i11 ? 1 : 0 : 8;
                if (i13 <= 0) {
                    return;
                }
                i12 = pb.h.i(h0Var, i13, i12);
            } finally {
                pb.h.a(h0Var, i12);
            }
        }
    }
}
