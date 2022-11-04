package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
/* loaded from: classes.dex */
final class a0 {

    /* renamed from: a */
    private TextView f1201a;

    /* renamed from: b */
    private TextClassifier f1202b;

    public a0(TextView textView) {
        this.f1201a = (TextView) androidx.core.util.h.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1202b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1201a.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f1202b = textClassifier;
    }
}
