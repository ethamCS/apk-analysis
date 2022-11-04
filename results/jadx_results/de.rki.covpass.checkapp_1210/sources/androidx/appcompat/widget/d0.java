package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: l */
    private static final RectF f1286l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m */
    private static ConcurrentHashMap<String, Method> f1287m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n */
    private static ConcurrentHashMap<String, Field> f1288n = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1289a = 0;

    /* renamed from: b */
    private boolean f1290b = false;

    /* renamed from: c */
    private float f1291c = -1.0f;

    /* renamed from: d */
    private float f1292d = -1.0f;

    /* renamed from: e */
    private float f1293e = -1.0f;

    /* renamed from: f */
    private int[] f1294f = new int[0];

    /* renamed from: g */
    private boolean f1295g = false;

    /* renamed from: h */
    private TextPaint f1296h;

    /* renamed from: i */
    private final TextView f1297i;

    /* renamed from: j */
    private final Context f1298j;

    /* renamed from: k */
    private final c f1299k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.d0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) d0.n(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.d0.a, androidx.appcompat.widget.d0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.d0.c
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        boolean b(TextView textView) {
            return ((Boolean) d0.n(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public d0(TextView textView) {
        this.f1297i = textView;
        this.f1298j = textView.getContext();
        this.f1299k = Build.VERSION.SDK_INT >= 29 ? new b() : new a();
    }

    private void A(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        } else {
            this.f1289a = 1;
            this.f1292d = f10;
            this.f1293e = f11;
            this.f1291c = f12;
            this.f1295g = false;
        }
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f1289a = 0;
        this.f1292d = -1.0f;
        this.f1293e = -1.0f;
        this.f1291c = -1.0f;
        this.f1294f = new int[0];
        this.f1290b = false;
    }

    private StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1296h, i10);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1297i.getLineSpacingExtra(), this.f1297i.getLineSpacingMultiplier()).setIncludePad(this.f1297i.getIncludeFontPadding()).setBreakStrategy(this.f1297i.getBreakStrategy()).setHyphenationFrequency(this.f1297i.getHyphenationFrequency());
        if (i11 == -1) {
            i11 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i11);
        try {
            this.f1299k.a(obtain, this.f1297i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    private int f(RectF rectF) {
        int i10;
        int length = this.f1294f.length;
        if (length != 0) {
            int i11 = 0;
            int i12 = 1;
            int i13 = length - 1;
            while (true) {
                int i14 = i12;
                int i15 = i11;
                i11 = i14;
                while (i11 <= i13) {
                    i10 = (i11 + i13) / 2;
                    if (y(this.f1294f[i10], rectF)) {
                        break;
                    }
                    i15 = i10 - 1;
                    i13 = i15;
                }
                return this.f1294f[i15];
                i12 = i10 + 1;
            }
        } else {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
    }

    private static Method l(String str) {
        try {
            Method method = f1287m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1287m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    static <T> T n(Object obj, String str, T t10) {
        try {
            return (T) l(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    private void t(float f10) {
        if (f10 != this.f1297i.getPaint().getTextSize()) {
            this.f1297i.getPaint().setTextSize(f10);
            boolean isInLayout = this.f1297i.isInLayout();
            if (this.f1297i.getLayout() == null) {
                return;
            }
            this.f1290b = false;
            try {
                Method l10 = l("nullLayouts");
                if (l10 != null) {
                    l10.invoke(this.f1297i, new Object[0]);
                }
            } catch (Exception e10) {
                Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
            }
            if (!isInLayout) {
                this.f1297i.requestLayout();
            } else {
                this.f1297i.forceLayout();
            }
            this.f1297i.invalidate();
        }
    }

    private boolean v() {
        if (!z() || this.f1289a != 1) {
            this.f1290b = false;
        } else {
            if (!this.f1295g || this.f1294f.length == 0) {
                int floor = ((int) Math.floor((this.f1293e - this.f1292d) / this.f1291c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f1292d + (i10 * this.f1291c));
                }
                this.f1294f = b(iArr);
            }
            this.f1290b = true;
        }
        return this.f1290b;
    }

    private void w(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1294f = b(iArr);
            x();
        }
    }

    private boolean x() {
        int[] iArr = this.f1294f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f1295g = z10;
        if (z10) {
            this.f1289a = 1;
            this.f1292d = iArr[0];
            this.f1293e = iArr[length - 1];
            this.f1291c = -1.0f;
        }
        return z10;
    }

    private boolean y(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1297i.getText();
        TransformationMethod transformationMethod = this.f1297i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1297i)) != null) {
            text = transformation;
        }
        int maxLines = this.f1297i.getMaxLines();
        m(i10);
        StaticLayout d10 = d(text, (Layout.Alignment) n(this.f1297i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d10.getLineCount() <= maxLines && d10.getLineEnd(d10.getLineCount() - 1) == text.length())) && ((float) d10.getHeight()) <= rectF.bottom;
    }

    private boolean z() {
        return !(this.f1297i instanceof k);
    }

    public void a() {
        if (!o()) {
            return;
        }
        if (this.f1290b) {
            if (this.f1297i.getMeasuredHeight() <= 0 || this.f1297i.getMeasuredWidth() <= 0) {
                return;
            }
            int measuredWidth = this.f1299k.b(this.f1297i) ? 1048576 : (this.f1297i.getMeasuredWidth() - this.f1297i.getTotalPaddingLeft()) - this.f1297i.getTotalPaddingRight();
            int height = (this.f1297i.getHeight() - this.f1297i.getCompoundPaddingBottom()) - this.f1297i.getCompoundPaddingTop();
            if (measuredWidth <= 0 || height <= 0) {
                return;
            }
            RectF rectF = f1286l;
            synchronized (rectF) {
                rectF.setEmpty();
                rectF.right = measuredWidth;
                rectF.bottom = height;
                float f10 = f(rectF);
                if (f10 != this.f1297i.getTextSize()) {
                    u(0, f10);
                }
            }
        }
        this.f1290b = true;
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return e(charSequence, alignment, i10, i11);
    }

    public int g() {
        return Math.round(this.f1293e);
    }

    public int h() {
        return Math.round(this.f1292d);
    }

    public int i() {
        return Math.round(this.f1291c);
    }

    public int[] j() {
        return this.f1294f;
    }

    public int k() {
        return this.f1289a;
    }

    void m(int i10) {
        TextPaint textPaint = this.f1296h;
        if (textPaint == null) {
            this.f1296h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1296h.set(this.f1297i.getPaint());
        this.f1296h.setTextSize(i10);
    }

    public boolean o() {
        return z() && this.f1289a != 0;
    }

    public void p(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f1298j;
        int[] iArr = e.j.f9240g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f1297i;
        androidx.core.view.y.m0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = e.j.f9265l0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f1289a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = e.j.f9260k0;
        float dimension = obtainStyledAttributes.hasValue(i12) ? obtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = e.j.f9250i0;
        float dimension2 = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = e.j.f9245h0;
        float dimension3 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = e.j.f9255j0;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            w(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!z()) {
            this.f1289a = 0;
        } else if (this.f1289a != 1) {
        } else {
            if (!this.f1295g) {
                DisplayMetrics displayMetrics = this.f1298j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                A(dimension2, dimension3, dimension);
            }
            v();
        }
    }

    public void q(int i10, int i11, int i12, int i13) {
        if (z()) {
            DisplayMetrics displayMetrics = this.f1298j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (!v()) {
                return;
            }
            a();
        }
    }

    public void r(int[] iArr, int i10) {
        if (z()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1298j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f1294f = b(iArr2);
                if (!x()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1295g = false;
            }
            if (!v()) {
                return;
            }
            a();
        }
    }

    public void s(int i10) {
        if (z()) {
            if (i10 == 0) {
                c();
            } else if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            } else {
                DisplayMetrics displayMetrics = this.f1298j.getResources().getDisplayMetrics();
                A(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (!v()) {
                    return;
                }
                a();
            }
        }
    }

    public void u(int i10, float f10) {
        Context context = this.f1298j;
        t(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
