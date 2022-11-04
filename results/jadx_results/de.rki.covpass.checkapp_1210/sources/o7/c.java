package o7;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    protected h6.q f17609a;

    /* renamed from: b */
    protected r f17610b;

    /* renamed from: c */
    private final int f17611c = 2;

    public c(h6.q qVar, r rVar) {
        this.f17609a = qVar;
        this.f17610b = rVar;
    }

    public static List<h6.s> e(List<h6.s> list, r rVar) {
        ArrayList arrayList = new ArrayList(list.size());
        for (h6.s sVar : list) {
            arrayList.add(rVar.f(sVar));
        }
        return arrayList;
    }

    public h6.a a() {
        return this.f17609a.b();
    }

    public Bitmap b() {
        return this.f17610b.b(null, 2);
    }

    public byte[] c() {
        return this.f17609a.c();
    }

    public Map<h6.r, Object> d() {
        return this.f17609a.d();
    }

    public String toString() {
        return this.f17609a.f();
    }
}
