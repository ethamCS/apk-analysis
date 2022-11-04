package io.noties.markwon.ext.tables;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
/* loaded from: classes2.dex */
public class TableAwareMovementMethod implements MovementMethod {
    private final MovementMethod wrapped;

    public static TableAwareMovementMethod wrap(MovementMethod movementMethod) {
        return new TableAwareMovementMethod(movementMethod);
    }

    public static TableAwareMovementMethod create() {
        return new TableAwareMovementMethod(LinkMovementMethod.getInstance());
    }

    public static boolean handleTableRowTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        TableRowSpan tableRowSpan;
        Layout findLayoutForHorizontalOffset;
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
        int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
        int scrollX = x + textView.getScrollX();
        int scrollY = y + textView.getScrollY();
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(scrollY);
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
        TableRowSpan[] tableRowSpanArr = (TableRowSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, TableRowSpan.class);
        if (tableRowSpanArr.length != 0 && (findLayoutForHorizontalOffset = (tableRowSpan = tableRowSpanArr[0]).findLayoutForHorizontalOffset(scrollX)) != null) {
            int offsetForHorizontal2 = findLayoutForHorizontalOffset.getOffsetForHorizontal(findLayoutForHorizontalOffset.getLineForVertical(scrollY - layout.getLineTop(lineForVertical)), scrollX % tableRowSpan.cellWidth());
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) findLayoutForHorizontalOffset.getText()).getSpans(offsetForHorizontal2, offsetForHorizontal2, ClickableSpan.class);
            if (clickableSpanArr.length > 0) {
                clickableSpanArr[0].onClick(textView);
                return true;
            }
        }
        return false;
    }

    public TableAwareMovementMethod(MovementMethod movementMethod) {
        this.wrapped = movementMethod;
    }

    @Override // android.text.method.MovementMethod
    public void initialize(TextView textView, Spannable spannable) {
        this.wrapped.initialize(textView, spannable);
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyDown(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return this.wrapped.onKeyDown(textView, spannable, i, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyUp(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return this.wrapped.onKeyUp(textView, spannable, i, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyOther(TextView textView, Spannable spannable, KeyEvent keyEvent) {
        return this.wrapped.onKeyOther(textView, spannable, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public void onTakeFocus(TextView textView, Spannable spannable, int i) {
        this.wrapped.onTakeFocus(textView, spannable, i);
    }

    @Override // android.text.method.MovementMethod
    public boolean onTrackballEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return this.wrapped.onTrackballEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return this.wrapped.onTouchEvent(textView, spannable, motionEvent) || handleTableRowTouchEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.MovementMethod
    public boolean onGenericMotionEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return this.wrapped.onGenericMotionEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.MovementMethod
    public boolean canSelectArbitrarily() {
        return this.wrapped.canSelectArbitrarily();
    }
}
