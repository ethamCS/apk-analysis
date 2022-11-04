package org.opendatakit.httpclientandroidlib.impl.io;

import java.io.IOException;
import org.kxml2.wap.Wbxml;
import org.opendatakit.httpclientandroidlib.HttpException;
import org.opendatakit.httpclientandroidlib.HttpMessage;
import org.opendatakit.httpclientandroidlib.HttpResponseFactory;
import org.opendatakit.httpclientandroidlib.NoHttpResponseException;
import org.opendatakit.httpclientandroidlib.ParseException;
import org.opendatakit.httpclientandroidlib.StatusLine;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.io.SessionInputBuffer;
import org.opendatakit.httpclientandroidlib.message.LineParser;
import org.opendatakit.httpclientandroidlib.message.ParserCursor;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
import org.opendatakit.httpclientandroidlib.util.CharArrayBuffer;
@NotThreadSafe
@Deprecated
/* loaded from: classes.dex */
public class HttpResponseParser extends AbstractMessageParser<HttpMessage> {
    private final CharArrayBuffer lineBuf;
    private final HttpResponseFactory responseFactory;

    public HttpResponseParser(SessionInputBuffer buffer, LineParser parser, HttpResponseFactory responseFactory, HttpParams params) {
        super(buffer, parser, params);
        if (responseFactory == null) {
            throw new IllegalArgumentException("Response factory may not be null");
        }
        this.responseFactory = responseFactory;
        this.lineBuf = new CharArrayBuffer(Wbxml.EXT_T_0);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.io.AbstractMessageParser
    protected HttpMessage parseHead(SessionInputBuffer sessionBuffer) throws IOException, HttpException, ParseException {
        this.lineBuf.clear();
        int i = sessionBuffer.readLine(this.lineBuf);
        if (i == -1) {
            throw new NoHttpResponseException("The target server failed to respond");
        }
        ParserCursor cursor = new ParserCursor(0, this.lineBuf.length());
        StatusLine statusline = this.lineParser.parseStatusLine(this.lineBuf, cursor);
        return this.responseFactory.newHttpResponse(statusline, null);
    }
}
