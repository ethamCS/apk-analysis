package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: b */
    private final Calendar f3027b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends b.g.l.a {
        a(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // b.g.l.a
        public void g(View view, b.g.l.c0.c cVar) {
            super.g(view, cVar);
            cVar.d0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3027b = s.l();
        if (i.Y1(getContext())) {
            setNextFocusLeftId(d.a.a.a.f.a_res_0x7f090074);
            setNextFocusRightId(d.a.a.a.f.b_res_0x7f090089);
        }
        b.g.l.t.i0(this, new a(this));
    }

    private void a(int i, Rect rect) {
        int b2;
        if (i == 33) {
            b2 = getAdapter2().h();
        } else if (i != 130) {
            super.onFocusChanged(true, i, rect);
            return;
        } else {
            b2 = getAdapter2().b();
        }
        setSelection(b2);
    }

    private static int c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
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
        int i;
        int i2;
        int i3;
        int i4;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        m adapter2 = getAdapter2();
        d<?> dVar = adapter2.f3091c;
        c cVar = adapter2.f3092d;
        Long item = adapter2.getItem(adapter2.b());
        Long item2 = adapter2.getItem(adapter2.h());
        for (b.g.k.d<Long, Long> dVar2 : dVar.f()) {
            Long l = dVar2.f2493a;
            if (l != null) {
                if (dVar2.f2494b == null) {
                    continue;
                } else {
                    long longValue = l.longValue();
                    long longValue2 = dVar2.f2494b.longValue();
                    if (d(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        return;
                    }
                    if (longValue < item.longValue()) {
                        i2 = adapter2.b();
                        i = adapter2.f(i2) ? 0 : materialCalendarGridView.getChildAt(i2 - 1).getRight();
                    } else {
                        materialCalendarGridView.f3027b.setTimeInMillis(longValue);
                        i2 = adapter2.a(materialCalendarGridView.f3027b.get(5));
                        i = c(materialCalendarGridView.getChildAt(i2));
                    }
                    if (longValue2 > item2.longValue()) {
                        i4 = Math.min(adapter2.h(), getChildCount() - 1);
                        i3 = adapter2.g(i4) ? getWidth() : materialCalendarGridView.getChildAt(i4).getRight();
                    } else {
                        materialCalendarGridView.f3027b.setTimeInMillis(longValue2);
                        i4 = adapter2.a(materialCalendarGridView.f3027b.get(5));
                        i3 = c(materialCalendarGridView.getChildAt(i4));
                    }
                    int itemId = (int) adapter2.getItemId(i2);
                    int itemId2 = (int) adapter2.getItemId(i4);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View childAt = materialCalendarGridView.getChildAt(numColumns);
                        canvas.drawRect(numColumns > i2 ? 0 : i, childAt.getTop() + cVar.f3046a.c(), i4 > numColumns2 ? getWidth() : i3, childAt.getBottom() - cVar.f3046a.b(), cVar.f3053h);
                        itemId++;
                        materialCalendarGridView = this;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter2().b());
        return true;
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
    public void setSelection(int i) {
        if (i < getAdapter2().b()) {
            i = getAdapter2().b();
        }
        super.setSelection(i);
    }
}
