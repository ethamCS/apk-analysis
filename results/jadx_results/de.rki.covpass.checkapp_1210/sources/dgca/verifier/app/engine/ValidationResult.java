package dgca.verifier.app.engine;

import dgca.verifier.app.engine.data.Rule;
import hc.t;
import java.util.List;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0012\u0010\u001b\u001a\u000e\u0012\b\u0012\u00060\u0015j\u0002`\u0016\u0018\u00010\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u001b\u001a\u000e\u0012\b\u0012\u00060\u0015j\u0002`\u0016\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Ldgca/verifier/app/engine/ValidationResult;", org.conscrypt.BuildConfig.FLAVOR, "Ldgca/verifier/app/engine/data/Rule;", "a", "Ldgca/verifier/app/engine/data/Rule;", "getRule", "()Ldgca/verifier/app/engine/data/Rule;", "rule", "Ldgca/verifier/app/engine/Result;", "b", "Ldgca/verifier/app/engine/Result;", "getResult", "()Ldgca/verifier/app/engine/Result;", "result", org.conscrypt.BuildConfig.FLAVOR, "c", "Ljava/lang/String;", "getCurrent", "()Ljava/lang/String;", "current", org.conscrypt.BuildConfig.FLAVOR, "Ljava/lang/Exception;", "Lkotlin/Exception;", "d", "Ljava/util/List;", "getValidationErrors", "()Ljava/util/List;", "validationErrors", "<init>", "(Ldgca/verifier/app/engine/data/Rule;Ldgca/verifier/app/engine/Result;Ljava/lang/String;Ljava/util/List;)V", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ValidationResult {

    /* renamed from: a */
    private final Rule f8963a;

    /* renamed from: b */
    private final Result f8964b;

    /* renamed from: c */
    private final String f8965c;

    /* renamed from: d */
    private final List<Exception> f8966d;

    /* JADX WARN: Multi-variable type inference failed */
    public ValidationResult(Rule rule, Result result, String str, List<? extends Exception> list) {
        t.e(rule, "rule");
        t.e(result, "result");
        t.e(str, "current");
        this.f8963a = rule;
        this.f8964b = result;
        this.f8965c = str;
        this.f8966d = list;
    }

    public final String getCurrent() {
        return this.f8965c;
    }

    public final Result getResult() {
        return this.f8964b;
    }

    public final Rule getRule() {
        return this.f8963a;
    }

    public final List<Exception> getValidationErrors() {
        return this.f8966d;
    }
}
