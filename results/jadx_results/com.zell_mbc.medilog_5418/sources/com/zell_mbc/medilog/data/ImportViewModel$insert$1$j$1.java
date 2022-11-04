package com.zell_mbc.medilog.data;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ImportViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "com.zell_mbc.medilog.data.ImportViewModel$insert$1$j$1", f = "ImportViewModel.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class ImportViewModel$insert$1$j$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Data $item;
    final /* synthetic */ Ref.LongRef $rowId;
    Object L$0;
    int label;
    final /* synthetic */ ImportViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportViewModel$insert$1$j$1(Ref.LongRef longRef, ImportViewModel importViewModel, Data data, Continuation<? super ImportViewModel$insert$1$j$1> continuation) {
        super(2, continuation);
        this.$rowId = longRef;
        this.this$0 = importViewModel;
        this.$item = data;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImportViewModel$insert$1$j$1(this.$rowId, this.this$0, this.$item, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ImportViewModel$insert$1$j$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.LongRef longRef;
        DataDao dataDao;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.LongRef longRef2 = this.$rowId;
            dataDao = this.this$0.dataDao;
            this.L$0 = longRef2;
            this.label = 1;
            Object insert = dataDao.insert(this.$item, this);
            if (insert == coroutine_suspended) {
                return coroutine_suspended;
            }
            longRef = longRef2;
            obj = insert;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            longRef = (Ref.LongRef) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        longRef.element = ((Number) obj).longValue();
        return Unit.INSTANCE;
    }
}
