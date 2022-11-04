package ub;

import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lub/u0;", "T", "Lub/c;", BuildConfig.FLAVOR, "index", "get", "(I)Ljava/lang/Object;", "a", "()I", "size", BuildConfig.FLAVOR, "delegate", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class u0<T> extends c<T> {

    /* renamed from: c */
    private final List<T> f23389c;

    /* JADX WARN: Multi-variable type inference failed */
    public u0(List<? extends T> list) {
        hc.t.e(list, "delegate");
        this.f23389c = list;
    }

    @Override // ub.a
    public int a() {
        return this.f23389c.size();
    }

    @Override // ub.c, java.util.List
    public T get(int i10) {
        int I;
        List<T> list = this.f23389c;
        I = a0.I(this, i10);
        return list.get(I);
    }
}
