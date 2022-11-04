package com.zell_mbc.medilog.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.zell_mbc.medilog.MainActivity;
import com.zell_mbc.medilog.R;
import com.zell_mbc.medilog.databinding.ActivityAboutBinding;
import com.zell_mbc.medilog.utility.Preferences;
import com.zell_mbc.medilog.utility.ThemeKt;
import java.text.DateFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
/* compiled from: UserFeedbackFragment.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u001a\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/zell_mbc/medilog/settings/UserFeedbackFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/zell_mbc/medilog/databinding/ActivityAboutBinding;", "binding", "getBinding", "()Lcom/zell_mbc/medilog/databinding/ActivityAboutBinding;", "ShowContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class UserFeedbackFragment extends Fragment {
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

    /* JADX WARN: Type inference failed for: r0v28, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v31, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    public final void ShowContent(Composer composer, int i) {
        String str;
        Composer startRestartGroup = composer.startRestartGroup(139815011);
        ComposerKt.sourceInformation(startRestartGroup, "C(ShowContent)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139815011, i, -1, "com.zell_mbc.medilog.settings.UserFeedbackFragment.ShowContent (UserFeedbackFragment.kt:56)");
        }
        Preferences.SingletonFactory singletonFactory = Preferences.SingletonFactory;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        SharedPreferences sharedPreferences = singletonFactory.getSharedPreferences(requireContext);
        ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
        MainActivity.Companion companion = MainActivity.Companion;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(String.valueOf(sharedPreferences.getString("USER_FEEDBACK_STRING", getString(R.string.nothing))), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        companion.setFeedbackString((MutableState) rememberedValue);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = MainActivity.Companion.getFeedbackString().getValue();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "";
        if (StringsKt.contains$default((CharSequence) objectRef.element, (CharSequence) ":", false, 2, (Object) null)) {
            ?? substring = ((String) objectRef.element).substring(StringsKt.indexOf$default((CharSequence) objectRef.element, ":", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            objectRef2.element = substring;
            ?? substring2 = ((String) objectRef.element).substring(0, StringsKt.indexOf$default((CharSequence) objectRef.element, ":", 0, false, 6, (Object) null) - 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            objectRef.element = substring2;
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue2;
        mutableState.setValue(Boolean.valueOf(MainActivity.Companion.getUserFeedbackLevel() > 0));
        long j = sharedPreferences.getLong("LAST_FEEDBACK_RUN", 0L);
        if (j > 0) {
            str = DateFormat.getDateInstance(3).format(Long.valueOf(j)) + " - " + DateFormat.getTimeInstance().format(Long.valueOf(j));
        } else {
            str = getString(R.string.never);
            Intrinsics.checkNotNullExpressionValue(str, "getString(R.string.never)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue3;
        if (((CharSequence) mutableState2.getValue()).length() == 0) {
            String string = getString(R.string.never);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.never)");
            mutableState2.setValue(string);
        }
        ThemeKt.ListTheme(false, ComposableLambdaKt.composableLambda(startRestartGroup, -1374162974, true, new UserFeedbackFragment$ShowContent$2(rememberScrollState, this, mutableState2, objectRef, objectRef2, mutableState, sharedPreferences)), startRestartGroup, 48, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new UserFeedbackFragment$ShowContent$3(this, i));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        getBinding().aboutView.setContent(ComposableLambdaKt.composableLambdaInstance(-102044894, true, new UserFeedbackFragment$onViewCreated$1(this)));
    }
}
