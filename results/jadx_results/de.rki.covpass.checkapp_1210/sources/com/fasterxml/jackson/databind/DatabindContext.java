package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Type;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public abstract class DatabindContext {
    private JavaType _resolveAndValidateGeneric(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator, int i10) {
        Object _throwSubtypeClassNotAllowed;
        MapperConfig<?> config = getConfig();
        PolymorphicTypeValidator.Validity validateSubClassName = polymorphicTypeValidator.validateSubClassName(config, javaType, str.substring(0, i10));
        if (validateSubClassName == PolymorphicTypeValidator.Validity.DENIED) {
            _throwSubtypeClassNotAllowed = _throwSubtypeNameNotAllowed(javaType, str, polymorphicTypeValidator);
        } else {
            JavaType constructFromCanonical = getTypeFactory().constructFromCanonical(str);
            if (!constructFromCanonical.isTypeOrSubTypeOf(javaType.getRawClass())) {
                _throwSubtypeClassNotAllowed = _throwNotASubtype(javaType, str);
            } else {
                PolymorphicTypeValidator.Validity validity = PolymorphicTypeValidator.Validity.ALLOWED;
                if (validateSubClassName == validity || polymorphicTypeValidator.validateSubType(config, javaType, constructFromCanonical) == validity) {
                    return constructFromCanonical;
                }
                _throwSubtypeClassNotAllowed = _throwSubtypeClassNotAllowed(javaType, str, polymorphicTypeValidator);
            }
        }
        return (JavaType) _throwSubtypeClassNotAllowed;
    }

    public String _colonConcat(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + ": " + str2;
    }

    public final String _format(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    public String _quotedString(String str) {
        return str == null ? "[N/A]" : String.format("\"%s\"", _truncate(str));
    }

    protected <T> T _throwNotASubtype(JavaType javaType, String str) {
        throw invalidTypeIdException(javaType, str, "Not a subtype");
    }

    protected <T> T _throwSubtypeClassNotAllowed(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) {
        throw invalidTypeIdException(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + ClassUtil.classNameOf(polymorphicTypeValidator) + ") denied resolution");
    }

    protected <T> T _throwSubtypeNameNotAllowed(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) {
        throw invalidTypeIdException(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + ClassUtil.classNameOf(polymorphicTypeValidator) + ") denied resolution");
    }

    protected final String _truncate(String str) {
        if (str == null) {
            return BuildConfig.FLAVOR;
        }
        if (str.length() <= 500) {
            return str;
        }
        return str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
    }

    public JavaType constructType(Type type) {
        if (type == null) {
            return null;
        }
        return getTypeFactory().constructType(type);
    }

    public Converter<Object, Object> converterInstance(Annotated annotated, Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Converter) {
            return (Converter) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == Converter.None.class || ClassUtil.isBogusClass(cls)) {
            return null;
        }
        if (Converter.class.isAssignableFrom(cls)) {
            MapperConfig<?> config = getConfig();
            config.getHandlerInstantiator();
            return (Converter) ClassUtil.createInstance(cls, config.canOverrideAccessModifiers());
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
    }

    public abstract MapperConfig<?> getConfig();

    public abstract TypeFactory getTypeFactory();

    protected abstract JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2);

    public ObjectIdGenerator<?> objectIdGeneratorInstance(Annotated annotated, ObjectIdInfo objectIdInfo) {
        Class<? extends ObjectIdGenerator<?>> generatorType = objectIdInfo.getGeneratorType();
        MapperConfig<?> config = getConfig();
        config.getHandlerInstantiator();
        return ((ObjectIdGenerator) ClassUtil.createInstance(generatorType, config.canOverrideAccessModifiers())).forScope(objectIdInfo.getScope());
    }

    public ObjectIdResolver objectIdResolverInstance(Annotated annotated, ObjectIdInfo objectIdInfo) {
        Class<? extends ObjectIdResolver> resolverType = objectIdInfo.getResolverType();
        MapperConfig<?> config = getConfig();
        config.getHandlerInstantiator();
        return (ObjectIdResolver) ClassUtil.createInstance(resolverType, config.canOverrideAccessModifiers());
    }

    public abstract <T> T reportBadDefinition(JavaType javaType, String str);

    public <T> T reportBadDefinition(Class<?> cls, String str) {
        return (T) reportBadDefinition(constructType(cls), str);
    }

    public JavaType resolveAndValidateSubType(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) {
        Object _throwSubtypeClassNotAllowed;
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            return _resolveAndValidateGeneric(javaType, str, polymorphicTypeValidator, indexOf);
        }
        MapperConfig<?> config = getConfig();
        PolymorphicTypeValidator.Validity validateSubClassName = polymorphicTypeValidator.validateSubClassName(config, javaType, str);
        if (validateSubClassName == PolymorphicTypeValidator.Validity.DENIED) {
            _throwSubtypeClassNotAllowed = _throwSubtypeNameNotAllowed(javaType, str, polymorphicTypeValidator);
        } else {
            try {
                Class<?> findClass = getTypeFactory().findClass(str);
                if (!javaType.isTypeOrSuperTypeOf(findClass)) {
                    _throwSubtypeClassNotAllowed = _throwNotASubtype(javaType, str);
                } else {
                    JavaType constructSpecializedType = config.getTypeFactory().constructSpecializedType(javaType, findClass);
                    if (validateSubClassName != PolymorphicTypeValidator.Validity.INDETERMINATE || polymorphicTypeValidator.validateSubType(config, javaType, constructSpecializedType) == PolymorphicTypeValidator.Validity.ALLOWED) {
                        return constructSpecializedType;
                    }
                    _throwSubtypeClassNotAllowed = _throwSubtypeClassNotAllowed(javaType, str, polymorphicTypeValidator);
                }
            } catch (ClassNotFoundException unused) {
                return null;
            } catch (Exception e10) {
                throw invalidTypeIdException(javaType, str, String.format("problem: (%s) %s", e10.getClass().getName(), ClassUtil.exceptionMessage(e10)));
            }
        }
        return (JavaType) _throwSubtypeClassNotAllowed;
    }
}
