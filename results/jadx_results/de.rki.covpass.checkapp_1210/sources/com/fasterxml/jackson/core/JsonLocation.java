package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.ContentReference;
import java.io.Serializable;
/* loaded from: classes.dex */
public class JsonLocation implements Serializable {
    public static final JsonLocation NA = new JsonLocation(ContentReference.unknown(), -1, -1, -1, -1);
    protected final int _columnNr;
    protected final ContentReference _contentReference;
    protected final int _lineNr;
    protected transient String _sourceDescription;
    protected final long _totalBytes;
    protected final long _totalChars;

    public JsonLocation(ContentReference contentReference, long j10, int i10, int i11) {
        this(contentReference, -1L, j10, i10, i11);
    }

    public JsonLocation(ContentReference contentReference, long j10, long j11, int i10, int i11) {
        this._contentReference = contentReference == null ? ContentReference.unknown() : contentReference;
        this._totalBytes = j10;
        this._totalChars = j11;
        this._lineNr = i10;
        this._columnNr = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0 >= 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.StringBuilder appendOffsetDescription(java.lang.StringBuilder r7) {
        /*
            r6 = this;
            com.fasterxml.jackson.core.io.ContentReference r0 = r6._contentReference
            boolean r0 = r0.hasTextualContent()
            java.lang.String r1 = ", column: "
            java.lang.String r2 = "line: "
            java.lang.String r3 = "UNKNOWN"
            if (r0 == 0) goto L24
            r7.append(r2)
            int r0 = r6._lineNr
            if (r0 < 0) goto L19
            r7.append(r0)
            goto L1c
        L19:
            r7.append(r3)
        L1c:
            r7.append(r1)
            int r0 = r6._columnNr
            if (r0 < 0) goto L4e
            goto L39
        L24:
            int r0 = r6._lineNr
            if (r0 <= 0) goto L3d
            r7.append(r2)
            int r0 = r6._lineNr
            r7.append(r0)
            int r0 = r6._columnNr
            if (r0 <= 0) goto L51
            r7.append(r1)
            int r0 = r6._columnNr
        L39:
            r7.append(r0)
            goto L51
        L3d:
            java.lang.String r0 = "byte offset: #"
            r7.append(r0)
            long r0 = r6._totalBytes
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L4e
            r7.append(r0)
            goto L51
        L4e:
            r7.append(r3)
        L51:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonLocation.appendOffsetDescription(java.lang.StringBuilder):java.lang.StringBuilder");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonLocation)) {
            return false;
        }
        JsonLocation jsonLocation = (JsonLocation) obj;
        ContentReference contentReference = this._contentReference;
        if (contentReference == null) {
            if (jsonLocation._contentReference != null) {
                return false;
            }
        } else if (!contentReference.equals(jsonLocation._contentReference)) {
            return false;
        }
        return this._lineNr == jsonLocation._lineNr && this._columnNr == jsonLocation._columnNr && this._totalChars == jsonLocation._totalChars && this._totalBytes == jsonLocation._totalBytes;
    }

    public int hashCode() {
        return ((((this._contentReference == null ? 1 : 2) ^ this._lineNr) + this._columnNr) ^ ((int) this._totalChars)) + ((int) this._totalBytes);
    }

    public String sourceDescription() {
        if (this._sourceDescription == null) {
            this._sourceDescription = this._contentReference.buildSourceDescription();
        }
        return this._sourceDescription;
    }

    public String toString() {
        String sourceDescription = sourceDescription();
        StringBuilder sb2 = new StringBuilder(sourceDescription.length() + 40);
        sb2.append("[Source: ");
        sb2.append(sourceDescription);
        sb2.append("; ");
        StringBuilder appendOffsetDescription = appendOffsetDescription(sb2);
        appendOffsetDescription.append(']');
        return appendOffsetDescription.toString();
    }
}
