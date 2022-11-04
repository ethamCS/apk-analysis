package vf;

import eg.e;
import hc.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.t;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lvf/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "Lof/t;", "a", "Leg/e;", "source", "<init>", "(Leg/e;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a {
    public static final C0431a Companion = new C0431a(null);

    /* renamed from: a */
    private final e f24100a;

    /* renamed from: b */
    private long f24101b = 262144;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lvf/a$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "HEADER_LIMIT", "I", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* renamed from: vf.a$a */
    /* loaded from: classes3.dex */
    public static final class C0431a {
        private C0431a() {
        }

        public /* synthetic */ C0431a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(e eVar) {
        t.e(eVar, "source");
        this.f24100a = eVar;
    }

    public final of.t a() {
        t.a aVar = new t.a();
        while (true) {
            String b10 = b();
            if (b10.length() == 0) {
                return aVar.d();
            }
            aVar.b(b10);
        }
    }

    public final String b() {
        String y02 = this.f24100a.y0(this.f24101b);
        this.f24101b -= y02.length();
        return y02;
    }
}
