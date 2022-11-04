package d.a.a.a.l;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f3647b = new e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f3648a = new WeakHashMap<>();

    private e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (!this.f3648a.containsKey(drawable)) {
            return 255;
        }
        return this.f3648a.get(drawable);
    }

    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f3648a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
