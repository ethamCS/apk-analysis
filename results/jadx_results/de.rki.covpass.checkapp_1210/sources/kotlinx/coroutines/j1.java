package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/j1;", "Lkotlinx/coroutines/v1;", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "c", "Z", "j", "()Z", "isActive", "Lkotlinx/coroutines/n2;", "k", "()Lkotlinx/coroutines/n2;", "list", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class j1 implements v1 {

    /* renamed from: c */
    private final boolean f15467c;

    public j1(boolean z10) {
        this.f15467c = z10;
    }

    @Override // kotlinx.coroutines.v1
    public boolean j() {
        return this.f15467c;
    }

    @Override // kotlinx.coroutines.v1
    public n2 k() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(j() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
