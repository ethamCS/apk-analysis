package io.ktor.utils.io.jvm.javaio;

import java.io.OutputStream;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/h;", "Ljava/io/OutputStream;", "out", BuildConfig.FLAVOR, "limit", "a", "(Lio/ktor/utils/io/h;Ljava/io/OutputStream;JLxb/d;)Ljava/lang/Object;", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class j {

    @zb.f(c = "io.ktor.utils.io.jvm.javaio.WritingKt", f = "Writing.kt", l = {22}, m = "copyTo")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends zb.d {
        Object U3;
        long V3;
        long W3;
        long X3;
        /* synthetic */ Object Y3;
        int Z3;

        /* renamed from: x */
        Object f12944x;

        /* renamed from: y */
        Object f12945y;

        a(xb.d<? super a> dVar) {
            super(dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.Y3 = obj;
            this.Z3 |= Integer.MIN_VALUE;
            return j.a(null, null, 0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0098 -> B:32:0x009d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(io.ktor.utils.io.h r18, java.io.OutputStream r19, long r20, xb.d<? super java.lang.Long> r22) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.j.a(io.ktor.utils.io.h, java.io.OutputStream, long, xb.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(io.ktor.utils.io.h hVar, OutputStream outputStream, long j10, xb.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return a(hVar, outputStream, j10, dVar);
    }
}
