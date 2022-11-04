package a.m;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
/* loaded from: classes.dex */
class h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f350a;

    /* renamed from: b */
    private final PathMeasure f351b;

    /* renamed from: c */
    private final float f352c;
    private final float[] d = new float[2];
    private final PointF e = new PointF();
    private float f;

    public h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f350a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f351b = pathMeasure;
        this.f352c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public void set(T t, Float f) {
        this.f = f.floatValue();
        this.f351b.getPosTan(this.f352c * f.floatValue(), this.d, null);
        PointF pointF = this.e;
        float[] fArr = this.d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f350a.set(t, pointF);
    }

    @Override // android.util.Property
    public Float get(T t) {
        return Float.valueOf(this.f);
    }
}
