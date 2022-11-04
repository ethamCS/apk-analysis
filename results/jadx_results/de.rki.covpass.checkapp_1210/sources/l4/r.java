package l4;

import android.graphics.Paint;
import g4.t;
import java.util.List;
/* loaded from: classes.dex */
public class r implements l4.c {

    /* renamed from: a */
    private final String f15794a;

    /* renamed from: b */
    private final k4.b f15795b;

    /* renamed from: c */
    private final List<k4.b> f15796c;

    /* renamed from: d */
    private final k4.a f15797d;

    /* renamed from: e */
    private final k4.d f15798e;

    /* renamed from: f */
    private final k4.b f15799f;

    /* renamed from: g */
    private final b f15800g;

    /* renamed from: h */
    private final c f15801h;

    /* renamed from: i */
    private final float f15802i;

    /* renamed from: j */
    private final boolean f15803j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15804a;

        /* renamed from: b */
        static final /* synthetic */ int[] f15805b;

        static {
            int[] iArr = new int[c.values().length];
            f15805b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15805b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15805b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f15804a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15804a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15804a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap b() {
            int i10 = a.f15804a[ordinal()];
            return i10 != 1 ? i10 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join b() {
            int i10 = a.f15805b[ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return Paint.Join.MITER;
                }
                if (i10 == 3) {
                    return Paint.Join.ROUND;
                }
                return null;
            }
            return Paint.Join.BEVEL;
        }
    }

    public r(String str, k4.b bVar, List<k4.b> list, k4.a aVar, k4.d dVar, k4.b bVar2, b bVar3, c cVar, float f10, boolean z10) {
        this.f15794a = str;
        this.f15795b = bVar;
        this.f15796c = list;
        this.f15797d = aVar;
        this.f15798e = dVar;
        this.f15799f = bVar2;
        this.f15800g = bVar3;
        this.f15801h = cVar;
        this.f15802i = f10;
        this.f15803j = z10;
    }

    @Override // l4.c
    public g4.c a(com.airbnb.lottie.n nVar, m4.b bVar) {
        return new t(nVar, bVar, this);
    }

    public b b() {
        return this.f15800g;
    }

    public k4.a c() {
        return this.f15797d;
    }

    public k4.b d() {
        return this.f15795b;
    }

    public c e() {
        return this.f15801h;
    }

    public List<k4.b> f() {
        return this.f15796c;
    }

    public float g() {
        return this.f15802i;
    }

    public String h() {
        return this.f15794a;
    }

    public k4.d i() {
        return this.f15798e;
    }

    public k4.b j() {
        return this.f15799f;
    }

    public boolean k() {
        return this.f15803j;
    }
}
