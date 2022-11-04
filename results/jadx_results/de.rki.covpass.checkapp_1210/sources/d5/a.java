package d5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.y;
import b5.d;
import b5.f;
import b5.j;
import com.google.android.material.internal.k;
import com.google.android.material.internal.m;
import d5.b;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import org.conscrypt.BuildConfig;
import t5.g;
/* loaded from: classes.dex */
public class a extends Drawable implements k.b {

    /* renamed from: c4 */
    private static final int f8337c4 = b5.k.f5494m;

    /* renamed from: d4 */
    private static final int f8338d4 = b5.b.c_res_0x7f03004d;
    private float U3;
    private float V3;
    private int W3;
    private float X3;
    private float Y3;
    private float Z3;

    /* renamed from: a4 */
    private WeakReference<View> f8339a4;

    /* renamed from: b4 */
    private WeakReference<FrameLayout> f8340b4;

    /* renamed from: c */
    private final WeakReference<Context> f8341c;

    /* renamed from: q */
    private final k f8343q;

    /* renamed from: y */
    private final b f8345y;

    /* renamed from: x */
    private final Rect f8344x = new Rect();

    /* renamed from: d */
    private final g f8342d = new g();

    /* renamed from: d5.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0120a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f8346c;

        /* renamed from: d */
        final /* synthetic */ FrameLayout f8347d;

        RunnableC0120a(View view, FrameLayout frameLayout) {
            a.this = r1;
            this.f8346c = view;
            this.f8347d = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.y(this.f8346c, this.f8347d);
        }
    }

    private a(Context context, int i10, int i11, int i12, b.a aVar) {
        this.f8341c = new WeakReference<>(context);
        m.c(context);
        k kVar = new k(this);
        this.f8343q = kVar;
        kVar.e().setTextAlign(Paint.Align.CENTER);
        v(b5.k.e_res_0x7f110214);
        this.f8345y = new b(context, i10, i11, i12, aVar);
        t();
    }

    private void A() {
        this.W3 = ((int) Math.pow(10.0d, h() - 1.0d)) - 1;
    }

    private void b(Context context, Rect rect, View view) {
        float f10;
        int k10 = k();
        int f11 = this.f8345y.f();
        this.V3 = (f11 == 8388691 || f11 == 8388693) ? rect.bottom - k10 : rect.top + k10;
        if (i() <= 9) {
            f10 = !l() ? this.f8345y.f8351c : this.f8345y.f8352d;
            this.X3 = f10;
            this.Z3 = f10;
        } else {
            float f12 = this.f8345y.f8352d;
            this.X3 = f12;
            this.Z3 = f12;
            f10 = (this.f8343q.f(e()) / 2.0f) + this.f8345y.f8353e;
        }
        this.Y3 = f10;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(l() ? d.H : d.E);
        int j10 = j();
        int f13 = this.f8345y.f();
        this.U3 = (f13 == 8388659 || f13 == 8388691 ? y.B(view) != 0 : y.B(view) == 0) ? ((rect.right + this.Y3) - dimensionPixelSize) - j10 : (rect.left - this.Y3) + dimensionPixelSize + j10;
    }

    public static a c(Context context) {
        return new a(context, 0, f8338d4, f8337c4, null);
    }

    private void d(Canvas canvas) {
        Rect rect = new Rect();
        String e10 = e();
        this.f8343q.e().getTextBounds(e10, 0, e10.length(), rect);
        canvas.drawText(e10, this.U3, this.V3 + (rect.height() / 2), this.f8343q.e());
    }

    private String e() {
        if (i() <= this.W3) {
            return NumberFormat.getInstance(this.f8345y.o()).format(i());
        }
        Context context = this.f8341c.get();
        return context == null ? BuildConfig.FLAVOR : String.format(this.f8345y.o(), context.getString(j.l_res_0x7f100157), Integer.valueOf(this.W3), "+");
    }

    private int j() {
        return (l() ? this.f8345y.k() : this.f8345y.l()) + this.f8345y.b();
    }

    private int k() {
        return (l() ? this.f8345y.p() : this.f8345y.q()) + this.f8345y.c();
    }

    private void m() {
        this.f8343q.e().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void n() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f8345y.e());
        if (this.f8342d.x() != valueOf) {
            this.f8342d.Z(valueOf);
            invalidateSelf();
        }
    }

    private void o() {
        WeakReference<View> weakReference = this.f8339a4;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.f8339a4.get();
        WeakReference<FrameLayout> weakReference2 = this.f8340b4;
        y(view, weakReference2 != null ? weakReference2.get() : null);
    }

    private void p() {
        this.f8343q.e().setColor(this.f8345y.g());
        invalidateSelf();
    }

    private void q() {
        A();
        this.f8343q.i(true);
        z();
        invalidateSelf();
    }

    private void r() {
        this.f8343q.i(true);
        z();
        invalidateSelf();
    }

    private void s() {
        boolean s10 = this.f8345y.s();
        setVisible(s10, false);
        if (!c.f8366a || g() == null || s10) {
            return;
        }
        ((ViewGroup) g().getParent()).invalidate();
    }

    private void t() {
        q();
        r();
        m();
        n();
        p();
        o();
        z();
        s();
    }

    private void u(q5.d dVar) {
        Context context;
        if (this.f8343q.d() == dVar || (context = this.f8341c.get()) == null) {
            return;
        }
        this.f8343q.h(dVar, context);
        z();
    }

    private void v(int i10) {
        Context context = this.f8341c.get();
        if (context == null) {
            return;
        }
        u(new q5.d(context, i10));
    }

    private void w(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != f.u_res_0x7f090180) {
            WeakReference<FrameLayout> weakReference = this.f8340b4;
            if (weakReference != null && weakReference.get() == viewGroup) {
                return;
            }
            x(view);
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.setId(f.u_res_0x7f090180);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(view.getLayoutParams());
            frameLayout.setMinimumWidth(view.getWidth());
            frameLayout.setMinimumHeight(view.getHeight());
            int indexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeViewAt(indexOfChild);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(view);
            viewGroup.addView(frameLayout, indexOfChild);
            this.f8340b4 = new WeakReference<>(frameLayout);
            frameLayout.post(new RunnableC0120a(view, frameLayout));
        }
    }

    private static void x(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void z() {
        Context context = this.f8341c.get();
        WeakReference<View> weakReference = this.f8339a4;
        FrameLayout frameLayout = null;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f8344x);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f8340b4;
        if (weakReference2 != null) {
            frameLayout = weakReference2.get();
        }
        if (frameLayout != null || c.f8366a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        b(context, rect2, view);
        c.d(this.f8344x, this.U3, this.V3, this.Y3, this.Z3);
        this.f8342d.W(this.X3);
        if (rect.equals(this.f8344x)) {
            return;
        }
        this.f8342d.setBounds(this.f8344x);
    }

    @Override // com.google.android.material.internal.k.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f8342d.draw(canvas);
        if (!l()) {
            return;
        }
        d(canvas);
    }

    public CharSequence f() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!l()) {
            return this.f8345y.i();
        }
        if (this.f8345y.j() == 0 || (context = this.f8341c.get()) == null) {
            return null;
        }
        return i() <= this.W3 ? context.getResources().getQuantityString(this.f8345y.j(), i(), Integer.valueOf(i())) : context.getString(this.f8345y.h(), Integer.valueOf(this.W3));
    }

    public FrameLayout g() {
        WeakReference<FrameLayout> weakReference = this.f8340b4;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f8345y.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f8344x.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f8344x.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int h() {
        return this.f8345y.m();
    }

    public int i() {
        if (l()) {
            return this.f8345y.n();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public boolean l() {
        return this.f8345y.r();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.k.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f8345y.u(i10);
        m();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void y(View view, FrameLayout frameLayout) {
        this.f8339a4 = new WeakReference<>(view);
        boolean z10 = c.f8366a;
        if (!z10 || frameLayout != null) {
            this.f8340b4 = new WeakReference<>(frameLayout);
        } else {
            w(view);
        }
        if (!z10) {
            x(view);
        }
        z();
        invalidateSelf();
    }
}
