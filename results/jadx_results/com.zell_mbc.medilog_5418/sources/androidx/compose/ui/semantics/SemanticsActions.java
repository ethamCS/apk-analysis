package androidx.compose.ui.semantics;

import androidx.autofill.HintConstants;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R#\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR#\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR#\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR/\u0010\u0016\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00070\u00170\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\tR#\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\tR#\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\tR#\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\tR#\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\tRM\u0010#\u001a>\u0012:\u00128\u00124\u00122\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00070$0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\tR)\u0010+\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00070\u00170\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\tR8\u0010.\u001a)\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00070\u00170\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\tR5\u00101\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\tR)\u00104\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00070\u00170\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\t¨\u00067"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsActions;", "", "()V", "Collapse", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function0;", "", "getCollapse", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "CopyText", "getCopyText", "CustomActions", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "getCustomActions", "CutText", "getCutText", "Dismiss", "getDismiss", "Expand", "getExpand", "GetTextLayoutResult", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "getGetTextLayoutResult", "OnClick", "getOnClick", "OnLongClick", "getOnLongClick", "PasteText", "getPasteText", "RequestFocus", "getRequestFocus", "ScrollBy", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "x", "y", "getScrollBy", "ScrollToIndex", "", "getScrollToIndex", "SetProgress", "progress", "getSetProgress", "SetSelection", "Lkotlin/Function3;", "getSetSelection", "SetText", "Landroidx/compose/ui/text/AnnotatedString;", "getSetText", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsActions {
    public static final int $stable = 0;
    public static final SemanticsActions INSTANCE = new SemanticsActions();
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult = new SemanticsPropertyKey<>("GetTextLayoutResult", SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnClick = new SemanticsPropertyKey<>("OnClick", SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnLongClick = new SemanticsPropertyKey<>("OnLongClick", SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function2<Float, Float, Boolean>>> ScrollBy = new SemanticsPropertyKey<>("ScrollBy", SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> ScrollToIndex = new SemanticsPropertyKey<>("ScrollToIndex", SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> SetProgress = new SemanticsPropertyKey<>("SetProgress", SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function3<Integer, Integer, Boolean, Boolean>>> SetSelection = new SemanticsPropertyKey<>("SetSelection", SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> SetText = new SemanticsPropertyKey<>("SetText", SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> CopyText = new SemanticsPropertyKey<>("CopyText", SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> CutText = new SemanticsPropertyKey<>("CutText", SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PasteText = new SemanticsPropertyKey<>("PasteText", SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Expand = new SemanticsPropertyKey<>("Expand", SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Collapse = new SemanticsPropertyKey<>("Collapse", SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Dismiss = new SemanticsPropertyKey<>("Dismiss", SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> RequestFocus = new SemanticsPropertyKey<>("RequestFocus", SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions = new SemanticsPropertyKey<>("CustomActions", null, 2, null);

    private SemanticsActions() {
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getOnClick() {
        return OnClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getOnLongClick() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function2<Float, Float, Boolean>>> getScrollBy() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> getScrollToIndex() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> getSetProgress() {
        return SetProgress;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function3<Integer, Integer, Boolean, Boolean>>> getSetSelection() {
        return SetSelection;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> getSetText() {
        return SetText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getCopyText() {
        return CopyText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getCutText() {
        return CutText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPasteText() {
        return PasteText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getExpand() {
        return Expand;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getCollapse() {
        return Collapse;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getDismiss() {
        return Dismiss;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getRequestFocus() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }
}