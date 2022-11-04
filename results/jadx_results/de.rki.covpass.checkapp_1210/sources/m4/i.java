package m4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.n;
import e4.u;
import h4.o;
import h4.q;
import j4.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k4.k;
import l4.p;
/* loaded from: classes.dex */
public class i extends m4.b {
    private final StringBuilder D = new StringBuilder(2);
    private final RectF E = new RectF();
    private final Matrix F = new Matrix();
    private final Paint G = new a(1);
    private final Paint H = new b(1);
    private final Map<j4.d, List<g4.d>> I = new HashMap();
    private final i0.d<String> J = new i0.d<>();
    private final o K;
    private final n L;
    private final e4.h M;
    private h4.a<Integer, Integer> N;
    private h4.a<Integer, Integer> O;
    private h4.a<Integer, Integer> P;
    private h4.a<Integer, Integer> Q;
    private h4.a<Float, Float> R;
    private h4.a<Float, Float> S;
    private h4.a<Float, Float> T;
    private h4.a<Float, Float> U;
    private h4.a<Float, Float> V;
    private h4.a<Typeface, Typeface> W;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends Paint {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(i10);
            i.this = r1;
            setStyle(Paint.Style.FILL);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends Paint {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(i10);
            i.this = r1;
            setStyle(Paint.Style.STROKE);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f16336a;

        static {
            int[] iArr = new int[b.a.values().length];
            f16336a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16336a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16336a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(n nVar, e eVar) {
        super(nVar, eVar);
        k4.b bVar;
        k4.b bVar2;
        k4.a aVar;
        k4.a aVar2;
        this.L = nVar;
        this.M = eVar.b();
        o n10 = eVar.s().n();
        this.K = n10;
        n10.a(this);
        i(n10);
        k t10 = eVar.t();
        if (t10 != null && (aVar2 = t10.f14612a) != null) {
            h4.a<Integer, Integer> n11 = aVar2.n();
            this.N = n11;
            n11.a(this);
            i(this.N);
        }
        if (t10 != null && (aVar = t10.f14613b) != null) {
            h4.a<Integer, Integer> n12 = aVar.n();
            this.P = n12;
            n12.a(this);
            i(this.P);
        }
        if (t10 != null && (bVar2 = t10.f14614c) != null) {
            h4.a<Float, Float> n13 = bVar2.n();
            this.R = n13;
            n13.a(this);
            i(this.R);
        }
        if (t10 == null || (bVar = t10.f14615d) == null) {
            return;
        }
        h4.a<Float, Float> n14 = bVar.n();
        this.T = n14;
        n14.a(this);
        i(this.T);
    }

    private void P(b.a aVar, Canvas canvas, float f10) {
        float f11;
        int i10 = c.f16336a[aVar.ordinal()];
        if (i10 == 2) {
            f11 = -f10;
        } else if (i10 != 3) {
            return;
        } else {
            f11 = (-f10) / 2.0f;
        }
        canvas.translate(f11, 0.0f);
    }

    private String Q(String str, int i10) {
        int codePointAt = str.codePointAt(i10);
        int charCount = Character.charCount(codePointAt) + i10;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!d0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j10 = codePointAt;
        if (this.J.e(j10)) {
            return this.J.g(j10);
        }
        this.D.setLength(0);
        while (i10 < charCount) {
            int codePointAt3 = str.codePointAt(i10);
            this.D.appendCodePoint(codePointAt3);
            i10 += Character.charCount(codePointAt3);
        }
        String sb2 = this.D.toString();
        this.J.l(j10, sb2);
        return sb2;
    }

    private void R(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void S(j4.d dVar, Matrix matrix, float f10, j4.b bVar, Canvas canvas) {
        Paint paint;
        List<g4.d> Z = Z(dVar);
        for (int i10 = 0; i10 < Z.size(); i10++) {
            Path l10 = Z.get(i10).l();
            l10.computeBounds(this.E, false);
            this.F.set(matrix);
            this.F.preTranslate(0.0f, (-bVar.f13982g) * q4.h.e());
            this.F.preScale(f10, f10);
            l10.transform(this.F);
            if (bVar.f13986k) {
                V(l10, this.G, canvas);
                paint = this.H;
            } else {
                V(l10, this.H, canvas);
                paint = this.G;
            }
            V(l10, paint, canvas);
        }
    }

    private void T(String str, j4.b bVar, Canvas canvas) {
        Paint paint;
        if (bVar.f13986k) {
            R(str, this.G, canvas);
            paint = this.H;
        } else {
            R(str, this.H, canvas);
            paint = this.G;
        }
        R(str, paint, canvas);
    }

    private void U(String str, j4.b bVar, Canvas canvas, float f10) {
        int i10 = 0;
        while (i10 < str.length()) {
            String Q = Q(str, i10);
            i10 += Q.length();
            T(Q, bVar, canvas);
            canvas.translate(this.G.measureText(Q) + f10, 0.0f);
        }
    }

    private void V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void W(String str, j4.b bVar, Matrix matrix, j4.c cVar, Canvas canvas, float f10, float f11) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            j4.d f12 = this.M.c().f(j4.d.c(str.charAt(i10), cVar.a(), cVar.c()));
            if (f12 != null) {
                S(f12, matrix, f11, bVar, canvas);
                float b10 = ((float) f12.b()) * f11 * q4.h.e() * f10;
                float f13 = bVar.f13980e / 10.0f;
                h4.a<Float, Float> aVar = this.U;
                if (aVar != null || (aVar = this.T) != null) {
                    f13 += aVar.h().floatValue();
                }
                canvas.translate(b10 + (f13 * f10), 0.0f);
            }
        }
    }

    private void X(j4.b bVar, Matrix matrix, j4.c cVar, Canvas canvas) {
        h4.a<Float, Float> aVar = this.V;
        float floatValue = (aVar != null ? aVar.h().floatValue() : bVar.f13978c) / 100.0f;
        float g10 = q4.h.g(matrix);
        String str = bVar.f13976a;
        float e10 = bVar.f13981f * q4.h.e();
        List<String> b02 = b0(str);
        int size = b02.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = b02.get(i10);
            float a02 = a0(str2, cVar, floatValue, g10);
            canvas.save();
            P(bVar.f13979d, canvas, a02);
            canvas.translate(0.0f, (i10 * e10) - (((size - 1) * e10) / 2.0f));
            W(str2, bVar, matrix, cVar, canvas, g10, floatValue);
            canvas.restore();
        }
    }

    private void Y(j4.b bVar, j4.c cVar, Canvas canvas) {
        Typeface c02 = c0(cVar);
        if (c02 == null) {
            return;
        }
        String str = bVar.f13976a;
        this.L.U();
        this.G.setTypeface(c02);
        h4.a<Float, Float> aVar = this.V;
        float floatValue = aVar != null ? aVar.h().floatValue() : bVar.f13978c;
        this.G.setTextSize(q4.h.e() * floatValue);
        this.H.setTypeface(this.G.getTypeface());
        this.H.setTextSize(this.G.getTextSize());
        float e10 = bVar.f13981f * q4.h.e();
        float f10 = bVar.f13980e / 10.0f;
        h4.a<Float, Float> aVar2 = this.U;
        if (aVar2 != null || (aVar2 = this.T) != null) {
            f10 += aVar2.h().floatValue();
        }
        float e11 = ((f10 * q4.h.e()) * floatValue) / 100.0f;
        List<String> b02 = b0(str);
        int size = b02.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = b02.get(i10);
            float measureText = this.H.measureText(str2) + ((str2.length() - 1) * e11);
            canvas.save();
            P(bVar.f13979d, canvas, measureText);
            canvas.translate(0.0f, (i10 * e10) - (((size - 1) * e10) / 2.0f));
            U(str2, bVar, canvas, e11);
            canvas.restore();
        }
    }

    private List<g4.d> Z(j4.d dVar) {
        if (this.I.containsKey(dVar)) {
            return this.I.get(dVar);
        }
        List<p> a10 = dVar.a();
        int size = a10.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new g4.d(this.L, this, a10.get(i10)));
        }
        this.I.put(dVar, arrayList);
        return arrayList;
    }

    private float a0(String str, j4.c cVar, float f10, float f11) {
        float f12 = 0.0f;
        for (int i10 = 0; i10 < str.length(); i10++) {
            j4.d f13 = this.M.c().f(j4.d.c(str.charAt(i10), cVar.a(), cVar.c()));
            if (f13 != null) {
                f12 = (float) (f12 + (f13.b() * f10 * q4.h.e() * f11));
            }
        }
        return f12;
    }

    private List<String> b0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface c0(j4.c cVar) {
        Typeface h10;
        h4.a<Typeface, Typeface> aVar = this.W;
        if (aVar == null || (h10 = aVar.h()) == null) {
            Typeface V = this.L.V(cVar.a(), cVar.c());
            return V != null ? V : cVar.d();
        }
        return h10;
    }

    private boolean d0(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    @Override // m4.b, g4.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.M.b().width(), this.M.b().height());
    }

    @Override // m4.b, j4.f
    public <T> void e(T t10, r4.c<T> cVar) {
        h4.a<?, ?> aVar;
        super.e(t10, cVar);
        if (t10 == u.f9434a) {
            h4.a<Integer, Integer> aVar2 = this.O;
            if (aVar2 != null) {
                H(aVar2);
            }
            if (cVar == null) {
                this.O = null;
                return;
            }
            q qVar = new q(cVar);
            this.O = qVar;
            qVar.a(this);
            aVar = this.O;
        } else if (t10 == u.f9435b) {
            h4.a<Integer, Integer> aVar3 = this.Q;
            if (aVar3 != null) {
                H(aVar3);
            }
            if (cVar == null) {
                this.Q = null;
                return;
            }
            q qVar2 = new q(cVar);
            this.Q = qVar2;
            qVar2.a(this);
            aVar = this.Q;
        } else if (t10 == u.f9452s) {
            h4.a<Float, Float> aVar4 = this.S;
            if (aVar4 != null) {
                H(aVar4);
            }
            if (cVar == null) {
                this.S = null;
                return;
            }
            q qVar3 = new q(cVar);
            this.S = qVar3;
            qVar3.a(this);
            aVar = this.S;
        } else if (t10 == u.f9453t) {
            h4.a<Float, Float> aVar5 = this.U;
            if (aVar5 != null) {
                H(aVar5);
            }
            if (cVar == null) {
                this.U = null;
                return;
            }
            q qVar4 = new q(cVar);
            this.U = qVar4;
            qVar4.a(this);
            aVar = this.U;
        } else if (t10 == u.F) {
            h4.a<Float, Float> aVar6 = this.V;
            if (aVar6 != null) {
                H(aVar6);
            }
            if (cVar == null) {
                this.V = null;
                return;
            }
            q qVar5 = new q(cVar);
            this.V = qVar5;
            qVar5.a(this);
            aVar = this.V;
        } else if (t10 != u.M) {
            if (t10 != u.O) {
                return;
            }
            this.K.q(cVar);
            return;
        } else {
            h4.a<Typeface, Typeface> aVar7 = this.W;
            if (aVar7 != null) {
                H(aVar7);
            }
            if (cVar == null) {
                this.W = null;
                return;
            }
            q qVar6 = new q(cVar);
            this.W = qVar6;
            qVar6.a(this);
            aVar = this.W;
        }
        i(aVar);
    }

    @Override // m4.b
    void u(Canvas canvas, Matrix matrix, int i10) {
        canvas.save();
        if (!this.L.U0()) {
            canvas.concat(matrix);
        }
        j4.b h10 = this.K.h();
        j4.c cVar = this.M.g().get(h10.f13977b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        h4.a<Integer, Integer> aVar = this.O;
        if (aVar == null && (aVar = this.N) == null) {
            this.G.setColor(h10.f13983h);
        } else {
            this.G.setColor(aVar.h().intValue());
        }
        h4.a<Integer, Integer> aVar2 = this.Q;
        if (aVar2 == null && (aVar2 = this.P) == null) {
            this.H.setColor(h10.f13984i);
        } else {
            this.H.setColor(aVar2.h().intValue());
        }
        int intValue = ((this.f16294x.h() == null ? 100 : this.f16294x.h().h().intValue()) * 255) / 100;
        this.G.setAlpha(intValue);
        this.H.setAlpha(intValue);
        h4.a<Float, Float> aVar3 = this.S;
        if (aVar3 == null && (aVar3 = this.R) == null) {
            this.H.setStrokeWidth(h10.f13985j * q4.h.e() * q4.h.g(matrix));
        } else {
            this.H.setStrokeWidth(aVar3.h().floatValue());
        }
        if (this.L.U0()) {
            X(h10, matrix, cVar, canvas);
        } else {
            Y(h10, cVar, canvas);
        }
        canvas.restore();
    }
}
