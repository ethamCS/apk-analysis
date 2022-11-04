package org.commonmark.renderer.html;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.commonmark.Extension;
import org.commonmark.internal.renderer.NodeRendererMap;
import org.commonmark.internal.util.Escaping;
import org.commonmark.node.Node;
import org.commonmark.renderer.NodeRenderer;
import org.commonmark.renderer.Renderer;
/* loaded from: classes2.dex */
public class HtmlRenderer implements Renderer {
    private final List<AttributeProviderFactory> attributeProviderFactories;
    private final boolean escapeHtml;
    private final List<HtmlNodeRendererFactory> nodeRendererFactories;
    private final boolean percentEncodeUrls;
    private final String softbreak;

    /* loaded from: classes2.dex */
    public interface HtmlRendererExtension extends Extension {
        void extend(Builder builder);
    }

    private HtmlRenderer(Builder builder) {
        this.softbreak = builder.softbreak;
        this.escapeHtml = builder.escapeHtml;
        this.percentEncodeUrls = builder.percentEncodeUrls;
        this.attributeProviderFactories = new ArrayList(builder.attributeProviderFactories);
        ArrayList arrayList = new ArrayList(builder.nodeRendererFactories.size() + 1);
        this.nodeRendererFactories = arrayList;
        arrayList.addAll(builder.nodeRendererFactories);
        arrayList.add(new HtmlNodeRendererFactory() { // from class: org.commonmark.renderer.html.HtmlRenderer.1
            @Override // org.commonmark.renderer.html.HtmlNodeRendererFactory
            public NodeRenderer create(HtmlNodeRendererContext htmlNodeRendererContext) {
                return new CoreHtmlNodeRenderer(htmlNodeRendererContext);
            }
        });
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // org.commonmark.renderer.Renderer
    public void render(Node node, Appendable appendable) {
        Objects.requireNonNull(node, "node must not be null");
        new RendererContext(new HtmlWriter(appendable)).render(node);
    }

    @Override // org.commonmark.renderer.Renderer
    public String render(Node node) {
        Objects.requireNonNull(node, "node must not be null");
        StringBuilder sb = new StringBuilder();
        render(node, sb);
        return sb.toString();
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        private String softbreak = "\n";
        private boolean escapeHtml = false;
        private boolean percentEncodeUrls = false;
        private List<AttributeProviderFactory> attributeProviderFactories = new ArrayList();
        private List<HtmlNodeRendererFactory> nodeRendererFactories = new ArrayList();

        public HtmlRenderer build() {
            return new HtmlRenderer(this);
        }

        public Builder softbreak(String str) {
            this.softbreak = str;
            return this;
        }

        public Builder escapeHtml(boolean z) {
            this.escapeHtml = z;
            return this;
        }

        public Builder percentEncodeUrls(boolean z) {
            this.percentEncodeUrls = z;
            return this;
        }

        public Builder attributeProviderFactory(AttributeProviderFactory attributeProviderFactory) {
            Objects.requireNonNull(attributeProviderFactory, "attributeProviderFactory must not be null");
            this.attributeProviderFactories.add(attributeProviderFactory);
            return this;
        }

        public Builder nodeRendererFactory(HtmlNodeRendererFactory htmlNodeRendererFactory) {
            Objects.requireNonNull(htmlNodeRendererFactory, "nodeRendererFactory must not be null");
            this.nodeRendererFactories.add(htmlNodeRendererFactory);
            return this;
        }

        public Builder extensions(Iterable<? extends Extension> iterable) {
            Objects.requireNonNull(iterable, "extensions must not be null");
            for (Extension extension : iterable) {
                if (extension instanceof HtmlRendererExtension) {
                    ((HtmlRendererExtension) extension).extend(this);
                }
            }
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public class RendererContext implements HtmlNodeRendererContext, AttributeProviderContext {
        private final List<AttributeProvider> attributeProviders;
        private final HtmlWriter htmlWriter;
        private final NodeRendererMap nodeRendererMap;

        private RendererContext(HtmlWriter htmlWriter) {
            HtmlRenderer.this = r3;
            this.nodeRendererMap = new NodeRendererMap();
            this.htmlWriter = htmlWriter;
            this.attributeProviders = new ArrayList(r3.attributeProviderFactories.size());
            for (AttributeProviderFactory attributeProviderFactory : r3.attributeProviderFactories) {
                this.attributeProviders.add(attributeProviderFactory.create(this));
            }
            for (int size = r3.nodeRendererFactories.size() - 1; size >= 0; size--) {
                this.nodeRendererMap.add(((HtmlNodeRendererFactory) r3.nodeRendererFactories.get(size)).create(this));
            }
        }

        @Override // org.commonmark.renderer.html.HtmlNodeRendererContext
        public boolean shouldEscapeHtml() {
            return HtmlRenderer.this.escapeHtml;
        }

        @Override // org.commonmark.renderer.html.HtmlNodeRendererContext
        public String encodeUrl(String str) {
            return HtmlRenderer.this.percentEncodeUrls ? Escaping.percentEncodeUrl(str) : str;
        }

        @Override // org.commonmark.renderer.html.HtmlNodeRendererContext
        public Map<String, String> extendAttributes(Node node, String str, Map<String, String> map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            setCustomAttributes(node, str, linkedHashMap);
            return linkedHashMap;
        }

        @Override // org.commonmark.renderer.html.HtmlNodeRendererContext
        public HtmlWriter getWriter() {
            return this.htmlWriter;
        }

        @Override // org.commonmark.renderer.html.HtmlNodeRendererContext
        public String getSoftbreak() {
            return HtmlRenderer.this.softbreak;
        }

        @Override // org.commonmark.renderer.html.HtmlNodeRendererContext
        public void render(Node node) {
            this.nodeRendererMap.render(node);
        }

        private void setCustomAttributes(Node node, String str, Map<String, String> map) {
            for (AttributeProvider attributeProvider : this.attributeProviders) {
                attributeProvider.setAttributes(node, str, map);
            }
        }
    }
}
