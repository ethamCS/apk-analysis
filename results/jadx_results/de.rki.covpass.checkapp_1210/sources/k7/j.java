package k7;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001e\u0010\n\u001a\u00020\u0005*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00020\b\u001a\u0012\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/Fragment;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "adapter", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Ltb/e0;", "c", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "a", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "b", "android-utils_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class j {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<e0> {

        /* renamed from: c */
        final /* synthetic */ RecyclerView f14659c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(RecyclerView recyclerView) {
            super(0);
            this.f14659c = recyclerView;
        }

        public final void b() {
            this.f14659c.setAdapter(null);
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ e0 invoke() {
            b();
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<e0> {

        /* renamed from: c */
        final /* synthetic */ Fragment f14660c;

        /* renamed from: d */
        final /* synthetic */ androidx.appcompat.app.a f14661d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Fragment fragment, androidx.appcompat.app.a aVar) {
            super(0);
            this.f14660c = fragment;
            this.f14661d = aVar;
        }

        public final void b() {
            androidx.fragment.app.j F = this.f14660c.F();
            androidx.appcompat.app.c cVar = F instanceof androidx.appcompat.app.c ? (androidx.appcompat.app.c) F : null;
            if (cVar != null) {
                if (!hc.t.a(cVar.x0(), this.f14661d)) {
                    return;
                }
                cVar.F0(null);
            }
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ e0 invoke() {
            b();
            return e0.f22152a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.a<e0> {

        /* renamed from: c */
        final /* synthetic */ ViewPager2 f14662c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ViewPager2 viewPager2) {
            super(0);
            this.f14662c = viewPager2;
        }

        public final void b() {
            this.f14662c.setAdapter(null);
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ e0 invoke() {
            b();
            return e0.f22152a;
        }
    }

    public static final void a(Fragment fragment, RecyclerView.g<?> gVar, RecyclerView recyclerView) {
        hc.t.e(fragment, "<this>");
        hc.t.e(gVar, "adapter");
        hc.t.e(recyclerView, "recyclerView");
        recyclerView.setAdapter(gVar);
        com.ensody.reactivestate.android.e.h(fragment, new a(recyclerView));
    }

    public static final void b(Fragment fragment, Toolbar toolbar) {
        hc.t.e(fragment, "<this>");
        hc.t.e(toolbar, "toolbar");
        androidx.fragment.app.j F = fragment.F();
        androidx.appcompat.app.a aVar = null;
        androidx.appcompat.app.c cVar = F instanceof androidx.appcompat.app.c ? (androidx.appcompat.app.c) F : null;
        if (cVar != null) {
            cVar.F0(toolbar);
        }
        androidx.fragment.app.j F2 = fragment.F();
        androidx.appcompat.app.c cVar2 = F2 instanceof androidx.appcompat.app.c ? (androidx.appcompat.app.c) F2 : null;
        if (cVar2 != null) {
            aVar = cVar2.x0();
        }
        com.ensody.reactivestate.android.e.h(fragment, new b(fragment, aVar));
    }

    public static final void c(Fragment fragment, FragmentStateAdapter fragmentStateAdapter, ViewPager2 viewPager2) {
        hc.t.e(fragment, "<this>");
        hc.t.e(fragmentStateAdapter, "adapter");
        hc.t.e(viewPager2, "viewPager");
        viewPager2.setAdapter(fragmentStateAdapter);
        com.ensody.reactivestate.android.e.h(fragment, new c(viewPager2));
    }
}
