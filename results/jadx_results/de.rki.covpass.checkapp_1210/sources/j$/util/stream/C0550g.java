package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;
/* renamed from: j$.util.stream.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0550g implements BaseStream {

    /* renamed from: a */
    final /* synthetic */ AbstractC0555h f13701a;

    private /* synthetic */ C0550g(AbstractC0555h abstractC0555h) {
        this.f13701a = abstractC0555h;
    }

    public static /* synthetic */ BaseStream I(AbstractC0555h abstractC0555h) {
        if (abstractC0555h == null) {
            return null;
        }
        return new C0550g(abstractC0555h);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f13701a.close();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f13701a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f13701a.mo17iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return I(this.f13701a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return I(this.f13701a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return I(this.f13701a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f13701a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return I(this.f13701a.unordered());
    }
}
