package androidx.compose.material.internal;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: ExposedDropdownMenuPopup.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PopupLayout$Content$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ PopupLayout $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout$Content$4(PopupLayout popupLayout, int i) {
        super(2);
        this.$tmp0_rcvr = popupLayout;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.Content(composer, this.$$changed | 1);
    }
}