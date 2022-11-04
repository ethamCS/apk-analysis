package gf;

import hc.t;
import hf.f;
import hf.k;
import hf.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.j;
import nf.g;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0018B!\b\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"Lgf/b;", "Lkotlinx/serialization/a;", "T", "Lkotlinx/serialization/j;", "serializer", "value", BuildConfig.FLAVOR, "b", "(Lkotlinx/serialization/j;Ljava/lang/Object;)[B", "Lkotlinx/serialization/b;", "deserializer", "bytes", "e", "(Lkotlinx/serialization/b;[B)Ljava/lang/Object;", BuildConfig.FLAVOR, "encodeDefaults", "Z", "f", "()Z", "ignoreUnknownKeys", "g", "Lnf/d;", "serializersModule", "Lnf/d;", "a", "()Lnf/d;", "<init>", "(ZZLnf/d;)V", "Lgf/b$a;", "Lgf/d;", "kotlinx-serialization-cbor"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class b implements kotlinx.serialization.a {

    /* renamed from: d */
    public static final a f10775d = new a(null);

    /* renamed from: a */
    private final boolean f10776a;

    /* renamed from: b */
    private final boolean f10777b;

    /* renamed from: c */
    private final nf.d f10778c;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgf/b$a;", "Lgf/b;", "<init>", "()V", "kotlinx-serialization-cbor"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends b {
        private a() {
            super(false, false, g.a(), null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private b(boolean z10, boolean z11, nf.d dVar) {
        this.f10776a = z10;
        this.f10777b = z11;
        this.f10778c = dVar;
    }

    public /* synthetic */ b(boolean z10, boolean z11, nf.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, dVar);
    }

    @Override // kotlinx.serialization.g
    public nf.d a() {
        return this.f10778c;
    }

    @Override // kotlinx.serialization.a
    public <T> byte[] b(j<? super T> jVar, T t10) {
        t.e(jVar, "serializer");
        hf.b bVar = new hf.b();
        new l(this, new f(bVar)).e(jVar, t10);
        return bVar.b();
    }

    @Override // kotlinx.serialization.a
    public <T> T e(kotlinx.serialization.b<T> bVar, byte[] bArr) {
        t.e(bVar, "deserializer");
        t.e(bArr, "bytes");
        return (T) new k(this, new hf.c(new hf.a(bArr))).y(bVar);
    }

    public final boolean f() {
        return this.f10776a;
    }

    public final boolean g() {
        return this.f10777b;
    }
}
