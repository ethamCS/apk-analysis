package q1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
/* loaded from: classes.dex */
public class m extends i0 {
    private static final TimeInterpolator D4 = new DecelerateInterpolator();
    private static final TimeInterpolator E4 = new AccelerateInterpolator();
    private static final g F4 = new a();
    private static final g G4 = new b();
    private static final g H4 = new c();
    private static final g I4 = new d();
    private static final g J4 = new e();
    private static final g K4 = new f();
    private g B4 = K4;
    private int C4 = 80;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends h {
        a() {
            super(null);
        }

        @Override // q1.m.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    static class b extends h {
        b() {
            super(null);
        }

        @Override // q1.m.g
        public float b(ViewGroup viewGroup, View view) {
            boolean z10 = true;
            if (androidx.core.view.y.B(viewGroup) != 1) {
                z10 = false;
            }
            float translationX = view.getTranslationX();
            float width = viewGroup.getWidth();
            return z10 ? translationX + width : translationX - width;
        }
    }

    /* loaded from: classes.dex */
    static class c extends i {
        c() {
            super(null);
        }

        @Override // q1.m.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* loaded from: classes.dex */
    static class d extends h {
        d() {
            super(null);
        }

        @Override // q1.m.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    static class e extends h {
        e() {
            super(null);
        }

        @Override // q1.m.g
        public float b(ViewGroup viewGroup, View view) {
            boolean z10 = true;
            if (androidx.core.view.y.B(viewGroup) != 1) {
                z10 = false;
            }
            float translationX = view.getTranslationX();
            float width = viewGroup.getWidth();
            return z10 ? translationX - width : translationX + width;
        }
    }

    /* loaded from: classes.dex */
    static class f extends i {
        f() {
            super(null);
        }

        @Override // q1.m.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class h implements g {
        private h() {
        }

        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // q1.m.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class i implements g {
        private i() {
        }

        /* synthetic */ i(a aVar) {
            this();
        }

        @Override // q1.m.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public m() {
        q0(80);
    }

    private void j0(t tVar) {
        int[] iArr = new int[2];
        tVar.f19469b.getLocationOnScreen(iArr);
        tVar.f19468a.put("android:slide:screenPosition", iArr);
    }

    @Override // q1.i0, q1.n
    public void g(t tVar) {
        super.g(tVar);
        j0(tVar);
    }

    @Override // q1.i0, q1.n
    public void j(t tVar) {
        super.j(tVar);
        j0(tVar);
    }

    @Override // q1.i0
    public Animator l0(ViewGroup viewGroup, View view, t tVar, t tVar2) {
        if (tVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) tVar2.f19468a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return v.a(view, tVar2, iArr[0], iArr[1], this.B4.b(viewGroup, view), this.B4.a(viewGroup, view), translationX, translationY, D4, this);
    }

    @Override // q1.i0
    public Animator n0(ViewGroup viewGroup, View view, t tVar, t tVar2) {
        if (tVar == null) {
            return null;
        }
        int[] iArr = (int[]) tVar.f19468a.get("android:slide:screenPosition");
        return v.a(view, tVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.B4.b(viewGroup, view), this.B4.a(viewGroup, view), E4, this);
    }

    public void q0(int i10) {
        g gVar;
        if (i10 == 3) {
            gVar = F4;
        } else if (i10 == 5) {
            gVar = I4;
        } else if (i10 == 48) {
            gVar = H4;
        } else if (i10 == 80) {
            gVar = K4;
        } else if (i10 == 8388611) {
            gVar = G4;
        } else if (i10 != 8388613) {
            throw new IllegalArgumentException("Invalid slide direction");
        } else {
            gVar = J4;
        }
        this.B4 = gVar;
        this.C4 = i10;
        l lVar = new l();
        lVar.j(i10);
        f0(lVar);
    }
}
