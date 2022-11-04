package b.p;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
/* loaded from: classes.dex */
class h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f2722a;

    /* renamed from: b */
    private final PathMeasure f2723b;

    /* renamed from: c */
    private final float f2724c;

    /* renamed from: d */
    private final float[] f2725d = new float[2];

    /* renamed from: e */
    private final PointF f2726e = new PointF();

    /* renamed from: f */
    private float f2727f;

    public h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f2722a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f2723b = pathMeasure;
        this.f2724c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f2727f);
    }

    /* renamed from: b */
    public void set(T t, Float f2) {
        this.f2727f = f2.floatValue();
        this.f2723b.getPosTan(this.f2724c * f2.floatValue(), this.f2725d, null);
        PointF pointF = this.f2726e;
        float[] fArr = this.f2725d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f2722a.set(t, pointF);
    }
}
