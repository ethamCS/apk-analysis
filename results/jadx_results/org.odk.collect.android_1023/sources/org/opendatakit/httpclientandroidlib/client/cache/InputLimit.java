package org.opendatakit.httpclientandroidlib.client.cache;

import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
@NotThreadSafe
/* loaded from: classes.dex */
public class InputLimit {
    private boolean reached = false;
    private final long value;

    public InputLimit(long value) {
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }

    public void reached() {
        this.reached = true;
    }

    public boolean isReached() {
        return this.reached;
    }
}
