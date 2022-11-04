package com.ensody.reactivestate.android;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import hc.t;
import hc.v;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import s4.l0;
import s4.u0;
import s4.z0;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\b*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"T", "Landroidx/fragment/app/Fragment;", "default", "Lkc/c;", BuildConfig.FLAVOR, "Ls4/l0;", "b", "(Landroidx/fragment/app/Fragment;Ljava/lang/Object;)Lkc/c;", "Ls4/u0;", "a", "(Landroidx/fragment/app/Fragment;)Ls4/u0;", "savedInstanceState", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class i {

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Loc/k;", "it", "b", "(Loc/k;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.l<oc.k<?>, l0<T>> {

        /* renamed from: c */
        final /* synthetic */ Fragment f6790c;

        /* renamed from: d */
        final /* synthetic */ Object f6791d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment, Object obj) {
            super(1);
            this.f6790c = fragment;
            this.f6791d = obj;
        }

        /* renamed from: b */
        public final l0<T> invoke(oc.k<?> kVar) {
            t.e(kVar, "it");
            return i.a(this.f6790c).a(kVar.getName(), this.f6791d);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.l<Object, u0> {

        /* renamed from: c */
        public static final b f6792c = new b();

        public b() {
            super(1);
        }

        @Override // gc.l
        public final u0 invoke(Object obj) {
            if (!(obj instanceof u0)) {
                obj = null;
            }
            return (u0) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "Lcom/ensody/reactivestate/android/b;", "b", "(Lcom/ensody/reactivestate/android/b;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.l<com.ensody.reactivestate.android.b, u0> {
        public c() {
            super(1);
        }

        /* renamed from: b */
        public final u0 invoke(com.ensody.reactivestate.android.b bVar) {
            t.e(bVar, "$this$buildOnViewModel");
            return bVar.b();
        }
    }

    public static final u0 a(Fragment fragment) {
        t.e(fragment, "<this>");
        return (u0) f.b(k0.a(fragment, hc.k0.b(l.class), new k(new j(fragment)), new g(fragment)), hc.k0.b(u0.class), b.f6792c, new c()).getValue();
    }

    public static final <T> kc.c<Object, l0<T>> b(Fragment fragment, T t10) {
        t.e(fragment, "<this>");
        return z0.a(new a(fragment, t10));
    }
}
