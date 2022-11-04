package y5;

import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.s0;
import f6.y;
import java.security.GeneralSecurityException;
import y5.h;
/* loaded from: classes.dex */
public class f<PrimitiveT, KeyProtoT extends s0> implements e<PrimitiveT> {

    /* renamed from: a */
    private final h<KeyProtoT> f25807a;

    /* renamed from: b */
    private final Class<PrimitiveT> f25808b;

    /* loaded from: classes.dex */
    public static class a<KeyFormatProtoT extends s0, KeyProtoT extends s0> {

        /* renamed from: a */
        final h.a<KeyFormatProtoT, KeyProtoT> f25809a;

        a(h.a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.f25809a = aVar;
        }

        private KeyProtoT b(KeyFormatProtoT keyformatprotot) {
            this.f25809a.d(keyformatprotot);
            return this.f25809a.a(keyformatprotot);
        }

        KeyProtoT a(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return b(this.f25809a.c(iVar));
        }
    }

    public f(h<KeyProtoT> hVar, Class<PrimitiveT> cls) {
        if (hVar.h().contains(cls) || Void.class.equals(cls)) {
            this.f25807a = hVar;
            this.f25808b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", hVar.toString(), cls.getName()));
    }

    private a<?, KeyProtoT> f() {
        return new a<>(this.f25807a.e());
    }

    private PrimitiveT g(KeyProtoT keyprotot) {
        if (!Void.class.equals(this.f25808b)) {
            this.f25807a.i(keyprotot);
            return (PrimitiveT) this.f25807a.d(keyprotot, (Class<PrimitiveT>) this.f25808b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    @Override // y5.e
    public final boolean a(String str) {
        return str.equals(e());
    }

    @Override // y5.e
    public final PrimitiveT b(com.google.crypto.tink.shaded.protobuf.i iVar) {
        try {
            return g(this.f25807a.g(iVar));
        } catch (c0 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f25807a.b().getName(), e10);
        }
    }

    @Override // y5.e
    public final s0 c(com.google.crypto.tink.shaded.protobuf.i iVar) {
        try {
            return f().a(iVar);
        } catch (c0 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f25807a.e().b().getName(), e10);
        }
    }

    @Override // y5.e
    public final y d(com.google.crypto.tink.shaded.protobuf.i iVar) {
        try {
            return y.V().C(e()).D(f().a(iVar).l()).B(this.f25807a.f()).b();
        } catch (c0 e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    public final String e() {
        return this.f25807a.c();
    }
}
