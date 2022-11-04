package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Member;
import java.util.HashMap;
/* loaded from: classes.dex */
public class CreatorCollector {
    protected static final String[] TYPE_DESCS = {"default", "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};
    protected SettableBeanProperty[] _arrayDelegateArgs;
    protected final BeanDescription _beanDesc;
    protected final boolean _canFixAccess;
    protected SettableBeanProperty[] _delegateArgs;
    protected final boolean _forceAccess;
    protected SettableBeanProperty[] _propertyBasedArgs;
    protected final AnnotatedWithParams[] _creators = new AnnotatedWithParams[11];
    protected int _explicitCreators = 0;
    protected boolean _hasNonDefaultCreator = false;

    public CreatorCollector(BeanDescription beanDescription, MapperConfig<?> mapperConfig) {
        this._beanDesc = beanDescription;
        this._canFixAccess = mapperConfig.canOverrideAccessModifiers();
        this._forceAccess = mapperConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    private JavaType _computeDelegateType(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) {
        if (!this._hasNonDefaultCreator || annotatedWithParams == null) {
            return null;
        }
        int i10 = 0;
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (settableBeanPropertyArr[i11] == null) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        }
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType parameterType = annotatedWithParams.getParameterType(i10);
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return parameterType;
        }
        AnnotatedParameter parameter = annotatedWithParams.getParameter(i10);
        Object findDeserializer = annotationIntrospector.findDeserializer(parameter);
        return findDeserializer != null ? parameterType.withValueHandler(deserializationContext.deserializerInstance(parameter, findDeserializer)) : annotationIntrospector.refineDeserializationType(config, parameter, parameterType);
    }

    private <T extends AnnotatedMember> T _fixAccess(T t10) {
        if (t10 != null && this._canFixAccess) {
            ClassUtil.checkAndFixAccess((Member) t10.getAnnotated(), this._forceAccess);
        }
        return t10;
    }

    protected boolean _isEnumValueOf(AnnotatedWithParams annotatedWithParams) {
        return ClassUtil.isEnumType(annotatedWithParams.getDeclaringClass()) && "valueOf".equals(annotatedWithParams.getName());
    }

    protected void _reportDuplicateCreator(int i10, boolean z10, AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2) {
        Object[] objArr = new Object[4];
        objArr[0] = TYPE_DESCS[i10];
        objArr[1] = z10 ? "explicitly marked" : "implicitly discovered";
        objArr[2] = annotatedWithParams;
        objArr[3] = annotatedWithParams2;
        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", objArr));
    }

    public void addBigDecimalCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 6, z10);
    }

    public void addBigIntegerCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 4, z10);
    }

    public void addBooleanCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 7, z10);
    }

    public void addDelegatingCreator(AnnotatedWithParams annotatedWithParams, boolean z10, SettableBeanProperty[] settableBeanPropertyArr, int i10) {
        if (annotatedWithParams.getParameterType(i10).isCollectionLikeType()) {
            if (!verifyNonDup(annotatedWithParams, 10, z10)) {
                return;
            }
            this._arrayDelegateArgs = settableBeanPropertyArr;
        } else if (!verifyNonDup(annotatedWithParams, 8, z10)) {
        } else {
            this._delegateArgs = settableBeanPropertyArr;
        }
    }

    public void addDoubleCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 5, z10);
    }

    public void addIntCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 2, z10);
    }

    public void addLongCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 3, z10);
    }

    public void addPropertyCreator(AnnotatedWithParams annotatedWithParams, boolean z10, SettableBeanProperty[] settableBeanPropertyArr) {
        Integer num;
        if (verifyNonDup(annotatedWithParams, 9, z10)) {
            if (settableBeanPropertyArr.length > 1) {
                HashMap hashMap = new HashMap();
                int length = settableBeanPropertyArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String name = settableBeanPropertyArr[i10].getName();
                    if ((!name.isEmpty() || settableBeanPropertyArr[i10].getInjectableValueId() == null) && (num = (Integer) hashMap.put(name, Integer.valueOf(i10))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", name, num, Integer.valueOf(i10), ClassUtil.nameOf(this._beanDesc.getBeanClass())));
                    }
                }
            }
            this._propertyBasedArgs = settableBeanPropertyArr;
        }
    }

    public void addStringCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 1, z10);
    }

    public ValueInstantiator constructValueInstantiator(DeserializationContext deserializationContext) {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType _computeDelegateType = _computeDelegateType(deserializationContext, this._creators[8], this._delegateArgs);
        JavaType _computeDelegateType2 = _computeDelegateType(deserializationContext, this._creators[10], this._arrayDelegateArgs);
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(config, this._beanDesc.getType());
        AnnotatedWithParams[] annotatedWithParamsArr = this._creators;
        stdValueInstantiator.configureFromObjectSettings(annotatedWithParamsArr[0], annotatedWithParamsArr[8], _computeDelegateType, this._delegateArgs, annotatedWithParamsArr[9], this._propertyBasedArgs);
        stdValueInstantiator.configureFromArraySettings(this._creators[10], _computeDelegateType2, this._arrayDelegateArgs);
        stdValueInstantiator.configureFromStringCreator(this._creators[1]);
        stdValueInstantiator.configureFromIntCreator(this._creators[2]);
        stdValueInstantiator.configureFromLongCreator(this._creators[3]);
        stdValueInstantiator.configureFromBigIntegerCreator(this._creators[4]);
        stdValueInstantiator.configureFromDoubleCreator(this._creators[5]);
        stdValueInstantiator.configureFromBigDecimalCreator(this._creators[6]);
        stdValueInstantiator.configureFromBooleanCreator(this._creators[7]);
        return stdValueInstantiator;
    }

    public boolean hasDefaultCreator() {
        return this._creators[0] != null;
    }

    public boolean hasDelegatingCreator() {
        return this._creators[8] != null;
    }

    public boolean hasPropertyBasedCreator() {
        return this._creators[9] != null;
    }

    public void setDefaultCreator(AnnotatedWithParams annotatedWithParams) {
        this._creators[0] = (AnnotatedWithParams) _fixAccess(annotatedWithParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (_isEnumValueOf(r2) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r8, int r9, boolean r10) {
        /*
            r7 = this;
            r0 = 1
            int r1 = r0 << r9
            r7._hasNonDefaultCreator = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] r2 = r7._creators
            r2 = r2[r9]
            if (r2 == 0) goto L5f
            int r3 = r7._explicitCreators
            r3 = r3 & r1
            r4 = 0
            if (r3 == 0) goto L16
            if (r10 != 0) goto L14
            return r4
        L14:
            r3 = r0
            goto L18
        L16:
            r3 = r10 ^ 1
        L18:
            if (r3 == 0) goto L5f
            java.lang.Class r3 = r2.getClass()
            java.lang.Class r5 = r8.getClass()
            if (r3 != r5) goto L5f
            java.lang.Class r3 = r2.getRawParameterType(r4)
            java.lang.Class r5 = r8.getRawParameterType(r4)
            if (r3 != r5) goto L40
            boolean r3 = r7._isEnumValueOf(r8)
            if (r3 == 0) goto L35
            return r4
        L35:
            boolean r3 = r7._isEnumValueOf(r2)
            if (r3 == 0) goto L3c
            goto L5f
        L3c:
            r7._reportDuplicateCreator(r9, r10, r2, r8)
            goto L5f
        L40:
            boolean r6 = r5.isAssignableFrom(r3)
            if (r6 == 0) goto L47
            return r4
        L47:
            boolean r6 = r3.isAssignableFrom(r5)
            if (r6 == 0) goto L4e
            goto L5f
        L4e:
            boolean r6 = r3.isPrimitive()
            boolean r5 = r5.isPrimitive()
            if (r6 == r5) goto L3c
            boolean r2 = r3.isPrimitive()
            if (r2 == 0) goto L5f
            return r4
        L5f:
            if (r10 == 0) goto L66
            int r10 = r7._explicitCreators
            r10 = r10 | r1
            r7._explicitCreators = r10
        L66:
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] r10 = r7._creators
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r8 = r7._fixAccess(r8)
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r8 = (com.fasterxml.jackson.databind.introspect.AnnotatedWithParams) r8
            r10[r9] = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, int, boolean):boolean");
    }
}
