package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.AbstractC0505g;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: j$.util.stream.o */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0590o implements Consumer, j$.util.function.I {

    /* renamed from: a */
    public final /* synthetic */ int f13757a;

    /* renamed from: b */
    public final /* synthetic */ Object f13758b;

    /* renamed from: c */
    public final /* synthetic */ Object f13759c;

    public /* synthetic */ C0590o(Object obj, Object obj2, int i10) {
        this.f13757a = i10;
        this.f13758b = obj;
        this.f13759c = obj2;
    }

    @Override // j$.util.function.I
    public final Object get() {
        switch (this.f13757a) {
            case 1:
                return new C0632y0((A0) this.f13758b, (AbstractC0505g) this.f13759c);
            case 2:
                return new C0624w0((A0) this.f13758b, (j$.util.function.r) this.f13759c);
            case 3:
                return new C0628x0((A0) this.f13758b, (j$.util.function.z) this.f13759c);
            default:
                return new C0620v0((A0) this.f13758b, (Predicate) this.f13759c);
        }
    }

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        switch (this.f13757a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f13758b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f13759c;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 5:
                ((BiConsumer) this.f13758b).w(this.f13759c, obj);
                return;
            default:
                ((C0584m3) this.f13758b).m((Consumer) this.f13759c, obj);
                return;
        }
    }
}
