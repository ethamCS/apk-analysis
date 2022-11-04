package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class q {

    /* renamed from: b */
    private static boolean f7969b = true;

    /* renamed from: c */
    private static volatile q f7970c;

    /* renamed from: d */
    static final q f7971d = new q(true);

    /* renamed from: a */
    private final Map<a, z.e<?, ?>> f7972a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Object f7973a;

        /* renamed from: b */
        private final int f7974b;

        a(Object obj, int i10) {
            this.f7973a = obj;
            this.f7974b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7973a == aVar.f7973a && this.f7974b == aVar.f7974b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f7973a) * 65535) + this.f7974b;
        }
    }

    q() {
        this.f7972a = new HashMap();
    }

    q(boolean z10) {
        this.f7972a = Collections.emptyMap();
    }

    public static q b() {
        q qVar = f7970c;
        if (qVar == null) {
            synchronized (q.class) {
                qVar = f7970c;
                if (qVar == null) {
                    qVar = f7969b ? p.a() : f7971d;
                    f7970c = qVar;
                }
            }
        }
        return qVar;
    }

    public <ContainingType extends s0> z.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (z.e<ContainingType, ?>) this.f7972a.get(new a(containingtype, i10));
    }
}
