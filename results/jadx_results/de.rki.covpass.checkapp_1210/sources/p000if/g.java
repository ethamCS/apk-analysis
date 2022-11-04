package p000if;

import hc.t;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0006\"$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", BuildConfig.FLAVOR, "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/Iterable;", "getElementDescriptors$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "elementDescriptors", "kotlinx-serialization-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: if.g */
/* loaded from: classes3.dex */
public final class g {

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, d2 = {"if/g$a", BuildConfig.FLAVOR, "Lkotlinx/serialization/descriptors/SerialDescriptor;", BuildConfig.FLAVOR, "hasNext", "b", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: if.g$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<SerialDescriptor>, ic.a, j$.util.Iterator {

        /* renamed from: c */
        private int f12547c;

        /* renamed from: d */
        final /* synthetic */ SerialDescriptor f12548d;

        a(SerialDescriptor serialDescriptor) {
            this.f12548d = serialDescriptor;
            this.f12547c = serialDescriptor.m();
        }

        /* renamed from: b */
        public SerialDescriptor next() {
            SerialDescriptor serialDescriptor = this.f12548d;
            int m10 = serialDescriptor.m();
            int i10 = this.f12547c;
            this.f12547c = i10 - 1;
            return serialDescriptor.q(m10 - i10);
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super SerialDescriptor> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f12547c > 0;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, d2 = {"if/g$b", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0})
    /* renamed from: if.g$b */
    /* loaded from: classes3.dex */
    public static final class b implements Iterable<SerialDescriptor>, ic.a {

        /* renamed from: c */
        final /* synthetic */ SerialDescriptor f12549c;

        public b(SerialDescriptor serialDescriptor) {
            this.f12549c = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<SerialDescriptor> iterator() {
            return new a(this.f12549c);
        }
    }

    public static final Iterable<SerialDescriptor> a(SerialDescriptor serialDescriptor) {
        t.e(serialDescriptor, "<this>");
        return new b(serialDescriptor);
    }
}
