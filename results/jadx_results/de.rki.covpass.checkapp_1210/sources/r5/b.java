package r5;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    public static final boolean f20473a = true;

    /* renamed from: b */
    private static final int[] f20474b = {16842919};

    /* renamed from: c */
    private static final int[] f20475c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f20476d = {16842908};

    /* renamed from: e */
    private static final int[] f20477e = {16843623};

    /* renamed from: f */
    private static final int[] f20478f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f20479g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f20480h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f20481i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f20482j = {16842913};

    /* renamed from: k */
    private static final int[] f20483k = {16842910, 16842919};

    /* renamed from: l */
    static final String f20484l = b.class.getSimpleName();

    private b() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f20473a) {
            return new ColorStateList(new int[][]{f20482j, StateSet.NOTHING}, new int[]{c(colorStateList, f20478f), c(colorStateList, f20474b)});
        }
        int[] iArr = f20478f;
        int[] iArr2 = f20479g;
        int[] iArr3 = f20480h;
        int[] iArr4 = f20481i;
        int[] iArr5 = f20474b;
        int[] iArr6 = f20475c;
        int[] iArr7 = f20476d;
        int[] iArr8 = f20477e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f20482j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    private static int b(int i10) {
        return androidx.core.graphics.a.j(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f20473a ? b(colorForState) : colorForState;
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f20483k, 0)) != 0) {
                Log.w(f20484l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean e(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
