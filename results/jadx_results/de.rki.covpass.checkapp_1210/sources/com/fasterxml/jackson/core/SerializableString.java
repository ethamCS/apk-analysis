package com.fasterxml.jackson.core;
/* loaded from: classes.dex */
public interface SerializableString {
    int appendQuoted(char[] cArr, int i10);

    int appendUnquoted(char[] cArr, int i10);

    char[] asQuotedChars();

    String getValue();
}
