package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    private final Runnable f3676a;

    /* renamed from: b */
    private final CopyOnWriteArrayList<l> f3677b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Map<l, a> f3678c = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final androidx.lifecycle.m f3679a;

        /* renamed from: b */
        private androidx.lifecycle.s f3680b;

        void a() {
            this.f3679a.c(this.f3680b);
            this.f3680b = null;
        }
    }

    public j(Runnable runnable) {
        this.f3676a = runnable;
    }

    public void a(l lVar) {
        this.f3677b.add(lVar);
        this.f3676a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator<l> it = this.f3677b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator<l> it = this.f3677b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator<l> it = this.f3677b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator<l> it = this.f3677b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }

    public void f(l lVar) {
        this.f3677b.remove(lVar);
        a remove = this.f3678c.remove(lVar);
        if (remove != null) {
            remove.a();
        }
        this.f3676a.run();
    }
}
