package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
/* compiled from: PinnableParent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"$\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ModifierLocalPinnableParent", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/foundation/lazy/layout/PinnableParent;", "getModifierLocalPinnableParent$annotations", "()V", "getModifierLocalPinnableParent", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "foundation_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PinnableParentKt {
    private static final ProvidableModifierLocal<PinnableParent> ModifierLocalPinnableParent = ModifierLocalKt.modifierLocalOf(PinnableParentKt$ModifierLocalPinnableParent$1.INSTANCE);

    @ExperimentalFoundationApi
    public static /* synthetic */ void getModifierLocalPinnableParent$annotations() {
    }

    @ExperimentalFoundationApi
    public static final ProvidableModifierLocal<PinnableParent> getModifierLocalPinnableParent() {
        return ModifierLocalPinnableParent;
    }
}
