package com.zell_mbc.medilog.bloodpressure;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyDsl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke", "androidx/compose/foundation/lazy/LazyDslKt$items$7"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BloodPressureInfoFragment$ShowTable$2$invoke$$inlined$items$default$3 extends Lambda implements Function1<Integer, Object> {
    final /* synthetic */ Function1 $contentType;
    final /* synthetic */ Object[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodPressureInfoFragment$ShowTable$2$invoke$$inlined$items$default$3(Function1 function1, Object[] objArr) {
        super(1);
        this.$contentType = function1;
        this.$items = objArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i) {
        return this.$contentType.invoke(this.$items[i]);
    }
}