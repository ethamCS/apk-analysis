package com.zell_mbc.medilog.data;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SettingsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "com.zell_mbc.medilog.data.SettingsViewModel$set$1", f = "SettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class SettingsViewModel$set$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $dt;
    final /* synthetic */ String $key;
    final /* synthetic */ String $value;
    int label;
    final /* synthetic */ SettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$set$1(SettingsViewModel settingsViewModel, int i, String str, String str2, Continuation<? super SettingsViewModel$set$1> continuation) {
        super(2, continuation);
        this.this$0 = settingsViewModel;
        this.$dt = i;
        this.$key = str;
        this.$value = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettingsViewModel$set$1(this.this$0, this.$dt, this.$key, this.$value, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SettingsViewModel$set$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SettingsRepository settingsRepository;
        SettingsRepository settingsRepository2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            settingsRepository = this.this$0.repository;
            SettingsRepository settingsRepository3 = null;
            if (settingsRepository == null) {
                Intrinsics.throwUninitializedPropertyAccessException("repository");
                settingsRepository = null;
            }
            Settings settings = new Settings(settingsRepository.getId(this.$dt, this.$key), this.$dt, this.$key, this.$value);
            settingsRepository2 = this.this$0.repository;
            if (settingsRepository2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("repository");
            } else {
                settingsRepository3 = settingsRepository2;
            }
            settingsRepository3.set(settings);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}