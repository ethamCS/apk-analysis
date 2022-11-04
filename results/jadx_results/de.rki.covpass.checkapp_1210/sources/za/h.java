package za;

import java.nio.charset.Charset;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lza/c;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "fallbackCharset", BuildConfig.FLAVOR, "a", "(Lza/c;Ljava/nio/charset/Charset;Lxb/d;)Ljava/lang/Object;", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class h {

    @zb.f(c = "io.ktor.client.statement.HttpStatementKt", f = "HttpStatement.kt", l = {176}, m = "readText")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends zb.d {
        int U3;

        /* renamed from: x */
        Object f26588x;

        /* renamed from: y */
        /* synthetic */ Object f26589y;

        a(xb.d<? super a> dVar) {
            super(dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f26589y = obj;
            this.U3 |= Integer.MIN_VALUE;
            return h.a(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(za.c r5, java.nio.charset.Charset r6, xb.d<? super java.lang.String> r7) {
        /*
            boolean r0 = r7 instanceof za.h.a
            if (r0 == 0) goto L13
            r0 = r7
            za.h$a r0 = (za.h.a) r0
            int r1 = r0.U3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.U3 = r1
            goto L18
        L13:
            za.h$a r0 = new za.h$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26589y
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.U3
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f26588x
            java.nio.charset.CharsetDecoder r5 = (java.nio.charset.CharsetDecoder) r5
            tb.t.b(r7)
            goto L6c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            tb.t.b(r7)
            java.nio.charset.Charset r7 = bb.t.a(r5)
            if (r7 != 0) goto L43
            if (r6 != 0) goto L44
            java.nio.charset.Charset r6 = bf.d.f5986b
            goto L44
        L43:
            r6 = r7
        L44:
            java.nio.charset.CharsetDecoder r6 = r6.newDecoder()
            oa.b r5 = r5.c()
            java.lang.Class<ob.z> r7 = ob.z.class
            oc.n r7 = hc.k0.j(r7)
            java.lang.reflect.Type r2 = oc.t.f(r7)
            java.lang.Class<ob.z> r4 = ob.z.class
            oc.d r4 = hc.k0.b(r4)
            kb.a r7 = kb.c.b(r2, r4, r7)
            r0.f26588x = r6
            r0.U3 = r3
            java.lang.Object r7 = r5.l(r7, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            r5 = r6
        L6c:
            java.lang.String r6 = "null cannot be cast to non-null type io.ktor.utils.io.core.Input"
            java.util.Objects.requireNonNull(r7, r6)
            ob.z r7 = (ob.z) r7
            java.lang.String r6 = "decoder"
            hc.t.d(r5, r6)
            r6 = 0
            r0 = 2
            r1 = 0
            java.lang.String r5 = mb.b.b(r5, r7, r6, r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: za.h.a(za.c, java.nio.charset.Charset, xb.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(c cVar, Charset charset, xb.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return a(cVar, charset, dVar);
    }
}
