package h6;

import java.util.Map;
import x6.b0;
/* loaded from: classes.dex */
public final class l implements u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11351a;

        static {
            int[] iArr = new int[h6.a.values().length];
            f11351a = iArr;
            try {
                iArr[h6.a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11351a[h6.a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11351a[h6.a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11351a[h6.a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11351a[h6.a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11351a[h6.a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11351a[h6.a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11351a[h6.a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11351a[h6.a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11351a[h6.a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11351a[h6.a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11351a[h6.a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11351a[h6.a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // h6.u
    public o6.b a(String str, h6.a aVar, int i10, int i11, Map<g, ?> map) {
        u uVar;
        switch (a.f11351a[aVar.ordinal()]) {
            case 1:
                uVar = new x6.l();
                break;
            case 2:
                uVar = new b0();
                break;
            case 3:
                uVar = new x6.j();
                break;
            case 4:
                uVar = new x6.u();
                break;
            case 5:
                uVar = new g7.b();
                break;
            case 6:
                uVar = new x6.f();
                break;
            case 7:
                uVar = new x6.h();
                break;
            case 8:
                uVar = new x6.d();
                break;
            case 9:
                uVar = new x6.o();
                break;
            case 10:
                uVar = new b7.d();
                break;
            case 11:
                uVar = new x6.b();
                break;
            case 12:
                uVar = new r6.b();
                break;
            case 13:
                uVar = new i6.c();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return uVar.a(str, aVar, i10, i11, map);
    }
}
