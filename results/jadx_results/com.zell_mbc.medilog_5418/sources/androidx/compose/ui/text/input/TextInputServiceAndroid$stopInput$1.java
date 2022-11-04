package androidx.compose.ui.text.input;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Landroidx/compose/ui/text/input/EditCommand;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class TextInputServiceAndroid$stopInput$1 extends Lambda implements Function1<List<? extends EditCommand>, Unit> {
    public static final TextInputServiceAndroid$stopInput$1 INSTANCE = new TextInputServiceAndroid$stopInput$1();

    TextInputServiceAndroid$stopInput$1() {
        super(1);
    }

    /* renamed from: invoke */
    public final void invoke2(List<? extends EditCommand> it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends EditCommand> list) {
        invoke2(list);
        return Unit.INSTANCE;
    }
}