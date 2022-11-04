package t7;

import java.util.Map;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    static final w f21936a = new w(BuildConfig.FLAVOR);

    /* renamed from: b */
    private static final w f21937b = new w("preservenegativezero=0");

    /* renamed from: c */
    private static final w f21938c = new w("preservenegativezero=1");

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21939a;

        static {
            int[] iArr = new int[q.values().length];
            f21939a = iArr;
            try {
                iArr[q.SimpleValue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21939a[q.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21939a[q.Integer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21939a[q.FloatingPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21939a[q.ByteString.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21939a[q.TextString.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21939a[q.Array.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21939a[q.Map.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static String a(o oVar, int i10) {
        StringBuilder sb2;
        String str;
        char c10;
        char c11;
        q s12 = oVar.s1();
        if (oVar.x1()) {
            sb2 = s12 == q.TextString ? new StringBuilder(Math.min(oVar.s().length(), 4096) + 16) : new StringBuilder();
            for (o oVar2 = oVar; oVar2.x1(); oVar2 = oVar2.P0()) {
                sb2.append(oVar2.p1().toString());
                sb2.append('(');
            }
        } else {
            sb2 = null;
        }
        switch (a.f21939a[s12.ordinal()]) {
            case 1:
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                if (oVar.z1()) {
                    str = "undefined";
                } else if (!oVar.v1()) {
                    sb2.append("simple(");
                    int q12 = oVar.q1();
                    if (q12 >= 100) {
                        sb2.append((char) (((q12 / 100) % 10) + 48));
                    }
                    if (q12 >= 10) {
                        sb2.append((char) (((q12 / 10) % 10) + 48));
                        q12 %= 10;
                    }
                    sb2.append((char) (q12 + 48));
                    sb2.append(')');
                    break;
                } else {
                    str = "null";
                }
                sb2.append(str);
                break;
            case 2:
            case 3:
                str = oVar.O0().M0();
                if (sb2 == null) {
                    return str;
                }
                sb2.append(str);
                break;
            case 4:
                long g10 = oVar.g();
                str = g10 == -4503599627370496L ? "-Infinity" : g10 == 9218868437227405312L ? "Infinity" : t.n(g10) ? "NaN" : oVar.O0().M0();
                if (sb2 == null) {
                    return str;
                }
                sb2.append(str);
                break;
            case 5:
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append("h'");
                byte[] j02 = oVar.j0();
                int length = j02.length;
                for (int i11 = 0; i11 < length; i11++) {
                    sb2.append("0123456789ABCDEF".charAt((j02[i11] >> 4) & 15));
                    sb2.append("0123456789ABCDEF".charAt(j02[i11] & 15));
                }
                c10 = '\'';
                sb2.append(c10);
                break;
            case 6:
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                c10 = '\"';
                sb2.append('\"');
                String s10 = oVar.s();
                int length2 = s10.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    int a10 = v7.a.a(s10, i12, 0);
                    if (a10 >= 65536) {
                        sb2.append("\\U");
                        sb2.append("0123456789ABCDEF".charAt((a10 >> 20) & 15));
                        sb2.append("0123456789ABCDEF".charAt((a10 >> 16) & 15));
                    } else if (a10 >= 127 || a10 < 32 || a10 == 92 || a10 == 34) {
                        sb2.append("\\u");
                    } else {
                        c11 = (char) a10;
                        sb2.append(c11);
                    }
                    sb2.append("0123456789ABCDEF".charAt((a10 >> 12) & 15));
                    sb2.append("0123456789ABCDEF".charAt((a10 >> 8) & 15));
                    sb2.append("0123456789ABCDEF".charAt((a10 >> 4) & 15));
                    c11 = "0123456789ABCDEF".charAt(a10 & 15);
                    sb2.append(c11);
                }
                sb2.append(c10);
                break;
            case 7:
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append('[');
                if (i10 >= 50) {
                    sb2.append("...");
                } else {
                    int i13 = 0;
                    boolean z10 = true;
                    while (i13 < oVar.D1()) {
                        if (!z10) {
                            sb2.append(", ");
                        }
                        sb2.append(a(oVar.j1(i13), i10 + 1));
                        i13++;
                        z10 = false;
                    }
                }
                c10 = ']';
                sb2.append(c10);
                break;
            case 8:
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append('{');
                if (i10 >= 50) {
                    sb2.append("...");
                } else {
                    boolean z11 = true;
                    for (Map.Entry<o, o> entry : oVar.l1()) {
                        o key = entry.getKey();
                        o value = entry.getValue();
                        if (!z11) {
                            sb2.append(", ");
                        }
                        int i14 = i10 + 1;
                        sb2.append(a(key, i14));
                        sb2.append(": ");
                        sb2.append(a(value, i14));
                        z11 = false;
                    }
                }
                c10 = '}';
                sb2.append(c10);
                break;
            default:
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                str = "???";
                sb2.append(str);
                break;
        }
        while (oVar.x1()) {
            sb2.append(')');
            oVar = oVar.P0();
        }
        return sb2.toString();
    }
}
