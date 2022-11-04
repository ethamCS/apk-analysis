package com.androidplot.ui;

import com.androidplot.ui.PositionMetric;
/* loaded from: classes2.dex */
public class HorizontalPosition extends PositionMetric<HorizontalPositioning> {
    public HorizontalPosition(float f, HorizontalPositioning horizontalPositioning) {
        super(f, horizontalPositioning);
        validatePair(f, horizontalPositioning);
    }

    /* renamed from: com.androidplot.ui.HorizontalPosition$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$HorizontalPositioning;

        static {
            int[] iArr = new int[HorizontalPositioning.values().length];
            $SwitchMap$com$androidplot$ui$HorizontalPositioning = iArr;
            try {
                iArr[HorizontalPositioning.ABSOLUTE_FROM_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$ui$HorizontalPositioning[HorizontalPositioning.ABSOLUTE_FROM_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$ui$HorizontalPositioning[HorizontalPositioning.ABSOLUTE_FROM_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$androidplot$ui$HorizontalPositioning[HorizontalPositioning.RELATIVE_TO_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$androidplot$ui$HorizontalPositioning[HorizontalPositioning.RELATIVE_TO_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$androidplot$ui$HorizontalPositioning[HorizontalPositioning.RELATIVE_TO_CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public void validatePair(float f, HorizontalPositioning horizontalPositioning) {
        switch (AnonymousClass1.$SwitchMap$com$androidplot$ui$HorizontalPositioning[horizontalPositioning.ordinal()]) {
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
        switch (AnonymousClass1.$SwitchMap$com$androidplot$ui$HorizontalPositioning[((HorizontalPositioning) getLayoutType()).ordinal()]) {
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

    public void setLayoutType(HorizontalPositioning horizontalPositioning) {
        super.setLayoutType((Enum) horizontalPositioning);
    }
}
