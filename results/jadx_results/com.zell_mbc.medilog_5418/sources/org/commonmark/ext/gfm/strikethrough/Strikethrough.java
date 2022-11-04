package org.commonmark.ext.gfm.strikethrough;

import org.commonmark.node.CustomNode;
import org.commonmark.node.Delimited;
/* loaded from: classes2.dex */
public class Strikethrough extends CustomNode implements Delimited {
    private static final String DELIMITER = "~~";

    @Override // org.commonmark.node.Delimited
    public String getClosingDelimiter() {
        return DELIMITER;
    }

    @Override // org.commonmark.node.Delimited
    public String getOpeningDelimiter() {
        return DELIMITER;
    }
}
