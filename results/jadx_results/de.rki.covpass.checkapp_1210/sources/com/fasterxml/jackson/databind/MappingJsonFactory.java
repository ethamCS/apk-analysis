package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
/* loaded from: classes.dex */
public class MappingJsonFactory extends JsonFactory {
    public MappingJsonFactory(ObjectMapper objectMapper) {
        super(objectMapper);
        if (objectMapper == null) {
            setCodec(new ObjectMapper(this));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public final ObjectMapper getCodec() {
        return (ObjectMapper) this._objectCodec;
    }
}
