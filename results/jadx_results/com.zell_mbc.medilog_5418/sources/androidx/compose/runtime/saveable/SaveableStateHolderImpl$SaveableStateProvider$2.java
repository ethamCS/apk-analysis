package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: SaveableStateHolder.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SaveableStateHolderImpl$SaveableStateProvider$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ Object $key;
    final /* synthetic */ SaveableStateHolderImpl $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SaveableStateHolderImpl$SaveableStateProvider$2(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, Function2<? super Composer, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$tmp0_rcvr = saveableStateHolderImpl;
        this.$key = obj;
        this.$content = function2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.SaveableStateProvider(this.$key, this.$content, composer, this.$$changed | 1);
    }
}
