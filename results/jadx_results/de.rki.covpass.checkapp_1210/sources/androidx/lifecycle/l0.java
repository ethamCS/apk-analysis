package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0002\u0014\u0017B\u001f\b\u0016\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001f¢\u0006\u0004\b!\u0010\"B\t\b\u0016¢\u0006\u0004\b!\u0010#J3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0007J+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R(\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015¨\u0006%"}, d2 = {"Landroidx/lifecycle/l0;", BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "key", BuildConfig.FLAVOR, "hasInitialValue", "initialValue", "Landroidx/lifecycle/d0;", "g", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/d0;", "Lk1/c$c;", "h", "f", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/d0;", "value", "Ltb/e0;", "j", "(Ljava/lang/String;Ljava/lang/Object;)V", BuildConfig.FLAVOR, "a", "Ljava/util/Map;", "regular", "b", "savedStateProviders", "Landroidx/lifecycle/l0$b;", "c", "liveDatas", "Lkotlinx/coroutines/flow/p;", "d", "flows", BuildConfig.FLAVOR, "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "Companion", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class l0 {
    public static final a Companion = new a(null);

    /* renamed from: f */
    private static final Class<? extends Object>[] f4329f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    private final Map<String, Object> f4330a;

    /* renamed from: b */
    private final Map<String, c.AbstractC0210c> f4331b;

    /* renamed from: c */
    private final Map<String, b<?>> f4332c;

    /* renamed from: d */
    private final Map<String, kotlinx.coroutines.flow.p<Object>> f4333d;

    /* renamed from: e */
    private final c.AbstractC0210c f4334e;

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007R$\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/l0$a;", BuildConfig.FLAVOR, "Landroid/os/Bundle;", "restoredState", "defaultState", "Landroidx/lifecycle/l0;", "a", "value", BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", BuildConfig.FLAVOR, "KEYS", "Ljava/lang/String;", "VALUES", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fc.c
        public final l0 a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new l0();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    hc.t.d(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new l0(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new l0(linkedHashMap);
        }

        public final boolean b(Object obj) {
            Class[] clsArr;
            if (obj == null) {
                return true;
            }
            for (Class cls : l0.f4329f) {
                hc.t.b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fB\u001b\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/l0$b;", "T", "Landroidx/lifecycle/d0;", "value", "Ltb/e0;", "m", "(Ljava/lang/Object;)V", BuildConfig.FLAVOR, "l", "Ljava/lang/String;", "key", "Landroidx/lifecycle/l0;", "Landroidx/lifecycle/l0;", "handle", "<init>", "(Landroidx/lifecycle/l0;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/l0;Ljava/lang/String;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b<T> extends d0<T> {

        /* renamed from: l */
        private String f4335l;

        /* renamed from: m */
        private l0 f4336m;

        public b(l0 l0Var, String str) {
            hc.t.e(str, "key");
            this.f4335l = str;
            this.f4336m = l0Var;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0 l0Var, String str, T t10) {
            super(t10);
            hc.t.e(str, "key");
            this.f4335l = str;
            this.f4336m = l0Var;
        }

        @Override // androidx.lifecycle.d0, androidx.lifecycle.LiveData
        public void m(T t10) {
            l0 l0Var = this.f4336m;
            if (l0Var != null) {
                l0Var.f4330a.put(this.f4335l, t10);
                kotlinx.coroutines.flow.p pVar = (kotlinx.coroutines.flow.p) l0Var.f4333d.get(this.f4335l);
                if (pVar != null) {
                    pVar.setValue(t10);
                }
            }
            super.m(t10);
        }
    }

    public l0() {
        this.f4330a = new LinkedHashMap();
        this.f4331b = new LinkedHashMap();
        this.f4332c = new LinkedHashMap();
        this.f4333d = new LinkedHashMap();
        this.f4334e = new c.AbstractC0210c() { // from class: androidx.lifecycle.k0
            @Override // k1.c.AbstractC0210c
            public final Bundle a() {
                Bundle i10;
                i10 = l0.i(l0.this);
                return i10;
            }
        };
    }

    public l0(Map<String, ? extends Object> map) {
        hc.t.e(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4330a = linkedHashMap;
        this.f4331b = new LinkedHashMap();
        this.f4332c = new LinkedHashMap();
        this.f4333d = new LinkedHashMap();
        this.f4334e = new c.AbstractC0210c() { // from class: androidx.lifecycle.k0
            @Override // k1.c.AbstractC0210c
            public final Bundle a() {
                Bundle i10;
                i10 = l0.i(l0.this);
                return i10;
            }
        };
        linkedHashMap.putAll(map);
    }

    @fc.c
    public static final l0 e(Bundle bundle, Bundle bundle2) {
        return Companion.a(bundle, bundle2);
    }

    private final <T> d0<T> g(String str, boolean z10, T t10) {
        b<?> bVar;
        b<?> bVar2 = this.f4332c.get(str);
        b<?> bVar3 = bVar2 instanceof d0 ? bVar2 : null;
        if (bVar3 != null) {
            return bVar3;
        }
        if (this.f4330a.containsKey(str)) {
            bVar = new b<>(this, str, this.f4330a.get(str));
        } else if (z10) {
            this.f4330a.put(str, t10);
            bVar = new b<>(this, str, t10);
        } else {
            bVar = new b<>(this, str);
        }
        this.f4332c.put(str, bVar);
        return bVar;
    }

    public static final Bundle i(l0 l0Var) {
        Map s10;
        hc.t.e(l0Var, "this$0");
        s10 = ub.q0.s(l0Var.f4331b);
        for (Map.Entry entry : s10.entrySet()) {
            l0Var.j((String) entry.getKey(), ((c.AbstractC0210c) entry.getValue()).a());
        }
        Set<String> keySet = l0Var.f4330a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(l0Var.f4330a.get(str));
        }
        return androidx.core.os.d.a(tb.x.a("keys", arrayList), tb.x.a("values", arrayList2));
    }

    public final <T> d0<T> f(String str, T t10) {
        hc.t.e(str, "key");
        return g(str, true, t10);
    }

    public final c.AbstractC0210c h() {
        return this.f4334e;
    }

    public final <T> void j(String str, T t10) {
        hc.t.e(str, "key");
        if (!Companion.b(t10)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't put value with type ");
            hc.t.b(t10);
            sb2.append(t10.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        b<?> bVar = this.f4332c.get(str);
        b<?> bVar2 = bVar instanceof d0 ? bVar : null;
        if (bVar2 != null) {
            bVar2.m(t10);
        } else {
            this.f4330a.put(str, t10);
        }
        kotlinx.coroutines.flow.p<Object> pVar = this.f4333d.get(str);
        if (pVar == null) {
            return;
        }
        pVar.setValue(t10);
    }
}
