package eh;

import ak.q;
import bk.f;
import gg.a0;
import gg.a1;
import gg.a2;
import gg.b;
import gg.b0;
import gg.c;
import gg.c0;
import gg.c1;
import gg.d0;
import gg.e;
import gg.e0;
import gg.e1;
import gg.g;
import gg.g2;
import gg.h0;
import gg.i;
import gg.j0;
import gg.k;
import gg.k1;
import gg.l0;
import gg.m;
import gg.m0;
import gg.n;
import gg.o;
import gg.q0;
import gg.r;
import gg.r0;
import gg.s;
import gg.s0;
import gg.u;
import gg.v;
import gg.w;
import gg.x1;
import gg.y0;
import gg.y1;
import java.math.BigInteger;
import org.conscrypt.BuildConfig;
/* loaded from: classes3.dex */
public class a {
    static void a(String str, boolean z10, a0 a0Var, StringBuffer stringBuffer) {
        String str2;
        StringBuilder sb2;
        String c10;
        BigInteger F;
        StringBuilder sb3;
        String str3;
        String F2;
        StringBuilder sb4;
        int i10;
        a0 b10;
        String d10 = q.d();
        if (!(a0Var instanceof r)) {
            int i11 = 0;
            if (a0Var instanceof d0) {
                stringBuffer.append(str);
                stringBuffer.append(a0Var instanceof a1 ? "BER Sequence" : a0Var instanceof x1 ? "DER Sequence" : "Sequence");
                stringBuffer.append(d10);
                d0 d0Var = (d0) a0Var;
                String str4 = str + "    ";
                int size = d0Var.size();
                while (i11 < size) {
                    a(str4, z10, d0Var.G(i11).b(), stringBuffer);
                    i11++;
                }
                return;
            } else if (a0Var instanceof e0) {
                stringBuffer.append(str);
                stringBuffer.append(a0Var instanceof c1 ? "BER Set" : a0Var instanceof y1 ? "DER Set" : "Set");
                stringBuffer.append(d10);
                e0 e0Var = (e0) a0Var;
                String str5 = str + "    ";
                int size2 = e0Var.size();
                while (i11 < size2) {
                    a(str5, z10, e0Var.F(i11).b(), stringBuffer);
                    i11++;
                }
                return;
            } else {
                if (a0Var instanceof gg.a) {
                    b10 = ((gg.a) a0Var).D();
                } else if (a0Var instanceof j0) {
                    stringBuffer.append(str);
                    stringBuffer.append(a0Var instanceof e1 ? "BER Tagged " : a0Var instanceof a2 ? "DER Tagged " : "Tagged ");
                    j0 j0Var = (j0) a0Var;
                    stringBuffer.append(q0.b(j0Var));
                    if (!j0Var.S()) {
                        stringBuffer.append(" IMPLICIT ");
                    }
                    stringBuffer.append(d10);
                    str = str + "    ";
                    b10 = j0Var.G().b();
                } else if (!(a0Var instanceof w)) {
                    if (a0Var instanceof v) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("ObjectIdentifier(");
                        F2 = ((v) a0Var).H();
                    } else if (!(a0Var instanceof c0)) {
                        if (a0Var instanceof e) {
                            sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append("Boolean(");
                            sb2.append(((e) a0Var).G());
                        } else {
                            if (a0Var instanceof gg.q) {
                                sb2 = new StringBuilder();
                                sb2.append(str);
                                sb2.append("Integer(");
                                F = ((gg.q) a0Var).G();
                            } else if (!(a0Var instanceof c)) {
                                if (a0Var instanceof o) {
                                    sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append("IA5String(");
                                    c10 = ((o) a0Var).c();
                                } else if (a0Var instanceof m0) {
                                    sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append("UTF8String(");
                                    c10 = ((m0) a0Var).c();
                                } else if (a0Var instanceof s) {
                                    sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append("NumericString(");
                                    c10 = ((s) a0Var).c();
                                } else if (a0Var instanceof b0) {
                                    sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append("PrintableString(");
                                    c10 = ((b0) a0Var).c();
                                } else if (a0Var instanceof s0) {
                                    sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append("VisibleString(");
                                    c10 = ((s0) a0Var).c();
                                } else if (a0Var instanceof b) {
                                    sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append("BMPString(");
                                    c10 = ((b) a0Var).c();
                                } else if (a0Var instanceof h0) {
                                    sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append("T61String(");
                                    c10 = ((h0) a0Var).c();
                                } else if (a0Var instanceof n) {
                                    sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append("GraphicString(");
                                    c10 = ((n) a0Var).c();
                                } else if (a0Var instanceof r0) {
                                    sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append("VideotexString(");
                                    c10 = ((r0) a0Var).c();
                                } else if (a0Var instanceof l0) {
                                    sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append("UTCTime(");
                                    c10 = ((l0) a0Var).F();
                                } else if (a0Var instanceof m) {
                                    sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append("GeneralizedTime(");
                                    c10 = ((m) a0Var).K();
                                } else if (a0Var instanceof i) {
                                    sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append("DER Enumerated(");
                                    F = ((i) a0Var).F();
                                } else if (!(a0Var instanceof u)) {
                                    if (!(a0Var instanceof k)) {
                                        sb2 = new StringBuilder();
                                        sb2.append(str);
                                        sb2.append(a0Var.toString());
                                        sb2.append(d10);
                                        str2 = sb2.toString();
                                        stringBuffer.append(str2);
                                        return;
                                    }
                                    k kVar = (k) a0Var;
                                    stringBuffer.append(str + "External " + d10);
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(str);
                                    sb5.append("    ");
                                    String sb6 = sb5.toString();
                                    if (kVar.G() != null) {
                                        stringBuffer.append(sb6 + "Direct Reference: " + kVar.G().H() + d10);
                                    }
                                    if (kVar.L() != null) {
                                        stringBuffer.append(sb6 + "Indirect Reference: " + kVar.L().toString() + d10);
                                    }
                                    if (kVar.F() != null) {
                                        a(sb6, z10, kVar.F(), stringBuffer);
                                    }
                                    stringBuffer.append(sb6 + "Encoding: " + kVar.H() + d10);
                                    a(sb6, z10, kVar.J(), stringBuffer);
                                    return;
                                } else {
                                    sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append("ObjectDescriptor(");
                                    c10 = ((u) a0Var).D().c();
                                }
                                sb2.append(c10);
                                sb2.append(") ");
                                sb2.append(d10);
                                str2 = sb2.toString();
                                stringBuffer.append(str2);
                                return;
                            } else {
                                c cVar = (c) a0Var;
                                byte[] D = cVar.D();
                                int d11 = cVar.d();
                                if (cVar instanceof k1) {
                                    sb3 = new StringBuilder();
                                    sb3.append(str);
                                    str3 = "DER Bit String[";
                                } else if (cVar instanceof g2) {
                                    sb3 = new StringBuilder();
                                    sb3.append(str);
                                    str3 = "DL Bit String[";
                                } else {
                                    sb3 = new StringBuilder();
                                    sb3.append(str);
                                    str3 = "BER Bit String[";
                                }
                                sb3.append(str3);
                                sb3.append(D.length);
                                sb3.append(", ");
                                sb3.append(d11);
                                sb3.append("] ");
                                stringBuffer.append(sb3.toString());
                                if (z10) {
                                    str2 = e(str, D);
                                    stringBuffer.append(str2);
                                    return;
                                }
                            }
                            sb2.append(F);
                        }
                        sb2.append(")");
                        sb2.append(d10);
                        str2 = sb2.toString();
                        stringBuffer.append(str2);
                        return;
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("RelativeOID(");
                        F2 = ((c0) a0Var).F();
                    }
                    sb2.append(F2);
                    sb2.append(")");
                    sb2.append(d10);
                    str2 = sb2.toString();
                    stringBuffer.append(str2);
                    return;
                } else {
                    w wVar = (w) a0Var;
                    if (a0Var instanceof y0) {
                        sb4 = new StringBuilder();
                        sb4.append(str);
                        sb4.append("BER Constructed Octet String[");
                        i10 = wVar.F().length;
                    } else {
                        sb4 = new StringBuilder();
                        sb4.append(str);
                        sb4.append("DER Octet String[");
                        i10 = wVar.F().length;
                    }
                    sb4.append(i10);
                    sb4.append("] ");
                    stringBuffer.append(sb4.toString());
                    if (z10) {
                        str2 = e(str, wVar.F());
                        stringBuffer.append(str2);
                        return;
                    }
                }
                a(str, z10, b10, stringBuffer);
                return;
            }
        }
        stringBuffer.append(str);
        stringBuffer.append("NULL");
        stringBuffer.append(d10);
    }

    private static String b(byte[] bArr, int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = i10; i12 != i10 + i11; i12++) {
            if (bArr[i12] >= 32 && bArr[i12] <= 126) {
                stringBuffer.append((char) bArr[i12]);
            }
        }
        return stringBuffer.toString();
    }

    public static String c(Object obj) {
        return d(obj, false);
    }

    public static String d(Object obj, boolean z10) {
        a0 a0Var;
        if (obj instanceof a0) {
            a0Var = (a0) obj;
        } else if (!(obj instanceof g)) {
            return "unknown object type " + obj.toString();
        } else {
            a0Var = ((g) obj).b();
        }
        StringBuffer stringBuffer = new StringBuffer();
        a(BuildConfig.FLAVOR, z10, a0Var, stringBuffer);
        return stringBuffer.toString();
    }

    private static String e(String str, byte[] bArr) {
        String b10;
        String d10 = q.d();
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = str + "    ";
        stringBuffer.append(d10);
        for (int i10 = 0; i10 < bArr.length; i10 += 32) {
            int length = bArr.length - i10;
            stringBuffer.append(str2);
            if (length > 32) {
                stringBuffer.append(q.b(f.e(bArr, i10, 32)));
                stringBuffer.append("    ");
                b10 = b(bArr, i10, 32);
            } else {
                stringBuffer.append(q.b(f.e(bArr, i10, bArr.length - i10)));
                for (int length2 = bArr.length - i10; length2 != 32; length2++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append("    ");
                b10 = b(bArr, i10, bArr.length - i10);
            }
            stringBuffer.append(b10);
            stringBuffer.append(d10);
        }
        return stringBuffer.toString();
    }
}
