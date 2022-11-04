package io.ktor.utils.io.internal;

import hc.t;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import ob.f0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/internal/l;", BuildConfig.FLAVOR, "Lio/ktor/utils/io/a;", "a", "Lio/ktor/utils/io/a;", "current", "Ljava/nio/ByteBuffer;", "b", "Ljava/nio/ByteBuffer;", "byteBuffer", "Lio/ktor/utils/io/internal/i;", "d", "Lio/ktor/utils/io/internal/i;", "ringBufferCapacity", "channel", "<init>", "(Lio/ktor/utils/io/a;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    private io.ktor.utils.io.a f12913a;

    /* renamed from: b */
    private ByteBuffer f12914b;

    /* renamed from: c */
    private f0 f12915c;

    /* renamed from: d */
    private i f12916d;

    public l(io.ktor.utils.io.a aVar) {
        t.e(aVar, "channel");
        this.f12913a = aVar.p0();
        f0.c cVar = f0.Companion;
        this.f12914b = cVar.a().n();
        this.f12915c = cVar.a();
        this.f12916d = this.f12913a.M().f12890b;
    }
}
