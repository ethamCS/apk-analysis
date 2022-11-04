package i4;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import j4.i;
import java.util.HashMap;
import java.util.Map;
import q4.d;
/* loaded from: classes.dex */
public class a {

    /* renamed from: d */
    private final AssetManager f12309d;

    /* renamed from: a */
    private final i<String> f12306a = new i<>();

    /* renamed from: b */
    private final Map<i<String>, Typeface> f12307b = new HashMap();

    /* renamed from: c */
    private final Map<String, Typeface> f12308c = new HashMap();

    /* renamed from: e */
    private String f12310e = ".ttf";

    public a(Drawable.Callback callback, e4.a aVar) {
        AssetManager assets;
        if (!(callback instanceof View)) {
            d.c("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        } else {
            assets = ((View) callback).getContext().getAssets();
        }
        this.f12309d = assets;
    }

    private Typeface a(String str) {
        Typeface typeface = this.f12308c.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f12309d, "fonts/" + str + this.f12310e);
        this.f12308c.put(str, createFromAsset);
        return createFromAsset;
    }

    private Typeface d(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i10 = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }

    public Typeface b(String str, String str2) {
        this.f12306a.b(str, str2);
        Typeface typeface = this.f12307b.get(this.f12306a);
        if (typeface != null) {
            return typeface;
        }
        Typeface d10 = d(a(str), str2);
        this.f12307b.put(this.f12306a, d10);
        return d10;
    }

    public void c(e4.a aVar) {
    }
}
