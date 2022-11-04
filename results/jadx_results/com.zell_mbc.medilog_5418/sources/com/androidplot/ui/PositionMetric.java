package com.androidplot.ui;

import java.lang.Enum;
/* loaded from: classes2.dex */
public abstract class PositionMetric<LayoutType extends Enum> extends LayoutMetric<LayoutType> {

    /* loaded from: classes2.dex */
    protected enum LayoutMode {
        ABSOLUTE,
        RELATIVE
    }

    /* loaded from: classes2.dex */
    protected enum Origin {
        FROM_BEGINING,
        FROM_CENTER,
        FROM_END
    }

    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ Enum getLayoutType() {
        return super.getLayoutType();
    }

    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ float getValue() {
        return super.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ void set(float f, Enum r2) {
        super.set(f, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ void setLayoutType(Enum r1) {
        super.setLayoutType(r1);
    }

    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ void setValue(float f) {
        super.setValue(f);
    }

    public PositionMetric(float f, LayoutType layouttype) {
        super(f, layouttype);
    }

    public static void validateValue(float f, LayoutMode layoutMode) throws IllegalArgumentException {
        int i = AnonymousClass1.$SwitchMap$com$androidplot$ui$PositionMetric$LayoutMode[layoutMode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (f >= -1.0f && f <= 1.0f) {
                    return;
                }
                throw new IllegalArgumentException("Relative layout values must be within the range of -1 to 1.");
            }
            throw new IllegalArgumentException("Unknown LayoutMode: " + layoutMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.androidplot.ui.PositionMetric$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$PositionMetric$LayoutMode;
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$PositionMetric$Origin;

        static {
            int[] iArr = new int[Origin.values().length];
            $SwitchMap$com$androidplot$ui$PositionMetric$Origin = iArr;
            try {
                iArr[Origin.FROM_BEGINING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$ui$PositionMetric$Origin[Origin.FROM_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$ui$PositionMetric$Origin[Origin.FROM_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LayoutMode.values().length];
            $SwitchMap$com$androidplot$ui$PositionMetric$LayoutMode = iArr2;
            try {
                iArr2[LayoutMode.ABSOLUTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$androidplot$ui$PositionMetric$LayoutMode[LayoutMode.RELATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public float getAbsolutePosition(float f, Origin origin) {
        int i = AnonymousClass1.$SwitchMap$com$androidplot$ui$PositionMetric$Origin[origin.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return (f / 2.0f) + getValue();
            }
            if (i == 3) {
                return f - getValue();
            }
            throw new IllegalArgumentException("Unsupported Origin: " + origin);
        }
        return getValue();
    }

    public float getRelativePosition(float f, Origin origin) {
        int i = AnonymousClass1.$SwitchMap$com$androidplot$ui$PositionMetric$Origin[origin.ordinal()];
        if (i != 1) {
            if (i == 2) {
                float f2 = f / 2.0f;
                return f2 + (getValue() * f2);
            } else if (i == 3) {
                return f + (getValue() * f);
            } else {
                throw new IllegalArgumentException("Unsupported Origin: " + origin);
            }
        }
        return f * getValue();
    }
}
