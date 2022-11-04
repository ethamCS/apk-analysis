package d.a.b;
/* loaded from: classes.dex */
public abstract class s extends Enum<s> {

    /* renamed from: b */
    public static final s f3746b;

    /* renamed from: c */
    public static final s f3747c;

    /* renamed from: d */
    private static final /* synthetic */ s[] f3748d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends s {
        a(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f3746b = aVar;
        s sVar = new s("STRING", 1) { // from class: d.a.b.s.b
        };
        f3747c = sVar;
        f3748d = new s[]{aVar, sVar};
    }

    private s(String str, int i) {
        super(str, i);
    }

    /* synthetic */ s(String str, int i, a aVar) {
        this(str, i);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f3748d.clone();
    }
}
