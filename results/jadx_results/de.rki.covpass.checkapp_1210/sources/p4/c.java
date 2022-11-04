package p4;

import eg.f;
import eg.q;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class c implements Closeable {
    private static final String[] V3 = new String[128];
    boolean U3;

    /* renamed from: c */
    int f18885c;

    /* renamed from: d */
    int[] f18886d = new int[32];

    /* renamed from: q */
    String[] f18887q = new String[32];

    /* renamed from: x */
    int[] f18888x = new int[32];

    /* renamed from: y */
    boolean f18889y;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final String[] f18890a;

        /* renamed from: b */
        final q f18891b;

        private a(String[] strArr, q qVar) {
            this.f18890a = strArr;
            this.f18891b = qVar;
        }

        public static a a(String... strArr) {
            try {
                f[] fVarArr = new f[strArr.length];
                eg.c cVar = new eg.c();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c.e0(cVar, strArr[i10]);
                    cVar.readByte();
                    fVarArr[i10] = cVar.w0();
                }
                return new a((String[]) strArr.clone(), q.l(fVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            V3[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = V3;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e0(eg.d r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = p4.c.V3
            r1 = 34
            r7.i0(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.x(r8, r4, r3)
        L2e:
            r7.Q0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.x(r8, r4, r2)
        L3b:
            r7.i0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.c.e0(eg.d, java.lang.String):void");
    }

    public static c z(eg.e eVar) {
        return new e(eVar);
    }

    public abstract b B();

    public final void G(int i10) {
        int i11 = this.f18885c;
        int[] iArr = this.f18886d;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new p4.a("Nesting too deep at " + l());
            }
            this.f18886d = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f18887q;
            this.f18887q = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f18888x;
            this.f18888x = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f18886d;
        int i12 = this.f18885c;
        this.f18885c = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int M(a aVar);

    public abstract void V();

    public abstract void W();

    public abstract void e();

    public abstract void f();

    public final p4.b f0(String str) {
        throw new p4.b(str + " at path " + l());
    }

    public abstract void h();

    public abstract void i();

    public abstract boolean j();

    public final String l() {
        return d.a(this.f18885c, this.f18886d, this.f18887q, this.f18888x);
    }

    public abstract boolean n();

    public abstract double p();

    public abstract int r();

    public abstract String s();

    public abstract String u();
}
