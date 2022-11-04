package coil.transform;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BlurTransformation.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J)\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcoil/transform/BlurTransformation;", "Lcoil/transform/Transformation;", "context", "Landroid/content/Context;", "radius", "", "sampling", "(Landroid/content/Context;FF)V", "equals", "", "other", "", "hashCode", "", "key", "", "toString", "transform", "Landroid/graphics/Bitmap;", "pool", "Lcoil/bitmap/BitmapPool;", "input", "size", "Lcoil/size/Size;", "(Lcoil/bitmap/BitmapPool;Landroid/graphics/Bitmap;Lcoil/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class BlurTransformation implements Transformation {
    private static final Companion Companion = new Companion(null);
    private static final float DEFAULT_RADIUS = 10.0f;
    private static final float DEFAULT_SAMPLING = 1.0f;
    private final Context context;
    private final float radius;
    private final float sampling;

    public BlurTransformation(Context context) {
        this(context, 0.0f, 0.0f, 6, null);
    }

    public BlurTransformation(Context context, float f) {
        this(context, f, 0.0f, 4, null);
    }

    public BlurTransformation(Context context, float f, float f2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.radius = f;
        this.sampling = f2;
        double d = f;
        boolean z = true;
        if (d >= 0.0d && d <= 25.0d) {
            if (!(f2 <= ((float) 0) ? false : z)) {
                throw new IllegalArgumentException("sampling must be > 0.".toString());
            }
            return;
        }
        throw new IllegalArgumentException("radius must be in [0, 25].".toString());
    }

    public /* synthetic */ BlurTransformation(Context context, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? 10.0f : f, (i & 4) != 0 ? 1.0f : f2);
    }

    @Override // coil.transform.Transformation
    public String key() {
        return BlurTransformation.class.getName() + '-' + this.radius + '-' + this.sampling;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    @Override // coil.transform.Transformation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object transform(coil.bitmap.BitmapPool r6, android.graphics.Bitmap r7, coil.size.Size r8, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> r9) {
        /*
            r5 = this;
            android.graphics.Paint r8 = new android.graphics.Paint
            r9 = 3
            r8.<init>(r9)
            int r9 = r7.getWidth()
            float r9 = (float) r9
            float r0 = r5.sampling
            float r9 = r9 / r0
            int r9 = (int) r9
            int r0 = r7.getHeight()
            float r0 = (float) r0
            float r1 = r5.sampling
            float r0 = r0 / r1
            int r0 = (int) r0
            android.graphics.Bitmap$Config r1 = coil.util.Bitmaps.getSafeConfig(r7)
            android.graphics.Bitmap r6 = r6.get(r9, r0, r1)
            android.graphics.Canvas r9 = new android.graphics.Canvas
            r9.<init>(r6)
            r0 = 1
            float r1 = (float) r0
            float r2 = r5.sampling
            float r3 = r1 / r2
            float r1 = r1 / r2
            r9.scale(r3, r1)
            r1 = 0
            r9.drawBitmap(r7, r1, r1, r8)
            r7 = 0
            r8 = r7
            android.renderscript.RenderScript r8 = (android.renderscript.RenderScript) r8
            r8 = r7
            android.renderscript.Allocation r8 = (android.renderscript.Allocation) r8
            r8 = r7
            android.renderscript.ScriptIntrinsicBlur r8 = (android.renderscript.ScriptIntrinsicBlur) r8
            android.content.Context r8 = r5.context     // Catch: java.lang.Throwable -> L8d
            android.renderscript.RenderScript r8 = android.renderscript.RenderScript.create(r8)     // Catch: java.lang.Throwable -> L8d
            android.renderscript.Allocation$MipmapControl r9 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Throwable -> L87
            android.renderscript.Allocation r9 = android.renderscript.Allocation.createFromBitmap(r8, r6, r9, r0)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = "tmpInt"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)     // Catch: java.lang.Throwable -> L84
            android.renderscript.Type r0 = r9.getType()     // Catch: java.lang.Throwable -> L84
            android.renderscript.Allocation r0 = android.renderscript.Allocation.createTyped(r8, r0)     // Catch: java.lang.Throwable -> L84
            android.renderscript.Element r1 = android.renderscript.Element.U8_4(r8)     // Catch: java.lang.Throwable -> L7f
            android.renderscript.ScriptIntrinsicBlur r7 = android.renderscript.ScriptIntrinsicBlur.create(r8, r1)     // Catch: java.lang.Throwable -> L7f
            float r1 = r5.radius     // Catch: java.lang.Throwable -> L7f
            r7.setRadius(r1)     // Catch: java.lang.Throwable -> L7f
            r7.setInput(r9)     // Catch: java.lang.Throwable -> L7f
            r7.forEach(r0)     // Catch: java.lang.Throwable -> L7f
            r0.copyTo(r6)     // Catch: java.lang.Throwable -> L7f
            if (r8 == 0) goto L71
            r8.destroy()
        L71:
            r9.destroy()
            if (r0 == 0) goto L79
            r0.destroy()
        L79:
            if (r7 == 0) goto L7e
            r7.destroy()
        L7e:
            return r6
        L7f:
            r6 = move-exception
            r4 = r8
            r8 = r7
            r7 = r4
            goto L91
        L84:
            r6 = move-exception
            r0 = r7
            goto L8a
        L87:
            r6 = move-exception
            r9 = r7
            r0 = r9
        L8a:
            r7 = r8
            r8 = r0
            goto L91
        L8d:
            r6 = move-exception
            r8 = r7
            r9 = r8
            r0 = r9
        L91:
            if (r7 == 0) goto L96
            r7.destroy()
        L96:
            if (r9 == 0) goto L9b
            r9.destroy()
        L9b:
            if (r0 == 0) goto La0
            r0.destroy()
        La0:
            if (r8 == 0) goto La5
            r8.destroy()
        La5:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.transform.BlurTransformation.transform(coil.bitmap.BitmapPool, android.graphics.Bitmap, coil.size.Size, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlurTransformation) {
            BlurTransformation blurTransformation = (BlurTransformation) obj;
            if (Intrinsics.areEqual(this.context, blurTransformation.context) && this.radius == blurTransformation.radius && this.sampling == blurTransformation.sampling) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + Float.floatToIntBits(this.radius)) * 31) + Float.floatToIntBits(this.sampling);
    }

    public String toString() {
        return "BlurTransformation(context=" + this.context + ", radius=" + this.radius + ", sampling=" + this.sampling + ')';
    }

    /* compiled from: BlurTransformation.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcoil/transform/BlurTransformation$Companion;", "", "()V", "DEFAULT_RADIUS", "", "DEFAULT_SAMPLING", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
