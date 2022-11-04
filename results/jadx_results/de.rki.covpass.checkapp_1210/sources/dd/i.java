package dd;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class i {
    public static final e a(Annotation[] annotationArr, wd.c cVar) {
        Annotation annotation;
        hc.t.e(annotationArr, "<this>");
        hc.t.e(cVar, "fqName");
        int length = annotationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i10];
            if (hc.t.a(d.a(fc.a.b(fc.a.a(annotation))).b(), cVar)) {
                break;
            }
            i10++;
        }
        if (annotation != null) {
            return new e(annotation);
        }
        return null;
    }

    public static final List<e> b(Annotation[] annotationArr) {
        hc.t.e(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new e(annotation));
        }
        return arrayList;
    }
}
