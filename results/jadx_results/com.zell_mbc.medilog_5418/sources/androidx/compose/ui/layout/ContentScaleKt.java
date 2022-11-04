package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
/* compiled from: ContentScale.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"computeFillHeight", "", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeFillHeight-iLBOSCw", "(JJ)F", "computeFillMaxDimension", "computeFillMaxDimension-iLBOSCw", "computeFillMinDimension", "computeFillMinDimension-iLBOSCw", "computeFillWidth", "computeFillWidth-iLBOSCw", "ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ContentScaleKt {
    /* renamed from: access$computeFillHeight-iLBOSCw */
    public static final /* synthetic */ float m3198access$computeFillHeightiLBOSCw(long j, long j2) {
        return m3202computeFillHeightiLBOSCw(j, j2);
    }

    /* renamed from: access$computeFillMaxDimension-iLBOSCw */
    public static final /* synthetic */ float m3199access$computeFillMaxDimensioniLBOSCw(long j, long j2) {
        return m3203computeFillMaxDimensioniLBOSCw(j, j2);
    }

    /* renamed from: access$computeFillMinDimension-iLBOSCw */
    public static final /* synthetic */ float m3200access$computeFillMinDimensioniLBOSCw(long j, long j2) {
        return m3204computeFillMinDimensioniLBOSCw(j, j2);
    }

    /* renamed from: access$computeFillWidth-iLBOSCw */
    public static final /* synthetic */ float m3201access$computeFillWidthiLBOSCw(long j, long j2) {
        return m3205computeFillWidthiLBOSCw(j, j2);
    }

    /* renamed from: computeFillMaxDimension-iLBOSCw */
    public static final float m3203computeFillMaxDimensioniLBOSCw(long j, long j2) {
        return Math.max(m3205computeFillWidthiLBOSCw(j, j2), m3202computeFillHeightiLBOSCw(j, j2));
    }

    /* renamed from: computeFillMinDimension-iLBOSCw */
    public static final float m3204computeFillMinDimensioniLBOSCw(long j, long j2) {
        return Math.min(m3205computeFillWidthiLBOSCw(j, j2), m3202computeFillHeightiLBOSCw(j, j2));
    }

    /* renamed from: computeFillWidth-iLBOSCw */
    public static final float m3205computeFillWidthiLBOSCw(long j, long j2) {
        return Size.m1528getWidthimpl(j2) / Size.m1528getWidthimpl(j);
    }

    /* renamed from: computeFillHeight-iLBOSCw */
    public static final float m3202computeFillHeightiLBOSCw(long j, long j2) {
        return Size.m1525getHeightimpl(j2) / Size.m1525getHeightimpl(j);
    }
}
