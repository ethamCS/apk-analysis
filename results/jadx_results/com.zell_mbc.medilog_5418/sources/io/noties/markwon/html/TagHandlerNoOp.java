package io.noties.markwon.html;

import io.noties.markwon.MarkwonVisitor;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
/* loaded from: classes2.dex */
public class TagHandlerNoOp extends TagHandler {
    private final Collection<String> tags;

    @Override // io.noties.markwon.html.TagHandler
    public void handle(MarkwonVisitor markwonVisitor, MarkwonHtmlRenderer markwonHtmlRenderer, HtmlTag htmlTag) {
    }

    public static TagHandlerNoOp create(String str) {
        return new TagHandlerNoOp(Collections.singleton(str));
    }

    public static TagHandlerNoOp create(String... strArr) {
        return new TagHandlerNoOp(Arrays.asList(strArr));
    }

    TagHandlerNoOp(Collection<String> collection) {
        this.tags = collection;
    }

    @Override // io.noties.markwon.html.TagHandler
    public Collection<String> supportedTags() {
        return this.tags;
    }
}
