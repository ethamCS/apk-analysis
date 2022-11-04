package c.b.b;
/* loaded from: classes.dex */
public abstract class s extends Enum<s> {

    /* renamed from: a */
    public static final s f462a;

    /* renamed from: b */
    public static final s f463b;

    /* renamed from: c */
    private static final /* synthetic */ s[] f464c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends s {
        a(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f462a = aVar;
        s sVar = new s("STRING", 1) { // from class: c.b.b.s.b
        };
        f463b = sVar;
        f464c = new s[]{aVar, sVar};
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
        return (s[]) f464c.clone();
    }
}
