package io.noties.markwon.html.tag;

import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonVisitor;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import io.noties.markwon.SpannableBuilder;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.html.HtmlTag;
import io.noties.markwon.html.MarkwonHtmlRenderer;
import io.noties.markwon.html.TagHandler;
import java.util.Arrays;
import java.util.Collection;
import org.commonmark.node.ListItem;
/* loaded from: classes2.dex */
public class ListHandler extends TagHandler {
    @Override // io.noties.markwon.html.TagHandler
    public void handle(MarkwonVisitor markwonVisitor, MarkwonHtmlRenderer markwonHtmlRenderer, HtmlTag htmlTag) {
        if (!htmlTag.isBlock()) {
            return;
        }
        HtmlTag.Block asBlock = htmlTag.getAsBlock();
        boolean equals = "ol".equals(asBlock.name());
        boolean equals2 = "ul".equals(asBlock.name());
        if (!equals && !equals2) {
            return;
        }
        MarkwonConfiguration configuration = markwonVisitor.configuration();
        RenderProps renderProps = markwonVisitor.renderProps();
        SpanFactory spanFactory = configuration.spansFactory().get(ListItem.class);
        int currentBulletListLevel = currentBulletListLevel(asBlock);
        int i = 1;
        for (HtmlTag.Block block : asBlock.children()) {
            visitChildren(markwonVisitor, markwonHtmlRenderer, block);
            if (spanFactory != null && "li".equals(block.name())) {
                if (equals) {
                    CoreProps.LIST_ITEM_TYPE.set(renderProps, CoreProps.ListItemType.ORDERED);
                    CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderProps, Integer.valueOf(i));
                    i++;
                } else {
                    CoreProps.LIST_ITEM_TYPE.set(renderProps, CoreProps.ListItemType.BULLET);
                    CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderProps, Integer.valueOf(currentBulletListLevel));
                }
                SpannableBuilder.setSpans(markwonVisitor.builder(), spanFactory.getSpans(configuration, renderProps), block.start(), block.end());
            }
        }
    }

    @Override // io.noties.markwon.html.TagHandler
    public Collection<String> supportedTags() {
        return Arrays.asList("ol", "ul");
    }

    private static int currentBulletListLevel(HtmlTag.Block block) {
        int i = 0;
        while (true) {
            block = block.parent();
            if (block != null) {
                if ("ul".equals(block.name()) || "ol".equals(block.name())) {
                    i++;
                }
            } else {
                return i;
            }
        }
    }
}
