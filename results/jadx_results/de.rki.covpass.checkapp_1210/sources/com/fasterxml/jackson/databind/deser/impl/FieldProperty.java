package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class FieldProperty extends SettableBeanProperty {
    protected final AnnotatedField _annotated;
    protected final transient Field _field;
    protected final boolean _skipNulls;

    protected FieldProperty(FieldProperty fieldProperty, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super(fieldProperty, jsonDeserializer, nullValueProvider);
        this._annotated = fieldProperty._annotated;
        this._field = fieldProperty._field;
        this._skipNulls = NullsConstantProvider.isSkipper(nullValueProvider);
    }

    protected FieldProperty(FieldProperty fieldProperty, PropertyName propertyName) {
        super(fieldProperty, propertyName);
        this._annotated = fieldProperty._annotated;
        this._field = fieldProperty._field;
        this._skipNulls = fieldProperty._skipNulls;
    }

    public FieldProperty(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedField annotatedField) {
        super(beanPropertyDefinition, javaType, typeDeserializer, annotations);
        this._annotated = annotatedField;
        this._field = annotatedField.getAnnotated();
        this._skipNulls = NullsConstantProvider.isSkipper(this._nullProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object obj2;
        try {
            if (!jsonParser.hasToken(JsonToken.VALUE_NULL)) {
                TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
                if (typeDeserializer == null) {
                    Object deserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                    if (deserialize != null) {
                        obj2 = deserialize;
                    } else if (this._skipNulls) {
                        return;
                    }
                } else {
                    obj2 = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                }
                this._field.set(obj, obj2);
                return;
            } else if (this._skipNulls) {
                return;
            }
            this._field.set(obj, obj2);
            return;
        } catch (Exception e10) {
            _throwAsIOE(jsonParser, e10, obj2);
            return;
        }
        obj2 = this._nullProvider.getNullValue(deserializationContext);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:2|(2:4|(1:6))(5:8|(2:10|(2:12|(1:14))(1:15))(1:16)|21|17|20)|7|21|17|20) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
        _throwAsIOE(r3, r0, r4);
     */
    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser r3, com.fasterxml.jackson.databind.DeserializationContext r4, java.lang.Object r5) {
        /*
            r2 = this;
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            boolean r0 = r3.hasToken(r0)
            if (r0 == 0) goto L14
            boolean r0 = r2._skipNulls
            if (r0 == 0) goto Ld
            return r5
        Ld:
            com.fasterxml.jackson.databind.deser.NullValueProvider r0 = r2._nullProvider
            java.lang.Object r4 = r0.getNullValue(r4)
            goto L2d
        L14:
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r0 = r2._valueTypeDeserializer
            if (r0 != 0) goto L27
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r2._valueDeserializer
            java.lang.Object r0 = r0.deserialize(r3, r4)
            if (r0 != 0) goto L25
            boolean r0 = r2._skipNulls
            if (r0 == 0) goto Ld
            return r5
        L25:
            r4 = r0
            goto L2d
        L27:
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r1 = r2._valueDeserializer
            java.lang.Object r4 = r1.deserializeWithType(r3, r4, r0)
        L2d:
            java.lang.reflect.Field r0 = r2._field     // Catch: java.lang.Exception -> L33
            r0.set(r5, r4)     // Catch: java.lang.Exception -> L33
            goto L37
        L33:
            r0 = move-exception
            r2._throwAsIOE(r3, r0, r4)
        L37:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(DeserializationConfig deserializationConfig) {
        ClassUtil.checkAndFixAccess(this._field, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._annotated;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) {
        try {
            this._field.set(obj, obj2);
        } catch (Exception e10) {
            _throwAsIOE(e10, obj2);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) {
        try {
            this._field.set(obj, obj2);
        } catch (Exception e10) {
            _throwAsIOE(e10, obj2);
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(PropertyName propertyName) {
        return new FieldProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
        return new FieldProperty(this, this._valueDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        JsonDeserializer<?> jsonDeserializer2 = this._valueDeserializer;
        if (jsonDeserializer2 == jsonDeserializer) {
            return this;
        }
        NullValueProvider nullValueProvider = this._nullProvider;
        if (jsonDeserializer2 == nullValueProvider) {
            nullValueProvider = jsonDeserializer;
        }
        return new FieldProperty(this, jsonDeserializer, nullValueProvider);
    }
}
