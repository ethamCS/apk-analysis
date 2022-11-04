package ob;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR(\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\"\u0010 \u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006%"}, d2 = {"Lob/d;", BuildConfig.FLAVOR, "Lpb/a;", "head", "Lpb/a;", "b", "()Lpb/a;", "i", "(Lpb/a;)V", "tail", "c", "j", "Llb/c;", "tailMemory", "Ljava/nio/ByteBuffer;", "f", "()Ljava/nio/ByteBuffer;", "m", "(Ljava/nio/ByteBuffer;)V", BuildConfig.FLAVOR, "tailPosition", "I", "g", "()I", "n", "(I)V", "tailEndExclusive", "d", "k", "tailInitialPosition", "e", "l", "chainedSize", "a", "h", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private pb.a f17751a;

    /* renamed from: b */
    private pb.a f17752b;

    /* renamed from: c */
    private ByteBuffer f17753c = lb.c.Companion.a();

    /* renamed from: d */
    private int f17754d;

    /* renamed from: e */
    private int f17755e;

    /* renamed from: f */
    private int f17756f;

    /* renamed from: g */
    private int f17757g;

    public final int a() {
        return this.f17757g;
    }

    public final pb.a b() {
        return this.f17751a;
    }

    public final pb.a c() {
        return this.f17752b;
    }

    public final int d() {
        return this.f17755e;
    }

    public final int e() {
        return this.f17756f;
    }

    public final ByteBuffer f() {
        return this.f17753c;
    }

    public final int g() {
        return this.f17754d;
    }

    public final void h(int i10) {
        this.f17757g = i10;
    }

    public final void i(pb.a aVar) {
        this.f17751a = aVar;
    }

    public final void j(pb.a aVar) {
        this.f17752b = aVar;
    }

    public final void k(int i10) {
        this.f17755e = i10;
    }

    public final void l(int i10) {
        this.f17756f = i10;
    }

    public final void m(ByteBuffer byteBuffer) {
        hc.t.e(byteBuffer, "<set-?>");
        this.f17753c = byteBuffer;
    }

    public final void n(int i10) {
        this.f17754d = i10;
    }
}
