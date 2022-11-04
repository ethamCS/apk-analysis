package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.y;
import java.util.Calendar;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: c */
    private final Calendar f7104c;

    /* renamed from: d */
    private final boolean f7105d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.core.view.a {
        a() {
            MaterialCalendarGridView.this = r1;
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            super.g(view, dVar);
            dVar.Z(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7104c = s.k();
        if (i.S2(getContext())) {
            setNextFocusLeftId(b5.f.f5482a);
            setNextFocusRightId(b5.f.c_res_0x7f0900a8);
        }
        this.f7105d = i.T2(getContext());
        y.o0(this, new a());
    }

    private void a(int i10, Rect rect) {
        int b10;
        if (i10 == 33) {
            b10 = getAdapter2().i();
        } else if (i10 != 130) {
            super.onFocusChanged(true, i10, rect);
            return;
        } else {
            b10 = getAdapter2().b();
        }
        setSelection(b10);
    }

    private View c(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    private static int d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean e(Long l10, Long l11, Long l12, Long l13) {
        return l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue();
    }

    /* renamed from: b */
    public m getAdapter2() {
        return (m) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        m adapter2 = getAdapter2();
        d<?> dVar = adapter2.f7196d;
        c cVar = adapter2.f7198x;
        int max = Math.max(adapter2.b(), getFirstVisiblePosition());
        int min = Math.min(adapter2.i(), getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<androidx.core.util.d<Long, Long>> it = dVar.j().iterator();
        while (it.hasNext()) {
            androidx.core.util.d<Long, Long> next = it.next();
            Long l10 = next.f3596a;
            if (l10 == null) {
                materialCalendarGridView = this;
            } else if (next.f3597b != null) {
                long longValue = l10.longValue();
                long longValue2 = next.f3597b.longValue();
                if (!e(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                    boolean e10 = com.google.android.material.internal.o.e(this);
                    if (longValue < item.longValue()) {
                        if (adapter2.f(max)) {
                            i17 = 0;
                        } else {
                            View c10 = materialCalendarGridView.c(max - 1);
                            i17 = !e10 ? c10.getRight() : c10.getLeft();
                        }
                        i10 = i17;
                        i11 = max;
                    } else {
                        materialCalendarGridView.f7104c.setTimeInMillis(longValue);
                        i11 = adapter2.a(materialCalendarGridView.f7104c.get(5));
                        i10 = d(materialCalendarGridView.c(i11));
                    }
                    if (longValue2 > item2.longValue()) {
                        if (adapter2.g(min)) {
                            i16 = getWidth();
                        } else {
                            View c11 = materialCalendarGridView.c(min);
                            i16 = !e10 ? c11.getRight() : c11.getLeft();
                        }
                        i12 = i16;
                        i13 = min;
                    } else {
                        materialCalendarGridView.f7104c.setTimeInMillis(longValue2);
                        i13 = adapter2.a(materialCalendarGridView.f7104c.get(5));
                        i12 = d(materialCalendarGridView.c(i13));
                    }
                    int itemId = (int) adapter2.getItemId(i11);
                    int i18 = max;
                    int i19 = min;
                    int itemId2 = (int) adapter2.getItemId(i13);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View c12 = materialCalendarGridView.c(numColumns);
                        int top = c12.getTop() + cVar.f7124a.c();
                        m mVar = adapter2;
                        int bottom = c12.getBottom() - cVar.f7124a.b();
                        if (!e10) {
                            i15 = numColumns > i11 ? 0 : i10;
                            i14 = i13 > numColumns2 ? getWidth() : i12;
                        } else {
                            int i20 = i13 > numColumns2 ? 0 : i12;
                            i14 = numColumns > i11 ? getWidth() : i10;
                            i15 = i20;
                        }
                        canvas.drawRect(i15, top, i14, bottom, cVar.f7131h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter2 = mVar;
                    }
                    materialCalendarGridView = this;
                    max = i18;
                    min = i19;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter2().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f7105d) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof m) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), m.class.getCanonicalName()));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter2().b()) {
            i10 = getAdapter2().b();
        }
        super.setSelection(i10);
    }
}
