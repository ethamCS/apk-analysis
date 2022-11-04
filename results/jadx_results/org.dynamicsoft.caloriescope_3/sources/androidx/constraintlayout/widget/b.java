package androidx.constraintlayout.widget;

import a.e.a.j.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: c */
    protected int f801c;
    protected Context d;
    protected j e;
    private String g;

    /* renamed from: b */
    protected int[] f800b = new int[32];
    protected boolean f = false;

    public b(Context context) {
        super(context);
        this.d = context;
        a((AttributeSet) null);
    }

    private void a(String str) {
        int i;
        Object a2;
        if (str == null || this.d == null) {
            return;
        }
        String trim = str.trim();
        try {
            i = g.class.getField(trim).getInt(null);
        } catch (Exception unused) {
            i = 0;
        }
        if (i == 0) {
            i = this.d.getResources().getIdentifier(trim, "id", this.d.getPackageName());
        }
        if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (a2 = ((ConstraintLayout) getParent()).a(0, trim)) != null && (a2 instanceof Integer)) {
            i = ((Integer) a2).intValue();
        }
        if (i != 0) {
            setTag(i, null);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void setIds(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void a() {
        if (this.e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.a)) {
            return;
        }
        ((ConstraintLayout.a) layoutParams).k0 = this.e;
    }

    public void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == h.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.g = string;
                    setIds(string);
                }
            }
        }
    }

    public void a(ConstraintLayout constraintLayout) {
    }

    public void b(ConstraintLayout constraintLayout) {
    }

    public void c(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.g);
        }
        j jVar = this.e;
        if (jVar == null) {
            return;
        }
        jVar.J();
        for (int i = 0; i < this.f801c; i++) {
            View a2 = constraintLayout.a(this.f800b[i]);
            if (a2 != null) {
                this.e.b(constraintLayout.a(a2));
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f800b, this.f801c);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f801c = 0;
        for (int i : iArr) {
            setTag(i, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        int i2 = this.f801c + 1;
        int[] iArr = this.f800b;
        if (i2 > iArr.length) {
            this.f800b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f800b;
        int i3 = this.f801c;
        iArr2[i3] = i;
        this.f801c = i3 + 1;
    }
}
