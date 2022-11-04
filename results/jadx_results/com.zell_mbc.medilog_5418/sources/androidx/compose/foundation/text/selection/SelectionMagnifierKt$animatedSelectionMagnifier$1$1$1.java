package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: SelectionMagnifier.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1 extends Lambda implements Function0<Offset> {
    final /* synthetic */ State<Offset> $animatedCenter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1(State<Offset> state) {
        super(0);
        this.$animatedCenter$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Offset invoke() {
        return Offset.m1448boximpl(m851invokeF1C5BW0());
    }

    /* renamed from: invoke-F1C5BW0 */
    public final long m851invokeF1C5BW0() {
        long m850invoke$lambda0;
        m850invoke$lambda0 = SelectionMagnifierKt$animatedSelectionMagnifier$1.m850invoke$lambda0(this.$animatedCenter$delegate);
        return m850invoke$lambda0;
    }
}
