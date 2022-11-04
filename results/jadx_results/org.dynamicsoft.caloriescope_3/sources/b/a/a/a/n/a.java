package b.a.a.a.n;

import a.g.l.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import b.a.a.a.b0.g;
import b.a.a.a.i;
import b.a.a.a.j;
import b.a.a.a.y.d;
import com.google.android.material.internal.k;
import com.google.android.material.internal.m;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class a extends Drawable implements k.b {

    /* renamed from: b */
    private final WeakReference<Context> f1227b;
    private final k d;
    private final float f;
    private final float g;
    private final float h;
    private final C0049a i;
    private float j;
    private float k;
    private int l;
    private float m;
    private float n;
    private float o;
    private WeakReference<View> p;
    private WeakReference<ViewGroup> q;
    private final Rect e = new Rect();

    /* renamed from: c */
    private final g f1228c = new g();

    /* renamed from: b.a.a.a.n.a$a */
    /* loaded from: classes.dex */
    public static final class C0049a implements Parcelable {
        public static final Parcelable.Creator<C0049a> CREATOR = new C0050a();

        /* renamed from: b */
        private int f1229b;

        /* renamed from: c */
        private int f1230c;
        private int d;
        private int e;
        private int f;
        private CharSequence g;
        private int h;
        private int i;

        /* renamed from: b.a.a.a.n.a$a$a */
        /* loaded from: classes.dex */
        static class C0050a implements Parcelable.Creator<C0049a> {
            C0050a() {
            }

            @Override // android.os.Parcelable.Creator
            public C0049a createFromParcel(Parcel parcel) {
                return new C0049a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0049a[] newArray(int i) {
                return new C0049a[i];
            }
        }

        public C0049a(Context context) {
            this.d = 255;
            this.e = -1;
            this.f1230c = new d(context, b.a.a.a.k.TextAppearance_MaterialComponents_Badge).f1249b.getDefaultColor();
            this.g = context.getString(j.mtrl_badge_numberless_content_description);
            this.h = i.mtrl_badge_content_description;
        }

        protected C0049a(Parcel parcel) {
            this.d = 255;
            this.e = -1;
            this.f1229b = parcel.readInt();
            this.f1230c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readString();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1229b);
            parcel.writeInt(this.f1230c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeString(this.g.toString());
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
        }
    }

    private a(Context context) {
        this.f1227b = new WeakReference<>(context);
        m.b(context);
        Resources resources = context.getResources();
        this.f = resources.getDimensionPixelSize(b.a.a.a.d.mtrl_badge_radius);
        this.h = resources.getDimensionPixelSize(b.a.a.a.d.mtrl_badge_long_text_horizontal_padding);
        this.g = resources.getDimensionPixelSize(b.a.a.a.d.mtrl_badge_with_text_radius);
        k kVar = new k(this);
        this.d = kVar;
        kVar.b().setTextAlign(Paint.Align.CENTER);
        this.i = new C0049a(context);
        f(b.a.a.a.k.TextAppearance_MaterialComponents_Badge);
    }

    public static a a(Context context, C0049a c0049a) {
        a aVar = new a(context);
        aVar.a(c0049a);
        return aVar;
    }

    private void a(Context context, Rect rect, View view) {
        float f;
        int i = this.i.i;
        this.k = (i == 8388691 || i == 8388693) ? rect.bottom : rect.top;
        if (d() <= 9) {
            f = !f() ? this.f : this.g;
            this.m = f;
            this.o = f;
        } else {
            float f2 = this.g;
            this.m = f2;
            this.o = f2;
            f = (this.d.a(g()) / 2.0f) + this.h;
        }
        this.n = f;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(f() ? b.a.a.a.d.mtrl_badge_text_horizontal_edge_offset : b.a.a.a.d.mtrl_badge_horizontal_edge_offset);
        int i2 = this.i.i;
        this.j = (i2 == 8388659 || i2 == 8388691 ? u.o(view) != 0 : u.o(view) == 0) ? (rect.right + this.n) - dimensionPixelSize : (rect.left - this.n) + dimensionPixelSize;
    }

    private void a(Canvas canvas) {
        Rect rect = new Rect();
        String g = g();
        this.d.b().getTextBounds(g, 0, g.length(), rect);
        canvas.drawText(g, this.j, this.k + (rect.height() / 2), this.d.b());
    }

    private void a(C0049a c0049a) {
        d(c0049a.f);
        if (c0049a.e != -1) {
            e(c0049a.e);
        }
        a(c0049a.f1229b);
        c(c0049a.f1230c);
        b(c0049a.i);
    }

    private void a(d dVar) {
        Context context;
        if (this.d.a() == dVar || (context = this.f1227b.get()) == null) {
            return;
        }
        this.d.a(dVar, context);
        h();
    }

    private void f(int i) {
        Context context = this.f1227b.get();
        if (context == null) {
            return;
        }
        a(new d(context, i));
    }

    private String g() {
        if (d() <= this.l) {
            return Integer.toString(d());
        }
        Context context = this.f1227b.get();
        return context == null ? "" : context.getString(j.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.l), "+");
    }

    private void h() {
        Context context = this.f1227b.get();
        WeakReference<View> weakReference = this.p;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.e);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<ViewGroup> weakReference2 = this.q;
        if (weakReference2 != null) {
            viewGroup = weakReference2.get();
        }
        if (viewGroup != null || b.f1231a) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        a(context, rect2, view);
        b.a(this.e, this.j, this.k, this.n, this.o);
        this.f1228c.a(this.m);
        if (rect.equals(this.e)) {
            return;
        }
        this.f1228c.setBounds(this.e);
    }

    private void i() {
        double d;
        Double.isNaN(c());
        this.l = ((int) Math.pow(10.0d, d - 1.0d)) - 1;
    }

    @Override // com.google.android.material.internal.k.b
    public void a() {
        invalidateSelf();
    }

    public void a(int i) {
        this.i.f1229b = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.f1228c.f() != valueOf) {
            this.f1228c.a(valueOf);
            invalidateSelf();
        }
    }

    public void a(View view, ViewGroup viewGroup) {
        this.p = new WeakReference<>(view);
        this.q = new WeakReference<>(viewGroup);
        h();
        invalidateSelf();
    }

    public CharSequence b() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!f()) {
            return this.i.g;
        }
        if (this.i.h > 0 && (context = this.f1227b.get()) != null) {
            return context.getResources().getQuantityString(this.i.h, d(), Integer.valueOf(d()));
        }
        return null;
    }

    public void b(int i) {
        if (this.i.i != i) {
            this.i.i = i;
            WeakReference<View> weakReference = this.p;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.p.get();
            WeakReference<ViewGroup> weakReference2 = this.q;
            a(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    public int c() {
        return this.i.f;
    }

    public void c(int i) {
        this.i.f1230c = i;
        if (this.d.b().getColor() != i) {
            this.d.b().setColor(i);
            invalidateSelf();
        }
    }

    public int d() {
        if (!f()) {
            return 0;
        }
        return this.i.e;
    }

    public void d(int i) {
        if (this.i.f != i) {
            this.i.f = i;
            i();
            this.d.a(true);
            h();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f1228c.draw(canvas);
        if (!f()) {
            return;
        }
        a(canvas);
    }

    public C0049a e() {
        return this.i;
    }

    public void e(int i) {
        int max = Math.max(0, i);
        if (this.i.e != max) {
            this.i.e = max;
            this.d.a(true);
            h();
            invalidateSelf();
        }
    }

    public boolean f() {
        return this.i.e != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.i.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.k.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.i.d = i;
        this.d.b().setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
