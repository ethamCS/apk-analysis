package org.opendatakit.httpclientandroidlib.impl.conn;

import org.kxml2.wap.Wbxml;
import org.opendatakit.httpclientandroidlib.HttpMessage;
import org.opendatakit.httpclientandroidlib.HttpResponseFactory;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.conn.params.ConnConnectionPNames;
import org.opendatakit.httpclientandroidlib.impl.io.AbstractMessageParser;
import org.opendatakit.httpclientandroidlib.io.SessionInputBuffer;
import org.opendatakit.httpclientandroidlib.message.LineParser;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
import org.opendatakit.httpclientandroidlib.util.CharArrayBuffer;
@ThreadSafe
/* loaded from: classes.dex */
public class DefaultResponseParser extends AbstractMessageParser<HttpMessage> {
    private final CharArrayBuffer lineBuf;
    private final Log log = LogFactory.getLog(getClass());
    private final int maxGarbageLines;
    private final HttpResponseFactory responseFactory;

    public DefaultResponseParser(SessionInputBuffer buffer, LineParser parser, HttpResponseFactory responseFactory, HttpParams params) {
        super(buffer, parser, params);
        if (responseFactory == null) {
            throw new IllegalArgumentException("Response factory may not be null");
        }
        this.responseFactory = responseFactory;
        this.lineBuf = new CharArrayBuffer(Wbxml.EXT_T_0);
        this.maxGarbageLines = getMaxGarbageLines(params);
    }

    protected int getMaxGarbageLines(HttpParams params) {
        return params.getIntParameter(ConnConnectionPNames.MAX_STATUS_LINE_GARBAGE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        throw new org.opendatakit.httpclientandroidlib.ProtocolException("The server failed to respond with a valid HTTP response");
     */
    @Override // org.opendatakit.httpclientandroidlib.impl.io.AbstractMessageParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected org.opendatakit.httpclientandroidlib.HttpMessage parseHead(org.opendatakit.httpclientandroidlib.io.SessionInputBuffer r9) throws java.io.IOException, org.opendatakit.httpclientandroidlib.HttpException {
        /*
            r8 = this;
            r7 = -1
            r0 = 0
            r1 = 0
        L3:
            org.opendatakit.httpclientandroidlib.util.CharArrayBuffer r4 = r8.lineBuf
            r4.clear()
            org.opendatakit.httpclientandroidlib.util.CharArrayBuffer r4 = r8.lineBuf
            int r2 = r9.readLine(r4)
            if (r2 != r7) goto L1a
            if (r0 != 0) goto L1a
            org.opendatakit.httpclientandroidlib.NoHttpResponseException r4 = new org.opendatakit.httpclientandroidlib.NoHttpResponseException
            java.lang.String r5 = "The target server failed to respond"
            r4.<init>(r5)
            throw r4
        L1a:
            org.opendatakit.httpclientandroidlib.message.ParserCursor r1 = new org.opendatakit.httpclientandroidlib.message.ParserCursor
            r4 = 0
            org.opendatakit.httpclientandroidlib.util.CharArrayBuffer r5 = r8.lineBuf
            int r5 = r5.length()
            r1.<init>(r4, r5)
            org.opendatakit.httpclientandroidlib.message.LineParser r4 = r8.lineParser
            org.opendatakit.httpclientandroidlib.util.CharArrayBuffer r5 = r8.lineBuf
            boolean r4 = r4.hasProtocolVersion(r5, r1)
            if (r4 == 0) goto L40
            org.opendatakit.httpclientandroidlib.message.LineParser r4 = r8.lineParser
            org.opendatakit.httpclientandroidlib.util.CharArrayBuffer r5 = r8.lineBuf
            org.opendatakit.httpclientandroidlib.StatusLine r3 = r4.parseStatusLine(r5, r1)
            org.opendatakit.httpclientandroidlib.HttpResponseFactory r4 = r8.responseFactory
            r5 = 0
            org.opendatakit.httpclientandroidlib.HttpResponse r4 = r4.newHttpResponse(r3, r5)
            return r4
        L40:
            if (r2 == r7) goto L46
            int r4 = r8.maxGarbageLines
            if (r0 < r4) goto L4e
        L46:
            org.opendatakit.httpclientandroidlib.ProtocolException r4 = new org.opendatakit.httpclientandroidlib.ProtocolException
            java.lang.String r5 = "The server failed to respond with a valid HTTP response"
            r4.<init>(r5)
            throw r4
        L4e:
            org.opendatakit.httpclientandroidlib.androidextra.Log r4 = r8.log
            boolean r4 = r4.isDebugEnabled()
            if (r4 == 0) goto L74
            org.opendatakit.httpclientandroidlib.androidextra.Log r4 = r8.log
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Garbage in response: "
            java.lang.StringBuilder r5 = r5.append(r6)
            org.opendatakit.httpclientandroidlib.util.CharArrayBuffer r6 = r8.lineBuf
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.debug(r5)
        L74:
            int r0 = r0 + 1
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opendatakit.httpclientandroidlib.impl.conn.DefaultResponseParser.parseHead(org.opendatakit.httpclientandroidlib.io.SessionInputBuffer):org.opendatakit.httpclientandroidlib.HttpMessage");
    }
}
