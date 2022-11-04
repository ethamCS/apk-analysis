package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.lingala.zip4j.util.InternalZipConstants;
/* compiled from: Color.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a<\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a2\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a1\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0082\b\u001a-\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0002\u001a!\u0010'\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010+\u001a\u00020,*\u00020\u0002H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0019\u0010/\u001a\u00020\f*\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a+\u00102\u001a\u00020\u0002*\u00020\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000204H\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a\u0019\u00107\u001a\u00020\u0014*\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\"\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"isSpecified", "", "Landroidx/compose/ui/graphics/Color;", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "Color", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", TypedValues.Custom.S_COLOR, "", "(I)J", "(IIII)J", "", "(J)J", "compositeComponent", "fgC", "bgC", "fgA", "bgA", "a", "lerp", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "saturate", "v", "compositeOver", "background", "compositeOver--OWjLjI", "(JJ)J", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "toArgb", "toArgb-8_81llA", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ColorKt {
    /* renamed from: access$getComponents-8_81llA */
    public static final /* synthetic */ float[] m1741access$getComponents8_81llA(long j) {
        return m1743getComponents8_81llA(j);
    }

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return ((f * f3) + ((f2 * f4) * (1.0f - f3))) / f5;
    }

    /* renamed from: isSpecified-8_81llA$annotations */
    public static /* synthetic */ void m1745isSpecified8_81llA$annotations(long j) {
    }

    /* renamed from: isUnspecified-8_81llA$annotations */
    public static /* synthetic */ void m1747isUnspecified8_81llA$annotations(long j) {
    }

    private static final float saturate(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f < 1.0f) {
            return f;
        }
        return 1.0f;
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long Color(float r9, float r10, float r11, float r12, androidx.compose.ui.graphics.colorspace.ColorSpace r13) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static final long Color(int i) {
        return Color.m1692constructorimpl(ULong.m4921constructorimpl(ULong.m4921constructorimpl(i) << 32));
    }

    public static final long Color(long j) {
        return Color.m1692constructorimpl(ULong.m4921constructorimpl(ULong.m4921constructorimpl(ULong.m4921constructorimpl(j) & InternalZipConstants.ZIP_64_SIZE_LIMIT) << 32));
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* renamed from: lerp-jxsXWHM */
    public static final long m1748lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long m1693convertvNxB06k = Color.m1693convertvNxB06k(j, oklab);
        long m1693convertvNxB06k2 = Color.m1693convertvNxB06k(j2, oklab);
        float m1698getAlphaimpl = Color.m1698getAlphaimpl(m1693convertvNxB06k);
        float m1702getRedimpl = Color.m1702getRedimpl(m1693convertvNxB06k);
        float m1701getGreenimpl = Color.m1701getGreenimpl(m1693convertvNxB06k);
        float m1699getBlueimpl = Color.m1699getBlueimpl(m1693convertvNxB06k);
        float m1698getAlphaimpl2 = Color.m1698getAlphaimpl(m1693convertvNxB06k2);
        float m1702getRedimpl2 = Color.m1702getRedimpl(m1693convertvNxB06k2);
        float m1701getGreenimpl2 = Color.m1701getGreenimpl(m1693convertvNxB06k2);
        float m1699getBlueimpl2 = Color.m1699getBlueimpl(m1693convertvNxB06k2);
        return Color.m1693convertvNxB06k(Color(MathHelpersKt.lerp(m1702getRedimpl, m1702getRedimpl2, f), MathHelpersKt.lerp(m1701getGreenimpl, m1701getGreenimpl2, f), MathHelpersKt.lerp(m1699getBlueimpl, m1699getBlueimpl2, f), MathHelpersKt.lerp(m1698getAlphaimpl, m1698getAlphaimpl2, f), oklab), Color.m1700getColorSpaceimpl(j2));
    }

    /* renamed from: compositeOver--OWjLjI */
    public static final long m1742compositeOverOWjLjI(long j, long j2) {
        long m1693convertvNxB06k = Color.m1693convertvNxB06k(j, Color.m1700getColorSpaceimpl(j2));
        float m1698getAlphaimpl = Color.m1698getAlphaimpl(j2);
        float m1698getAlphaimpl2 = Color.m1698getAlphaimpl(m1693convertvNxB06k);
        float f = 1.0f - m1698getAlphaimpl2;
        float f2 = (m1698getAlphaimpl * f) + m1698getAlphaimpl2;
        boolean z = true;
        float f3 = 0.0f;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        float m1702getRedimpl = i == 0 ? 0.0f : ((Color.m1702getRedimpl(m1693convertvNxB06k) * m1698getAlphaimpl2) + ((Color.m1702getRedimpl(j2) * m1698getAlphaimpl) * f)) / f2;
        float m1701getGreenimpl = i == 0 ? 0.0f : ((Color.m1701getGreenimpl(m1693convertvNxB06k) * m1698getAlphaimpl2) + ((Color.m1701getGreenimpl(j2) * m1698getAlphaimpl) * f)) / f2;
        float m1699getBlueimpl = Color.m1699getBlueimpl(m1693convertvNxB06k);
        float m1699getBlueimpl2 = Color.m1699getBlueimpl(j2);
        if (i != 0) {
            z = false;
        }
        if (!z) {
            f3 = ((m1699getBlueimpl * m1698getAlphaimpl2) + ((m1699getBlueimpl2 * m1698getAlphaimpl) * f)) / f2;
        }
        return Color(m1702getRedimpl, m1701getGreenimpl, f3, f2, Color.m1700getColorSpaceimpl(j2));
    }

    /* renamed from: getComponents-8_81llA */
    public static final float[] m1743getComponents8_81llA(long j) {
        return new float[]{Color.m1702getRedimpl(j), Color.m1701getGreenimpl(j), Color.m1699getBlueimpl(j), Color.m1698getAlphaimpl(j)};
    }

    /* renamed from: luminance-8_81llA */
    public static final float m1749luminance8_81llA(long j) {
        ColorSpace m1700getColorSpaceimpl = Color.m1700getColorSpaceimpl(j);
        if (!ColorModel.m2058equalsimpl0(m1700getColorSpaceimpl.m2067getModelxdoWZVw(), ColorModel.Companion.m2065getRgbxdoWZVw())) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m2061toStringimpl(m1700getColorSpaceimpl.m2067getModelxdoWZVw()))).toString());
        }
        Intrinsics.checkNotNull(m1700getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        Function1<Double, Double> eotf = ((Rgb) m1700getColorSpaceimpl).getEotf();
        return saturate((float) ((eotf.invoke(Double.valueOf(Color.m1702getRedimpl(j))).doubleValue() * 0.2126d) + (eotf.invoke(Double.valueOf(Color.m1701getGreenimpl(j))).doubleValue() * 0.7152d) + (eotf.invoke(Double.valueOf(Color.m1699getBlueimpl(j))).doubleValue() * 0.0722d)));
    }

    /* renamed from: toArgb-8_81llA */
    public static final int m1751toArgb8_81llA(long j) {
        ColorSpace m1700getColorSpaceimpl = Color.m1700getColorSpaceimpl(j);
        if (m1700getColorSpaceimpl.isSrgb()) {
            return (int) ULong.m4921constructorimpl(j >>> 32);
        }
        float[] m1743getComponents8_81llA = m1743getComponents8_81llA(j);
        ColorSpaceKt.m2069connectYBCOT_4$default(m1700getColorSpaceimpl, null, 0, 3, null).transform(m1743getComponents8_81llA);
        return ((int) ((m1743getComponents8_81llA[2] * 255.0f) + 0.5f)) | (((int) ((m1743getComponents8_81llA[3] * 255.0f) + 0.5f)) << 24) | (((int) ((m1743getComponents8_81llA[0] * 255.0f) + 0.5f)) << 16) | (((int) ((m1743getComponents8_81llA[1] * 255.0f) + 0.5f)) << 8);
    }

    /* renamed from: isSpecified-8_81llA */
    public static final boolean m1744isSpecified8_81llA(long j) {
        return j != Color.Companion.m1732getUnspecified0d7_KjU();
    }

    /* renamed from: isUnspecified-8_81llA */
    public static final boolean m1746isUnspecified8_81llA(long j) {
        return j == Color.Companion.m1732getUnspecified0d7_KjU();
    }

    /* renamed from: takeOrElse-DxMtmZc */
    public static final long m1750takeOrElseDxMtmZc(long j, Function0<Color> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (j > Color.Companion.m1732getUnspecified0d7_KjU() ? 1 : (j == Color.Companion.m1732getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j : block.invoke().m1706unboximpl();
    }
}
