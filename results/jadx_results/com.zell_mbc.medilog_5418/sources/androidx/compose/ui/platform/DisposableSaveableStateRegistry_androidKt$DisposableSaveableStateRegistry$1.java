package androidx.compose.ui.platform;

import androidx.savedstate.SavedStateRegistry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: DisposableSaveableStateRegistry.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ SavedStateRegistry $androidxRegistry;
    final /* synthetic */ String $key;
    final /* synthetic */ boolean $registered;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(boolean z, SavedStateRegistry savedStateRegistry, String str) {
        super(0);
        this.$registered = z;
        this.$androidxRegistry = savedStateRegistry;
        this.$key = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final void invoke2() {
        if (this.$registered) {
            this.$androidxRegistry.unregisterSavedStateProvider(this.$key);
        }
    }
}