package io.noties.markwon.ext.tables;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import io.noties.markwon.ext.tables.TableRowSpan;
/* loaded from: classes2.dex */
abstract class TableRowsScheduler {
    public static void schedule(final TextView textView) {
        Object[] extract = extract(textView);
        if (extract == null || extract.length <= 0) {
            return;
        }
        if (textView.getTag(R.id.markwon_tables_scheduler) == null) {
            View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: io.noties.markwon.ext.tables.TableRowsScheduler.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    TableRowsScheduler.unschedule(textView);
                    textView.removeOnAttachStateChangeListener(this);
                    textView.setTag(R.id.markwon_tables_scheduler, null);
                }
            };
            textView.addOnAttachStateChangeListener(onAttachStateChangeListener);
            textView.setTag(R.id.markwon_tables_scheduler, onAttachStateChangeListener);
        }
        TableRowSpan.Invalidator invalidator = new TableRowSpan.Invalidator() { // from class: io.noties.markwon.ext.tables.TableRowsScheduler.2
            final Runnable runnable = new Runnable() { // from class: io.noties.markwon.ext.tables.TableRowsScheduler.2.1
                @Override // java.lang.Runnable
                public void run() {
                    textView.setText(textView.getText());
                }
            };

            @Override // io.noties.markwon.ext.tables.TableRowSpan.Invalidator
            public void invalidate() {
                textView.removeCallbacks(this.runnable);
                textView.post(this.runnable);
            }
        };
        for (Object obj : extract) {
            ((TableRowSpan) obj).invalidator(invalidator);
        }
    }

    public static void unschedule(TextView textView) {
        Object[] extract = extract(textView);
        if (extract == null || extract.length <= 0) {
            return;
        }
        for (Object obj : extract) {
            ((TableRowSpan) obj).invalidator(null);
        }
    }

    private static Object[] extract(TextView textView) {
        CharSequence text = textView.getText();
        if (TextUtils.isEmpty(text) || !(text instanceof Spanned)) {
            return null;
        }
        return ((Spanned) text).getSpans(0, text.length(), TableRowSpan.class);
    }

    private TableRowsScheduler() {
    }
}
