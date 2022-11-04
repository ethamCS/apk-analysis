package ve;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ve.f;
import xc.y;
/* loaded from: classes3.dex */
public abstract class t implements f {

    /* renamed from: a */
    private final String f24095a;

    /* loaded from: classes3.dex */
    public static final class a extends t {

        /* renamed from: b */
        private final int f24096b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have at least "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameter"
                r0.append(r1)
                r1 = 1
                if (r3 <= r1) goto L18
                java.lang.String r1 = "s"
                goto L1a
            L18:
                java.lang.String r1 = ""
            L1a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f24096b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ve.t.a.<init>(int):void");
        }

        @Override // ve.f
        public boolean b(y yVar) {
            hc.t.e(yVar, "functionDescriptor");
            return yVar.o().size() >= this.f24096b;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends t {

        /* renamed from: b */
        private final int f24097b;

        public b(int i10) {
            super("must have exactly " + i10 + " value parameters", null);
            this.f24097b = i10;
        }

        @Override // ve.f
        public boolean b(y yVar) {
            hc.t.e(yVar, "functionDescriptor");
            return yVar.o().size() == this.f24097b;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends t {

        /* renamed from: b */
        public static final c f24098b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // ve.f
        public boolean b(y yVar) {
            hc.t.e(yVar, "functionDescriptor");
            return yVar.o().isEmpty();
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends t {

        /* renamed from: b */
        public static final d f24099b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // ve.f
        public boolean b(y yVar) {
            hc.t.e(yVar, "functionDescriptor");
            return yVar.o().size() == 1;
        }
    }

    private t(String str) {
        this.f24095a = str;
    }

    public /* synthetic */ t(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // ve.f
    public String a() {
        return this.f24095a;
    }

    @Override // ve.f
    public String c(y yVar) {
        return f.a.a(this, yVar);
    }
}
