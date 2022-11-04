package oa;

import bf.q;
import fb.z;
import gc.l;
import hc.t;
import hc.v;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.r;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Loa/d;", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/UnsupportedOperationException;", BuildConfig.FLAVOR, "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lza/c;", "response", "Loc/d;", "from", "to", "<init>", "(Lza/c;Loc/d;Loc/d;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d extends UnsupportedOperationException {

    /* renamed from: c */
    private final String f17723c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltb/r;", BuildConfig.FLAVOR, "<name for destructuring parameter 0>", BuildConfig.FLAVOR, "b", "(Ltb/r;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements l<r<? extends String, ? extends String>, CharSequence> {

        /* renamed from: c */
        public static final a f17724c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final CharSequence invoke(r<String, String> rVar) {
            t.e(rVar, "$dstr$key$value");
            return rVar.b() + ": " + rVar.c() + '\n';
        }
    }

    public d(za.c cVar, oc.d<?> dVar, oc.d<?> dVar2) {
        String e02;
        String h10;
        t.e(cVar, "response");
        t.e(dVar, "from");
        t.e(dVar2, "to");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("No transformation found: ");
        sb2.append(dVar);
        sb2.append(" -> ");
        sb2.append(dVar2);
        sb2.append("\n        |with response from ");
        sb2.append(za.e.b(cVar).u0());
        sb2.append(":\n        |status: ");
        sb2.append(cVar.i());
        sb2.append("\n        |response headers: \n        |");
        e02 = c0.e0(z.f(cVar.a()), null, null, null, 0, null, a.f17724c, 31, null);
        sb2.append(e02);
        sb2.append("\n    ");
        h10 = q.h(sb2.toString(), null, 1, null);
        this.f17723c = h10;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f17723c;
    }
}
