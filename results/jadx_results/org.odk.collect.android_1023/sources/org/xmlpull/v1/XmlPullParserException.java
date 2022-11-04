package org.xmlpull.v1;

import org.javarosa.xform.util.XFormAnswerDataSerializer;
/* loaded from: classes.dex */
public class XmlPullParserException extends Exception {
    protected int column;
    protected Throwable detail;
    protected int row;

    public XmlPullParserException(String s) {
        super(s);
        this.row = -1;
        this.column = -1;
    }

    public XmlPullParserException(String msg, XmlPullParser parser, Throwable chain) {
        super(new StringBuffer().append(msg == null ? "" : new StringBuffer().append(msg).append(XFormAnswerDataSerializer.DELIMITER).toString()).append(parser == null ? "" : new StringBuffer().append("(position:").append(parser.getPositionDescription()).append(") ").toString()).append(chain == null ? "" : new StringBuffer().append("caused by: ").append(chain).toString()).toString());
        this.row = -1;
        this.column = -1;
        if (parser != null) {
            this.row = parser.getLineNumber();
            this.column = parser.getColumnNumber();
        }
        this.detail = chain;
    }

    public Throwable getDetail() {
        return this.detail;
    }

    public int getLineNumber() {
        return this.row;
    }

    public int getColumnNumber() {
        return this.column;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        if (this.detail == null) {
            super.printStackTrace();
            return;
        }
        synchronized (System.err) {
            System.err.println(new StringBuffer().append(super.getMessage()).append("; nested exception is:").toString());
            this.detail.printStackTrace();
        }
    }
}
