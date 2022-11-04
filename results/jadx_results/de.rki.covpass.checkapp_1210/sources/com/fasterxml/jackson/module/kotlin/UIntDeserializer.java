package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import hc.t;
import kotlin.Metadata;
import tb.z;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/UIntDeserializer;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Ltb/z;", "Lcom/fasterxml/jackson/core/JsonParser;", "p", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", "deserialize-xfHcF5w", "(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)I", "deserialize", "<init>", "()V", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class UIntDeserializer extends StdDeserializer<z> {
    public static final UIntDeserializer INSTANCE = new UIntDeserializer();

    private UIntDeserializer() {
        super(z.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return z.a(m2deserializexfHcF5w(jsonParser, deserializationContext));
    }

    /* renamed from: deserialize-xfHcF5w */
    public int m2deserializexfHcF5w(JsonParser jsonParser, DeserializationContext deserializationContext) {
        t.e(jsonParser, "p");
        t.e(deserializationContext, "ctxt");
        z asUInt = UnsignedNumbersKt.asUInt(jsonParser.getLongValue());
        if (asUInt != null) {
            return asUInt.j();
        }
        throw new InputCoercionException(jsonParser, "Numeric value (" + ((Object) jsonParser.getText()) + ") out of range of UInt (0 - 4294967295).", JsonToken.VALUE_NUMBER_INT, z.class);
    }
}
