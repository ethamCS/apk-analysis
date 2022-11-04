package a.g.j;

import java.util.Locale;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final a.g.j.d f233a = new C0013e(null, false);

    /* renamed from: b */
    public static final a.g.j.d f234b = new C0013e(null, true);

    /* renamed from: c */
    public static final a.g.j.d f235c = new C0013e(b.f238a, false);
    public static final a.g.j.d d = new C0013e(b.f238a, true);

    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: b */
        static final a f236b = new a(true);

        /* renamed from: a */
        private final boolean f237a;

        private a(boolean z) {
            this.f237a = z;
        }

        @Override // a.g.j.e.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a2 = e.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                        i++;
                    } else if (!this.f237a) {
                        return 1;
                    }
                } else if (this.f237a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f237a ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a */
        static final b f238a = new b();

        private b() {
        }

        @Override // a.g.j.e.c
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
    public static abstract class d implements a.g.j.d {

        /* renamed from: a */
        private final c f239a;

        d(c cVar) {
            this.f239a = cVar;
        }

        private boolean b(CharSequence charSequence, int i, int i2) {
            int a2 = this.f239a.a(charSequence, i, i2);
            if (a2 != 0) {
                if (a2 == 1) {
                    return false;
                }
                return a();
            }
            return true;
        }

        protected abstract boolean a();

        @Override // a.g.j.d
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.f239a == null ? a() : b(charSequence, i, i2);
        }
    }

    /* renamed from: a.g.j.e$e */
    /* loaded from: classes.dex */
    private static class C0013e extends d {

        /* renamed from: b */
        private final boolean f240b;

        C0013e(c cVar, boolean z) {
            super(cVar);
            this.f240b = z;
        }

        @Override // a.g.j.e.d
        protected boolean a() {
            return this.f240b;
        }
    }

    /* loaded from: classes.dex */
    private static class f extends d {

        /* renamed from: b */
        static final f f241b = new f();

        f() {
            super(null);
        }

        @Override // a.g.j.e.d
        protected boolean a() {
            return a.g.j.f.b(Locale.getDefault()) == 1;
        }
    }

    static {
        new C0013e(a.f236b, false);
        f fVar = f.f241b;
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
