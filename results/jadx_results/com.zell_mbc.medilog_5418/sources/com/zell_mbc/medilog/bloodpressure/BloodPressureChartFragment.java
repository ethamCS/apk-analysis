package com.zell_mbc.medilog.bloodpressure;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.androidplot.ui.Anchor;
import com.androidplot.ui.DynamicTableModel;
import com.androidplot.ui.HorizontalPositioning;
import com.androidplot.ui.SizeMode;
import com.androidplot.ui.TableOrder;
import com.androidplot.ui.VerticalPositioning;
import com.androidplot.util.PixelUtils;
import com.androidplot.xy.BarFormatter;
import com.androidplot.xy.BoundaryMode;
import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.PanZoom;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.StepMode;
import com.androidplot.xy.XYGraphWidget;
import com.androidplot.xy.XYLegendItem;
import com.androidplot.xy.XYPlot;
import com.zell_mbc.medilog.R;
import com.zell_mbc.medilog.data.Data;
import com.zell_mbc.medilog.data.ViewModel;
import com.zell_mbc.medilog.settings.SettingsActivity;
import com.zell_mbc.medilog.utility.Preferences;
import com.zell_mbc.medilog.utility.ThemeUtilKt;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
/* compiled from: BloodPressureChartFragment.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J$\u0010\u0017\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/zell_mbc/medilog/bloodpressure/BloodPressureChartFragment;", "Landroidx/fragment/app/Fragment;", "()V", "dia", "Ljava/util/ArrayList;", "", "diaBand1", "diaBand2", "diaBand3", "diaLinearTrend", "diaSMATrend", TypedValues.CycleType.S_WAVE_PERIOD, "", NotificationCompat.CATEGORY_SYSTEM, "sysBand1", "sysBand2", "sysBand3", "sysLinearTrend", "sysSMATrend", "calculateLinearTrendLine", "", "source", TypedValues.AttributesType.S_TARGET, "calculateMovingAverage", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BloodPressureChartFragment extends Fragment {
    public static final int $stable = 8;
    private ArrayList<Float> sysBand1 = new ArrayList<>();
    private ArrayList<Float> sysBand2 = new ArrayList<>();
    private ArrayList<Float> sysBand3 = new ArrayList<>();
    private ArrayList<Float> sys = new ArrayList<>();
    private ArrayList<Float> diaBand1 = new ArrayList<>();
    private ArrayList<Float> diaBand2 = new ArrayList<>();
    private ArrayList<Float> diaBand3 = new ArrayList<>();
    private ArrayList<Float> dia = new ArrayList<>();
    private ArrayList<Float> sysLinearTrend = new ArrayList<>();
    private ArrayList<Float> diaLinearTrend = new ArrayList<>();
    private ArrayList<Float> sysSMATrend = new ArrayList<>();
    private ArrayList<Float> diaSMATrend = new ArrayList<>();
    private int period = 5;

    /* renamed from: onViewCreated$lambda-0 */
    public static final int m4460onViewCreated$lambda0(XYLegendItem xYLegendItem, XYLegendItem xYLegendItem2) {
        return 0;
    }

    private final void calculateMovingAverage(ArrayList<Float> arrayList, ArrayList<Float> arrayList2) {
        int i = this.period;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        int size = arrayList.size();
        int i3 = this.period;
        for (int i4 = 0; i4 < i3; i4++) {
            Float f = arrayList.get(0);
            Intrinsics.checkNotNullExpressionValue(f, "source[0]");
            fArr[i4] = f;
        }
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = this.period - 2;
            if (i6 >= 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    fArr[i7] = fArr[i8];
                    if (i7 == i6) {
                        break;
                    }
                    i7 = i8;
                }
            }
            Float f2 = arrayList.get(i5);
            Intrinsics.checkNotNullExpressionValue(f2, "source[i]");
            fArr[this.period - 1] = f2;
            int i9 = this.period;
            float f3 = 0.0f;
            for (int i10 = 0; i10 < i9; i10++) {
                f3 += fArr[i10].floatValue();
            }
            arrayList2.add(Float.valueOf(f3 / this.period));
        }
    }

    private final void calculateLinearTrendLine(ArrayList<Float> arrayList, ArrayList<Float> arrayList2) {
        int size = arrayList.size();
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        if (1 <= size) {
            int i4 = 1;
            while (true) {
                int i5 = i4 - 1;
                Float f3 = arrayList.get(i5);
                Intrinsics.checkNotNullExpressionValue(f3, "source[i - 1]");
                f += i4 * f3.floatValue();
                i += i4;
                Float f4 = arrayList.get(i5);
                Intrinsics.checkNotNullExpressionValue(f4, "source[i - 1]");
                f2 += f4.floatValue();
                i3 += i4 * i4;
                if (i4 == size) {
                    break;
                }
                i4++;
            }
        }
        float f5 = size;
        float f6 = i;
        float f7 = ((f * f5) - (f6 * f2)) / ((i3 * size) - (f6 * f6));
        float f8 = (f2 - (f6 * f7)) / f5;
        if (1 <= size) {
            while (true) {
                arrayList2.add(Float.valueOf((i2 * f7) + f8));
                if (i2 == size) {
                    return;
                }
                i2++;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.bloodpressure_chart, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        Iterator<Data> it;
        float f;
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = getContext();
        if (context == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Preferences.SingletonFactory singletonFactory = Preferences.SingletonFactory;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        SharedPreferences sharedPreferences = singletonFactory.getSharedPreferences(requireContext);
        boolean z = sharedPreferences.getBoolean(SettingsActivity.KEY_PREF_bpDayStepping, false);
        boolean z2 = sharedPreferences.getBoolean(SettingsActivity.KEY_PREF_bpBarChart, false);
        boolean z3 = sharedPreferences.getBoolean(SettingsActivity.KEY_PREF_SHOWPULSE, true);
        boolean z4 = sharedPreferences.getBoolean(SettingsActivity.KEY_PREF_showBloodPressureGrid, true);
        boolean z5 = sharedPreferences.getBoolean(SettingsActivity.KEY_PREF_showBloodPressureLegend, false);
        boolean z6 = sharedPreferences.getBoolean(SettingsActivity.KEY_PREF_BLOODPRESSURE_SHOW_VALUES, true);
        boolean z7 = sharedPreferences.getBoolean(SettingsActivity.KEY_PREF_BLOODPRESSURE_LINEAR_TRENDLINE, false);
        boolean z8 = sharedPreferences.getBoolean(SettingsActivity.KEY_PREF_BLOODPRESSURE_MOVING_AVERAGE_TRENDLINE, false);
        if (!z6 && !z7 && !z8) {
            z8 = true;
        }
        Calendar calendar = Calendar.getInstance();
        boolean z9 = z8;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd");
        BloodPressureViewModel bloodPressureViewModel = (BloodPressureViewModel) new ViewModelProvider(this).get(BloodPressureViewModel.class);
        ViewModel.init$default(bloodPressureViewModel, 2, false, 2, null);
        Iterator<Data> it2 = bloodPressureViewModel.getItems("ASC", true).iterator();
        float f4 = 1000.0f;
        float f5 = 0.0f;
        while (it2.hasNext()) {
            Data next = it2.next();
            String format = simpleDateFormat.format(Long.valueOf(next.getTimestamp()));
            Intrinsics.checkNotNullExpressionValue(format, "simpleDate.format(bpI.timestamp)");
            if (z) {
                try {
                    Date parse = simpleDateFormat.parse(format);
                    if (parse != null) {
                        while (arrayList.size() > 0 && parse.compareTo(calendar.getTime()) > 0) {
                            format = simpleDateFormat.format(calendar.getTime());
                            Intrinsics.checkNotNullExpressionValue(format, "simpleDate.format(lastDate.time)");
                            arrayList.add(format);
                            Iterator<Data> it3 = it2;
                            this.sys.add(Float.valueOf(0.0f));
                            this.dia.add(Float.valueOf(0.0f));
                            if (z3) {
                                arrayList2.add(Float.valueOf(0.0f));
                            }
                            calendar.add(5, 1);
                            it2 = it3;
                        }
                    }
                    it = it2;
                    if (parse != null) {
                        calendar.setTime(parse);
                    }
                } catch (ParseException unused) {
                    it = it2;
                }
            } else {
                it = it2;
            }
            arrayList.add(format);
            try {
                f = Float.parseFloat(next.getValue1());
            } catch (NumberFormatException unused2) {
                f = 0.0f;
            }
            this.sys.add(Float.valueOf(f));
            if (f > f5) {
                f5 = f;
            }
            try {
                f2 = Float.parseFloat(next.getValue2());
            } catch (NumberFormatException unused3) {
                f2 = 0.0f;
            }
            this.dia.add(Float.valueOf(f2));
            if (f2 < f4) {
                f4 = f2;
            }
            if (z3) {
                try {
                    f3 = Float.parseFloat(next.getValue3());
                } catch (NumberFormatException unused4) {
                    f3 = 0.0f;
                }
                arrayList2.add(Float.valueOf(f3));
                if (f3 < f4) {
                    f4 = f3;
                }
            }
            it2 = it;
        }
        if (this.sys.size() == 0) {
            return;
        }
        boolean z10 = sharedPreferences.getBoolean(SettingsActivity.KEY_PREF_showBloodPressureThreshold, false);
        if (z10) {
            BloodPressureHelper bloodPressureHelper = new BloodPressureHelper(context);
            float hyperGrade1Sys = bloodPressureHelper.getHyperGrade1Sys();
            float hyperGrade2Sys = bloodPressureHelper.getHyperGrade2Sys();
            float hyperGrade3Sys = bloodPressureHelper.getHyperGrade3Sys();
            float hyperGrade1Dia = bloodPressureHelper.getHyperGrade1Dia();
            float hyperGrade2Dia = bloodPressureHelper.getHyperGrade2Dia();
            float hyperGrade3Dia = bloodPressureHelper.getHyperGrade3Dia();
            Iterator<Float> it4 = this.sys.iterator();
            while (it4.hasNext()) {
                it4.next();
                this.sysBand1.add(Float.valueOf(hyperGrade1Sys));
                this.sysBand2.add(Float.valueOf(hyperGrade2Sys));
                this.sysBand3.add(Float.valueOf(hyperGrade3Sys));
                this.diaBand1.add(Float.valueOf(hyperGrade1Dia));
                this.diaBand2.add(Float.valueOf(hyperGrade2Dia));
                this.diaBand3.add(Float.valueOf(hyperGrade3Dia));
                it4 = it4;
                arrayList = arrayList;
            }
        }
        final ArrayList arrayList3 = arrayList;
        View findViewById = view.findViewById(R.id.bloodPressurePlot);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.bloodPressurePlot)");
        XYPlot xYPlot = (XYPlot) findViewById;
        PanZoom.attach(xYPlot, PanZoom.Pan.HORIZONTAL, PanZoom.Zoom.STRETCH_HORIZONTAL, PanZoom.ZoomLimit.MIN_TICKS);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
        xYPlot.getGraph().getBackgroundPaint().setColor(ThemeUtilKt.getBackgroundColor(requireContext2));
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext()");
        int fontSizeSmallInPx = ThemeUtilKt.getFontSizeSmallInPx(requireContext3);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        Context requireContext4 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext()");
        paint.setColor(ThemeUtilKt.getTextColorPrimary(requireContext4));
        paint.setTextSize(fontSizeSmallInPx);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        Context requireContext5 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext()");
        paint2.setColor(ThemeUtilKt.getTextColorSecondary(requireContext5));
        paint2.setAntiAlias(false);
        paint2.setPathEffect(new DashPathEffect(new float[]{3.0f, 2.0f}, 0.0f));
        if (!z4) {
            xYPlot.getGraph().setDomainGridLinePaint(null);
            xYPlot.getGraph().setRangeGridLinePaint(null);
        } else {
            xYPlot.getGraph().setDomainGridLinePaint(paint2);
            xYPlot.getGraph().setRangeGridLinePaint(paint2);
        }
        xYPlot.getLegend().setVisible(z5);
        if (z5) {
            xYPlot.getLegend().position(-0.5f, HorizontalPositioning.RELATIVE_TO_CENTER, 100.0f, VerticalPositioning.ABSOLUTE_FROM_BOTTOM, Anchor.LEFT_TOP);
            xYPlot.getLegend().setWidth(1.0f, SizeMode.RELATIVE);
            if (z3) {
                i = 1;
                xYPlot.getLegend().setTableModel(new DynamicTableModel(3, 1, TableOrder.ROW_MAJOR));
            } else {
                i = 1;
                xYPlot.getLegend().setTableModel(new DynamicTableModel(2, 1, TableOrder.ROW_MAJOR));
            }
            xYPlot.getLegend().setTableModel(new DynamicTableModel(3, i, TableOrder.ROW_MAJOR));
            xYPlot.getLegend().setDrawIconBackgroundEnabled(false);
            xYPlot.getLegend().setLegendItemComparator(BloodPressureChartFragment$$ExternalSyntheticLambda0.INSTANCE);
        }
        int color = ContextCompat.getColor(requireContext(), R.color.chart_blue_border);
        int color2 = ContextCompat.getColor(requireContext(), R.color.chart_blue_fill);
        int color3 = ContextCompat.getColor(requireContext(), R.color.chart_red_border);
        int color4 = ContextCompat.getColor(requireContext(), R.color.chart_red_fill);
        int color5 = ContextCompat.getColor(requireContext(), R.color.chart_green_border);
        int color6 = ContextCompat.getColor(requireContext(), R.color.chart_green_fill);
        float f6 = f4;
        SimpleXYSeries simpleXYSeries = new SimpleXYSeries(this.sys, SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, getString(R.string.systolic));
        SimpleXYSeries simpleXYSeries2 = new SimpleXYSeries(this.dia, SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, getString(R.string.diastolic));
        SimpleXYSeries simpleXYSeries3 = new SimpleXYSeries(arrayList2, SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, getString(R.string.pulse));
        if (z6) {
            if (z2) {
                BarFormatter barFormatter = new BarFormatter(-16776961, -16776961);
                BarFormatter barFormatter2 = new BarFormatter((int) SupportMenu.CATEGORY_MASK, (int) SupportMenu.CATEGORY_MASK);
                BarFormatter barFormatter3 = new BarFormatter(-16711936, -16711936);
                xYPlot.addSeries((XYPlot) simpleXYSeries, (SimpleXYSeries) barFormatter);
                xYPlot.addSeries((XYPlot) simpleXYSeries2, (SimpleXYSeries) barFormatter2);
                if (z3) {
                    xYPlot.addSeries((XYPlot) simpleXYSeries3, (SimpleXYSeries) barFormatter3);
                }
            } else {
                LineAndPointFormatter lineAndPointFormatter = new LineAndPointFormatter(Integer.valueOf(color), null, Integer.valueOf(color2), null);
                LineAndPointFormatter lineAndPointFormatter2 = new LineAndPointFormatter(Integer.valueOf(color3), null, Integer.valueOf(color4), null);
                LineAndPointFormatter lineAndPointFormatter3 = new LineAndPointFormatter(Integer.valueOf(color5), null, Integer.valueOf(color6), null);
                lineAndPointFormatter.setLegendIconEnabled(z5);
                lineAndPointFormatter2.setLegendIconEnabled(z5);
                lineAndPointFormatter3.setLegendIconEnabled(z5);
                xYPlot.addSeries((XYPlot) simpleXYSeries, (SimpleXYSeries) lineAndPointFormatter);
                xYPlot.addSeries((XYPlot) simpleXYSeries2, (SimpleXYSeries) lineAndPointFormatter2);
                if (z3) {
                    xYPlot.addSeries((XYPlot) simpleXYSeries3, (SimpleXYSeries) lineAndPointFormatter3);
                }
            }
        }
        if (z10) {
            LineAndPointFormatter lineAndPointFormatter4 = new LineAndPointFormatter(Integer.valueOf(color), null, null, null);
            LineAndPointFormatter lineAndPointFormatter5 = new LineAndPointFormatter(Integer.valueOf(color3), null, null, null);
            lineAndPointFormatter4.setLegendIconEnabled(false);
            lineAndPointFormatter5.setLegendIconEnabled(false);
            lineAndPointFormatter5.getLinePaint().setPathEffect(new DashPathEffect(new float[]{PixelUtils.dpToPix(20.0f), PixelUtils.dpToPix(15.0f)}, 0.0f));
            lineAndPointFormatter4.getLinePaint().setPathEffect(new DashPathEffect(new float[]{PixelUtils.dpToPix(20.0f), PixelUtils.dpToPix(15.0f)}, 0.0f));
            lineAndPointFormatter4.getLinePaint().setStrokeWidth(1.0f);
            LineAndPointFormatter lineAndPointFormatter6 = lineAndPointFormatter4;
            xYPlot.addSeries((XYPlot) new SimpleXYSeries(this.sysBand1, SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "140"), (SimpleXYSeries) lineAndPointFormatter6);
            lineAndPointFormatter4.getLinePaint().setStrokeWidth(1.0f);
            xYPlot.addSeries((XYPlot) new SimpleXYSeries(this.sysBand2, SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "160"), (SimpleXYSeries) lineAndPointFormatter6);
            lineAndPointFormatter4.getLinePaint().setStrokeWidth(1.0f);
            xYPlot.addSeries((XYPlot) new SimpleXYSeries(this.sysBand3, SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "180"), (SimpleXYSeries) lineAndPointFormatter6);
            lineAndPointFormatter5.getLinePaint().setStrokeWidth(1.0f);
            LineAndPointFormatter lineAndPointFormatter7 = lineAndPointFormatter5;
            xYPlot.addSeries((XYPlot) new SimpleXYSeries(this.diaBand1, SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "90"), (SimpleXYSeries) lineAndPointFormatter7);
            lineAndPointFormatter5.getLinePaint().setStrokeWidth(1.0f);
            xYPlot.addSeries((XYPlot) new SimpleXYSeries(this.diaBand2, SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "100"), (SimpleXYSeries) lineAndPointFormatter7);
            lineAndPointFormatter5.getLinePaint().setStrokeWidth(1.0f);
            xYPlot.addSeries((XYPlot) new SimpleXYSeries(this.diaBand3, SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "110"), (SimpleXYSeries) lineAndPointFormatter7);
        }
        if (z7) {
            calculateLinearTrendLine(this.sys, this.sysLinearTrend);
            calculateLinearTrendLine(this.dia, this.diaLinearTrend);
            LineAndPointFormatter lineAndPointFormatter8 = new LineAndPointFormatter(-16776961, null, null, null);
            lineAndPointFormatter8.setLegendIconEnabled(false);
            xYPlot.addSeries((XYPlot) new SimpleXYSeries(this.sysLinearTrend, SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, (String) null), (SimpleXYSeries) lineAndPointFormatter8);
            LineAndPointFormatter lineAndPointFormatter9 = new LineAndPointFormatter(Integer.valueOf((int) SupportMenu.CATEGORY_MASK), null, null, null);
            lineAndPointFormatter9.setLegendIconEnabled(false);
            xYPlot.addSeries((XYPlot) new SimpleXYSeries(this.diaLinearTrend, SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, (String) null), (SimpleXYSeries) lineAndPointFormatter9);
        }
        if (z9) {
            String string = sharedPreferences.getString(SettingsActivity.KEY_PREF_BLOODPRESSURE_MOVING_AVERAGE_SIZE, "5");
            Intrinsics.checkNotNull(string);
            this.period = Integer.parseInt(string);
            calculateMovingAverage(this.sys, this.sysSMATrend);
            calculateMovingAverage(this.dia, this.diaSMATrend);
            LineAndPointFormatter lineAndPointFormatter10 = new LineAndPointFormatter(-16776961, null, null, null);
            lineAndPointFormatter10.setLegendIconEnabled(false);
            xYPlot.addSeries((XYPlot) new SimpleXYSeries(this.sysSMATrend, SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, (String) null), (SimpleXYSeries) lineAndPointFormatter10);
            LineAndPointFormatter lineAndPointFormatter11 = new LineAndPointFormatter(Integer.valueOf((int) SupportMenu.CATEGORY_MASK), null, null, null);
            lineAndPointFormatter11.setLegendIconEnabled(false);
            xYPlot.addSeries((XYPlot) new SimpleXYSeries(this.diaSMATrend, SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, (String) null), (SimpleXYSeries) lineAndPointFormatter11);
        }
        int roundToInt = MathKt.roundToInt(f6);
        int roundToInt2 = MathKt.roundToInt(f5);
        xYPlot.setRangeBoundaries(Integer.valueOf(roundToInt), Integer.valueOf(roundToInt2), BoundaryMode.FIXED);
        xYPlot.setUserRangeOrigin(Integer.valueOf((roundToInt / 10) * 10));
        xYPlot.getOuterLimits().set((Number) 0, Integer.valueOf(this.sys.size() - 1), Integer.valueOf(roundToInt), Integer.valueOf(roundToInt2));
        xYPlot.setRangeStep(StepMode.INCREMENT_BY_VAL, 10.0d);
        if (simpleXYSeries.size() < 10) {
            xYPlot.setDomainStep(StepMode.SUBDIVIDE, simpleXYSeries.size());
        }
        xYPlot.getGraph().getLineLabelStyle(XYGraphWidget.Edge.LEFT).setFormat(new DecimalFormat("#"));
        xYPlot.getGraph().getLineLabelStyle(XYGraphWidget.Edge.BOTTOM).setFormat(new Format() { // from class: com.zell_mbc.medilog.bloodpressure.BloodPressureChartFragment$onViewCreated$2
            @Override // java.text.Format
            public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                Intrinsics.checkNotNullParameter(toAppendTo, "toAppendTo");
                Intrinsics.checkNotNullParameter(pos, "pos");
                toAppendTo.append(arrayList3.get(MathKt.roundToInt(((Number) obj).floatValue())));
                Intrinsics.checkNotNullExpressionValue(toAppendTo, "toAppendTo.append(labels[i])");
                return toAppendTo;
            }

            @Override // java.text.Format
            public Object parseObject(String source, ParsePosition pos) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(pos, "pos");
                return 0;
            }
        });
    }
}
