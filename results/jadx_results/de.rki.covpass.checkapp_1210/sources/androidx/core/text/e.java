package androidx.core.text;

import java.util.Locale;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c */
    public static final androidx.core.text.d f3585c;

    /* renamed from: d */
    public static final androidx.core.text.d f3586d;

    /* renamed from: a */
    public static final androidx.core.text.d f3583a = new C0037e(null, false);

    /* renamed from: b */
    public static final androidx.core.text.d f3584b = new C0037e(null, true);

    /* renamed from: e */
    public static final androidx.core.text.d f3587e = new C0037e(a.f3589b, false);

    /* renamed from: f */
    public static final androidx.core.text.d f3588f = f.f3594b;

    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: b */
        static final a f3589b = new a(true);

        /* renamed from: a */
        private final boolean f3590a;

        private a(boolean z10) {
            this.f3590a = z10;
        }

        @Override // androidx.core.text.e.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int a10 = e.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (a10 != 0) {
                    if (a10 != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f3590a) {
                        return 1;
                    }
                } else if (this.f3590a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f3590a ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a */
        static final b f3591a = new b();

        private b() {
        }

        @Override // androidx.core.text.e.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = e.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class d implements androidx.core.text.d {

        /* renamed from: a */
        private final c f3592a;

        d(c cVar) {
            this.f3592a = cVar;
        }

        private boolean c(CharSequence charSequence, int i10, int i11) {
            int a10 = this.f3592a.a(charSequence, i10, i11);
            if (a10 != 0) {
                if (a10 == 1) {
                    return false;
                }
                return b();
            }
            return true;
        }

        @Override // androidx.core.text.d
        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f3592a == null ? b() : c(charSequence, i10, i11);
        }

        protected abstract boolean b();
    }

    /* renamed from: androidx.core.text.e$e */
    /* loaded from: classes.dex */
    private static class C0037e extends d {

        /* renamed from: b */
        private final boolean f3593b;

        C0037e(c cVar, boolean z10) {
            super(cVar);
            this.f3593b = z10;
        }

        @Override // androidx.core.text.e.d
        protected boolean b() {
            return this.f3593b;
        }
    }

    /* loaded from: classes.dex */
    private static class f extends d {

        /* renamed from: b */
        static final f f3594b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.e.d
        protected boolean b() {
            return androidx.core.text.f.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f3591a;
        f3585c = new C0037e(bVar, false);
        f3586d = new C0037e(bVar, true);
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
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
