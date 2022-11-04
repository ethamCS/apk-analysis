package lf;

import hc.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.a0;
import mf.b0;
import mf.d0;
import mf.g0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\b\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 J)\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u0082\u0001\u0002!\"¨\u0006#"}, d2 = {"Llf/a;", "Lkotlinx/serialization/k;", "T", "Lkotlinx/serialization/j;", "serializer", "value", BuildConfig.FLAVOR, "d", "(Lkotlinx/serialization/j;Ljava/lang/Object;)Ljava/lang/String;", "Lkotlinx/serialization/b;", "deserializer", "string", "c", "(Lkotlinx/serialization/b;Ljava/lang/String;)Ljava/lang/Object;", "Llf/e;", "configuration", "Llf/e;", "f", "()Llf/e;", "Lnf/d;", "serializersModule", "Lnf/d;", "a", "()Lnf/d;", "Lmf/k;", "_schemaCache", "Lmf/k;", "g", "()Lmf/k;", "get_schemaCache$kotlinx_serialization_json$annotations", "()V", "<init>", "(Llf/e;Lnf/d;)V", "Llf/a$a;", "Llf/k;", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class a implements kotlinx.serialization.k {

    /* renamed from: d */
    public static final C0240a f15961d = new C0240a(null);

    /* renamed from: a */
    private final e f15962a;

    /* renamed from: b */
    private final nf.d f15963b;

    /* renamed from: c */
    private final mf.k f15964c;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llf/a$a;", "Llf/a;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
    /* renamed from: lf.a$a */
    /* loaded from: classes3.dex */
    public static final class C0240a extends a {
        private C0240a() {
            super(new e(false, false, false, false, false, false, null, false, false, null, false, false, 4095, null), nf.g.a(), null);
        }

        public /* synthetic */ C0240a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private a(e eVar, nf.d dVar) {
        this.f15962a = eVar;
        this.f15963b = dVar;
        this.f15964c = new mf.k();
    }

    public /* synthetic */ a(e eVar, nf.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, dVar);
    }

    @Override // kotlinx.serialization.g
    public nf.d a() {
        return this.f15963b;
    }

    @Override // kotlinx.serialization.k
    public final <T> T c(kotlinx.serialization.b<T> bVar, String str) {
        t.e(bVar, "deserializer");
        t.e(str, "string");
        d0 d0Var = new d0(str);
        T t10 = (T) new a0(this, g0.OBJ, d0Var, bVar.getDescriptor()).y(bVar);
        d0Var.v();
        return t10;
    }

    @Override // kotlinx.serialization.k
    public final <T> String d(kotlinx.serialization.j<? super T> jVar, T t10) {
        t.e(jVar, "serializer");
        mf.t tVar = new mf.t();
        try {
            new b0(tVar, this, g0.OBJ, new j[g0.values().length]).e(jVar, t10);
            return tVar.toString();
        } finally {
            tVar.h();
        }
    }

    public final e f() {
        return this.f15962a;
    }

    public final mf.k g() {
        return this.f15964c;
    }
}
