package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.s0;
/* loaded from: classes.dex */
public abstract class b<MessageType extends s0> implements a1<MessageType> {

    /* renamed from: a */
    private static final q f7821a = q.b();

    private MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.c()) {
            return messagetype;
        }
        throw d(messagetype).b().k(messagetype);
    }

    private n1 d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).o() : new n1(messagetype);
    }

    /* renamed from: e */
    public MessageType a(i iVar, q qVar) {
        return c(f(iVar, qVar));
    }

    public MessageType f(i iVar, q qVar) {
        try {
            j M = iVar.M();
            MessageType messagetype = (MessageType) b(M, qVar);
            try {
                M.a(0);
                return messagetype;
            } catch (c0 e10) {
                throw e10.k(messagetype);
            }
        } catch (c0 e11) {
            throw e11;
        }
    }
}
