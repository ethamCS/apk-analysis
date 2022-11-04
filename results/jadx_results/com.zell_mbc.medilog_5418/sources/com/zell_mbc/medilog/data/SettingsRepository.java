package com.zell_mbc.medilog.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SettingsRepository.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0011\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000eJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/zell_mbc/medilog/data/SettingsRepository;", "", "dao", "Lcom/zell_mbc/medilog/data/SettingsDao;", "(Lcom/zell_mbc/medilog/data/SettingsDao;)V", "count", "", "type", "countTypes", "deleteSettings", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "", "key", "getDataType", "tabLabel", "getDataTypes", "", "getId", "set", "s", "Lcom/zell_mbc/medilog/data/Settings;", "settingsBackup", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SettingsRepository {
    public static final int $stable = 0;
    private final SettingsDao dao;

    public SettingsRepository(SettingsDao dao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
    }

    public final String get(int i, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.dao.getSetting(i, key);
    }

    public final int getId(int i, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.dao.getId(i, key);
    }

    public final List<Integer> getDataTypes() {
        return this.dao.getDataTypes();
    }

    public final void set(Settings s) {
        Intrinsics.checkNotNullParameter(s, "s");
        this.dao.set(s);
    }

    public final int count() {
        return this.dao.countSettings();
    }

    public final int count(int i) {
        return this.dao.countSettings(i);
    }

    public final int countTypes() {
        return this.dao.countTypes();
    }

    public final int getDataType(String tabLabel) {
        Intrinsics.checkNotNullParameter(tabLabel, "tabLabel");
        return this.dao.getType(tabLabel);
    }

    public final Object deleteSettings(int i, Continuation<? super Unit> continuation) {
        Object deleteSettings = this.dao.deleteSettings(i, continuation);
        return deleteSettings == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteSettings : Unit.INSTANCE;
    }

    public final Object deleteSettings(Continuation<? super Unit> continuation) {
        Object deleteSettings = this.dao.deleteSettings(continuation);
        return deleteSettings == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteSettings : Unit.INSTANCE;
    }

    public final List<Settings> settingsBackup() {
        return this.dao.backup();
    }
}
