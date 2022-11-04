package i4;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import e4.q;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import q4.d;
import q4.h;
/* loaded from: classes.dex */
public class b {

    /* renamed from: e */
    private static final Object f12311e = new Object();

    /* renamed from: a */
    private final Context f12312a;

    /* renamed from: b */
    private final String f12313b;

    /* renamed from: c */
    private e4.b f12314c;

    /* renamed from: d */
    private final Map<String, q> f12315d;

    public b(Drawable.Callback callback, String str, e4.b bVar, Map<String, q> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            str = str + '/';
        }
        this.f12313b = str;
        if (!(callback instanceof View)) {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.f12315d = new HashMap();
            this.f12312a = null;
            return;
        }
        this.f12312a = ((View) callback).getContext();
        this.f12315d = map;
        d(bVar);
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (f12311e) {
            this.f12315d.get(str).f(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        String str2;
        Bitmap l10;
        q qVar = this.f12315d.get(str);
        if (qVar == null) {
            return null;
        }
        Bitmap a10 = qVar.a();
        if (a10 != null) {
            return a10;
        }
        e4.b bVar = this.f12314c;
        if (bVar != null) {
            Bitmap a11 = bVar.a(qVar);
            if (a11 != null) {
                c(str, a11);
            }
            return a11;
        }
        String b10 = qVar.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!b10.startsWith("data:") || b10.indexOf("base64,") <= 0) {
            try {
                if (TextUtils.isEmpty(this.f12313b)) {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
                AssetManager assets = this.f12312a.getAssets();
                try {
                    l10 = h.l(BitmapFactory.decodeStream(assets.open(this.f12313b + b10), null, options), qVar.e(), qVar.c());
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    str2 = "Unable to decode image.";
                    d.d(str2, e);
                    return null;
                }
            } catch (IOException e11) {
                e = e11;
                str2 = "Unable to open asset.";
            }
        } else {
            try {
                byte[] decode = Base64.decode(b10.substring(b10.indexOf(44) + 1), 0);
                l10 = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            } catch (IllegalArgumentException e12) {
                e = e12;
                str2 = "data URL did not have correct base64 format.";
                d.d(str2, e);
                return null;
            }
        }
        return c(str, l10);
    }

    public boolean b(Context context) {
        return (context == null && this.f12312a == null) || this.f12312a.equals(context);
    }

    public void d(e4.b bVar) {
        this.f12314c = bVar;
    }
}
