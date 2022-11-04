package b.g.j;

import java.util.Locale;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final b.g.j.d f2480a = new C0050e(null, false);

    /* renamed from: b */
    public static final b.g.j.d f2481b = new C0050e(null, true);

    /* renamed from: c */
    public static final b.g.j.d f2482c;

    /* renamed from: d */
    public static final b.g.j.d f2483d;

    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: b */
        static final a f2484b = new a(true);

        /* renamed from: a */
        private final boolean f2485a;

        private a(boolean z) {
            this.f2485a = z;
        }

        @Override // b.g.j.e.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a2 = e.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                        i++;
                    } else if (!this.f2485a) {
                        return 1;
                    }
                } else if (this.f2485a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f2485a ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a */
        static final b f2486a = new b();

        private b() {
        }

        @Override // b.g.j.e.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = e.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class d implements b.g.j.d {

        /* renamed from: a */
        private final c f2487a;

        d(c cVar) {
            this.f2487a = cVar;
        }

        private boolean c(CharSequence charSequence, int i, int i2) {
            int a2 = this.f2487a.a(charSequence, i, i2);
            if (a2 != 0) {
                if (a2 == 1) {
                    return false;
                }
                return b();
            }
            return true;
        }

        @Override // b.g.j.d
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.f2487a == null ? b() : c(charSequence, i, i2);
        }

        protected abstract boolean b();
    }

    /* renamed from: b.g.j.e$e */
    /* loaded from: classes.dex */
    private static class C0050e extends d {

        /* renamed from: b */
        private final boolean f2488b;

        C0050e(c cVar, boolean z) {
            super(cVar);
            this.f2488b = z;
        }

        @Override // b.g.j.e.d
        protected boolean b() {
            return this.f2488b;
        }
    }

    /* loaded from: classes.dex */
    private static class f extends d {

        /* renamed from: b */
        static final f f2489b = new f();

        f() {
            super(null);
        }

        @Override // b.g.j.e.d
        protected boolean b() {
            return b.g.j.f.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f2486a;
        f2482c = new C0050e(bVar, false);
        f2483d = new C0050e(bVar, true);
        a aVar = a.f2484b;
        f fVar = f.f2489b;
    }

    static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
