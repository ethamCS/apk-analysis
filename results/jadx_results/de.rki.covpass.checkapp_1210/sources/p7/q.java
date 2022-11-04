package p7;

import android.graphics.Rect;
import android.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a */
    private static final String f18994a = "q";

    /* loaded from: classes.dex */
    public class a implements Comparator<o7.q> {

        /* renamed from: c */
        final /* synthetic */ o7.q f18995c;

        a(o7.q qVar) {
            q.this = r1;
            this.f18995c = qVar;
        }

        /* renamed from: a */
        public int compare(o7.q qVar, o7.q qVar2) {
            return Float.compare(q.this.c(qVar2, this.f18995c), q.this.c(qVar, this.f18995c));
        }
    }

    public List<o7.q> a(List<o7.q> list, o7.q qVar) {
        if (qVar == null) {
            return list;
        }
        Collections.sort(list, new a(qVar));
        return list;
    }

    public o7.q b(List<o7.q> list, o7.q qVar) {
        List<o7.q> a10 = a(list, qVar);
        String str = f18994a;
        Log.i(str, "Viewfinder size: " + qVar);
        Log.i(str, "Preview in order of preference: " + a10);
        return a10.get(0);
    }

    protected abstract float c(o7.q qVar, o7.q qVar2);

    public abstract Rect d(o7.q qVar, o7.q qVar2);
}
