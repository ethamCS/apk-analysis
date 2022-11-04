package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
/* loaded from: classes.dex */
final class x {

    /* renamed from: a */
    private TextView f665a;

    /* renamed from: b */
    private TextClassifier f666b;

    public x(TextView textView) {
        b.g.k.h.c(textView);
        this.f665a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f666b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f665a.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f666b = textClassifier;
    }
}
