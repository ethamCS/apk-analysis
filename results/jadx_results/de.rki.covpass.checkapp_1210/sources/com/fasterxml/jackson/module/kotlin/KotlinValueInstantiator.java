package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import hc.t;
import java.lang.reflect.Type;
import kotlin.Metadata;
import oc.j;
import org.conscrypt.BuildConfig;
import qc.c;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0005H\u0002J1\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;", "Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;", "Loc/j;", BuildConfig.FLAVOR, "isPrimitive", "Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;", "hasInjectableValueId", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", BuildConfig.FLAVOR, "props", "Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;", "buffer", BuildConfig.FLAVOR, "createFromObjectWith", "(Lcom/fasterxml/jackson/databind/DeserializationContext;[Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;)Ljava/lang/Object;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "cache", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "nullToEmptyCollection", "Z", "nullToEmptyMap", "nullIsSameAsDefault", "strictNullChecks", "src", "<init>", "(Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;ZZZZ)V", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class KotlinValueInstantiator extends StdValueInstantiator {
    private final ReflectionCache cache;
    private final boolean nullIsSameAsDefault;
    private final boolean nullToEmptyCollection;
    private final boolean nullToEmptyMap;
    private final boolean strictNullChecks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinValueInstantiator(StdValueInstantiator stdValueInstantiator, ReflectionCache reflectionCache, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(stdValueInstantiator);
        t.e(stdValueInstantiator, "src");
        t.e(reflectionCache, "cache");
        this.cache = reflectionCache;
        this.nullToEmptyCollection = z10;
        this.nullToEmptyMap = z11;
        this.nullIsSameAsDefault = z12;
        this.strictNullChecks = z13;
    }

    private final boolean hasInjectableValueId(SettableBeanProperty settableBeanProperty) {
        return settableBeanProperty.getInjectableValueId() != null;
    }

    private final boolean isPrimitive(j jVar) {
        Type f10 = c.f(jVar.getType());
        if (f10 instanceof Class) {
            return ((Class) f10).isPrimitive();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0155, code lost:
        if (r13.N() != false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0309 A[ADDED_TO_REGION] */
    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext r23, com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r24, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer r25) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.module.kotlin.KotlinValueInstantiator.createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty[], com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer):java.lang.Object");
    }
}
