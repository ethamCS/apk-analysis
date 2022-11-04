package ve;

import hc.v;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ve.g;
import xc.y;
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a */
    private final wd.f f24031a;

    /* renamed from: b */
    private final bf.k f24032b;

    /* renamed from: c */
    private final Collection<wd.f> f24033c;

    /* renamed from: d */
    private final gc.l<y, String> f24034d;

    /* renamed from: e */
    private final f[] f24035e;

    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.l {

        /* renamed from: c */
        public static final a f24036c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final Void invoke(y yVar) {
            hc.t.e(yVar, "$this$null");
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends v implements gc.l {

        /* renamed from: c */
        public static final b f24037c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final Void invoke(y yVar) {
            hc.t.e(yVar, "$this$null");
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends v implements gc.l {

        /* renamed from: c */
        public static final c f24038c = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final Void invoke(y yVar) {
            hc.t.e(yVar, "$this$null");
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(bf.k kVar, f[] fVarArr, gc.l<? super y, String> lVar) {
        this((wd.f) null, kVar, (Collection<wd.f>) null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        hc.t.e(kVar, "regex");
        hc.t.e(fVarArr, "checks");
        hc.t.e(lVar, "additionalChecks");
    }

    public /* synthetic */ h(bf.k kVar, f[] fVarArr, gc.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, fVarArr, (i10 & 4) != 0 ? b.f24037c : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Collection<wd.f> collection, f[] fVarArr, gc.l<? super y, String> lVar) {
        this((wd.f) null, (bf.k) null, collection, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        hc.t.e(collection, "nameList");
        hc.t.e(fVarArr, "checks");
        hc.t.e(lVar, "additionalChecks");
    }

    public /* synthetic */ h(Collection collection, f[] fVarArr, gc.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, fVarArr, (i10 & 4) != 0 ? c.f24038c : lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(wd.f fVar, bf.k kVar, Collection<wd.f> collection, gc.l<? super y, String> lVar, f... fVarArr) {
        this.f24031a = fVar;
        this.f24032b = kVar;
        this.f24033c = collection;
        this.f24034d = lVar;
        this.f24035e = fVarArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(wd.f fVar, f[] fVarArr, gc.l<? super y, String> lVar) {
        this(fVar, (bf.k) null, (Collection<wd.f>) null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        hc.t.e(fVar, "name");
        hc.t.e(fVarArr, "checks");
        hc.t.e(lVar, "additionalChecks");
    }

    public /* synthetic */ h(wd.f fVar, f[] fVarArr, gc.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, fVarArr, (i10 & 4) != 0 ? a.f24036c : lVar);
    }

    public final g a(y yVar) {
        hc.t.e(yVar, "functionDescriptor");
        for (f fVar : this.f24035e) {
            String c10 = fVar.c(yVar);
            if (c10 != null) {
                return new g.b(c10);
            }
        }
        String invoke = this.f24034d.invoke(yVar);
        return invoke != null ? new g.b(invoke) : g.c.f24030b;
    }

    public final boolean b(y yVar) {
        hc.t.e(yVar, "functionDescriptor");
        if (this.f24031a == null || hc.t.a(yVar.getName(), this.f24031a)) {
            if (this.f24032b != null) {
                String b10 = yVar.getName().b();
                hc.t.d(b10, "functionDescriptor.name.asString()");
                if (!this.f24032b.h(b10)) {
                    return false;
                }
            }
            Collection<wd.f> collection = this.f24033c;
            return collection == null || collection.contains(yVar.getName());
        }
        return false;
    }
}
