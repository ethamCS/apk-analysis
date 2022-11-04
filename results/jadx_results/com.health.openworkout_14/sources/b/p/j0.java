package b.p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import b.p.a;
import b.p.m;
/* loaded from: classes.dex */
public abstract class j0 extends m {
    private static final String[] L = {"android:visibility:visibility", "android:visibility:parent"};
    private int K = 3;

    /* loaded from: classes.dex */
    public class a extends n {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2732a;

        /* renamed from: b */
        final /* synthetic */ View f2733b;

        /* renamed from: c */
        final /* synthetic */ View f2734c;

        a(ViewGroup viewGroup, View view, View view2) {
            j0.this = r1;
            this.f2732a = viewGroup;
            this.f2733b = view;
            this.f2734c = view2;
        }

        @Override // b.p.n, b.p.m.f
        public void a(m mVar) {
            x.a(this.f2732a).c(this.f2733b);
        }

        @Override // b.p.n, b.p.m.f
        public void b(m mVar) {
            if (this.f2733b.getParent() == null) {
                x.a(this.f2732a).a(this.f2733b);
            } else {
                j0.this.cancel();
            }
        }

        @Override // b.p.m.f
        public void e(m mVar) {
            this.f2734c.setTag(j.b_res_0x7f090176, null);
            x.a(this.f2732a).c(this.f2733b);
            mVar.T(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements m.f, a.AbstractC0063a {

        /* renamed from: a */
        private final View f2736a;

        /* renamed from: b */
        private final int f2737b;

        /* renamed from: c */
        private final ViewGroup f2738c;

        /* renamed from: d */
        private final boolean f2739d;

        /* renamed from: e */
        private boolean f2740e;

        /* renamed from: f */
        boolean f2741f = false;

        b(View view, int i, boolean z) {
            this.f2736a = view;
            this.f2737b = i;
            this.f2738c = (ViewGroup) view.getParent();
            this.f2739d = z;
            g(true);
        }

        private void f() {
            if (!this.f2741f) {
                c0.h(this.f2736a, this.f2737b);
                ViewGroup viewGroup = this.f2738c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f2739d || this.f2740e == z || (viewGroup = this.f2738c) == null) {
                return;
            }
            this.f2740e = z;
            x.c(viewGroup, z);
        }

        @Override // b.p.m.f
        public void a(m mVar) {
            g(false);
        }

        @Override // b.p.m.f
        public void b(m mVar) {
            g(true);
        }

        @Override // b.p.m.f
        public void c(m mVar) {
        }

        @Override // b.p.m.f
        public void d(m mVar) {
        }

        @Override // b.p.m.f
        public void e(m mVar) {
            f();
            mVar.T(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2741f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, b.p.a.AbstractC0063a
        public void onAnimationPause(Animator animator) {
            if (!this.f2741f) {
                c0.h(this.f2736a, this.f2737b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, b.p.a.AbstractC0063a
        public void onAnimationResume(Animator animator) {
            if (!this.f2741f) {
                c0.h(this.f2736a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        boolean f2742a;

        /* renamed from: b */
        boolean f2743b;

        /* renamed from: c */
        int f2744c;

        /* renamed from: d */
        int f2745d;

        /* renamed from: e */
        ViewGroup f2746e;

        /* renamed from: f */
        ViewGroup f2747f;

        c() {
        }
    }

    private void g0(s sVar) {
        sVar.f2780a.put("android:visibility:visibility", Integer.valueOf(sVar.f2781b.getVisibility()));
        sVar.f2780a.put("android:visibility:parent", sVar.f2781b.getParent());
        int[] iArr = new int[2];
        sVar.f2781b.getLocationOnScreen(iArr);
        sVar.f2780a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
        if (r9 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (r0.f2746e == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
        if (r0.f2744c == 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private b.p.j0.c h0(b.p.s r8, b.p.s r9) {
        /*
            r7 = this;
            b.p.j0$c r0 = new b.p.j0$c
            r0.<init>()
            r1 = 0
            r0.f2742a = r1
            r0.f2743b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2780a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2780a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f2744c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2780a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f2746e = r6
            goto L37
        L33:
            r0.f2744c = r4
            r0.f2746e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f2780a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f2780a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f2745d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f2780a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f2747f = r2
            goto L5e
        L5a:
            r0.f2745d = r4
            r0.f2747f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f2744c
            int r9 = r0.f2745d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f2746e
            android.view.ViewGroup r4 = r0.f2747f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f2747f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f2746e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f2745d
            if (r8 != 0) goto L8d
        L88:
            r0.f2743b = r2
        L8a:
            r0.f2742a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f2744c
            if (r8 != 0) goto L96
        L93:
            r0.f2743b = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.j0.h0(b.p.s, b.p.s):b.p.j0$c");
    }

    @Override // b.p.m
    public String[] F() {
        return L;
    }

    @Override // b.p.m
    public boolean H(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f2780a.containsKey("android:visibility:visibility") != sVar.f2780a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c h0 = h0(sVar, sVar2);
        if (!h0.f2742a) {
            return false;
        }
        return h0.f2744c == 0 || h0.f2745d == 0;
    }

    @Override // b.p.m
    public void h(s sVar) {
        g0(sVar);
    }

    public abstract Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator j0(ViewGroup viewGroup, s sVar, int i, s sVar2, int i2) {
        if ((this.K & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f2781b.getParent();
            if (h0(v(view, false), G(view, false)).f2742a) {
                return null;
            }
        }
        return i0(viewGroup, sVar2.f2781b, sVar, sVar2);
    }

    public abstract Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    @Override // b.p.m
    public void l(s sVar) {
        g0(sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
        if (r17.w != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator l0(android.view.ViewGroup r18, b.p.s r19, int r20, b.p.s r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.j0.l0(android.view.ViewGroup, b.p.s, int, b.p.s, int):android.animation.Animator");
    }

    public void m0(int i) {
        if ((i & (-4)) == 0) {
            this.K = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // b.p.m
    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        c h0 = h0(sVar, sVar2);
        if (h0.f2742a) {
            if (h0.f2746e == null && h0.f2747f == null) {
                return null;
            }
            return h0.f2743b ? j0(viewGroup, sVar, h0.f2744c, sVar2, h0.f2745d) : l0(viewGroup, sVar, h0.f2744c, sVar2, h0.f2745d);
        }
        return null;
    }
}
