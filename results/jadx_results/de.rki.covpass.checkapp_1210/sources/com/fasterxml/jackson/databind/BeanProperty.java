package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Named;
import java.io.Serializable;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public interface BeanProperty extends Named {
    public static final JsonFormat.Value EMPTY_FORMAT = new JsonFormat.Value();
    public static final JsonInclude.Value EMPTY_INCLUDE = JsonInclude.Value.empty();

    /* loaded from: classes.dex */
    public static class Bogus implements BeanProperty {
        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            return JsonFormat.Value.empty();
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public PropertyName getFullName() {
            return PropertyName.NO_NAME;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public AnnotatedMember getMember() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public PropertyMetadata getMetadata() {
            return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.util.Named
        public String getName() {
            return BuildConfig.FLAVOR;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JavaType getType() {
            return TypeFactory.unknownType();
        }
    }

    /* loaded from: classes.dex */
    public static class Std implements BeanProperty, Serializable {
        protected final AnnotatedMember _member;
        protected final PropertyMetadata _metadata;
        protected final PropertyName _name;
        protected final JavaType _type;
        protected final PropertyName _wrapperName;

        public Std(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AnnotatedMember annotatedMember, PropertyMetadata propertyMetadata) {
            this._name = propertyName;
            this._type = javaType;
            this._wrapperName = propertyName2;
            this._metadata = propertyMetadata;
            this._member = annotatedMember;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            AnnotatedMember annotatedMember;
            JsonFormat.Value findFormat;
            JsonFormat.Value defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            return (annotationIntrospector == null || (annotatedMember = this._member) == null || (findFormat = annotationIntrospector.findFormat(annotatedMember)) == null) ? defaultPropertyFormat : defaultPropertyFormat.withOverrides(findFormat);
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
            AnnotatedMember annotatedMember;
            JsonInclude.Value findPropertyInclusion;
            JsonInclude.Value defaultInclusion = mapperConfig.getDefaultInclusion(cls, this._type.getRawClass());
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            return (annotationIntrospector == null || (annotatedMember = this._member) == null || (findPropertyInclusion = annotationIntrospector.findPropertyInclusion(annotatedMember)) == null) ? defaultInclusion : defaultInclusion.withOverrides(findPropertyInclusion);
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public PropertyName getFullName() {
            return this._name;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public AnnotatedMember getMember() {
            return this._member;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public PropertyMetadata getMetadata() {
            return this._metadata;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.util.Named
        public String getName() {
            return this._name.getSimpleName();
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JavaType getType() {
            return this._type;
        }

        public PropertyName getWrapperName() {
            return this._wrapperName;
        }
    }

    JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls);

    JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls);

    PropertyName getFullName();

    AnnotatedMember getMember();

    PropertyMetadata getMetadata();

    @Override // com.fasterxml.jackson.databind.util.Named
    String getName();

    JavaType getType();
}
