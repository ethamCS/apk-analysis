package com.afollestad.materialdialogs.utils;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: IntArrays.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/afollestad/materialdialogs/utils/IntArraysKt$removeAll$1$1"}, k = 3, mv = {1, 1, 16})
/* loaded from: classes2.dex */
final class IntArraysKt$removeAll$$inlined$apply$lambda$1 extends Lambda implements Function1<Integer, Boolean> {
    final /* synthetic */ Collection $values$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntArraysKt$removeAll$$inlined$apply$lambda$1(Collection collection) {
        super(1);
        this.$values$inlined = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return Boolean.valueOf(invoke(num.intValue()));
    }

    public final boolean invoke(int i) {
        return this.$values$inlined.contains(Integer.valueOf(i));
    }
}
