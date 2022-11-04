package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.LRUMap;
import fc.a;
import gc.l;
import hc.t;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oc.d;
import oc.g;
import org.conscrypt.BuildConfig;
import qc.c;
import tb.p;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002J\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006J\u0014\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\bJ\"\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\nJ-\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u000e2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010R,\u0010\u0012\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R,\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", BuildConfig.FLAVOR, "Ljava/lang/Class;", "key", "Loc/d;", "kotlinFromJava", "Ljava/lang/reflect/Constructor;", "Loc/g;", "Ljava/lang/reflect/Method;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;", "Lkotlin/Function1;", BuildConfig.FLAVOR, "calc", "checkConstructorIsCreatorAnnotated", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;", "javaMemberIsRequired", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;Lgc/l;)Ljava/lang/Boolean;", "Lcom/fasterxml/jackson/databind/util/LRUMap;", "javaClassToKotlin", "Lcom/fasterxml/jackson/databind/util/LRUMap;", "javaConstructorToKotlin", "javaMethodToKotlin", "javaConstructorIsCreatorAnnotated", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;", "kotlinGeneratedMethod", BuildConfig.FLAVOR, "reflectionCacheSize", "<init>", "(I)V", "BooleanTriState", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class ReflectionCache {
    private final LRUMap<Class<Object>, d<Object>> javaClassToKotlin;
    private final LRUMap<AnnotatedConstructor, Boolean> javaConstructorIsCreatorAnnotated;
    private final LRUMap<Constructor<Object>, g<Object>> javaConstructorToKotlin;
    private final LRUMap<AnnotatedMember, BooleanTriState> javaMemberIsRequired;
    private final LRUMap<Method, g<?>> javaMethodToKotlin;
    private final LRUMap<AnnotatedMethod, Boolean> kotlinGeneratedMethod;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "(Ljava/lang/Boolean;)V", "getValue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Companion", "Empty", "False", "True", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$True;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$False;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$Empty;", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static abstract class BooleanTriState {
        private final Boolean value;
        public static final Companion Companion = new Companion(null);
        private static final True TRUE = new True();
        private static final False FALSE = new False();
        private static final Empty EMPTY = new Empty();

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$Companion;", BuildConfig.FLAVOR, "()V", "EMPTY", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$Empty;", "FALSE", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$False;", "TRUE", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$True;", "fromBoolean", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "value", BuildConfig.FLAVOR, "(Ljava/lang/Boolean;)Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BooleanTriState fromBoolean(Boolean bool) {
                if (bool == null) {
                    return BooleanTriState.EMPTY;
                }
                if (t.a(bool, Boolean.TRUE)) {
                    return BooleanTriState.TRUE;
                }
                if (!t.a(bool, Boolean.FALSE)) {
                    throw new p();
                }
                return BooleanTriState.FALSE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$Empty;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "()V", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Empty extends BooleanTriState {
            public Empty() {
                super(null, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$False;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "()V", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class False extends BooleanTriState {
            public False() {
                super(Boolean.FALSE, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$True;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "()V", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class True extends BooleanTriState {
            public True() {
                super(Boolean.TRUE, null);
            }
        }

        private BooleanTriState(Boolean bool) {
            this.value = bool;
        }

        public /* synthetic */ BooleanTriState(Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool);
        }

        public final Boolean getValue() {
            return this.value;
        }
    }

    public ReflectionCache(int i10) {
        this.javaClassToKotlin = new LRUMap<>(i10, i10);
        this.javaConstructorToKotlin = new LRUMap<>(i10, i10);
        this.javaMethodToKotlin = new LRUMap<>(i10, i10);
        this.javaConstructorIsCreatorAnnotated = new LRUMap<>(i10, i10);
        this.javaMemberIsRequired = new LRUMap<>(i10, i10);
        this.kotlinGeneratedMethod = new LRUMap<>(i10, i10);
    }

    public final boolean checkConstructorIsCreatorAnnotated(AnnotatedConstructor annotatedConstructor, l<? super AnnotatedConstructor, Boolean> lVar) {
        t.e(annotatedConstructor, "key");
        t.e(lVar, "calc");
        Boolean bool = this.javaConstructorIsCreatorAnnotated.get(annotatedConstructor);
        if (bool == null) {
            boolean booleanValue = lVar.invoke(annotatedConstructor).booleanValue();
            Boolean putIfAbsent = this.javaConstructorIsCreatorAnnotated.putIfAbsent(annotatedConstructor, Boolean.valueOf(booleanValue));
            return putIfAbsent == null ? booleanValue : putIfAbsent.booleanValue();
        }
        return bool.booleanValue();
    }

    public final Boolean javaMemberIsRequired(AnnotatedMember annotatedMember, l<? super AnnotatedMember, Boolean> lVar) {
        Boolean value;
        t.e(annotatedMember, "key");
        t.e(lVar, "calc");
        BooleanTriState booleanTriState = this.javaMemberIsRequired.get(annotatedMember);
        Boolean value2 = booleanTriState == null ? null : booleanTriState.getValue();
        if (value2 == null) {
            Boolean invoke = lVar.invoke(annotatedMember);
            BooleanTriState putIfAbsent = this.javaMemberIsRequired.putIfAbsent(annotatedMember, BooleanTriState.Companion.fromBoolean(invoke));
            return (putIfAbsent == null || (value = putIfAbsent.getValue()) == null) ? invoke : value;
        }
        return value2;
    }

    public final d<Object> kotlinFromJava(Class<Object> cls) {
        t.e(cls, "key");
        d<Object> dVar = this.javaClassToKotlin.get(cls);
        if (dVar == null) {
            d<Object> e10 = a.e(cls);
            d<Object> putIfAbsent = this.javaClassToKotlin.putIfAbsent(cls, e10);
            return putIfAbsent == null ? e10 : putIfAbsent;
        }
        return dVar;
    }

    public final g<Object> kotlinFromJava(Constructor<Object> constructor) {
        t.e(constructor, "key");
        g<Object> gVar = this.javaConstructorToKotlin.get(constructor);
        if (gVar == null) {
            g<Object> h10 = c.h(constructor);
            if (h10 == null) {
                return null;
            }
            g<Object> putIfAbsent = this.javaConstructorToKotlin.putIfAbsent(constructor, h10);
            return putIfAbsent == null ? h10 : putIfAbsent;
        }
        return gVar;
    }

    public final g<?> kotlinFromJava(Method method) {
        t.e(method, "key");
        g<?> gVar = this.javaMethodToKotlin.get(method);
        if (gVar == null) {
            g<?> i10 = c.i(method);
            if (i10 == null) {
                return null;
            }
            g<?> putIfAbsent = this.javaMethodToKotlin.putIfAbsent(method, i10);
            return putIfAbsent == null ? i10 : putIfAbsent;
        }
        return gVar;
    }
}
