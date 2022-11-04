package b.c.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import b.c.a.s;
/* loaded from: classes.dex */
public class l extends a<ImageView> {
    e m;

    public l(s sVar, ImageView imageView, v vVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, e eVar, boolean z) {
        super(sVar, imageView, vVar, i, i2, i3, drawable, str, obj, z);
        this.m = eVar;
    }

    @Override // b.c.a.a
    public void a() {
        super.a();
        if (this.m != null) {
            this.m = null;
        }
    }

    @Override // b.c.a.a
    public void a(Bitmap bitmap, s.e eVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f1269c.get();
            if (imageView == null) {
                return;
            }
            s sVar = this.f1267a;
            t.a(imageView, sVar.e, bitmap, eVar, this.d, sVar.m);
            e eVar2 = this.m;
            if (eVar2 == null) {
                return;
            }
            eVar2.a();
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // b.c.a.a
    public void b() {
        ImageView imageView = (ImageView) this.f1269c.get();
        if (imageView == null) {
            return;
        }
        int i = this.g;
        if (i != 0) {
            imageView.setImageResource(i);
        } else {
            Drawable drawable = this.h;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        e eVar = this.m;
        if (eVar == null) {
            return;
        }
        eVar.b();
    }
}
