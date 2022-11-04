package p7;

import android.graphics.Rect;
import java.util.List;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a */
    private o7.q f18989a;

    /* renamed from: b */
    private int f18990b;

    /* renamed from: c */
    private boolean f18991c = false;

    /* renamed from: d */
    private q f18992d = new n();

    public m(int i10, o7.q qVar) {
        this.f18990b = i10;
        this.f18989a = qVar;
    }

    public o7.q a(List<o7.q> list, boolean z10) {
        return this.f18992d.b(list, b(z10));
    }

    public o7.q b(boolean z10) {
        o7.q qVar = this.f18989a;
        if (qVar == null) {
            return null;
        }
        return z10 ? qVar.b() : qVar;
    }

    public int c() {
        return this.f18990b;
    }

    public Rect d(o7.q qVar) {
        return this.f18992d.d(qVar, this.f18989a);
    }

    public void e(q qVar) {
        this.f18992d = qVar;
    }
}
