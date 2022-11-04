package org.commonmark.internal.renderer;

import java.util.HashMap;
import java.util.Map;
import org.commonmark.node.Node;
import org.commonmark.renderer.NodeRenderer;
/* loaded from: classes2.dex */
public class NodeRendererMap {
    private final Map<Class<? extends Node>, NodeRenderer> renderers = new HashMap(32);

    public void add(NodeRenderer nodeRenderer) {
        for (Class<? extends Node> cls : nodeRenderer.getNodeTypes()) {
            this.renderers.put(cls, nodeRenderer);
        }
    }

    public void render(Node node) {
        NodeRenderer nodeRenderer = this.renderers.get(node.getClass());
        if (nodeRenderer != null) {
            nodeRenderer.render(node);
        }
    }
}
