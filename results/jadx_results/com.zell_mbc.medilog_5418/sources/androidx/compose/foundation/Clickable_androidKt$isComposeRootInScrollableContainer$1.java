package androidx.compose.foundation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: Clickable.android.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Clickable_androidKt$isComposeRootInScrollableContainer$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Clickable_androidKt$isComposeRootInScrollableContainer$1(View view) {
        super(0);
        this.$view = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean isInScrollableViewGroup;
        isInScrollableViewGroup = Clickable_androidKt.isInScrollableViewGroup(this.$view);
        return Boolean.valueOf(isInScrollableViewGroup);
    }
}
