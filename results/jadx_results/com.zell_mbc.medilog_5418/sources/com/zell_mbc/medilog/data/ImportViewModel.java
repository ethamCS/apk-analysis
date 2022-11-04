package com.zell_mbc.medilog.data;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.zell_mbc.medilog.settings.SettingsActivity;
import com.zell_mbc.medilog.utility.Preferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
/* compiled from: ImportViewModel.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/zell_mbc/medilog/data/ImportViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "app", "getApp", "()Landroid/app/Application;", "dataDao", "Lcom/zell_mbc/medilog/data/DataDao;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "preferences", "Landroid/content/SharedPreferences;", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", SettingsActivity.KEY_PREF_PASSWORD, "", "getZipPassword", "()Ljava/lang/String;", "setZipPassword", "(Ljava/lang/String;)V", "deleteAll", "Lkotlinx/coroutines/Job;", "insert", "", "item", "Lcom/zell_mbc/medilog/data/Data;", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ImportViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final Application app;
    private DataDao dataDao;
    private final CoroutineDispatcher dispatcher = Dispatchers.getIO();
    public final SharedPreferences preferences;
    public Uri uri;
    public String zipPassword;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.app = application;
        this.dataDao = MediLogDB.Companion.getDatabase(application).dataDao();
        this.preferences = Preferences.SingletonFactory.getSharedPreferences(application);
    }

    public final Application getApp() {
        return this.app;
    }

    public final Uri getUri() {
        Uri uri = this.uri;
        if (uri != null) {
            return uri;
        }
        Intrinsics.throwUninitializedPropertyAccessException("uri");
        return null;
    }

    public final void setUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<set-?>");
        this.uri = uri;
    }

    public final String getZipPassword() {
        String str = this.zipPassword;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(SettingsActivity.KEY_PREF_PASSWORD);
        return null;
    }

    public final void setZipPassword(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.zipPassword = str;
    }

    public final long insert(Data item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = -1L;
        BuildersKt__BuildersKt.runBlocking$default(null, new ImportViewModel$insert$1(this, longRef, item, null), 1, null);
        return longRef.element;
    }

    public final Job deleteAll() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ImportViewModel$deleteAll$1(this, null), 2, null);
        return launch$default;
    }
}
