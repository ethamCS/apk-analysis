package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: FocusProperties.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/focus/FocusRequester;", "it", "Landroidx/compose/ui/focus/FocusDirection;", "invoke-3ESFkO8", "(I)Landroidx/compose/ui/focus/FocusRequester;"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FocusPropertiesKt$clear$2 extends Lambda implements Function1<FocusDirection, FocusRequester> {
    public static final FocusPropertiesKt$clear$2 INSTANCE = new FocusPropertiesKt$clear$2();

    FocusPropertiesKt$clear$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
        return m1410invoke3ESFkO8(focusDirection.m1387unboximpl());
    }

    /* renamed from: invoke-3ESFkO8 */
    public final FocusRequester m1410invoke3ESFkO8(int i) {
        return FocusRequester.Companion.getDefault();
    }
}
