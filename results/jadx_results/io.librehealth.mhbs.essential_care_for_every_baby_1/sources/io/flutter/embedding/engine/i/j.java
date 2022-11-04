package io.flutter.embedding.engine.i;

import d.a.c.a.i;
import d.a.c.a.p;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    private final d.a.c.a.i f1048a;

    /* renamed from: b */
    private e f1049b;

    /* renamed from: c */
    private final i.c f1050c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements i.c {

        /* renamed from: io.flutter.embedding.engine.i.j$a$a */
        /* loaded from: classes.dex */
        public class RunnableC0054a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ i.d f1052a;

            RunnableC0054a(a aVar, i.d dVar) {
                this.f1052a = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f1052a.b(null);
            }
        }

        a() {
            j.this = r1;
        }

        private void a(d.a.c.a.h hVar, i.d dVar) {
            try {
                j.this.f1049b.a(((Integer) hVar.b()).intValue());
                dVar.b(null);
            } catch (IllegalStateException e2) {
                dVar.a("error", j.c(e2), null);
            }
        }

        private void b(d.a.c.a.h hVar, i.d dVar) {
            Map map = (Map) hVar.b();
            boolean z = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            double d2 = 0.0d;
            double doubleValue = z ? 0.0d : ((Double) map.get("width")).doubleValue();
            if (!z) {
                d2 = ((Double) map.get("height")).doubleValue();
            }
            b bVar = new b(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), doubleValue, d2, ((Integer) map.get("direction")).intValue(), map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null);
            try {
                if (z) {
                    j.this.f1049b.g(bVar);
                    dVar.b(null);
                } else {
                    dVar.b(Long.valueOf(j.this.f1049b.e(bVar)));
                }
            } catch (IllegalStateException e2) {
                dVar.a("error", j.c(e2), null);
            }
        }

        private void c(d.a.c.a.h hVar, i.d dVar) {
            Map map = (Map) hVar.b();
            int intValue = ((Integer) map.get("id")).intValue();
            try {
                if (map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue()) {
                    j.this.f1049b.c(intValue);
                } else {
                    j.this.f1049b.d(intValue);
                }
                dVar.b(null);
            } catch (IllegalStateException e2) {
                dVar.a("error", j.c(e2), null);
            }
        }

        private void d(d.a.c.a.h hVar, i.d dVar) {
            Map map = (Map) hVar.b();
            try {
                j.this.f1049b.b(new c(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new RunnableC0054a(this, dVar));
            } catch (IllegalStateException e2) {
                dVar.a("error", j.c(e2), null);
            }
        }

        private void e(d.a.c.a.h hVar, i.d dVar) {
            Map map = (Map) hVar.b();
            try {
                j.this.f1049b.f(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.b(null);
            } catch (IllegalStateException e2) {
                dVar.a("error", j.c(e2), null);
            }
        }

        private void f(d.a.c.a.h hVar, i.d dVar) {
            i.d dVar2;
            IllegalStateException e2;
            List list = (List) hVar.b();
            try {
                j.this.f1049b.h(new d(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
            } catch (IllegalStateException e3) {
                e2 = e3;
                dVar2 = dVar;
            }
            try {
                dVar2.b(null);
            } catch (IllegalStateException e4) {
                e2 = e4;
                dVar2.a("error", j.c(e2), null);
            }
        }

        @Override // d.a.c.a.i.c
        public void g(d.a.c.a.h hVar, i.d dVar) {
            if (j.this.f1049b == null) {
                return;
            }
            d.a.b.e("PlatformViewsChannel", "Received '" + hVar.f695a + "' message.");
            String str = hVar.f695a;
            str.hashCode();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1352294148:
                    if (str.equals("create")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -934437708:
                    if (str.equals("resize")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -756050293:
                    if (str.equals("clearFocus")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 110550847:
                    if (str.equals("touch")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 576796989:
                    if (str.equals("setDirection")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1671767583:
                    if (str.equals("dispose")) {
                        c2 = 5;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    b(hVar, dVar);
                    return;
                case 1:
                    d(hVar, dVar);
                    return;
                case 2:
                    a(hVar, dVar);
                    return;
                case 3:
                    f(hVar, dVar);
                    return;
                case 4:
                    e(hVar, dVar);
                    return;
                case 5:
                    c(hVar, dVar);
                    return;
                default:
                    dVar.c();
                    return;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final int f1053a;

        /* renamed from: b */
        public final String f1054b;

        /* renamed from: c */
        public final double f1055c;

        /* renamed from: d */
        public final double f1056d;

        /* renamed from: e */
        public final int f1057e;
        public final ByteBuffer f;

        public b(int i, String str, double d2, double d3, int i2, ByteBuffer byteBuffer) {
            this.f1053a = i;
            this.f1054b = str;
            this.f1055c = d2;
            this.f1056d = d3;
            this.f1057e = i2;
            this.f = byteBuffer;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final int f1058a;

        /* renamed from: b */
        public final double f1059b;

        /* renamed from: c */
        public final double f1060c;

        public c(int i, double d2, double d3) {
            this.f1058a = i;
            this.f1059b = d2;
            this.f1060c = d3;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final int f1061a;

        /* renamed from: b */
        public final Number f1062b;

        /* renamed from: c */
        public final Number f1063c;

        /* renamed from: d */
        public final int f1064d;

        /* renamed from: e */
        public final int f1065e;
        public final Object f;
        public final Object g;
        public final int h;
        public final int i;
        public final float j;
        public final float k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final long p;

        public d(int i, Number number, Number number2, int i2, int i3, Object obj, Object obj2, int i4, int i5, float f, float f2, int i6, int i7, int i8, int i9, long j) {
            this.f1061a = i;
            this.f1062b = number;
            this.f1063c = number2;
            this.f1064d = i2;
            this.f1065e = i3;
            this.f = obj;
            this.g = obj2;
            this.h = i4;
            this.i = i5;
            this.j = f;
            this.k = f2;
            this.l = i6;
            this.m = i7;
            this.n = i8;
            this.o = i9;
            this.p = j;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(int i);

        void b(c cVar, Runnable runnable);

        void c(int i);

        void d(int i);

        long e(b bVar);

        void f(int i, int i2);

        void g(b bVar);

        void h(d dVar);
    }

    public j(io.flutter.embedding.engine.e.a aVar) {
        a aVar2 = new a();
        this.f1050c = aVar2;
        d.a.c.a.i iVar = new d.a.c.a.i(aVar, "flutter/platform_views", p.f709b);
        this.f1048a = iVar;
        iVar.e(aVar2);
    }

    public static String c(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public void d(int i) {
        d.a.c.a.i iVar = this.f1048a;
        if (iVar == null) {
            return;
        }
        iVar.c("viewFocused", Integer.valueOf(i));
    }

    public void e(e eVar) {
        this.f1049b = eVar;
    }
}
