package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ClosedRangeMixin;", "T", BuildConfig.FLAVOR, "start", "Ljava/lang/Object;", "getStart", "()Ljava/lang/Object;", "endInclusive", "getEndInclusive", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public abstract class ClosedRangeMixin<T> {
    private final T endInclusive;
    private final T start;

    @JsonCreator
    public ClosedRangeMixin(T t10, T t11) {
        this.start = t10;
        this.endInclusive = t11;
    }

    @JsonProperty("end")
    public final T getEndInclusive() {
        return this.endInclusive;
    }
}
