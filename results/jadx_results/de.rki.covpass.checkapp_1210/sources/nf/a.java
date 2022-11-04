package nf;

import gc.l;
import hc.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H¦\u0002\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lnf/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "a", "<init>", "()V", "b", "Lnf/a$a;", "Lnf/a$b;", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class a {

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0096\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001b\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lnf/a$a;", "Lnf/a;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "a", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", "serializer", "Lkotlinx/serialization/KSerializer;", "b", "()Lkotlinx/serialization/KSerializer;", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: nf.a$a */
    /* loaded from: classes3.dex */
    public static final class C0265a extends a {

        /* renamed from: a */
        private final KSerializer<?> f17003a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0265a(KSerializer<?> kSerializer) {
            super(null);
            t.e(kSerializer, "serializer");
            this.f17003a = kSerializer;
        }

        @Override // nf.a
        public KSerializer<?> a(List<? extends KSerializer<?>> list) {
            t.e(list, "typeArgumentsSerializers");
            return this.f17003a;
        }

        public final KSerializer<?> b() {
            return this.f17003a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0265a) && t.a(((C0265a) obj).f17003a, this.f17003a);
        }

        public int hashCode() {
            return this.f17003a.hashCode();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012 \u0010\u0007\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0096\u0002R1\u0010\u0007\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lnf/a$b;", "Lnf/a;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "a", "Lkotlin/Function1;", "provider", "Lgc/l;", "b", "()Lgc/l;", "<init>", "(Lgc/l;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b extends a {

        /* renamed from: a */
        private final l<List<? extends KSerializer<?>>, KSerializer<?>> f17004a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> lVar) {
            super(null);
            t.e(lVar, "provider");
            this.f17004a = lVar;
        }

        @Override // nf.a
        public KSerializer<?> a(List<? extends KSerializer<?>> list) {
            t.e(list, "typeArgumentsSerializers");
            return this.f17004a.invoke(list);
        }

        public final l<List<? extends KSerializer<?>>, KSerializer<?>> b() {
            return this.f17004a;
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract KSerializer<?> a(List<? extends KSerializer<?>> list);
}
