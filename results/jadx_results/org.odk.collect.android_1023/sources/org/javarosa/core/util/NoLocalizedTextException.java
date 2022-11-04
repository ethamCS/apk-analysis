package org.javarosa.core.util;
/* loaded from: classes.dex */
public class NoLocalizedTextException extends RuntimeException {
    private String keynames;
    private String locale;

    public NoLocalizedTextException(String str, String str2, String str3) {
        super(str);
        this.keynames = str2;
        this.locale = str3;
    }

    public String getMissingKeyNames() {
        return this.keynames;
    }

    public String getLocaleMissingKey() {
        return this.locale;
    }
}
