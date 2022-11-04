package androidx.room;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import m1.h;
/* loaded from: classes.dex */
class m0 implements h.c {

    /* renamed from: a */
    private final String f4963a;

    /* renamed from: b */
    private final File f4964b;

    /* renamed from: c */
    private final Callable<InputStream> f4965c;

    /* renamed from: d */
    private final h.c f4966d;

    public m0(String str, File file, Callable<InputStream> callable, h.c cVar) {
        this.f4963a = str;
        this.f4964b = file;
        this.f4965c = callable;
        this.f4966d = cVar;
    }

    @Override // m1.h.c
    public m1.h a(h.b bVar) {
        return new l0(bVar.f16249a, this.f4963a, this.f4964b, this.f4965c, bVar.f16251c.f16248a, this.f4966d.a(bVar));
    }
}
