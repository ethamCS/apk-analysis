package org.opendatakit.httpclientandroidlib.impl.auth;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.opendatakit.httpclientandroidlib.HeaderElement;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.auth.ChallengeState;
import org.opendatakit.httpclientandroidlib.auth.MalformedChallengeException;
import org.opendatakit.httpclientandroidlib.message.BasicHeaderValueParser;
import org.opendatakit.httpclientandroidlib.message.HeaderValueParser;
import org.opendatakit.httpclientandroidlib.message.ParserCursor;
import org.opendatakit.httpclientandroidlib.util.CharArrayBuffer;
@NotThreadSafe
/* loaded from: classes.dex */
public abstract class RFC2617Scheme extends AuthSchemeBase {
    private final Map<String, String> params;

    public RFC2617Scheme(ChallengeState challengeState) {
        super(challengeState);
        this.params = new HashMap();
    }

    public RFC2617Scheme() {
        this(null);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.auth.AuthSchemeBase
    protected void parseChallenge(CharArrayBuffer buffer, int pos, int len) throws MalformedChallengeException {
        HeaderValueParser parser = BasicHeaderValueParser.DEFAULT;
        ParserCursor cursor = new ParserCursor(pos, buffer.length());
        HeaderElement[] elements = parser.parseElements(buffer, cursor);
        if (elements.length == 0) {
            throw new MalformedChallengeException("Authentication challenge is empty");
        }
        this.params.clear();
        for (HeaderElement element : elements) {
            this.params.put(element.getName(), element.getValue());
        }
    }

    public Map<String, String> getParameters() {
        return this.params;
    }

    @Override // org.opendatakit.httpclientandroidlib.auth.AuthScheme
    public String getParameter(String name) {
        if (name == null) {
            return null;
        }
        return this.params.get(name.toLowerCase(Locale.ENGLISH));
    }

    @Override // org.opendatakit.httpclientandroidlib.auth.AuthScheme
    public String getRealm() {
        return getParameter("realm");
    }
}
