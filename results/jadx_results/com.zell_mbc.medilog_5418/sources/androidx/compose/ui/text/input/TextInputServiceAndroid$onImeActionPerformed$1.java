package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/input/ImeAction;", "invoke-KlQnJC8", "(I)V"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class TextInputServiceAndroid$onImeActionPerformed$1 extends Lambda implements Function1<ImeAction, Unit> {
    public static final TextInputServiceAndroid$onImeActionPerformed$1 INSTANCE = new TextInputServiceAndroid$onImeActionPerformed$1();

    TextInputServiceAndroid$onImeActionPerformed$1() {
        super(1);
    }

    /* renamed from: invoke-KlQnJC8 */
    public final void m3857invokeKlQnJC8(int i) {
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
        m3857invokeKlQnJC8(imeAction.m3808unboximpl());
        return Unit.INSTANCE;
    }
}
