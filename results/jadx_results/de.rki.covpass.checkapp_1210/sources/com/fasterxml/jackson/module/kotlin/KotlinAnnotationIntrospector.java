package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import fc.a;
import hc.k0;
import hc.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import oc.g;
import oc.h;
import oc.i;
import oc.j;
import oc.k;
import oc.m;
import oc.n;
import org.conscrypt.BuildConfig;
import pc.d;
import pc.e;
import qc.c;
import tb.e0;
import ub.c0;
import ub.v;
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0003¢\u0006\u0004\b8\u00109J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\rH\u0002¢\u0006\u0004\b\u0007\u0010\u000eJ\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u000fH\u0002¢\u0006\u0004\b\u0004\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0011H\u0002J\u001e\u0010\u0016\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014*\u00020\u000fH\u0002J\u001e\u0010\u0018\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0017*\u00020\u000fH\u0002J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0019H\u0002¢\u0006\u0004\b\u0004\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0018\u0010\u001e\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0018\u0010\u001f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\f\u0010!\u001a\u00020\u0003*\u00020 H\u0002J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b\u0004\u0010$J\u001e\u0010*\u001a\u0004\u0018\u00010)2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u0010(\u001a\u00020'H\u0016J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+2\u0006\u0010(\u001a\u00020'H\u0016R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00107\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105¨\u0006:"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinAnnotationIntrospector;", "Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;", BuildConfig.FLAVOR, "hasRequiredMarker", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;)Ljava/lang/Boolean;", "Ljava/lang/reflect/AccessibleObject;", "isRequiredByAnnotation", "(Ljava/lang/reflect/AccessibleObject;)Ljava/lang/Boolean;", "byAnnotation", "byNullability", "requiredAnnotationOrNullability", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)Ljava/lang/Boolean;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)Ljava/lang/Boolean;", "Loc/g;", "isGetterLike", "isSetterLike", "Loc/m;", BuildConfig.FLAVOR, "getCorrespondingGetter", "Loc/i$a;", "getCorrespondingSetter", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;)Ljava/lang/Boolean;", BuildConfig.FLAVOR, "index", "isConstructorParameterRequired", "isMethodParameterRequired", "isParameterRequired", "Loc/n;", "isRequired", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;", "m", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Ljava/lang/Boolean;", "Lcom/fasterxml/jackson/databind/cfg/MapperConfig;", "config", "Lcom/fasterxml/jackson/databind/introspect/Annotated;", "a", "Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;", "findCreatorAnnotation", BuildConfig.FLAVOR, "Lcom/fasterxml/jackson/databind/jsontype/NamedType;", "findSubtypes", "Lcom/fasterxml/jackson/databind/Module$SetupContext;", "context", "Lcom/fasterxml/jackson/databind/Module$SetupContext;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "cache", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "nullToEmptyCollection", "Z", "nullToEmptyMap", "nullIsSameAsDefault", "<init>", "(Lcom/fasterxml/jackson/databind/Module$SetupContext;Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;ZZZ)V", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class KotlinAnnotationIntrospector extends NopAnnotationIntrospector {
    private final ReflectionCache cache;
    private final Module.SetupContext context;
    private final boolean nullIsSameAsDefault;
    private final boolean nullToEmptyCollection;
    private final boolean nullToEmptyMap;

    public KotlinAnnotationIntrospector(Module.SetupContext setupContext, ReflectionCache reflectionCache, boolean z10, boolean z11, boolean z12) {
        t.e(setupContext, "context");
        t.e(reflectionCache, "cache");
        this.context = setupContext;
        this.cache = reflectionCache;
        this.nullToEmptyCollection = z10;
        this.nullToEmptyMap = z11;
        this.nullIsSameAsDefault = z12;
    }

    private final m<? extends Object, Object> getCorrespondingGetter(AnnotatedMethod annotatedMethod) {
        Object obj;
        Class<?> declaringClass = annotatedMethod.getMember().getDeclaringClass();
        t.d(declaringClass, "member.declaringClass");
        Iterator it = d.c(a.e(declaringClass)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (t.a(c.d(((m) obj).i()), annotatedMethod.getMember())) {
                break;
            }
        }
        return (m) obj;
    }

    private final i.a<? extends Object, Object> getCorrespondingSetter(AnnotatedMethod annotatedMethod) {
        Object obj;
        boolean z10;
        Class<?> declaringClass = annotatedMethod.getMember().getDeclaringClass();
        t.d(declaringClass, "member.declaringClass");
        Iterator it = d.c(a.e(declaringClass)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            m mVar = (m) obj;
            if (mVar instanceof i) {
                z10 = t.a(c.e((h) mVar), annotatedMethod.getMember());
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                break;
            }
        }
        m mVar2 = (m) obj;
        i iVar = mVar2 instanceof i ? (i) mVar2 : null;
        if (iVar == null) {
            return null;
        }
        return iVar.n();
    }

    public final Boolean hasRequiredMarker(AnnotatedField annotatedField) {
        n e10;
        Member member = annotatedField.getMember();
        Objects.requireNonNull(member, "null cannot be cast to non-null type java.lang.reflect.Field");
        Boolean isRequiredByAnnotation = isRequiredByAnnotation((Field) member);
        Member member2 = annotatedField.getMember();
        Objects.requireNonNull(member2, "null cannot be cast to non-null type java.lang.reflect.Field");
        k<?> j10 = c.j((Field) member2);
        Boolean bool = null;
        if (j10 != null && (e10 = j10.e()) != null) {
            bool = Boolean.valueOf(isRequired(e10));
        }
        return requiredAnnotationOrNullability(isRequiredByAnnotation, bool);
    }

    public final Boolean hasRequiredMarker(AnnotatedMethod annotatedMethod) {
        m<? extends Object, Object> correspondingGetter = getCorrespondingGetter(annotatedMethod);
        Boolean bool = null;
        if (correspondingGetter != null) {
            Method c10 = c.c(correspondingGetter);
            if (c10 != null) {
                bool = isRequiredByAnnotation(c10);
            }
            return requiredAnnotationOrNullability(bool, Boolean.valueOf(isRequired(correspondingGetter.e())));
        }
        i.a<? extends Object, Object> correspondingSetter = getCorrespondingSetter(annotatedMethod);
        if (correspondingSetter != null) {
            Method d10 = c.d(correspondingSetter);
            if (d10 != null) {
                bool = isRequiredByAnnotation(d10);
            }
            return requiredAnnotationOrNullability(bool, Boolean.valueOf(isMethodParameterRequired(correspondingSetter, 0)));
        }
        Method member = annotatedMethod.getMember();
        t.d(member, "this.member");
        g<?> i10 = c.i(member);
        if (i10 != null) {
            Method d11 = c.d(i10);
            Boolean isRequiredByAnnotation = d11 == null ? null : isRequiredByAnnotation(d11);
            if (isGetterLike(i10)) {
                return requiredAnnotationOrNullability(isRequiredByAnnotation, Boolean.valueOf(isRequired(i10.e())));
            }
            if (isSetterLike(i10)) {
                return requiredAnnotationOrNullability(isRequiredByAnnotation, Boolean.valueOf(isMethodParameterRequired(i10, 0)));
            }
        }
        return null;
    }

    public final Boolean hasRequiredMarker(AnnotatedParameter annotatedParameter) {
        boolean isMethodParameterRequired;
        Member member = annotatedParameter.getMember();
        JsonProperty jsonProperty = (JsonProperty) annotatedParameter.getAnnotation(JsonProperty.class);
        Boolean bool = null;
        Boolean valueOf = jsonProperty == null ? null : Boolean.valueOf(jsonProperty.required());
        if (member instanceof Constructor) {
            t.d(member, "member");
            g<?> h10 = c.h((Constructor) member);
            if (h10 != null) {
                isMethodParameterRequired = isConstructorParameterRequired(h10, annotatedParameter.getIndex());
                bool = Boolean.valueOf(isMethodParameterRequired);
            }
        } else if (member instanceof Method) {
            t.d(member, "member");
            g<?> i10 = c.i((Method) member);
            if (i10 != null) {
                isMethodParameterRequired = isMethodParameterRequired(i10, annotatedParameter.getIndex());
                bool = Boolean.valueOf(isMethodParameterRequired);
            }
        }
        return requiredAnnotationOrNullability(valueOf, bool);
    }

    private final boolean isConstructorParameterRequired(g<?> gVar, int i10) {
        return isParameterRequired(gVar, i10);
    }

    private final boolean isGetterLike(g<?> gVar) {
        return gVar.getParameters().size() == 1;
    }

    private final boolean isMethodParameterRequired(g<?> gVar, int i10) {
        return isParameterRequired(gVar, i10 + 1);
    }

    private final boolean isParameterRequired(g<?> gVar, int i10) {
        j jVar = gVar.getParameters().get(i10);
        n type = jVar.getType();
        Type f10 = c.f(type);
        boolean isPrimitive = f10 instanceof Class ? ((Class) f10).isPrimitive() : false;
        if (type.t() || jVar.N()) {
            return false;
        }
        return !isPrimitive || this.context.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES);
    }

    private final boolean isRequired(n nVar) {
        return !nVar.t();
    }

    private final Boolean isRequiredByAnnotation(AccessibleObject accessibleObject) {
        JsonProperty jsonProperty;
        Annotation[] annotations = accessibleObject.getAnnotations();
        if (annotations == null) {
            return null;
        }
        int length = annotations.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                jsonProperty = null;
                break;
            }
            jsonProperty = annotations[i10];
            if (t.a(a.a(jsonProperty), k0.b(JsonProperty.class))) {
                break;
            }
            i10++;
        }
        if (jsonProperty != null) {
            return Boolean.valueOf(jsonProperty.required());
        }
        return null;
    }

    private final Boolean isRequiredByAnnotation(Method method) {
        JsonProperty jsonProperty;
        Annotation[] annotations = method.getAnnotations();
        t.d(annotations, "this.annotations");
        int length = annotations.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                jsonProperty = null;
                break;
            }
            jsonProperty = annotations[i10];
            if (t.a(a.b(a.a(jsonProperty)), JsonProperty.class)) {
                break;
            }
            i10++;
        }
        JsonProperty jsonProperty2 = jsonProperty instanceof JsonProperty ? jsonProperty : null;
        if (jsonProperty2 == null) {
            return null;
        }
        return Boolean.valueOf(jsonProperty2.required());
    }

    private final boolean isSetterLike(g<?> gVar) {
        return gVar.getParameters().size() == 2 && t.a(gVar.e(), e.c(k0.b(e0.class), null, false, null, 7, null));
    }

    private final Boolean requiredAnnotationOrNullability(Boolean bool, Boolean bool2) {
        if (bool == null || bool2 == null) {
            return bool2 != null ? bool2 : bool;
        }
        return Boolean.valueOf(bool.booleanValue() || bool2.booleanValue());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, Annotated annotated) {
        t.e(mapperConfig, "config");
        t.e(annotated, "a");
        return super.findCreatorAnnotation(mapperConfig, annotated);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<NamedType> findSubtypes(Annotated annotated) {
        int s10;
        List<NamedType> H0;
        t.e(annotated, "a");
        Class<?> rawType = annotated.getRawType();
        t.d(rawType, "it");
        if (!KotlinModuleKt.isKotlinClass(rawType)) {
            rawType = null;
        }
        if (rawType == null) {
            return null;
        }
        List<oc.d> v10 = a.e(rawType).v();
        s10 = v.s(v10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (oc.d dVar : v10) {
            arrayList.add(new NamedType(a.b(dVar)));
        }
        H0 = c0.H0(arrayList);
        if (!H0.isEmpty()) {
            return H0;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        t.e(annotatedMember, "m");
        return this.cache.javaMemberIsRequired(annotatedMember, new KotlinAnnotationIntrospector$hasRequiredMarker$hasRequired$1(this, annotatedMember));
    }
}
