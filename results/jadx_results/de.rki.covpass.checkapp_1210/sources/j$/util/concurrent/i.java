package j$.util.concurrent;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
final class i extends AbstractC0495b implements Iterator, Enumeration, j$.util.Iterator {

    /* renamed from: k */
    public final /* synthetic */ int f13308k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(m[] mVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap, int i12) {
        super(mVarArr, i10, i11, concurrentHashMap);
        this.f13308k = i12;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.f13308k) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        switch (this.f13308k) {
            case 0:
                m mVar = this.f13323b;
                if (mVar == null) {
                    throw new NoSuchElementException();
                }
                Object obj = mVar.f13315b;
                this.f13303j = mVar;
                a();
                return obj;
            default:
                m mVar2 = this.f13323b;
                if (mVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj2 = mVar2.f13316c;
                this.f13303j = mVar2;
                a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f13308k) {
            case 0:
                return next();
            default:
                return next();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.f13308k) {
            case 0:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
            default:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
        }
    }
}
