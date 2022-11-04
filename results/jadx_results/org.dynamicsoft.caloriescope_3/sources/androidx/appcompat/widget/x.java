package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
/* loaded from: classes.dex */
final class x {

    /* renamed from: a */
    private TextView f770a;

    /* renamed from: b */
    private TextClassifier f771b;

    public x(TextView textView) {
        a.g.k.h.a(textView);
        this.f770a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f771b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f770a.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    public void a(TextClassifier textClassifier) {
        this.f771b = textClassifier;
    }
}
