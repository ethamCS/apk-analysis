package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
/* compiled from: AnimateAsState.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class AnimateAsStateKt$animateValueAsState$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Channel<T> $channel;
    final /* synthetic */ T $targetValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$2(Channel<T> channel, T t) {
        super(0);
        this.$channel = channel;
        this.$targetValue = t;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final void invoke2() {
        this.$channel.mo6224trySendJP2dKIU(this.$targetValue);
    }
}
