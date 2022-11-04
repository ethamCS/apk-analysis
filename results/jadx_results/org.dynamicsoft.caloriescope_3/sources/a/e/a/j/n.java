package a.e.a.j;
/* loaded from: classes.dex */
public class n extends o {

    /* renamed from: c */
    float f147c = 0.0f;

    public void a(int i) {
        if (this.f149b == 0 || this.f147c != i) {
            this.f147c = i;
            if (this.f149b == 1) {
                b();
            }
            a();
        }
    }

    @Override // a.e.a.j.o
    public void d() {
        super.d();
        this.f147c = 0.0f;
    }

    public void f() {
        this.f149b = 2;
    }
}
