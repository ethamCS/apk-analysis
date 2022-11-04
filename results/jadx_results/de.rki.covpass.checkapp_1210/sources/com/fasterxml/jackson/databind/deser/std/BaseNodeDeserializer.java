package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.RawValue;
import java.util.Arrays;
/* loaded from: classes.dex */
abstract class BaseNodeDeserializer<T extends JsonNode> extends StdDeserializer<T> {
    protected final Boolean _supportsUpdates;

    /* loaded from: classes.dex */
    public static final class ContainerStack {
        private int _end;
        private ContainerNode[] _stack;
        private int _top;

        public ContainerNode popOrNull() {
            int i10 = this._top;
            if (i10 == 0) {
                return null;
            }
            ContainerNode[] containerNodeArr = this._stack;
            int i11 = i10 - 1;
            this._top = i11;
            return containerNodeArr[i11];
        }

        public void push(ContainerNode containerNode) {
            int i10 = this._top;
            int i11 = this._end;
            if (i10 < i11) {
                ContainerNode[] containerNodeArr = this._stack;
                this._top = i10 + 1;
                containerNodeArr[i10] = containerNode;
                return;
            }
            if (this._stack == null) {
                this._end = 10;
                this._stack = new ContainerNode[10];
            } else {
                int min = i11 + Math.min(4000, Math.max(20, i11 >> 1));
                this._end = min;
                this._stack = (ContainerNode[]) Arrays.copyOf(this._stack, min);
            }
            ContainerNode[] containerNodeArr2 = this._stack;
            int i12 = this._top;
            this._top = i12 + 1;
            containerNodeArr2[i12] = containerNode;
        }
    }

    public BaseNodeDeserializer(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this._supportsUpdates = bool;
    }

    public final JsonNode _deserializeAnyScalar(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        int currentTokenId = jsonParser.currentTokenId();
        if (currentTokenId != 2) {
            switch (currentTokenId) {
                case 6:
                    return nodeFactory.textNode(jsonParser.getText());
                case 7:
                    return _fromInt(jsonParser, deserializationContext, nodeFactory);
                case 8:
                    return _fromFloat(jsonParser, deserializationContext, nodeFactory);
                case 9:
                    return nodeFactory.booleanNode(true);
                case 10:
                    return nodeFactory.booleanNode(false);
                case 11:
                    return nodeFactory.nullNode();
                case 12:
                    return _fromEmbedded(jsonParser, deserializationContext);
                default:
                    return (JsonNode) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            }
        }
        return nodeFactory.objectNode();
    }

    public final ContainerNode<?> _deserializeContainerNoRecursion(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, ContainerStack containerStack, ContainerNode<?> containerNode) {
        JsonNode textNode;
        JsonNode booleanNode;
        ObjectNode objectNode;
        JsonNode textNode2;
        ObjectNode objectNode2;
        int deserializationFeatures = deserializationContext.getDeserializationFeatures() & StdDeserializer.F_MASK_INT_COERCIONS;
        ContainerNode<?> containerNode2 = containerNode;
        do {
            boolean z10 = true;
            if (containerNode2 instanceof ObjectNode) {
                ContainerNode<?> containerNode3 = containerNode2;
                ObjectNode objectNode3 = (ObjectNode) containerNode2;
                String nextFieldName = jsonParser.nextFieldName();
                while (nextFieldName != null) {
                    JsonToken nextToken = jsonParser.nextToken();
                    if (nextToken == null) {
                        nextToken = JsonToken.NOT_AVAILABLE;
                    }
                    int id2 = nextToken.id();
                    if (id2 == z10) {
                        ObjectNode objectNode4 = objectNode3;
                        ObjectNode objectNode5 = jsonNodeFactory.objectNode();
                        JsonNode replace = objectNode4.replace(nextFieldName, objectNode5);
                        if (replace != null) {
                            objectNode = objectNode5;
                            _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, nextFieldName, objectNode4, replace, objectNode5);
                        } else {
                            objectNode = objectNode5;
                        }
                        containerStack.push(containerNode3);
                        objectNode3 = objectNode;
                        containerNode3 = objectNode3;
                    } else if (id2 != 3) {
                        switch (id2) {
                            case 6:
                                textNode2 = jsonNodeFactory.textNode(jsonParser.getText());
                                break;
                            case 7:
                                textNode2 = _fromInt(jsonParser, deserializationFeatures, jsonNodeFactory);
                                break;
                            case 8:
                                textNode2 = _fromFloat(jsonParser, deserializationContext, jsonNodeFactory);
                                break;
                            case 9:
                                textNode2 = jsonNodeFactory.booleanNode(z10);
                                break;
                            case 10:
                                textNode2 = jsonNodeFactory.booleanNode(false);
                                break;
                            case 11:
                                textNode2 = jsonNodeFactory.nullNode();
                                break;
                            default:
                                textNode2 = _deserializeRareScalar(jsonParser, deserializationContext);
                                break;
                        }
                        JsonNode jsonNode = textNode2;
                        JsonNode replace2 = objectNode3.replace(nextFieldName, jsonNode);
                        if (replace2 != null) {
                            objectNode2 = objectNode3;
                            _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, nextFieldName, objectNode3, replace2, jsonNode);
                        } else {
                            objectNode2 = objectNode3;
                        }
                        objectNode3 = objectNode2;
                    } else {
                        ObjectNode objectNode6 = objectNode3;
                        ArrayNode arrayNode = jsonNodeFactory.arrayNode();
                        JsonNode replace3 = objectNode6.replace(nextFieldName, arrayNode);
                        if (replace3 != null) {
                            _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, nextFieldName, objectNode6, replace3, arrayNode);
                        }
                        containerStack.push(containerNode3);
                        containerNode2 = arrayNode;
                        continue;
                    }
                    nextFieldName = jsonParser.nextFieldName();
                    z10 = true;
                }
                containerNode2 = containerStack.popOrNull();
                continue;
            } else {
                ArrayNode arrayNode2 = (ArrayNode) containerNode2;
                while (true) {
                    JsonToken nextToken2 = jsonParser.nextToken();
                    if (nextToken2 == null) {
                        nextToken2 = JsonToken.NOT_AVAILABLE;
                    }
                    switch (nextToken2.id()) {
                        case 1:
                            containerStack.push(containerNode2);
                            containerNode2 = jsonNodeFactory.objectNode();
                            break;
                        case 2:
                        case 5:
                        default:
                            textNode = _deserializeRareScalar(jsonParser, deserializationContext);
                            arrayNode2.add(textNode);
                        case 3:
                            containerStack.push(containerNode2);
                            containerNode2 = jsonNodeFactory.arrayNode();
                            break;
                        case 4:
                            break;
                        case 6:
                            textNode = jsonNodeFactory.textNode(jsonParser.getText());
                            arrayNode2.add(textNode);
                        case 7:
                            textNode = _fromInt(jsonParser, deserializationFeatures, jsonNodeFactory);
                            arrayNode2.add(textNode);
                        case 8:
                            textNode = _fromFloat(jsonParser, deserializationContext, jsonNodeFactory);
                            arrayNode2.add(textNode);
                        case 9:
                            textNode = jsonNodeFactory.booleanNode(true);
                            arrayNode2.add(textNode);
                        case 10:
                            booleanNode = jsonNodeFactory.booleanNode(false);
                            arrayNode2.add(booleanNode);
                        case 11:
                            booleanNode = jsonNodeFactory.nullNode();
                            arrayNode2.add(booleanNode);
                    }
                }
                arrayNode2.add(containerNode2);
                continue;
            }
        } while (containerNode2 != null);
        return containerNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.node.ObjectNode _deserializeObjectAtName(com.fasterxml.jackson.core.JsonParser r16, com.fasterxml.jackson.databind.DeserializationContext r17, com.fasterxml.jackson.databind.node.JsonNodeFactory r18, com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.ContainerStack r19) {
        /*
            r15 = this;
            com.fasterxml.jackson.databind.node.ObjectNode r8 = r18.objectNode()
            java.lang.String r0 = r16.currentName()
            r4 = r0
        L9:
            if (r4 == 0) goto L4f
            com.fasterxml.jackson.core.JsonToken r0 = r16.nextToken()
            if (r0 != 0) goto L13
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
        L13:
            int r0 = r0.id()
            r1 = 1
            if (r0 == r1) goto L27
            r1 = 3
            if (r0 == r1) goto L22
            com.fasterxml.jackson.databind.JsonNode r0 = r15._deserializeAnyScalar(r16, r17)
            goto L38
        L22:
            com.fasterxml.jackson.databind.node.ArrayNode r14 = r18.arrayNode()
            goto L2b
        L27:
            com.fasterxml.jackson.databind.node.ObjectNode r14 = r18.objectNode()
        L2b:
            r9 = r15
            r10 = r16
            r11 = r17
            r12 = r18
            r13 = r19
            com.fasterxml.jackson.databind.node.ContainerNode r0 = r9._deserializeContainerNoRecursion(r10, r11, r12, r13, r14)
        L38:
            r7 = r0
            com.fasterxml.jackson.databind.JsonNode r6 = r8.replace(r4, r7)
            if (r6 == 0) goto L4a
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r8
            r0._handleDuplicateField(r1, r2, r3, r4, r5, r6, r7)
        L4a:
            java.lang.String r4 = r16.nextFieldName()
            goto L9
        L4f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer._deserializeObjectAtName(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.node.JsonNodeFactory, com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer$ContainerStack):com.fasterxml.jackson.databind.node.ObjectNode");
    }

    protected final JsonNode _deserializeRareScalar(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int currentTokenId = jsonParser.currentTokenId();
        return currentTokenId != 2 ? currentTokenId != 8 ? currentTokenId != 12 ? (JsonNode) deserializationContext.handleUnexpectedToken(handledType(), jsonParser) : _fromEmbedded(jsonParser, deserializationContext) : _fromFloat(jsonParser, deserializationContext, deserializationContext.getNodeFactory()) : deserializationContext.getNodeFactory().objectNode();
    }

    protected final JsonNode _fromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        Object embeddedObject = jsonParser.getEmbeddedObject();
        return embeddedObject == null ? nodeFactory.nullNode() : embeddedObject.getClass() == byte[].class ? nodeFactory.binaryNode((byte[]) embeddedObject) : embeddedObject instanceof RawValue ? nodeFactory.rawValueNode((RawValue) embeddedObject) : embeddedObject instanceof JsonNode ? (JsonNode) embeddedObject : nodeFactory.pojoNode(embeddedObject);
    }

    protected final JsonNode _fromFloat(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        return numberType == JsonParser.NumberType.BIG_DECIMAL ? jsonNodeFactory.numberNode(jsonParser.getDecimalValue()) : deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.isNaN() ? jsonNodeFactory.numberNode(jsonParser.getDoubleValue()) : jsonNodeFactory.numberNode(jsonParser.getDecimalValue()) : numberType == JsonParser.NumberType.FLOAT ? jsonNodeFactory.numberNode(jsonParser.getFloatValue()) : jsonNodeFactory.numberNode(jsonParser.getDoubleValue());
    }

    protected final JsonNode _fromInt(JsonParser jsonParser, int i10, JsonNodeFactory jsonNodeFactory) {
        if (i10 != 0) {
            return DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(i10) ? jsonNodeFactory.numberNode(jsonParser.getBigIntegerValue()) : jsonNodeFactory.numberNode(jsonParser.getLongValue());
        }
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        return numberType == JsonParser.NumberType.INT ? jsonNodeFactory.numberNode(jsonParser.getIntValue()) : numberType == JsonParser.NumberType.LONG ? jsonNodeFactory.numberNode(jsonParser.getLongValue()) : jsonNodeFactory.numberNode(jsonParser.getBigIntegerValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.fasterxml.jackson.databind.JsonNode _fromInt(com.fasterxml.jackson.core.JsonParser r2, com.fasterxml.jackson.databind.DeserializationContext r3, com.fasterxml.jackson.databind.node.JsonNodeFactory r4) {
        /*
            r1 = this;
            int r3 = r3.getDeserializationFeatures()
            int r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.F_MASK_INT_COERCIONS
            r0 = r0 & r3
            if (r0 == 0) goto L1f
            com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_INTEGER_FOR_INTS
            boolean r0 = r0.enabledIn(r3)
            if (r0 == 0) goto L14
            com.fasterxml.jackson.core.JsonParser$NumberType r3 = com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER
            goto L23
        L14:
            com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.USE_LONG_FOR_INTS
            boolean r3 = r0.enabledIn(r3)
            if (r3 == 0) goto L1f
            com.fasterxml.jackson.core.JsonParser$NumberType r3 = com.fasterxml.jackson.core.JsonParser.NumberType.LONG
            goto L23
        L1f:
            com.fasterxml.jackson.core.JsonParser$NumberType r3 = r2.getNumberType()
        L23:
            com.fasterxml.jackson.core.JsonParser$NumberType r0 = com.fasterxml.jackson.core.JsonParser.NumberType.INT
            if (r3 != r0) goto L30
            int r2 = r2.getIntValue()
            com.fasterxml.jackson.databind.node.NumericNode r2 = r4.numberNode(r2)
            return r2
        L30:
            com.fasterxml.jackson.core.JsonParser$NumberType r0 = com.fasterxml.jackson.core.JsonParser.NumberType.LONG
            if (r3 != r0) goto L3d
            long r2 = r2.getLongValue()
            com.fasterxml.jackson.databind.node.NumericNode r2 = r4.numberNode(r2)
            return r2
        L3d:
            java.math.BigInteger r2 = r2.getBigIntegerValue()
            com.fasterxml.jackson.databind.node.ValueNode r2 = r4.numberNode(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer._fromInt(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.node.JsonNodeFactory):com.fasterxml.jackson.databind.JsonNode");
    }

    protected void _handleDuplicateField(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, String str, ObjectNode objectNode, JsonNode jsonNode, JsonNode jsonNode2) {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            deserializationContext.reportInputMismatch(JsonNode.class, "Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str);
        }
        if (deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)) {
            if (jsonNode.isArray()) {
                ((ArrayNode) jsonNode).add(jsonNode2);
                objectNode.replace(str, jsonNode);
                return;
            }
            ArrayNode arrayNode = jsonNodeFactory.arrayNode();
            arrayNode.add(jsonNode);
            arrayNode.add(jsonNode2);
            objectNode.replace(str, arrayNode);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._supportsUpdates;
    }

    public final JsonNode updateObject(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode, ContainerStack containerStack) {
        String str;
        JsonNode jsonNode;
        ContainerNode<?> containerNode;
        if (jsonParser.isExpectedStartObjectToken()) {
            str = jsonParser.nextFieldName();
        } else if (!jsonParser.hasToken(JsonToken.FIELD_NAME)) {
            return (JsonNode) deserialize(jsonParser, deserializationContext);
        } else {
            str = jsonParser.currentName();
        }
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        while (str != null) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonNode jsonNode2 = objectNode.get(str);
            if (jsonNode2 != null) {
                if (jsonNode2 instanceof ObjectNode) {
                    if (nextToken == JsonToken.START_OBJECT) {
                        jsonNode = updateObject(jsonParser, deserializationContext, (ObjectNode) jsonNode2, containerStack);
                        if (jsonNode == jsonNode2) {
                            str = jsonParser.nextFieldName();
                        }
                    }
                } else if ((jsonNode2 instanceof ArrayNode) && nextToken == JsonToken.START_ARRAY) {
                    _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, containerStack, (ArrayNode) jsonNode2);
                    str = jsonParser.nextFieldName();
                }
                objectNode.set(str, jsonNode);
                str = jsonParser.nextFieldName();
            }
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            int id2 = nextToken.id();
            if (id2 == 1) {
                containerNode = nodeFactory.objectNode();
            } else if (id2 != 3) {
                if (id2 == 6) {
                    jsonNode = nodeFactory.textNode(jsonParser.getText());
                } else if (id2 != 7) {
                    switch (id2) {
                        case 9:
                            jsonNode = nodeFactory.booleanNode(true);
                            break;
                        case 10:
                            jsonNode = nodeFactory.booleanNode(false);
                            break;
                        case 11:
                            jsonNode = nodeFactory.nullNode();
                            break;
                        default:
                            jsonNode = _deserializeRareScalar(jsonParser, deserializationContext);
                            break;
                    }
                } else {
                    jsonNode = _fromInt(jsonParser, deserializationContext, nodeFactory);
                }
                objectNode.set(str, jsonNode);
                str = jsonParser.nextFieldName();
            } else {
                containerNode = nodeFactory.arrayNode();
            }
            jsonNode = _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, containerStack, containerNode);
            objectNode.set(str, jsonNode);
            str = jsonParser.nextFieldName();
        }
        return objectNode;
    }
}
