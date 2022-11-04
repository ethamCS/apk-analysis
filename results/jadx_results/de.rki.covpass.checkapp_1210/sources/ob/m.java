package ob;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001\u001a&\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b\u001a&\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b\u001a\u001c\u0010\u000f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\b\u001a\u001a\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\b¨\u0006\u0012"}, d2 = {"Lob/e;", BuildConfig.FLAVOR, "c", "value", "Ltb/e0;", "f", BuildConfig.FLAVOR, "destination", BuildConfig.FLAVOR, "offset", "length", "b", "source", "e", "dst", "a", "src", "d", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class m {

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ob/m$a", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends pb.f {

        /* renamed from: a */
        final /* synthetic */ int f17777a;

        public a(int i10) {
            this.f17777a = i10;
        }

        public Void a() {
            throw new IllegalArgumentException(hc.t.l("length shouldn't be negative: ", Integer.valueOf(this.f17777a)));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ob/m$b", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends pb.f {

        /* renamed from: a */
        final /* synthetic */ int f17778a;

        /* renamed from: b */
        final /* synthetic */ e f17779b;

        public b(int i10, e eVar) {
            this.f17778a = i10;
            this.f17779b = eVar;
        }

        public Void a() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("length shouldn't be greater than the source read remaining: ");
            sb2.append(this.f17778a);
            sb2.append(" > ");
            e eVar = this.f17779b;
            sb2.append(eVar.s() - eVar.p());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ob/m$c", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c extends pb.f {

        /* renamed from: a */
        final /* synthetic */ int f17780a;

        /* renamed from: b */
        final /* synthetic */ e f17781b;

        public c(int i10, e eVar) {
            this.f17780a = i10;
            this.f17781b = eVar;
        }

        public Void a() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("length shouldn't be greater than the destination write remaining space: ");
            sb2.append(this.f17780a);
            sb2.append(" > ");
            e eVar = this.f17781b;
            sb2.append(eVar.j() - eVar.s());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static final int a(e eVar, e eVar2, int i10) {
        hc.t.e(eVar, "<this>");
        hc.t.e(eVar2, "dst");
        boolean z10 = true;
        if (i10 >= 0) {
            if (!(i10 <= eVar2.j() - eVar2.s())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            ByteBuffer n10 = eVar.n();
            int p10 = eVar.p();
            if (eVar.s() - p10 < i10) {
                z10 = false;
            }
            if (!z10) {
                new l("buffer content", i10).a();
                throw new tb.i();
            }
            lb.c.c(n10, eVar2.n(), p10, i10, eVar2.s());
            eVar2.b(i10);
            tb.e0 e0Var = tb.e0.f22152a;
            eVar.f(i10);
            return i10;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final void b(e eVar, byte[] bArr, int i10, int i11) {
        hc.t.e(eVar, "<this>");
        hc.t.e(bArr, "destination");
        ByteBuffer n10 = eVar.n();
        int p10 = eVar.p();
        if (!(eVar.s() - p10 >= i11)) {
            new l("byte array", i11).a();
            throw new tb.i();
        }
        lb.d.a(n10, bArr, p10, i11, i10);
        tb.e0 e0Var = tb.e0.f22152a;
        eVar.f(i11);
    }

    public static final short c(e eVar) {
        hc.t.e(eVar, "<this>");
        ByteBuffer n10 = eVar.n();
        int p10 = eVar.p();
        if (!(eVar.s() - p10 >= 2)) {
            new l("short integer", 2).a();
            throw new tb.i();
        }
        Short valueOf = Short.valueOf(n10.getShort(p10));
        eVar.f(2);
        return valueOf.shortValue();
    }

    public static final void d(e eVar, e eVar2, int i10) {
        hc.t.e(eVar, "<this>");
        hc.t.e(eVar2, "src");
        boolean z10 = true;
        if (!(i10 >= 0)) {
            new a(i10).a();
            throw new tb.i();
        }
        if (!(i10 <= eVar2.s() - eVar2.p())) {
            new b(i10, eVar2).a();
            throw new tb.i();
        }
        if (i10 > eVar.j() - eVar.s()) {
            z10 = false;
        }
        if (!z10) {
            new c(i10, eVar).a();
            throw new tb.i();
        }
        ByteBuffer n10 = eVar.n();
        int s10 = eVar.s();
        int j10 = eVar.j() - s10;
        if (j10 < i10) {
            throw new e0("buffer readable content", i10, j10);
        }
        lb.c.c(eVar2.n(), n10, eVar2.p(), i10, s10);
        eVar2.f(i10);
        eVar.b(i10);
    }

    public static final void e(e eVar, byte[] bArr, int i10, int i11) {
        hc.t.e(eVar, "<this>");
        hc.t.e(bArr, "source");
        ByteBuffer n10 = eVar.n();
        int s10 = eVar.s();
        int j10 = eVar.j() - s10;
        if (j10 >= i11) {
            ByteBuffer order = ByteBuffer.wrap(bArr, i10, i11).slice().order(ByteOrder.BIG_ENDIAN);
            hc.t.d(order, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
            lb.c.c(lb.c.b(order), n10, 0, i11, s10);
            eVar.b(i11);
            return;
        }
        throw new e0("byte array", i11, j10);
    }

    public static final void f(e eVar, short s10) {
        hc.t.e(eVar, "<this>");
        ByteBuffer n10 = eVar.n();
        int s11 = eVar.s();
        int j10 = eVar.j() - s11;
        if (j10 >= 2) {
            n10.putShort(s11, s10);
            eVar.b(2);
            return;
        }
        throw new e0("short integer", 2, j10);
    }
}
