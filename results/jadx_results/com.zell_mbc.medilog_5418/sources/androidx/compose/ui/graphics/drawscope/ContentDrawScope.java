package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ContentDrawScope.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public interface ContentDrawScope extends DrawScope {
    void drawContent();

    /* compiled from: ContentDrawScope.kt */
    /* renamed from: androidx.compose.ui.graphics.drawscope.ContentDrawScope$-CC */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
    }

    /* compiled from: ContentDrawScope.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs */
        public static void m2145drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap image, long j, long j2, long j3, long j4, float f, DrawStyle style, ColorFilter colorFilter, int i, int i2) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            DrawScope.CC.m2160$default$drawImageAZ2fEMs(contentDrawScope, image, j, j2, j3, j4, f, style, colorFilter, i, i2);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0 */
        public static long m2146getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            return DrawScope.CC.m2161$default$getCenterF1C5BW0(contentDrawScope);
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc */
        public static long m2147getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            return DrawScope.CC.m2162$default$getSizeNHjbRc(contentDrawScope);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o */
        public static int m2148roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j) {
            return Density.CC.m4068$default$roundToPxR2X_6o(contentDrawScope, j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4 */
        public static int m2149roundToPx0680j_4(ContentDrawScope contentDrawScope, float f) {
            return Density.CC.m4069$default$roundToPx0680j_4(contentDrawScope, f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA */
        public static float m2150toDpGaN1DYA(ContentDrawScope contentDrawScope, long j) {
            return Density.CC.m4070$default$toDpGaN1DYA(contentDrawScope, j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM */
        public static float m2151toDpu2uoSUM(ContentDrawScope contentDrawScope, float f) {
            return Density.CC.m4071$default$toDpu2uoSUM(contentDrawScope, f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM */
        public static float m2152toDpu2uoSUM(ContentDrawScope contentDrawScope, int i) {
            return Density.CC.m4072$default$toDpu2uoSUM((Density) contentDrawScope, i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM */
        public static long m2153toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j) {
            return Density.CC.m4073$default$toDpSizekrfVVM(contentDrawScope, j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o */
        public static float m2154toPxR2X_6o(ContentDrawScope contentDrawScope, long j) {
            return Density.CC.m4074$default$toPxR2X_6o(contentDrawScope, j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4 */
        public static float m2155toPx0680j_4(ContentDrawScope contentDrawScope, float f) {
            return Density.CC.m4075$default$toPx0680j_4(contentDrawScope, f);
        }

        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return Density.CC.$default$toRect(contentDrawScope, receiver);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ */
        public static long m2156toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j) {
            return Density.CC.m4076$default$toSizeXkaWNTQ(contentDrawScope, j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do */
        public static long m2157toSp0xMU5do(ContentDrawScope contentDrawScope, float f) {
            return Density.CC.m4077$default$toSp0xMU5do(contentDrawScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4 */
        public static long m2158toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f) {
            return Density.CC.m4078$default$toSpkPz2Gy4(contentDrawScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4 */
        public static long m2159toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i) {
            return Density.CC.m4079$default$toSpkPz2Gy4((Density) contentDrawScope, i);
        }
    }
}
