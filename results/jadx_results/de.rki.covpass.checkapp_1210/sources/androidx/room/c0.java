package androidx.room;

import androidx.room.i0;
import java.util.concurrent.Executor;
import m1.h;
/* loaded from: classes.dex */
public final class c0 implements h.c {

    /* renamed from: a */
    private final h.c f4849a;

    /* renamed from: b */
    private final i0.f f4850b;

    /* renamed from: c */
    private final Executor f4851c;

    public c0(h.c cVar, i0.f fVar, Executor executor) {
        this.f4849a = cVar;
        this.f4850b = fVar;
        this.f4851c = executor;
    }

    @Override // m1.h.c
    public m1.h a(h.b bVar) {
        return new b0(this.f4849a.a(bVar), this.f4850b, this.f4851c);
    }
}
