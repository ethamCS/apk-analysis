package com.zell_mbc.medilog.data;

import androidx.sqlite.db.SimpleSQLiteQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
/* compiled from: DataDao.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H'J\b\u0010\b\u001a\u00020\tH'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH'J\b\u0010\u000b\u001a\u00020\tH'J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0019\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ!\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H§@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH'J\u0018\u0010\u001f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0019H'J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001eH'J\u0018\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0019H'J\u0010\u0010&\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH'J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH'J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\tH'J\u0018\u0010(\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0019H'J\u0010\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0019H'J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H'J\u0019\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\u0007H'J \u0010/\u001a\u00020\r2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0019H'J\u0019\u00102\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/zell_mbc/medilog/data/DataDao;", "", "()V", "backup", "", "Lcom/zell_mbc/medilog/data/Data;", "backupSettings", "Lcom/zell_mbc/medilog/data/Settings;", "countSettings", "", "dataType", "countTypes", "delete", "", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllFiltered", "start", "", "end", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTmpItem", "tmpComment", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataList", "", "query", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "getDay", "day", "getFloat", "", "getId", "type", "key", "getInt", "getItem", "getSetting", "getType", "tabLabel", "getTypes", "insert", "obj", "(Lcom/zell_mbc/medilog/data/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSetting", "entry", "value", "update", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class DataDao {
    public static final int $stable = 0;

    public abstract List<Data> backup();

    public abstract List<Settings> backupSettings();

    public abstract int countSettings();

    public abstract int countSettings(int i);

    public abstract int countTypes();

    public abstract Object delete(int i, Continuation<? super Unit> continuation);

    public abstract Object deleteAll(int i, Continuation<? super Unit> continuation);

    public abstract Object deleteAll(Continuation<? super Unit> continuation);

    public abstract Object deleteAllFiltered(long j, long j2, Continuation<? super Unit> continuation);

    public abstract Object deleteTmpItem(String str, Continuation<? super Unit> continuation);

    public abstract List<Data> getDataList(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract int getDay(int i, String str);

    public abstract float getFloat(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract int getId(int i, String str);

    public abstract int getInt(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract Data getItem(int i);

    public abstract Data getItem(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract String getSetting(int i, String str);

    public abstract int getType(String str);

    public abstract List<Integer> getTypes();

    public abstract Object insert(Data data, Continuation<? super Long> continuation);

    public abstract void setSetting(int i, String str, String str2);

    public abstract void setSetting(Settings settings);

    public abstract Object update(Data data, Continuation<? super Unit> continuation);
}
