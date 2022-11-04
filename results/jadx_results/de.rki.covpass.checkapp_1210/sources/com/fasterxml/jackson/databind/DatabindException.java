package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;
/* loaded from: classes.dex */
public abstract class DatabindException extends JsonProcessingException {
    public DatabindException(String str) {
        super(str);
    }

    public DatabindException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, null);
    }

    protected DatabindException(String str, JsonLocation jsonLocation, Throwable th2) {
        super(str, jsonLocation, th2);
    }

    public DatabindException(String str, Throwable th2) {
        this(str, null, th2);
    }

    public abstract void prependPath(Object obj, String str);
}
