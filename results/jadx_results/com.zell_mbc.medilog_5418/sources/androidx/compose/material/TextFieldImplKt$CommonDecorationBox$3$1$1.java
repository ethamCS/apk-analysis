package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: TextFieldImpl.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends Lambda implements Function1<Size, Unit> {
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ MutableState<Size> $labelSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$1$1(float f, MutableState<Size> mutableState) {
        super(1);
        this.$labelProgress = f;
        this.$labelSize = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Size size) {
        m1269invokeuvyYCjk(size.m1533unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-uvyYCjk */
    public final void m1269invokeuvyYCjk(long j) {
        float m1528getWidthimpl = Size.m1528getWidthimpl(j) * this.$labelProgress;
        float m1525getHeightimpl = Size.m1525getHeightimpl(j) * this.$labelProgress;
        boolean z = true;
        if (Size.m1528getWidthimpl(this.$labelSize.getValue().m1533unboximpl()) == m1528getWidthimpl) {
            if (Size.m1525getHeightimpl(this.$labelSize.getValue().m1533unboximpl()) != m1525getHeightimpl) {
                z = false;
            }
            if (z) {
                return;
            }
        }
        this.$labelSize.setValue(Size.m1516boximpl(SizeKt.Size(m1528getWidthimpl, m1525getHeightimpl)));
    }
}
