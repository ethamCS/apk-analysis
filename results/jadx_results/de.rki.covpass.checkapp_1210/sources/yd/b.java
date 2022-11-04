package yd;

import java.io.IOException;
import java.io.InputStream;
import yd.a;
import yd.q;
/* loaded from: classes3.dex */
public abstract class b<MessageType extends q> implements s<MessageType> {

    /* renamed from: a */
    private static final g f26090a = g.c();

    private MessageType e(MessageType messagetype) {
        if (messagetype == null || messagetype.c()) {
            return messagetype;
        }
        throw f(messagetype).b().k(messagetype);
    }

    private w f(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).k() : new w(messagetype);
    }

    /* renamed from: g */
    public MessageType a(InputStream inputStream, g gVar) {
        return e(j(inputStream, gVar));
    }

    /* renamed from: h */
    public MessageType c(InputStream inputStream, g gVar) {
        return e(k(inputStream, gVar));
    }

    /* renamed from: i */
    public MessageType b(d dVar, g gVar) {
        return e(l(dVar, gVar));
    }

    public MessageType j(InputStream inputStream, g gVar) {
        try {
            int read = inputStream.read();
            if (read != -1) {
                return k(new a.AbstractC0456a.C0457a(inputStream, e.B(read, inputStream)), gVar);
            }
            return null;
        } catch (IOException e10) {
            throw new k(e10.getMessage());
        }
    }

    public MessageType k(InputStream inputStream, g gVar) {
        e g10 = e.g(inputStream);
        MessageType messagetype = (MessageType) d(g10, gVar);
        try {
            g10.a(0);
            return messagetype;
        } catch (k e10) {
            throw e10.k(messagetype);
        }
    }

    public MessageType l(d dVar, g gVar) {
        try {
            e q10 = dVar.q();
            MessageType messagetype = (MessageType) d(q10, gVar);
            try {
                q10.a(0);
                return messagetype;
            } catch (k e10) {
                throw e10.k(messagetype);
            }
        } catch (k e11) {
            throw e11;
        }
    }
}
