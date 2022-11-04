package c.c.a.f;

import d.a.c.a.i;
/* loaded from: classes.dex */
public class e extends c.c.a.f.a {

    /* renamed from: a */
    final d.a.c.a.h f674a;

    /* renamed from: b */
    final a f675b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements g {

        /* renamed from: a */
        final i.d f676a;

        a(e eVar, i.d dVar) {
            this.f676a = dVar;
        }

        @Override // c.c.a.f.g
        public void a(String str, String str2, Object obj) {
            this.f676a.a(str, str2, obj);
        }

        @Override // c.c.a.f.g
        public void b(Object obj) {
            this.f676a.b(obj);
        }
    }

    public e(d.a.c.a.h hVar, i.d dVar) {
        this.f674a = hVar;
        this.f675b = new a(this, dVar);
    }

    @Override // c.c.a.f.f
    public <T> T c(String str) {
        return (T) this.f674a.a(str);
    }

    @Override // c.c.a.f.a
    public g k() {
        return this.f675b;
    }
}
