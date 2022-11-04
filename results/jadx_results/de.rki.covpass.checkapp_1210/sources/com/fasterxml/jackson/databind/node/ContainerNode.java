package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.node.ContainerNode;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public abstract class ContainerNode<T extends ContainerNode<T>> extends BaseJsonNode {
    protected final JsonNodeFactory _nodeFactory;

    protected ContainerNode() {
        this._nodeFactory = null;
    }

    public ContainerNode(JsonNodeFactory jsonNodeFactory) {
        this._nodeFactory = jsonNodeFactory;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return BuildConfig.FLAVOR;
    }

    public final NullNode nullNode() {
        return this._nodeFactory.nullNode();
    }
}
