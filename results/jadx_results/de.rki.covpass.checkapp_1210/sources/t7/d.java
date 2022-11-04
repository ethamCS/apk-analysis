package t7;

import java.util.Date;
import java.util.Objects;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b */
    public static final d f21941b = new d(b.TaggedString);

    /* renamed from: c */
    public static final d f21942c = new d(b.TaggedNumber);

    /* renamed from: d */
    public static final d f21943d = new d(b.UntaggedNumber);

    /* renamed from: a */
    private final b f21944a;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21945a;

        static {
            int[] iArr = new int[b.values().length];
            f21945a = iArr;
            try {
                iArr[b.TaggedString.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21945a[b.TaggedNumber.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21945a[b.UntaggedNumber.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        TaggedString,
        TaggedNumber,
        UntaggedNumber
    }

    public d() {
        this(b.TaggedString);
    }

    public d(b bVar) {
        this.f21944a = bVar;
    }

    public o a(u7.f fVar, int[] iArr) {
        Objects.requireNonNull(fVar, "bigYear");
        Objects.requireNonNull(iArr, "lesserFields");
        if (iArr.length < 7) {
            throw new IllegalArgumentException("\"lesserFields\" + \"'s length\" (" + iArr.length + ") is not greater or equal to 7");
        }
        try {
            t.i(fVar, iArr);
            int i10 = a.f21945a[this.f21944a.ordinal()];
            if (i10 == 1) {
                return o.c0(t.L(fVar, iArr), 0);
            }
            if (i10 != 2 && i10 != 3) {
                throw new h("Internal error");
            }
            try {
                int[] iArr2 = new int[1];
                u7.e l10 = t.l(fVar, iArr, iArr2);
                if (iArr2[0] == 0) {
                    return this.f21944a == b.TaggedNumber ? o.c0(l10.H(), 1) : o.X(l10.H());
                } else if (iArr2[0] != 1) {
                    throw new h("Too big or small to fit an integer or floating-point number");
                } else {
                    return this.f21944a == b.TaggedNumber ? o.K(l10.F(), 8).Q0(1) : o.K(l10.F(), 8);
                }
            } catch (IllegalArgumentException e10) {
                throw new h(e10.getMessage(), e10);
            }
        } catch (IllegalArgumentException e11) {
            throw new h(e11.getMessage(), e11);
        }
    }

    public o b(Date date) {
        try {
            int[] iArr = new int[7];
            u7.f[] fVarArr = new u7.f[1];
            z.a(date, fVarArr, iArr);
            return a(fVarArr[0], iArr);
        } catch (IllegalArgumentException e10) {
            throw new h(e10.getMessage(), e10);
        }
    }
}
