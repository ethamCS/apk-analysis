package m4;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.n;
import h4.a;
import h4.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l4.h;
import m4.e;
import o4.j;
/* loaded from: classes.dex */
public abstract class b implements g4.e, a.b, j4.f {
    private Paint A;
    BlurMaskFilter C;

    /* renamed from: g */
    private final Paint f16277g;

    /* renamed from: n */
    private final String f16284n;

    /* renamed from: p */
    final n f16286p;

    /* renamed from: q */
    final e f16287q;

    /* renamed from: r */
    private h4.h f16288r;

    /* renamed from: s */
    private h4.d f16289s;

    /* renamed from: t */
    private b f16290t;

    /* renamed from: u */
    private b f16291u;

    /* renamed from: v */
    private List<b> f16292v;

    /* renamed from: x */
    final p f16294x;

    /* renamed from: z */
    private boolean f16296z;

    /* renamed from: a */
    private final Path f16271a = new Path();

    /* renamed from: b */
    private final Matrix f16272b = new Matrix();

    /* renamed from: c */
    private final Matrix f16273c = new Matrix();

    /* renamed from: d */
    private final Paint f16274d = new f4.a(1);

    /* renamed from: e */
    private final Paint f16275e = new f4.a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: f */
    private final Paint f16276f = new f4.a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: h */
    private final Paint f16278h = new f4.a(PorterDuff.Mode.CLEAR);

    /* renamed from: i */
    private final RectF f16279i = new RectF();

    /* renamed from: j */
    private final RectF f16280j = new RectF();

    /* renamed from: k */
    private final RectF f16281k = new RectF();

    /* renamed from: l */
    private final RectF f16282l = new RectF();

    /* renamed from: m */
    private final RectF f16283m = new RectF();

    /* renamed from: o */
    final Matrix f16285o = new Matrix();

    /* renamed from: w */
    private final List<h4.a<?, ?>> f16293w = new ArrayList();

    /* renamed from: y */
    private boolean f16295y = true;
    float B = 0.0f;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16297a;

        /* renamed from: b */
        static final /* synthetic */ int[] f16298b;

        static {
            int[] iArr = new int[h.a.values().length];
            f16298b = iArr;
            try {
                iArr[h.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16298b[h.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16298b[h.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16298b[h.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f16297a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16297a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16297a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16297a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16297a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16297a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16297a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(n nVar, e eVar) {
        f4.a aVar = new f4.a(1);
        this.f16277g = aVar;
        this.f16286p = nVar;
        this.f16287q = eVar;
        this.f16284n = eVar.i() + "#draw";
        aVar.setXfermode(eVar.h() == e.b.INVERT ? new PorterDuffXfermode(PorterDuff.Mode.DST_OUT) : new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        p b10 = eVar.w().b();
        this.f16294x = b10;
        b10.b(this);
        if (eVar.g() != null && !eVar.g().isEmpty()) {
            h4.h hVar = new h4.h(eVar.g());
            this.f16288r = hVar;
            for (h4.a<l4.n, Path> aVar2 : hVar.a()) {
                aVar2.a(this);
            }
            for (h4.a<Integer, Integer> aVar3 : this.f16288r.c()) {
                i(aVar3);
                aVar3.a(this);
            }
        }
        O();
    }

    private void C(RectF rectF, Matrix matrix) {
        this.f16281k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (!A()) {
            return;
        }
        int size = this.f16288r.b().size();
        for (int i10 = 0; i10 < size; i10++) {
            l4.h hVar = this.f16288r.b().get(i10);
            Path h10 = this.f16288r.a().get(i10).h();
            if (h10 != null) {
                this.f16271a.set(h10);
                this.f16271a.transform(matrix);
                int i11 = a.f16298b[hVar.a().ordinal()];
                if (i11 == 1 || i11 == 2) {
                    return;
                }
                if ((i11 == 3 || i11 == 4) && hVar.d()) {
                    return;
                }
                this.f16271a.computeBounds(this.f16283m, false);
                RectF rectF2 = this.f16281k;
                if (i10 == 0) {
                    rectF2.set(this.f16283m);
                } else {
                    rectF2.set(Math.min(rectF2.left, this.f16283m.left), Math.min(this.f16281k.top, this.f16283m.top), Math.max(this.f16281k.right, this.f16283m.right), Math.max(this.f16281k.bottom, this.f16283m.bottom));
                }
            }
        }
        if (rectF.intersect(this.f16281k)) {
            return;
        }
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    private void D(RectF rectF, Matrix matrix) {
        if (B() && this.f16287q.h() != e.b.INVERT) {
            this.f16282l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f16290t.a(this.f16282l, matrix, true);
            if (rectF.intersect(this.f16282l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void E() {
        this.f16286p.invalidateSelf();
    }

    public /* synthetic */ void F() {
        N(this.f16289s.p() == 1.0f);
    }

    private void G(float f10) {
        this.f16286p.E().n().a(this.f16287q.i(), f10);
    }

    private void N(boolean z10) {
        if (z10 != this.f16295y) {
            this.f16295y = z10;
            E();
        }
    }

    private void O() {
        boolean z10 = true;
        if (this.f16287q.e().isEmpty()) {
            N(true);
            return;
        }
        h4.d dVar = new h4.d(this.f16287q.e());
        this.f16289s = dVar;
        dVar.l();
        this.f16289s.a(new a.b() { // from class: m4.a
            @Override // h4.a.b
            public final void b() {
                b.this.F();
            }
        });
        if (this.f16289s.h().floatValue() != 1.0f) {
            z10 = false;
        }
        N(z10);
        i(this.f16289s);
    }

    private void j(Canvas canvas, Matrix matrix, h4.a<l4.n, Path> aVar, h4.a<Integer, Integer> aVar2) {
        this.f16271a.set(aVar.h());
        this.f16271a.transform(matrix);
        this.f16274d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f16271a, this.f16274d);
    }

    private void k(Canvas canvas, Matrix matrix, h4.a<l4.n, Path> aVar, h4.a<Integer, Integer> aVar2) {
        q4.h.m(canvas, this.f16279i, this.f16275e);
        this.f16271a.set(aVar.h());
        this.f16271a.transform(matrix);
        this.f16274d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f16271a, this.f16274d);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, h4.a<l4.n, Path> aVar, h4.a<Integer, Integer> aVar2) {
        q4.h.m(canvas, this.f16279i, this.f16274d);
        canvas.drawRect(this.f16279i, this.f16274d);
        this.f16271a.set(aVar.h());
        this.f16271a.transform(matrix);
        this.f16274d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f16271a, this.f16276f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, h4.a<l4.n, Path> aVar, h4.a<Integer, Integer> aVar2) {
        q4.h.m(canvas, this.f16279i, this.f16275e);
        canvas.drawRect(this.f16279i, this.f16274d);
        this.f16276f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f16271a.set(aVar.h());
        this.f16271a.transform(matrix);
        canvas.drawPath(this.f16271a, this.f16276f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix, h4.a<l4.n, Path> aVar, h4.a<Integer, Integer> aVar2) {
        q4.h.m(canvas, this.f16279i, this.f16276f);
        canvas.drawRect(this.f16279i, this.f16274d);
        this.f16276f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f16271a.set(aVar.h());
        this.f16271a.transform(matrix);
        canvas.drawPath(this.f16271a, this.f16276f);
        canvas.restore();
    }

    private void p(Canvas canvas, Matrix matrix) {
        e4.c.a("Layer#saveLayer");
        q4.h.n(canvas, this.f16279i, this.f16275e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        e4.c.b("Layer#saveLayer");
        for (int i10 = 0; i10 < this.f16288r.b().size(); i10++) {
            l4.h hVar = this.f16288r.b().get(i10);
            h4.a<l4.n, Path> aVar = this.f16288r.a().get(i10);
            h4.a<Integer, Integer> aVar2 = this.f16288r.c().get(i10);
            int i11 = a.f16298b[hVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f16274d.setColor(-16777216);
                        this.f16274d.setAlpha(255);
                        canvas.drawRect(this.f16279i, this.f16274d);
                    }
                    if (hVar.d()) {
                        o(canvas, matrix, aVar, aVar2);
                    } else {
                        q(canvas, matrix, aVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (hVar.d()) {
                            m(canvas, matrix, aVar, aVar2);
                        } else {
                            j(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (hVar.d()) {
                    n(canvas, matrix, aVar, aVar2);
                } else {
                    k(canvas, matrix, aVar, aVar2);
                }
            } else if (r()) {
                this.f16274d.setAlpha(255);
                canvas.drawRect(this.f16279i, this.f16274d);
            }
        }
        e4.c.a("Layer#restoreLayer");
        canvas.restore();
        e4.c.b("Layer#restoreLayer");
    }

    private void q(Canvas canvas, Matrix matrix, h4.a<l4.n, Path> aVar) {
        this.f16271a.set(aVar.h());
        this.f16271a.transform(matrix);
        canvas.drawPath(this.f16271a, this.f16276f);
    }

    private boolean r() {
        if (this.f16288r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f16288r.b().size(); i10++) {
            if (this.f16288r.b().get(i10).a() != h.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void s() {
        if (this.f16292v != null) {
            return;
        }
        if (this.f16291u == null) {
            this.f16292v = Collections.emptyList();
            return;
        }
        this.f16292v = new ArrayList();
        for (b bVar = this.f16291u; bVar != null; bVar = bVar.f16291u) {
            this.f16292v.add(bVar);
        }
    }

    private void t(Canvas canvas) {
        e4.c.a("Layer#clearLayer");
        RectF rectF = this.f16279i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f16278h);
        e4.c.b("Layer#clearLayer");
    }

    public static b v(c cVar, e eVar, n nVar, e4.h hVar) {
        switch (a.f16297a[eVar.f().ordinal()]) {
            case 1:
                return new g(nVar, eVar, cVar);
            case 2:
                return new c(nVar, eVar, hVar.o(eVar.m()), hVar);
            case 3:
                return new h(nVar, eVar);
            case 4:
                return new d(nVar, eVar);
            case 5:
                return new f(nVar, eVar);
            case 6:
                return new i(nVar, eVar);
            default:
                q4.d.c("Unknown layer type " + eVar.f());
                return null;
        }
    }

    boolean A() {
        h4.h hVar = this.f16288r;
        return hVar != null && !hVar.a().isEmpty();
    }

    boolean B() {
        return this.f16290t != null;
    }

    public void H(h4.a<?, ?> aVar) {
        this.f16293w.remove(aVar);
    }

    void I(j4.e eVar, int i10, List<j4.e> list, j4.e eVar2) {
    }

    public void J(b bVar) {
        this.f16290t = bVar;
    }

    public void K(boolean z10) {
        if (z10 && this.A == null) {
            this.A = new f4.a();
        }
        this.f16296z = z10;
    }

    public void L(b bVar) {
        this.f16291u = bVar;
    }

    public void M(float f10) {
        this.f16294x.j(f10);
        if (this.f16288r != null) {
            for (int i10 = 0; i10 < this.f16288r.a().size(); i10++) {
                this.f16288r.a().get(i10).m(f10);
            }
        }
        h4.d dVar = this.f16289s;
        if (dVar != null) {
            dVar.m(f10);
        }
        b bVar = this.f16290t;
        if (bVar != null) {
            bVar.M(f10);
        }
        for (int i11 = 0; i11 < this.f16293w.size(); i11++) {
            this.f16293w.get(i11).m(f10);
        }
    }

    @Override // g4.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        this.f16279i.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.f16285o.set(matrix);
        if (z10) {
            List<b> list = this.f16292v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f16285o.preConcat(this.f16292v.get(size).f16294x.f());
                }
            } else {
                b bVar = this.f16291u;
                if (bVar != null) {
                    this.f16285o.preConcat(bVar.f16294x.f());
                }
            }
        }
        this.f16285o.preConcat(this.f16294x.f());
    }

    @Override // h4.a.b
    public void b() {
        E();
    }

    @Override // g4.c
    public void c(List<g4.c> list, List<g4.c> list2) {
    }

    @Override // j4.f
    public <T> void e(T t10, r4.c<T> cVar) {
        this.f16294x.c(t10, cVar);
    }

    @Override // g4.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        Paint paint;
        e4.c.a(this.f16284n);
        if (!this.f16295y || this.f16287q.x()) {
            e4.c.b(this.f16284n);
            return;
        }
        s();
        e4.c.a("Layer#parentMatrix");
        this.f16272b.reset();
        this.f16272b.set(matrix);
        for (int size = this.f16292v.size() - 1; size >= 0; size--) {
            this.f16272b.preConcat(this.f16292v.get(size).f16294x.f());
        }
        e4.c.b("Layer#parentMatrix");
        int intValue = (int) ((((i10 / 255.0f) * (this.f16294x.h() == null ? 100 : this.f16294x.h().h().intValue())) / 100.0f) * 255.0f);
        if (!B() && !A()) {
            this.f16272b.preConcat(this.f16294x.f());
            e4.c.a("Layer#drawLayer");
            u(canvas, this.f16272b, intValue);
            e4.c.b("Layer#drawLayer");
            G(e4.c.b(this.f16284n));
            return;
        }
        e4.c.a("Layer#computeBounds");
        a(this.f16279i, this.f16272b, false);
        D(this.f16279i, matrix);
        this.f16272b.preConcat(this.f16294x.f());
        C(this.f16279i, this.f16272b);
        this.f16280j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f16273c);
        if (!this.f16273c.isIdentity()) {
            Matrix matrix2 = this.f16273c;
            matrix2.invert(matrix2);
            this.f16273c.mapRect(this.f16280j);
        }
        if (!this.f16279i.intersect(this.f16280j)) {
            this.f16279i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        e4.c.b("Layer#computeBounds");
        if (this.f16279i.width() >= 1.0f && this.f16279i.height() >= 1.0f) {
            e4.c.a("Layer#saveLayer");
            this.f16274d.setAlpha(255);
            q4.h.m(canvas, this.f16279i, this.f16274d);
            e4.c.b("Layer#saveLayer");
            t(canvas);
            e4.c.a("Layer#drawLayer");
            u(canvas, this.f16272b, intValue);
            e4.c.b("Layer#drawLayer");
            if (A()) {
                p(canvas, this.f16272b);
            }
            if (B()) {
                e4.c.a("Layer#drawMatte");
                e4.c.a("Layer#saveLayer");
                q4.h.n(canvas, this.f16279i, this.f16277g, 19);
                e4.c.b("Layer#saveLayer");
                t(canvas);
                this.f16290t.g(canvas, matrix, intValue);
                e4.c.a("Layer#restoreLayer");
                canvas.restore();
                e4.c.b("Layer#restoreLayer");
                e4.c.b("Layer#drawMatte");
            }
            e4.c.a("Layer#restoreLayer");
            canvas.restore();
            e4.c.b("Layer#restoreLayer");
        }
        if (this.f16296z && (paint = this.A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.A.setColor(-251901);
            this.A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f16279i, this.A);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(1357638635);
            canvas.drawRect(this.f16279i, this.A);
        }
        G(e4.c.b(this.f16284n));
    }

    @Override // g4.c
    public String getName() {
        return this.f16287q.i();
    }

    @Override // j4.f
    public void h(j4.e eVar, int i10, List<j4.e> list, j4.e eVar2) {
        b bVar = this.f16290t;
        if (bVar != null) {
            j4.e a10 = eVar2.a(bVar.getName());
            if (eVar.c(this.f16290t.getName(), i10)) {
                list.add(a10.i(this.f16290t));
            }
            if (eVar.h(getName(), i10)) {
                this.f16290t.I(eVar, eVar.e(this.f16290t.getName(), i10) + i10, list, a10);
            }
        }
        if (!eVar.g(getName(), i10)) {
            return;
        }
        if (!"__container".equals(getName())) {
            eVar2 = eVar2.a(getName());
            if (eVar.c(getName(), i10)) {
                list.add(eVar2.i(this));
            }
        }
        if (!eVar.h(getName(), i10)) {
            return;
        }
        I(eVar, i10 + eVar.e(getName(), i10), list, eVar2);
    }

    public void i(h4.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f16293w.add(aVar);
    }

    abstract void u(Canvas canvas, Matrix matrix, int i10);

    public l4.a w() {
        return this.f16287q.a();
    }

    public BlurMaskFilter x(float f10) {
        if (this.B == f10) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f10;
        return blurMaskFilter;
    }

    public j y() {
        return this.f16287q.c();
    }

    public e z() {
        return this.f16287q;
    }
}
