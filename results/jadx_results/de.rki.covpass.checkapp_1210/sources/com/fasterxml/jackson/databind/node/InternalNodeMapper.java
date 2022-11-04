package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.IOException;
/* loaded from: classes.dex */
final class InternalNodeMapper {
    private static final JsonMapper JSON_MAPPER;
    private static final ObjectReader NODE_READER;
    private static final ObjectWriter PRETTY_WRITER;
    private static final ObjectWriter STD_WRITER;

    static {
        JsonMapper jsonMapper = new JsonMapper();
        JSON_MAPPER = jsonMapper;
        STD_WRITER = jsonMapper.writer();
        PRETTY_WRITER = jsonMapper.writer().withDefaultPrettyPrinter();
        NODE_READER = jsonMapper.readerFor(JsonNode.class);
    }

    public static String nodeToPrettyString(JsonNode jsonNode) {
        try {
            return PRETTY_WRITER.writeValueAsString(jsonNode);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String nodeToString(JsonNode jsonNode) {
        try {
            return STD_WRITER.writeValueAsString(jsonNode);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
