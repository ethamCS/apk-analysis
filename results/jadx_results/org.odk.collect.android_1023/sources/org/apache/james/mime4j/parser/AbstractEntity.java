package org.apache.james.mime4j.parser;

import java.io.IOException;
import java.util.BitSet;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.james.mime4j.MimeException;
import org.apache.james.mime4j.descriptor.BodyDescriptor;
import org.apache.james.mime4j.descriptor.DefaultBodyDescriptor;
import org.apache.james.mime4j.descriptor.MaximalBodyDescriptor;
import org.apache.james.mime4j.descriptor.MutableBodyDescriptor;
import org.apache.james.mime4j.io.LineReaderInputStream;
import org.apache.james.mime4j.io.MaxLineLimitException;
import org.apache.james.mime4j.util.ByteArrayBuffer;
/* loaded from: classes.dex */
public abstract class AbstractEntity implements EntityStateMachine {
    private static final int T_IN_BODYPART = -2;
    private static final int T_IN_MESSAGE = -3;
    private static final BitSet fieldChars = new BitSet();
    protected final MutableBodyDescriptor body;
    protected final MimeEntityConfig config;
    protected final int endState;
    private Field field;
    protected final BodyDescriptor parent;
    protected final int startState;
    protected int state;
    protected final Log log = LogFactory.getLog(getClass());
    private final ByteArrayBuffer linebuf = new ByteArrayBuffer(64);
    private int lineCount = 0;
    private boolean endOfHeader = false;
    private int headerCount = 0;

    protected abstract LineReaderInputStream getDataStream();

    protected abstract int getLineNumber();

    static {
        for (int i = 33; i <= 57; i++) {
            fieldChars.set(i);
        }
        for (int i2 = 59; i2 <= 126; i2++) {
            fieldChars.set(i2);
        }
    }

    public AbstractEntity(BodyDescriptor parent, int startState, int endState, MimeEntityConfig config) {
        this.parent = parent;
        this.state = startState;
        this.startState = startState;
        this.endState = endState;
        this.config = config;
        this.body = newBodyDescriptor(parent);
    }

    @Override // org.apache.james.mime4j.parser.EntityStateMachine
    public int getState() {
        return this.state;
    }

    protected MutableBodyDescriptor newBodyDescriptor(BodyDescriptor pParent) {
        if (this.config.isMaximalBodyDescriptor()) {
            MutableBodyDescriptor result = new MaximalBodyDescriptor(pParent);
            return result;
        }
        MutableBodyDescriptor result2 = new DefaultBodyDescriptor(pParent);
        return result2;
    }

    private ByteArrayBuffer fillFieldBuffer() throws IOException, MimeException {
        int ch;
        if (this.endOfHeader) {
            throw new IllegalStateException();
        }
        int maxLineLen = this.config.getMaxLineLen();
        LineReaderInputStream instream = getDataStream();
        ByteArrayBuffer fieldbuf = new ByteArrayBuffer(64);
        while (true) {
            int len = this.linebuf.length();
            if (maxLineLen > 0 && fieldbuf.length() + len >= maxLineLen) {
                throw new MaxLineLimitException("Maximum line length limit exceeded");
            }
            if (len > 0) {
                fieldbuf.append(this.linebuf.buffer(), 0, len);
            }
            this.linebuf.clear();
            if (instream.readLine(this.linebuf) == -1) {
                monitor(Event.HEADERS_PREMATURE_END);
                this.endOfHeader = true;
                break;
            }
            int len2 = this.linebuf.length();
            if (len2 > 0 && this.linebuf.byteAt(len2 - 1) == 10) {
                len2--;
            }
            if (len2 > 0 && this.linebuf.byteAt(len2 - 1) == 13) {
                len2--;
            }
            if (len2 == 0) {
                this.endOfHeader = true;
                break;
            }
            this.lineCount++;
            if (this.lineCount > 1 && (ch = this.linebuf.byteAt(0)) != 32 && ch != 9) {
                break;
            }
        }
        return fieldbuf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0054, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean parseField() throws org.apache.james.mime4j.MimeException, java.io.IOException {
        /*
            r8 = this;
            org.apache.james.mime4j.parser.MimeEntityConfig r6 = r8.config
            int r3 = r6.getMaxHeaderCount()
        L6:
            boolean r6 = r8.endOfHeader
            if (r6 == 0) goto Lc
            r6 = 0
        Lb:
            return r6
        Lc:
            int r6 = r8.headerCount
            if (r6 < r3) goto L18
            org.apache.james.mime4j.io.MaxHeaderLimitException r6 = new org.apache.james.mime4j.io.MaxHeaderLimitException
            java.lang.String r7 = "Maximum header limit exceeded"
            r6.<init>(r7)
            throw r6
        L18:
            org.apache.james.mime4j.util.ByteArrayBuffer r0 = r8.fillFieldBuffer()
            int r6 = r8.headerCount
            int r6 = r6 + 1
            r8.headerCount = r6
            int r2 = r0.length()
            if (r2 <= 0) goto L34
            int r6 = r2 + (-1)
            byte r6 = r0.byteAt(r6)
            r7 = 10
            if (r6 != r7) goto L34
            int r2 = r2 + (-1)
        L34:
            if (r2 <= 0) goto L42
            int r6 = r2 + (-1)
            byte r6 = r0.byteAt(r6)
            r7 = 13
            if (r6 != r7) goto L42
            int r2 = r2 + (-1)
        L42:
            r0.setLength(r2)
            r5 = 1
            r6 = 58
            int r4 = r0.indexOf(r6)
            if (r4 > 0) goto L66
            org.apache.james.mime4j.parser.Event r6 = org.apache.james.mime4j.parser.Event.INALID_HEADER
            r8.monitor(r6)
            r5 = 0
        L54:
            if (r5 == 0) goto L6
            org.apache.james.mime4j.parser.RawField r6 = new org.apache.james.mime4j.parser.RawField
            r6.<init>(r0, r4)
            r8.field = r6
            org.apache.james.mime4j.descriptor.MutableBodyDescriptor r6 = r8.body
            org.apache.james.mime4j.parser.Field r7 = r8.field
            r6.addField(r7)
            r6 = 1
            goto Lb
        L66:
            r1 = 0
        L67:
            if (r1 >= r4) goto L54
            java.util.BitSet r6 = org.apache.james.mime4j.parser.AbstractEntity.fieldChars
            byte r7 = r0.byteAt(r1)
            r7 = r7 & 255(0xff, float:3.57E-43)
            boolean r6 = r6.get(r7)
            if (r6 != 0) goto L7e
            org.apache.james.mime4j.parser.Event r6 = org.apache.james.mime4j.parser.Event.INALID_HEADER
            r8.monitor(r6)
            r5 = 0
            goto L54
        L7e:
            int r1 = r1 + 1
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.james.mime4j.parser.AbstractEntity.parseField():boolean");
    }

    @Override // org.apache.james.mime4j.parser.EntityStateMachine
    public BodyDescriptor getBodyDescriptor() {
        switch (getState()) {
            case -1:
            case 6:
            case 8:
            case 9:
            case 12:
                return this.body;
            default:
                throw new IllegalStateException("Invalid state :" + stateToString(this.state));
        }
    }

    @Override // org.apache.james.mime4j.parser.EntityStateMachine
    public Field getField() {
        switch (getState()) {
            case 4:
                return this.field;
            default:
                throw new IllegalStateException("Invalid state :" + stateToString(this.state));
        }
    }

    public void monitor(Event event) throws MimeException, IOException {
        if (this.config.isStrictParsing()) {
            throw new MimeParseEventException(event);
        }
        warn(event);
    }

    protected String message(Event event) {
        String message;
        if (event == null) {
            message = "Event is unexpectedly null.";
        } else {
            message = event.toString();
        }
        int lineNumber = getLineNumber();
        return lineNumber <= 0 ? message : "Line " + lineNumber + ": " + message;
    }

    protected void warn(Event event) {
        if (this.log.isWarnEnabled()) {
            this.log.warn(message(event));
        }
    }

    protected void debug(Event event) {
        if (this.log.isDebugEnabled()) {
            this.log.debug(message(event));
        }
    }

    public String toString() {
        return getClass().getName() + " [" + stateToString(this.state) + "][" + this.body.getMimeType() + "][" + this.body.getBoundary() + "]";
    }

    public static final String stateToString(int state) {
        switch (state) {
            case T_IN_MESSAGE /* -3 */:
                return "In message";
            case -2:
                return "Bodypart";
            case -1:
                return "End of stream";
            case 0:
                return "Start message";
            case 1:
                return "End message";
            case 2:
                return "Raw entity";
            case 3:
                return "Start header";
            case 4:
                return "Field";
            case 5:
                return "End header";
            case 6:
                return "Start multipart";
            case 7:
                return "End multipart";
            case 8:
                return "Preamble";
            case 9:
                return "Epilogue";
            case 10:
                return "Start bodypart";
            case 11:
                return "End bodypart";
            case 12:
                return "Body";
            default:
                return "Unknown";
        }
    }
}
