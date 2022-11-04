package com.zell_mbc.medilog.utility;

import androidx.compose.foundation.shape.CutCornerShapeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.Shapes;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
/* compiled from: Shape.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"MediLogShapes", "Landroidx/compose/material/Shapes;", "getMediLogShapes", "()Landroidx/compose/material/Shapes;", "app_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ShapeKt {
    private static final Shapes MediLogShapes;

    static {
        float f = 8;
        MediLogShapes = new Shapes(CutCornerShapeKt.m700CutCornerShapea9UjIt4$default(Dp.m4106constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), CutCornerShapeKt.m700CutCornerShapea9UjIt4$default(Dp.m4106constructorimpl(24), 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m705RoundedCornerShape0680j_4(Dp.m4106constructorimpl(f)));
    }

    public static final Shapes getMediLogShapes() {
        return MediLogShapes;
    }
}
