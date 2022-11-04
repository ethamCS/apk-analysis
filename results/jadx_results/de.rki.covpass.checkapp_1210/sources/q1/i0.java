package q1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import q1.n;
/* loaded from: classes.dex */
public abstract class i0 extends n {
    private static final String[] A4 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: z4 */
    private int f19392z4 = 3;

    /* loaded from: classes.dex */
    public class a extends o {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f19393a;

        /* renamed from: b */
        final /* synthetic */ View f19394b;

        /* renamed from: c */
        final /* synthetic */ View f19395c;

        a(ViewGroup viewGroup, View view, View view2) {
            i0.this = r1;
            this.f19393a = viewGroup;
            this.f19394b = view;
            this.f19395c = view2;
        }

        @Override // q1.n.f
        public void a(n nVar) {
            this.f19395c.setTag(i.a_res_0x7f090204, null);
            y.a(this.f19393a).c(this.f19394b);
            nVar.W(this);
        }

        @Override // q1.o, q1.n.f
        public void d(n nVar) {
            if (this.f19394b.getParent() == null) {
                y.a(this.f19393a).a(this.f19394b);
            } else {
                i0.this.cancel();
            }
        }

        @Override // q1.o, q1.n.f
        public void e(n nVar) {
            y.a(this.f19393a).c(this.f19394b);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements n.f {

        /* renamed from: a */
        private final View f19397a;

        /* renamed from: b */
        private final int f19398b;

        /* renamed from: c */
        private final ViewGroup f19399c;

        /* renamed from: d */
        private final boolean f19400d;

        /* renamed from: e */
        private boolean f19401e;

        /* renamed from: f */
        boolean f19402f = false;

        b(View view, int i10, boolean z10) {
            this.f19397a = view;
            this.f19398b = i10;
            this.f19399c = (ViewGroup) view.getParent();
            this.f19400d = z10;
            g(true);
        }

        private void f() {
            if (!this.f19402f) {
                b0.h(this.f19397a, this.f19398b);
                ViewGroup viewGroup = this.f19399c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f19400d || this.f19401e == z10 || (viewGroup = this.f19399c) == null) {
                return;
            }
            this.f19401e = z10;
            y.c(viewGroup, z10);
        }

        @Override // q1.n.f
        public void a(n nVar) {
            f();
            nVar.W(this);
        }

        @Override // q1.n.f
        public void b(n nVar) {
        }

        @Override // q1.n.f
        public void c(n nVar) {
        }

        @Override // q1.n.f
        public void d(n nVar) {
            g(true);
        }

        @Override // q1.n.f
        public void e(n nVar) {
            g(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f19402f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (!this.f19402f) {
                b0.h(this.f19397a, this.f19398b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (!this.f19402f) {
                b0.h(this.f19397a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        boolean f19403a;

        /* renamed from: b */
        boolean f19404b;

        /* renamed from: c */
        int f19405c;

        /* renamed from: d */
        int f19406d;

        /* renamed from: e */
        ViewGroup f19407e;

        /* renamed from: f */
        ViewGroup f19408f;

        c() {
        }
    }

    private void j0(t tVar) {
        tVar.f19468a.put("android:visibility:visibility", Integer.valueOf(tVar.f19469b.getVisibility()));
        tVar.f19468a.put("android:visibility:parent", tVar.f19469b.getParent());
        int[] iArr = new int[2];
        tVar.f19469b.getLocationOnScreen(iArr);
        tVar.f19468a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
        if (r9 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (r0.f19407e == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
        if (r0.f19405c == 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private q1.i0.c k0(q1.t r8, q1.t r9) {
        /*
            r7 = this;
            q1.i0$c r0 = new q1.i0$c
            r0.<init>()
            r1 = 0
            r0.f19403a = r1
            r0.f19404b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f19468a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f19468a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f19405c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f19468a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f19407e = r6
            goto L37
        L33:
            r0.f19405c = r4
            r0.f19407e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f19468a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f19468a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f19406d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f19468a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f19408f = r2
            goto L5e
        L5a:
            r0.f19406d = r4
            r0.f19408f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f19405c
            int r9 = r0.f19406d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f19407e
            android.view.ViewGroup r4 = r0.f19408f
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
            android.view.ViewGroup r8 = r0.f19408f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f19407e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f19406d
            if (r8 != 0) goto L8d
        L88:
            r0.f19404b = r2
        L8a:
            r0.f19403a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f19405c
            if (r8 != 0) goto L96
        L93:
            r0.f19404b = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.i0.k0(q1.t, q1.t):q1.i0$c");
    }

    @Override // q1.n
    public String[] K() {
        return A4;
    }

    @Override // q1.n
    public boolean M(t tVar, t tVar2) {
        if (tVar == null && tVar2 == null) {
            return false;
        }
        if (tVar != null && tVar2 != null && tVar2.f19468a.containsKey("android:visibility:visibility") != tVar.f19468a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c k02 = k0(tVar, tVar2);
        if (!k02.f19403a) {
            return false;
        }
        return k02.f19405c == 0 || k02.f19406d == 0;
    }

    @Override // q1.n
    public void g(t tVar) {
        j0(tVar);
    }

    @Override // q1.n
    public void j(t tVar) {
        j0(tVar);
    }

    public abstract Animator l0(ViewGroup viewGroup, View view, t tVar, t tVar2);

    public Animator m0(ViewGroup viewGroup, t tVar, int i10, t tVar2, int i11) {
        if ((this.f19392z4 & 1) != 1 || tVar2 == null) {
            return null;
        }
        if (tVar == null) {
            View view = (View) tVar2.f19469b.getParent();
            if (k0(y(view, false), L(view, false)).f19403a) {
                return null;
            }
        }
        return l0(viewGroup, tVar2.f19469b, tVar, tVar2);
    }

    public abstract Animator n0(ViewGroup viewGroup, View view, t tVar, t tVar2);

    @Override // q1.n
    public Animator o(ViewGroup viewGroup, t tVar, t tVar2) {
        c k02 = k0(tVar, tVar2);
        if (k02.f19403a) {
            if (k02.f19407e == null && k02.f19408f == null) {
                return null;
            }
            return k02.f19404b ? m0(viewGroup, tVar, k02.f19405c, tVar2, k02.f19406d) : o0(viewGroup, tVar, k02.f19405c, tVar2, k02.f19406d);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
        if (r17.f19432l4 != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator o0(android.view.ViewGroup r18, q1.t r19, int r20, q1.t r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.i0.o0(android.view.ViewGroup, q1.t, int, q1.t, int):android.animation.Animator");
    }

    public void p0(int i10) {
        if ((i10 & (-4)) == 0) {
            this.f19392z4 = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
