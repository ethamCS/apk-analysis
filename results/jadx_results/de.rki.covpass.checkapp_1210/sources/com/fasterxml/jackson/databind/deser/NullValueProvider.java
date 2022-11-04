package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationContext;
/* loaded from: classes.dex */
public interface NullValueProvider {
    Object getAbsentValue(DeserializationContext deserializationContext);

    Object getNullValue(DeserializationContext deserializationContext);
}
