package t7;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class m {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21964a;

        static {
            int[] iArr = new int[q.values().length];
            f21964a = iArr;
            try {
                iArr[q.TextString.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21964a[q.Array.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21964a[q.Map.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21964a[q.Integer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21964a[q.FloatingPoint.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21964a[q.Boolean.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21964a[q.SimpleValue.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21964a[q.ByteString.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private static boolean a(List<o> list, o oVar, o oVar2) {
        if (oVar2.s1() == q.Array || oVar2.s1() == q.Map) {
            o O0 = oVar2.O0();
            if (oVar.O0() == O0) {
                throw new h("Circular reference in CBOR Object");
            }
            if (list != null) {
                for (o oVar3 : list) {
                    if (oVar3.O0() == O0) {
                        throw new h("Circular reference in CBOR Object");
                    }
                }
            }
            list.add(oVar2);
            return true;
        }
        return false;
    }

    private static void b(List<o> list, boolean z10) {
        if (!z10 || list == null) {
            return;
        }
        list.remove(list.size() - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0110, code lost:
        if (r14.i() != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void c(java.lang.String r12, t7.b0 r13, t7.w r14) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.m.c(java.lang.String, t7.b0, t7.w):void");
    }

    public static void d(o oVar, b0 b0Var, w wVar) {
        e(oVar, b0Var, wVar, (oVar.s1() == q.Array || oVar.s1() == q.Map) ? new ArrayList() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void e(t7.o r17, t7.b0 r18, t7.w r19, java.util.List<t7.o> r20) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.m.e(t7.o, t7.b0, t7.w, java.util.List):void");
    }
}
