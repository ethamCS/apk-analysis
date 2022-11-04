package g;

import java.lang.annotation.Annotation;
/* loaded from: classes.dex */
final class x implements w {

    /* renamed from: a */
    private static final w f4643a = new x();

    x() {
    }

    public static Annotation[] a(Annotation[] annotationArr) {
        if (y.l(annotationArr, w.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f4643a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return w.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof w;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + w.class.getName() + "()";
    }
}
