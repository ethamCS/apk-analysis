package pd;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public interface o extends ke.u {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: pd.o$a$a */
        /* loaded from: classes.dex */
        public static final class C0308a extends a {

            /* renamed from: a */
            private final byte[] f19131a;

            public final byte[] b() {
                return this.f19131a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {

            /* renamed from: a */
            private final q f19132a;

            /* renamed from: b */
            private final byte[] f19133b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(q qVar, byte[] bArr) {
                super(null);
                hc.t.e(qVar, "kotlinJvmBinaryClass");
                this.f19132a = qVar;
                this.f19133b = bArr;
            }

            public /* synthetic */ b(q qVar, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(qVar, (i10 & 2) != 0 ? null : bArr);
            }

            public final q b() {
                return this.f19132a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a() {
            b bVar = this instanceof b ? (b) this : null;
            if (bVar != null) {
                return bVar.b();
            }
            return null;
        }
    }

    a a(nd.g gVar);

    a b(wd.b bVar);
}
