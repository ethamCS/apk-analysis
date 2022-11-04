package of;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lof/c0;", "Ljava/io/Closeable;", "Lof/w;", "e", BuildConfig.FLAVOR, "b", "Leg/e;", "f", "Ltb/e0;", "close", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class c0 implements Closeable {
    public static final a Companion = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lof/c0$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lof/w;", "contentType", "Lof/c0;", "b", "([BLof/w;)Lof/c0;", "Leg/e;", BuildConfig.FLAVOR, "contentLength", "a", "(Leg/e;Lof/w;J)Lof/c0;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"of/c0$a$a", "Lof/c0;", "Lof/w;", "e", BuildConfig.FLAVOR, "b", "Leg/e;", "f", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* renamed from: of.c0$a$a */
        /* loaded from: classes3.dex */
        public static final class C0287a extends c0 {

            /* renamed from: c */
            final /* synthetic */ w f18132c;

            /* renamed from: d */
            final /* synthetic */ long f18133d;

            /* renamed from: q */
            final /* synthetic */ eg.e f18134q;

            C0287a(w wVar, long j10, eg.e eVar) {
                this.f18132c = wVar;
                this.f18133d = j10;
                this.f18134q = eVar;
            }

            @Override // of.c0
            public long b() {
                return this.f18133d;
            }

            @Override // of.c0
            public w e() {
                return this.f18132c;
            }

            @Override // of.c0
            public eg.e f() {
                return this.f18134q;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ c0 c(a aVar, byte[] bArr, w wVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                wVar = null;
            }
            return aVar.b(bArr, wVar);
        }

        @fc.c
        public final c0 a(eg.e eVar, w wVar, long j10) {
            hc.t.e(eVar, "<this>");
            return new C0287a(wVar, j10, eVar);
        }

        @fc.c
        public final c0 b(byte[] bArr, w wVar) {
            hc.t.e(bArr, "<this>");
            return a(new eg.c().r0(bArr), wVar, bArr.length);
        }
    }

    public abstract long b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        pf.d.m(f());
    }

    public abstract w e();

    public abstract eg.e f();
}
