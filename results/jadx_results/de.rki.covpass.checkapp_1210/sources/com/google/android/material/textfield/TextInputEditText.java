package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import b5.l;
import com.google.android.material.internal.m;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class TextInputEditText extends androidx.appcompat.widget.k {
    private final Rect U3;
    private boolean V3;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b5.b.f5461n);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i10) {
        super(v5.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.U3 = new Rect();
        TypedArray h10 = m.h(context, attributeSet, l.U5, i10, b5.k.f5492k, new int[0]);
        setTextInputLayoutFocusedRectEnabled(h10.getBoolean(l.V5, false));
        h10.recycle();
    }

    private boolean c(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.V3;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!c(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.U3);
        rect.bottom = this.U3.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        return c(textInputLayout) ? textInputLayout.getGlobalVisibleRect(rect, point) : super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.O()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.O() || super.getHint() != null || !com.google.android.material.internal.g.a()) {
            return;
        }
        setHint(BuildConfig.FLAVOR);
    }

    @Override // androidx.appcompat.widget.k, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!c(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.U3.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.U3);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.V3 = z10;
    }
}
