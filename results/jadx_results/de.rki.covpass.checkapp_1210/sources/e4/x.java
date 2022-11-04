package e4;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class x {

    /* renamed from: a */
    private boolean f9463a = false;

    /* renamed from: b */
    private final Set<b> f9464b = new i0.b();

    /* renamed from: c */
    private final Map<String, q4.f> f9465c = new HashMap();

    /* renamed from: d */
    private final Comparator<androidx.core.util.d<String, Float>> f9466d = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Comparator<androidx.core.util.d<String, Float>> {
        a() {
            x.this = r1;
        }

        /* renamed from: a */
        public int compare(androidx.core.util.d<String, Float> dVar, androidx.core.util.d<String, Float> dVar2) {
            float floatValue = dVar.f3597b.floatValue();
            float floatValue2 = dVar2.f3597b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(float f10);
    }

    public void a(String str, float f10) {
        if (!this.f9463a) {
            return;
        }
        q4.f fVar = this.f9465c.get(str);
        if (fVar == null) {
            fVar = new q4.f();
            this.f9465c.put(str, fVar);
        }
        fVar.a(f10);
        if (!str.equals("__container")) {
            return;
        }
        for (b bVar : this.f9464b) {
            bVar.a(f10);
        }
    }

    public void b(boolean z10) {
        this.f9463a = z10;
    }
}
