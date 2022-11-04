package s4;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J+\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ?\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u00002\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Ls4/c0;", "Ls4/u0;", BuildConfig.FLAVOR, "key", BuildConfig.FLAVOR, "b", "T", "default", "Ls4/l0;", "a", "(Ljava/lang/String;Ljava/lang/Object;)Ls4/l0;", "Lkotlin/Function1;", "Ltb/e0;", "setter", "c", "(Ljava/lang/String;Ljava/lang/Object;Lgc/l;)Ls4/l0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "underlyingData", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c0 implements u0 {

    /* renamed from: a */
    private final Map<String, Object> f21371a;

    /* renamed from: b */
    private final Map<String, l0<?>> f21372b;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<T, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ gc.l<T, tb.e0> f21373c;

        /* renamed from: d */
        final /* synthetic */ c0 f21374d;

        /* renamed from: q */
        final /* synthetic */ String f21375q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(gc.l<? super T, tb.e0> lVar, c0 c0Var, String str) {
            super(1);
            this.f21373c = lVar;
            this.f21374d = c0Var;
            this.f21375q = str;
        }

        public final void b(T t10) {
            gc.l<T, tb.e0> lVar = this.f21373c;
            if (lVar != 0) {
                lVar.invoke(t10);
            }
            this.f21374d.d().put(this.f21375q, t10);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(Object obj) {
            b(obj);
            return tb.e0.f22152a;
        }
    }

    public c0(Map<String, Object> map) {
        hc.t.e(map, "underlyingData");
        this.f21371a = map;
        this.f21372b = new LinkedHashMap();
    }

    public /* synthetic */ c0(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }

    @Override // s4.u0
    public <T> l0<T> a(String str, T t10) {
        hc.t.e(str, "key");
        return c(str, t10, null);
    }

    public boolean b(String str) {
        hc.t.e(str, "key");
        return this.f21372b.containsKey(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> l0<T> c(String str, T t10, gc.l<? super T, tb.e0> lVar) {
        hc.t.e(str, "key");
        Map<String, l0<?>> map = this.f21372b;
        Object obj = map.get(str);
        if (obj == null) {
            Object obj2 = this.f21371a.get(str);
            if (obj2 != null) {
                t10 = obj2;
            }
            obj = b1.a(t10, new a(lVar, this, str));
            this.f21372b.put(str, obj);
            map.put(str, obj);
        }
        return (l0) obj;
    }

    public final Map<String, Object> d() {
        return this.f21371a;
    }
}
