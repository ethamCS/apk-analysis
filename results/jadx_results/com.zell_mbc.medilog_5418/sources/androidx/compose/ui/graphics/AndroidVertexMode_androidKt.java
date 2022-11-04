package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import kotlin.Metadata;
/* compiled from: AndroidVertexMode.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"toAndroidVertexMode", "Landroid/graphics/Canvas$VertexMode;", "Landroidx/compose/ui/graphics/VertexMode;", "toAndroidVertexMode-JOOmi9M", "(I)Landroid/graphics/Canvas$VertexMode;", "ui-graphics_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidVertexMode_androidKt {
    /* renamed from: toAndroidVertexMode-JOOmi9M */
    public static final Canvas.VertexMode m1604toAndroidVertexModeJOOmi9M(int i) {
        return VertexMode.m2046equalsimpl0(i, VertexMode.Companion.m2052getTrianglesc2xauaI()) ? Canvas.VertexMode.TRIANGLES : VertexMode.m2046equalsimpl0(i, VertexMode.Companion.m2051getTriangleStripc2xauaI()) ? Canvas.VertexMode.TRIANGLE_STRIP : VertexMode.m2046equalsimpl0(i, VertexMode.Companion.m2050getTriangleFanc2xauaI()) ? Canvas.VertexMode.TRIANGLE_FAN : Canvas.VertexMode.TRIANGLES;
    }
}
