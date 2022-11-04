package hb;

import hc.t;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J \u0010\f\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lhb/a;", "T", "Lub/e;", BuildConfig.FLAVOR, "index", "get", "(I)Ljava/lang/Object;", "element", "Ltb/e0;", "add", "(ILjava/lang/Object;)V", "e", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "b", "()I", "size", BuildConfig.FLAVOR, "origin", "fromIndex", "toIndex", "<init>", "(Ljava/util/List;II)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a<T> extends ub.e<T> {

    /* renamed from: c */
    private final List<T> f11695c;

    /* renamed from: d */
    private final int f11696d;

    /* renamed from: q */
    private final int f11697q;

    public a(List<T> list, int i10, int i11) {
        t.e(list, "origin");
        this.f11695c = list;
        this.f11696d = i10;
        this.f11697q = i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, T t10) {
        throw new IllegalStateException("Unsupported append in ConcurrentList slice".toString());
    }

    @Override // ub.e
    public int b() {
        return Math.min(this.f11695c.size(), this.f11697q - this.f11696d);
    }

    @Override // ub.e
    public T e(int i10) {
        throw new IllegalStateException("Unsupported remove in ConcurrentList slice".toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        return this.f11695c.get(this.f11696d + i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i10, T t10) {
        return this.f11695c.set(this.f11696d + i10, t10);
    }
}
