package org.commonmark.renderer.text;

import java.util.ArrayList;
import java.util.List;
import org.commonmark.Extension;
import org.commonmark.internal.renderer.NodeRendererMap;
import org.commonmark.node.Node;
import org.commonmark.renderer.NodeRenderer;
import org.commonmark.renderer.Renderer;
/* loaded from: classes2.dex */
public class TextContentRenderer implements Renderer {
    private final List<TextContentNodeRendererFactory> nodeRendererFactories;
    private final boolean stripNewlines;

    /* loaded from: classes2.dex */
    public interface TextContentRendererExtension extends Extension {
        void extend(Builder builder);
    }

    private TextContentRenderer(Builder builder) {
        this.stripNewlines = builder.stripNewlines;
        ArrayList arrayList = new ArrayList(builder.nodeRendererFactories.size() + 1);
        this.nodeRendererFactories = arrayList;
        arrayList.addAll(builder.nodeRendererFactories);
        arrayList.add(new TextContentNodeRendererFactory() { // from class: org.commonmark.renderer.text.TextContentRenderer.1
            @Override // org.commonmark.renderer.text.TextContentNodeRendererFactory
            public NodeRenderer create(TextContentNodeRendererContext textContentNodeRendererContext) {
                return new CoreTextContentNodeRenderer(textContentNodeRendererContext);
            }
        });
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // org.commonmark.renderer.Renderer
    public void render(Node node, Appendable appendable) {
        new RendererContext(new TextContentWriter(appendable)).render(node);
    }

    @Override // org.commonmark.renderer.Renderer
    public String render(Node node) {
        StringBuilder sb = new StringBuilder();
        render(node, sb);
        return sb.toString();
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        private boolean stripNewlines = false;
        private List<TextContentNodeRendererFactory> nodeRendererFactories = new ArrayList();

        public TextContentRenderer build() {
            return new TextContentRenderer(this);
        }

        public Builder stripNewlines(boolean z) {
            this.stripNewlines = z;
            return this;
        }

        public Builder nodeRendererFactory(TextContentNodeRendererFactory textContentNodeRendererFactory) {
            this.nodeRendererFactories.add(textContentNodeRendererFactory);
            return this;
        }

        public Builder extensions(Iterable<? extends Extension> iterable) {
            for (Extension extension : iterable) {
                if (extension instanceof TextContentRendererExtension) {
                    ((TextContentRendererExtension) extension).extend(this);
                }
            }
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public class RendererContext implements TextContentNodeRendererContext {
        private final NodeRendererMap nodeRendererMap;
        private final TextContentWriter textContentWriter;

        private RendererContext(TextContentWriter textContentWriter) {
            TextContentRenderer.this = r3;
            this.nodeRendererMap = new NodeRendererMap();
            this.textContentWriter = textContentWriter;
            for (int size = r3.nodeRendererFactories.size() - 1; size >= 0; size--) {
                this.nodeRendererMap.add(((TextContentNodeRendererFactory) r3.nodeRendererFactories.get(size)).create(this));
            }
        }

        @Override // org.commonmark.renderer.text.TextContentNodeRendererContext
        public boolean stripNewlines() {
            return TextContentRenderer.this.stripNewlines;
        }

        @Override // org.commonmark.renderer.text.TextContentNodeRendererContext
        public TextContentWriter getWriter() {
            return this.textContentWriter;
        }

        @Override // org.commonmark.renderer.text.TextContentNodeRendererContext
        public void render(Node node) {
            this.nodeRendererMap.render(node);
        }
    }
}
