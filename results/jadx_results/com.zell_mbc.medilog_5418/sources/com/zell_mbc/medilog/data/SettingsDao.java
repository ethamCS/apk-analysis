package com.zell_mbc.medilog.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
/* compiled from: SettingsDao.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'J\b\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H'J\b\u0010\t\u001a\u00020\u0007H'J\u0011\u0010\n\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H'J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H'J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H'J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0012H'J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0005H'J \u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/zell_mbc/medilog/data/SettingsDao;", "", "()V", "backup", "", "Lcom/zell_mbc/medilog/data/Settings;", "countSettings", "", "dataType", "countTypes", "deleteSettings", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataTypes", "getId", "type", "key", "", "getSetting", "getType", "tabLabel", "set", "entry", "setSetting", "value", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SettingsDao {
    public static final int $stable = 0;

    public abstract List<Settings> backup();

    public abstract int countSettings();

    public abstract int countSettings(int i);

    public abstract int countTypes();

    public abstract Object deleteSettings(int i, Continuation<? super Unit> continuation);

    public abstract Object deleteSettings(Continuation<? super Unit> continuation);

    public abstract List<Integer> getDataTypes();

    public abstract int getId(int i, String str);

    public abstract String getSetting(int i, String str);

    public abstract int getType(String str);

    public abstract void set(Settings settings);

    public abstract void setSetting(int i, String str, String str2);
}
