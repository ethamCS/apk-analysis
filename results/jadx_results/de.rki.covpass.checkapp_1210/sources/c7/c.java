package c7;

import h6.m;
import h6.s;
/* loaded from: classes.dex */
final class c {

    /* renamed from: a */
    private final o6.b f6319a;

    /* renamed from: b */
    private final s f6320b;

    /* renamed from: c */
    private final s f6321c;

    /* renamed from: d */
    private final s f6322d;

    /* renamed from: e */
    private final s f6323e;

    /* renamed from: f */
    private final int f6324f;

    /* renamed from: g */
    private final int f6325g;

    /* renamed from: h */
    private final int f6326h;

    /* renamed from: i */
    private final int f6327i;

    public c(c cVar) {
        this.f6319a = cVar.f6319a;
        this.f6320b = cVar.f6320b;
        this.f6321c = cVar.f6321c;
        this.f6322d = cVar.f6322d;
        this.f6323e = cVar.f6323e;
        this.f6324f = cVar.f6324f;
        this.f6325g = cVar.f6325g;
        this.f6326h = cVar.f6326h;
        this.f6327i = cVar.f6327i;
    }

    public c(o6.b bVar, s sVar, s sVar2, s sVar3, s sVar4) {
        boolean z10 = false;
        boolean z11 = sVar == null || sVar2 == null;
        z10 = (sVar3 == null || sVar4 == null) ? true : z10;
        if (!z11 || !z10) {
            if (z11) {
                sVar = new s(0.0f, sVar3.d());
                sVar2 = new s(0.0f, sVar4.d());
            } else if (z10) {
                sVar3 = new s(bVar.l() - 1, sVar.d());
                sVar4 = new s(bVar.l() - 1, sVar2.d());
            }
            this.f6319a = bVar;
            this.f6320b = sVar;
            this.f6321c = sVar2;
            this.f6322d = sVar3;
            this.f6323e = sVar4;
            this.f6324f = (int) Math.min(sVar.c(), sVar2.c());
            this.f6325g = (int) Math.max(sVar3.c(), sVar4.c());
            this.f6326h = (int) Math.min(sVar.d(), sVar3.d());
            this.f6327i = (int) Math.max(sVar2.d(), sVar4.d());
            return;
        }
        throw m.b();
    }

    public static c j(c cVar, c cVar2) {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new c(cVar.f6319a, cVar.f6320b, cVar.f6321c, cVar2.f6322d, cVar2.f6323e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c7.c a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            h6.s r0 = r12.f6320b
            h6.s r1 = r12.f6321c
            h6.s r2 = r12.f6322d
            h6.s r3 = r12.f6323e
            if (r13 <= 0) goto L29
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            h6.s r13 = new h6.s
            float r4 = r4.c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L26
            r8 = r13
            goto L2a
        L26:
            r10 = r13
            r8 = r0
            goto L2b
        L29:
            r8 = r0
        L2a:
            r10 = r2
        L2b:
            if (r14 <= 0) goto L5b
            if (r15 == 0) goto L32
            h6.s r13 = r12.f6321c
            goto L34
        L32:
            h6.s r13 = r12.f6323e
        L34:
            float r0 = r13.d()
            int r0 = (int) r0
            int r0 = r0 + r14
            o6.b r14 = r12.f6319a
            int r14 = r14.i()
            if (r0 < r14) goto L4a
            o6.b r14 = r12.f6319a
            int r14 = r14.i()
            int r0 = r14 + (-1)
        L4a:
            h6.s r14 = new h6.s
            float r13 = r13.c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L58
            r9 = r14
            goto L5c
        L58:
            r11 = r14
            r9 = r1
            goto L5d
        L5b:
            r9 = r1
        L5c:
            r11 = r3
        L5d:
            c7.c r13 = new c7.c
            o6.b r7 = r12.f6319a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.c.a(int, int, boolean):c7.c");
    }

    public s b() {
        return this.f6321c;
    }

    public s c() {
        return this.f6323e;
    }

    public int d() {
        return this.f6325g;
    }

    public int e() {
        return this.f6327i;
    }

    public int f() {
        return this.f6324f;
    }

    public int g() {
        return this.f6326h;
    }

    public s h() {
        return this.f6320b;
    }

    public s i() {
        return this.f6322d;
    }
}
