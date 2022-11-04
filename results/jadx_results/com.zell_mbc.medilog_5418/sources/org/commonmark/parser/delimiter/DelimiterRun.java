package org.commonmark.parser.delimiter;
/* loaded from: classes2.dex */
public interface DelimiterRun {
    boolean canClose();

    boolean canOpen();

    int length();

    int originalLength();
}
