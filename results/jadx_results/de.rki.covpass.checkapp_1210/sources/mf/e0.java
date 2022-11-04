package mf;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0006\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f\"(\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\" \u0010\u0015\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {BuildConfig.FLAVOR, "i", BuildConfig.FLAVOR, "e", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", BuildConfig.FLAVOR, "value", "Ltb/e0;", "c", BuildConfig.FLAVOR, "d", "(Ljava/lang/String;)Ljava/lang/Boolean;", BuildConfig.FLAVOR, "ESCAPE_STRINGS", "[Ljava/lang/String;", "b", "()[Ljava/lang/String;", "getESCAPE_STRINGS$annotations", "()V", BuildConfig.FLAVOR, "ESCAPE_MARKERS", "[B", "a", "()[B", "getESCAPE_MARKERS$annotations", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a */
    private static final String[] f16620a;

    /* renamed from: b */
    private static final byte[] f16621b;

    static {
        String[] strArr = new String[93];
        for (int i10 = 0; i10 < 32; i10++) {
            strArr[i10] = "\\u" + e(i10 >> 12) + e(i10 >> 8) + e(i10 >> 4) + e(i10);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f16620a = strArr;
        byte[] bArr = new byte[93];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = 1;
        }
        bArr[34] = (byte) 34;
        bArr[92] = (byte) 92;
        bArr[9] = (byte) 116;
        bArr[8] = (byte) 98;
        bArr[10] = (byte) androidx.constraintlayout.widget.i.E2;
        bArr[13] = (byte) 114;
        bArr[12] = (byte) 102;
        f16621b = bArr;
    }

    public static final byte[] a() {
        return f16621b;
    }

    public static final String[] b() {
        return f16620a;
    }

    public static final void c(StringBuilder sb2, String str) {
        hc.t.e(sb2, "<this>");
        hc.t.e(str, "value");
        sb2.append('\"');
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            String[] strArr = f16620a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb2.append((CharSequence) str, i10, i11);
                sb2.append(strArr[charAt]);
                i10 = i11 + 1;
            }
        }
        if (i10 != 0) {
            sb2.append((CharSequence) str, i10, str.length());
        } else {
            sb2.append(str);
        }
        sb2.append('\"');
    }

    public static final Boolean d(String str) {
        boolean v10;
        boolean v11;
        hc.t.e(str, "<this>");
        v10 = bf.x.v(str, "true", true);
        if (v10) {
            return Boolean.TRUE;
        }
        v11 = bf.x.v(str, "false", true);
        if (!v11) {
            return null;
        }
        return Boolean.FALSE;
    }

    private static final char e(int i10) {
        int i11 = i10 & 15;
        return (char) (i11 < 10 ? i11 + 48 : (i11 - 10) + 97);
    }
}
