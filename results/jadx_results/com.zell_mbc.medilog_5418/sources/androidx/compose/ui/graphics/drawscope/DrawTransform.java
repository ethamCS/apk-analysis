package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
/* compiled from: DrawTransform.kt */
@DrawScopeMarker
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\r\u001a\u00020\u000eH&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H&J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u0003H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u0003H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020&H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001c\u0010)\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H&R\u001d\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001b\u0010\u0006\u001a\u00020\u0007X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006*À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "inset", "rotate", "degrees", "pivot", "rotate-Uv8p0NA", "(FJ)V", "scale", "scaleX", "scaleY", "scale-0AR0LA0", "(FFJ)V", "transform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "translate", "ui-graphics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public interface DrawTransform {
    /* renamed from: clipPath-mtrdD-E */
    void mo2123clipPathmtrdDE(Path path, int i);

    /* renamed from: clipRect-N_I0leg */
    void mo2124clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* renamed from: getCenter-F1C5BW0 */
    long mo2125getCenterF1C5BW0();

    /* renamed from: getSize-NH-jbRc */
    long mo2126getSizeNHjbRc();

    void inset(float f, float f2, float f3, float f4);

    /* renamed from: rotate-Uv8p0NA */
    void mo2127rotateUv8p0NA(float f, long j);

    /* renamed from: scale-0AR0LA0 */
    void mo2128scale0AR0LA0(float f, float f2, long j);

    /* renamed from: transform-58bKbWc */
    void mo2129transform58bKbWc(float[] fArr);

    void translate(float f, float f2);

    /* compiled from: DrawTransform.kt */
    /* renamed from: androidx.compose.ui.graphics.drawscope.DrawTransform$-CC */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        /* renamed from: $default$getCenter-F1C5BW0 */
        public static long m2246$default$getCenterF1C5BW0(DrawTransform _this) {
            float f = 2;
            return OffsetKt.Offset(Size.m1528getWidthimpl(_this.mo2126getSizeNHjbRc()) / f, Size.m1525getHeightimpl(_this.mo2126getSizeNHjbRc()) / f);
        }

        /* renamed from: clipRect-N_I0leg$default */
        public static /* synthetic */ void m2249clipRectN_I0leg$default(DrawTransform drawTransform, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    f = 0.0f;
                }
                if ((i2 & 2) != 0) {
                    f2 = 0.0f;
                }
                if ((i2 & 4) != 0) {
                    f3 = Size.m1528getWidthimpl(drawTransform.mo2126getSizeNHjbRc());
                }
                if ((i2 & 8) != 0) {
                    f4 = Size.m1525getHeightimpl(drawTransform.mo2126getSizeNHjbRc());
                }
                if ((i2 & 16) != 0) {
                    i = ClipOp.Companion.m1685getIntersectrtfAjoo();
                }
                drawTransform.mo2124clipRectN_I0leg(f, f2, f3, f4, i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }

        /* renamed from: clipPath-mtrdD-E$default */
        public static /* synthetic */ void m2248clipPathmtrdDE$default(DrawTransform drawTransform, Path path, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = ClipOp.Companion.m1685getIntersectrtfAjoo();
                }
                drawTransform.mo2123clipPathmtrdDE(path, i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }

        public static /* synthetic */ void translate$default(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    f = 0.0f;
                }
                if ((i & 2) != 0) {
                    f2 = 0.0f;
                }
                drawTransform.translate(f, f2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }

        /* renamed from: rotate-Uv8p0NA$default */
        public static /* synthetic */ void m2250rotateUv8p0NA$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    j = drawTransform.mo2125getCenterF1C5BW0();
                }
                drawTransform.mo2127rotateUv8p0NA(f, j);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }

        /* renamed from: scale-0AR0LA0$default */
        public static /* synthetic */ void m2251scale0AR0LA0$default(DrawTransform drawTransform, float f, float f2, long j, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    j = drawTransform.mo2125getCenterF1C5BW0();
                }
                drawTransform.mo2128scale0AR0LA0(f, f2, j);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
    }

    /* compiled from: DrawTransform.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getCenter-F1C5BW0 */
        public static long m2254getCenterF1C5BW0(DrawTransform drawTransform) {
            return CC.m2246$default$getCenterF1C5BW0(drawTransform);
        }
    }
}
