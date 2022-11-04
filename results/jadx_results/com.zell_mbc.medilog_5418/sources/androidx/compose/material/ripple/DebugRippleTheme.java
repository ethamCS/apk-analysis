package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
/* compiled from: RippleTheme.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u0004H\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\bH\u0017¢\u0006\u0002\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/material/ripple/DebugRippleTheme;", "Landroidx/compose/material/ripple/RippleTheme;", "()V", "defaultColor", "Landroidx/compose/ui/graphics/Color;", "defaultColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleAlpha;", "material-ripple_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class DebugRippleTheme implements RippleTheme {
    public static final DebugRippleTheme INSTANCE = new DebugRippleTheme();

    private DebugRippleTheme() {
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    /* renamed from: defaultColor-WaAFU9c */
    public long mo1115defaultColorWaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(2042140174);
        ComposerKt.sourceInformation(composer, "C(defaultColor):RippleTheme.kt#vhb33q");
        long m1317defaultRippleColor5vOe2sY = RippleTheme.Companion.m1317defaultRippleColor5vOe2sY(Color.Companion.m1722getBlack0d7_KjU(), true);
        composer.endReplaceableGroup();
        return m1317defaultRippleColor5vOe2sY;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    public RippleAlpha rippleAlpha(Composer composer, int i) {
        composer.startReplaceableGroup(-1629816343);
        ComposerKt.sourceInformation(composer, "C(rippleAlpha):RippleTheme.kt#vhb33q");
        RippleAlpha m1316defaultRippleAlphaDxMtmZc = RippleTheme.Companion.m1316defaultRippleAlphaDxMtmZc(Color.Companion.m1722getBlack0d7_KjU(), true);
        composer.endReplaceableGroup();
        return m1316defaultRippleAlphaDxMtmZc;
    }
}
