package coil.util;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Collections.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010&\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a?\u0010\u0007\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\b0\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0004H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001aI\u0010\n\u001a\u0002H\b\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u000b\u001a\u0002H\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\b0\rH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a0\u0010\u000f\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00100\u0004H\u0080\bø\u0001\u0000\u001a<\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\b0\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0080\bø\u0001\u0000\u001a`\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\b0\u0014\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u0016\"\b\b\u0002\u0010\b*\u00020\u0017*\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u00160\u00142 \u0010\t\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u00160\u0018\u0012\u0006\u0012\u0004\u0018\u0001H\b0\u0004H\u0080\bø\u0001\u0000\u001a0\u0010\u0019\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u001a2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000*<\b\u0000\u0010\u001b\u001a\u0004\b\u0000\u0010\b\u001a\u0004\b\u0001\u0010\u0001\"\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00010\u001c0\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00010\u001c0\u0002*<\b\u0000\u0010\u001d\u001a\u0004\b\u0000\u0010\b\u001a\u0004\b\u0001\u0010\u0001\"\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00010\u001c0\u001a2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00010\u001c0\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"findIndices", ExifInterface.GPS_DIRECTION_TRUE, "", "predicate", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstNotNullIndices", "R", "transform", "foldIndices", "initial", "operation", "Lkotlin/Function2;", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "forEachIndices", "", "action", "mapIndices", "mapNotNullValues", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "removeIfIndices", "", "MultiList", "Lkotlin/Pair;", "MultiMutableList", "coil-base_release"}, k = 2, mv = {1, 4, 0})
/* renamed from: coil.util.-Collections */
/* loaded from: classes2.dex */
public final class Collections {
    public static final <T> void forEachIndices(List<? extends T> forEachIndices, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndices, "$this$forEachIndices");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = forEachIndices.size();
        for (int i = 0; i < size; i++) {
            action.invoke((T) forEachIndices.get(i));
        }
    }

    public static final <R, T> List<T> mapIndices(List<? extends R> mapIndices, Function1<? super R, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(mapIndices, "$this$mapIndices");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(mapIndices.size());
        int size = mapIndices.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(transform.invoke((R) mapIndices.get(i)));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final <T> T findIndices(List<? extends T> findIndices, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findIndices, "$this$findIndices");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = findIndices.size();
        for (int i = 0; i < size; i++) {
            T t = findIndices.get(i);
            if (predicate.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    public static final <T, R> R foldIndices(List<? extends T> foldIndices, R r, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndices, "$this$foldIndices");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = foldIndices.size();
        for (int i = 0; i < size; i++) {
            r = operation.invoke(r, (T) foldIndices.get(i));
        }
        return r;
    }

    public static final <R, T> T firstNotNullIndices(List<? extends R> firstNotNullIndices, Function1<? super R, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(firstNotNullIndices, "$this$firstNotNullIndices");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = firstNotNullIndices.size();
        for (int i = 0; i < size; i++) {
            T invoke = transform.invoke((R) firstNotNullIndices.get(i));
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    public static final <T> void removeIfIndices(List<T> removeIfIndices, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(removeIfIndices, "$this$removeIfIndices");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = removeIfIndices.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = i2 - i;
            if (predicate.invoke(removeIfIndices.get(i3)).booleanValue()) {
                removeIfIndices.remove(i3);
                i++;
            }
        }
    }

    public static final <K, V, R> Map<K, R> mapNotNullValues(Map<K, ? extends V> mapNotNullValues, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapNotNullValues, "$this$mapNotNullValues");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : mapNotNullValues.entrySet()) {
            R invoke = transform.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        return linkedHashMap;
    }
}
