package org.opendatakit.httpclientandroidlib.cookie;

import org.opendatakit.httpclientandroidlib.annotation.Immutable;
@Immutable
/* loaded from: classes.dex */
public class CookieRestrictionViolationException extends MalformedCookieException {
    private static final long serialVersionUID = 7371235577078589013L;

    public CookieRestrictionViolationException() {
    }

    public CookieRestrictionViolationException(String message) {
        super(message);
    }
}
