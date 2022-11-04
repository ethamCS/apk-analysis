package com.afollestad.materialdialogs.internal.message;

import android.graphics.Rect;
import android.text.Spannable;
import android.text.method.TransformationMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LinkTransformationMethod.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J0\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/afollestad/materialdialogs/internal/message/LinkTransformationMethod;", "Landroid/text/method/TransformationMethod;", "onLinkClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "link", "", "(Lkotlin/jvm/functions/Function1;)V", "getTransformation", "", "source", "view", "Landroid/view/View;", "onFocusChanged", "sourceText", "focused", "", "direction", "", "previouslyFocusedRect", "Landroid/graphics/Rect;", "core"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class LinkTransformationMethod implements TransformationMethod {
    private final Function1<String, Unit> onLinkClick;

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence sourceText, boolean z, int i, Rect previouslyFocusedRect) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(sourceText, "sourceText");
        Intrinsics.checkParameterIsNotNull(previouslyFocusedRect, "previouslyFocusedRect");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkTransformationMethod(Function1<? super String, Unit> onLinkClick) {
        Intrinsics.checkParameterIsNotNull(onLinkClick, "onLinkClick");
        this.onLinkClick = onLinkClick;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence source, View view) {
        URLSpan[] uRLSpanArr;
        Intrinsics.checkParameterIsNotNull(source, "source");
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (!(view instanceof TextView)) {
            return source;
        }
        TextView textView = (TextView) view;
        if (textView.getText() == null || !(textView.getText() instanceof Spannable)) {
            return source;
        }
        CharSequence text = textView.getText();
        if (text == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.text.Spannable");
        }
        Spannable spannable = (Spannable) text;
        for (URLSpan span : (URLSpan[]) spannable.getSpans(0, textView.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(span);
            int spanEnd = spannable.getSpanEnd(span);
            Intrinsics.checkExpressionValueIsNotNull(span, "span");
            String url = span.getURL();
            spannable.removeSpan(span);
            Intrinsics.checkExpressionValueIsNotNull(url, "url");
            spannable.setSpan(new CustomUrlSpan(url, this.onLinkClick), spanStart, spanEnd, 33);
        }
        return spannable;
    }
}
