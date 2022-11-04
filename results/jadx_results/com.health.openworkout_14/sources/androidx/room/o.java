package androidx.room;

import b.o.a.c;
import java.io.File;
/* loaded from: classes.dex */
public class o implements c.AbstractC0060c {

    /* renamed from: a */
    private final String f1921a;

    /* renamed from: b */
    private final File f1922b;

    /* renamed from: c */
    private final c.AbstractC0060c f1923c;

    public o(String str, File file, c.AbstractC0060c abstractC0060c) {
        this.f1921a = str;
        this.f1922b = file;
        this.f1923c = abstractC0060c;
    }

    @Override // b.o.a.c.AbstractC0060c
    public b.o.a.c a(c.b bVar) {
        return new n(bVar.f2661a, this.f1921a, this.f1922b, bVar.f2663c.f2660a, this.f1923c.a(bVar));
    }
}
