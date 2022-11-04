package org.opendatakit.httpclientandroidlib.entity.mime;
/* loaded from: classes.dex */
public class MinimalField {
    private final String name;
    private final String value;

    public MinimalField(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getBody() {
        return this.value;
    }

    public String toString() {
        return this.name + ": " + this.value;
    }
}
