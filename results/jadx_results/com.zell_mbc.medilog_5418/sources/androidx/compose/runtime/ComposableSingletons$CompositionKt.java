package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: Composition.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$CompositionKt {
    public static final ComposableSingletons$CompositionKt INSTANCE = new ComposableSingletons$CompositionKt();

    /* renamed from: lambda-1 */
    public static Function2<Composer, Integer, Unit> f17lambda1 = ComposableLambdaKt.composableLambdaInstance(954879418, false, ComposableSingletons$CompositionKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2 */
    public static Function2<Composer, Integer, Unit> f18lambda2 = ComposableLambdaKt.composableLambdaInstance(1918065384, false, ComposableSingletons$CompositionKt$lambda2$1.INSTANCE);

    /* renamed from: getLambda-1$runtime_release */
    public final Function2<Composer, Integer, Unit> m1322getLambda1$runtime_release() {
        return f17lambda1;
    }

    /* renamed from: getLambda-2$runtime_release */
    public final Function2<Composer, Integer, Unit> m1323getLambda2$runtime_release() {
        return f18lambda2;
    }
}
