package androidx.fragment.app;

import androidx.lifecycle.e;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: b */
    int f930b;

    /* renamed from: c */
    int f931c;
    int d;
    int e;
    int f;
    int g;
    boolean h;
    String i;
    int j;
    CharSequence k;
    int l;
    CharSequence m;
    ArrayList<String> n;
    ArrayList<String> o;
    ArrayList<Runnable> q;

    /* renamed from: a */
    ArrayList<a> f929a = new ArrayList<>();
    boolean p = false;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        int f932a;

        /* renamed from: b */
        Fragment f933b;

        /* renamed from: c */
        int f934c;
        int d;
        int e;
        int f;
        e.b g;
        e.b h;

        public a() {
        }

        public a(int i, Fragment fragment) {
            this.f932a = i;
            this.f933b = fragment;
            e.b bVar = e.b.RESUMED;
            this.g = bVar;
            this.h = bVar;
        }
    }

    public void a(a aVar) {
        this.f929a.add(aVar);
        aVar.f934c = this.f930b;
        aVar.d = this.f931c;
        aVar.e = this.d;
        aVar.f = this.e;
    }
}
