package nf;

import gc.l;
import hc.t;
import hc.v;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.j;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016JB\u0010\f\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032 \u0010\u000b\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\tH&JF\u0010\u0012\u001a\u00020\u0007\"\b\b\u0000\u0010\r*\u00020\u0001\"\b\b\u0001\u0010\u000e*\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&J<\u0010\u0015\u001a\u00020\u0007\"\b\b\u0000\u0010\r*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00130\tH'J@\u0010\u0019\u001a\u00020\u0007\"\b\b\u0000\u0010\r*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001e\u0010\u0018\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u00170\tH'¨\u0006\u001a"}, d2 = {"Lnf/f;", BuildConfig.FLAVOR, "T", "Loc/d;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "Ltb/e0;", "e", "Lkotlin/Function1;", BuildConfig.FLAVOR, "provider", "d", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "a", "Lkotlinx/serialization/j;", "defaultSerializerProvider", "c", BuildConfig.FLAVOR, "Lkotlinx/serialization/b;", "defaultDeserializerProvider", "b", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface f {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "it", "b", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: nf.f$a$a */
        /* loaded from: classes3.dex */
        public static final class C0266a extends v implements l<List<? extends KSerializer<?>>, KSerializer<?>> {

            /* renamed from: c */
            final /* synthetic */ KSerializer<T> f17015c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0266a(KSerializer<T> kSerializer) {
                super(1);
                this.f17015c = kSerializer;
            }

            /* renamed from: b */
            public final KSerializer<?> invoke(List<? extends KSerializer<?>> list) {
                t.e(list, "it");
                return this.f17015c;
            }
        }

        public static <T> void a(f fVar, oc.d<T> dVar, KSerializer<T> kSerializer) {
            t.e(dVar, "kClass");
            t.e(kSerializer, "serializer");
            fVar.d(dVar, new C0266a(kSerializer));
        }
    }

    <Base, Sub extends Base> void a(oc.d<Base> dVar, oc.d<Sub> dVar2, KSerializer<Sub> kSerializer);

    <Base> void b(oc.d<Base> dVar, l<? super String, ? extends kotlinx.serialization.b<? extends Base>> lVar);

    <Base> void c(oc.d<Base> dVar, l<? super Base, ? extends j<? super Base>> lVar);

    <T> void d(oc.d<T> dVar, l<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> lVar);

    <T> void e(oc.d<T> dVar, KSerializer<T> kSerializer);
}
