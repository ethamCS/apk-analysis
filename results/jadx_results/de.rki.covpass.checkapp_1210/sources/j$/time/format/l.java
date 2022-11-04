package j$.time.format;

import j$.time.AbstractC0484a;
import j$.time.temporal.TemporalField;
/* loaded from: classes2.dex */
public class l implements g {

    /* renamed from: f */
    static final long[] f13080f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a */
    final TemporalField f13081a;

    /* renamed from: b */
    final int f13082b;

    /* renamed from: c */
    final int f13083c;

    /* renamed from: d */
    private final SignStyle f13084d;

    /* renamed from: e */
    final int f13085e;

    public l(TemporalField temporalField, int i10, int i11, SignStyle signStyle) {
        this.f13081a = temporalField;
        this.f13082b = i10;
        this.f13083c = i11;
        this.f13084d = signStyle;
        this.f13085e = 0;
    }

    public l(TemporalField temporalField, int i10, int i11, SignStyle signStyle, int i12) {
        this.f13081a = temporalField;
        this.f13082b = i10;
        this.f13083c = i11;
        this.f13084d = signStyle;
        this.f13085e = i12;
    }

    public static /* synthetic */ SignStyle a(l lVar) {
        return lVar.f13084d;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[LOOP:0: B:32:0x0096->B:34:0x009f, LOOP_END] */
    @Override // j$.time.format.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(j$.time.format.z r10, java.lang.StringBuilder r11) {
        /*
            r9 = this;
            j$.time.temporal.TemporalField r0 = r9.f13081a
            java.lang.Long r0 = r10.e(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            long r2 = r0.longValue()
            long r2 = r9.c(r10, r2)
            j$.time.format.C r10 = r10.b()
            r4 = -9223372036854775808
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L1f
            java.lang.String r0 = "9223372036854775808"
            goto L27
        L1f:
            long r4 = java.lang.Math.abs(r2)
            java.lang.String r0 = java.lang.Long.toString(r4)
        L27:
            int r4 = r0.length()
            int r5 = r9.f13083c
            java.lang.String r6 = " cannot be printed as the value "
            java.lang.String r7 = "Field "
            if (r4 > r5) goto Lab
            java.util.Objects.requireNonNull(r10)
            r4 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r4 = 2
            r5 = 1
            if (r10 < 0) goto L5e
            int[] r10 = j$.time.format.AbstractC0488d.f13067a
            j$.time.format.SignStyle r6 = r9.f13084d
            int r6 = r6.ordinal()
            r10 = r10[r6]
            if (r10 == r5) goto L4d
            if (r10 == r4) goto L5b
            goto L96
        L4d:
            int r10 = r9.f13082b
            r4 = 19
            if (r10 >= r4) goto L96
            long[] r4 = j$.time.format.l.f13080f
            r6 = r4[r10]
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 < 0) goto L96
        L5b:
            r10 = 43
            goto L93
        L5e:
            int[] r10 = j$.time.format.AbstractC0488d.f13067a
            j$.time.format.SignStyle r8 = r9.f13084d
            int r8 = r8.ordinal()
            r10 = r10[r8]
            if (r10 == r5) goto L91
            if (r10 == r4) goto L91
            r4 = 3
            if (r10 == r4) goto L91
            r4 = 4
            if (r10 == r4) goto L73
            goto L96
        L73:
            j$.time.DateTimeException r10 = new j$.time.DateTimeException
            java.lang.StringBuilder r11 = j$.time.AbstractC0484a.b(r7)
            j$.time.temporal.TemporalField r0 = r9.f13081a
            r11.append(r0)
            r11.append(r6)
            r11.append(r2)
            java.lang.String r0 = " cannot be negative according to the SignStyle"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L91:
            r10 = 45
        L93:
            r11.append(r10)
        L96:
            int r10 = r9.f13082b
            int r2 = r0.length()
            int r10 = r10 - r2
            if (r1 >= r10) goto La7
            r10 = 48
            r11.append(r10)
            int r1 = r1 + 1
            goto L96
        La7:
            r11.append(r0)
            return r5
        Lab:
            j$.time.DateTimeException r10 = new j$.time.DateTimeException
            java.lang.StringBuilder r11 = j$.time.AbstractC0484a.b(r7)
            j$.time.temporal.TemporalField r0 = r9.f13081a
            r11.append(r0)
            r11.append(r6)
            r11.append(r2)
            java.lang.String r0 = " exceeds the maximum print width of "
            r11.append(r0)
            int r0 = r9.f13083c
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.l.b(j$.time.format.z, java.lang.StringBuilder):boolean");
    }

    long c(z zVar, long j10) {
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0180  */
    @Override // j$.time.format.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(j$.time.format.x r20, java.lang.CharSequence r21, int r22) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.l.d(j$.time.format.x, java.lang.CharSequence, int):int");
    }

    public boolean e(x xVar) {
        int i10 = this.f13085e;
        return i10 == -1 || (i10 > 0 && this.f13082b == this.f13083c && this.f13084d == SignStyle.NOT_NEGATIVE);
    }

    int f(x xVar, long j10, int i10, int i11) {
        return xVar.o(this.f13081a, j10, i10, i11);
    }

    public l g() {
        return this.f13085e == -1 ? this : new l(this.f13081a, this.f13082b, this.f13083c, this.f13084d, -1);
    }

    public l h(int i10) {
        return new l(this.f13081a, this.f13082b, this.f13083c, this.f13084d, this.f13085e + i10);
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        int i10 = this.f13082b;
        if (i10 == 1 && this.f13083c == 19 && this.f13084d == SignStyle.NORMAL) {
            sb2 = AbstractC0484a.b("Value(");
            obj = this.f13081a;
        } else if (i10 == this.f13083c && this.f13084d == SignStyle.NOT_NEGATIVE) {
            sb2 = AbstractC0484a.b("Value(");
            sb2.append(this.f13081a);
            sb2.append(",");
            sb2.append(this.f13082b);
            sb2.append(")");
            return sb2.toString();
        } else {
            sb2 = AbstractC0484a.b("Value(");
            sb2.append(this.f13081a);
            sb2.append(",");
            sb2.append(this.f13082b);
            sb2.append(",");
            sb2.append(this.f13083c);
            sb2.append(",");
            obj = this.f13084d;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
