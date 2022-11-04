package ve;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ve.f;
import xc.y;
/* loaded from: classes3.dex */
public abstract class k implements f {

    /* renamed from: a */
    private final String f24042a;

    /* loaded from: classes3.dex */
    public static final class a extends k {

        /* renamed from: b */
        public static final a f24043b = new a();

        private a() {
            super("must be a member function", null);
        }

        @Override // ve.f
        public boolean b(y yVar) {
            hc.t.e(yVar, "functionDescriptor");
            return yVar.J() != null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends k {

        /* renamed from: b */
        public static final b f24044b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // ve.f
        public boolean b(y yVar) {
            hc.t.e(yVar, "functionDescriptor");
            return (yVar.J() == null && yVar.U() == null) ? false : true;
        }
    }

    private k(String str) {
        this.f24042a = str;
    }

    public /* synthetic */ k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // ve.f
    public String a() {
        return this.f24042a;
    }

    @Override // ve.f
    public String c(y yVar) {
        return f.a.a(this, yVar);
    }
}
