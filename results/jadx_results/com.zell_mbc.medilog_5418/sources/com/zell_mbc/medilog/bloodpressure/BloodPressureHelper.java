package com.zell_mbc.medilog.bloodpressure;

import android.content.Context;
import android.content.SharedPreferences;
import com.zell_mbc.medilog.R;
import com.zell_mbc.medilog.settings.SettingsActivity;
import com.zell_mbc.medilog.utility.Preferences;
import com.zell_mbc.medilog.utility.UserOutputServiceImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
/* compiled from: BloodPressureHelper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u000eR\u0014\u0010\u001a\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u001c\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\u000eR\u0014\u0010\"\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\nR\u000e\u0010$\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006/"}, d2 = {"Lcom/zell_mbc/medilog/bloodpressure/BloodPressureHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "hyperGrade1", "", "getHyperGrade1", "()I", "hyperGrade1Dia", "getHyperGrade1Dia", "setHyperGrade1Dia", "(I)V", "hyperGrade1Sys", "getHyperGrade1Sys", "setHyperGrade1Sys", "hyperGrade2", "getHyperGrade2", "hyperGrade2Dia", "getHyperGrade2Dia", "setHyperGrade2Dia", "hyperGrade2Sys", "getHyperGrade2Sys", "setHyperGrade2Sys", "hyperGrade3", "getHyperGrade3", "hyperGrade3Dia", "getHyperGrade3Dia", "setHyperGrade3Dia", "hyperGrade3Sys", "getHyperGrade3Sys", "setHyperGrade3Sys", "hyperGrade4", "getHyperGrade4", "hypotensionDia", "hypotensionSys", "userOutputService", "Lcom/zell_mbc/medilog/utility/UserOutputServiceImpl;", "getUserOutputService", "()Lcom/zell_mbc/medilog/utility/UserOutputServiceImpl;", "diaGrade", "diastolic", "", "sysGrade", "systolic", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BloodPressureHelper {
    public static final int $stable = 8;
    private final Context context;
    private int hyperGrade1Dia;
    private int hyperGrade1Sys;
    private int hyperGrade2Dia;
    private int hyperGrade2Sys;
    private int hyperGrade3Dia;
    private int hyperGrade3Sys;
    private int hypotensionDia;
    private int hypotensionSys;
    private final UserOutputServiceImpl userOutputService;
    private final int hyperGrade1 = 1;
    private final int hyperGrade2 = 2;
    private final int hyperGrade3 = 3;
    private final int hyperGrade4 = 4;

    public BloodPressureHelper(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.userOutputService = new UserOutputServiceImpl(context, null);
        SharedPreferences sharedPreferences = Preferences.SingletonFactory.getSharedPreferences(context);
        String string = sharedPreferences.getString(SettingsActivity.KEY_PREF_hyperGrade1, context.getString(R.string.grade1Values));
        try {
            Intrinsics.checkNotNull(string);
            Object[] array = new Regex(",").split(string, 0).toArray(new String[0]);
            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            this.hyperGrade1Sys = Integer.parseInt(strArr[0]);
            this.hyperGrade1Dia = Integer.parseInt(strArr[1]);
        } catch (Exception e) {
            UserOutputServiceImpl userOutputServiceImpl = this.userOutputService;
            String string2 = this.context.getString(R.string.grade1Error);
            String string3 = this.context.getString(R.string.gradeErrorEnd);
            userOutputServiceImpl.showAndHideMessageForLong(string2 + " " + string + " , " + string3);
            e.printStackTrace();
        }
        String string4 = sharedPreferences.getString(SettingsActivity.KEY_PREF_hyperGrade2, this.context.getString(R.string.grade2Values));
        try {
            Intrinsics.checkNotNull(string4);
            Object[] array2 = new Regex(",").split(string4, 0).toArray(new String[0]);
            Intrinsics.checkNotNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr2 = (String[]) array2;
            this.hyperGrade2Sys = Integer.parseInt(strArr2[0]);
            this.hyperGrade2Dia = Integer.parseInt(strArr2[1]);
        } catch (Exception e2) {
            UserOutputServiceImpl userOutputServiceImpl2 = this.userOutputService;
            String string5 = this.context.getString(R.string.grade2Error);
            String string6 = this.context.getString(R.string.gradeErrorEnd);
            userOutputServiceImpl2.showAndHideMessageForLong(string5 + " " + string4 + " , " + string6);
            e2.printStackTrace();
        }
        String string7 = sharedPreferences.getString(SettingsActivity.KEY_PREF_hyperGrade3, this.context.getString(R.string.grade3Values));
        try {
            Intrinsics.checkNotNull(string7);
            Object[] array3 = new Regex(",").split(string7, 0).toArray(new String[0]);
            Intrinsics.checkNotNull(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr3 = (String[]) array3;
            this.hyperGrade3Sys = Integer.parseInt(strArr3[0]);
            this.hyperGrade3Dia = Integer.parseInt(strArr3[1]);
        } catch (Exception e3) {
            UserOutputServiceImpl userOutputServiceImpl3 = this.userOutputService;
            String string8 = this.context.getString(R.string.grade3Error);
            String string9 = this.context.getString(R.string.gradeErrorEnd);
            userOutputServiceImpl3.showAndHideMessageForLong(string8 + " " + string7 + " , " + string9);
            e3.printStackTrace();
        }
        String string10 = sharedPreferences.getString(SettingsActivity.KEY_PREF_HYPOTENSION, this.context.getString(R.string.hypotensionValue));
        try {
            Intrinsics.checkNotNull(string10);
            Object[] array4 = new Regex(",").split(string10, 0).toArray(new String[0]);
            Intrinsics.checkNotNull(array4, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr4 = (String[]) array4;
            this.hypotensionSys = Integer.parseInt(strArr4[0]);
            this.hypotensionDia = Integer.parseInt(strArr4[1]);
        } catch (Exception e4) {
            UserOutputServiceImpl userOutputServiceImpl4 = this.userOutputService;
            String string11 = this.context.getString(R.string.hypotensionError);
            String string12 = this.context.getString(R.string.gradeErrorEnd);
            userOutputServiceImpl4.showAndHideMessageForLong(string11 + " " + string10 + " , " + string12);
            e4.printStackTrace();
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final int getHyperGrade3Sys() {
        return this.hyperGrade3Sys;
    }

    public final void setHyperGrade3Sys(int i) {
        this.hyperGrade3Sys = i;
    }

    public final int getHyperGrade3Dia() {
        return this.hyperGrade3Dia;
    }

    public final void setHyperGrade3Dia(int i) {
        this.hyperGrade3Dia = i;
    }

    public final int getHyperGrade2Sys() {
        return this.hyperGrade2Sys;
    }

    public final void setHyperGrade2Sys(int i) {
        this.hyperGrade2Sys = i;
    }

    public final int getHyperGrade2Dia() {
        return this.hyperGrade2Dia;
    }

    public final void setHyperGrade2Dia(int i) {
        this.hyperGrade2Dia = i;
    }

    public final int getHyperGrade1Sys() {
        return this.hyperGrade1Sys;
    }

    public final void setHyperGrade1Sys(int i) {
        this.hyperGrade1Sys = i;
    }

    public final int getHyperGrade1Dia() {
        return this.hyperGrade1Dia;
    }

    public final void setHyperGrade1Dia(int i) {
        this.hyperGrade1Dia = i;
    }

    public final int getHyperGrade1() {
        return this.hyperGrade1;
    }

    public final int getHyperGrade2() {
        return this.hyperGrade2;
    }

    public final int getHyperGrade3() {
        return this.hyperGrade3;
    }

    public final int getHyperGrade4() {
        return this.hyperGrade4;
    }

    public final UserOutputServiceImpl getUserOutputService() {
        return this.userOutputService;
    }

    public final int sysGrade(String systolic) {
        int i;
        Intrinsics.checkNotNullParameter(systolic, "systolic");
        try {
            i = Integer.parseInt(systolic);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i >= this.hyperGrade3Sys) {
            return this.hyperGrade3;
        }
        if (i >= this.hyperGrade2Sys) {
            return this.hyperGrade2;
        }
        if (i >= this.hyperGrade1Sys) {
            return this.hyperGrade1;
        }
        if (i > this.hypotensionSys) {
            return 0;
        }
        return this.hyperGrade4;
    }

    public final int diaGrade(String diastolic) {
        int i;
        Intrinsics.checkNotNullParameter(diastolic, "diastolic");
        try {
            i = Integer.parseInt(diastolic);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i >= this.hyperGrade3Dia) {
            return this.hyperGrade3;
        }
        if (i >= this.hyperGrade2Dia) {
            return this.hyperGrade2;
        }
        if (i >= this.hyperGrade1Dia) {
            return this.hyperGrade1;
        }
        if (i > this.hypotensionDia) {
            return 0;
        }
        return this.hyperGrade4;
    }
}
