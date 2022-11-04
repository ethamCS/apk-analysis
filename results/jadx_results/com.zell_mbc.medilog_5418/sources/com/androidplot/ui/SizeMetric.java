package com.androidplot.ui;
/* loaded from: classes2.dex */
public class SizeMetric extends LayoutMetric<SizeMode> {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.androidplot.ui.SizeMode] */
    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ SizeMode getLayoutType() {
        return super.getLayoutType();
    }

    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ float getValue() {
        return super.getValue();
    }

    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ void set(float f, SizeMode sizeMode) {
        super.set(f, sizeMode);
    }

    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ void setValue(float f) {
        super.setValue(f);
    }

    public SizeMetric(float f, SizeMode sizeMode) {
        super(f, sizeMode);
    }

    /* renamed from: com.androidplot.ui.SizeMetric$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$SizeMode;

        static {
            int[] iArr = new int[SizeMode.values().length];
            $SwitchMap$com$androidplot$ui$SizeMode = iArr;
            try {
                iArr[SizeMode.RELATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$ui$SizeMode[SizeMode.ABSOLUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$ui$SizeMode[SizeMode.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public void validatePair(float f, SizeMode sizeMode) {
        if (AnonymousClass1.$SwitchMap$com$androidplot$ui$SizeMode[sizeMode.ordinal()] != 1) {
            return;
        }
        if (f >= 0.0f && f <= 1.0f) {
            return;
        }
        throw new IllegalArgumentException("SizeMetric Relative and Hybrid layout values must be within the range of 0 to 1.");
    }

    @Override // com.androidplot.ui.LayoutMetric
    public float getPixelValue(float f) {
        int i = AnonymousClass1.$SwitchMap$com$androidplot$ui$SizeMode[((SizeMode) getLayoutType()).ordinal()];
        if (i != 1) {
            if (i == 2) {
                return getValue();
            }
            if (i == 3) {
                return f - getValue();
            }
            throw new IllegalArgumentException("Unsupported LayoutType: " + getLayoutType());
        }
        return getValue() * f;
    }

    public void setLayoutType(SizeMode sizeMode) {
        super.setLayoutType((SizeMetric) sizeMode);
    }
}
