package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
/* loaded from: classes.dex */
public abstract class FilteredBeanPropertyWriter {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class MultiView extends BeanPropertyWriter {
        protected final BeanPropertyWriter _delegate;
        protected final Class<?>[] _views;

        protected MultiView(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
            super(beanPropertyWriter);
            this._delegate = beanPropertyWriter;
            this._views = clsArr;
        }

        private final boolean _inView(Class<?> cls) {
            if (cls == null) {
                return true;
            }
            int length = this._views.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this._views[i10].isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignNullSerializer(JsonSerializer<Object> jsonSerializer) {
            this._delegate.assignNullSerializer(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignSerializer(JsonSerializer<Object> jsonSerializer) {
            this._delegate.assignSerializer(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public MultiView rename(NameTransformer nameTransformer) {
            return new MultiView(this._delegate.rename(nameTransformer), this._views);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            if (_inView(serializerProvider.getActiveView())) {
                this._delegate.serializeAsElement(obj, jsonGenerator, serializerProvider);
            } else {
                this._delegate.serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            if (_inView(serializerProvider.getActiveView())) {
                this._delegate.serializeAsField(obj, jsonGenerator, serializerProvider);
            } else {
                this._delegate.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class SingleView extends BeanPropertyWriter {
        protected final BeanPropertyWriter _delegate;
        protected final Class<?> _view;

        protected SingleView(BeanPropertyWriter beanPropertyWriter, Class<?> cls) {
            super(beanPropertyWriter);
            this._delegate = beanPropertyWriter;
            this._view = cls;
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignNullSerializer(JsonSerializer<Object> jsonSerializer) {
            this._delegate.assignNullSerializer(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignSerializer(JsonSerializer<Object> jsonSerializer) {
            this._delegate.assignSerializer(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public SingleView rename(NameTransformer nameTransformer) {
            return new SingleView(this._delegate.rename(nameTransformer), this._view);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            Class<?> activeView = serializerProvider.getActiveView();
            if (activeView == null || this._view.isAssignableFrom(activeView)) {
                this._delegate.serializeAsElement(obj, jsonGenerator, serializerProvider);
            } else {
                this._delegate.serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            Class<?> activeView = serializerProvider.getActiveView();
            if (activeView == null || this._view.isAssignableFrom(activeView)) {
                this._delegate.serializeAsField(obj, jsonGenerator, serializerProvider);
            } else {
                this._delegate.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
            }
        }
    }

    public static BeanPropertyWriter constructViewBased(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        return clsArr.length == 1 ? new SingleView(beanPropertyWriter, clsArr[0]) : new MultiView(beanPropertyWriter, clsArr);
    }
}
