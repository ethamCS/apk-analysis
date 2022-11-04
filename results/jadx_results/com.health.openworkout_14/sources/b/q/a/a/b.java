package b.q.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class b extends g implements Animatable {

    /* renamed from: c */
    private C0067b f2808c;

    /* renamed from: d */
    private Context f2809d;

    /* renamed from: e */
    private ArgbEvaluator f2810e;

    /* renamed from: f */
    final Drawable.Callback f2811f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        a() {
            b.this = r1;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            b.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: b.q.a.a.b$b */
    /* loaded from: classes.dex */
    public static class C0067b extends Drawable.ConstantState {

        /* renamed from: a */
        int f2813a;

        /* renamed from: b */
        h f2814b;

        /* renamed from: c */
        AnimatorSet f2815c;

        /* renamed from: d */
        ArrayList<Animator> f2816d;

        /* renamed from: e */
        b.d.a<Animator, String> f2817e;

        public C0067b(Context context, C0067b c0067b, Drawable.Callback callback, Resources resources) {
            if (c0067b != null) {
                this.f2813a = c0067b.f2813a;
                h hVar = c0067b.f2814b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    this.f2814b = (h) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    h hVar2 = this.f2814b;
                    hVar2.mutate();
                    h hVar3 = hVar2;
                    this.f2814b = hVar3;
                    hVar3.setCallback(callback);
                    this.f2814b.setBounds(c0067b.f2814b.getBounds());
                    this.f2814b.h(false);
                }
                ArrayList<Animator> arrayList = c0067b.f2816d;
                if (arrayList == null) {
                    return;
                }
                int size = arrayList.size();
                this.f2816d = new ArrayList<>(size);
                this.f2817e = new b.d.a<>(size);
                for (int i = 0; i < size; i++) {
                    Animator animator = c0067b.f2816d.get(i);
                    Animator clone = animator.clone();
                    String str = c0067b.f2817e.get(animator);
                    clone.setTarget(this.f2814b.d(str));
                    this.f2816d.add(clone);
                    this.f2817e.put(clone, str);
                }
                a();
            }
        }

        public void a() {
            if (this.f2815c == null) {
                this.f2815c = new AnimatorSet();
            }
            this.f2815c.playTogether(this.f2816d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2813a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* loaded from: classes.dex */
    private static class c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f2818a;

        public c(Drawable.ConstantState constantState) {
            this.f2818a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f2818a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2818a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            b bVar = new b();
            Drawable newDrawable = this.f2818a.newDrawable();
            bVar.f2823b = newDrawable;
            newDrawable.setCallback(bVar.f2811f);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable newDrawable = this.f2818a.newDrawable(resources);
            bVar.f2823b = newDrawable;
            newDrawable.setCallback(bVar.f2811f);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable newDrawable = this.f2818a.newDrawable(resources, theme);
            bVar.f2823b = newDrawable;
            newDrawable.setCallback(bVar.f2811f);
            return bVar;
        }
    }

    b() {
        this(null, null, null);
    }

    private b(Context context) {
        this(context, null, null);
    }

    private b(Context context, C0067b c0067b, Resources resources) {
        this.f2810e = null;
        a aVar = new a();
        this.f2811f = aVar;
        this.f2809d = context;
        if (c0067b != null) {
            this.f2808c = c0067b;
        } else {
            this.f2808c = new C0067b(context, c0067b, aVar, resources);
        }
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f2808c.f2814b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        C0067b c0067b = this.f2808c;
        if (c0067b.f2816d == null) {
            c0067b.f2816d = new ArrayList<>();
            this.f2808c.f2817e = new b.d.a<>();
        }
        this.f2808c.f2816d.add(animator);
        this.f2808c.f2817e.put(animator, str);
    }

    private void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if (!"fillColor".equals(propertyName) && !"strokeColor".equals(propertyName)) {
                return;
            }
            if (this.f2810e == null) {
                this.f2810e = new ArgbEvaluator();
            }
            objectAnimator.setEvaluator(this.f2810e);
        }
    }

    @Override // b.q.a.a.g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f2808c.f2814b.draw(canvas);
        if (!this.f2808c.f2815c.isStarted()) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f2823b;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f2808c.f2814b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f2823b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2808c.f2813a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2823b;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f2808c.f2814b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2823b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f2823b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f2823b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2808c.f2814b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f2823b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2808c.f2814b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2823b;
        return drawable != null ? drawable.getOpacity() : this.f2808c.f2814b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = b.g.d.c.g.s(resources, theme, attributeSet, b.q.a.a.a.f2804e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h b2 = h.b(resources, resourceId, theme);
                        b2.h(false);
                        b2.setCallback(this.f2811f);
                        h hVar = this.f2808c.f2814b;
                        if (hVar != null) {
                            hVar.setCallback(null);
                        }
                        this.f2808c.f2814b = b2;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, b.q.a.a.a.f2805f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2809d;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        b(string, d.i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f2808c.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f2823b;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f2808c.f2814b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f2823b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2808c.f2815c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f2823b;
        return drawable != null ? drawable.isStateful() : this.f2808c.f2814b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2808c.f2814b.setBounds(rect);
        }
    }

    @Override // b.q.a.a.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f2823b;
        return drawable != null ? drawable.setLevel(i) : this.f2808c.f2814b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2823b;
        return drawable != null ? drawable.setState(iArr) : this.f2808c.f2814b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f2808c.f2814b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.f2808c.f2814b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2808c.f2814b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i);
        } else {
            this.f2808c.f2814b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f2808c.f2814b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f2808c.f2814b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f2808c.f2814b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f2808c.f2815c.isStarted()) {
        } else {
            this.f2808c.f2815c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2808c.f2815c.end();
        }
    }
}
