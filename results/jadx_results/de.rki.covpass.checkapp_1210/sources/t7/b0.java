package t7;

import java.io.OutputStream;
import java.util.Objects;
/* loaded from: classes.dex */
final class b0 {

    /* renamed from: a */
    private final StringBuilder f21934a;

    /* renamed from: b */
    private final OutputStream f21935b = null;

    public b0(StringBuilder sb2) {
        this.f21934a = sb2;
    }

    public void a(byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr, "bytes");
        if (i10 < 0) {
            throw new IllegalArgumentException("\"index\" (" + i10 + ") is not greater or equal to 0");
        } else if (i10 > bArr.length) {
            throw new IllegalArgumentException("\"index\" (" + i10 + ") is not less or equal to " + bArr.length);
        } else if (i11 < 0) {
            throw new IllegalArgumentException(" (" + i11 + ") is not greater or equal to 0");
        } else if (i11 > bArr.length) {
            throw new IllegalArgumentException(" (" + i11 + ") is not less or equal to " + bArr.length);
        } else if (bArr.length - i10 < i11) {
            throw new IllegalArgumentException("\"bytes\" + \"'s length minus \" + index (" + (bArr.length - i10) + ") is not greater or equal to " + i11);
        } else {
            if (this.f21935b == null) {
                v7.a.e(bArr, i10, i11, this.f21934a, false);
                return;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                byte b10 = bArr[i12 + i10];
                if ((b10 & Byte.MAX_VALUE) != b10) {
                    throw new IllegalArgumentException("str is non-ASCII");
                }
            }
            this.f21935b.write(bArr, i10, i11);
        }
    }

    public void b(int i10) {
        StringBuilder sb2;
        int i11;
        int i12;
        if ((i10 >> 7) == 0) {
            OutputStream outputStream = this.f21935b;
            if (outputStream == null) {
                this.f21934a.append((char) i10);
            } else {
                outputStream.write((byte) i10);
            }
        } else if (i10 < 0) {
            throw new IllegalArgumentException("codePoint(" + i10 + ") is less than 0");
        } else if (i10 > 1114111) {
            throw new IllegalArgumentException("codePoint(" + i10 + ") is more than 1114111");
        } else {
            OutputStream outputStream2 = this.f21935b;
            if (outputStream2 == null) {
                if ((16775168 & i10) == 55296) {
                    throw new IllegalArgumentException("ch is a surrogate");
                }
                if (i10 <= 65535) {
                    sb2 = this.f21934a;
                } else if (i10 > 1114111) {
                    return;
                } else {
                    int i13 = i10 - 65536;
                    this.f21934a.append((char) (((i13 >> 10) & 1023) | 55296));
                    sb2 = this.f21934a;
                    i10 = (i13 & 1023) | 56320;
                }
                sb2.append((char) i10);
                return;
            }
            if (i10 >= 128) {
                if (i10 <= 2047) {
                    i12 = ((i10 >> 6) & 31) | 192;
                } else {
                    if (i10 > 65535) {
                        outputStream2.write((byte) (((i10 >> 18) & 7) | 240));
                        outputStream2 = this.f21935b;
                        i11 = ((i10 >> 12) & 63) | 128;
                    } else if ((63488 & i10) == 55296) {
                        throw new IllegalArgumentException("ch is a surrogate");
                    } else {
                        i11 = ((i10 >> 12) & 15) | 224;
                    }
                    outputStream2.write((byte) i11);
                    outputStream2 = this.f21935b;
                    i12 = ((i10 >> 6) & 63) | 128;
                }
                outputStream2.write((byte) i12);
                outputStream2 = this.f21935b;
                i10 = (i10 & 63) | 128;
            }
            outputStream2.write((byte) i10);
        }
    }

    public void c(String str) {
        if (this.f21935b == null) {
            this.f21934a.append(str);
        } else if (str.length() == 1) {
            b(str.charAt(0));
        } else if (v7.a.g(str, 0, str.length(), this.f21935b, false) < 0) {
            throw new IllegalArgumentException("str has an unpaired surrogate");
        }
    }

    public void d(String str, int i10, int i11) {
        OutputStream outputStream = this.f21935b;
        if (outputStream == null) {
            this.f21934a.append((CharSequence) str, i10, i11 + i10);
        } else if (i11 == 1) {
            b(str.charAt(i10));
        } else if (v7.a.g(str, i10, i11, outputStream, false) < 0) {
            throw new IllegalArgumentException("str has an unpaired surrogate");
        }
    }
}
