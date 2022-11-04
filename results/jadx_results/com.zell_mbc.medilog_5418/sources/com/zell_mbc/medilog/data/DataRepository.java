package com.zell_mbc.medilog.data;

import androidx.sqlite.db.SimpleSQLiteQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DataRepository.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0019\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J!\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\"2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u001fJ\u000e\u0010'\u001a\u00020(2\u0006\u0010#\u001a\u00020$J\u000e\u0010)\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$J\u000e\u0010*\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$J\u0019\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010-J\u0019\u0010.\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010-R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/zell_mbc/medilog/data/DataRepository;", "", "dataType", "", "dao", "Lcom/zell_mbc/medilog/data/DataDao;", "fS", "", "fE", "(ILcom/zell_mbc/medilog/data/DataDao;JJ)V", "filterEnd", "getFilterEnd", "()J", "setFilterEnd", "(J)V", "filterStart", "getFilterStart", "setFilterStart", "dataBackup", "", "Lcom/zell_mbc/medilog/data/Data;", "delete", "", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllFiltered", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTmpItem", "tmpComment", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataList", "", "query", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "getDay", "day", "getFloat", "", "getInt", "getItem", "insert", "item", "(Lcom/zell_mbc/medilog/data/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DataRepository {
    public static final int $stable = 8;
    private final DataDao dao;
    private final int dataType;
    private long filterEnd;
    private long filterStart;

    public DataRepository(int i, DataDao dao, long j, long j2) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dataType = i;
        this.dao = dao;
        this.filterStart = j;
        this.filterEnd = j2;
    }

    public final long getFilterStart() {
        return this.filterStart;
    }

    public final void setFilterStart(long j) {
        this.filterStart = j;
    }

    public final long getFilterEnd() {
        return this.filterEnd;
    }

    public final void setFilterEnd(long j) {
        this.filterEnd = j;
    }

    public final List<Data> getDataList(SimpleSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return this.dao.getDataList(query);
    }

    public final int getInt(SimpleSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return this.dao.getInt(query);
    }

    public final float getFloat(SimpleSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return this.dao.getFloat(query);
    }

    public final Data getItem(SimpleSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return this.dao.getItem(query);
    }

    public final Object insert(Data data, Continuation<? super Long> continuation) {
        return this.dao.insert(data, continuation);
    }

    public final Object update(Data data, Continuation<? super Unit> continuation) {
        Object update = this.dao.update(data, continuation);
        return update == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? update : Unit.INSTANCE;
    }

    public final Object delete(int i, Continuation<? super Unit> continuation) {
        Object delete = this.dao.delete(i, continuation);
        return delete == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delete : Unit.INSTANCE;
    }

    public final Object deleteAll(Continuation<? super Unit> continuation) {
        Object deleteAll = this.dao.deleteAll(continuation);
        return deleteAll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteAll : Unit.INSTANCE;
    }

    public final Object deleteAll(int i, Continuation<? super Unit> continuation) {
        Object deleteAll = this.dao.deleteAll(i, continuation);
        return deleteAll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteAll : Unit.INSTANCE;
    }

    public final Object deleteAllFiltered(long j, long j2, Continuation<? super Unit> continuation) {
        Object deleteAllFiltered = this.dao.deleteAllFiltered(j, j2, continuation);
        return deleteAllFiltered == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteAllFiltered : Unit.INSTANCE;
    }

    public final Object deleteTmpItem(String str, Continuation<? super Unit> continuation) {
        Object deleteTmpItem = this.dao.deleteTmpItem(str, continuation);
        return deleteTmpItem == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteTmpItem : Unit.INSTANCE;
    }

    public final int getDay(String day) {
        Intrinsics.checkNotNullParameter(day, "day");
        return this.dao.getDay(this.dataType, day);
    }

    public final List<Data> dataBackup() {
        return this.dao.backup();
    }
}
