package org.opendatakit.httpclientandroidlib.impl.entity;

import org.opendatakit.httpclientandroidlib.HttpException;
import org.opendatakit.httpclientandroidlib.HttpMessage;
import org.opendatakit.httpclientandroidlib.ProtocolException;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.entity.ContentLengthStrategy;
@Immutable
/* loaded from: classes.dex */
public class DisallowIdentityContentLengthStrategy implements ContentLengthStrategy {
    private final ContentLengthStrategy contentLengthStrategy;

    public DisallowIdentityContentLengthStrategy(ContentLengthStrategy contentLengthStrategy) {
        this.contentLengthStrategy = contentLengthStrategy;
    }

    @Override // org.opendatakit.httpclientandroidlib.entity.ContentLengthStrategy
    public long determineLength(HttpMessage message) throws HttpException {
        long result = this.contentLengthStrategy.determineLength(message);
        if (result == -1) {
            throw new ProtocolException("Identity transfer encoding cannot be used");
        }
        return result;
    }
}
