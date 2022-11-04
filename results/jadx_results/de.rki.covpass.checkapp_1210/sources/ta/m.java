package ta;

import bb.c;
import hc.k0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ob.l0;
import org.conscrypt.BuildConfig;
import tb.e0;
import ub.c0;
import ub.s0;
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dBO\b\u0000\u0012\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0013\u0012\u0016\u0010\u0017\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000e\u0010\u0018\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\u0010\u0019\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0002J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lta/m;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "content", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "contentCharset", "e", "Loa/b;", "call", "Lob/z;", "body", "d", "(Loa/b;Lob/z;)Ljava/lang/String;", "Lya/c;", "context", "Ltb/e0;", "c", "(Lya/c;)V", BuildConfig.FLAVOR, "charsets", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "charsetQuality", "sendCharset", "responseCharsetFallback", "<init>", "(Ljava/util/Set;Ljava/util/Map;Ljava/nio/charset/Charset;Ljava/nio/charset/Charset;)V", "a", "b", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class m {

    /* renamed from: d */
    public static final b f22080d = new b(null);

    /* renamed from: e */
    private static final fb.a<m> f22081e = new fb.a<>("HttpPlainText");

    /* renamed from: a */
    private final Charset f22082a;

    /* renamed from: b */
    private final Charset f22083b;

    /* renamed from: c */
    private final String f22084c;

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0007\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u00060\u0003j\u0002`\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u001a"}, d2 = {"Lta/m$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charsets", "Ljava/util/Set;", "b", "()Ljava/util/Set;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "charsetQuality", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "sendCharset", "Ljava/nio/charset/Charset;", "d", "()Ljava/nio/charset/Charset;", "setSendCharset", "(Ljava/nio/charset/Charset;)V", "responseCharsetFallback", "c", "setResponseCharsetFallback", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Set<Charset> f22085a = new LinkedHashSet();

        /* renamed from: b */
        private final Map<Charset, Float> f22086b = new LinkedHashMap();

        /* renamed from: c */
        private Charset f22087c;

        /* renamed from: d */
        private Charset f22088d;

        /* renamed from: e */
        private Charset f22089e;

        public a() {
            Charset charset = bf.d.f5986b;
            this.f22088d = charset;
            this.f22089e = charset;
        }

        public final Map<Charset, Float> a() {
            return this.f22086b;
        }

        public final Set<Charset> b() {
            return this.f22085a;
        }

        public final Charset c() {
            return this.f22088d;
        }

        public final Charset d() {
            return this.f22087c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lta/m$b;", "Lta/k;", "Lta/m$a;", "Lta/m;", "Lkotlin/Function1;", "Ltb/e0;", "block", "d", "feature", "Lna/a;", "scope", "c", "Lfb/a;", "key", "Lfb/a;", "getKey", "()Lfb/a;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b implements k<a, m> {

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", BuildConfig.FLAVOR, "Lya/c;", "content", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.features.HttpPlainText$Feature$install$1", f = "HttpPlainText.kt", l = {140}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends zb.l implements gc.q<jb.e<Object, ya.c>, Object, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            /* synthetic */ Object V3;
            final /* synthetic */ m W3;

            /* renamed from: y */
            int f22090y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, xb.d<? super a> dVar) {
                super(3, dVar);
                this.W3 = mVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                c10 = yb.d.c();
                int i10 = this.f22090y;
                if (i10 == 0) {
                    tb.t.b(obj);
                    jb.e eVar = (jb.e) this.U3;
                    Object obj2 = this.V3;
                    this.W3.c((ya.c) eVar.b());
                    if (!(obj2 instanceof String)) {
                        return e0.f22152a;
                    }
                    bb.c d10 = bb.t.d((bb.s) eVar.b());
                    if (d10 != null && !hc.t.a(d10.e(), c.C0079c.f5812a.a().e())) {
                        return e0.f22152a;
                    }
                    Object e10 = this.W3.e((String) obj2, d10 == null ? null : bb.e.a(d10));
                    this.U3 = null;
                    this.f22090y = 1;
                    if (eVar.O0(e10, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    tb.t.b(obj);
                }
                return e0.f22152a;
            }

            /* renamed from: d0 */
            public final Object s(jb.e<Object, ya.c> eVar, Object obj, xb.d<? super e0> dVar) {
                a aVar = new a(this.W3, dVar);
                aVar.U3 = eVar;
                aVar.V3 = obj;
                return aVar.B(e0.f22152a);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", "Lza/d;", "Loa/b;", "<name for destructuring parameter 0>", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.features.HttpPlainText$Feature$install$2", f = "HttpPlainText.kt", l = {146, 148}, m = "invokeSuspend")
        /* renamed from: ta.m$b$b */
        /* loaded from: classes.dex */
        public static final class C0383b extends zb.l implements gc.q<jb.e<za.d, oa.b>, za.d, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            /* synthetic */ Object V3;
            final /* synthetic */ m W3;

            /* renamed from: y */
            int f22091y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0383b(m mVar, xb.d<? super C0383b> dVar) {
                super(3, dVar);
                this.W3 = mVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                jb.e eVar;
                oa.i iVar;
                c10 = yb.d.c();
                int i10 = this.f22091y;
                if (i10 == 0) {
                    tb.t.b(obj);
                    jb.e eVar2 = (jb.e) this.U3;
                    za.d dVar = (za.d) this.V3;
                    oa.i a10 = dVar.a();
                    Object b10 = dVar.b();
                    if (!hc.t.a(a10.getType(), k0.b(String.class)) || !(b10 instanceof io.ktor.utils.io.h)) {
                        return e0.f22152a;
                    }
                    this.U3 = eVar2;
                    this.V3 = a10;
                    this.f22091y = 1;
                    Object f10 = io.ktor.utils.io.j.f((io.ktor.utils.io.h) b10, this);
                    if (f10 == c10) {
                        return c10;
                    }
                    eVar = eVar2;
                    obj = f10;
                    iVar = a10;
                } else if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tb.t.b(obj);
                    return e0.f22152a;
                } else {
                    iVar = (oa.i) this.V3;
                    eVar = (jb.e) this.U3;
                    tb.t.b(obj);
                }
                za.d dVar2 = new za.d(iVar, (Object) this.W3.d((oa.b) eVar.b(), (ob.u) obj));
                this.U3 = null;
                this.V3 = null;
                this.f22091y = 2;
                if (eVar.O0(dVar2, this) == c10) {
                    return c10;
                }
                return e0.f22152a;
            }

            /* renamed from: d0 */
            public final Object s(jb.e<za.d, oa.b> eVar, za.d dVar, xb.d<? super e0> dVar2) {
                C0383b c0383b = new C0383b(this.W3, dVar2);
                c0383b.U3 = eVar;
                c0383b.V3 = dVar;
                return c0383b.B(e0.f22152a);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(m mVar, na.a aVar) {
            hc.t.e(mVar, "feature");
            hc.t.e(aVar, "scope");
            aVar.s().o(ya.f.f25994i.b(), new a(mVar, null));
            aVar.u().o(za.f.f26572i.a(), new C0383b(mVar, null));
        }

        /* renamed from: d */
        public m a(gc.l<? super a, e0> lVar) {
            hc.t.e(lVar, "block");
            a aVar = new a();
            lVar.invoke(aVar);
            return new m(aVar.b(), aVar.a(), aVar.d(), aVar.c());
        }

        @Override // ta.k
        public fb.a<m> getKey() {
            return m.f22081e;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", BuildConfig.FLAVOR, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int a10;
            a10 = wb.b.a(mb.a.i((Charset) t10), mb.a.i((Charset) t11));
            return a10;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", BuildConfig.FLAVOR, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int a10;
            a10 = wb.b.a((Float) ((tb.r) t11).f(), (Float) ((tb.r) t10).f());
            return a10;
        }
    }

    public m(Set<? extends Charset> set, Map<Charset, Float> map, Charset charset, Charset charset2) {
        List w9;
        List w02;
        boolean z10;
        List<Charset> w03;
        Object X;
        Object X2;
        int a10;
        hc.t.e(set, "charsets");
        hc.t.e(map, "charsetQuality");
        hc.t.e(charset2, "responseCharsetFallback");
        this.f22082a = charset2;
        w9 = s0.w(map);
        w02 = c0.w0(w9, new d());
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (true) {
            z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (true ^ map.containsKey((Charset) next)) {
                arrayList.add(next);
            }
        }
        w03 = c0.w0(arrayList, new c());
        StringBuilder sb2 = new StringBuilder();
        for (Charset charset3 : w03) {
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(mb.a.i(charset3));
        }
        Iterator it2 = w02.iterator();
        while (true) {
            boolean z11 = false;
            if (!it2.hasNext()) {
                if (sb2.length() != 0 ? false : z10) {
                    sb2.append(mb.a.i(this.f22082a));
                }
                String sb3 = sb2.toString();
                hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
                this.f22084c = sb3;
                if (charset == null) {
                    X2 = c0.X(w03);
                    charset = (Charset) X2;
                }
                if (charset == null) {
                    X = c0.X(w02);
                    tb.r rVar = (tb.r) X;
                    charset = rVar == null ? null : (Charset) rVar.e();
                    if (charset == null) {
                        charset = bf.d.f5986b;
                    }
                }
                this.f22083b = charset;
                return;
            }
            tb.r rVar2 = (tb.r) it2.next();
            Charset charset4 = (Charset) rVar2.b();
            float floatValue = ((Number) rVar2.c()).floatValue();
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            double d10 = floatValue;
            if (0.0d <= d10 && d10 <= 1.0d) {
                z11 = true;
            }
            if (!z11) {
                throw new IllegalStateException("Check failed.".toString());
            }
            a10 = jc.c.a(100 * floatValue);
            sb2.append(mb.a.i(charset4) + ";q=" + (a10 / 100.0d));
        }
    }

    public final Object e(String str, Charset charset) {
        if (charset == null) {
            charset = this.f22083b;
        }
        return new db.b(str, bb.e.b(c.C0079c.f5812a.a(), charset), null, 4, null);
    }

    public final void c(ya.c cVar) {
        hc.t.e(cVar, "context");
        bb.m a10 = cVar.a();
        bb.p pVar = bb.p.f5855a;
        if (a10.g(pVar.d()) != null) {
            return;
        }
        cVar.a().m(pVar.d(), this.f22084c);
    }

    public final String d(oa.b bVar, ob.z zVar) {
        hc.t.e(bVar, "call");
        hc.t.e(zVar, "body");
        Charset a10 = bb.t.a(bVar.g());
        if (a10 == null) {
            a10 = this.f22082a;
        }
        return l0.e(zVar, a10, 0, 2, null);
    }
}
