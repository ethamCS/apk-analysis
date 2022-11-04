package io.noties.markwon.html;
/* loaded from: classes2.dex */
public class CssProperty {
    private String key;
    private String value;

    public void set(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public String key() {
        return this.key;
    }

    public String value() {
        return this.value;
    }

    public CssProperty mutate() {
        CssProperty cssProperty = new CssProperty();
        cssProperty.set(this.key, this.value);
        return cssProperty;
    }

    public String toString() {
        return "CssProperty{key='" + this.key + "', value='" + this.value + "'}";
    }
}
