package ob;

import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
/* JADX WARN: Init of enum q can be incorrect */
/* JADX WARN: Init of enum x can be incorrect */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lob/p;", BuildConfig.FLAVOR, "Ljava/nio/ByteOrder;", "nioOrder", "Ljava/nio/ByteOrder;", "g", "()Ljava/nio/ByteOrder;", "<init>", "(Ljava/lang/String;ILjava/nio/ByteOrder;)V", "a", "BIG_ENDIAN", "LITTLE_ENDIAN", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public enum p {
    BIG_ENDIAN(r1),
    LITTLE_ENDIAN(r1);
    
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static final p f17787d;

    /* renamed from: c */
    private final ByteOrder f17791c;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lob/p$a;", BuildConfig.FLAVOR, "Lob/p;", "native", "Lob/p;", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        p b10;
        hc.t.d(ByteOrder.BIG_ENDIAN, "BIG_ENDIAN");
        hc.t.d(ByteOrder.LITTLE_ENDIAN, "LITTLE_ENDIAN");
        ByteOrder nativeOrder = ByteOrder.nativeOrder();
        hc.t.d(nativeOrder, "nativeOrder()");
        b10 = q.b(nativeOrder);
        f17787d = b10;
    }

    p(ByteOrder byteOrder) {
        this.f17791c = byteOrder;
    }

    public final ByteOrder g() {
        return this.f17791c;
    }
}
