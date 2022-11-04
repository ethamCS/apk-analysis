package org.opendatakit.httpclientandroidlib.message;

import java.io.Serializable;
import org.opendatakit.httpclientandroidlib.ProtocolVersion;
import org.opendatakit.httpclientandroidlib.StatusLine;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.util.CharArrayBuffer;
@Immutable
/* loaded from: classes.dex */
public class BasicStatusLine implements StatusLine, Cloneable, Serializable {
    private static final long serialVersionUID = -2443303766890459269L;
    private final ProtocolVersion protoVersion;
    private final String reasonPhrase;
    private final int statusCode;

    public BasicStatusLine(ProtocolVersion version, int statusCode, String reasonPhrase) {
        if (version == null) {
            throw new IllegalArgumentException("Protocol version may not be null.");
        }
        if (statusCode < 0) {
            throw new IllegalArgumentException("Status code may not be negative.");
        }
        this.protoVersion = version;
        this.statusCode = statusCode;
        this.reasonPhrase = reasonPhrase;
    }

    @Override // org.opendatakit.httpclientandroidlib.StatusLine
    public int getStatusCode() {
        return this.statusCode;
    }

    @Override // org.opendatakit.httpclientandroidlib.StatusLine
    public ProtocolVersion getProtocolVersion() {
        return this.protoVersion;
    }

    @Override // org.opendatakit.httpclientandroidlib.StatusLine
    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    public String toString() {
        return BasicLineFormatter.DEFAULT.formatStatusLine((CharArrayBuffer) null, this).toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
