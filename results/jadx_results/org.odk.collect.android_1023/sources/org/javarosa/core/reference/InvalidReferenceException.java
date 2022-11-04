package org.javarosa.core.reference;
/* loaded from: classes.dex */
public class InvalidReferenceException extends Exception {
    private String reference;

    public InvalidReferenceException(String str, String str2) {
        super(str);
        this.reference = str2;
    }

    public String getReferenceString() {
        return this.reference;
    }
}
