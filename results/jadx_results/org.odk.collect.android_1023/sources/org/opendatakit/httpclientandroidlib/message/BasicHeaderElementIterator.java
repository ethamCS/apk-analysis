package org.opendatakit.httpclientandroidlib.message;

import java.util.NoSuchElementException;
import org.opendatakit.httpclientandroidlib.FormattedHeader;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HeaderElement;
import org.opendatakit.httpclientandroidlib.HeaderElementIterator;
import org.opendatakit.httpclientandroidlib.HeaderIterator;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.util.CharArrayBuffer;
@NotThreadSafe
/* loaded from: classes.dex */
public class BasicHeaderElementIterator implements HeaderElementIterator {
    private CharArrayBuffer buffer;
    private HeaderElement currentElement;
    private ParserCursor cursor;
    private final HeaderIterator headerIt;
    private final HeaderValueParser parser;

    public BasicHeaderElementIterator(HeaderIterator headerIterator, HeaderValueParser parser) {
        this.currentElement = null;
        this.buffer = null;
        this.cursor = null;
        if (headerIterator == null) {
            throw new IllegalArgumentException("Header iterator may not be null");
        }
        if (parser == null) {
            throw new IllegalArgumentException("Parser may not be null");
        }
        this.headerIt = headerIterator;
        this.parser = parser;
    }

    public BasicHeaderElementIterator(HeaderIterator headerIterator) {
        this(headerIterator, BasicHeaderValueParser.DEFAULT);
    }

    private void bufferHeaderValue() {
        this.cursor = null;
        this.buffer = null;
        while (this.headerIt.hasNext()) {
            Header h = this.headerIt.nextHeader();
            if (h instanceof FormattedHeader) {
                this.buffer = ((FormattedHeader) h).getBuffer();
                this.cursor = new ParserCursor(0, this.buffer.length());
                this.cursor.updatePos(((FormattedHeader) h).getValuePos());
                return;
            }
            String value = h.getValue();
            if (value != null) {
                this.buffer = new CharArrayBuffer(value.length());
                this.buffer.append(value);
                this.cursor = new ParserCursor(0, this.buffer.length());
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseNextElement() {
        /*
            r5 = this;
            r4 = 0
        L1:
            org.opendatakit.httpclientandroidlib.HeaderIterator r1 = r5.headerIt
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto Ld
            org.opendatakit.httpclientandroidlib.message.ParserCursor r1 = r5.cursor
            if (r1 == 0) goto L44
        Ld:
            org.opendatakit.httpclientandroidlib.message.ParserCursor r1 = r5.cursor
            if (r1 == 0) goto L19
            org.opendatakit.httpclientandroidlib.message.ParserCursor r1 = r5.cursor
            boolean r1 = r1.atEnd()
            if (r1 == 0) goto L1c
        L19:
            r5.bufferHeaderValue()
        L1c:
            org.opendatakit.httpclientandroidlib.message.ParserCursor r1 = r5.cursor
            if (r1 == 0) goto L1
        L20:
            org.opendatakit.httpclientandroidlib.message.ParserCursor r1 = r5.cursor
            boolean r1 = r1.atEnd()
            if (r1 != 0) goto L45
            org.opendatakit.httpclientandroidlib.message.HeaderValueParser r1 = r5.parser
            org.opendatakit.httpclientandroidlib.util.CharArrayBuffer r2 = r5.buffer
            org.opendatakit.httpclientandroidlib.message.ParserCursor r3 = r5.cursor
            org.opendatakit.httpclientandroidlib.HeaderElement r0 = r1.parseHeaderElement(r2, r3)
            java.lang.String r1 = r0.getName()
            int r1 = r1.length()
            if (r1 != 0) goto L42
            java.lang.String r1 = r0.getValue()
            if (r1 == 0) goto L20
        L42:
            r5.currentElement = r0
        L44:
            return
        L45:
            org.opendatakit.httpclientandroidlib.message.ParserCursor r1 = r5.cursor
            boolean r1 = r1.atEnd()
            if (r1 == 0) goto L1
            r5.cursor = r4
            r5.buffer = r4
            goto L1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opendatakit.httpclientandroidlib.message.BasicHeaderElementIterator.parseNextElement():void");
    }

    @Override // org.opendatakit.httpclientandroidlib.HeaderElementIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.currentElement == null) {
            parseNextElement();
        }
        return this.currentElement != null;
    }

    @Override // org.opendatakit.httpclientandroidlib.HeaderElementIterator
    public HeaderElement nextElement() throws NoSuchElementException {
        if (this.currentElement == null) {
            parseNextElement();
        }
        if (this.currentElement == null) {
            throw new NoSuchElementException("No more header elements available");
        }
        HeaderElement element = this.currentElement;
        this.currentElement = null;
        return element;
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException {
        return nextElement();
    }

    @Override // java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
