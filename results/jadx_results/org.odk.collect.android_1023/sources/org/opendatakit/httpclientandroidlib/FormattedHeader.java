package org.opendatakit.httpclientandroidlib;

import org.opendatakit.httpclientandroidlib.util.CharArrayBuffer;
/* loaded from: classes.dex */
public interface FormattedHeader extends Header {
    CharArrayBuffer getBuffer();

    int getValuePos();
}
