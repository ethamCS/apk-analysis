package io.noties.markwon.html.tag;

import android.text.style.StrikethroughSpan;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonVisitor;
import io.noties.markwon.SpanFactory;
import io.noties.markwon.SpannableBuilder;
import io.noties.markwon.html.HtmlTag;
import io.noties.markwon.html.MarkwonHtmlRenderer;
import io.noties.markwon.html.TagHandler;
import java.util.Arrays;
import java.util.Collection;
import org.commonmark.ext.gfm.strikethrough.Strikethrough;
/* loaded from: classes2.dex */
public class StrikeHandler extends TagHandler {
    private static final boolean HAS_MARKDOWN_IMPLEMENTATION;

    static {
        boolean z;
        try {
            Class.forName("org.commonmark.ext.gfm.strikethrough.Strikethrough");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        HAS_MARKDOWN_IMPLEMENTATION = z;
    }

    @Override // io.noties.markwon.html.TagHandler
    public void handle(MarkwonVisitor markwonVisitor, MarkwonHtmlRenderer markwonHtmlRenderer, HtmlTag htmlTag) {
        if (htmlTag.isBlock()) {
            visitChildren(markwonVisitor, markwonHtmlRenderer, htmlTag.getAsBlock());
        }
        SpannableBuilder.setSpans(markwonVisitor.builder(), HAS_MARKDOWN_IMPLEMENTATION ? getMarkdownSpans(markwonVisitor) : new StrikethroughSpan(), htmlTag.start(), htmlTag.end());
    }

    @Override // io.noties.markwon.html.TagHandler
    public Collection<String> supportedTags() {
        return Arrays.asList("s", "del");
    }

    private static Object getMarkdownSpans(MarkwonVisitor markwonVisitor) {
        MarkwonConfiguration configuration = markwonVisitor.configuration();
        SpanFactory spanFactory = configuration.spansFactory().get(Strikethrough.class);
        if (spanFactory == null) {
            return null;
        }
        return spanFactory.getSpans(configuration, markwonVisitor.renderProps());
    }
}
