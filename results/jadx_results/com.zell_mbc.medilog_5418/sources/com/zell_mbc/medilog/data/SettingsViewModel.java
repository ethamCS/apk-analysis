package com.zell_mbc.medilog.data;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
/* compiled from: SettingsViewModel.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0016J\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0002\u0010\u001bJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0016J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001eJ\u0016\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0016J\u0016\u0010 \u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010!\u001a\u00020\"J\u001e\u0010#\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016J\u001e\u0010%\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u001aJ\u001e\u0010&\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/zell_mbc/medilog/data/SettingsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "app", "getApp", "()Landroid/app/Application;", "dataType", "", "getDataType", "()I", "setDataType", "(I)V", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "repository", "Lcom/zell_mbc/medilog/data/SettingsRepository;", "countDataTypes", "deleteSettings", "Lkotlinx/coroutines/Job;", "get", "", "dt", "key", "getBoolean", "", "(ILjava/lang/String;)Ljava/lang/Boolean;", "tabLabel", "getDataTypes", "", "getInt", "getString", "init", "", "set", "value", "setBoolean", "setString", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SettingsViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final Application app;
    private int dataType;
    private final CoroutineDispatcher dispatcher = Dispatchers.getIO();
    private SettingsRepository repository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.app = application;
    }

    public final Application getApp() {
        return this.app;
    }

    public final int getDataType() {
        return this.dataType;
    }

    public final void setDataType(int i) {
        this.dataType = i;
    }

    public final void init() {
        this.repository = new SettingsRepository(MediLogDB.Companion.getDatabase(this.app).settingsDao());
    }

    public final Job deleteSettings(int i) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SettingsViewModel$deleteSettings$1(this, i, null), 3, null);
        return launch$default;
    }

    public final Job deleteSettings() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SettingsViewModel$deleteSettings$2(this, null), 3, null);
        return launch$default;
    }

    public final int getDataType(String tabLabel) {
        Intrinsics.checkNotNullParameter(tabLabel, "tabLabel");
        Ref.IntRef intRef = new Ref.IntRef();
        BuildersKt__BuildersKt.runBlocking$default(null, new SettingsViewModel$getDataType$1(this, intRef, tabLabel, null), 1, null);
        return intRef.element;
    }

    public final String get(int i, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        BuildersKt__BuildersKt.runBlocking$default(null, new SettingsViewModel$get$1(this, objectRef, i, key, null), 1, null);
        String str = (String) objectRef.element;
        return str == null ? "" : str;
    }

    public final String getString(int i, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return get(i, key);
    }

    public final Boolean getBoolean(int i, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String str = get(i, key);
        if (str.length() == 0) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public final int getInt(int i, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String str = get(i, key);
        if (!(str.length() == 0)) {
            try {
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return Integer.parseInt(str);
    }

    public final Job set(int i, String key, String value) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new SettingsViewModel$set$1(this, i, key, value, null), 2, null);
        return launch$default;
    }

    public final void setBoolean(int i, String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (z) {
            set(i, key, "true");
        } else {
            set(i, key, "false");
        }
    }

    public final void setString(int i, String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        set(i, key, value);
    }

    public final int countDataTypes() {
        Ref.IntRef intRef = new Ref.IntRef();
        BuildersKt__BuildersKt.runBlocking$default(null, new SettingsViewModel$countDataTypes$1(this, intRef, null), 1, null);
        return intRef.element;
    }

    public final List<Integer> getDataTypes() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        BuildersKt__BuildersKt.runBlocking$default(null, new SettingsViewModel$getDataTypes$1(this, objectRef, null), 1, null);
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("i");
            return null;
        }
        return (List) objectRef.element;
    }
}
