package mf;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lmf/l;", "Ljf/a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", BuildConfig.FLAVOR, "q", "w", BuildConfig.FLAVOR, "h", BuildConfig.FLAVOR, "z", BuildConfig.FLAVOR, "B", "Lnf/d;", "serializersModule", "Lnf/d;", "a", "()Lnf/d;", "Lmf/a;", "lexer", "Llf/a;", "json", "<init>", "(Lmf/a;Llf/a;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class l extends jf.a {

    /* renamed from: a */
    private final a f16632a;

    /* renamed from: b */
    private final nf.d f16633b;

    public l(a aVar, lf.a aVar2) {
        hc.t.e(aVar, "lexer");
        hc.t.e(aVar2, "json");
        this.f16632a = aVar;
        this.f16633b = aVar2.a();
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public short B() {
        a aVar = this.f16632a;
        String r10 = aVar.r();
        try {
            return bf.b0.j(r10);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'UShort' for input '" + r10 + '\'', 0, null, 6, null);
            throw new tb.i();
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, jf.c
    public nf.d a() {
        return this.f16633b;
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public long h() {
        a aVar = this.f16632a;
        String r10 = aVar.r();
        try {
            return bf.b0.g(r10);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'ULong' for input '" + r10 + '\'', 0, null, 6, null);
            throw new tb.i();
        }
    }

    @Override // jf.c
    public int q(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public int w() {
        a aVar = this.f16632a;
        String r10 = aVar.r();
        try {
            return bf.b0.d(r10);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'UInt' for input '" + r10 + '\'', 0, null, 6, null);
            throw new tb.i();
        }
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public byte z() {
        a aVar = this.f16632a;
        String r10 = aVar.r();
        try {
            return bf.b0.a(r10);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'UByte' for input '" + r10 + '\'', 0, null, 6, null);
            throw new tb.i();
        }
    }
}
