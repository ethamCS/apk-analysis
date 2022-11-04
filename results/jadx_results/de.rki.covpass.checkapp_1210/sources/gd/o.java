package gd;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public interface o {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ nd.u a(o oVar, wd.c cVar, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = true;
                }
                return oVar.a(cVar, z10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findPackage");
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final wd.b f10738a;

        /* renamed from: b */
        private final byte[] f10739b;

        /* renamed from: c */
        private final nd.g f10740c;

        public b(wd.b bVar, byte[] bArr, nd.g gVar) {
            hc.t.e(bVar, "classId");
            this.f10738a = bVar;
            this.f10739b = bArr;
            this.f10740c = gVar;
        }

        public /* synthetic */ b(wd.b bVar, byte[] bArr, nd.g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : gVar);
        }

        public final wd.b a() {
            return this.f10738a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return hc.t.a(this.f10738a, bVar.f10738a) && hc.t.a(this.f10739b, bVar.f10739b) && hc.t.a(this.f10740c, bVar.f10740c);
        }

        public int hashCode() {
            int hashCode = this.f10738a.hashCode() * 31;
            byte[] bArr = this.f10739b;
            int i10 = 0;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            nd.g gVar = this.f10740c;
            if (gVar != null) {
                i10 = gVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            return "Request(classId=" + this.f10738a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f10739b) + ", outerClass=" + this.f10740c + ')';
        }
    }

    nd.u a(wd.c cVar, boolean z10);

    Set<String> b(wd.c cVar);

    nd.g c(b bVar);
}
