package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: VelocityTracker.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\f\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"AssumePointerMoveStoppedMilliseconds", "", "DefaultWeight", "", "HistorySize", "HorizonMilliseconds", "MinSampleSize", "polyFitLeastSquares", "Landroidx/compose/ui/input/pointer/util/PolynomialFit;", "x", "", "y", "degree", "addPointerInputChange", "", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerInputChange;", "ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static final int MinSampleSize = 3;

    public static final void addPointerInputChange(VelocityTracker velocityTracker, PointerInputChange event) {
        Intrinsics.checkNotNullParameter(velocityTracker, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (PointerEventKt.changedToDownIgnoreConsumed(event)) {
            velocityTracker.m3182setCurrentPointerPositionAccumulatork4lQ0M$ui_release(event.m3077getPositionF1C5BW0());
            velocityTracker.resetTracking();
        }
        long m3078getPreviousPositionF1C5BW0 = event.m3078getPreviousPositionF1C5BW0();
        List<HistoricalChange> historical = event.getHistorical();
        int i = 0;
        int size = historical.size();
        while (i < size) {
            HistoricalChange historicalChange = historical.get(i);
            long m1463minusMKHz9U = Offset.m1463minusMKHz9U(historicalChange.m3007getPositionF1C5BW0(), m3078getPreviousPositionF1C5BW0);
            long m3007getPositionF1C5BW0 = historicalChange.m3007getPositionF1C5BW0();
            velocityTracker.m3182setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m1464plusMKHz9U(velocityTracker.m3181getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), m1463minusMKHz9U));
            velocityTracker.m3179addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.m3181getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
            i++;
            m3078getPreviousPositionF1C5BW0 = m3007getPositionF1C5BW0;
        }
        velocityTracker.m3182setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m1464plusMKHz9U(velocityTracker.m3181getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), Offset.m1463minusMKHz9U(event.m3077getPositionF1C5BW0(), m3078getPreviousPositionF1C5BW0)));
        velocityTracker.m3179addPositionUv8p0NA(event.getUptimeMillis(), velocityTracker.m3181getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
    }

    public static final PolynomialFit polyFitLeastSquares(List<Float> x, List<Float> y, int i) {
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        if (i < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        }
        if (x.size() != y.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        }
        if (x.isEmpty()) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        int size = i >= x.size() ? x.size() - 1 : i;
        int i2 = i + 1;
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        while (true) {
            f = 0.0f;
            if (i3 >= i2) {
                break;
            }
            arrayList.add(Float.valueOf(0.0f));
            i3++;
        }
        ArrayList arrayList2 = arrayList;
        int size2 = x.size();
        int i4 = size + 1;
        Matrix matrix = new Matrix(i4, size2);
        int i5 = 0;
        while (true) {
            f2 = 1.0f;
            if (i5 >= size2) {
                break;
            }
            matrix.set(0, i5, 1.0f);
            for (int i6 = 1; i6 < i4; i6++) {
                matrix.set(i6, i5, matrix.get(i6 - 1, i5) * x.get(i5).floatValue());
            }
            i5++;
        }
        Matrix matrix2 = new Matrix(i4, size2);
        Matrix matrix3 = new Matrix(i4, i4);
        int i7 = 0;
        while (i7 < i4) {
            for (int i8 = 0; i8 < size2; i8++) {
                matrix2.set(i7, i8, matrix.get(i7, i8));
            }
            for (int i9 = 0; i9 < i7; i9++) {
                float times = matrix2.getRow(i7).times(matrix2.getRow(i9));
                for (int i10 = 0; i10 < size2; i10++) {
                    matrix2.set(i7, i10, matrix2.get(i7, i10) - (matrix2.get(i9, i10) * times));
                }
            }
            float norm = matrix2.getRow(i7).norm();
            if (norm < 1.0E-6d) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f3 = 1.0f / norm;
            for (int i11 = 0; i11 < size2; i11++) {
                matrix2.set(i7, i11, matrix2.get(i7, i11) * f3);
            }
            int i12 = 0;
            while (i12 < i4) {
                matrix3.set(i7, i12, i12 < i7 ? 0.0f : matrix2.getRow(i7).times(matrix.getRow(i12)));
                i12++;
            }
            i7++;
        }
        Vector vector = new Vector(size2);
        for (int i13 = 0; i13 < size2; i13++) {
            vector.set(i13, y.get(i13).floatValue() * 1.0f);
        }
        int i14 = i4 - 1;
        for (int i15 = i14; -1 < i15; i15--) {
            arrayList2.set(i15, Float.valueOf(matrix2.getRow(i15).times(vector)));
            int i16 = i15 + 1;
            if (i16 <= i14) {
                int i17 = i14;
                while (true) {
                    arrayList2.set(i15, Float.valueOf(((Number) arrayList2.get(i15)).floatValue() - (matrix3.get(i15, i17) * ((Number) arrayList2.get(i17)).floatValue())));
                    if (i17 != i16) {
                        i17--;
                    }
                }
            }
            arrayList2.set(i15, Float.valueOf(((Number) arrayList2.get(i15)).floatValue() / matrix3.get(i15, i15)));
        }
        float f4 = 0.0f;
        for (int i18 = 0; i18 < size2; i18++) {
            f4 += y.get(i18).floatValue();
        }
        float f5 = f4 / size2;
        float f6 = 0.0f;
        for (int i19 = 0; i19 < size2; i19++) {
            float floatValue = y.get(i19).floatValue() - ((Number) arrayList2.get(0)).floatValue();
            float f7 = 1.0f;
            for (int i20 = 1; i20 < i4; i20++) {
                f7 *= x.get(i19).floatValue();
                floatValue -= ((Number) arrayList2.get(i20)).floatValue() * f7;
            }
            f6 += floatValue * 1.0f * floatValue;
            float floatValue2 = y.get(i19).floatValue() - f5;
            f += floatValue2 * 1.0f * floatValue2;
        }
        if (f > 1.0E-6f) {
            f2 = 1.0f - (f6 / f);
        }
        return new PolynomialFit(arrayList2, f2);
    }
}
