package lb;

import hc.t;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\r"}, d2 = {"Llb/b;", "Llb/a;", BuildConfig.FLAVOR, "size", "Llb/c;", "b", "(I)Ljava/nio/ByteBuffer;", "instance", "Ltb/e0;", "a", "(Ljava/nio/ByteBuffer;)V", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a */
    public static final b f15916a = new b();

    private b() {
    }

    @Override // lb.a
    public void a(ByteBuffer byteBuffer) {
        t.e(byteBuffer, "instance");
    }

    @Override // lb.a
    public ByteBuffer b(int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        t.d(allocate, "allocate(size)");
        return c.b(allocate);
    }
}
