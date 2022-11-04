package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import gc.l;
import hc.t;
import hc.v;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;", "it", BuildConfig.FLAVOR, "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class KotlinAnnotationIntrospector$hasRequiredMarker$hasRequired$1 extends v implements l<AnnotatedMember, Boolean> {
    final /* synthetic */ AnnotatedMember $m;
    final /* synthetic */ KotlinAnnotationIntrospector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinAnnotationIntrospector$hasRequiredMarker$hasRequired$1(KotlinAnnotationIntrospector kotlinAnnotationIntrospector, AnnotatedMember annotatedMember) {
        super(1);
        this.this$0 = kotlinAnnotationIntrospector;
        this.$m = annotatedMember;
    }

    public final Boolean invoke(AnnotatedMember annotatedMember) {
        boolean z10;
        boolean z11;
        Boolean hasRequiredMarker;
        Boolean hasRequiredMarker2;
        Boolean hasRequiredMarker3;
        t.e(annotatedMember, "it");
        try {
            z10 = this.this$0.nullToEmptyCollection;
            if (!z10 || !this.$m.getType().isCollectionLikeType()) {
                z11 = this.this$0.nullToEmptyMap;
                if (!z11 || !this.$m.getType().isMapLikeType()) {
                    Class<?> declaringClass = this.$m.getMember().getDeclaringClass();
                    t.d(declaringClass, "m.member.declaringClass");
                    if (!KotlinModuleKt.isKotlinClass(declaringClass)) {
                        return null;
                    }
                    AnnotatedMember annotatedMember2 = this.$m;
                    if (annotatedMember2 instanceof AnnotatedField) {
                        hasRequiredMarker3 = this.this$0.hasRequiredMarker((AnnotatedField) annotatedMember2);
                        return hasRequiredMarker3;
                    } else if (annotatedMember2 instanceof AnnotatedMethod) {
                        hasRequiredMarker2 = this.this$0.hasRequiredMarker((AnnotatedMethod) annotatedMember2);
                        return hasRequiredMarker2;
                    } else if (!(annotatedMember2 instanceof AnnotatedParameter)) {
                        return null;
                    } else {
                        hasRequiredMarker = this.this$0.hasRequiredMarker((AnnotatedParameter) annotatedMember2);
                        return hasRequiredMarker;
                    }
                }
            }
            return Boolean.FALSE;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
