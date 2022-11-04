package androidx.recyclerview.widget;

import android.view.View;
/* loaded from: classes.dex */
class o {

    /* renamed from: a */
    final b f4807a;

    /* renamed from: b */
    a f4808b = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        int f4809a = 0;

        /* renamed from: b */
        int f4810b;

        /* renamed from: c */
        int f4811c;

        /* renamed from: d */
        int f4812d;

        /* renamed from: e */
        int f4813e;

        a() {
        }

        void a(int i10) {
            this.f4809a = i10 | this.f4809a;
        }

        boolean b() {
            int i10 = this.f4809a;
            if ((i10 & 7) == 0 || (i10 & (c(this.f4812d, this.f4810b) << 0)) != 0) {
                int i11 = this.f4809a;
                if ((i11 & 112) != 0 && (i11 & (c(this.f4812d, this.f4811c) << 4)) == 0) {
                    return false;
                }
                int i12 = this.f4809a;
                if ((i12 & 1792) != 0 && (i12 & (c(this.f4813e, this.f4810b) << 8)) == 0) {
                    return false;
                }
                int i13 = this.f4809a;
                return (i13 & 28672) == 0 || (i13 & (c(this.f4813e, this.f4811c) << 12)) != 0;
            }
            return false;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f4809a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f4810b = i10;
            this.f4811c = i11;
            this.f4812d = i12;
            this.f4813e = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        View a(int i10);

        int b();

        int c(View view);

        int d();

        int e(View view);
    }

    public o(b bVar) {
        this.f4807a = bVar;
    }

    public View a(int i10, int i11, int i12, int i13) {
        int d10 = this.f4807a.d();
        int b10 = this.f4807a.b();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View a10 = this.f4807a.a(i10);
            this.f4808b.e(d10, b10, this.f4807a.c(a10), this.f4807a.e(a10));
            if (i12 != 0) {
                this.f4808b.d();
                this.f4808b.a(i12);
                if (this.f4808b.b()) {
                    return a10;
                }
            }
            if (i13 != 0) {
                this.f4808b.d();
                this.f4808b.a(i13);
                if (this.f4808b.b()) {
                    view = a10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean b(View view, int i10) {
        this.f4808b.e(this.f4807a.d(), this.f4807a.b(), this.f4807a.c(view), this.f4807a.e(view));
        if (i10 != 0) {
            this.f4808b.d();
            this.f4808b.a(i10);
            return this.f4808b.b();
        }
        return false;
    }
}
