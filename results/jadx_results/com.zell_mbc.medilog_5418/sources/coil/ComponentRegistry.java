package coil;

import androidx.exifinterface.media.ExifInterface;
import coil.decode.Decoder;
import coil.fetch.Fetcher;
import coil.intercept.Interceptor;
import coil.map.Mapper;
import coil.map.MeasuredMapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ComponentRegistry.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0091\u0002\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012P\u0010\u0006\u001aL\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0\u00070\u0004j\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t`\n\u0012P\u0010\u000b\u001aL\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0\u00070\u0004j\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t`\n\u0012H\u0010\r\u001aD\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0\u00070\u0004j\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t`\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0018\u001a\u00020\u0019R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013RV\u0010\r\u001aD\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0\u00070\u0004j\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t`\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R^\u0010\u0006\u001aL\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0\u00070\u0004j\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t`\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R^\u0010\u000b\u001aL\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0\u00070\u0004j\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t`\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcoil/ComponentRegistry;", "", "()V", "interceptors", "", "Lcoil/intercept/Interceptor;", "mappers", "Lkotlin/Pair;", "Lcoil/map/Mapper;", "Ljava/lang/Class;", "Lcoil/util/MultiList;", "measuredMappers", "Lcoil/map/MeasuredMapper;", "fetchers", "Lcoil/fetch/Fetcher;", "decoders", "Lcoil/decode/Decoder;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDecoders$coil_base_release", "()Ljava/util/List;", "getFetchers$coil_base_release", "getInterceptors$coil_base_release", "getMappers$coil_base_release", "getMeasuredMappers$coil_base_release", "newBuilder", "Lcoil/ComponentRegistry$Builder;", "Builder", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ComponentRegistry {
    private final List<Decoder> decoders;
    private final List<Pair<Fetcher<? extends Object>, Class<? extends Object>>> fetchers;
    private final List<Interceptor> interceptors;
    private final List<Pair<Mapper<? extends Object, ?>, Class<? extends Object>>> mappers;
    private final List<Pair<MeasuredMapper<? extends Object, ?>, Class<? extends Object>>> measuredMappers;

    /* JADX WARN: Multi-variable type inference failed */
    private ComponentRegistry(List<? extends Interceptor> list, List<? extends Pair<? extends Mapper<? extends Object, ?>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends MeasuredMapper<? extends Object, ?>, ? extends Class<? extends Object>>> list3, List<? extends Pair<? extends Fetcher<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends Decoder> list5) {
        this.interceptors = list;
        this.mappers = list2;
        this.measuredMappers = list3;
        this.fetchers = list4;
        this.decoders = list5;
    }

    public /* synthetic */ ComponentRegistry(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    public final List<Interceptor> getInterceptors$coil_base_release() {
        return this.interceptors;
    }

    public final List<Pair<Mapper<? extends Object, ?>, Class<? extends Object>>> getMappers$coil_base_release() {
        return this.mappers;
    }

    public final List<Pair<MeasuredMapper<? extends Object, ?>, Class<? extends Object>>> getMeasuredMappers$coil_base_release() {
        return this.measuredMappers;
    }

    public final List<Pair<Fetcher<? extends Object>, Class<? extends Object>>> getFetchers$coil_base_release() {
        return this.fetchers;
    }

    public final List<Decoder> getDecoders$coil_base_release() {
        return this.decoders;
    }

    public ComponentRegistry() {
        this(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    /* compiled from: ComponentRegistry.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\bJ#\u0010\u0014\u001a\u00020\u0000\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u000bH\u0086\bJ.\u0010\u0014\u001a\u00020\u0000\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\fH\u0001J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u000fJ'\u0010\u0014\u001a\u00020\u0000\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u00012\u0010\u0010\u001a\u001a\f\u0012\u0004\u0012\u0002H\u0016\u0012\u0002\b\u00030\u0011H\u0086\bJ2\u0010\u0014\u001a\u00020\u0000\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0010\u0010\u001a\u001a\f\u0012\u0004\u0012\u0002H\u0016\u0012\u0002\b\u00030\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\fH\u0001J'\u0010\u0014\u001a\u00020\u0000\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u00012\u0010\u0010\u001b\u001a\f\u0012\u0004\u0012\u0002H\u0016\u0012\u0002\b\u00030\u0013H\u0087\bJ2\u0010\u0014\u001a\u00020\u0000\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0010\u0010\u001b\u001a\f\u0012\u0004\u0012\u0002H\u0016\u0012\u0002\b\u00030\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\fH\u0001J.\u0010\u0014\u001a\u00020\u0000\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u000bH\u0001J2\u0010\u0014\u001a\u00020\u0000\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\f2\u0010\u0010\u001a\u001a\f\u0012\u0004\u0012\u0002H\u0016\u0012\u0002\b\u00030\u0011H\u0001J2\u0010\u0014\u001a\u00020\u0000\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\f2\u0010\u0010\u001b\u001a\f\u0012\u0004\u0012\u0002H\u0016\u0012\u0002\b\u00030\u0013H\u0001J\u0006\u0010\u001c\u001a\u00020\u0004R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000RP\u0010\t\u001aD\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f0\n0\u0007j\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000RX\u0010\u0010\u001aL\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u0011\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f0\n0\u0007j\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u0011\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000RX\u0010\u0012\u001aL\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u0013\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f0\n0\u0007j\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u0013\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcoil/ComponentRegistry$Builder;", "", "()V", "registry", "Lcoil/ComponentRegistry;", "(Lcoil/ComponentRegistry;)V", "decoders", "", "Lcoil/decode/Decoder;", "fetchers", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher;", "Ljava/lang/Class;", "Lcoil/util/MultiMutableList;", "interceptors", "Lcoil/intercept/Interceptor;", "mappers", "Lcoil/map/Mapper;", "measuredMappers", "Lcoil/map/MeasuredMapper;", "add", "decoder", ExifInterface.GPS_DIRECTION_TRUE, "fetcher", "type", "interceptor", "mapper", "measuredMapper", "build", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Builder {
        private final List<Decoder> decoders;
        private final List<Pair<Fetcher<? extends Object>, Class<? extends Object>>> fetchers;
        private final List<Interceptor> interceptors;
        private final List<Pair<Mapper<? extends Object, ?>, Class<? extends Object>>> mappers;
        private final List<Pair<MeasuredMapper<? extends Object, ?>, Class<? extends Object>>> measuredMappers;

        public Builder() {
            this.interceptors = new ArrayList();
            this.mappers = new ArrayList();
            this.measuredMappers = new ArrayList();
            this.fetchers = new ArrayList();
            this.decoders = new ArrayList();
        }

        public Builder(ComponentRegistry registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.interceptors = CollectionsKt.toMutableList((Collection) registry.getInterceptors$coil_base_release());
            this.mappers = CollectionsKt.toMutableList((Collection) registry.getMappers$coil_base_release());
            this.measuredMappers = CollectionsKt.toMutableList((Collection) registry.getMeasuredMappers$coil_base_release());
            this.fetchers = CollectionsKt.toMutableList((Collection) registry.getFetchers$coil_base_release());
            this.decoders = CollectionsKt.toMutableList((Collection) registry.getDecoders$coil_base_release());
        }

        public final Builder add(Interceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        public final /* synthetic */ <T> Builder add(Mapper<T, ?> mapper) {
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return add(mapper, Object.class);
        }

        public final <T> Builder add(Mapper<T, ?> mapper, Class<T> type) {
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.checkNotNullParameter(type, "type");
            this.mappers.add(TuplesKt.to(mapper, type));
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Parameter order is reversed.", replaceWith = @ReplaceWith(expression = "add(mapper, type)", imports = {}))
        public final <T> Builder add(Class<T> type, Mapper<T, ?> mapper) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            return add(mapper, type);
        }

        @Deprecated(message = "MeasuredMappers are deprecated. Replace with an Interceptor.")
        public final /* synthetic */ <T> Builder add(MeasuredMapper<T, ?> measuredMapper) {
            Intrinsics.checkNotNullParameter(measuredMapper, "measuredMapper");
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return add(Object.class, measuredMapper);
        }

        @Deprecated(message = "MeasuredMappers are deprecated. Replace with an Interceptor.")
        public final <T> Builder add(MeasuredMapper<T, ?> measuredMapper, Class<T> type) {
            Intrinsics.checkNotNullParameter(measuredMapper, "measuredMapper");
            Intrinsics.checkNotNullParameter(type, "type");
            this.measuredMappers.add(TuplesKt.to(measuredMapper, type));
            return this;
        }

        @Deprecated(message = "MeasuredMappers are deprecated. Replace with an Interceptor.")
        public final <T> Builder add(Class<T> type, MeasuredMapper<T, ?> measuredMapper) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(measuredMapper, "measuredMapper");
            return add(measuredMapper, type);
        }

        public final /* synthetic */ <T> Builder add(Fetcher<T> fetcher) {
            Intrinsics.checkNotNullParameter(fetcher, "fetcher");
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return add(fetcher, Object.class);
        }

        public final <T> Builder add(Fetcher<T> fetcher, Class<T> type) {
            Intrinsics.checkNotNullParameter(fetcher, "fetcher");
            Intrinsics.checkNotNullParameter(type, "type");
            this.fetchers.add(TuplesKt.to(fetcher, type));
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Parameter order is reversed.", replaceWith = @ReplaceWith(expression = "add(fetcher, type)", imports = {}))
        public final <T> Builder add(Class<T> type, Fetcher<T> fetcher) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(fetcher, "fetcher");
            return add(fetcher, type);
        }

        public final Builder add(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            this.decoders.add(decoder);
            return this;
        }

        public final ComponentRegistry build() {
            return new ComponentRegistry(CollectionsKt.toList(this.interceptors), CollectionsKt.toList(this.mappers), CollectionsKt.toList(this.measuredMappers), CollectionsKt.toList(this.fetchers), CollectionsKt.toList(this.decoders), null);
        }
    }
}
