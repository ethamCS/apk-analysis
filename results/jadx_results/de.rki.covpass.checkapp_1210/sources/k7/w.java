package k7;

import android.text.Spanned;
import bf.i;
import de.rki.covpass.logging.Lumber;
import java.util.Arrays;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\f\u0010\u0010\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\n\u0010\u0011\u001a\u00020\u0007*\u00020\u0000¨\u0006\u0012"}, d2 = {BuildConfig.FLAVOR, "twineString", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "values", BuildConfig.FLAVOR, "boldLinks", "Landroid/text/Spanned;", "c", "(Ljava/lang/String;[Ljava/lang/Object;Z)Landroid/text/Spanned;", BuildConfig.FLAVOR, "stringRes", "b", "(I[Ljava/lang/Object;Z)Landroid/text/Spanned;", "f", "(I[Ljava/lang/Object;)Ljava/lang/String;", "a", "g", "android-utils_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a */
    private static final bf.k f14678a = new bf.k("#(.*)::(.*)#");

    /* renamed from: b */
    private static final bf.k f14679b = new bf.k("#(\\+?[\\d\\s\\-/]+)(?:::\\$0)?#");

    /* renamed from: c */
    private static final bf.k f14680c = new bf.k("\\$(\\d+)");

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbf/i;", "it", BuildConfig.FLAVOR, "b", "(Lbf/i;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<bf.i, CharSequence> {

        /* renamed from: c */
        public static final a f14681c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final CharSequence invoke(bf.i iVar) {
            hc.t.e(iVar, "it");
            String str = iVar.a().get(1);
            String str2 = iVar.a().get(2);
            return "<font color=\"#" + ((Object) str) + "\">" + ((Object) str2) + "</font>";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbf/i;", "match", BuildConfig.FLAVOR, "b", "(Lbf/i;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.l<bf.i, CharSequence> {

        /* renamed from: c */
        final /* synthetic */ boolean f14682c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10) {
            super(1);
            this.f14682c = z10;
        }

        /* renamed from: b */
        public final CharSequence invoke(bf.i iVar) {
            boolean x10;
            boolean I;
            hc.t.e(iVar, "match");
            i.b b10 = iVar.b();
            String str = b10.a().a().get(1);
            String str2 = b10.a().a().get(2);
            x10 = bf.x.x(str2);
            if (x10) {
                I = bf.x.I(str, "https:", false, 2, null);
                if (I) {
                    str2 = str;
                }
            }
            String str3 = "<a href=\"" + str2 + "\">" + str + "</a>";
            if (this.f14682c) {
                return "<b>" + str3 + "</b>";
            }
            return str3;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbf/i;", "match", BuildConfig.FLAVOR, "b", "(Lbf/i;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.l<bf.i, CharSequence> {

        /* renamed from: c */
        final /* synthetic */ Object[] f14683c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object[] objArr) {
            super(1);
            this.f14683c = objArr;
        }

        /* renamed from: b */
        public final CharSequence invoke(bf.i iVar) {
            Object G;
            hc.t.e(iVar, "match");
            try {
                bf.g gVar = iVar.c().get(1);
                hc.t.b(gVar);
                G = ub.m.G(this.f14683c, Integer.parseInt(gVar.a()));
                if (G == null) {
                    return BuildConfig.FLAVOR;
                }
                String obj = G.toString();
                return obj == null ? BuildConfig.FLAVOR : obj;
            } catch (Throwable th2) {
                if (Lumber.Companion.getEnabled()) {
                    timber.log.a.f22457a.e(th2, "Bad format string or index", new Object[0]);
                }
                return BuildConfig.FLAVOR;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbf/i;", "match", BuildConfig.FLAVOR, "b", "(Lbf/i;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends hc.v implements gc.l<bf.i, CharSequence> {

        /* renamed from: c */
        public static final d f14684c = new d();

        d() {
            super(1);
        }

        /* renamed from: b */
        public final CharSequence invoke(bf.i iVar) {
            hc.t.e(iVar, "match");
            bf.g gVar = iVar.c().get(1);
            hc.t.b(gVar);
            String a10 = gVar.a();
            return "#" + a10 + "::tel:" + a10 + "#";
        }
    }

    public static final String a(String str) {
        String C;
        String C2;
        String C3;
        String C4;
        String C5;
        String C6;
        String C7;
        hc.t.e(str, "<this>");
        bf.k kVar = new bf.k("\\[c=(.*?)](.*?)\\[/c]");
        C = bf.x.C(str, "[b]", "<b>", true);
        C2 = bf.x.C(C, "[/b]", "</b>", true);
        C3 = bf.x.C(C2, "\n", "<br>", true);
        C4 = bf.x.C(C3, "[i]", "<i>", true);
        C5 = bf.x.C(C4, "[/i]", "</i>", true);
        C6 = bf.x.C(C5, "[u]", "<u>", true);
        C7 = bf.x.C(C6, "[/u]", "</u>", true);
        return kVar.i(C7, a.f14681c);
    }

    public static final Spanned b(int i10, Object[] objArr, boolean z10) {
        hc.t.e(objArr, "values");
        return c(f(i10, Arrays.copyOf(objArr, objArr.length)), Arrays.copyOf(objArr, objArr.length), z10);
    }

    public static final Spanned c(String str, Object[] objArr, boolean z10) {
        hc.t.e(str, "twineString");
        hc.t.e(objArr, "values");
        return g(a(f14678a.i(f14680c.i(f14679b.i(str, d.f14684c), new c(objArr)), new b(z10))));
    }

    public static /* synthetic */ Spanned d(int i10, Object[] objArr, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return b(i10, objArr, z10);
    }

    public static /* synthetic */ Spanned e(String str, Object[] objArr, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return c(str, objArr, z10);
    }

    public static final String f(int i10, Object... objArr) {
        hc.t.e(objArr, "values");
        return k7.b.a().d().a(i10, Arrays.copyOf(objArr, objArr.length));
    }

    public static final Spanned g(String str) {
        hc.t.e(str, "<this>");
        Spanned a10 = androidx.core.text.b.a(str, 0);
        hc.t.d(a10, "fromHtml(this, HtmlCompat.FROM_HTML_MODE_LEGACY)");
        return a10;
    }
}
