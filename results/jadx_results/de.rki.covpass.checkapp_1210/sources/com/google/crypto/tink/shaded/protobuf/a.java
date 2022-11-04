package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a.AbstractC0113a;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.s0;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0113a<MessageType, BuilderType>> implements s0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0113a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0113a<MessageType, BuilderType>> implements s0.a {
        public static n1 m(s0 s0Var) {
            return new n1(s0Var);
        }

        protected abstract BuilderType a(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public BuilderType n(s0 s0Var) {
            if (f().getClass().isInstance(s0Var)) {
                return (BuilderType) a((a) s0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int a() {
        throw new UnsupportedOperationException();
    }

    public int d(h1 h1Var) {
        int a10 = a();
        if (a10 == -1) {
            int i10 = h1Var.i(this);
            p(i10);
            return i10;
        }
        return a10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public byte[] j() {
        try {
            byte[] bArr = new byte[e()];
            l d02 = l.d0(bArr);
            k(d02);
            d02.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(m("byte array"), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public i l() {
        try {
            i.h G = i.G(e());
            k(G.b());
            return G.a();
        } catch (IOException e10) {
            throw new RuntimeException(m("ByteString"), e10);
        }
    }

    public n1 o() {
        return new n1(this);
    }

    void p(int i10) {
        throw new UnsupportedOperationException();
    }
}
