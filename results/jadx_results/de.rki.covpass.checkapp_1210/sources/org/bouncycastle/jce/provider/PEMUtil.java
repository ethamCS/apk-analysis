package org.bouncycastle.jce.provider;

import bk.a;
import gg.a0;
import gg.d0;
import gg.p;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class PEMUtil {
    private final String _footer1;
    private final String _footer2;
    private final String _header1;
    private final String _header2;

    public PEMUtil(String str) {
        this._header1 = "-----BEGIN " + str + "-----";
        this._header2 = "-----BEGIN X509 " + str + "-----";
        this._footer1 = "-----END " + str + "-----";
        this._footer2 = "-----END X509 " + str + "-----";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r0.length() == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String readLine(java.io.InputStream r5) {
        /*
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L5:
            int r1 = r5.read()
            r2 = 13
            if (r1 == r2) goto L1b
            r3 = 10
            if (r1 == r3) goto L1b
            if (r1 < 0) goto L1b
            if (r1 != r2) goto L16
            goto L5
        L16:
            char r1 = (char) r1
            r0.append(r1)
            goto L5
        L1b:
            if (r1 < 0) goto L23
            int r2 = r0.length()
            if (r2 == 0) goto L5
        L23:
            if (r1 >= 0) goto L27
            r5 = 0
            return r5
        L27:
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.PEMUtil.readLine(java.io.InputStream):java.lang.String");
    }

    public d0 readPEMObject(InputStream inputStream) {
        String readLine;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            readLine = readLine(inputStream);
            if (readLine == null || readLine.startsWith(this._header1)) {
                break;
            }
        } while (!readLine.startsWith(this._header2));
        while (true) {
            String readLine2 = readLine(inputStream);
            if (readLine2 == null || readLine2.startsWith(this._footer1) || readLine2.startsWith(this._footer2)) {
                break;
            }
            stringBuffer.append(readLine2);
        }
        if (stringBuffer.length() != 0) {
            a0 s10 = new p(a.a(stringBuffer.toString())).s();
            if (!(s10 instanceof d0)) {
                throw new IOException("malformed PEM data encountered");
            }
            return (d0) s10;
        }
        return null;
    }
}
