package gd;

import java.util.Map;
import ub.q0;
/* loaded from: classes.dex */
public interface c0<T> {
    public static final a Companion = a.f10682a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f10682a = new a();

        /* renamed from: b */
        private static final c0 f10683b;

        static {
            Map h10;
            h10 = q0.h();
            f10683b = new d0(h10);
        }

        private a() {
        }

        public final c0 a() {
            return f10683b;
        }
    }

    T a(wd.c cVar);
}
