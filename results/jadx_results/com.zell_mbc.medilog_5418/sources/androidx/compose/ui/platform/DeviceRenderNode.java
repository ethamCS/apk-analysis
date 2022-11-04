package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: DeviceRenderNode.android.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010S\u001a\u00020TH&J\u0010\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u00020WH&J\b\u0010X\u001a\u00020YH&J\u0010\u0010Z\u001a\u00020T2\u0006\u0010[\u001a\u00020\\H&J\u0010\u0010]\u001a\u00020T2\u0006\u0010[\u001a\u00020\\H&J\u0010\u0010^\u001a\u00020T2\u0006\u0010_\u001a\u00020\tH&J\u0010\u0010`\u001a\u00020T2\u0006\u0010_\u001a\u00020\tH&J.\u0010a\u001a\u00020T2\u0006\u0010b\u001a\u00020c2\b\u0010d\u001a\u0004\u0018\u00010e2\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020T0gH&J\u0010\u0010i\u001a\u00020\u00142\u0006\u0010j\u001a\u00020\u0014H&J\u0012\u0010k\u001a\u00020T2\b\u0010l\u001a\u0004\u0018\u00010mH&J(\u0010n\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\t2\u0006\u0010E\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0010\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0005\"\u0004\b\u0012\u0010\u0007R\u0018\u0010\u0013\u001a\u00020\u0014X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00020\u0014X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0018\u0010\u001c\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0005\"\u0004\b\u001e\u0010\u0007R\u0012\u0010\u001f\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0016R\u0012\u0010!\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000bR\u0012\u0010#\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u000bR\u0018\u0010%\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0005\"\u0004\b'\u0010\u0007R\u0018\u0010(\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0005\"\u0004\b*\u0010\u0007R\u001a\u0010+\u001a\u0004\u0018\u00010,X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0012\u00101\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u000bR\u0018\u00103\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0005\"\u0004\b5\u0010\u0007R\u0018\u00106\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b7\u0010\u0005\"\u0004\b8\u0010\u0007R\u0018\u00109\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0005\"\u0004\b;\u0010\u0007R\u0018\u0010<\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b=\u0010\u0005\"\u0004\b>\u0010\u0007R\u0018\u0010?\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0005\"\u0004\bA\u0010\u0007R\u0018\u0010B\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\bC\u0010\u000b\"\u0004\bD\u0010\rR\u0012\u0010E\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u000bR\u0018\u0010G\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bH\u0010\u0005\"\u0004\bI\u0010\u0007R\u0018\u0010J\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bK\u0010\u0005\"\u0004\bL\u0010\u0007R\u0012\u0010M\u001a\u00020NX¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0012\u0010Q\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006oÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNode;", "", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "ambientShadowColor", "", "getAmbientShadowColor", "()I", "setAmbientShadowColor", "(I)V", "bottom", "getBottom", "cameraDistance", "getCameraDistance", "setCameraDistance", "clipToBounds", "", "getClipToBounds", "()Z", "setClipToBounds", "(Z)V", "clipToOutline", "getClipToOutline", "setClipToOutline", "elevation", "getElevation", "setElevation", "hasDisplayList", "getHasDisplayList", "height", "getHeight", "left", "getLeft", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "right", "getRight", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "spotShadowColor", "getSpotShadowColor", "setSpotShadowColor", "top", "getTop", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "uniqueId", "", "getUniqueId", "()J", "width", "getWidth", "discardDisplayList", "", "drawInto", "canvas", "Landroid/graphics/Canvas;", "dumpRenderNodeData", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "getInverseMatrix", "matrix", "Landroid/graphics/Matrix;", "getMatrix", "offsetLeftAndRight", TypedValues.CycleType.S_WAVE_OFFSET, "offsetTopAndBottom", "record", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipPath", "Landroidx/compose/ui/graphics/Path;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "setHasOverlappingRendering", "hasOverlappingRendering", "setOutline", "outline", "Landroid/graphics/Outline;", "setPosition", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public interface DeviceRenderNode {
    void discardDisplayList();

    void drawInto(Canvas canvas);

    DeviceRenderNodeData dumpRenderNodeData();

    float getAlpha();

    int getAmbientShadowColor();

    int getBottom();

    float getCameraDistance();

    boolean getClipToBounds();

    boolean getClipToOutline();

    float getElevation();

    boolean getHasDisplayList();

    int getHeight();

    void getInverseMatrix(Matrix matrix);

    int getLeft();

    void getMatrix(Matrix matrix);

    float getPivotX();

    float getPivotY();

    RenderEffect getRenderEffect();

    int getRight();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    int getSpotShadowColor();

    int getTop();

    float getTranslationX();

    float getTranslationY();

    long getUniqueId();

    int getWidth();

    void offsetLeftAndRight(int i);

    void offsetTopAndBottom(int i);

    void record(CanvasHolder canvasHolder, Path path, Function1<? super androidx.compose.ui.graphics.Canvas, Unit> function1);

    void setAlpha(float f);

    void setAmbientShadowColor(int i);

    void setCameraDistance(float f);

    void setClipToBounds(boolean z);

    void setClipToOutline(boolean z);

    void setElevation(float f);

    boolean setHasOverlappingRendering(boolean z);

    void setOutline(Outline outline);

    void setPivotX(float f);

    void setPivotY(float f);

    boolean setPosition(int i, int i2, int i3, int i4);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f);

    void setRotationY(float f);

    void setRotationZ(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    void setSpotShadowColor(int i);

    void setTranslationX(float f);

    void setTranslationY(float f);
}
