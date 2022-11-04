package io.noties.markwon.html.tag;

import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonVisitor;
import io.noties.markwon.SpanFactory;
import io.noties.markwon.SpannableBuilder;
import io.noties.markwon.html.HtmlTag;
import io.noties.markwon.html.MarkwonHtmlRenderer;
import io.noties.markwon.html.TagHandler;
import java.util.Collection;
import java.util.Collections;
import org.commonmark.node.BlockQuote;
/* loaded from: classes2.dex */
public class BlockquoteHandler extends TagHandler {
    @Override // io.noties.markwon.html.TagHandler
    public void handle(MarkwonVisitor markwonVisitor, MarkwonHtmlRenderer markwonHtmlRenderer, HtmlTag htmlTag) {
        if (htmlTag.isBlock()) {
            visitChildren(markwonVisitor, markwonHtmlRenderer, htmlTag.getAsBlock());
        }
        MarkwonConfiguration configuration = markwonVisitor.configuration();
        SpanFactory spanFactory = configuration.spansFactory().get(BlockQuote.class);
        if (spanFactory != null) {
            SpannableBuilder.setSpans(markwonVisitor.builder(), spanFactory.getSpans(configuration, markwonVisitor.renderProps()), htmlTag.start(), htmlTag.end());
        }
    }

    @Override // io.noties.markwon.html.TagHandler
    public Collection<String> supportedTags() {
        return Collections.singleton("blockquote");
    }
}
