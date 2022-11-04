package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.introspect.Annotated;
/* loaded from: classes.dex */
public class AnnotatedAndMetadata<A extends Annotated, M> {
    public final A annotated;
    public final M metadata;

    public AnnotatedAndMetadata(A a10, M m10) {
        this.annotated = a10;
        this.metadata = m10;
    }

    public static <A extends Annotated, M> AnnotatedAndMetadata<A, M> of(A a10, M m10) {
        return new AnnotatedAndMetadata<>(a10, m10);
    }
}
