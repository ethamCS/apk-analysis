package sf;

import hc.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\bR\"\u0010\u0018\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lsf/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "f", "Lsf/d;", "queue", "Ltb/e0;", "e", "(Lsf/d;)V", BuildConfig.FLAVOR, "toString", "name", "Ljava/lang/String;", "b", "()Ljava/lang/String;", BuildConfig.FLAVOR, "cancelable", "Z", "a", "()Z", "Lsf/d;", "d", "()Lsf/d;", "setQueue$okhttp", "nextExecuteNanoTime", "J", "c", "()J", "g", "(J)V", "<init>", "(Ljava/lang/String;Z)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a */
    private final String f21680a;

    /* renamed from: b */
    private final boolean f21681b;

    /* renamed from: c */
    private d f21682c;

    /* renamed from: d */
    private long f21683d;

    public a(String str, boolean z10) {
        t.e(str, "name");
        this.f21680a = str;
        this.f21681b = z10;
        this.f21683d = -1L;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }

    public final boolean a() {
        return this.f21681b;
    }

    public final String b() {
        return this.f21680a;
    }

    public final long c() {
        return this.f21683d;
    }

    public final d d() {
        return this.f21682c;
    }

    public final void e(d dVar) {
        t.e(dVar, "queue");
        d dVar2 = this.f21682c;
        if (dVar2 == dVar) {
            return;
        }
        if (!(dVar2 == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.f21682c = dVar;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f21683d = j10;
    }

    public String toString() {
        return this.f21680a;
    }
}
