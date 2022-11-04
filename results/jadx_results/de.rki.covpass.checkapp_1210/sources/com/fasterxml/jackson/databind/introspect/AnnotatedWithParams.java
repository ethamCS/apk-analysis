package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
/* loaded from: classes.dex */
public abstract class AnnotatedWithParams extends AnnotatedMember {
    protected final AnnotationMap[] _paramAnnotations;

    public AnnotatedWithParams(TypeResolutionContext typeResolutionContext, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap);
        this._paramAnnotations = annotationMapArr;
    }

    public abstract Object call();

    public abstract Object call(Object[] objArr);

    public abstract Object call1(Object obj);

    public final AnnotatedParameter getParameter(int i10) {
        return new AnnotatedParameter(this, getParameterType(i10), this._typeContext, getParameterAnnotations(i10), i10);
    }

    public final AnnotationMap getParameterAnnotations(int i10) {
        AnnotationMap[] annotationMapArr = this._paramAnnotations;
        if (annotationMapArr == null || i10 < 0 || i10 >= annotationMapArr.length) {
            return null;
        }
        return annotationMapArr[i10];
    }

    public abstract int getParameterCount();

    public abstract JavaType getParameterType(int i10);

    public abstract Class<?> getRawParameterType(int i10);

    public AnnotatedParameter replaceParameterAnnotations(int i10, AnnotationMap annotationMap) {
        this._paramAnnotations[i10] = annotationMap;
        return getParameter(i10);
    }
}
