package org.commonmark.ext.gfm.strikethrough.internal;

import java.util.Collections;
import java.util.Set;
import org.commonmark.node.Node;
import org.commonmark.renderer.html.HtmlNodeRendererContext;
import org.commonmark.renderer.html.HtmlWriter;
/* loaded from: classes2.dex */
public class StrikethroughHtmlNodeRenderer extends StrikethroughNodeRenderer {
    private final HtmlNodeRendererContext context;
    private final HtmlWriter html;

    @Override // org.commonmark.ext.gfm.strikethrough.internal.StrikethroughNodeRenderer, org.commonmark.renderer.NodeRenderer
    public /* bridge */ /* synthetic */ Set getNodeTypes() {
        return super.getNodeTypes();
    }

    public StrikethroughHtmlNodeRenderer(HtmlNodeRendererContext htmlNodeRendererContext) {
        this.context = htmlNodeRendererContext;
        this.html = htmlNodeRendererContext.getWriter();
    }

    @Override // org.commonmark.renderer.NodeRenderer
    public void render(Node node) {
        this.html.tag("del", this.context.extendAttributes(node, "del", Collections.emptyMap()));
        renderChildren(node);
        this.html.tag("/del");
    }

    private void renderChildren(Node node) {
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            Node next = firstChild.getNext();
            this.context.render(firstChild);
            firstChild = next;
        }
    }
}
