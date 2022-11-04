package com.zell_mbc.medilog.data;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: TabFragment.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TabFragment$ItemClicked$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $selectedItem;
    final /* synthetic */ TabFragment $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabFragment$ItemClicked$1(TabFragment tabFragment, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = tabFragment;
        this.$selectedItem = i;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.ItemClicked(this.$selectedItem, composer, this.$$changed | 1);
    }
}
