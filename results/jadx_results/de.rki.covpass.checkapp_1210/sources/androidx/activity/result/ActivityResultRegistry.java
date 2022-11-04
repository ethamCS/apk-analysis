package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    private Random f606a = new Random();

    /* renamed from: b */
    private final Map<Integer, String> f607b = new HashMap();

    /* renamed from: c */
    final Map<String, Integer> f608c = new HashMap();

    /* renamed from: d */
    private final Map<String, d> f609d = new HashMap();

    /* renamed from: e */
    ArrayList<String> f610e = new ArrayList<>();

    /* renamed from: f */
    final transient Map<String, c<?>> f611f = new HashMap();

    /* renamed from: g */
    final Map<String, Object> f612g = new HashMap();

    /* renamed from: h */
    final Bundle f613h = new Bundle();

    /* loaded from: classes.dex */
    public class a extends androidx.activity.result.c<I> {

        /* renamed from: a */
        final /* synthetic */ String f618a;

        /* renamed from: b */
        final /* synthetic */ d.a f619b;

        a(String str, d.a aVar) {
            ActivityResultRegistry.this = r1;
            this.f618a = str;
            this.f619b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(I i10, androidx.core.app.c cVar) {
            Integer num = ActivityResultRegistry.this.f608c.get(this.f618a);
            if (num != null) {
                ActivityResultRegistry.this.f610e.add(this.f618a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f619b, i10, cVar);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f610e.remove(this.f618a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f619b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f618a);
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.activity.result.c<I> {

        /* renamed from: a */
        final /* synthetic */ String f621a;

        /* renamed from: b */
        final /* synthetic */ d.a f622b;

        b(String str, d.a aVar) {
            ActivityResultRegistry.this = r1;
            this.f621a = str;
            this.f622b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(I i10, androidx.core.app.c cVar) {
            Integer num = ActivityResultRegistry.this.f608c.get(this.f621a);
            if (num != null) {
                ActivityResultRegistry.this.f610e.add(this.f621a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f622b, i10, cVar);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f610e.remove(this.f621a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f622b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f621a);
        }
    }

    /* loaded from: classes.dex */
    public static class c<O> {

        /* renamed from: a */
        final androidx.activity.result.b<O> f624a;

        /* renamed from: b */
        final d.a<?, O> f625b;

        c(androidx.activity.result.b<O> bVar, d.a<?, O> aVar) {
            this.f624a = bVar;
            this.f625b = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        final m f626a;

        /* renamed from: b */
        private final ArrayList<s> f627b = new ArrayList<>();

        d(m mVar) {
            this.f626a = mVar;
        }

        void a(s sVar) {
            this.f626a.a(sVar);
            this.f627b.add(sVar);
        }

        void b() {
            Iterator<s> it = this.f627b.iterator();
            while (it.hasNext()) {
                this.f626a.c(it.next());
            }
            this.f627b.clear();
        }
    }

    private void a(int i10, String str) {
        this.f607b.put(Integer.valueOf(i10), str);
        this.f608c.put(str, Integer.valueOf(i10));
    }

    private <O> void d(String str, int i10, Intent intent, c<O> cVar) {
        if (cVar == null || cVar.f624a == null || !this.f610e.contains(str)) {
            this.f612g.remove(str);
            this.f613h.putParcelable(str, new androidx.activity.result.a(i10, intent));
            return;
        }
        cVar.f624a.a(cVar.f625b.c(i10, intent));
        this.f610e.remove(str);
    }

    private int e() {
        int nextInt = this.f606a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (this.f607b.containsKey(Integer.valueOf(i10))) {
                nextInt = this.f606a.nextInt(2147418112);
            } else {
                return i10;
            }
        }
    }

    private void k(String str) {
        if (this.f608c.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    public final boolean b(int i10, int i11, Intent intent) {
        String str = this.f607b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d(str, i11, intent, this.f611f.get(str));
        return true;
    }

    public final <O> boolean c(int i10, @SuppressLint({"UnknownNullness"}) O o10) {
        androidx.activity.result.b<?> bVar;
        String str = this.f607b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f611f.get(str);
        if (cVar == null || (bVar = cVar.f624a) == null) {
            this.f613h.remove(str);
            this.f612g.put(str, o10);
            return true;
        } else if (!this.f610e.remove(str)) {
            return true;
        } else {
            bVar.a(o10);
            return true;
        }
    }

    public abstract <I, O> void f(int i10, d.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i11, androidx.core.app.c cVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f610e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f606a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f613h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
            String str = stringArrayList.get(i10);
            if (this.f608c.containsKey(str)) {
                Integer remove = this.f608c.remove(str);
                if (!this.f613h.containsKey(str)) {
                    this.f607b.remove(remove);
                }
            }
            a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f608c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f608c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f610e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f613h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f606a);
    }

    public final <I, O> androidx.activity.result.c<I> i(final String str, v vVar, final d.a<I, O> aVar, final androidx.activity.result.b<O> bVar) {
        m c10 = vVar.c();
        if (!c10.b().b(m.c.STARTED)) {
            k(str);
            d dVar = this.f609d.get(str);
            if (dVar == null) {
                dVar = new d(c10);
            }
            dVar.a(new s() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.s
                public void f(v vVar2, m.b bVar2) {
                    if (!m.b.ON_START.equals(bVar2)) {
                        if (m.b.ON_STOP.equals(bVar2)) {
                            ActivityResultRegistry.this.f611f.remove(str);
                            return;
                        } else if (!m.b.ON_DESTROY.equals(bVar2)) {
                            return;
                        } else {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                    }
                    ActivityResultRegistry.this.f611f.put(str, new c<>(bVar, aVar));
                    if (ActivityResultRegistry.this.f612g.containsKey(str)) {
                        Object obj = ActivityResultRegistry.this.f612g.get(str);
                        ActivityResultRegistry.this.f612g.remove(str);
                        bVar.a(obj);
                    }
                    androidx.activity.result.a aVar2 = (androidx.activity.result.a) ActivityResultRegistry.this.f613h.getParcelable(str);
                    if (aVar2 == null) {
                        return;
                    }
                    ActivityResultRegistry.this.f613h.remove(str);
                    bVar.a(aVar.c(aVar2.c(), aVar2.a()));
                }
            });
            this.f609d.put(str, dVar);
            return new a(str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + vVar + " is attempting to register while current state is " + c10.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.activity.result.c<I> j(String str, d.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        k(str);
        this.f611f.put(str, new c<>(bVar, aVar));
        if (this.f612g.containsKey(str)) {
            Object obj = this.f612g.get(str);
            this.f612g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) this.f613h.getParcelable(str);
        if (aVar2 != null) {
            this.f613h.remove(str);
            bVar.a(aVar.c(aVar2.c(), aVar2.a()));
        }
        return new b(str, aVar);
    }

    final void l(String str) {
        Integer remove;
        if (!this.f610e.contains(str) && (remove = this.f608c.remove(str)) != null) {
            this.f607b.remove(remove);
        }
        this.f611f.remove(str);
        if (this.f612g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f612g.get(str));
            this.f612g.remove(str);
        }
        if (this.f613h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f613h.getParcelable(str));
            this.f613h.remove(str);
        }
        d dVar = this.f609d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f609d.remove(str);
        }
    }
}
