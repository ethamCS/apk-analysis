package org.apache.james.mime4j.field;

import org.apache.james.mime4j.MimeException;
/* loaded from: classes.dex */
public class ParseException extends MimeException {
    private static final long serialVersionUID = 1;

    public ParseException(String message) {
        super(message);
    }

    public ParseException(Throwable cause) {
        super(cause);
    }

    protected ParseException(String message, Throwable cause) {
        super(message, cause);
    }
}
