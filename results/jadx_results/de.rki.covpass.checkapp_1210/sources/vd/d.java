package vd;

import hc.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public abstract class d {

    /* loaded from: classes.dex */
    public static final class a extends d {

        /* renamed from: a */
        private final String f24003a;

        /* renamed from: b */
        private final String f24004b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            t.e(str, "name");
            t.e(str2, "desc");
            this.f24003a = str;
            this.f24004b = str2;
        }

        @Override // vd.d
        public String a() {
            return c() + ':' + b();
        }

        @Override // vd.d
        public String b() {
            return this.f24004b;
        }

        @Override // vd.d
        public String c() {
            return this.f24003a;
        }

        public final String d() {
            return c();
        }

        public final String e() {
            return b();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.a(c(), aVar.c()) && t.a(b(), aVar.b());
        }

        public int hashCode() {
            return (c().hashCode() * 31) + b().hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d {

        /* renamed from: a */
        private final String f24005a;

        /* renamed from: b */
        private final String f24006b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(null);
            t.e(str, "name");
            t.e(str2, "desc");
            this.f24005a = str;
            this.f24006b = str2;
        }

        @Override // vd.d
        public String a() {
            return c() + b();
        }

        @Override // vd.d
        public String b() {
            return this.f24006b;
        }

        @Override // vd.d
        public String c() {
            return this.f24005a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.a(c(), bVar.c()) && t.a(b(), bVar.b());
        }

        public int hashCode() {
            return (c().hashCode() * 31) + b().hashCode();
        }
    }

    private d() {
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        return a();
    }
}
