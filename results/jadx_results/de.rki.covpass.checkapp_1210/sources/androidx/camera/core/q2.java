package androidx.camera.core;

import android.util.SparseArray;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q2 implements w.g1 {

    /* renamed from: e */
    private final List<Integer> f2452e;

    /* renamed from: f */
    private String f2453f;

    /* renamed from: a */
    final Object f2448a = new Object();

    /* renamed from: b */
    final SparseArray<c.a<n1>> f2449b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<x5.a<n1>> f2450c = new SparseArray<>();

    /* renamed from: d */
    private final List<n1> f2451d = new ArrayList();

    /* renamed from: g */
    private boolean f2454g = false;

    /* loaded from: classes.dex */
    public class a implements c.AbstractC0023c<n1> {

        /* renamed from: a */
        final /* synthetic */ int f2455a;

        a(int i10) {
            q2.this = r1;
            this.f2455a = i10;
        }

        @Override // androidx.concurrent.futures.c.AbstractC0023c
        public Object a(c.a<n1> aVar) {
            synchronized (q2.this.f2448a) {
                q2.this.f2449b.put(this.f2455a, aVar);
            }
            return "getImageProxy(id: " + this.f2455a + ")";
        }
    }

    public q2(List<Integer> list, String str) {
        this.f2452e = list;
        this.f2453f = str;
        f();
    }

    private void f() {
        synchronized (this.f2448a) {
            for (Integer num : this.f2452e) {
                int intValue = num.intValue();
                this.f2450c.put(intValue, androidx.concurrent.futures.c.a(new a(intValue)));
            }
        }
    }

    @Override // w.g1
    public x5.a<n1> a(int i10) {
        x5.a<n1> aVar;
        synchronized (this.f2448a) {
            if (this.f2454g) {
                throw new IllegalStateException("ImageProxyBundle already closed.");
            }
            aVar = this.f2450c.get(i10);
            if (aVar == null) {
                throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i10);
            }
        }
        return aVar;
    }

    @Override // w.g1
    public List<Integer> b() {
        return Collections.unmodifiableList(this.f2452e);
    }

    public void c(n1 n1Var) {
        synchronized (this.f2448a) {
            if (this.f2454g) {
                return;
            }
            Integer num = (Integer) n1Var.I().a().c(this.f2453f);
            if (num == null) {
                throw new IllegalArgumentException("CaptureId is null.");
            }
            c.a<n1> aVar = this.f2449b.get(num.intValue());
            if (aVar != null) {
                this.f2451d.add(n1Var);
                aVar.c(n1Var);
                return;
            }
            throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + num);
        }
    }

    public void d() {
        synchronized (this.f2448a) {
            if (this.f2454g) {
                return;
            }
            for (n1 n1Var : this.f2451d) {
                n1Var.close();
            }
            this.f2451d.clear();
            this.f2450c.clear();
            this.f2449b.clear();
            this.f2454g = true;
        }
    }

    public void e() {
        synchronized (this.f2448a) {
            if (this.f2454g) {
                return;
            }
            for (n1 n1Var : this.f2451d) {
                n1Var.close();
            }
            this.f2451d.clear();
            this.f2450c.clear();
            this.f2449b.clear();
            f();
        }
    }
}
