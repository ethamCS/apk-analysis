package ob;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import pb.a;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0017B'\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0004J*\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0004ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\fH\u0004J\b\u0010\u000f\u001a\u00020\u000eH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lob/u;", "Lob/w;", "Lob/z;", "Lpb/a;", "V", "Llb/c;", "destination", BuildConfig.FLAVOR, "offset", "length", "W", "(Ljava/nio/ByteBuffer;II)I", "Ltb/e0;", "j", BuildConfig.FLAVOR, "toString", "head", BuildConfig.FLAVOR, "remaining", "Lrb/f;", "pool", "<init>", "(Lpb/a;JLrb/f;)V", "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class u extends w {
    public static final a Companion = new a(null);

    /* renamed from: x */
    private static final u f17794x;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lob/u$a;", BuildConfig.FLAVOR, "Lob/u;", "Empty", "Lob/u;", "a", "()Lob/u;", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a() {
            return u.f17794x;
        }
    }

    static {
        a.e eVar = pb.a.Companion;
        f17794x = new u(eVar.a(), 0L, eVar.b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(pb.a aVar, long j10, rb.f<pb.a> fVar) {
        super(aVar, j10, fVar);
        hc.t.e(aVar, "head");
        hc.t.e(fVar, "pool");
        O0();
    }

    @Override // ob.a
    protected final pb.a V() {
        return null;
    }

    @Override // ob.a
    protected final int W(ByteBuffer byteBuffer, int i10, int i11) {
        hc.t.e(byteBuffer, "destination");
        return 0;
    }

    @Override // ob.a
    protected final void j() {
    }

    public String toString() {
        return "ByteReadPacket(" + D0() + " bytes remaining)";
    }
}
