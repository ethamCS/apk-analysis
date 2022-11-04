package io.noties.markwon.html;
/* loaded from: classes2.dex */
public class HtmlEmptyTagReplacement {
    private static final String IFRAME_REPLACEMENT = " ";
    private static final String IMG_REPLACEMENT = "￼";

    public static HtmlEmptyTagReplacement create() {
        return new HtmlEmptyTagReplacement();
    }

    public String replace(HtmlTag htmlTag) {
        String name = htmlTag.name();
        if ("br".equals(name)) {
            return "\n";
        }
        if ("img".equals(name)) {
            String str = htmlTag.attributes().get("alt");
            return (str == null || str.length() == 0) ? IMG_REPLACEMENT : str;
        } else if (!"iframe".equals(name)) {
            return null;
        } else {
            return IFRAME_REPLACEMENT;
        }
    }
}
