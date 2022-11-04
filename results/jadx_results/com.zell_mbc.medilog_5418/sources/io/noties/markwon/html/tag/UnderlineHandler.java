package io.noties.markwon.html.tag;

import android.text.style.UnderlineSpan;
import io.noties.markwon.MarkwonVisitor;
import io.noties.markwon.SpannableBuilder;
import io.noties.markwon.html.HtmlTag;
import io.noties.markwon.html.MarkwonHtmlRenderer;
import io.noties.markwon.html.TagHandler;
import java.util.Arrays;
import java.util.Collection;
/* loaded from: classes2.dex */
public class UnderlineHandler extends TagHandler {
    @Override // io.noties.markwon.html.TagHandler
    public void handle(MarkwonVisitor markwonVisitor, MarkwonHtmlRenderer markwonHtmlRenderer, HtmlTag htmlTag) {
        if (htmlTag.isBlock()) {
            visitChildren(markwonVisitor, markwonHtmlRenderer, htmlTag.getAsBlock());
        }
        SpannableBuilder.setSpans(markwonVisitor.builder(), new UnderlineSpan(), htmlTag.start(), htmlTag.end());
    }

    @Override // io.noties.markwon.html.TagHandler
    public Collection<String> supportedTags() {
        return Arrays.asList("u", "ins");
    }
}
