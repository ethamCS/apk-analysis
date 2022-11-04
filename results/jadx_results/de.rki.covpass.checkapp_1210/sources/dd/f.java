package dd;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public abstract class f implements nd.b {

    /* renamed from: b */
    public static final a f8496b = new a(null);

    /* renamed from: a */
    private final wd.f f8497a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Object obj, wd.f fVar) {
            hc.t.e(obj, "value");
            return d.h(obj.getClass()) ? new q(fVar, (Enum) obj) : obj instanceof Annotation ? new g(fVar, (Annotation) obj) : obj instanceof Object[] ? new j(fVar, (Object[]) obj) : obj instanceof Class ? new m(fVar, (Class) obj) : new s(fVar, obj);
        }
    }

    private f(wd.f fVar) {
        this.f8497a = fVar;
    }

    public /* synthetic */ f(wd.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    @Override // nd.b
    public wd.f getName() {
        return this.f8497a;
    }
}
