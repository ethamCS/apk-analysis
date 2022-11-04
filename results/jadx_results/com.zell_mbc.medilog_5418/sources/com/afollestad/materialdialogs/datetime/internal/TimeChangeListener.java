package com.afollestad.materialdialogs.datetime.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TimeChangeListener.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0012\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B@\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012%\b\u0002\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\u0006\u0010\u0014\u001a\u00020\u000bR\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/afollestad/materialdialogs/datetime/internal/TimeChangeListener;", ExifInterface.GPS_DIRECTION_TRUE, "", "context", "Landroid/content/Context;", "argument", "onChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "arg", "", "(Landroid/content/Context;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Object;", "lastHour", "", "lastMinute", "receiver", "com/afollestad/materialdialogs/datetime/internal/TimeChangeListener$receiver$1", "Lcom/afollestad/materialdialogs/datetime/internal/TimeChangeListener$receiver$1;", "dispose", "datetime"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class TimeChangeListener<T> {
    private final T argument;
    private Context context;
    private int lastHour;
    private int lastMinute;
    private Function1<? super T, Unit> onChange;
    private final TimeChangeListener$receiver$1 receiver;

    /* JADX WARN: Type inference failed for: r2v2, types: [com.afollestad.materialdialogs.datetime.internal.TimeChangeListener$receiver$1] */
    public TimeChangeListener(Context context, T t, Function1<? super T, Unit> function1) {
        this.context = context;
        this.argument = t;
        this.onChange = function1;
        this.lastHour = -1;
        this.lastMinute = -1;
        ?? r2 = new BroadcastReceiver() { // from class: com.afollestad.materialdialogs.datetime.internal.TimeChangeListener$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Object obj;
                int i;
                Function1 function12;
                Object obj2;
                int i2;
                Calendar calendar = Calendar.getInstance();
                int i3 = calendar.get(11);
                int i4 = calendar.get(12);
                obj = TimeChangeListener.this.argument;
                if (obj != null) {
                    i = TimeChangeListener.this.lastHour;
                    if (i == i3) {
                        i2 = TimeChangeListener.this.lastMinute;
                        if (i2 == i4) {
                            return;
                        }
                    }
                    function12 = TimeChangeListener.this.onChange;
                    if (function12 != null) {
                        obj2 = TimeChangeListener.this.argument;
                        Unit unit = (Unit) function12.invoke(obj2);
                    }
                    TimeChangeListener.this.lastHour = i3;
                    TimeChangeListener.this.lastMinute = i4;
                }
            }
        };
        this.receiver = r2;
        if (this.context != null) {
            if (t == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (this.onChange == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_TICK");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_SET");
            Context context2 = this.context;
            if (context2 == null) {
                Intrinsics.throwNpe();
            }
            context2.registerReceiver((BroadcastReceiver) r2, intentFilter);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public /* synthetic */ TimeChangeListener(Context context, Object obj, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, (i & 4) != 0 ? null : function1);
    }

    public final void dispose() {
        Context context = this.context;
        if (context != null) {
            context.unregisterReceiver(this.receiver);
        }
        this.context = null;
        this.onChange = null;
    }
}
