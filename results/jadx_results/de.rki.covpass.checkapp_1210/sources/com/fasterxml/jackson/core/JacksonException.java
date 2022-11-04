package com.fasterxml.jackson.core;

import java.io.IOException;
/* loaded from: classes.dex */
public abstract class JacksonException extends IOException {
    public JacksonException(String str) {
        super(str);
    }

    public JacksonException(String str, Throwable th2) {
        super(str, th2);
    }

    public abstract JsonLocation getLocation();

    public abstract String getOriginalMessage();

    public abstract Object getProcessor();
}
