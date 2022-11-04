package pb;

import hc.t;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import nc.m;
import org.conscrypt.BuildConfig;
import tb.c0;
import tb.i;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\u001a>\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aN\u0010\u000f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aN\u0010\u0011\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0001\u001a\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Llb/c;", BuildConfig.FLAVOR, "text", BuildConfig.FLAVOR, "from", "to", "dstOffset", "dstLimit", "Lpb/c;", "b", "(Ljava/nio/ByteBuffer;Ljava/lang/CharSequence;IIII)I", "index1", "lastCharIndex", "resultPosition1", "resultLimit", "c", "(Ljava/nio/ByteBuffer;Ljava/lang/CharSequence;IIIIII)I", "d", "byteCount", BuildConfig.FLAVOR, "i", "value", "j", "cp", BuildConfig.FLAVOR, "f", "codePoint", "g", "h", "e", BuildConfig.FLAVOR, "high", "low", "a", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g {
    public static final int a(char c10, char c11) {
        return ((c10 - 55232) << 10) | (c11 - 56320);
    }

    public static final int b(ByteBuffer byteBuffer, CharSequence charSequence, int i10, int i11, int i12, int i13) {
        int d10;
        t.e(byteBuffer, "$this$encodeUTF8");
        t.e(charSequence, "text");
        int min = Math.min(i11, i10 + 65535);
        d10 = m.d(i13, 65535);
        int i14 = i10;
        int i15 = i12;
        while (i15 < d10 && i14 < min) {
            int i16 = i14 + 1;
            int charAt = charSequence.charAt(i14) & 65535;
            if ((65408 & charAt) != 0) {
                return c(byteBuffer, charSequence, i16 - 1, min, i10, i15, d10, i12);
            }
            byteBuffer.put(i15, (byte) charAt);
            i14 = i16;
            i15++;
        }
        return c.b(c0.b((short) (i14 - i10)), c0.b((short) (i15 - i12)));
    }

    private static final int c(ByteBuffer byteBuffer, CharSequence charSequence, int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i14 - 3;
        int i17 = i10;
        int i18 = i13;
        while (i16 - i18 > 0 && i17 < i11) {
            int i19 = i17 + 1;
            char charAt = charSequence.charAt(i17);
            boolean isHighSurrogate = Character.isHighSurrogate(charAt);
            int i20 = charAt;
            if (isHighSurrogate) {
                if (i19 == i11 || !Character.isLowSurrogate(charSequence.charAt(i19))) {
                    i20 = 63;
                } else {
                    int a10 = a(charAt, charSequence.charAt(i19));
                    i19++;
                    i20 = a10;
                }
            }
            boolean z10 = false;
            int i21 = 1;
            if (i20 >= 0 && i20 < 128) {
                byteBuffer.put(i18, (byte) i20);
            } else {
                if (128 <= i20 && i20 < 2048) {
                    byteBuffer.put(i18, (byte) (((i20 >> 6) & 31) | 192));
                    byteBuffer.put(i18 + 1, (byte) ((i20 & 63) | 128));
                    i21 = 2;
                } else {
                    if (2048 <= i20 && i20 < 65536) {
                        byteBuffer.put(i18, (byte) (((i20 >> 12) & 15) | 224));
                        byteBuffer.put(i18 + 1, (byte) ((63 & (i20 >> 6)) | 128));
                        byteBuffer.put(i18 + 2, (byte) ((i20 & 63) | 128));
                        i21 = 3;
                    } else {
                        if (65536 <= i20 && i20 < 1114112) {
                            z10 = true;
                        }
                        if (!z10) {
                            j(i20);
                            throw new i();
                        }
                        byteBuffer.put(i18, (byte) (((i20 >> 18) & 7) | 240));
                        byteBuffer.put(i18 + 1, (byte) (((i20 >> 12) & 63) | 128));
                        byteBuffer.put(i18 + 2, (byte) ((63 & (i20 >> 6)) | 128));
                        byteBuffer.put(i18 + 3, (byte) ((i20 & 63) | 128));
                        i21 = 4;
                    }
                }
            }
            i18 += i21;
            i17 = i19;
        }
        return i18 == i16 ? d(byteBuffer, charSequence, i17, i11, i12, i18, i14, i15) : c.b(c0.b((short) (i17 - i12)), c0.b((short) (i18 - i15)));
    }

    private static final int d(ByteBuffer byteBuffer, CharSequence charSequence, int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17 = i10;
        int i18 = i13;
        while (true) {
            int i19 = i14 - i18;
            if (i19 <= 0 || i17 >= i11) {
                break;
            }
            int i20 = i17 + 1;
            char charAt = charSequence.charAt(i17);
            boolean isHighSurrogate = Character.isHighSurrogate(charAt);
            int i21 = charAt;
            if (isHighSurrogate) {
                if (i20 == i11 || !Character.isLowSurrogate(charSequence.charAt(i20))) {
                    i21 = 63;
                } else {
                    int a10 = a(charAt, charSequence.charAt(i20));
                    i20++;
                    i21 = a10;
                }
            }
            int i22 = 1;
            if (1 <= i21 && i21 < 128) {
                i16 = 1;
            } else {
                if (128 <= i21 && i21 < 2048) {
                    i16 = 2;
                } else {
                    if (2048 <= i21 && i21 < 65536) {
                        i16 = 3;
                    } else {
                        if (!(65536 <= i21 && i21 < 1114112)) {
                            j(i21);
                            throw new i();
                        }
                        i16 = 4;
                    }
                }
            }
            if (i16 > i19) {
                i17 = i20 - 1;
                break;
            }
            if (i21 >= 0 && i21 < 128) {
                byteBuffer.put(i18, (byte) i21);
            } else {
                if (128 <= i21 && i21 < 2048) {
                    byteBuffer.put(i18, (byte) (((i21 >> 6) & 31) | 192));
                    byteBuffer.put(i18 + 1, (byte) ((i21 & 63) | 128));
                    i22 = 2;
                } else {
                    if (2048 <= i21 && i21 < 65536) {
                        byteBuffer.put(i18, (byte) (((i21 >> 12) & 15) | 224));
                        byteBuffer.put(i18 + 1, (byte) ((63 & (i21 >> 6)) | 128));
                        byteBuffer.put(i18 + 2, (byte) ((i21 & 63) | 128));
                        i22 = 3;
                    } else {
                        if (!(65536 <= i21 && i21 < 1114112)) {
                            j(i21);
                            throw new i();
                        }
                        byteBuffer.put(i18, (byte) (((i21 >> 18) & 7) | 240));
                        byteBuffer.put(i18 + 1, (byte) (((i21 >> 12) & 63) | 128));
                        byteBuffer.put(i18 + 2, (byte) ((63 & (i21 >> 6)) | 128));
                        byteBuffer.put(i18 + 3, (byte) ((i21 & 63) | 128));
                        i22 = 4;
                    }
                }
            }
            i18 += i22;
            i17 = i20;
        }
        return c.b(c0.b((short) (i17 - i12)), c0.b((short) (i18 - i15)));
    }

    public static final int e(int i10) {
        return (i10 >>> 10) + 55232;
    }

    public static final boolean f(int i10) {
        return (i10 >>> 16) == 0;
    }

    public static final boolean g(int i10) {
        return i10 <= 1114111;
    }

    public static final int h(int i10) {
        return (i10 & 1023) + 56320;
    }

    public static final Void i(int i10) {
        throw new d("Expected " + i10 + " more character bytes");
    }

    public static final Void j(int i10) {
        throw new IllegalArgumentException("Malformed code-point " + i10 + " found");
    }
}
