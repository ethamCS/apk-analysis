package com.zell_mbc.medilog.data;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zell_mbc.medilog.MainActivity;
import com.zell_mbc.medilog.R;
import com.zell_mbc.medilog.settings.SettingsActivity;
import com.zell_mbc.medilog.utility.Preferences;
import com.zell_mbc.medilog.utility.UserOutputService;
import com.zell_mbc.medilog.utility.UserOutputServiceImpl;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TabFragment.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010bJ\u0017\u0010c\u001a\u00020`2\b\b\u0002\u0010H\u001a\u00020(H\u0007¢\u0006\u0002\u0010dJ@\u0010e\u001a\u00020`2\u0006\u0010f\u001a\u0002012&\u0010g\u001a\"\u0012\u0013\u0012\u00110\u0012¢\u0006\f\bi\u0012\b\bj\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020`0h¢\u0006\u0002\blH\u0007ø\u0001\u0000¢\u0006\u0002\u0010mJ\b\u0010n\u001a\u00020`H&J\u001e\u0010o\u001a\u00020`2\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020q2\u0006\u0010s\u001a\u00020qJ\u000e\u0010t\u001a\u00020`2\u0006\u0010u\u001a\u00020\u0004J\u000e\u0010v\u001a\u00020`2\u0006\u0010w\u001a\u00020xJ\b\u0010y\u001a\u00020`H\u0016J\u001a\u0010z\u001a\u00020`2\u0006\u0010w\u001a\u00020x2\b\u0010{\u001a\u0004\u0018\u00010|H\u0016J\u001a\u0010}\u001a\u00020`2\u0006\u0010~\u001a\u00020q2\b\b\u0002\u0010\u007f\u001a\u00020(H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\u0010R%\u0010\u0011\u001a\u00020\u0012X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u001e\u0010!\u001a\u0006\u0012\u0002\b\u00030\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\fR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\u0010R\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u0006\u0012\u0002\b\u00030\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\n\"\u0004\b/\u0010\fR\u001a\u00100\u001a\u000201X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u000207X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u0016R\u001a\u0010:\u001a\u00020;X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010*\"\u0004\bB\u0010,R\u001a\u0010C\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0006\"\u0004\bE\u0010\u0010R\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020(0GX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010H\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010*\"\u0004\bJ\u0010,R\u0019\u0010K\u001a\n \u001a*\u0004\u0018\u00010\u00190\u0019¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\u001cR\u001a\u0010M\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0006\"\u0004\bO\u0010\u0010R\u001a\u0010P\u001a\u000207X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0014\"\u0004\bR\u0010\u0016R\u001a\u0010S\u001a\u00020TX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010Y\u001a\u00020ZX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0080\u0001"}, d2 = {"Lcom/zell_mbc/medilog/data/TabFragment;", "Landroidx/fragment/app/Fragment;", "()V", "cellPadding", "", "getCellPadding", "()I", "chartActivityClass", "Ljava/lang/Class;", "getChartActivityClass", "()Ljava/lang/Class;", "setChartActivityClass", "(Ljava/lang/Class;)V", "commentButtonWidth", "getCommentButtonWidth", "setCommentButtonWidth", "(I)V", "dateColumnWidth", "Landroidx/compose/ui/unit/Dp;", "getDateColumnWidth-D9Ej5fM", "()F", "setDateColumnWidth-0680j_4", "(F)V", "F", "dateFormat", "Ljava/text/DateFormat;", "kotlin.jvm.PlatformType", "getDateFormat", "()Ljava/text/DateFormat;", "setDateFormat", "(Ljava/text/DateFormat;)V", "dividerWidth", "getDividerWidth", "editActivityClass", "getEditActivityClass", "setEditActivityClass", "fontSize", "getFontSize", "setFontSize", "highlightValues", "", "getHighlightValues", "()Z", "setHighlightValues", "(Z)V", "infoActivityClass", "getInfoActivityClass", "setInfoActivityClass", "itemUnit", "", "getItemUnit", "()Ljava/lang/String;", "setItemUnit", "(Ljava/lang/String;)V", "lowerThreshold", "", "getLowerThreshold", "setLowerThreshold", "preferences", "Landroid/content/SharedPreferences;", "getPreferences", "()Landroid/content/SharedPreferences;", "setPreferences", "(Landroid/content/SharedPreferences;)V", SettingsActivity.KEY_PREF_QUICKENTRY, "getQuickEntry", "setQuickEntry", "rowPadding", "getRowPadding", "setRowPadding", "showDialog", "Landroidx/compose/runtime/MutableState;", "showTime", "getShowTime", "setShowTime", "timeFormat", "getTimeFormat", "topPadding", "getTopPadding", "setTopPadding", "upperThreshold", "getUpperThreshold", "setUpperThreshold", "userOutputService", "Lcom/zell_mbc/medilog/utility/UserOutputService;", "getUserOutputService", "()Lcom/zell_mbc/medilog/utility/UserOutputService;", "setUserOutputService", "(Lcom/zell_mbc/medilog/utility/UserOutputService;)V", "viewModel", "Lcom/zell_mbc/medilog/data/ViewModel;", "getViewModel", "()Lcom/zell_mbc/medilog/data/ViewModel;", "setViewModel", "(Lcom/zell_mbc/medilog/data/ViewModel;)V", "ItemClicked", "", "selectedItem", "(ILandroidx/compose/runtime/Composer;I)V", "MeasureDateString", "(ZLandroidx/compose/runtime/Composer;II)V", "MeasureTextWidth", "sampleText", "content", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "width", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "addItem", "configureButtons", "buttonAdd", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "buttonInfo", "buttonChart", "editItem", "index", "initializeService", "view", "Landroid/view/View;", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setColourStyle", "v", "light", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class TabFragment extends Fragment {
    public static final int $stable = 8;
    public Class<?> chartActivityClass;
    public Class<?> editActivityClass;
    private int fontSize;
    private boolean highlightValues;
    public Class<?> infoActivityClass;
    private float lowerThreshold;
    public SharedPreferences preferences;
    private MutableState<Boolean> showDialog;
    private int topPadding;
    private float upperThreshold;
    public UserOutputService userOutputService;
    public ViewModel viewModel;
    private boolean quickEntry = true;
    private final int cellPadding = 5;
    private int rowPadding = 1;
    private final int dividerWidth = 1;
    private DateFormat dateFormat = DateFormat.getDateInstance(3, Locale.getDefault());
    private final DateFormat timeFormat = DateFormat.getTimeInstance(3, Locale.getDefault());
    private boolean showTime = true;
    private float dateColumnWidth = Dp.m4106constructorimpl(0);
    private String itemUnit = "";
    private int commentButtonWidth = 40;

    public abstract void addItem();

    public TabFragment() {
        MutableState<Boolean> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.showDialog = mutableStateOf$default;
    }

    public final UserOutputService getUserOutputService() {
        UserOutputService userOutputService = this.userOutputService;
        if (userOutputService != null) {
            return userOutputService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userOutputService");
        return null;
    }

    public final void setUserOutputService(UserOutputService userOutputService) {
        Intrinsics.checkNotNullParameter(userOutputService, "<set-?>");
        this.userOutputService = userOutputService;
    }

    public final ViewModel getViewModel() {
        ViewModel viewModel = this.viewModel;
        if (viewModel != null) {
            return viewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void setViewModel(ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "<set-?>");
        this.viewModel = viewModel;
    }

    public final boolean getQuickEntry() {
        return this.quickEntry;
    }

    public final void setQuickEntry(boolean z) {
        this.quickEntry = z;
    }

    public final int getTopPadding() {
        return this.topPadding;
    }

    public final void setTopPadding(int i) {
        this.topPadding = i;
    }

    public final int getCellPadding() {
        return this.cellPadding;
    }

    public final int getRowPadding() {
        return this.rowPadding;
    }

    public final void setRowPadding(int i) {
        this.rowPadding = i;
    }

    public final int getDividerWidth() {
        return this.dividerWidth;
    }

    public final DateFormat getDateFormat() {
        return this.dateFormat;
    }

    public final void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public final DateFormat getTimeFormat() {
        return this.timeFormat;
    }

    public final boolean getHighlightValues() {
        return this.highlightValues;
    }

    public final void setHighlightValues(boolean z) {
        this.highlightValues = z;
    }

    public final boolean getShowTime() {
        return this.showTime;
    }

    public final void setShowTime(boolean z) {
        this.showTime = z;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final void setFontSize(int i) {
        this.fontSize = i;
    }

    /* renamed from: getDateColumnWidth-D9Ej5fM */
    public final float m4562getDateColumnWidthD9Ej5fM() {
        return this.dateColumnWidth;
    }

    /* renamed from: setDateColumnWidth-0680j_4 */
    public final void m4563setDateColumnWidth0680j_4(float f) {
        this.dateColumnWidth = f;
    }

    public final String getItemUnit() {
        return this.itemUnit;
    }

    public final void setItemUnit(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.itemUnit = str;
    }

    public final float getLowerThreshold() {
        return this.lowerThreshold;
    }

    public final void setLowerThreshold(float f) {
        this.lowerThreshold = f;
    }

    public final float getUpperThreshold() {
        return this.upperThreshold;
    }

    public final void setUpperThreshold(float f) {
        this.upperThreshold = f;
    }

    public final int getCommentButtonWidth() {
        return this.commentButtonWidth;
    }

    public final void setCommentButtonWidth(int i) {
        this.commentButtonWidth = i;
    }

    public final SharedPreferences getPreferences() {
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("preferences");
        return null;
    }

    public final void setPreferences(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.preferences = sharedPreferences;
    }

    public final Class<?> getEditActivityClass() {
        Class<?> cls = this.editActivityClass;
        if (cls != null) {
            return cls;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editActivityClass");
        return null;
    }

    public final void setEditActivityClass(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<set-?>");
        this.editActivityClass = cls;
    }

    public final Class<?> getInfoActivityClass() {
        Class<?> cls = this.infoActivityClass;
        if (cls != null) {
            return cls;
        }
        Intrinsics.throwUninitializedPropertyAccessException("infoActivityClass");
        return null;
    }

    public final void setInfoActivityClass(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<set-?>");
        this.infoActivityClass = cls;
    }

    public final Class<?> getChartActivityClass() {
        Class<?> cls = this.chartActivityClass;
        if (cls != null) {
            return cls;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chartActivityClass");
        return null;
    }

    public final void setChartActivityClass(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<set-?>");
        this.chartActivityClass = cls;
    }

    public final void editItem(int i) {
        getViewModel().setEditItemIndex(i);
        startActivity(new Intent(requireContext(), getEditActivityClass()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (MainActivity.Companion.getUserFeedbackLevel() <= 0 || DateUtils.isToday(getPreferences().getLong("LAST_FEEDBACK_RUN", 0L))) {
            return;
        }
        MainActivity.Companion.userFeedback(requireContext());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(view, "view");
        Preferences.SingletonFactory singletonFactory = Preferences.SingletonFactory;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        setPreferences(singletonFactory.getSharedPreferences(requireContext));
        this.quickEntry = getPreferences().getBoolean(SettingsActivity.KEY_PREF_QUICKENTRY, true);
        boolean z = false;
        Locale locale = Build.VERSION.SDK_INT >= 24 ? getResources().getConfiguration().getLocales().get(0) : getResources().getConfiguration().locale;
        if (Intrinsics.areEqual(locale.getLanguage(), "en") && Intrinsics.areEqual(locale.getCountry(), "DE")) {
            this.dateFormat = DateFormat.getDateInstance(3, Locale.GERMANY);
        }
        String string = getString(R.string.TEXT_SIZE_DEFAULT);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.TEXT_SIZE_DEFAULT)");
        this.fontSize = Integer.parseInt(string);
        SharedPreferences preferences = getPreferences();
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        String string2 = preferences.getString(SettingsActivity.KEY_PREF_TEXT_SIZE, ((Activity) context).getString(R.string.TEXT_SIZE_DEFAULT));
        String str = string2;
        if (!(str == null || str.length() == 0)) {
            try {
                i = Integer.parseInt(string2);
            } catch (NumberFormatException unused) {
                String string3 = getString(R.string.TEXT_SIZE_DEFAULT);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.TEXT_SIZE_DEFAULT)");
                i = Integer.parseInt(string3);
                Context context2 = getContext();
                Toast.makeText(context2, "Invalid Font Size value: " + string2, 1).show();
            }
            if (i > 0) {
                this.fontSize = i;
            }
        }
        String string4 = getString(R.string.ROW_PADDING_DEFAULT);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.ROW_PADDING_DEFAULT)");
        this.rowPadding = Integer.parseInt(string4);
        String string5 = getPreferences().getString(SettingsActivity.KEY_PREF_ROW_PADDING, getString(R.string.ROW_PADDING_DEFAULT));
        String str2 = string5;
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (!z) {
            try {
                i2 = Integer.parseInt(string5);
            } catch (NumberFormatException unused2) {
                String string6 = getString(R.string.ROW_PADDING_DEFAULT);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.ROW_PADDING_DEFAULT)");
                i2 = Integer.parseInt(string6);
                Context context3 = getContext();
                Toast.makeText(context3, "Invalid Row Padding value: " + string5, 1).show();
            }
            if (i2 <= 0) {
                return;
            }
            this.rowPadding = i2;
        }
    }

    public final void initializeService(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        setUserOutputService(new UserOutputServiceImpl(requireContext, view));
    }

    public final void MeasureDateString(boolean z, Composer composer, int i, int i2) {
        String sampleString;
        Composer startRestartGroup = composer.startRestartGroup(895659035);
        ComposerKt.sourceInformation(startRestartGroup, "C(MeasureDateString)");
        if ((i2 & 1) != 0) {
            z = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(895659035, i, -1, "com.zell_mbc.medilog.data.TabFragment.MeasureDateString (TabFragment.kt:131)");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 11, 17, 23, 5);
        long timeInMillis = calendar.getTimeInMillis();
        if (z) {
            sampleString = this.dateFormat.format(Long.valueOf(timeInMillis)) + " - " + this.timeFormat.format(Long.valueOf(timeInMillis));
        } else {
            sampleString = this.dateFormat.format(Long.valueOf(timeInMillis));
        }
        Intrinsics.checkNotNullExpressionValue(sampleString, "sampleString");
        MeasureTextWidth(sampleString, ComposableLambdaKt.composableLambda(startRestartGroup, 1447833662, true, new TabFragment$MeasureDateString$1(this)), startRestartGroup, 560);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TabFragment$MeasureDateString$2(this, z, i, i2));
    }

    public final void MeasureTextWidth(String sampleText, Function3<? super Dp, ? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(sampleText, "sampleText");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1466381075);
        ComposerKt.sourceInformation(startRestartGroup, "C(MeasureTextWidth)P(1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1466381075, i, -1, "com.zell_mbc.medilog.data.TabFragment.MeasureTextWidth (TabFragment.kt:146)");
        }
        SubcomposeLayoutKt.SubcomposeLayout(null, new TabFragment$MeasureTextWidth$1(sampleText, this, i, content), startRestartGroup, 0, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TabFragment$MeasureTextWidth$2(this, sampleText, content, i));
    }

    public final void ItemClicked(int i, Composer composer, int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-372927395);
        ComposerKt.sourceInformation(startRestartGroup, "C(ItemClicked)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-372927395, i2, -1, "com.zell_mbc.medilog.data.TabFragment.ItemClicked (TabFragment.kt:162)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            editItem(i);
            this.showDialog.setValue(false);
            mutableState.setValue(false);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TabFragment$ItemClicked$1(this, i, i2));
    }

    static /* synthetic */ void setColourStyle$default(TabFragment tabFragment, FloatingActionButton floatingActionButton, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            tabFragment.setColourStyle(floatingActionButton, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setColourStyle");
    }

    private final void setColourStyle(FloatingActionButton floatingActionButton, boolean z) {
        Preferences.SingletonFactory singletonFactory = Preferences.SingletonFactory;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        String string = singletonFactory.getSharedPreferences(requireContext).getString(SettingsActivity.KEY_PREF_COLOUR_STYLE, getString(R.string.blue));
        if (z) {
            if (Intrinsics.areEqual(string, getString(R.string.green))) {
                floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorLightGreen)));
            } else if (Intrinsics.areEqual(string, getString(R.string.red))) {
                floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorLightRed)));
            } else if (Intrinsics.areEqual(string, getString(R.string.gray))) {
                floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorLightGray)));
            } else {
                floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorLightBlue)));
            }
        } else if (Intrinsics.areEqual(string, getString(R.string.green))) {
            floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorPrimaryGreen)));
        } else if (Intrinsics.areEqual(string, getString(R.string.red))) {
            floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorPrimaryRed)));
        } else if (Intrinsics.areEqual(string, getString(R.string.gray))) {
            floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorPrimaryGray)));
        } else {
            floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorPrimaryBlue)));
        }
        floatingActionButton.setColorFilter(-1);
    }

    /* renamed from: configureButtons$lambda-1 */
    public static final void m4559configureButtons$lambda1(TabFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.addItem();
    }

    public final void configureButtons(FloatingActionButton buttonAdd, FloatingActionButton buttonInfo, FloatingActionButton buttonChart) {
        Intrinsics.checkNotNullParameter(buttonAdd, "buttonAdd");
        Intrinsics.checkNotNullParameter(buttonInfo, "buttonInfo");
        Intrinsics.checkNotNullParameter(buttonChart, "buttonChart");
        buttonAdd.setOnClickListener(new View.OnClickListener() { // from class: com.zell_mbc.medilog.data.TabFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TabFragment.m4559configureButtons$lambda1(TabFragment.this, view);
            }
        });
        setColourStyle(buttonAdd, false);
        if (this.quickEntry) {
            buttonAdd.setVisibility(8);
        }
        setColourStyle(buttonInfo, true);
        setColourStyle(buttonChart, true);
        buttonInfo.setOnClickListener(new View.OnClickListener() { // from class: com.zell_mbc.medilog.data.TabFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TabFragment.m4560configureButtons$lambda2(TabFragment.this, view);
            }
        });
        buttonChart.setOnClickListener(new View.OnClickListener() { // from class: com.zell_mbc.medilog.data.TabFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TabFragment.m4561configureButtons$lambda3(TabFragment.this, view);
            }
        });
    }

    /* renamed from: configureButtons$lambda-2 */
    public static final void m4560configureButtons$lambda2(TabFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getContext() == null) {
            return;
        }
        if (this$0.getViewModel().getSize(true) == 0) {
            UserOutputService userOutputService = this$0.getUserOutputService();
            String string = this$0.getString(R.string.emptyTable);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.emptyTable)");
            userOutputService.showMessageAndWaitForLong(string);
            return;
        }
        this$0.startActivity(new Intent(this$0.requireContext(), this$0.getInfoActivityClass()));
    }

    /* renamed from: configureButtons$lambda-3 */
    public static final void m4561configureButtons$lambda3(TabFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getContext() == null) {
            return;
        }
        if (this$0.getViewModel().getSize(true) < 2) {
            UserOutputService userOutputService = this$0.getUserOutputService();
            String string = this$0.requireContext().getString(R.string.notEnoughDataForChart);
            Intrinsics.checkNotNullExpressionValue(string, "requireContext().getStri…ng.notEnoughDataForChart)");
            userOutputService.showMessageAndWaitForLong(string);
            return;
        }
        this$0.startActivity(new Intent(this$0.requireContext(), this$0.getChartActivityClass()));
    }
}
