package io.ktor.util.collections;

import fb.u;
import hc.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.z;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u001a/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", BuildConfig.FLAVOR, "values", BuildConfig.FLAVOR, "a", "([Ljava/lang/Object;)Ljava/util/List;", "ktor-utils"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a {
    public static final <T> List<T> a(T... tArr) {
        t.e(tArr, "values");
        if (u.f10140a.c()) {
            b bVar = new b();
            z.y(bVar, tArr);
            return bVar;
        }
        ArrayList arrayList = new ArrayList(tArr.length);
        int i10 = 0;
        int length = tArr.length;
        while (i10 < length) {
            T t10 = tArr[i10];
            i10++;
            arrayList.add(t10);
        }
        return arrayList;
    }
}
