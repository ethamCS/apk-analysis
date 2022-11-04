package va;

import hc.t;
import hc.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import lf.l;
import oa.i;
import ob.l0;
import ob.z;
import oc.n;
import org.conscrypt.BuildConfig;
import tb.e0;
import ua.d;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0014"}, d2 = {"Lva/a;", "Lua/d;", BuildConfig.FLAVOR, "data", "Lbb/c;", "contentType", "Ldb/a;", "c", BuildConfig.FLAVOR, "d", "(Ljava/lang/Object;)Ljava/lang/String;", "Lkb/a;", "type", "Lob/z;", "body", "b", "Llf/a;", "json", "<init>", "(Llf/a;)V", "ktor-client-serialization"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a implements d {
    public static final c Companion = new c(null);

    /* renamed from: b */
    private static final lf.a f23952b = l.b(null, b.f23956c, 1, null);

    /* renamed from: c */
    private static final lf.a f23953c = l.b(null, C0425a.f23955c, 1, null);

    /* renamed from: a */
    private final lf.a f23954a;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llf/c;", "Ltb/e0;", "b", "(Llf/c;)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: va.a$a */
    /* loaded from: classes.dex */
    static final class C0425a extends v implements gc.l<lf.c, e0> {

        /* renamed from: c */
        public static final C0425a f23955c = new C0425a();

        C0425a() {
            super(1);
        }

        public final void b(lf.c cVar) {
            t.e(cVar, "$this$Json");
            cVar.f(false);
            cVar.e(false);
            cVar.c(true);
            cVar.h(false);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(lf.c cVar) {
            b(cVar);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llf/c;", "Ltb/e0;", "b", "(Llf/c;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    static final class b extends v implements gc.l<lf.c, e0> {

        /* renamed from: c */
        public static final b f23956c = new b();

        b() {
            super(1);
        }

        public final void b(lf.c cVar) {
            t.e(cVar, "$this$Json");
            cVar.f(false);
            cVar.e(false);
            cVar.c(true);
            cVar.h(false);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(lf.c cVar) {
            b(cVar);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lva/a$c;", BuildConfig.FLAVOR, "<init>", "()V", "ktor-client-serialization"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a() {
        this(null, 1, null);
    }

    public a(lf.a aVar) {
        t.e(aVar, "json");
        this.f23954a = aVar;
    }

    public /* synthetic */ a(lf.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? f23953c : aVar);
    }

    @Override // ua.d
    public Object a(i iVar, z zVar) {
        return d.a.a(this, iVar, zVar);
    }

    @Override // ua.d
    public Object b(kb.a aVar, z zVar) {
        t.e(aVar, "type");
        t.e(zVar, "body");
        KSerializer<Object> kSerializer = null;
        String e10 = l0.e(zVar, null, 0, 3, null);
        KSerializer<Object> c10 = nf.d.c(this.f23954a.a(), aVar.getType(), null, 2, null);
        if (c10 == null) {
            n b10 = aVar.b();
            if (b10 != null) {
                kSerializer = SerializersKt.serializer(b10);
            }
            c10 = kSerializer == null ? SerializersKt.serializer(aVar.getType()) : kSerializer;
        }
        Object c11 = this.f23954a.c(c10, e10);
        t.b(c11);
        return c11;
    }

    @Override // ua.d
    public db.a c(Object obj, bb.c cVar) {
        t.e(obj, "data");
        t.e(cVar, "contentType");
        return new db.b(d(obj), cVar, null, 4, null);
    }

    public final String d(Object obj) {
        KSerializer b10;
        t.e(obj, "data");
        lf.a aVar = this.f23954a;
        b10 = va.b.b(obj, aVar.a());
        return aVar.d(b10, obj);
    }
}
