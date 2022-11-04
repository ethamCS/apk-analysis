package com.androidplot.ui;

import com.androidplot.ui.PositionMetric;
/* loaded from: classes2.dex */
public class VerticalPosition extends PositionMetric<VerticalPositioning> {
    public VerticalPosition(float f, VerticalPositioning verticalPositioning) {
        super(f, verticalPositioning);
    }

    /* renamed from: com.androidplot.ui.VerticalPosition$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$VerticalPositioning;

        static {
            int[] iArr = new int[VerticalPositioning.values().length];
            $SwitchMap$com$androidplot$ui$VerticalPositioning = iArr;
            try {
                iArr[VerticalPositioning.ABSOLUTE_FROM_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$ui$VerticalPositioning[VerticalPositioning.ABSOLUTE_FROM_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$ui$VerticalPositioning[VerticalPositioning.ABSOLUTE_FROM_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$androidplot$ui$VerticalPositioning[VerticalPositioning.RELATIVE_TO_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$androidplot$ui$VerticalPositioning[VerticalPositioning.RELATIVE_TO_BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$androidplot$ui$VerticalPositioning[VerticalPositioning.RELATIVE_TO_CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public void validatePair(float f, VerticalPositioning verticalPositioning) {
        switch (AnonymousClass1.$SwitchMap$com$androidplot$ui$VerticalPositioning[verticalPositioning.ordinal()]) {
            case 1:
            case 2:
            case 3:
                validateValue(f, PositionMetric.LayoutMode.ABSOLUTE);
                return;
            case 4:
            case 5:
            case 6:
                validateValue(f, PositionMetric.LayoutMode.RELATIVE);
                return;
            default:
                return;
        }
    }

    @Override // com.androidplot.ui.LayoutMetric
    public float getPixelValue(float f) {
        switch (AnonymousClass1.$SwitchMap$com$androidplot$ui$VerticalPositioning[((VerticalPositioning) getLayoutType()).ordinal()]) {
            case 1:
                return getAbsolutePosition(f, PositionMetric.Origin.FROM_BEGINING);
            case 2:
                return getAbsolutePosition(f, PositionMetric.Origin.FROM_END);
            case 3:
                return getAbsolutePosition(f, PositionMetric.Origin.FROM_CENTER);
            case 4:
                return getRelativePosition(f, PositionMetric.Origin.FROM_BEGINING);
            case 5:
                return getRelativePosition(f, PositionMetric.Origin.FROM_END);
            case 6:
                return getRelativePosition(f, PositionMetric.Origin.FROM_CENTER);
            default:
                throw new IllegalArgumentException("Unsupported LayoutType: " + getLayoutType());
        }
    }

    public void setLayoutType(VerticalPositioning verticalPositioning) {
        super.setLayoutType((Enum) verticalPositioning);
    }
}
