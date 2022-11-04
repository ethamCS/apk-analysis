package y8;

import android.text.SpannableString;
import android.text.style.URLSpan;
import android.widget.TextView;
import hc.t;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroid/widget/TextView;", "Ltb/e0;", "a", "common-app_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class e {
    public static final void a(TextView textView) {
        t.e(textView, "<this>");
        SpannableString spannableString = new SpannableString(textView.getText());
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        t.d(uRLSpanArr, "spans");
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            String url = uRLSpan.getURL();
            t.d(url, "span.url");
            spannableString.setSpan(new f(url), spanStart, spanEnd, 0);
        }
        textView.setText(spannableString);
    }
}
