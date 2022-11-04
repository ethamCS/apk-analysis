package ta;

import hc.k0;
import java.io.InputStream;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lna/a;", "Ltb/e0;", "a", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class h {

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", "Lza/d;", "Loa/b;", "<name for destructuring parameter 0>", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "io.ktor.client.features.DefaultTransformersJvmKt$platformDefaultTransformers$1", f = "DefaultTransformersJvm.kt", l = {31}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements gc.q<jb.e<za.d, oa.b>, za.d, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        /* synthetic */ Object V3;

        /* renamed from: y */
        int f22060y;

        @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"ta/h$a$a", "Ljava/io/InputStream;", BuildConfig.FLAVOR, "read", BuildConfig.FLAVOR, "b", "off", "len", "available", "Ltb/e0;", "close", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
        /* renamed from: ta.h$a$a */
        /* loaded from: classes.dex */
        public static final class C0380a extends InputStream {

            /* renamed from: c */
            final /* synthetic */ InputStream f22061c;

            /* renamed from: d */
            final /* synthetic */ jb.e<za.d, oa.b> f22062d;

            C0380a(InputStream inputStream, jb.e<za.d, oa.b> eVar) {
                this.f22061c = inputStream;
                this.f22062d = eVar;
            }

            @Override // java.io.InputStream
            public int available() {
                return this.f22061c.available();
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                this.f22061c.close();
                za.e.a(this.f22062d.b().g());
            }

            @Override // java.io.InputStream
            public int read() {
                return this.f22061c.read();
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) {
                hc.t.e(bArr, "b");
                return this.f22061c.read(bArr, i10, i11);
            }
        }

        a(xb.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f22060y;
            if (i10 == 0) {
                tb.t.b(obj);
                jb.e eVar = (jb.e) this.U3;
                za.d dVar = (za.d) this.V3;
                oa.i a10 = dVar.a();
                Object b10 = dVar.b();
                if (!(b10 instanceof io.ktor.utils.io.h)) {
                    return e0.f22152a;
                }
                if (hc.t.a(a10.getType(), k0.b(InputStream.class))) {
                    za.d dVar2 = new za.d(a10, (Object) new C0380a(io.ktor.utils.io.jvm.javaio.b.c((io.ktor.utils.io.h) b10, (a2) ((oa.b) eVar.b()).h().i(a2.W0)), eVar));
                    this.U3 = null;
                    this.f22060y = 1;
                    if (eVar.O0(dVar2, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object s(jb.e<za.d, oa.b> eVar, za.d dVar, xb.d<? super e0> dVar2) {
            a aVar = new a(dVar2);
            aVar.U3 = eVar;
            aVar.V3 = dVar;
            return aVar.B(e0.f22152a);
        }
    }

    public static final void a(na.a aVar) {
        hc.t.e(aVar, "<this>");
        aVar.u().o(za.f.f26572i.a(), new a(null));
    }
}
