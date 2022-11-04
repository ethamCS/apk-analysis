package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import hc.t;
import kotlin.Metadata;
import oc.j;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/MissingKotlinParameterException;", "Lcom/fasterxml/jackson/databind/exc/MismatchedInputException;", "Loc/j;", "parameter", "Lcom/fasterxml/jackson/core/JsonParser;", "processor", BuildConfig.FLAVOR, "msg", "<init>", "(Loc/j;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;)V", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class MissingKotlinParameterException extends MismatchedInputException {
    private final j parameter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingKotlinParameterException(j jVar, JsonParser jsonParser, String str) {
        super(jsonParser, str);
        t.e(jVar, "parameter");
        t.e(str, "msg");
        this.parameter = jVar;
    }
}
