package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
/* loaded from: classes.dex */
public class InputCoercionException extends StreamReadException {
    protected final JsonToken _inputType;
    protected final Class<?> _targetType;

    public InputCoercionException(JsonParser jsonParser, String str, JsonToken jsonToken, Class<?> cls) {
        super(jsonParser, str);
        this._inputType = jsonToken;
        this._targetType = cls;
    }
}
