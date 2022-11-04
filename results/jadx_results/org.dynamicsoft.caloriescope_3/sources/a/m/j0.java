package a.m;

import a.m.a;
import a.m.m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class j0 extends m {
    private static final String[] L = {"android:visibility:visibility", "android:visibility:parent"};
    private int K = 3;

    /* loaded from: classes.dex */
    public class a extends n {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f356a;

        /* renamed from: b */
        final /* synthetic */ View f357b;

        /* renamed from: c */
        final /* synthetic */ View f358c;

        a(ViewGroup viewGroup, View view, View view2) {
            j0.this = r1;
            this.f356a = viewGroup;
            this.f357b = view;
            this.f358c = view2;
        }

        @Override // a.m.m.f
        public void c(m mVar) {
            this.f358c.setTag(j.save_overlay_view, null);
            x.a(this.f356a).a(this.f357b);
            mVar.b(this);
        }

        @Override // a.m.n, a.m.m.f
        public void d(m mVar) {
            x.a(this.f356a).a(this.f357b);
        }

        @Override // a.m.n, a.m.m.f
        public void e(m mVar) {
            if (this.f357b.getParent() == null) {
                x.a(this.f356a).b(this.f357b);
            } else {
                j0.this.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements m.f, a.AbstractC0024a {

        /* renamed from: a */
        private final View f359a;

        /* renamed from: b */
        private final int f360b;

        /* renamed from: c */
        private final ViewGroup f361c;
        private final boolean d;
        private boolean e;
        boolean f = false;

        b(View view, int i, boolean z) {
            this.f359a = view;
            this.f360b = i;
            this.f361c = (ViewGroup) view.getParent();
            this.d = z;
            a(true);
        }

        private void a() {
            if (!this.f) {
                c0.a(this.f359a, this.f360b);
                ViewGroup viewGroup = this.f361c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        private void a(boolean z) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.f361c) == null) {
                return;
            }
            this.e = z;
            x.b(viewGroup, z);
        }

        @Override // a.m.m.f
        public void a(m mVar) {
        }

        @Override // a.m.m.f
        public void b(m mVar) {
        }

        @Override // a.m.m.f
        public void c(m mVar) {
            a();
            mVar.b(this);
        }

        @Override // a.m.m.f
        public void d(m mVar) {
            a(false);
        }

        @Override // a.m.m.f
        public void e(m mVar) {
            a(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, a.m.a.AbstractC0024a
        public void onAnimationPause(Animator animator) {
            if (!this.f) {
                c0.a(this.f359a, this.f360b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, a.m.a.AbstractC0024a
        public void onAnimationResume(Animator animator) {
            if (!this.f) {
                c0.a(this.f359a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        boolean f362a;

        /* renamed from: b */
        boolean f363b;

        /* renamed from: c */
        int f364c;
        int d;
        ViewGroup e;
        ViewGroup f;

        c() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r9 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (r0.e == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
        if (r0.f364c == 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private a.m.j0.c b(a.m.s r8, a.m.s r9) {
        /*
            r7 = this;
            a.m.j0$c r0 = new a.m.j0$c
            r0.<init>()
            r1 = 0
            r0.f362a = r1
            r0.f363b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f390a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f390a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f364c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f390a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L37
        L33:
            r0.f364c = r4
            r0.e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f390a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f390a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f390a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L5e
        L5a:
            r0.d = r4
            r0.f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L86
            if (r9 == 0) goto L86
            int r8 = r0.f364c
            int r9 = r0.d
            if (r8 != r9) goto L70
            android.view.ViewGroup r8 = r0.e
            android.view.ViewGroup r9 = r0.f
            if (r8 != r9) goto L70
            return r0
        L70:
            int r8 = r0.f364c
            int r9 = r0.d
            if (r8 == r9) goto L7c
            if (r8 != 0) goto L79
            goto L97
        L79:
            if (r9 != 0) goto L9a
            goto L8c
        L7c:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            goto L97
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9a
            goto L8c
        L86:
            if (r8 != 0) goto L91
            int r8 = r0.d
            if (r8 != 0) goto L91
        L8c:
            r0.f363b = r2
        L8e:
            r0.f362a = r2
            goto L9a
        L91:
            if (r9 != 0) goto L9a
            int r8 = r0.f364c
            if (r8 != 0) goto L9a
        L97:
            r0.f363b = r1
            goto L8e
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m.j0.b(a.m.s, a.m.s):a.m.j0$c");
    }

    private void d(s sVar) {
        sVar.f390a.put("android:visibility:visibility", Integer.valueOf(sVar.f391b.getVisibility()));
        sVar.f390a.put("android:visibility:parent", sVar.f391b.getParent());
        int[] iArr = new int[2];
        sVar.f391b.getLocationOnScreen(iArr);
        sVar.f390a.put("android:visibility:screenLocation", iArr);
    }

    public Animator a(ViewGroup viewGroup, s sVar, int i, s sVar2, int i2) {
        if ((this.K & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f391b.getParent();
            if (b(a(view, false), b(view, false)).f362a) {
                return null;
            }
        }
        return a(viewGroup, sVar2.f391b, sVar, sVar2);
    }

    @Override // a.m.m
    public Animator a(ViewGroup viewGroup, s sVar, s sVar2) {
        c b2 = b(sVar, sVar2);
        if (b2.f362a) {
            if (b2.e == null && b2.f == null) {
                return null;
            }
            return b2.f363b ? a(viewGroup, sVar, b2.f364c, sVar2, b2.d) : b(viewGroup, sVar, b2.f364c, sVar2, b2.d);
        }
        return null;
    }

    public abstract Animator a(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public void a(int i) {
        if ((i & (-4)) == 0) {
            this.K = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // a.m.m
    public void a(s sVar) {
        d(sVar);
    }

    @Override // a.m.m
    public boolean a(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f390a.containsKey("android:visibility:visibility") != sVar.f390a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c b2 = b(sVar, sVar2);
        if (!b2.f362a) {
            return false;
        }
        return b2.f364c == 0 || b2.d == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
        if (r10.w != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator b(android.view.ViewGroup r11, a.m.s r12, int r13, a.m.s r14, int r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m.j0.b(android.view.ViewGroup, a.m.s, int, a.m.s, int):android.animation.Animator");
    }

    public abstract Animator b(ViewGroup viewGroup, View view, s sVar, s sVar2);

    @Override // a.m.m
    public void c(s sVar) {
        d(sVar);
    }

    @Override // a.m.m
    public String[] n() {
        return L;
    }
}
