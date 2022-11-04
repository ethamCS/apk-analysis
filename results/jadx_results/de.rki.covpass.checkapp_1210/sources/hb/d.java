package hb;

import hc.k0;
import hc.t;
import hc.y;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import oc.k;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u0016\u0010\u0011J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R;\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0017"}, d2 = {"Lhb/d;", BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "hasNext", "next", "()Ljava/lang/Object;", "Ltb/e0;", "remove", "Lhb/e;", "<set-?>", "previous$delegate", "Lkc/d;", "d", "()Lhb/e;", "e", "(Lhb/e;)V", "previous", "b", "current", "head", "<init>", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d<T> implements Iterator<T>, ic.a, j$.util.Iterator {

    /* renamed from: d */
    static final /* synthetic */ k<Object>[] f11704d = {k0.e(new y(d.class, "previous", "getPrevious()Lio/ktor/util/collections/internal/ForwardListNode;", 0))};

    /* renamed from: c */
    private final kc.d f11705c;

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements kc.d<Object, e<T>> {

        /* renamed from: a */
        private e<T> f11706a;

        /* renamed from: b */
        final /* synthetic */ Object f11707b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj) {
            this.f11707b = obj;
            this.f11706a = obj;
        }

        @Override // kc.d, kc.c
        public e<T> a(Object obj, k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f11706a;
        }

        @Override // kc.d
        public void b(Object obj, k<?> kVar, e<T> eVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f11706a = eVar;
        }
    }

    public d(e<T> eVar) {
        t.e(eVar, "head");
        this.f11705c = new a(eVar);
    }

    public final e<T> b() {
        e<T> d10 = d();
        if (d10 == null) {
            return null;
        }
        return d10.b();
    }

    public final e<T> d() {
        return (e) this.f11705c.a(this, f11704d[0]);
    }

    public final void e(e<T> eVar) {
        this.f11705c.b(this, f11704d[0], eVar);
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        e<T> b10 = b();
        return (b10 == null ? null : b10.a()) != null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public T next() {
        e(b());
        e<T> d10 = d();
        T a10 = d10 == null ? null : d10.a();
        if (a10 != null) {
            return a10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public void remove() {
        e0 e0Var;
        e<T> d10 = d();
        if (d10 == null) {
            e0Var = null;
        } else {
            d10.e();
            e0Var = e0.f22152a;
        }
        if (e0Var != null) {
            return;
        }
        throw new IllegalStateException("Fail to remove element before iteration".toString());
    }
}
