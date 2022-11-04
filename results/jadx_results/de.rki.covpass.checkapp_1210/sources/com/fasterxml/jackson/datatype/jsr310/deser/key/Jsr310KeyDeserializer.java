package com.fasterxml.jackson.datatype.jsr310.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import j$.time.DateTimeException;
import java.io.IOException;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
abstract class Jsr310KeyDeserializer extends KeyDeserializer {
    public <T> T _handleDateTimeException(DeserializationContext deserializationContext, Class<?> cls, DateTimeException dateTimeException, String str) {
        try {
            return (T) deserializationContext.handleWeirdKey(cls, str, "Failed to deserialize %s: (%s) %s", cls.getName(), dateTimeException.getClass().getName(), dateTimeException.getMessage());
        } catch (JsonMappingException e10) {
            e10.initCause(dateTimeException);
            throw e10;
        } catch (IOException e11) {
            if (e11.getCause() == null) {
                e11.initCause(dateTimeException);
            }
            throw JsonMappingException.fromUnexpectedIOE(e11);
        }
    }

    protected abstract Object deserialize(String str, DeserializationContext deserializationContext);

    @Override // com.fasterxml.jackson.databind.KeyDeserializer
    public final Object deserializeKey(String str, DeserializationContext deserializationContext) {
        if (BuildConfig.FLAVOR.equals(str)) {
            return null;
        }
        return deserialize(str, deserializationContext);
    }
}
