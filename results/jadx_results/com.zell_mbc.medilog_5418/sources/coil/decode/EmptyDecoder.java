package coil.decode;

import android.graphics.drawable.ColorDrawable;
import coil.bitmap.BitmapPool;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
/* compiled from: EmptyDecoder.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcoil/decode/EmptyDecoder;", "Lcoil/decode/Decoder;", "()V", "result", "Lcoil/decode/DecodeResult;", "sink", "Lokio/Sink;", "decode", "pool", "Lcoil/bitmap/BitmapPool;", "source", "Lokio/BufferedSource;", "size", "Lcoil/size/Size;", "options", "Lcoil/decode/Options;", "(Lcoil/bitmap/BitmapPool;Lokio/BufferedSource;Lcoil/size/Size;Lcoil/decode/Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handles", "", "mimeType", "", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class EmptyDecoder implements Decoder {
    public static final EmptyDecoder INSTANCE = new EmptyDecoder();
    private static final DecodeResult result = new DecodeResult(new ColorDrawable(), false);
    private static final Sink sink = Okio.blackhole();

    @Override // coil.decode.Decoder
    public boolean handles(BufferedSource source, String str) {
        Intrinsics.checkNotNullParameter(source, "source");
        return false;
    }

    private EmptyDecoder() {
    }

    @Override // coil.decode.Decoder
    public Object decode(BitmapPool bitmapPool, BufferedSource bufferedSource, Size size, Options options, Continuation<? super DecodeResult> continuation) {
        BufferedSource bufferedSource2 = bufferedSource;
        try {
            Boxing.boxLong(bufferedSource2.readAll(sink));
            CloseableKt.closeFinally(bufferedSource2, null);
            return result;
        } finally {
        }
    }
}
