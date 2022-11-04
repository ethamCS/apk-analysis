package ob;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006$"}, d2 = {"Lob/b;", BuildConfig.FLAVOR, "Lpb/a;", "head", "Lpb/a;", "a", "()Lpb/a;", "f", "(Lpb/a;)V", "Llb/c;", "headMemory", "Ljava/nio/ByteBuffer;", "c", "()Ljava/nio/ByteBuffer;", "h", "(Ljava/nio/ByteBuffer;)V", BuildConfig.FLAVOR, "headPosition", "I", "d", "()I", "i", "(I)V", "headEndExclusive", "b", "g", BuildConfig.FLAVOR, "tailRemaining", "J", "e", "()J", "j", "(J)V", "remaining", "<init>", "(Lpb/a;J)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private pb.a f17742a;

    /* renamed from: b */
    private ByteBuffer f17743b;

    /* renamed from: c */
    private int f17744c;

    /* renamed from: d */
    private int f17745d;

    /* renamed from: e */
    private long f17746e;

    public b(pb.a aVar, long j10) {
        hc.t.e(aVar, "head");
        this.f17742a = aVar;
        this.f17743b = aVar.n();
        this.f17744c = this.f17742a.p();
        int s10 = this.f17742a.s();
        this.f17745d = s10;
        this.f17746e = j10 - (s10 - this.f17744c);
    }

    public final pb.a a() {
        return this.f17742a;
    }

    public final int b() {
        return this.f17745d;
    }

    public final ByteBuffer c() {
        return this.f17743b;
    }

    public final int d() {
        return this.f17744c;
    }

    public final long e() {
        return this.f17746e;
    }

    public final void f(pb.a aVar) {
        hc.t.e(aVar, "<set-?>");
        this.f17742a = aVar;
    }

    public final void g(int i10) {
        this.f17745d = i10;
    }

    public final void h(ByteBuffer byteBuffer) {
        hc.t.e(byteBuffer, "<set-?>");
        this.f17743b = byteBuffer;
    }

    public final void i(int i10) {
        this.f17744c = i10;
    }

    public final void j(long j10) {
        this.f17746e = j10;
    }
}
