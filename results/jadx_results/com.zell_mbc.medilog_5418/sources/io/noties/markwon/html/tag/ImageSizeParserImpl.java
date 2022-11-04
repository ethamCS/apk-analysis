package io.noties.markwon.html.tag;

import android.text.TextUtils;
import io.noties.markwon.html.CssInlineStyleParser;
import io.noties.markwon.html.CssProperty;
import io.noties.markwon.html.tag.ImageHandler;
import io.noties.markwon.image.ImageSize;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ImageSizeParserImpl implements ImageHandler.ImageSizeParser {
    private final CssInlineStyleParser inlineStyleParser;

    public ImageSizeParserImpl(CssInlineStyleParser cssInlineStyleParser) {
        this.inlineStyleParser = cssInlineStyleParser;
    }

    @Override // io.noties.markwon.html.tag.ImageHandler.ImageSizeParser
    public ImageSize parse(Map<String, String> map) {
        ImageSize.Dimension dimension;
        ImageSize.Dimension dimension2;
        String str = map.get("style");
        if (!TextUtils.isEmpty(str)) {
            dimension2 = null;
            dimension = null;
            for (CssProperty cssProperty : this.inlineStyleParser.parse(str)) {
                String key = cssProperty.key();
                if ("width".equals(key)) {
                    dimension2 = dimension(cssProperty.value());
                } else if ("height".equals(key)) {
                    dimension = dimension(cssProperty.value());
                }
                if (dimension2 != null && dimension != null) {
                    break;
                }
            }
        } else {
            dimension2 = null;
            dimension = null;
        }
        if (dimension2 == null || dimension == null) {
            if (dimension2 == null) {
                dimension2 = dimension(map.get("width"));
            }
            if (dimension == null) {
                dimension = dimension(map.get("height"));
            }
            if (dimension2 != null || dimension != null) {
                return new ImageSize(dimension2, dimension);
            }
            return null;
        }
        return new ImageSize(dimension2, dimension);
    }

    ImageSize.Dimension dimension(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int length = str.length();
        int i = length - 1;
        int i2 = i;
        while (i2 > -1) {
            if (Character.isDigit(str.charAt(i2))) {
                int i3 = i2 + 1;
                try {
                    return new ImageSize.Dimension(Float.parseFloat(str.substring(0, i3)), i2 == i ? null : str.substring(i3, length));
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            i2--;
        }
        return null;
    }
}
