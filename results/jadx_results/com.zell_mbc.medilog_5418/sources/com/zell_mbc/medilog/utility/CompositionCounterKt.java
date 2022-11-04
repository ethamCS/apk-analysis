package com.zell_mbc.medilog.utility;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CompositionCounter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0087\b¢\u0006\u0002\u0010\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"EnableDebugCompositionLogs", "", "CompositionCounter", "", "tag", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CompositionCounterKt {
    public static final boolean EnableDebugCompositionLogs = true;

    public static final void CompositionCounter(String tag, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        composer.startReplaceableGroup(-1089689207);
        ComposerKt.sourceInformation(composer, "C(CompositionCounter)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1089689207, i, -1, "com.zell_mbc.medilog.utility.CompositionCounter (CompositionCounter.kt:14)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
