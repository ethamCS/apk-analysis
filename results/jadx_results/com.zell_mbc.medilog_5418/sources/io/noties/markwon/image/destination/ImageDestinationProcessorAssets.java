package io.noties.markwon.image.destination;

import android.net.Uri;
import android.text.TextUtils;
/* loaded from: classes2.dex */
public class ImageDestinationProcessorAssets extends ImageDestinationProcessor {
    static final String BASE = "file:///android_asset/";
    static final String MOCK = "https://android.asset/";
    private final ImageDestinationProcessorRelativeToAbsolute assetsProcessor;
    private final ImageDestinationProcessor processor;

    public static ImageDestinationProcessorAssets create(ImageDestinationProcessor imageDestinationProcessor) {
        return new ImageDestinationProcessorAssets(imageDestinationProcessor);
    }

    public ImageDestinationProcessorAssets() {
        this(null);
    }

    public ImageDestinationProcessorAssets(ImageDestinationProcessor imageDestinationProcessor) {
        this.assetsProcessor = new ImageDestinationProcessorRelativeToAbsolute(MOCK);
        this.processor = imageDestinationProcessor;
    }

    @Override // io.noties.markwon.image.destination.ImageDestinationProcessor
    public String process(String str) {
        if (TextUtils.isEmpty(Uri.parse(str).getScheme())) {
            return this.assetsProcessor.process(str).replace(MOCK, BASE);
        }
        ImageDestinationProcessor imageDestinationProcessor = this.processor;
        return imageDestinationProcessor != null ? imageDestinationProcessor.process(str) : str;
    }
}
