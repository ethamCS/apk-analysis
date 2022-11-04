package com.google.android.material.datepicker;

import a.g.l.u;
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
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: b */
    private final Calendar f1446b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends a.g.l.a {
        a(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // a.g.l.a
        public void a(View view, a.g.l.d0.c cVar) {
            super.a(view, cVar);
            cVar.a((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1446b = o.d();
        if (h.b(getContext())) {
            setNextFocusLeftId(b.a.a.a.f.cancel_button);
            setNextFocusRightId(b.a.a.a.f.confirm_button);
        }
        u.a(this, new a(this));
    }

    private static int a(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private void a(int i, Rect rect) {
        int a2;
        if (i == 33) {
            a2 = getAdapter2().b();
        } else if (i != 130) {
            super.onFocusChanged(true, i, rect);
            return;
        } else {
            a2 = getAdapter2().a();
        }
        setSelection(a2);
    }

    private static boolean a(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter */
    public ListAdapter getAdapter2() {
        return (j) super.getAdapter();
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
        j adapter2 = getAdapter2();
        d<?> dVar = adapter2.f1476c;
        c cVar = adapter2.d;
        Long item = adapter2.getItem(adapter2.a());
        Long item2 = adapter2.getItem(adapter2.b());
        for (a.g.k.d<Long, Long> dVar2 : dVar.b()) {
            Long l = dVar2.f245a;
            if (l != null) {
                if (dVar2.f246b == null) {
                    continue;
                } else {
                    long longValue = l.longValue();
                    long longValue2 = dVar2.f246b.longValue();
                    if (a(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        return;
                    }
                    if (longValue < item.longValue()) {
                        i2 = adapter2.a();
                        i = adapter2.b(i2) ? 0 : materialCalendarGridView.getChildAt(i2 - 1).getRight();
                    } else {
                        materialCalendarGridView.f1446b.setTimeInMillis(longValue);
                        i2 = adapter2.a(materialCalendarGridView.f1446b.get(5));
                        i = a(materialCalendarGridView.getChildAt(i2));
                    }
                    if (longValue2 > item2.longValue()) {
                        i4 = adapter2.b();
                        i3 = adapter2.c(i4) ? getWidth() : materialCalendarGridView.getChildAt(i4).getRight();
                    } else {
                        materialCalendarGridView.f1446b.setTimeInMillis(longValue2);
                        i4 = adapter2.a(materialCalendarGridView.f1446b.get(5));
                        i3 = a(materialCalendarGridView.getChildAt(i4));
                    }
                    int itemId = (int) adapter2.getItemId(i2);
                    int itemId2 = (int) adapter2.getItemId(i4);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View childAt = materialCalendarGridView.getChildAt(numColumns);
                        canvas.drawRect(numColumns > i2 ? 0 : i, childAt.getTop() + cVar.f1452a.b(), i4 > numColumns2 ? getWidth() : i3, childAt.getBottom() - cVar.f1452a.a(), cVar.h);
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
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter2().a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof j) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), j.class.getCanonicalName()));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().a()) {
            i = getAdapter2().a();
        }
        super.setSelection(i);
    }
}
