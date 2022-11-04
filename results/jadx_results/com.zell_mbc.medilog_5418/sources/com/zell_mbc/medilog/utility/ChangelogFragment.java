package com.zell_mbc.medilog.utility;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.fragment.app.DialogFragment;
import com.zell_mbc.medilog.R;
import com.zell_mbc.medilog.databinding.ChangelogBinding;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
/* compiled from: ChangelogFragment.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\u001a\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/zell_mbc/medilog/utility/ChangelogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "Lcom/zell_mbc/medilog/databinding/ChangelogBinding;", "binding", "getBinding", "()Lcom/zell_mbc/medilog/databinding/ChangelogBinding;", "changelog", "", "userOutputService", "Lcom/zell_mbc/medilog/utility/UserOutputService;", "ShowContent", "", "(Landroidx/compose/runtime/Composer;I)V", "initializeService", "view", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ChangelogFragment extends DialogFragment {
    public static final int $stable = 8;
    private ChangelogBinding _binding;
    private String changelog = "";
    private UserOutputService userOutputService;

    private final ChangelogBinding getBinding() {
        ChangelogBinding changelogBinding = this._binding;
        Intrinsics.checkNotNull(changelogBinding);
        return changelogBinding;
    }

    private final void initializeService(View view) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.userOutputService = new UserOutputServiceImpl(requireContext, view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = ChangelogBinding.inflate(inflater, viewGroup, false);
        ComposeView root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        initializeService(root);
        ComposeView root2 = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "binding.root");
        return root2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    public final void ShowContent(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(703910160);
        ComposerKt.sourceInformation(startRestartGroup, "C(ShowContent)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(703910160, i, -1, "com.zell_mbc.medilog.utility.ChangelogFragment.ShowContent (ChangelogFragment.kt:65)");
        }
        ThemeKt.ListTheme(false, ComposableLambdaKt.composableLambda(startRestartGroup, 1560160881, true, new ChangelogFragment$ShowContent$1(ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), this)), startRestartGroup, 48, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChangelogFragment$ShowContent$2(this, i));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        InputStream openRawResource = getResources().openRawResource(R.raw.changelog);
        Intrinsics.checkNotNullExpressionValue(openRawResource, "resources.openRawResource(R.raw.changelog)");
        InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            String readText = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            this.changelog = readText;
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setLayout(-1, -2);
            }
            new DialogProperties(true, false, (SecureFlagPolicy) null, 4, (DefaultConstructorMarker) null);
            getBinding().changelogView.setContent(ComposableLambdaKt.composableLambdaInstance(-1977395407, true, new ChangelogFragment$onViewCreated$2(this)));
        } finally {
        }
    }
}
