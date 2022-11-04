package com.zell_mbc.medilog.bloodpressure;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.zell_mbc.medilog.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: BloodPressureInfoFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* renamed from: com.zell_mbc.medilog.bloodpressure.ComposableSingletons$BloodPressureInfoFragmentKt$lambda-1$1 */
/* loaded from: classes2.dex */
final class ComposableSingletons$BloodPressureInfoFragmentKt$lambda1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$BloodPressureInfoFragmentKt$lambda1$1 INSTANCE = new ComposableSingletons$BloodPressureInfoFragmentKt$lambda1$1();

    ComposableSingletons$BloodPressureInfoFragmentKt$lambda1$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1286462660, i, -1, "com.zell_mbc.medilog.bloodpressure.ComposableSingletons$BloodPressureInfoFragmentKt.lambda-1.<anonymous> (BloodPressureInfoFragment.kt:172)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_bloodpressure, composer, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 124);
            if (!ComposerKt.isTraceInProgress()) {
                return;
            }
            ComposerKt.traceEventEnd();
            return;
        }
        composer.skipToGroupEnd();
    }
}
