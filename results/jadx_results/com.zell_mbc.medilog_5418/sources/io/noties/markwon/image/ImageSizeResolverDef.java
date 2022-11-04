package io.noties.markwon.image;

import android.graphics.Rect;
import io.noties.markwon.image.ImageSize;
/* loaded from: classes2.dex */
public class ImageSizeResolverDef extends ImageSizeResolver {
    protected static final String UNIT_EM = "em";
    protected static final String UNIT_PERCENT = "%";

    @Override // io.noties.markwon.image.ImageSizeResolver
    public Rect resolveImageSize(AsyncDrawable asyncDrawable) {
        return resolveImageSize(asyncDrawable.getImageSize(), asyncDrawable.getResult().getBounds(), asyncDrawable.getLastKnownCanvasWidth(), asyncDrawable.getLastKnowTextSize());
    }

    protected Rect resolveImageSize(ImageSize imageSize, Rect rect, int i, float f) {
        Rect rect2;
        int i2;
        if (imageSize == null) {
            int width = rect.width();
            if (width <= i) {
                return rect;
            }
            return new Rect(0, 0, i, (int) ((rect.height() / (width / i)) + 0.5f));
        }
        ImageSize.Dimension dimension = imageSize.width;
        ImageSize.Dimension dimension2 = imageSize.height;
        int width2 = rect.width();
        int height = rect.height();
        float f2 = width2 / height;
        if (dimension != null) {
            if (UNIT_PERCENT.equals(dimension.unit)) {
                i2 = (int) ((i * (dimension.value / 100.0f)) + 0.5f);
            } else {
                i2 = resolveAbsolute(dimension, width2, f);
            }
            rect2 = new Rect(0, 0, i2, (dimension2 == null || UNIT_PERCENT.equals(dimension2.unit)) ? (int) ((i2 / f2) + 0.5f) : resolveAbsolute(dimension2, height, f));
        } else if (dimension2 == null || UNIT_PERCENT.equals(dimension2.unit)) {
            return rect;
        } else {
            int resolveAbsolute = resolveAbsolute(dimension2, height, f);
            rect2 = new Rect(0, 0, (int) ((resolveAbsolute * f2) + 0.5f), resolveAbsolute);
        }
        return rect2;
    }

    protected int resolveAbsolute(ImageSize.Dimension dimension, int i, float f) {
        float f2;
        if (UNIT_EM.equals(dimension.unit)) {
            f2 = dimension.value * f;
        } else {
            f2 = dimension.value;
        }
        return (int) (f2 + 0.5f);
    }
}
