package coil.util;

import androidx.exifinterface.media.ExifInterface;
import coil.ComponentRegistry;
import coil.decode.Decoder;
import coil.map.Mapper;
import coil.map.MeasuredMapper;
import coil.size.Size;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
/* compiled from: ComponentRegistries.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a5\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\u0010\r\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\u000f\"\b\b\u0000\u0010\b*\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"mapData", "", "Lcoil/ComponentRegistry;", "data", "size", "Lcoil/size/Size;", "requireDecoder", "Lcoil/decode/Decoder;", ExifInterface.GPS_DIRECTION_TRUE, "source", "Lokio/BufferedSource;", "mimeType", "", "(Lcoil/ComponentRegistry;Ljava/lang/Object;Lokio/BufferedSource;Ljava/lang/String;)Lcoil/decode/Decoder;", "requireFetcher", "Lcoil/fetch/Fetcher;", "(Lcoil/ComponentRegistry;Ljava/lang/Object;)Lcoil/fetch/Fetcher;", "coil-base_release"}, k = 2, mv = {1, 4, 0})
/* renamed from: coil.util.-ComponentRegistries */
/* loaded from: classes2.dex */
public final class ComponentRegistries {
    public static final Object mapData(ComponentRegistry mapData, Object data, Size size) {
        Intrinsics.checkNotNullParameter(mapData, "$this$mapData");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(size, "size");
        List<Pair<MeasuredMapper<? extends Object, ?>, Class<? extends Object>>> measuredMappers$coil_base_release = mapData.getMeasuredMappers$coil_base_release();
        int size2 = measuredMappers$coil_base_release.size();
        for (int i = 0; i < size2; i++) {
            Pair<MeasuredMapper<? extends Object, ?>, Class<? extends Object>> pair = measuredMappers$coil_base_release.get(i);
            MeasuredMapper<? extends Object, ?> component1 = pair.component1();
            if (pair.component2().isAssignableFrom(data.getClass())) {
                Objects.requireNonNull(component1, "null cannot be cast to non-null type coil.map.MeasuredMapper<kotlin.Any, *>");
                if (component1.handles(data)) {
                    data = component1.map(data, size);
                }
            }
        }
        List<Pair<Mapper<? extends Object, ?>, Class<? extends Object>>> mappers$coil_base_release = mapData.getMappers$coil_base_release();
        int size3 = mappers$coil_base_release.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Pair<Mapper<? extends Object, ?>, Class<? extends Object>> pair2 = mappers$coil_base_release.get(i2);
            Mapper<? extends Object, ?> component12 = pair2.component1();
            if (pair2.component2().isAssignableFrom(data.getClass())) {
                Objects.requireNonNull(component12, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                if (component12.handles(data)) {
                    data = component12.map(data);
                }
            }
        }
        return data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0047 A[LOOP:0: B:3:0x0017->B:11:0x0047, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[EDGE_INSN: B:19:0x004b->B:13:0x004b ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> coil.fetch.Fetcher<T> requireFetcher(coil.ComponentRegistry r7, T r8) {
        /*
            java.lang.String r0 = "$this$requireFetcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.List r7 = r7.getFetchers$coil_base_release()
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L17:
            if (r2 >= r0) goto L4a
            java.lang.Object r3 = r7.get(r2)
            r4 = r3
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            coil.fetch.Fetcher r5 = (coil.fetch.Fetcher) r5
            java.lang.Object r4 = r4.component2()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class r6 = r8.getClass()
            boolean r4 = r4.isAssignableFrom(r6)
            if (r4 == 0) goto L43
            java.lang.String r4 = "null cannot be cast to non-null type coil.fetch.Fetcher<kotlin.Any>"
            java.util.Objects.requireNonNull(r5, r4)
            boolean r4 = r5.handles(r8)
            if (r4 == 0) goto L43
            r4 = 1
            goto L44
        L43:
            r4 = 0
        L44:
            if (r4 == 0) goto L47
            goto L4b
        L47:
            int r2 = r2 + 1
            goto L17
        L4a:
            r3 = 0
        L4b:
            kotlin.Pair r3 = (kotlin.Pair) r3
            if (r3 == 0) goto L5b
            java.lang.Object r7 = r3.getFirst()
            java.lang.String r8 = "null cannot be cast to non-null type coil.fetch.Fetcher<T>"
            java.util.Objects.requireNonNull(r7, r8)
            coil.fetch.Fetcher r7 = (coil.fetch.Fetcher) r7
            return r7
        L5b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unable to fetch data. No fetcher supports: "
            r7.append(r0)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.util.ComponentRegistries.requireFetcher(coil.ComponentRegistry, java.lang.Object):coil.fetch.Fetcher");
    }

    public static final <T> Decoder requireDecoder(ComponentRegistry requireDecoder, T data, BufferedSource source, String str) {
        Decoder decoder;
        Intrinsics.checkNotNullParameter(requireDecoder, "$this$requireDecoder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(source, "source");
        List<Decoder> decoders$coil_base_release = requireDecoder.getDecoders$coil_base_release();
        int size = decoders$coil_base_release.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                decoder = null;
                break;
            }
            decoder = decoders$coil_base_release.get(i);
            if (decoder.handles(source, str)) {
                break;
            }
            i++;
        }
        Decoder decoder2 = decoder;
        if (decoder2 != null) {
            return decoder2;
        }
        throw new IllegalStateException(("Unable to decode data. No decoder supports: " + data).toString());
    }
}
