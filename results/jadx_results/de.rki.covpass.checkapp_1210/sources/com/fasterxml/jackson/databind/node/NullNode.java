package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
/* loaded from: classes.dex */
public class NullNode extends ValueNode {
    public static final NullNode instance = new NullNode();

    protected NullNode() {
    }

    public static NullNode getInstance() {
        return instance;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return "null";
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode
    public JsonToken asToken() {
        return JsonToken.VALUE_NULL;
    }

    public boolean equals(Object obj) {
        return obj == this || (obj instanceof NullNode);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.NULL;
    }

    public int hashCode() {
        return JsonNodeType.NULL.ordinal();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serializerProvider.defaultSerializeNull(jsonGenerator);
    }
}
