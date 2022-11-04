package org.opendatakit.httpclientandroidlib.impl.io;

import java.io.IOException;
import org.kxml2.wap.Wbxml;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HeaderIterator;
import org.opendatakit.httpclientandroidlib.HttpException;
import org.opendatakit.httpclientandroidlib.HttpMessage;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.io.HttpMessageWriter;
import org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer;
import org.opendatakit.httpclientandroidlib.message.BasicLineFormatter;
import org.opendatakit.httpclientandroidlib.message.LineFormatter;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
import org.opendatakit.httpclientandroidlib.util.CharArrayBuffer;
@NotThreadSafe
/* loaded from: classes.dex */
public abstract class AbstractMessageWriter<T extends HttpMessage> implements HttpMessageWriter<T> {
    protected final CharArrayBuffer lineBuf;
    protected final LineFormatter lineFormatter;
    protected final SessionOutputBuffer sessionBuffer;

    protected abstract void writeHeadLine(T t) throws IOException;

    public AbstractMessageWriter(SessionOutputBuffer buffer, LineFormatter formatter, HttpParams params) {
        if (buffer == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        this.sessionBuffer = buffer;
        this.lineBuf = new CharArrayBuffer(Wbxml.EXT_T_0);
        this.lineFormatter = formatter == null ? BasicLineFormatter.DEFAULT : formatter;
    }

    @Override // org.opendatakit.httpclientandroidlib.io.HttpMessageWriter
    public void write(T message) throws IOException, HttpException {
        if (message == null) {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        writeHeadLine(message);
        HeaderIterator it = message.headerIterator();
        while (it.hasNext()) {
            Header header = it.nextHeader();
            this.sessionBuffer.writeLine(this.lineFormatter.formatHeader(this.lineBuf, header));
        }
        this.lineBuf.clear();
        this.sessionBuffer.writeLine(this.lineBuf);
    }
}
