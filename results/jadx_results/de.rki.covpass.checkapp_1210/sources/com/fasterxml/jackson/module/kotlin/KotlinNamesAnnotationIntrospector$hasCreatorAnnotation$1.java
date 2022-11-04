package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import fc.a;
import gc.l;
import hc.t;
import hc.v;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import oc.g;
import org.conscrypt.BuildConfig;
import qc.c;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;", "it", BuildConfig.FLAVOR, "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class KotlinNamesAnnotationIntrospector$hasCreatorAnnotation$1 extends v implements l<AnnotatedConstructor, Boolean> {
    final /* synthetic */ Annotated $member;
    final /* synthetic */ KotlinNamesAnnotationIntrospector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinNamesAnnotationIntrospector$hasCreatorAnnotation$1(KotlinNamesAnnotationIntrospector kotlinNamesAnnotationIntrospector, Annotated annotated) {
        super(1);
        this.this$0 = kotlinNamesAnnotationIntrospector;
        this.$member = annotated;
    }

    private static final Collection<g<?>> invoke$filterOutSingleStringCallables(Collection<? extends g<?>> collection, Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (!invoke$isPossibleSingleString((g) obj, set)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static final boolean invoke$isPossibleSingleString(g<?> gVar, Set<String> set) {
        boolean N;
        boolean z10;
        if (gVar.getParameters().size() == 1) {
            N = c0.N(set, gVar.getParameters().get(0).getName());
            if (!N && t.a(c.f(gVar.getParameters().get(0).getType()), String.class)) {
                List<Annotation> j10 = gVar.getParameters().get(0).j();
                if (!(j10 instanceof Collection) || !j10.isEmpty()) {
                    for (Annotation annotation : j10) {
                        if (t.a(a.b(a.a(annotation)), JsonProperty.class)) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0187 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r12) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.module.kotlin.KotlinNamesAnnotationIntrospector$hasCreatorAnnotation$1.invoke(com.fasterxml.jackson.databind.introspect.AnnotatedConstructor):java.lang.Boolean");
    }
}
