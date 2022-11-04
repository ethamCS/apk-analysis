package bf;

import bf.i;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\n\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lbf/j;", "Lbf/i;", "next", "Ljava/util/regex/MatchResult;", "f", "()Ljava/util/regex/MatchResult;", "matchResult", "Lnc/g;", "d", "()Lnc/g;", "range", BuildConfig.FLAVOR, "getValue", "()Ljava/lang/String;", "value", "Lbf/h;", "groups", "Lbf/h;", "c", "()Lbf/h;", BuildConfig.FLAVOR, "a", "()Ljava/util/List;", "groupValues", "Ljava/util/regex/Matcher;", "matcher", BuildConfig.FLAVOR, "input", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a */
    private final Matcher f6004a;

    /* renamed from: b */
    private final CharSequence f6005b;

    /* renamed from: c */
    private final h f6006c = new b();

    /* renamed from: d */
    private List<String> f6007d;

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"bf/j$a", "Lub/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "index", "d", "a", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a extends ub.c<String> {
        a() {
            j.this = r1;
        }

        @Override // ub.a
        public int a() {
            return j.this.f().groupCount() + 1;
        }

        public /* bridge */ boolean b(String str) {
            return super.contains(str);
        }

        @Override // ub.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return b((String) obj);
        }

        /* renamed from: d */
        public String get(int i10) {
            String group = j.this.f().group(i10);
            return group == null ? BuildConfig.FLAVOR : group;
        }

        public /* bridge */ int e(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int f(String str) {
            return super.lastIndexOf(str);
        }

        @Override // ub.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return e((String) obj);
        }

        @Override // ub.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return f((String) obj);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006H\u0096\u0002J\u0013\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0096\u0002R\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"bf/j$b", BuildConfig.FLAVOR, "Lub/a;", "Lbf/g;", BuildConfig.FLAVOR, "isEmpty", BuildConfig.FLAVOR, "iterator", BuildConfig.FLAVOR, "index", "get", "a", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class b extends ub.a<g> implements h {

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Lbf/g;", "b", "(I)Lbf/g;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes3.dex */
        static final class a extends hc.v implements gc.l<Integer, g> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a() {
                super(1);
                b.this = r1;
            }

            public final g b(int i10) {
                return b.this.get(i10);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ g invoke(Integer num) {
                return b(num.intValue());
            }
        }

        b() {
            j.this = r1;
        }

        @Override // ub.a
        public int a() {
            return j.this.f().groupCount() + 1;
        }

        public /* bridge */ boolean b(g gVar) {
            return super.contains(gVar);
        }

        @Override // ub.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj == null ? true : obj instanceof g)) {
                return false;
            }
            return b((g) obj);
        }

        @Override // bf.h
        public g get(int i10) {
            nc.g i11;
            i11 = l.i(j.this.f(), i10);
            if (i11.l().intValue() >= 0) {
                String group = j.this.f().group(i10);
                hc.t.d(group, "matchResult.group(index)");
                return new g(group, i11);
            }
            return null;
        }

        @Override // ub.a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<g> iterator() {
            nc.g i10;
            af.h M;
            af.h z10;
            i10 = ub.u.i(this);
            M = ub.c0.M(i10);
            z10 = af.p.z(M, new a());
            return z10.iterator();
        }
    }

    public j(Matcher matcher, CharSequence charSequence) {
        hc.t.e(matcher, "matcher");
        hc.t.e(charSequence, "input");
        this.f6004a = matcher;
        this.f6005b = charSequence;
    }

    public final MatchResult f() {
        return this.f6004a;
    }

    @Override // bf.i
    public List<String> a() {
        if (this.f6007d == null) {
            this.f6007d = new a();
        }
        List<String> list = this.f6007d;
        hc.t.b(list);
        return list;
    }

    @Override // bf.i
    public i.b b() {
        return i.a.a(this);
    }

    @Override // bf.i
    public h c() {
        return this.f6006c;
    }

    @Override // bf.i
    public nc.g d() {
        nc.g h10;
        h10 = l.h(f());
        return h10;
    }

    @Override // bf.i
    public String getValue() {
        String group = f().group();
        hc.t.d(group, "matchResult.group()");
        return group;
    }

    @Override // bf.i
    public i next() {
        i f10;
        int end = f().end() + (f().end() == f().start() ? 1 : 0);
        if (end <= this.f6005b.length()) {
            Matcher matcher = this.f6004a.pattern().matcher(this.f6005b);
            hc.t.d(matcher, "matcher.pattern().matcher(input)");
            f10 = l.f(matcher, end, this.f6005b);
            return f10;
        }
        return null;
    }
}
