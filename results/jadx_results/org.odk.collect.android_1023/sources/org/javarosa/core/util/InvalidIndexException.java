package org.javarosa.core.util;
/* loaded from: classes.dex */
public class InvalidIndexException extends RuntimeException {
    String index;

    public InvalidIndexException(String str, String str2) {
        super(str);
        this.index = str2;
    }

    public String getIndex() {
        return this.index;
    }
}
