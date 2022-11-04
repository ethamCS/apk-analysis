package androidx.recyclerview.widget;

import android.view.View;
/* loaded from: classes.dex */
class o {

    /* renamed from: a */
    final b f1140a;

    /* renamed from: b */
    a f1141b = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        int f1142a = 0;

        /* renamed from: b */
        int f1143b;

        /* renamed from: c */
        int f1144c;
        int d;
        int e;

        a() {
        }

        int a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        void a(int i) {
            this.f1142a = i | this.f1142a;
        }

        void a(int i, int i2, int i3, int i4) {
            this.f1143b = i;
            this.f1144c = i2;
            this.d = i3;
            this.e = i4;
        }

        boolean a() {
            int i = this.f1142a;
            if ((i & 7) == 0 || (i & (a(this.d, this.f1143b) << 0)) != 0) {
                int i2 = this.f1142a;
                if ((i2 & 112) != 0 && (i2 & (a(this.d, this.f1144c) << 4)) == 0) {
                    return false;
                }
                int i3 = this.f1142a;
                if ((i3 & 1792) != 0 && (i3 & (a(this.e, this.f1143b) << 8)) == 0) {
                    return false;
                }
                int i4 = this.f1142a;
                return (i4 & 28672) == 0 || (i4 & (a(this.e, this.f1144c) << 12)) != 0;
            }
            return false;
        }

        void b() {
            this.f1142a = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        int a();

        int a(View view);

        View a(int i);

        int b();

        int b(View view);
    }

    public o(b bVar) {
        this.f1140a = bVar;
    }

    public View a(int i, int i2, int i3, int i4) {
        int b2 = this.f1140a.b();
        int a2 = this.f1140a.a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a3 = this.f1140a.a(i);
            this.f1141b.a(b2, a2, this.f1140a.b(a3), this.f1140a.a(a3));
            if (i3 != 0) {
                this.f1141b.b();
                this.f1141b.a(i3);
                if (this.f1141b.a()) {
                    return a3;
                }
            }
            if (i4 != 0) {
                this.f1141b.b();
                this.f1141b.a(i4);
                if (this.f1141b.a()) {
                    view = a3;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean a(View view, int i) {
        this.f1141b.a(this.f1140a.b(), this.f1140a.a(), this.f1140a.b(view), this.f1140a.a(view));
        if (i != 0) {
            this.f1141b.b();
            this.f1141b.a(i);
            return this.f1141b.a();
        }
        return false;
    }
}
