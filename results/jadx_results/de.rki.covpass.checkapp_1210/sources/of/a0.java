package of;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lof/a0;", BuildConfig.FLAVOR, "Lof/w;", "b", BuildConfig.FLAVOR, "a", "Leg/d;", "sink", "Ltb/e0;", "e", BuildConfig.FLAVOR, "c", "d", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class a0 {
    public static final a Companion = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\t\u001a\u00020\b*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lof/a0$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lof/w;", "contentType", BuildConfig.FLAVOR, "offset", "byteCount", "Lof/a0;", "a", "([BLof/w;II)Lof/a0;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"of/a0$a$a", "Lof/a0;", "Lof/w;", "b", BuildConfig.FLAVOR, "a", "Leg/d;", "sink", "Ltb/e0;", "e", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* renamed from: of.a0$a$a */
        /* loaded from: classes3.dex */
        public static final class C0283a extends a0 {

            /* renamed from: a */
            final /* synthetic */ w f18074a;

            /* renamed from: b */
            final /* synthetic */ int f18075b;

            /* renamed from: c */
            final /* synthetic */ byte[] f18076c;

            /* renamed from: d */
            final /* synthetic */ int f18077d;

            C0283a(w wVar, int i10, byte[] bArr, int i11) {
                this.f18074a = wVar;
                this.f18075b = i10;
                this.f18076c = bArr;
                this.f18077d = i11;
            }

            @Override // of.a0
            public long a() {
                return this.f18075b;
            }

            @Override // of.a0
            public w b() {
                return this.f18074a;
            }

            @Override // of.a0
            public void e(eg.d dVar) {
                hc.t.e(dVar, "sink");
                dVar.o(this.f18076c, this.f18077d, this.f18075b);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ a0 b(a aVar, byte[] bArr, w wVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                wVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.a(bArr, wVar, i10, i11);
        }

        @fc.c
        public final a0 a(byte[] bArr, w wVar, int i10, int i11) {
            hc.t.e(bArr, "<this>");
            pf.d.l(bArr.length, i10, i11);
            return new C0283a(wVar, i11, bArr, i10);
        }
    }

    public abstract long a();

    public abstract w b();

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public abstract void e(eg.d dVar);
}
