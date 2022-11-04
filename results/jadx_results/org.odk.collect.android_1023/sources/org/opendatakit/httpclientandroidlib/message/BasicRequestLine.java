package org.opendatakit.httpclientandroidlib.message;

import java.io.Serializable;
import org.opendatakit.httpclientandroidlib.ProtocolVersion;
import org.opendatakit.httpclientandroidlib.RequestLine;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.util.CharArrayBuffer;
@Immutable
/* loaded from: classes.dex */
public class BasicRequestLine implements RequestLine, Cloneable, Serializable {
    private static final long serialVersionUID = 2810581718468737193L;
    private final String method;
    private final ProtocolVersion protoversion;
    private final String uri;

    public BasicRequestLine(String method, String uri, ProtocolVersion version) {
        if (method == null) {
            throw new IllegalArgumentException("Method must not be null.");
        }
        if (uri == null) {
            throw new IllegalArgumentException("URI must not be null.");
        }
        if (version == null) {
            throw new IllegalArgumentException("Protocol version must not be null.");
        }
        this.method = method;
        this.uri = uri;
        this.protoversion = version;
    }

    @Override // org.opendatakit.httpclientandroidlib.RequestLine
    public String getMethod() {
        return this.method;
    }

    @Override // org.opendatakit.httpclientandroidlib.RequestLine
    public ProtocolVersion getProtocolVersion() {
        return this.protoversion;
    }

    @Override // org.opendatakit.httpclientandroidlib.RequestLine
    public String getUri() {
        return this.uri;
    }

    public String toString() {
        return BasicLineFormatter.DEFAULT.formatRequestLine((CharArrayBuffer) null, this).toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
