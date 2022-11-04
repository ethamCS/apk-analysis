package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: Composables.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 176)
/* loaded from: classes.dex */
public final class ComposablesKt$ReusableComposeNode$1 extends Lambda implements Function0<T> {
    final /* synthetic */ Function0<T> $factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposablesKt$ReusableComposeNode$1(Function0<? extends T> function0) {
        super(0);
        this.$factory = function0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        return this.$factory.invoke();
    }
}
