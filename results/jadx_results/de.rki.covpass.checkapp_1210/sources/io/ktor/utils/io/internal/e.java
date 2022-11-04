package io.ktor.utils.io.internal;

import hc.t;
import io.ktor.utils.io.internal.g;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\b\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\" \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\" \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0007\u0010\u000e\" \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, d2 = {BuildConfig.FLAVOR, "a", "I", "()I", "BUFFER_SIZE", "b", "BUFFER_POOL_SIZE", "c", "BUFFER_OBJECT_POOL_SIZE", "Lrb/f;", "Ljava/nio/ByteBuffer;", "BufferPool", "Lrb/f;", "d", "()Lrb/f;", "Lio/ktor/utils/io/internal/g$c;", "BufferObjectPool", "BufferObjectNoPool", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    private static final int f12881a;

    /* renamed from: b */
    private static final int f12882b;

    /* renamed from: c */
    private static final int f12883c;

    /* renamed from: d */
    private static final rb.f<ByteBuffer> f12884d;

    /* renamed from: e */
    private static final rb.f<g.c> f12885e;

    /* renamed from: f */
    private static final rb.f<g.c> f12886f = new a();

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"io/ktor/utils/io/internal/e$a", "Lrb/e;", "Lio/ktor/utils/io/internal/g$c;", "b", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends rb.e<g.c> {
        a() {
        }

        /* renamed from: b */
        public g.c c0() {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(e.a());
            t.d(allocateDirect, "allocateDirect(BUFFER_SIZE)");
            return new g.c(allocateDirect, 0, 2, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u0007"}, d2 = {"io/ktor/utils/io/internal/e$b", "Lrb/c;", "Lio/ktor/utils/io/internal/g$c;", "z", "instance", "Ltb/e0;", "u", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends rb.c<g.c> {
        b(int i10) {
            super(i10);
        }

        /* renamed from: u */
        public void f(g.c cVar) {
            t.e(cVar, "instance");
            e.d().B0(cVar.f12889a);
        }

        /* renamed from: z */
        public g.c j() {
            return new g.c(e.d().c0(), 0, 2, null);
        }
    }

    static {
        int a10 = k.a("BufferSize", 4096);
        f12881a = a10;
        int a11 = k.a("BufferPoolSize", 2048);
        f12882b = a11;
        int a12 = k.a("BufferObjectPoolSize", 1024);
        f12883c = a12;
        f12884d = new rb.d(a11, a10);
        f12885e = new b(a12);
    }

    public static final int a() {
        return f12881a;
    }

    public static final rb.f<g.c> b() {
        return f12886f;
    }

    public static final rb.f<g.c> c() {
        return f12885e;
    }

    public static final rb.f<ByteBuffer> d() {
        return f12884d;
    }
}
