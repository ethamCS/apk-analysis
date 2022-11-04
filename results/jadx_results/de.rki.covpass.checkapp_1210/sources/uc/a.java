package uc;

import hc.t;
import hc.v;
import java.util.ServiceLoader;
import kotlin.Lazy;
import ub.c0;
import xc.h0;
import xc.m0;
/* loaded from: classes.dex */
public interface a {
    public static final C0407a Companion = C0407a.f23397a;

    /* renamed from: uc.a$a */
    /* loaded from: classes.dex */
    public static final class C0407a {

        /* renamed from: a */
        static final /* synthetic */ C0407a f23397a = new C0407a();

        /* renamed from: b */
        private static final Lazy<a> f23398b;

        /* renamed from: uc.a$a$a */
        /* loaded from: classes.dex */
        static final class C0408a extends v implements gc.a<a> {

            /* renamed from: c */
            public static final C0408a f23399c = new C0408a();

            C0408a() {
                super(0);
            }

            /* renamed from: b */
            public final a invoke() {
                Object W;
                ServiceLoader load = ServiceLoader.load(a.class, a.class.getClassLoader());
                t.d(load, "implementations");
                W = c0.W(load);
                a aVar = (a) W;
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        static {
            Lazy<a> b10;
            b10 = tb.m.b(tb.o.PUBLICATION, C0408a.f23399c);
            f23398b = b10;
        }

        private C0407a() {
        }

        public final a a() {
            return f23398b.getValue();
        }
    }

    m0 a(ne.n nVar, h0 h0Var, Iterable<? extends zc.b> iterable, zc.c cVar, zc.a aVar, boolean z10);
}
