package io.ktor.utils.io.jvm.javaio;

import gc.p;
import io.ktor.utils.io.k;
import io.ktor.utils.io.u;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlinx.coroutines.t1;
import tb.e0;
import tb.t;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¨\u0006\b"}, d2 = {"Ljava/io/InputStream;", "Lxb/g;", "context", "Lrb/f;", "Ljava/nio/ByteBuffer;", "pool", "Lio/ktor/utils/io/h;", "a", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lio/ktor/utils/io/u;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$1", f = "Reading.kt", l = {60}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements p<u, xb.d<? super e0>, Object> {
        int U3;
        private /* synthetic */ Object V3;
        final /* synthetic */ rb.f<ByteBuffer> W3;
        final /* synthetic */ InputStream X3;

        /* renamed from: y */
        Object f12942y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(rb.f<ByteBuffer> fVar, InputStream inputStream, xb.d<? super a> dVar) {
            super(2, dVar);
            this.W3 = fVar;
            this.X3 = inputStream;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            Throwable th2;
            u uVar;
            ByteBuffer byteBuffer;
            a aVar;
            InputStream inputStream;
            c10 = yb.d.c();
            int i10 = this.U3;
            if (i10 == 0) {
                t.b(obj);
                byteBuffer = this.W3.c0();
                uVar = (u) this.V3;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                byteBuffer = (ByteBuffer) this.f12942y;
                uVar = (u) this.V3;
                try {
                    t.b(obj);
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar = this;
                    try {
                        uVar.e().a(th2);
                        aVar.W3.B0(byteBuffer);
                        inputStream = aVar.X3;
                        inputStream.close();
                        return e0.f22152a;
                    } catch (Throwable th4) {
                        aVar.W3.B0(byteBuffer);
                        aVar.X3.close();
                        throw th4;
                    }
                }
            }
            while (true) {
                try {
                    byteBuffer.clear();
                    int read = this.X3.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
                    if (read < 0) {
                        this.W3.B0(byteBuffer);
                        inputStream = this.X3;
                        break;
                    } else if (read != 0) {
                        byteBuffer.position(byteBuffer.position() + read);
                        byteBuffer.flip();
                        k e10 = uVar.e();
                        this.V3 = uVar;
                        this.f12942y = byteBuffer;
                        this.U3 = 1;
                        if (e10.c(byteBuffer, this) == c10) {
                            return c10;
                        }
                    }
                } catch (Throwable th5) {
                    aVar = this;
                    th2 = th5;
                    uVar.e().a(th2);
                    aVar.W3.B0(byteBuffer);
                    inputStream = aVar.X3;
                    inputStream.close();
                    return e0.f22152a;
                }
            }
            inputStream.close();
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(u uVar, xb.d<? super e0> dVar) {
            return ((a) j(uVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            a aVar = new a(this.W3, this.X3, dVar);
            aVar.V3 = obj;
            return aVar;
        }
    }

    public static final io.ktor.utils.io.h a(InputStream inputStream, xb.g gVar, rb.f<ByteBuffer> fVar) {
        hc.t.e(inputStream, "<this>");
        hc.t.e(gVar, "context");
        hc.t.e(fVar, "pool");
        return io.ktor.utils.io.p.c(t1.f15571c, gVar, true, new a(fVar, inputStream, null)).e();
    }
}
