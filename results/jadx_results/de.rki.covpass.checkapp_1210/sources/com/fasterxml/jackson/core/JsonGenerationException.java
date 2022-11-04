package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamWriteException;
/* loaded from: classes.dex */
public class JsonGenerationException extends StreamWriteException {
    public JsonGenerationException(String str, JsonGenerator jsonGenerator) {
        super(str, jsonGenerator);
        this._processor = jsonGenerator;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public JsonGenerator getProcessor() {
        return this._processor;
    }
}
