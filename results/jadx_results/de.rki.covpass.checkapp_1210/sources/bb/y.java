package bb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0002\u001a4\u0010\t\u001a\u00020\b*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u00002\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a\u0016\u0010\u000b\u001a\u00020\b*\u00020\n2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u001a\u0018\u0010\r\u001a\u00020\b*\u00020\f2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0000\u001a:\u0010\u0010\u001a\u00020\b*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00000\u000f0\u000e2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¨\u0006\u0011"}, d2 = {BuildConfig.FLAVOR, "Ltb/r;", BuildConfig.FLAVOR, "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "Lbb/q0;", "option", "Ltb/e0;", "c", "Lbb/b0;", "a", "Lbb/c0;", "b", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "d", "ktor-http"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class y {

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltb/r;", BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR, "b", "(Ltb/r;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<tb.r<? extends String, ? extends String>, CharSequence> {

        /* renamed from: c */
        final /* synthetic */ q0 f5968c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q0 q0Var) {
            super(1);
            this.f5968c = q0Var;
        }

        /* renamed from: b */
        public final CharSequence invoke(tb.r<String, String> rVar) {
            hc.t.e(rVar, "it");
            String l10 = this.f5968c.g() ? b.l(rVar.e(), true) : rVar.e();
            if (rVar.f() == null) {
                return l10;
            }
            String valueOf = String.valueOf(rVar.f());
            if (this.f5968c.h()) {
                valueOf = b.n(valueOf);
            }
            return l10 + '=' + valueOf;
        }
    }

    public static final void a(b0 b0Var, Appendable appendable) {
        hc.t.e(b0Var, "<this>");
        hc.t.e(appendable, "out");
        d(b0Var.a(), appendable, b0Var.f());
    }

    public static final void b(c0 c0Var, Appendable appendable) {
        hc.t.e(c0Var, "<this>");
        hc.t.e(appendable, "out");
        d(c0Var.f(), appendable, c0Var.r());
    }

    public static final void c(List<tb.r<String, String>> list, Appendable appendable, q0 q0Var) {
        hc.t.e(list, "<this>");
        hc.t.e(appendable, "out");
        hc.t.e(q0Var, "option");
        ub.c0.c0(list, appendable, "&", null, null, 0, null, new a(q0Var), 60, null);
    }

    public static final void d(Set<? extends Map.Entry<String, ? extends List<String>>> set, Appendable appendable, q0 q0Var) {
        List list;
        int s10;
        hc.t.e(set, "<this>");
        hc.t.e(appendable, "out");
        hc.t.e(q0Var, "option");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List<String> list2 = (List) entry.getValue();
            if (list2.isEmpty()) {
                list = ub.t.d(tb.x.a(str, null));
            } else {
                s10 = ub.v.s(list2, 10);
                ArrayList arrayList2 = new ArrayList(s10);
                for (String str2 : list2) {
                    arrayList2.add(tb.x.a(str, str2));
                }
                list = arrayList2;
            }
            ub.z.x(arrayList, list);
        }
        c(arrayList, appendable, q0Var);
    }
}
