package androidx.navigation.z;

import android.annotation.SuppressLint;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private final Set<Integer> f1413a;

    /* renamed from: b */
    private final b.i.b.c f1414b;

    /* renamed from: c */
    private final AbstractC0022c f1415c;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final Set<Integer> f1416a = new HashSet();

        /* renamed from: b */
        private b.i.b.c f1417b;

        /* renamed from: c */
        private AbstractC0022c f1418c;

        public b(int... iArr) {
            for (int i : iArr) {
                this.f1416a.add(Integer.valueOf(i));
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public c a() {
            return new c(this.f1416a, this.f1417b, this.f1418c);
        }

        @Deprecated
        public b b(DrawerLayout drawerLayout) {
            this.f1417b = drawerLayout;
            return this;
        }
    }

    /* renamed from: androidx.navigation.z.c$c */
    /* loaded from: classes.dex */
    public interface AbstractC0022c {
        boolean a();
    }

    private c(Set<Integer> set, b.i.b.c cVar, AbstractC0022c abstractC0022c) {
        this.f1413a = set;
        this.f1414b = cVar;
        this.f1415c = abstractC0022c;
    }

    public AbstractC0022c a() {
        return this.f1415c;
    }

    public b.i.b.c b() {
        return this.f1414b;
    }

    public Set<Integer> c() {
        return this.f1413a;
    }
}
