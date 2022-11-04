package mb;

import hc.t;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import kotlin.Metadata;
import ob.e;
import ob.z;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\b\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u001a(\u0010\t\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001a0\u0010\f\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\u0018\u0010\u000e\u001a\u00020\r*\u00060\u0000j\u0002`\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a*\u0010\u0015\u001a\u00020\u0004*\u00060\u000fj\u0002`\u00102\u0006\u0010\u0003\u001a\u00020\u00112\n\u0010\u000b\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u0004\u001a\u001e\u0010\u0018\u001a\u00020\u0017*\u00060\u000fj\u0002`\u00102\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0004\u001a \u0010\u001a\u001a\u00020\u0017*\u00060\u000fj\u0002`\u00102\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0004H\u0002\u001a \u0010\u001b\u001a\u00020\u0017*\u00060\u000fj\u0002`\u00102\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0004H\u0002\u001a\f\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002\"\u0019\u0010#\u001a\u00020\u0017*\u00060\u001fj\u0002` 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"*\n\u0010$\"\u00020\u001f2\u00020\u001f*\n\u0010%\"\u00020\u000f2\u00020\u000f*\n\u0010&\"\u00020\u00002\u00020\u0000*\n\u0010(\"\u00020'2\u00020'¨\u0006)"}, d2 = {"Ljava/nio/charset/CharsetEncoder;", "Lio/ktor/utils/io/charsets/CharsetEncoder;", BuildConfig.FLAVOR, "input", BuildConfig.FLAVOR, "fromIndex", "toIndex", BuildConfig.FLAVOR, "g", "h", "Lob/e;", "dst", "f", BuildConfig.FLAVOR, "e", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "Lob/z;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "max", "a", "inputLength", BuildConfig.FLAVOR, "b", "Lob/a;", "c", "d", "Ljava/nio/charset/CoderResult;", "Ltb/e0;", "j", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "i", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "name", "Charset", "CharsetDecoder", "CharsetEncoder", "Lbf/d;", "Charsets", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private static final CharBuffer f16456a;

    /* renamed from: b */
    private static final ByteBuffer f16457b;

    static {
        CharBuffer allocate = CharBuffer.allocate(0);
        t.b(allocate);
        f16456a = allocate;
        ByteBuffer allocate2 = ByteBuffer.allocate(0);
        t.b(allocate2);
        f16457b = allocate2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
        throw new java.lang.IllegalStateException("Buffer's limit change is not allowed".toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a(java.nio.charset.CharsetDecoder r11, ob.z r12, java.lang.Appendable r13, int r14) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.a.a(java.nio.charset.CharsetDecoder, ob.z, java.lang.Appendable, int):int");
    }

    public static final String b(CharsetDecoder charsetDecoder, z zVar, int i10) {
        t.e(charsetDecoder, "<this>");
        t.e(zVar, "input");
        if (i10 == 0) {
            return BuildConfig.FLAVOR;
        }
        if (zVar instanceof ob.a) {
            ob.a aVar = (ob.a) zVar;
            if (aVar.s0() - aVar.w0() >= i10) {
                if (!aVar.u0().hasArray()) {
                    return c(charsetDecoder, aVar, i10);
                }
                ByteBuffer u02 = aVar.u0();
                byte[] array = u02.array();
                t.d(array, "bb.array()");
                Charset charset = charsetDecoder.charset();
                t.d(charset, "charset()");
                String str = new String(array, u02.arrayOffset() + u02.position() + aVar.j0().p(), i10, charset);
                aVar.s(i10);
                return str;
            }
        }
        return d(charsetDecoder, zVar, i10);
    }

    private static final String c(CharsetDecoder charsetDecoder, ob.a aVar, int i10) {
        CharBuffer allocate = CharBuffer.allocate(i10);
        ByteBuffer e10 = lb.c.e(aVar.u0(), aVar.j0().p(), i10);
        CoderResult decode = charsetDecoder.decode(e10, allocate, true);
        if (decode.isMalformed() || decode.isUnmappable()) {
            t.d(decode, "rc");
            j(decode);
        }
        allocate.flip();
        aVar.s(e10.position());
        String charBuffer = allocate.toString();
        t.d(charBuffer, "cb.toString()");
        return charBuffer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
        throw new java.lang.IllegalStateException("Buffer's limit change is not allowed".toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String d(java.nio.charset.CharsetDecoder r17, ob.z r18, int r19) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.a.d(java.nio.charset.CharsetDecoder, ob.z, int):java.lang.String");
    }

    public static final boolean e(CharsetEncoder charsetEncoder, e eVar) {
        t.e(charsetEncoder, "<this>");
        t.e(eVar, "dst");
        ByteBuffer n10 = eVar.n();
        int s10 = eVar.s();
        int j10 = eVar.j() - s10;
        ByteBuffer e10 = lb.c.e(n10, s10, j10);
        boolean z10 = true;
        CoderResult encode = charsetEncoder.encode(f16456a, e10, true);
        if (encode.isMalformed() || encode.isUnmappable()) {
            t.d(encode, "result");
            j(encode);
        }
        boolean isUnderflow = encode.isUnderflow();
        if (e10.limit() != j10) {
            z10 = false;
        }
        if (z10) {
            eVar.b(e10.position());
            return isUnderflow;
        }
        throw new IllegalStateException("Buffer's limit change is not allowed".toString());
    }

    public static final int f(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, e eVar) {
        t.e(charsetEncoder, "<this>");
        t.e(charSequence, "input");
        t.e(eVar, "dst");
        CharBuffer wrap = CharBuffer.wrap(charSequence, i10, i11);
        int remaining = wrap.remaining();
        ByteBuffer n10 = eVar.n();
        int s10 = eVar.s();
        int j10 = eVar.j() - s10;
        ByteBuffer e10 = lb.c.e(n10, s10, j10);
        boolean z10 = false;
        CoderResult encode = charsetEncoder.encode(wrap, e10, false);
        if (encode.isMalformed() || encode.isUnmappable()) {
            t.d(encode, "result");
            j(encode);
        }
        if (e10.limit() == j10) {
            z10 = true;
        }
        if (z10) {
            eVar.b(e10.position());
            return remaining - wrap.remaining();
        }
        throw new IllegalStateException("Buffer's limit change is not allowed".toString());
    }

    public static final byte[] g(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11) {
        t.e(charsetEncoder, "<this>");
        t.e(charSequence, "input");
        if (charSequence instanceof String) {
            if (i10 == 0 && i11 == charSequence.length()) {
                byte[] bytes = ((String) charSequence).getBytes(charsetEncoder.charset());
                t.d(bytes, "input as java.lang.String).getBytes(charset())");
                return bytes;
            }
            String substring = ((String) charSequence).substring(i10, i11);
            t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            byte[] bytes2 = substring.getBytes(charsetEncoder.charset());
            t.d(bytes2, "input.substring(fromInde…ring).getBytes(charset())");
            return bytes2;
        }
        return h(charsetEncoder, charSequence, i10, i11);
    }

    private static final byte[] h(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11) {
        byte[] array;
        ByteBuffer encode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i10, i11));
        byte[] bArr = null;
        if (encode.hasArray() && encode.arrayOffset() == 0 && (array = encode.array()) != null) {
            if (array.length == encode.remaining()) {
                bArr = array;
            }
        }
        if (bArr == null) {
            byte[] bArr2 = new byte[encode.remaining()];
            encode.get(bArr2);
            return bArr2;
        }
        return bArr;
    }

    public static final String i(Charset charset) {
        t.e(charset, "<this>");
        String name = charset.name();
        t.d(name, "name()");
        return name;
    }

    private static final void j(CoderResult coderResult) {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new c(message);
        }
    }
}
