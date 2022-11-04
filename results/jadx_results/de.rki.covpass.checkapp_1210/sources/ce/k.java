package ce;

import kotlin.jvm.internal.DefaultConstructorMarker;
import tb.e0;
import xc.h0;
/* loaded from: classes3.dex */
public abstract class k extends g<e0> {
    public static final a Companion = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(String str) {
            hc.t.e(str, "message");
            return new b(str);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends k {

        /* renamed from: b */
        private final String f6455b;

        public b(String str) {
            hc.t.e(str, "message");
            this.f6455b = str;
        }

        /* renamed from: d */
        public qe.h a(h0 h0Var) {
            hc.t.e(h0Var, "module");
            return qe.k.d(qe.j.ERROR_CONSTANT_VALUE, this.f6455b);
        }

        @Override // ce.g
        public String toString() {
            return this.f6455b;
        }
    }

    public k() {
        super(e0.f22152a);
    }

    /* renamed from: c */
    public e0 b() {
        throw new UnsupportedOperationException();
    }
}
