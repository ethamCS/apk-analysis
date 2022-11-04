package ub;

import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0006J \u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lub/t0;", "T", "Lub/e;", BuildConfig.FLAVOR, "index", "get", "(I)Ljava/lang/Object;", "Ltb/e0;", "clear", "e", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "add", "(ILjava/lang/Object;)V", "b", "()I", "size", BuildConfig.FLAVOR, "delegate", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class t0<T> extends e<T> {

    /* renamed from: c */
    private final List<T> f23388c;

    public t0(List<T> list) {
        hc.t.e(list, "delegate");
        this.f23388c = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, T t10) {
        int J;
        List<T> list = this.f23388c;
        J = a0.J(this, i10);
        list.add(J, t10);
    }

    @Override // ub.e
    public int b() {
        return this.f23388c.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f23388c.clear();
    }

    @Override // ub.e
    public T e(int i10) {
        int I;
        List<T> list = this.f23388c;
        I = a0.I(this, i10);
        return list.remove(I);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        int I;
        List<T> list = this.f23388c;
        I = a0.I(this, i10);
        return list.get(I);
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i10, T t10) {
        int I;
        List<T> list = this.f23388c;
        I = a0.I(this, i10);
        return list.set(I, t10);
    }
}
