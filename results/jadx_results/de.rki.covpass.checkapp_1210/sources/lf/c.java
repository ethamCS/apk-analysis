package lf;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\"\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\"\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Llf/c;", BuildConfig.FLAVOR, "Llf/e;", "a", "()Llf/e;", BuildConfig.FLAVOR, "encodeDefaults", "Z", "getEncodeDefaults", "()Z", "d", "(Z)V", "ignoreUnknownKeys", "getIgnoreUnknownKeys", "e", "isLenient", "f", "useArrayPolymorphism", "getUseArrayPolymorphism", "h", "allowSpecialFloatingPointValues", "getAllowSpecialFloatingPointValues", "c", "Lnf/d;", "serializersModule", "Lnf/d;", "b", "()Lnf/d;", "g", "(Lnf/d;)V", "Llf/a;", "json", "<init>", "(Llf/a;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a */
    private boolean f15970a;

    /* renamed from: b */
    private boolean f15971b;

    /* renamed from: c */
    private boolean f15972c;

    /* renamed from: d */
    private boolean f15973d;

    /* renamed from: e */
    private boolean f15974e;

    /* renamed from: f */
    private boolean f15975f;

    /* renamed from: g */
    private String f15976g;

    /* renamed from: h */
    private boolean f15977h;

    /* renamed from: i */
    private boolean f15978i;

    /* renamed from: j */
    private String f15979j;

    /* renamed from: k */
    private boolean f15980k;

    /* renamed from: l */
    private boolean f15981l;

    /* renamed from: m */
    private nf.d f15982m;

    public c(a aVar) {
        t.e(aVar, "json");
        this.f15970a = aVar.f().e();
        this.f15971b = aVar.f().f();
        this.f15972c = aVar.f().g();
        this.f15973d = aVar.f().l();
        this.f15974e = aVar.f().b();
        this.f15975f = aVar.f().h();
        this.f15976g = aVar.f().i();
        this.f15977h = aVar.f().d();
        this.f15978i = aVar.f().k();
        this.f15979j = aVar.f().c();
        this.f15980k = aVar.f().a();
        this.f15981l = aVar.f().j();
        this.f15982m = aVar.a();
    }

    public final e a() {
        if (!this.f15978i || t.a(this.f15979j, "type")) {
            if (!this.f15975f) {
                if (!t.a(this.f15976g, "    ")) {
                    throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
                }
            } else if (!t.a(this.f15976g, "    ")) {
                String str = this.f15976g;
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    boolean z11 = true;
                    if (i10 >= str.length()) {
                        z10 = true;
                        break;
                    }
                    char charAt = str.charAt(i10);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        z11 = false;
                    }
                    if (!z11) {
                        break;
                    }
                    i10++;
                }
                if (!z10) {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f15976g).toString());
                }
            }
            return new e(this.f15970a, this.f15972c, this.f15973d, this.f15974e, this.f15975f, this.f15971b, this.f15976g, this.f15977h, this.f15978i, this.f15979j, this.f15980k, this.f15981l);
        }
        throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
    }

    public final nf.d b() {
        return this.f15982m;
    }

    public final void c(boolean z10) {
        this.f15980k = z10;
    }

    public final void d(boolean z10) {
        this.f15970a = z10;
    }

    public final void e(boolean z10) {
        this.f15972c = z10;
    }

    public final void f(boolean z10) {
        this.f15973d = z10;
    }

    public final void g(nf.d dVar) {
        t.e(dVar, "<set-?>");
        this.f15982m = dVar;
    }

    public final void h(boolean z10) {
        this.f15978i = z10;
    }
}
