package coil.decode;

import coil.size.OriginalSize;
import coil.size.PixelSize;
import coil.size.Scale;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import okio.BufferedSource;
import okio.ByteString;
/* compiled from: DecodeUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J8\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u000e\u001a\u00020\u00192\b\b\u0001\u0010\u000f\u001a\u00020\u00192\b\b\u0001\u0010\u0010\u001a\u00020\u00192\b\b\u0001\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J8\u0010\u0018\u001a\u00020\u001a2\b\b\u0001\u0010\u000e\u001a\u00020\u001a2\b\b\u0001\u0010\u000f\u001a\u00020\u001a2\b\b\u0001\u0010\u0010\u001a\u00020\u001a2\b\b\u0001\u0010\u0011\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J8\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcoil/decode/DecodeUtils;", "", "()V", "GIF_HEADER", "Lokio/ByteString;", "HEIF_HEADER_FTYP", "HEIF_HEADER_HEVC", "HEIF_HEADER_HEVX", "HEIF_HEADER_MSF1", "WEBP_HEADER_RIFF", "WEBP_HEADER_VPX8", "WEBP_HEADER_WEBP", "calculateInSampleSize", "", "srcWidth", "srcHeight", "dstWidth", "dstHeight", "scale", "Lcoil/size/Scale;", "computePixelSize", "Lcoil/size/PixelSize;", "dstSize", "Lcoil/size/Size;", "computeSizeMultiplier", "", "", "isAnimatedHeif", "", "source", "Lokio/BufferedSource;", "isAnimatedWebP", "isGif", "isHeif", "isWebP", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class DecodeUtils {
    public static final DecodeUtils INSTANCE = new DecodeUtils();
    private static final ByteString GIF_HEADER = ByteString.Companion.encodeUtf8("GIF");
    private static final ByteString WEBP_HEADER_RIFF = ByteString.Companion.encodeUtf8("RIFF");
    private static final ByteString WEBP_HEADER_WEBP = ByteString.Companion.encodeUtf8("WEBP");
    private static final ByteString WEBP_HEADER_VPX8 = ByteString.Companion.encodeUtf8("VP8X");
    private static final ByteString HEIF_HEADER_FTYP = ByteString.Companion.encodeUtf8("ftyp");
    private static final ByteString HEIF_HEADER_MSF1 = ByteString.Companion.encodeUtf8("msf1");
    private static final ByteString HEIF_HEADER_HEVC = ByteString.Companion.encodeUtf8("hevc");
    private static final ByteString HEIF_HEADER_HEVX = ByteString.Companion.encodeUtf8("hevx");

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[Scale.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Scale.FILL.ordinal()] = 1;
            iArr[Scale.FIT.ordinal()] = 2;
            int[] iArr2 = new int[Scale.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[Scale.FILL.ordinal()] = 1;
            iArr2[Scale.FIT.ordinal()] = 2;
            int[] iArr3 = new int[Scale.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[Scale.FILL.ordinal()] = 1;
            iArr3[Scale.FIT.ordinal()] = 2;
            int[] iArr4 = new int[Scale.values().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[Scale.FILL.ordinal()] = 1;
            iArr4[Scale.FIT.ordinal()] = 2;
        }
    }

    private DecodeUtils() {
    }

    @JvmStatic
    public static final boolean isGif(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source.rangeEquals(0L, GIF_HEADER);
    }

    @JvmStatic
    public static final boolean isWebP(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source.rangeEquals(0L, WEBP_HEADER_RIFF) && source.rangeEquals(8L, WEBP_HEADER_WEBP);
    }

    @JvmStatic
    public static final boolean isAnimatedWebP(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return isWebP(source) && source.rangeEquals(12L, WEBP_HEADER_VPX8) && source.request(17L) && ((byte) (source.getBuffer().getByte(16L) & 2)) > 0;
    }

    @JvmStatic
    public static final boolean isHeif(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source.rangeEquals(4L, HEIF_HEADER_FTYP);
    }

    @JvmStatic
    public static final boolean isAnimatedHeif(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return isHeif(source) && (source.rangeEquals(8L, HEIF_HEADER_MSF1) || source.rangeEquals(8L, HEIF_HEADER_HEVC) || source.rangeEquals(8L, HEIF_HEADER_HEVX));
    }

    @JvmStatic
    public static final int calculateInSampleSize(int i, int i2, int i3, int i4, Scale scale) {
        Intrinsics.checkNotNullParameter(scale, "scale");
        int coerceAtLeast = RangesKt.coerceAtLeast(Integer.highestOneBit(i / i3), 1);
        int coerceAtLeast2 = RangesKt.coerceAtLeast(Integer.highestOneBit(i2 / i4), 1);
        int i5 = WhenMappings.$EnumSwitchMapping$0[scale.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Math.max(coerceAtLeast, coerceAtLeast2);
        }
        return Math.min(coerceAtLeast, coerceAtLeast2);
    }

    @JvmStatic
    public static final double computeSizeMultiplier(int i, int i2, int i3, int i4, Scale scale) {
        Intrinsics.checkNotNullParameter(scale, "scale");
        double d = i3 / i;
        double d2 = i4 / i2;
        int i5 = WhenMappings.$EnumSwitchMapping$1[scale.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Math.min(d, d2);
        }
        return Math.max(d, d2);
    }

    @JvmStatic
    public static final float computeSizeMultiplier(float f, float f2, float f3, float f4, Scale scale) {
        Intrinsics.checkNotNullParameter(scale, "scale");
        float f5 = f3 / f;
        float f6 = f4 / f2;
        int i = WhenMappings.$EnumSwitchMapping$2[scale.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Math.min(f5, f6);
        }
        return Math.max(f5, f6);
    }

    @JvmStatic
    public static final double computeSizeMultiplier(double d, double d2, double d3, double d4, Scale scale) {
        Intrinsics.checkNotNullParameter(scale, "scale");
        double d5 = d3 / d;
        double d6 = d4 / d2;
        int i = WhenMappings.$EnumSwitchMapping$3[scale.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Math.min(d5, d6);
        }
        return Math.max(d5, d6);
    }

    @JvmStatic
    public static final PixelSize computePixelSize(int i, int i2, Size dstSize, Scale scale) {
        Intrinsics.checkNotNullParameter(dstSize, "dstSize");
        Intrinsics.checkNotNullParameter(scale, "scale");
        if (dstSize instanceof OriginalSize) {
            return new PixelSize(i, i2);
        }
        if (!(dstSize instanceof PixelSize)) {
            throw new NoWhenBranchMatchedException();
        }
        PixelSize pixelSize = (PixelSize) dstSize;
        double computeSizeMultiplier = computeSizeMultiplier(i, i2, pixelSize.getWidth(), pixelSize.getHeight(), scale);
        return new PixelSize(MathKt.roundToInt(i * computeSizeMultiplier), MathKt.roundToInt(computeSizeMultiplier * i2));
    }
}
