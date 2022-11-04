package yd;

import java.io.IOException;
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a */
    private d f26157a;

    /* renamed from: b */
    private g f26158b;

    /* renamed from: c */
    private volatile boolean f26159c;

    /* renamed from: d */
    protected volatile q f26160d;

    protected void a(q qVar) {
        if (this.f26160d != null) {
            return;
        }
        synchronized (this) {
            if (this.f26160d != null) {
                return;
            }
            try {
                if (this.f26157a != null) {
                    qVar = qVar.i().b(this.f26157a, this.f26158b);
                }
                this.f26160d = qVar;
            } catch (IOException unused) {
            }
        }
    }

    public int b() {
        return this.f26159c ? this.f26160d.e() : this.f26157a.size();
    }

    public q c(q qVar) {
        a(qVar);
        return this.f26160d;
    }

    public q d(q qVar) {
        q qVar2 = this.f26160d;
        this.f26160d = qVar;
        this.f26157a = null;
        this.f26159c = true;
        return qVar2;
    }
}
