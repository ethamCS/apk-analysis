package com.zell_mbc.medilog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.zell_mbc.medilog.databinding.ActivityAboutBinding;
import com.zell_mbc.medilog.utility.Preferences;
import com.zell_mbc.medilog.utility.ThemeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AboutFragment.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u001a\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/zell_mbc/medilog/AboutFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/zell_mbc/medilog/databinding/ActivityAboutBinding;", "binding", "getBinding", "()Lcom/zell_mbc/medilog/databinding/ActivityAboutBinding;", "ShowContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AboutFragment extends Fragment {
    public static final int $stable = 8;
    private ActivityAboutBinding _binding;

    private final ActivityAboutBinding getBinding() {
        ActivityAboutBinding activityAboutBinding = this._binding;
        Intrinsics.checkNotNull(activityAboutBinding);
        return activityAboutBinding;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = ActivityAboutBinding.inflate(inflater, viewGroup, false);
        ComposeView root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    public final void ShowContent(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1199421344);
        ComposerKt.sourceInformation(startRestartGroup, "C(ShowContent)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1199421344, i, -1, "com.zell_mbc.medilog.AboutFragment.ShowContent (AboutFragment.kt:89)");
        }
        Preferences.SingletonFactory singletonFactory = Preferences.SingletonFactory;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ThemeKt.ListTheme(false, ComposableLambdaKt.composableLambda(startRestartGroup, 2030339009, true, new AboutFragment$ShowContent$1(ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), this, singletonFactory.getSharedPreferences(requireContext))), startRestartGroup, 48, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new AboutFragment$ShowContent$2(this, i));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        getBinding().aboutView.setContent(ComposableLambdaKt.composableLambdaInstance(-241487743, true, new AboutFragment$onViewCreated$1(this)));
    }
}
