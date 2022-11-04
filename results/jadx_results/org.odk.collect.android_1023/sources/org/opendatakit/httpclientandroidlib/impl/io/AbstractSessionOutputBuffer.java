package org.opendatakit.httpclientandroidlib.impl.io;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import me.regexp.RECharacter;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.io.BufferInfo;
import org.opendatakit.httpclientandroidlib.io.HttpTransportMetrics;
import org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer;
import org.opendatakit.httpclientandroidlib.params.CoreConnectionPNames;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
import org.opendatakit.httpclientandroidlib.params.HttpProtocolParams;
import org.opendatakit.httpclientandroidlib.util.ByteArrayBuffer;
import org.opendatakit.httpclientandroidlib.util.CharArrayBuffer;
@NotThreadSafe
/* loaded from: classes.dex */
public abstract class AbstractSessionOutputBuffer implements SessionOutputBuffer, BufferInfo {
    private static final Charset ASCII = Charset.forName("US-ASCII");
    private static final byte[] CRLF = {RECharacter.LINE_SEPARATOR, 10};
    private ByteBuffer bbuf;
    private ByteArrayBuffer buffer;
    private Charset charset;
    private CharsetEncoder encoder;
    private HttpTransportMetricsImpl metrics;
    private CodingErrorAction onMalformedInputAction;
    private CodingErrorAction onUnMappableInputAction;
    private OutputStream outstream;
    private boolean ascii = true;
    private int minChunkLimit = 512;

    public void init(OutputStream outstream, int buffersize, HttpParams params) {
        if (outstream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        }
        if (buffersize <= 0) {
            throw new IllegalArgumentException("Buffer size may not be negative or zero");
        }
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.outstream = outstream;
        this.buffer = new ByteArrayBuffer(buffersize);
        this.charset = Charset.forName(HttpProtocolParams.getHttpElementCharset(params));
        this.ascii = this.charset.equals(ASCII);
        this.encoder = null;
        this.minChunkLimit = params.getIntParameter(CoreConnectionPNames.MIN_CHUNK_LIMIT, 512);
        this.metrics = createTransportMetrics();
        this.onMalformedInputAction = HttpProtocolParams.getMalformedInputAction(params);
        this.onUnMappableInputAction = HttpProtocolParams.getUnmappableInputAction(params);
    }

    protected HttpTransportMetricsImpl createTransportMetrics() {
        return new HttpTransportMetricsImpl();
    }

    @Override // org.opendatakit.httpclientandroidlib.io.BufferInfo
    public int capacity() {
        return this.buffer.capacity();
    }

    @Override // org.opendatakit.httpclientandroidlib.io.BufferInfo
    public int length() {
        return this.buffer.length();
    }

    @Override // org.opendatakit.httpclientandroidlib.io.BufferInfo
    public int available() {
        return capacity() - length();
    }

    protected void flushBuffer() throws IOException {
        int len = this.buffer.length();
        if (len > 0) {
            this.outstream.write(this.buffer.buffer(), 0, len);
            this.buffer.clear();
            this.metrics.incrementBytesTransferred(len);
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer
    public void flush() throws IOException {
        flushBuffer();
        this.outstream.flush();
    }

    @Override // org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer
    public void write(byte[] b, int off, int len) throws IOException {
        if (b != null) {
            if (len > this.minChunkLimit || len > this.buffer.capacity()) {
                flushBuffer();
                this.outstream.write(b, off, len);
                this.metrics.incrementBytesTransferred(len);
                return;
            }
            int freecapacity = this.buffer.capacity() - this.buffer.length();
            if (len > freecapacity) {
                flushBuffer();
            }
            this.buffer.append(b, off, len);
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer
    public void write(byte[] b) throws IOException {
        if (b != null) {
            write(b, 0, b.length);
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer
    public void write(int b) throws IOException {
        if (this.buffer.isFull()) {
            flushBuffer();
        }
        this.buffer.append(b);
    }

    @Override // org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer
    public void writeLine(String s) throws IOException {
        if (s != null) {
            if (s.length() > 0) {
                if (this.ascii) {
                    for (int i = 0; i < s.length(); i++) {
                        write(s.charAt(i));
                    }
                } else {
                    CharBuffer cbuf = CharBuffer.wrap(s);
                    writeEncoded(cbuf);
                }
            }
            write(CRLF);
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer
    public void writeLine(CharArrayBuffer charbuffer) throws IOException {
        if (charbuffer != null) {
            if (this.ascii) {
                int off = 0;
                int remaining = charbuffer.length();
                while (remaining > 0) {
                    int chunk = Math.min(this.buffer.capacity() - this.buffer.length(), remaining);
                    if (chunk > 0) {
                        this.buffer.append(charbuffer, off, chunk);
                    }
                    if (this.buffer.isFull()) {
                        flushBuffer();
                    }
                    off += chunk;
                    remaining -= chunk;
                }
            } else {
                CharBuffer cbuf = CharBuffer.wrap(charbuffer.buffer(), 0, charbuffer.length());
                writeEncoded(cbuf);
            }
            write(CRLF);
        }
    }

    private void writeEncoded(CharBuffer cbuf) throws IOException {
        if (cbuf.hasRemaining()) {
            if (this.encoder == null) {
                this.encoder = this.charset.newEncoder();
                this.encoder.onMalformedInput(this.onMalformedInputAction);
                this.encoder.onUnmappableCharacter(this.onUnMappableInputAction);
            }
            if (this.bbuf == null) {
                this.bbuf = ByteBuffer.allocate(1024);
            }
            this.encoder.reset();
            while (cbuf.hasRemaining()) {
                CoderResult result = this.encoder.encode(cbuf, this.bbuf, true);
                handleEncodingResult(result);
            }
            CoderResult result2 = this.encoder.flush(this.bbuf);
            handleEncodingResult(result2);
            this.bbuf.clear();
        }
    }

    private void handleEncodingResult(CoderResult result) throws IOException {
        if (result.isError()) {
            result.throwException();
        }
        this.bbuf.flip();
        while (this.bbuf.hasRemaining()) {
            write(this.bbuf.get());
        }
        this.bbuf.compact();
    }

    @Override // org.opendatakit.httpclientandroidlib.io.SessionOutputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }
}
