package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
/* loaded from: classes.dex */
class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final Animation f4134a;

        /* renamed from: b */
        public final Animator f4135b;

        a(Animator animator) {
            this.f4134a = null;
            this.f4135b = animator;
            if (animator != null) {
                return;
            }
            throw new IllegalStateException("Animator cannot be null");
        }

        a(Animation animation) {
            this.f4134a = animation;
            this.f4135b = null;
            if (animation != null) {
                return;
            }
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    /* loaded from: classes.dex */
    static class b extends AnimationSet implements Runnable {

        /* renamed from: c */
        private final ViewGroup f4136c;

        /* renamed from: d */
        private final View f4137d;

        /* renamed from: q */
        private boolean f4138q;

        /* renamed from: x */
        private boolean f4139x;

        /* renamed from: y */
        private boolean f4140y = true;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f4136c = viewGroup;
            this.f4137d = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f4140y = true;
            if (this.f4138q) {
                return !this.f4139x;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f4138q = true;
                androidx.core.view.v.a(this.f4136c, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f4140y = true;
            if (this.f4138q) {
                return !this.f4139x;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f4138q = true;
                androidx.core.view.v.a(this.f4136c, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4138q || !this.f4140y) {
                this.f4136c.endViewTransition(this.f4137d);
                this.f4139x = true;
                return;
            }
            this.f4140y = false;
            this.f4136c.post(this);
        }
    }

    private static int a(Fragment fragment, boolean z10, boolean z11) {
        return z11 ? z10 ? fragment.k0() : fragment.l0() : z10 ? fragment.V() : fragment.Y();
    }

    public static a b(Context context, Fragment fragment, boolean z10, boolean z11) {
        int g02 = fragment.g0();
        int a10 = a(fragment, z10, z11);
        boolean z12 = false;
        fragment.X1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f3926w4;
        if (viewGroup != null) {
            int i10 = a1.b.c_res_0x7f0902b0;
            if (viewGroup.getTag(i10) != null) {
                fragment.f3926w4.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.f3926w4;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation Q0 = fragment.Q0(g02, z10, a10);
            if (Q0 != null) {
                return new a(Q0);
            }
            Animator R0 = fragment.R0(g02, z10, a10);
            if (R0 != null) {
                return new a(R0);
            }
            if (a10 == 0 && g02 != 0) {
                a10 = d(context, g02, z10);
            }
            if (a10 != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(a10));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, a10);
                        if (loadAnimation != null) {
                            return new a(loadAnimation);
                        }
                        z12 = true;
                    } catch (Resources.NotFoundException e10) {
                        throw e10;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z12) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, a10);
                        if (loadAnimator != null) {
                            return new a(loadAnimator);
                        }
                    } catch (RuntimeException e11) {
                        if (equals) {
                            throw e11;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a10);
                        if (loadAnimation2 != null) {
                            return new a(loadAnimation2);
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    private static int c(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i10, boolean z10) {
        int i11;
        if (i10 == 4097) {
            return z10 ? a1.a.f145e : a1.a.f146f;
        } else if (i10 == 8194) {
            return z10 ? a1.a.a_res_0x7f020003 : a1.a.b_res_0x7f020004;
        } else {
            if (i10 == 8197) {
                i11 = z10 ? 16842938 : 16842939;
            } else if (i10 == 4099) {
                return z10 ? a1.a.c_res_0x7f020005 : a1.a.d_res_0x7f020006;
            } else if (i10 != 4100) {
                return -1;
            } else {
                i11 = z10 ? 16842936 : 16842937;
            }
            return c(context, i11);
        }
    }
}
