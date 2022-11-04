package dgca.verifier.app.engine.data.source.remote.valuesets;

import com.fasterxml.jackson.annotation.JsonProperty;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Ldgca/verifier/app/engine/data/source/remote/valuesets/ValueSetIdentifierRemote;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "getHash", "hash", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ValueSetIdentifierRemote {

    /* renamed from: a */
    private final String f9035a;

    /* renamed from: b */
    private final String f9036b;

    public ValueSetIdentifierRemote(@JsonProperty("id") String str, @JsonProperty("hash") String str2) {
        t.e(str, "id");
        t.e(str2, "hash");
        this.f9035a = str;
        this.f9036b = str2;
    }

    public final String getHash() {
        return this.f9036b;
    }

    public final String getId() {
        return this.f9035a;
    }
}
