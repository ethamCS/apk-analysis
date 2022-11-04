package d9;

import com.fasterxml.jackson.databind.ObjectMapper;
import dgca.verifier.app.engine.JsonLogicValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.w;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ld9/c;", BuildConfig.FLAVOR, "Ldgca/verifier/app/engine/JsonLogicValidator;", "jsonLogicValidator", "<init>", "(Ldgca/verifier/app/engine/JsonLogicValidator;)V", "a", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final w<Integer, Integer, Integer> f8393c = new w<>(1, 0, 0);

    /* renamed from: a */
    private final JsonLogicValidator f8394a;

    /* renamed from: b */
    private final ObjectMapper f8395b;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Ld9/c$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "CERTLOGIC_KEY", "Ljava/lang/String;", "Ltb/w;", BuildConfig.FLAVOR, "CERTLOGIC_VERSION", "Ltb/w;", "EXTERNAL_KEY", "PAYLOAD_KEY", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c(JsonLogicValidator jsonLogicValidator) {
        hc.t.e(jsonLogicValidator, "jsonLogicValidator");
        this.f8394a = jsonLogicValidator;
        ObjectMapper objectMapper = new ObjectMapper();
        this.f8395b = objectMapper;
        objectMapper.findAndRegisterModules();
    }
}
