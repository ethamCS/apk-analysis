package y5;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<m> f25825a = new CopyOnWriteArrayList<>();

    public static m a(String str) {
        Iterator<m> it = f25825a.iterator();
        while (it.hasNext()) {
            m next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
