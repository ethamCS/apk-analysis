package io.noties.markwon;

import android.text.Spanned;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.text.PrecomputedTextCompat;
import io.noties.markwon.Markwon;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public class PrecomputedFutureTextSetterCompat implements Markwon.TextSetter {
    private final Executor executor;

    public static PrecomputedFutureTextSetterCompat create(Executor executor) {
        return new PrecomputedFutureTextSetterCompat(executor);
    }

    public static PrecomputedFutureTextSetterCompat create() {
        return new PrecomputedFutureTextSetterCompat(null);
    }

    PrecomputedFutureTextSetterCompat(Executor executor) {
        this.executor = executor;
    }

    @Override // io.noties.markwon.Markwon.TextSetter
    public void setText(TextView textView, Spanned spanned, TextView.BufferType bufferType, Runnable runnable) {
        if (textView instanceof AppCompatTextView) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) textView;
            appCompatTextView.setTextFuture(PrecomputedTextCompat.getTextFuture(spanned, appCompatTextView.getTextMetricsParamsCompat(), this.executor));
            runnable.run();
            return;
        }
        throw new IllegalStateException("TextView provided is not an instance of AppCompatTextView, cannot call setTextFuture(), textView: " + textView);
    }
}
