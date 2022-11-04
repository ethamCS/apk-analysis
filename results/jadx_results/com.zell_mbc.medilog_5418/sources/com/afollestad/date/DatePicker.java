package com.afollestad.date;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.autofill.HintConstants;
import com.afollestad.date.adapters.MonthAdapter;
import com.afollestad.date.adapters.MonthItemAdapter;
import com.afollestad.date.adapters.YearAdapter;
import com.afollestad.date.controllers.DatePickerController;
import com.afollestad.date.controllers.MinMaxController;
import com.afollestad.date.controllers.VibratorController;
import com.afollestad.date.data.DateFormatter;
import com.afollestad.date.data.MonthItem;
import com.afollestad.date.managers.DatePickerLayoutManager;
import com.afollestad.date.renderers.MonthItemRenderer;
import com.afollestad.date.util.AttrsKt;
import com.afollestad.date.util.TypefaceHelper;
import com.afollestad.date.view.DatePickerSavedState;
import java.util.Calendar;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
/* compiled from: DatePicker.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 H2\u00020\u0001:\u0001HB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006JB\u0010\u0019\u001a\u00020\u001a2:\u0010\u001b\u001a6\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u001a0\u001cj\u0002`\"J\u0006\u0010#\u001a\u00020\u001aJ\n\u0010$\u001a\u0004\u0018\u00010\u001dH\u0007J\b\u0010%\u001a\u0004\u0018\u00010\u001dJ\b\u0010&\u001a\u0004\u0018\u00010\u001dJ\b\u0010'\u001a\u00020\u001aH\u0014J+\u0010(\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u001a0)H\u0007J\b\u0010*\u001a\u00020\u001aH\u0014J0\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020/H\u0014J\u0018\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020/2\u0006\u00105\u001a\u00020/H\u0014J\u0012\u00106\u001a\u00020\u001a2\b\u00107\u001a\u0004\u0018\u000108H\u0014J\n\u00109\u001a\u0004\u0018\u000108H\u0014J\u0016\u0010:\u001a\u00020\u001a2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002J\u0018\u0010>\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001d2\b\b\u0002\u0010@\u001a\u00020-J7\u0010>\u001a\u00020\u001a2\n\b\u0003\u0010A\u001a\u0004\u0018\u00010/2\b\b\u0001\u0010B\u001a\u00020/2\n\b\u0003\u0010C\u001a\u0004\u0018\u00010/2\b\b\u0002\u0010@\u001a\u00020-¢\u0006\u0002\u0010DJ\u000e\u0010E\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001dJ$\u0010E\u001a\u00020\u001a2\b\b\u0001\u0010A\u001a\u00020/2\b\b\u0001\u0010B\u001a\u00020/2\b\b\u0001\u0010F\u001a\u00020/J\u000e\u0010G\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001dJ$\u0010G\u001a\u00020\u001a2\b\b\u0001\u0010A\u001a\u00020/2\b\b\u0001\u0010B\u001a\u00020/2\b\b\u0001\u0010F\u001a\u00020/R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/afollestad/date/DatePicker;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "controller", "Lcom/afollestad/date/controllers/DatePickerController;", "getController$com_afollestad_date_picker", "()Lcom/afollestad/date/controllers/DatePickerController;", "layoutManager", "Lcom/afollestad/date/managers/DatePickerLayoutManager;", "minMaxController", "Lcom/afollestad/date/controllers/MinMaxController;", "getMinMaxController$com_afollestad_date_picker", "()Lcom/afollestad/date/controllers/MinMaxController;", "monthAdapter", "Lcom/afollestad/date/adapters/MonthAdapter;", "monthItemAdapter", "Lcom/afollestad/date/adapters/MonthItemAdapter;", "monthItemRenderer", "Lcom/afollestad/date/renderers/MonthItemRenderer;", "yearAdapter", "Lcom/afollestad/date/adapters/YearAdapter;", "addOnDateChanged", "", "block", "Lkotlin/Function2;", "Ljava/util/Calendar;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "previous", "date", "Lcom/afollestad/date/OnDateChanged;", "clearOnDateChanged", "getDate", "getMaxDate", "getMinDate", "onAttachedToWindow", "onDateChanged", "Lkotlin/Function1;", "onFinishInflate", "onLayout", "changed", "", "left", "", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "renderMonthItems", "days", "", "Lcom/afollestad/date/data/MonthItem;", "setDate", "calendar", "notifyListeners", "year", "month", "selectedDate", "(Ljava/lang/Integer;ILjava/lang/Integer;Z)V", "setMaxDate", "dayOfMonth", "setMinDate", "Companion", "com.afollestad.date-picker"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class DatePicker extends ViewGroup {
    @Deprecated
    public static final Companion Companion = new Companion(null);
    public static final long MONTH_MAX = 11;
    public static final long MONTH_MIN = 0;
    private final DatePickerController controller;
    private final DatePickerLayoutManager layoutManager;
    private final MinMaxController minMaxController;
    private final MonthAdapter monthAdapter;
    private final MonthItemAdapter monthItemAdapter;
    private final MonthItemRenderer monthItemRenderer;
    private final YearAdapter yearAdapter;

    /* compiled from: DatePicker.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "p1", "Ljava/util/Calendar;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "currentMonth", "p2", "selectedDate", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.afollestad.date.DatePicker$1 */
    /* loaded from: classes2.dex */
    static final /* synthetic */ class AnonymousClass1 extends FunctionReference implements Function2<Calendar, Calendar, Unit> {
        AnonymousClass1(DatePickerLayoutManager datePickerLayoutManager) {
            super(2, datePickerLayoutManager);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "setHeadersContent";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(DatePickerLayoutManager.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "setHeadersContent(Ljava/util/Calendar;Ljava/util/Calendar;)V";
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Calendar calendar, Calendar calendar2) {
            invoke2(calendar, calendar2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(Calendar p1, Calendar p2) {
            Intrinsics.checkParameterIsNotNull(p1, "p1");
            Intrinsics.checkParameterIsNotNull(p2, "p2");
            ((DatePickerLayoutManager) this.receiver).setHeadersContent(p1, p2);
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.afollestad.date.DatePicker$10 */
    /* loaded from: classes2.dex */
    static final class AnonymousClass10 extends Lambda implements Function1<Integer, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10() {
            super(1);
            DatePicker.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            DatePicker.this.getController$com_afollestad_date_picker().setMonth(i);
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "p1", "", "Lcom/afollestad/date/data/MonthItem;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "days", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.afollestad.date.DatePicker$2 */
    /* loaded from: classes2.dex */
    static final /* synthetic */ class AnonymousClass2 extends FunctionReference implements Function1<List<? extends MonthItem>, Unit> {
        AnonymousClass2(DatePicker datePicker) {
            super(1, datePicker);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "renderMonthItems";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(DatePicker.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "renderMonthItems(Ljava/util/List;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends MonthItem> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(List<? extends MonthItem> p1) {
            Intrinsics.checkParameterIsNotNull(p1, "p1");
            ((DatePicker) this.receiver).renderMonthItems(p1);
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "show", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.afollestad.date.DatePicker$3 */
    /* loaded from: classes2.dex */
    static final /* synthetic */ class AnonymousClass3 extends FunctionReference implements Function1<Boolean, Unit> {
        AnonymousClass3(DatePickerLayoutManager datePickerLayoutManager) {
            super(1, datePickerLayoutManager);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "showOrHideGoPrevious";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(DatePickerLayoutManager.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "showOrHideGoPrevious(Z)V";
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((DatePickerLayoutManager) this.receiver).showOrHideGoPrevious(z);
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "show", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.afollestad.date.DatePicker$4 */
    /* loaded from: classes2.dex */
    static final /* synthetic */ class AnonymousClass4 extends FunctionReference implements Function1<Boolean, Unit> {
        AnonymousClass4(DatePickerLayoutManager datePickerLayoutManager) {
            super(1, datePickerLayoutManager);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "showOrHideGoNext";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(DatePickerLayoutManager.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "showOrHideGoNext(Z)V";
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((DatePickerLayoutManager) this.receiver).showOrHideGoNext(z);
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/afollestad/date/data/MonthItem$DayOfMonth;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.afollestad.date.DatePicker$8 */
    /* loaded from: classes2.dex */
    static final class AnonymousClass8 extends Lambda implements Function1<MonthItem.DayOfMonth, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8() {
            super(1);
            DatePicker.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MonthItem.DayOfMonth dayOfMonth) {
            invoke2(dayOfMonth);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(MonthItem.DayOfMonth it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            DatePicker.this.getController$com_afollestad_date_picker().setDayOfMonth(it.getDate());
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.afollestad.date.DatePicker$9 */
    /* loaded from: classes2.dex */
    static final class AnonymousClass9 extends Lambda implements Function1<Integer, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9() {
            super(1);
            DatePicker.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            DatePicker.this.getController$com_afollestad_date_picker().setYear(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        MinMaxController minMaxController = new MinMaxController();
        this.minMaxController = minMaxController;
        TypedArray ta = context.obtainStyledAttributes(attributeSet, R.styleable.DatePicker);
        try {
            DatePickerLayoutManager.Companion companion = DatePickerLayoutManager.Companion;
            Intrinsics.checkExpressionValueIsNotNull(ta, "ta");
            DatePickerLayoutManager inflateInto = companion.inflateInto(context, ta, this);
            this.layoutManager = inflateInto;
            DatePicker datePicker = this;
            this.controller = new DatePickerController(new VibratorController(context, ta), minMaxController, new AnonymousClass1(inflateInto), new AnonymousClass2(this), new AnonymousClass3(inflateInto), new AnonymousClass4(inflateInto), new AnonymousClass5(), null, 128, null);
            Typeface font = AttrsKt.font(ta, context, R.styleable.DatePicker_date_picker_medium_font, AnonymousClass6.INSTANCE);
            Typeface font2 = AttrsKt.font(ta, context, R.styleable.DatePicker_date_picker_normal_font, AnonymousClass7.INSTANCE);
            MonthItemRenderer monthItemRenderer = new MonthItemRenderer(context, ta, font2, minMaxController);
            this.monthItemRenderer = monthItemRenderer;
            ta.recycle();
            MonthItemAdapter monthItemAdapter = new MonthItemAdapter(monthItemRenderer, new AnonymousClass8());
            this.monthItemAdapter = monthItemAdapter;
            YearAdapter yearAdapter = new YearAdapter(font2, font, inflateInto.getSelectionColor(), new AnonymousClass9());
            this.yearAdapter = yearAdapter;
            MonthAdapter monthAdapter = new MonthAdapter(inflateInto.getSelectionColor(), font2, font, new DateFormatter(), new AnonymousClass10());
            this.monthAdapter = monthAdapter;
            inflateInto.setAdapters(monthItemAdapter, yearAdapter, monthAdapter);
        } catch (Throwable th) {
            ta.recycle();
            throw th;
        }
    }

    public final DatePickerController getController$com_afollestad_date_picker() {
        return this.controller;
    }

    public final MinMaxController getMinMaxController$com_afollestad_date_picker() {
        return this.minMaxController;
    }

    /* compiled from: DatePicker.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.afollestad.date.DatePicker$5 */
    /* loaded from: classes2.dex */
    static final class AnonymousClass5 extends Lambda implements Function0<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5() {
            super(0);
            DatePicker.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final void invoke2() {
            DatePicker.this.layoutManager.setMode(DatePickerLayoutManager.Mode.CALENDAR);
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Typeface;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.afollestad.date.DatePicker$6 */
    /* loaded from: classes2.dex */
    static final class AnonymousClass6 extends Lambda implements Function0<Typeface> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        AnonymousClass6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Typeface invoke() {
            return TypefaceHelper.INSTANCE.create("sans-serif-medium");
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Typeface;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.afollestad.date.DatePicker$7 */
    /* loaded from: classes2.dex */
    static final class AnonymousClass7 extends Lambda implements Function0<Typeface> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Typeface invoke() {
            return TypefaceHelper.INSTANCE.create("sans-serif");
        }
    }

    public static /* synthetic */ void setDate$default(DatePicker datePicker, Calendar calendar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        datePicker.setDate(calendar, z);
    }

    public final void setDate(Calendar calendar, boolean z) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        this.controller.setFullDate(calendar, z);
    }

    public static /* synthetic */ void setDate$default(DatePicker datePicker, Integer num, int i, Integer num2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            num2 = null;
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        datePicker.setDate(num, i, num2, z);
    }

    public final void setDate(Integer num, int i, Integer num2, boolean z) {
        this.controller.setFullDate(num, i, num2, z);
    }

    public final Calendar getDate() {
        return this.controller.getFullDate();
    }

    public final Calendar getMinDate() {
        return this.minMaxController.getMinDate();
    }

    public final void setMinDate(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        this.minMaxController.setMinDate(calendar);
    }

    public final void setMinDate(int i, int i2, int i3) {
        this.minMaxController.setMinDate(i, i2, i3);
    }

    public final Calendar getMaxDate() {
        return this.minMaxController.getMaxDate();
    }

    public final void setMaxDate(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        this.minMaxController.setMaxDate(calendar);
    }

    public final void setMaxDate(int i, int i2, int i3) {
        this.minMaxController.setMaxDate(i, i2, i3);
    }

    @Deprecated(message = "Use addOnDateChanged instead.", replaceWith = @ReplaceWith(expression = "addOnDateChanged(block)", imports = {}))
    public final void onDateChanged(Function1<? super Calendar, Unit> block) {
        Intrinsics.checkParameterIsNotNull(block, "block");
        this.controller.addDateChangedListener(new DatePicker$onDateChanged$1(block));
    }

    public final void addOnDateChanged(Function2<? super Calendar, ? super Calendar, Unit> block) {
        Intrinsics.checkParameterIsNotNull(block, "block");
        this.controller.addDateChangedListener(block);
    }

    public final void clearOnDateChanged() {
        this.controller.clearDateChangedListeners();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.controller.maybeInit();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new DatePickerSavedState(getDate(), super.onSaveInstanceState());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof DatePickerSavedState) {
            DatePickerSavedState datePickerSavedState = (DatePickerSavedState) parcelable;
            super.onRestoreInstanceState(datePickerSavedState.getSuperState());
            Calendar selectedDate = datePickerSavedState.getSelectedDate();
            if (selectedDate == null) {
                return;
            }
            this.controller.setFullDate(selectedDate, false);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.layoutManager.onNavigate(new DatePicker$onFinishInflate$1(this.controller), new DatePicker$onFinishInflate$2(this.controller));
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        DatePickerLayoutManager.Size onMeasure = this.layoutManager.onMeasure(i, i2);
        setMeasuredDimension(onMeasure.component1(), onMeasure.component2());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.layoutManager.onLayout(i, i2, i3);
    }

    public final void renderMonthItems(List<? extends MonthItem> list) {
        for (Object obj : list) {
            if (((MonthItem) obj) instanceof MonthItem.DayOfMonth) {
                if (obj != null) {
                    MonthItem.DayOfMonth dayOfMonth = (MonthItem.DayOfMonth) obj;
                    this.yearAdapter.setSelectedYear(Integer.valueOf(dayOfMonth.getMonth().getYear()));
                    Integer selectedPosition = this.yearAdapter.getSelectedPosition();
                    if (selectedPosition != null) {
                        this.layoutManager.scrollToYearPosition(selectedPosition.intValue());
                    }
                    this.monthAdapter.setSelectedMonth(Integer.valueOf(dayOfMonth.getMonth().getMonth()));
                    Integer selectedMonth = this.monthAdapter.getSelectedMonth();
                    if (selectedMonth != null) {
                        this.layoutManager.scrollToMonthPosition(selectedMonth.intValue());
                    }
                    this.monthItemAdapter.setItems(list);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.afollestad.date.data.MonthItem.DayOfMonth");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* compiled from: DatePicker.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/afollestad/date/DatePicker$Companion;", "", "()V", "MONTH_MAX", "", "MONTH_MIN", "com.afollestad.date-picker"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
