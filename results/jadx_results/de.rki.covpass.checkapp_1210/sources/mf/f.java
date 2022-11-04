package mf;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0018H\u0016J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nR*\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00188\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lmf/f;", BuildConfig.FLAVOR, "Ltb/e0;", "b", "p", "c", "o", BuildConfig.FLAVOR, "v", "e", BuildConfig.FLAVOR, "j", BuildConfig.FLAVOR, "g", BuildConfig.FLAVOR, "f", BuildConfig.FLAVOR, "d", BuildConfig.FLAVOR, "k", BuildConfig.FLAVOR, "h", BuildConfig.FLAVOR, "i", BuildConfig.FLAVOR, "l", "value", "m", "<set-?>", "writingFirst", "Z", "a", "()Z", "n", "(Z)V", "Lmf/t;", "sb", "<init>", "(Lmf/t;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a */
    public final t f16622a;

    /* renamed from: b */
    private boolean f16623b = true;

    public f(t tVar) {
        hc.t.e(tVar, "sb");
        this.f16622a = tVar;
    }

    public final boolean a() {
        return this.f16623b;
    }

    public void b() {
        this.f16623b = true;
    }

    public void c() {
        this.f16623b = false;
    }

    public void d(byte b10) {
        this.f16622a.b(b10);
    }

    public final void e(char c10) {
        this.f16622a.a(c10);
    }

    public void f(double d10) {
        this.f16622a.c(String.valueOf(d10));
    }

    public void g(float f10) {
        this.f16622a.c(String.valueOf(f10));
    }

    public void h(int i10) {
        this.f16622a.b(i10);
    }

    public void i(long j10) {
        this.f16622a.b(j10);
    }

    public final void j(String str) {
        hc.t.e(str, "v");
        this.f16622a.c(str);
    }

    public void k(short s10) {
        this.f16622a.b(s10);
    }

    public void l(boolean z10) {
        this.f16622a.c(String.valueOf(z10));
    }

    public final void m(String str) {
        hc.t.e(str, "value");
        this.f16622a.d(str);
    }

    public final void n(boolean z10) {
        this.f16623b = z10;
    }

    public void o() {
    }

    public void p() {
    }
}
