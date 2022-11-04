package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b */
    private static final ViewGroup.MarginLayoutParams f5253b;

    /* renamed from: a */
    private LinearLayoutManager f5254a;

    /* renamed from: androidx.viewpager2.widget.a$a */
    /* loaded from: classes.dex */
    public class C0067a implements Comparator<int[]> {
        C0067a() {
            a.this = r1;
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f5253b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public a(LinearLayoutManager linearLayoutManager) {
        this.f5254a = linearLayoutManager;
    }

    private boolean a() {
        int i10;
        int i11;
        int i12;
        int i13;
        int J = this.f5254a.J();
        if (J == 0) {
            return true;
        }
        boolean z10 = this.f5254a.p2() == 0;
        int[][] iArr = (int[][]) Array.newInstance(int.class, J, 2);
        for (int i14 = 0; i14 < J; i14++) {
            View I = this.f5254a.I(i14);
            if (I == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = I.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f5253b;
            int[] iArr2 = iArr[i14];
            if (z10) {
                i11 = I.getLeft();
                i10 = marginLayoutParams.leftMargin;
            } else {
                i11 = I.getTop();
                i10 = marginLayoutParams.topMargin;
            }
            iArr2[0] = i11 - i10;
            int[] iArr3 = iArr[i14];
            if (z10) {
                i13 = I.getRight();
                i12 = marginLayoutParams.rightMargin;
            } else {
                i13 = I.getBottom();
                i12 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = i13 + i12;
        }
        Arrays.sort(iArr, new C0067a());
        for (int i15 = 1; i15 < J; i15++) {
            if (iArr[i15 - 1][1] != iArr[i15][0]) {
                return false;
            }
        }
        return iArr[0][0] <= 0 && iArr[J - 1][1] >= iArr[0][1] - iArr[0][0];
    }

    private boolean b() {
        int J = this.f5254a.J();
        for (int i10 = 0; i10 < J; i10++) {
            if (c(this.f5254a.I(i10))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (c(viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean d() {
        return (!a() || this.f5254a.J() <= 1) && b();
    }
}
