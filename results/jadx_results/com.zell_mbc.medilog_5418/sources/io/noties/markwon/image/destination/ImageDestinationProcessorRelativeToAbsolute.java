package io.noties.markwon.image.destination;

import java.net.MalformedURLException;
import java.net.URL;
/* loaded from: classes2.dex */
public class ImageDestinationProcessorRelativeToAbsolute extends ImageDestinationProcessor {
    private final URL base;

    public static ImageDestinationProcessorRelativeToAbsolute create(String str) {
        return new ImageDestinationProcessorRelativeToAbsolute(str);
    }

    public static ImageDestinationProcessorRelativeToAbsolute create(URL url) {
        return new ImageDestinationProcessorRelativeToAbsolute(url);
    }

    public ImageDestinationProcessorRelativeToAbsolute(String str) {
        this.base = obtain(str);
    }

    public ImageDestinationProcessorRelativeToAbsolute(URL url) {
        this.base = url;
    }

    @Override // io.noties.markwon.image.destination.ImageDestinationProcessor
    public String process(String str) {
        if (this.base != null) {
            try {
                return new URL(this.base, str).toString();
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return str;
            }
        }
        return str;
    }

    private static URL obtain(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
