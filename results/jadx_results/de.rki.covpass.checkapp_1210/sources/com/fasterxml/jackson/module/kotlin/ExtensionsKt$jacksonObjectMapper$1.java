package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.json.JsonMapper;
import gc.l;
import hc.t;
import hc.v;
import kotlin.Metadata;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/fasterxml/jackson/databind/json/JsonMapper$Builder;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class ExtensionsKt$jacksonObjectMapper$1 extends v implements l<JsonMapper.Builder, e0> {
    public static final ExtensionsKt$jacksonObjectMapper$1 INSTANCE = new ExtensionsKt$jacksonObjectMapper$1();

    ExtensionsKt$jacksonObjectMapper$1() {
        super(1);
    }

    @Override // gc.l
    public /* bridge */ /* synthetic */ e0 invoke(JsonMapper.Builder builder) {
        invoke2(builder);
        return e0.f22152a;
    }

    /* renamed from: invoke */
    public final void invoke2(JsonMapper.Builder builder) {
        t.e(builder, "$this$jsonMapper");
        builder.addModule(ExtensionsKt.kotlinModule$default(null, 1, null));
    }
}
