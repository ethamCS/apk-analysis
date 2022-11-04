package org.opendatakit.httpclientandroidlib.message;

import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.ParseException;
import org.opendatakit.httpclientandroidlib.ProtocolVersion;
import org.opendatakit.httpclientandroidlib.RequestLine;
import org.opendatakit.httpclientandroidlib.StatusLine;
import org.opendatakit.httpclientandroidlib.util.CharArrayBuffer;
/* loaded from: classes.dex */
public interface LineParser {
    boolean hasProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor);

    Header parseHeader(CharArrayBuffer charArrayBuffer) throws ParseException;

    ProtocolVersion parseProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException;

    RequestLine parseRequestLine(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException;

    StatusLine parseStatusLine(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException;
}
