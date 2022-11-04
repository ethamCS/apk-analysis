package io.noties.markwon.html;

import io.noties.markwon.MarkwonVisitor;
import io.noties.markwon.html.HtmlTag;
import io.noties.markwon.html.MarkwonHtmlParser;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MarkwonHtmlRendererImpl extends MarkwonHtmlRenderer {
    private final boolean allowNonClosedTags;
    private final Map<String, TagHandler> tagHandlers;

    MarkwonHtmlRendererImpl(boolean z, Map<String, TagHandler> map) {
        this.allowNonClosedTags = z;
        this.tagHandlers = map;
    }

    @Override // io.noties.markwon.html.MarkwonHtmlRenderer
    public void render(final MarkwonVisitor markwonVisitor, MarkwonHtmlParser markwonHtmlParser) {
        int length = !this.allowNonClosedTags ? -1 : markwonVisitor.length();
        markwonHtmlParser.flushInlineTags(length, new MarkwonHtmlParser.FlushAction<HtmlTag.Inline>() { // from class: io.noties.markwon.html.MarkwonHtmlRendererImpl.1
            @Override // io.noties.markwon.html.MarkwonHtmlParser.FlushAction
            public void apply(List<HtmlTag.Inline> list) {
                TagHandler tagHandler;
                for (HtmlTag.Inline inline : list) {
                    if (inline.isClosed() && (tagHandler = MarkwonHtmlRendererImpl.this.tagHandler(inline.name())) != null) {
                        tagHandler.handle(markwonVisitor, MarkwonHtmlRendererImpl.this, inline);
                    }
                }
            }
        });
        markwonHtmlParser.flushBlockTags(length, new MarkwonHtmlParser.FlushAction<HtmlTag.Block>() { // from class: io.noties.markwon.html.MarkwonHtmlRendererImpl.2
            @Override // io.noties.markwon.html.MarkwonHtmlParser.FlushAction
            public void apply(List<HtmlTag.Block> list) {
                for (HtmlTag.Block block : list) {
                    if (block.isClosed()) {
                        TagHandler tagHandler = MarkwonHtmlRendererImpl.this.tagHandler(block.name());
                        if (tagHandler != null) {
                            tagHandler.handle(markwonVisitor, MarkwonHtmlRendererImpl.this, block);
                        } else {
                            apply(block.children());
                        }
                    }
                }
            }
        });
        markwonHtmlParser.reset();
    }

    @Override // io.noties.markwon.html.MarkwonHtmlRenderer
    public TagHandler tagHandler(String str) {
        return this.tagHandlers.get(str);
    }

    /* loaded from: classes2.dex */
    static class Builder {
        private boolean allowNonClosedTags;
        private boolean excludeDefaults;
        private boolean isBuilt;
        private final Map<String, TagHandler> tagHandlers = new HashMap(2);

        public void allowNonClosedTags(boolean z) {
            checkState();
            this.allowNonClosedTags = z;
        }

        public void addHandler(TagHandler tagHandler) {
            checkState();
            for (String str : tagHandler.supportedTags()) {
                this.tagHandlers.put(str, tagHandler);
            }
        }

        public TagHandler getHandler(String str) {
            checkState();
            return this.tagHandlers.get(str);
        }

        public void excludeDefaults(boolean z) {
            checkState();
            this.excludeDefaults = z;
        }

        public boolean excludeDefaults() {
            return this.excludeDefaults;
        }

        public MarkwonHtmlRenderer build() {
            checkState();
            this.isBuilt = true;
            if (this.tagHandlers.size() > 0) {
                return new MarkwonHtmlRendererImpl(this.allowNonClosedTags, Collections.unmodifiableMap(this.tagHandlers));
            }
            return new MarkwonHtmlRendererNoOp();
        }

        private void checkState() {
            if (!this.isBuilt) {
                return;
            }
            throw new IllegalStateException("Builder has been already built");
        }

        public void addDefaultTagHandler(TagHandler tagHandler) {
            for (String str : tagHandler.supportedTags()) {
                if (!this.tagHandlers.containsKey(str)) {
                    this.tagHandlers.put(str, tagHandler);
                }
            }
        }
    }
}
