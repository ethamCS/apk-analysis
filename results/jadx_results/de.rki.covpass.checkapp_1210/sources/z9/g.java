package z9;

import de.rki.covpass.sdk.cert.models.Name;
import hc.t;
import hc.v;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.c0;
import ub.y0;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J.\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002¨\u0006\u000f"}, d2 = {"Lz9/g;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "b", "Lde/rki/covpass/sdk/cert/models/Name;", "trimmedName1", "trimmedName2", "birthDate1", "birthDate2", "Lz9/f;", "a", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public static final g f26548a = new g();

    /* renamed from: b */
    private static final Set<String> f26549b;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbf/i;", "it", BuildConfig.FLAVOR, "b", "(Lbf/i;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.l<bf.i, Boolean> {

        /* renamed from: c */
        public static final a f26550c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(bf.i iVar) {
            t.e(iVar, "it");
            return Boolean.valueOf(iVar.getValue().length() == 0);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbf/i;", "it", BuildConfig.FLAVOR, "b", "(Lbf/i;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.l<bf.i, String> {

        /* renamed from: c */
        public static final b f26551c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final String invoke(bf.i iVar) {
            t.e(iVar, "it");
            return iVar.getValue();
        }
    }

    static {
        Set<String> e10;
        e10 = y0.e("DR", "PROF");
        f26549b = e10;
    }

    private g() {
    }

    private final Set<String> b(String str) {
        af.h r10;
        af.h z10;
        Set H;
        Set<String> x02;
        Set<String> b10;
        if (str == null) {
            b10 = y0.b();
            return b10;
        }
        r10 = af.p.r(bf.k.f(new bf.k("(?<=<\\+|)[^/<+]*(?=)"), str, 0, 2, null), a.f26550c);
        z10 = af.p.z(r10, b.f26551c);
        H = af.p.H(z10);
        x02 = c0.x0(H, f26549b);
        return x02;
    }

    public final f a(Name name, Name name2, String str, String str2) {
        Set a02;
        Set a03;
        if (name == null || name2 == null || str == null || str2 == null) {
            return f.HasNullData;
        }
        if (!t.a(str, str2)) {
            return f.DateOfBirthDifferent;
        }
        Set<String> b10 = b(name.f());
        Set<String> b11 = b(name2.f());
        Set<String> b12 = b(name.c());
        Set<String> b13 = b(name2.c());
        a02 = c0.a0(b10, b11);
        boolean z10 = !a02.isEmpty();
        a03 = c0.a0(b12, b13);
        return (!z10 || !(a03.isEmpty() ^ true)) ? f.NameDifferent : f.Equal;
    }
}
