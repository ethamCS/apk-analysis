package org.opendatakit.httpclientandroidlib;

import java.io.Serializable;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
@Immutable
/* loaded from: classes.dex */
public final class HttpVersion extends ProtocolVersion implements Serializable {
    public static final String HTTP = "HTTP";
    public static final HttpVersion HTTP_0_9 = new HttpVersion(0, 9);
    public static final HttpVersion HTTP_1_0 = new HttpVersion(1, 0);
    public static final HttpVersion HTTP_1_1 = new HttpVersion(1, 1);
    private static final long serialVersionUID = -5856653513894415344L;

    public HttpVersion(int major, int minor) {
        super(HTTP, major, minor);
    }

    @Override // org.opendatakit.httpclientandroidlib.ProtocolVersion
    public ProtocolVersion forVersion(int major, int minor) {
        if (major != this.major || minor != this.minor) {
            if (major == 1) {
                if (minor == 0) {
                    return HTTP_1_0;
                }
                if (minor == 1) {
                    return HTTP_1_1;
                }
            }
            if (major == 0 && minor == 9) {
                return HTTP_0_9;
            }
            return new HttpVersion(major, minor);
        }
        return this;
    }
}
