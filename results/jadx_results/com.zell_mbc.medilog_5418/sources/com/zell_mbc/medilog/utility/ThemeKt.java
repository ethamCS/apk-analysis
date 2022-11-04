package com.zell_mbc.medilog.utility;

import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\u001a*\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"DarkColors", "Landroidx/compose/material/Colors;", "LightColors", "InfoScreenTheme", "", "darkTheme", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ListTheme", "app_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ThemeKt {
    private static final Colors DarkColors = ColorsKt.m1033darkColors2qZNXz8$default(ColorKt.getLightGray(), Color.Companion.m1733getWhite0d7_KjU(), ColorKt.getDarkGray(), 0, 0, 0, Color.Companion.m1730getRed0d7_KjU(), 0, Color.Companion.m1722getBlack0d7_KjU(), 0, 0, 0, 3768, null);
    private static final Colors LightColors;

    static {
        Colors m1034lightColors2qZNXz8;
        m1034lightColors2qZNXz8 = ColorsKt.m1034lightColors2qZNXz8((r43 & 1) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4284612846L) : ColorKt.getGray(), (r43 & 2) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4281794739L) : ColorKt.getDarkGray(), (r43 & 4) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4278442694L) : ColorKt.getLightGray(), (r43 & 8) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4278290310L) : 0L, (r43 & 16) != 0 ? Color.Companion.m1733getWhite0d7_KjU() : 0L, (r43 & 32) != 0 ? Color.Companion.m1733getWhite0d7_KjU() : 0L, (r43 & 64) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4289724448L) : Color.Companion.m1730getRed0d7_KjU(), (r43 & 128) != 0 ? Color.Companion.m1733getWhite0d7_KjU() : Color.Companion.m1733getWhite0d7_KjU(), (r43 & 256) != 0 ? Color.Companion.m1722getBlack0d7_KjU() : Color.Companion.m1733getWhite0d7_KjU(), (r43 & 512) != 0 ? Color.Companion.m1722getBlack0d7_KjU() : 0L, (r43 & 1024) != 0 ? Color.Companion.m1722getBlack0d7_KjU() : 0L, (r43 & 2048) != 0 ? Color.Companion.m1733getWhite0d7_KjU() : 0L);
        LightColors = m1034lightColors2qZNXz8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
        if ((r12 & 1) != 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ListTheme(boolean r8, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r9, androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 2006274138(0x7795505a, float:6.05689E33)
            androidx.compose.runtime.Composer r10 = r10.startRestartGroup(r0)
            java.lang.String r1 = "C(ListTheme)P(1)"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r11 & 14
            if (r1 != 0) goto L24
            r1 = r12 & 1
            if (r1 != 0) goto L21
            boolean r1 = r10.changed(r8)
            if (r1 == 0) goto L21
            r1 = 4
            goto L22
        L21:
            r1 = 2
        L22:
            r1 = r1 | r11
            goto L25
        L24:
            r1 = r11
        L25:
            r2 = r12 & 2
            if (r2 == 0) goto L2c
            r1 = r1 | 48
            goto L3c
        L2c:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L3c
            boolean r2 = r10.changed(r9)
            if (r2 == 0) goto L39
            r2 = 32
            goto L3b
        L39:
            r2 = 16
        L3b:
            r1 = r1 | r2
        L3c:
            r2 = r1 & 91
            r3 = 18
            if (r2 != r3) goto L4d
            boolean r2 = r10.getSkipping()
            if (r2 != 0) goto L49
            goto L4d
        L49:
            r10.skipToGroupEnd()
            goto L9a
        L4d:
            r10.startDefaults()
            r2 = r11 & 1
            if (r2 == 0) goto L63
            boolean r2 = r10.getDefaultsInvalid()
            if (r2 == 0) goto L5b
            goto L63
        L5b:
            r10.skipToGroupEnd()
            r2 = r12 & 1
            if (r2 == 0) goto L6e
            goto L6c
        L63:
            r2 = r12 & 1
            if (r2 == 0) goto L6e
            r8 = 0
            boolean r8 = androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(r10, r8)
        L6c:
            r1 = r1 & (-15)
        L6e:
            r10.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L7d
            r2 = -1
            java.lang.String r3 = "com.zell_mbc.medilog.utility.ListTheme (Theme.kt:28)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L7d:
            if (r8 == 0) goto L82
            androidx.compose.material.Colors r0 = com.zell_mbc.medilog.utility.ThemeKt.DarkColors
            goto L84
        L82:
            androidx.compose.material.Colors r0 = com.zell_mbc.medilog.utility.ThemeKt.LightColors
        L84:
            r2 = 0
            r3 = 0
            int r1 = r1 << 6
            r6 = r1 & 7168(0x1c00, float:1.0045E-41)
            r7 = 6
            r1 = r0
            r4 = r9
            r5 = r10
            androidx.compose.material.MaterialThemeKt.MaterialTheme(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L9a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L9a:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.endRestartGroup()
            if (r10 != 0) goto La1
            goto Lab
        La1:
            com.zell_mbc.medilog.utility.ThemeKt$ListTheme$1 r0 = new com.zell_mbc.medilog.utility.ThemeKt$ListTheme$1
            r0.<init>(r8, r9, r11, r12)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r10.updateScope(r0)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zell_mbc.medilog.utility.ThemeKt.ListTheme(boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
        if ((r12 & 1) != 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void InfoScreenTheme(boolean r8, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r9, androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = -2106561730(0xffffffff82706b3e, float:-1.7663192E-37)
            androidx.compose.runtime.Composer r10 = r10.startRestartGroup(r0)
            java.lang.String r1 = "C(InfoScreenTheme)P(1)"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r11 & 14
            if (r1 != 0) goto L24
            r1 = r12 & 1
            if (r1 != 0) goto L21
            boolean r1 = r10.changed(r8)
            if (r1 == 0) goto L21
            r1 = 4
            goto L22
        L21:
            r1 = 2
        L22:
            r1 = r1 | r11
            goto L25
        L24:
            r1 = r11
        L25:
            r2 = r12 & 2
            if (r2 == 0) goto L2c
            r1 = r1 | 48
            goto L3c
        L2c:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L3c
            boolean r2 = r10.changed(r9)
            if (r2 == 0) goto L39
            r2 = 32
            goto L3b
        L39:
            r2 = 16
        L3b:
            r1 = r1 | r2
        L3c:
            r2 = r1 & 91
            r3 = 18
            if (r2 != r3) goto L4d
            boolean r2 = r10.getSkipping()
            if (r2 != 0) goto L49
            goto L4d
        L49:
            r10.skipToGroupEnd()
            goto L9a
        L4d:
            r10.startDefaults()
            r2 = r11 & 1
            if (r2 == 0) goto L63
            boolean r2 = r10.getDefaultsInvalid()
            if (r2 == 0) goto L5b
            goto L63
        L5b:
            r10.skipToGroupEnd()
            r2 = r12 & 1
            if (r2 == 0) goto L6e
            goto L6c
        L63:
            r2 = r12 & 1
            if (r2 == 0) goto L6e
            r8 = 0
            boolean r8 = androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(r10, r8)
        L6c:
            r1 = r1 & (-15)
        L6e:
            r10.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L7d
            r2 = -1
            java.lang.String r3 = "com.zell_mbc.medilog.utility.InfoScreenTheme (Theme.kt:39)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L7d:
            if (r8 == 0) goto L82
            androidx.compose.material.Colors r0 = com.zell_mbc.medilog.utility.ThemeKt.DarkColors
            goto L84
        L82:
            androidx.compose.material.Colors r0 = com.zell_mbc.medilog.utility.ThemeKt.LightColors
        L84:
            r2 = 0
            r3 = 0
            int r1 = r1 << 6
            r6 = r1 & 7168(0x1c00, float:1.0045E-41)
            r7 = 6
            r1 = r0
            r4 = r9
            r5 = r10
            androidx.compose.material.MaterialThemeKt.MaterialTheme(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L9a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L9a:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.endRestartGroup()
            if (r10 != 0) goto La1
            goto Lab
        La1:
            com.zell_mbc.medilog.utility.ThemeKt$InfoScreenTheme$1 r0 = new com.zell_mbc.medilog.utility.ThemeKt$InfoScreenTheme$1
            r0.<init>(r8, r9, r11, r12)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r10.updateScope(r0)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zell_mbc.medilog.utility.ThemeKt.InfoScreenTheme(boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
