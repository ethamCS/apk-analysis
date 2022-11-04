package org.opendatakit.httpclientandroidlib.impl.io;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.io.EofSensor;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
@NotThreadSafe
/* loaded from: classes.dex */
public class SocketInputBuffer extends AbstractSessionInputBuffer implements EofSensor {
    private boolean eof;
    private final Socket socket;

    public SocketInputBuffer(Socket socket, int buffersize, HttpParams params) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        }
        this.socket = socket;
        this.eof = false;
        buffersize = buffersize < 0 ? socket.getReceiveBufferSize() : buffersize;
        init(socket.getInputStream(), buffersize < 1024 ? 1024 : buffersize, params);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.io.AbstractSessionInputBuffer
    public int fillBuffer() throws IOException {
        int i = super.fillBuffer();
        this.eof = i == -1;
        return i;
    }

    @Override // org.opendatakit.httpclientandroidlib.io.SessionInputBuffer
    public boolean isDataAvailable(int timeout) throws IOException {
        boolean result = hasBufferedData();
        if (!result) {
            int oldtimeout = this.socket.getSoTimeout();
            try {
                try {
                    this.socket.setSoTimeout(timeout);
                    fillBuffer();
                    result = hasBufferedData();
                } catch (SocketTimeoutException ex) {
                    throw ex;
                }
            } finally {
                this.socket.setSoTimeout(oldtimeout);
            }
        }
        return result;
    }

    @Override // org.opendatakit.httpclientandroidlib.io.EofSensor
    public boolean isEof() {
        return this.eof;
    }
}
