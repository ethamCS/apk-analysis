package j$.util;

import java.util.Collection;
import java.util.SortedSet;
/* renamed from: j$.util.x */
/* loaded from: classes2.dex */
final class C0643x extends S {

    /* renamed from: f */
    final /* synthetic */ SortedSet f13846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0643x(SortedSet sortedSet, Collection collection) {
        super(collection, 21);
        this.f13846f = sortedSet;
    }

    @Override // j$.util.S, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f13846f.comparator();
    }
}
