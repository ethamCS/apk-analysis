package io.noties.markwon.image;

import android.graphics.drawable.Drawable;
/* loaded from: classes2.dex */
public abstract class AsyncDrawableLoader {
    public abstract void cancel(AsyncDrawable asyncDrawable);

    public abstract void load(AsyncDrawable asyncDrawable);

    public abstract Drawable placeholder(AsyncDrawable asyncDrawable);

    public static AsyncDrawableLoader noOp() {
        return new AsyncDrawableLoaderNoOp();
    }
}
