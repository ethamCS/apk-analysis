package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.collection.MutableVector;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DerivedState.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e\u001a.\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e\u001a0\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u000eH\u0082\b¢\u0006\u0004\b\u0015\u0010\u0016\u001aj\u0010\u0017\u001a\u00020\b\"\u0004\b\u0000\u0010\u00122%\u0010\u0018\u001a!\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000b¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u00062%\u0010\u001b\u001a!\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000b¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u000eH\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"J\u0010\u0003\u001a>\u0012:\u00128\u00124\u00122\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005j\u0002`\t0\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*d\b\u0002\u0010\u001c\".\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00052.\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005¨\u0006\u001d"}, d2 = {"calculationBlockNestedLevel", "Landroidx/compose/runtime/SnapshotThreadLocal;", "", "derivedStateObservers", "Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Pair;", "Lkotlin/Function1;", "Landroidx/compose/runtime/DerivedState;", "", "Landroidx/compose/runtime/DerivedStateObservers;", "derivedStateOf", "Landroidx/compose/runtime/State;", ExifInterface.GPS_DIRECTION_TRUE, "calculation", "Lkotlin/Function0;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "notifyObservers", "R", "derivedState", "block", "notifyObservers$SnapshotStateKt__DerivedStateKt", "(Landroidx/compose/runtime/DerivedState;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "observeDerivedStateRecalculations", "start", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "done", "DerivedStateObservers", "runtime_release"}, k = 5, mv = {1, 7, 1}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateKt__DerivedStateKt {
    private static final SnapshotThreadLocal<Integer> calculationBlockNestedLevel = new SnapshotThreadLocal<>();
    private static final SnapshotThreadLocal<MutableVector<Pair<Function1<DerivedState<?>, Unit>, Function1<DerivedState<?>, Unit>>>> derivedStateObservers = new SnapshotThreadLocal<>();

    public static final <T> State<T> derivedStateOf(Function0<? extends T> calculation) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        return new DerivedSnapshotState(calculation, null);
    }

    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> policy, Function0<? extends T> calculation) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        return new DerivedSnapshotState(calculation, policy);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <R> R notifyObservers$SnapshotStateKt__DerivedStateKt(androidx.compose.runtime.DerivedState<?> r8, kotlin.jvm.functions.Function0<? extends R> r9) {
        /*
            androidx.compose.runtime.SnapshotThreadLocal r0 = access$getDerivedStateObservers$p()
            java.lang.Object r0 = r0.get()
            androidx.compose.runtime.collection.MutableVector r0 = (androidx.compose.runtime.collection.MutableVector) r0
            r1 = 0
            if (r0 != 0) goto L14
            androidx.compose.runtime.collection.MutableVector r0 = new androidx.compose.runtime.collection.MutableVector
            kotlin.Pair[] r2 = new kotlin.Pair[r1]
            r0.<init>(r2, r1)
        L14:
            int r2 = r0.getSize()
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>"
            r4 = 1
            if (r2 <= 0) goto L35
            java.lang.Object[] r5 = r0.getContent()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r3)
            r6 = 0
        L25:
            r7 = r5[r6]
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r7 = r7.component1()
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r7.invoke(r8)
            int r6 = r6 + r4
            if (r6 < r2) goto L25
        L35:
            java.lang.Object r9 = r9.invoke()     // Catch: java.lang.Throwable -> L5d
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            int r2 = r0.getSize()
            if (r2 <= 0) goto L59
            java.lang.Object[] r0 = r0.getContent()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r3)
        L49:
            r3 = r0[r1]
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r3 = r3.component2()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r3.invoke(r8)
            int r1 = r1 + r4
            if (r1 < r2) goto L49
        L59:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            return r9
        L5d:
            r9 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            int r2 = r0.getSize()
            if (r2 <= 0) goto L7f
            java.lang.Object[] r0 = r0.getContent()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r3)
        L6e:
            r3 = r0[r1]
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r3 = r3.component2()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r3.invoke(r8)
            int r1 = r1 + r4
            if (r1 >= r2) goto L7f
            goto L6e
        L7f:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.notifyObservers$SnapshotStateKt__DerivedStateKt(androidx.compose.runtime.DerivedState, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    public static final <R> void observeDerivedStateRecalculations(Function1<? super State<?>, Unit> start, Function1<? super State<?>, Unit> done, Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(done, "done");
        Intrinsics.checkNotNullParameter(block, "block");
        SnapshotThreadLocal<MutableVector<Pair<Function1<DerivedState<?>, Unit>, Function1<DerivedState<?>, Unit>>>> snapshotThreadLocal = derivedStateObservers;
        MutableVector<Pair<Function1<DerivedState<?>, Unit>, Function1<DerivedState<?>, Unit>>> mutableVector = snapshotThreadLocal.get();
        if (mutableVector == null) {
            MutableVector<Pair<Function1<DerivedState<?>, Unit>, Function1<DerivedState<?>, Unit>>> mutableVector2 = new MutableVector<>(new Pair[16], 0);
            snapshotThreadLocal.set(mutableVector2);
            mutableVector = mutableVector2;
        }
        try {
            mutableVector.add(TuplesKt.to(start, done));
            block.invoke();
        } finally {
            mutableVector.removeAt(mutableVector.getSize() - 1);
        }
    }
}
