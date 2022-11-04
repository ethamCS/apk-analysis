package b.a.l.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.m0;
import b.a.l.a.b;
import b.a.l.a.e;
import b.d.h;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class a extends b.a.l.a.e implements androidx.core.graphics.drawable.b {
    private c p;
    private g q;
    private int r;
    private int s;
    private boolean t;

    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: a */
        private final Animatable f2003a;

        b(Animatable animatable) {
            super();
            this.f2003a = animatable;
        }

        @Override // b.a.l.a.a.g
        public void c() {
            this.f2003a.start();
        }

        @Override // b.a.l.a.a.g
        public void d() {
            this.f2003a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e.a {
        b.d.d<Long> K;
        h<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            h<Integer> hVar;
            if (cVar != null) {
                this.K = cVar.K;
                hVar = cVar.L;
            } else {
                this.K = new b.d.d<>();
                hVar = new h<>();
            }
            this.L = hVar;
        }

        private static long D(int i, int i2) {
            return i2 | (i << 32);
        }

        int B(int[] iArr, Drawable drawable, int i) {
            int z = super.z(iArr, drawable);
            this.L.m(z, Integer.valueOf(i));
            return z;
        }

        int C(int i, int i2, Drawable drawable, boolean z) {
            int a2 = super.a(drawable);
            long D = D(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = a2;
            this.K.b(D, Long.valueOf(j2 | j));
            if (z) {
                this.K.b(D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a2;
        }

        int E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.L.h(i, 0).intValue();
        }

        int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        int G(int i, int i2) {
            return (int) this.K.h(D(i, i2), -1L).longValue();
        }

        boolean H(int i, int i2) {
            return (this.K.h(D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        boolean I(int i, int i2) {
            return (this.K.h(D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // b.a.l.a.e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // b.a.l.a.e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        @Override // b.a.l.a.e.a, b.a.l.a.b.c
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends g {

        /* renamed from: a */
        private final b.q.a.a.b f2004a;

        d(b.q.a.a.b bVar) {
            super();
            this.f2004a = bVar;
        }

        @Override // b.a.l.a.a.g
        public void c() {
            this.f2004a.start();
        }

        @Override // b.a.l.a.a.g
        public void d() {
            this.f2004a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends g {

        /* renamed from: a */
        private final ObjectAnimator f2005a;

        /* renamed from: b */
        private final boolean f2006b;

        e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f2006b = z2;
            this.f2005a = ofInt;
        }

        @Override // b.a.l.a.a.g
        public boolean a() {
            return this.f2006b;
        }

        @Override // b.a.l.a.a.g
        public void b() {
            this.f2005a.reverse();
        }

        @Override // b.a.l.a.a.g
        public void c() {
            this.f2005a.start();
        }

        @Override // b.a.l.a.a.g
        public void d() {
            this.f2005a.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f2007a;

        /* renamed from: b */
        private int f2008b;

        /* renamed from: c */
        private int f2009c;

        f(AnimationDrawable animationDrawable, boolean z) {
            b(animationDrawable, z);
        }

        int a() {
            return this.f2009c;
        }

        int b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f2008b = numberOfFrames;
            int[] iArr = this.f2007a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f2007a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f2007a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f2009c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            int i = (int) ((f2 * this.f2009c) + 0.5f);
            int i2 = this.f2008b;
            int[] iArr = this.f2007a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f2009c : 0.0f);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    a(c cVar, Resources resources) {
        super(null);
        this.r = -1;
        this.s = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray s = b.g.d.c.g.s(resources, theme, attributeSet, b.a.m.b.f2043h);
        int resourceId = s.getResourceId(b.a.m.b.i, 0);
        int resourceId2 = s.getResourceId(b.a.m.b.j, -1);
        Drawable j = resourceId2 > 0 ? m0.h().j(context, resourceId2) : null;
        s.recycle();
        int[] k = k(attributeSet);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j = xmlPullParser.getName().equals("vector") ? b.q.a.a.h.c(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (j != null) {
            return this.p.B(k, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray s = b.g.d.c.g.s(resources, theme, attributeSet, b.a.m.b.k);
        int resourceId = s.getResourceId(b.a.m.b.n, -1);
        int resourceId2 = s.getResourceId(b.a.m.b.m, -1);
        int resourceId3 = s.getResourceId(b.a.m.b.l, -1);
        Drawable j = resourceId3 > 0 ? m0.h().j(context, resourceId3) : null;
        boolean z = s.getBoolean(b.a.m.b.o, false);
        s.recycle();
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j = xmlPullParser.getName().equals("animated-vector") ? b.q.a.a.b.a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.p.C(resourceId, resourceId2, j, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    private boolean s(int i) {
        int i2;
        int G;
        g gVar;
        g gVar2 = this.q;
        if (gVar2 == null) {
            i2 = c();
        } else if (i == this.r) {
            return true;
        } else {
            if (i == this.s && gVar2.a()) {
                gVar2.b();
                this.r = this.s;
                this.s = i;
                return true;
            }
            i2 = this.r;
            gVar2.d();
        }
        this.q = null;
        this.s = -1;
        this.r = -1;
        c cVar = this.p;
        int E = cVar.E(i2);
        int E2 = cVar.E(i);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (!(current instanceof b.q.a.a.b)) {
            if (current instanceof Animatable) {
                gVar = new b((Animatable) current);
            }
            return false;
        } else {
            gVar = new d((b.q.a.a.b) current);
        }
        gVar.c();
        this.q = gVar;
        this.s = i2;
        this.r = i;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.p;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f2022d |= typedArray.getChangingConfigurations();
        }
        cVar.x(typedArray.getBoolean(b.a.m.b.f2039d, cVar.i));
        cVar.t(typedArray.getBoolean(b.a.m.b.f2040e, cVar.l));
        cVar.u(typedArray.getInt(b.a.m.b.f2041f, cVar.A));
        cVar.v(typedArray.getInt(b.a.m.b.f2042g, cVar.B));
        setDither(typedArray.getBoolean(b.a.m.b.f2037b, cVar.x));
    }

    @Override // b.a.l.a.e, b.a.l.a.b
    public void h(b.c cVar) {
        super.h(cVar);
        if (cVar instanceof c) {
            this.p = (c) cVar;
        }
    }

    @Override // b.a.l.a.e, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // b.a.l.a.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.q;
        if (gVar != null) {
            gVar.d();
            this.q = null;
            g(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    /* renamed from: l */
    public c j() {
        return new c(this.p, this, null);
    }

    @Override // b.a.l.a.e, b.a.l.a.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.t) {
            super.mutate();
            if (this == this) {
                this.p.r();
                this.t = true;
            }
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray s = b.g.d.c.g.s(resources, theme, attributeSet, b.a.m.b.f2036a);
        setVisible(s.getBoolean(b.a.m.b.f2038c, true), true);
        t(s);
        i(resources);
        s.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    @Override // b.a.l.a.e, b.a.l.a.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int F = this.p.F(iArr);
        boolean z = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // b.a.l.a.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.q;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
