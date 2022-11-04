package org.opendatakit.httpclientandroidlib.impl.conn;

import java.io.IOException;
import org.apache.james.mime4j.util.CharsetUtil;
import org.opendatakit.httpclientandroidlib.Consts;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.io.HttpTransportMetrics;
import org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer;
import org.opendatakit.httpclientandroidlib.util.CharArrayBuffer;
@Immutable
/* loaded from: classes.dex */
public class LoggingSessionOutputBuffer implements SessionOutputBuffer {
    private final String charset;
    private final SessionOutputBuffer out;
    private final Wire wire;

    public LoggingSessionOutputBuffer(SessionOutputBuffer out, Wire wire, String charset) {
        this.out = out;
        this.wire = wire;
        this.charset = charset == null ? Consts.ASCII.name() : charset;
    }

    public LoggingSessionOutputBuffer(SessionOutputBuffer out, Wire wire) {
        this(out, wire, null);
    }

    @Override // org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer
    public void write(byte[] b, int off, int len) throws IOException {
        this.out.write(b, off, len);
        if (this.wire.enabled()) {
            this.wire.output(b, off, len);
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer
    public void write(int b) throws IOException {
        this.out.write(b);
        if (this.wire.enabled()) {
            this.wire.output(b);
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer
    public void write(byte[] b) throws IOException {
        this.out.write(b);
        if (this.wire.enabled()) {
            this.wire.output(b);
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer
    public void writeLine(CharArrayBuffer buffer) throws IOException {
        this.out.writeLine(buffer);
        if (this.wire.enabled()) {
            String s = new String(buffer.buffer(), 0, buffer.length());
            String tmp = s + CharsetUtil.CRLF;
            this.wire.output(tmp.getBytes(this.charset));
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer
    public void writeLine(String s) throws IOException {
        this.out.writeLine(s);
        if (this.wire.enabled()) {
            String tmp = s + CharsetUtil.CRLF;
            this.wire.output(tmp.getBytes(this.charset));
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.out.getMetrics();
    }
}
