package c.b.a.a;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private final String f379a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends d {
        a(d dVar, d dVar2, String str) {
            super(dVar2, null);
        }

        @Override // c.b.a.a.d
        public d b(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    private d(d dVar) {
        this.f379a = dVar.f379a;
    }

    /* synthetic */ d(d dVar, a aVar) {
        this(dVar);
    }

    private d(String str) {
        i.h(str);
        this.f379a = str;
    }

    public static d a(String str) {
        return new d(str);
    }

    public d b(String str) {
        i.h(str);
        return new a(this, this, str);
    }
}
