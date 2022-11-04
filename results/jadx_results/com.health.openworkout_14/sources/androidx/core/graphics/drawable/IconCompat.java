package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f928a;

    /* renamed from: b */
    Object f929b;

    /* renamed from: c */
    public byte[] f930c;

    /* renamed from: d */
    public Parcelable f931d;

    /* renamed from: e */
    public int f932e;

    /* renamed from: f */
    public int f933f;

    /* renamed from: g */
    public ColorStateList f934g;

    /* renamed from: h */
    PorterDuff.Mode f935h;
    public String i;

    public IconCompat() {
        this.f928a = -1;
        this.f930c = null;
        this.f931d = null;
        this.f932e = 0;
        this.f933f = 0;
        this.f934g = null;
        this.f935h = j;
        this.i = null;
    }

    private IconCompat(int i) {
        this.f928a = -1;
        this.f930c = null;
        this.f931d = null;
        this.f932e = 0;
        this.f933f = 0;
        this.f934g = null;
        this.f935h = j;
        this.i = null;
        this.f928a = i;
    }

    static Bitmap a(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i) {
        if (str != null) {
            if (i == 0) {
                throw new IllegalArgumentException("Drawable resource ID must not be 0");
            }
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f932e = i;
            if (resources != null) {
                try {
                    iconCompat.f929b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f929b = str;
            }
            return iconCompat;
        }
        throw new IllegalArgumentException("Package must not be null.");
    }

    private static int d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    private static String f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    private static Uri h(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    private InputStream i(Context context) {
        StringBuilder sb;
        String str;
        Uri g2 = g();
        String scheme = g2.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(g2);
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f929b));
            } catch (FileNotFoundException e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(g2);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    private static String n(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int c() {
        int i = this.f928a;
        if (i != -1 || Build.VERSION.SDK_INT < 23) {
            if (i == 2) {
                return this.f932e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        return d((Icon) this.f929b);
    }

    public String e() {
        int i = this.f928a;
        if (i != -1 || Build.VERSION.SDK_INT < 23) {
            if (i == 2) {
                return ((String) this.f929b).split(":", -1)[0];
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return f((Icon) this.f929b);
    }

    public Uri g() {
        int i = this.f928a;
        if (i != -1 || Build.VERSION.SDK_INT < 23) {
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.f929b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        return h((Icon) this.f929b);
    }

    public void j() {
        Parcelable parcelable;
        this.f935h = PorterDuff.Mode.valueOf(this.i);
        switch (this.f928a) {
            case -1:
                parcelable = this.f931d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f931d;
                if (parcelable == null) {
                    byte[] bArr = this.f930c;
                    this.f929b = bArr;
                    this.f928a = 3;
                    this.f932e = 0;
                    this.f933f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                this.f929b = new String(this.f930c, Charset.forName("UTF-16"));
                return;
            case 3:
                this.f929b = this.f930c;
                return;
        }
        this.f929b = parcelable;
    }

    public void k(boolean z) {
        this.i = this.f935h.name();
        switch (this.f928a) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f929b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f930c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f930c = ((String) this.f929b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f930c = (byte[]) this.f929b;
                return;
            case 4:
            case 6:
                this.f930c = this.f929b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f931d = (Parcelable) this.f929b;
    }

    @Deprecated
    public Icon l() {
        return m(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0 >= 26) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r0 >= 26) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
        r5 = a(r5, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Icon m(android.content.Context r5) {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r4.f928a
            r2 = 0
            r3 = 26
            switch(r1) {
                case -1: goto La1;
                case 0: goto La;
                case 1: goto L88;
                case 2: goto L7d;
                case 3: goto L70;
                case 4: goto L67;
                case 5: goto L57;
                case 6: goto L12;
                default: goto La;
            }
        La:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown type"
            r5.<init>(r0)
            throw r5
        L12:
            if (r5 == 0) goto L3c
            java.io.InputStream r5 = r4.i(r5)
            if (r5 == 0) goto L21
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
            if (r0 < r3) goto L62
            goto L5d
        L21:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot load adaptive icon from uri: "
            r0.append(r1)
            android.net.Uri r1 = r4.g()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L3c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            r0.append(r1)
            android.net.Uri r1 = r4.g()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L57:
            java.lang.Object r5 = r4.f929b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r0 < r3) goto L62
        L5d:
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5)
            goto L90
        L62:
            android.graphics.Bitmap r5 = a(r5, r2)
            goto L8c
        L67:
            java.lang.Object r5 = r4.f929b
            java.lang.String r5 = (java.lang.String) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
            goto L90
        L70:
            java.lang.Object r5 = r4.f929b
            byte[] r5 = (byte[]) r5
            int r0 = r4.f932e
            int r1 = r4.f933f
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
            goto L90
        L7d:
            java.lang.String r5 = r4.e()
            int r0 = r4.f932e
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
            goto L90
        L88:
            java.lang.Object r5 = r4.f929b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L8c:
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
        L90:
            android.content.res.ColorStateList r0 = r4.f934g
            if (r0 == 0) goto L97
            r5.setTintList(r0)
        L97:
            android.graphics.PorterDuff$Mode r0 = r4.f935h
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.j
            if (r0 == r1) goto La0
            r5.setTintMode(r0)
        La0:
            return r5
        La1:
            java.lang.Object r5 = r4.f929b
            android.graphics.drawable.Icon r5 = (android.graphics.drawable.Icon) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.m(android.content.Context):android.graphics.drawable.Icon");
    }

    public String toString() {
        int i;
        if (this.f928a == -1) {
            return String.valueOf(this.f929b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(n(this.f928a));
        switch (this.f928a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f929b).getWidth());
                sb.append("x");
                i = ((Bitmap) this.f929b).getHeight();
                sb.append(i);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(e());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f932e);
                if (this.f933f != 0) {
                    sb.append(" off=");
                    i = this.f933f;
                    sb.append(i);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f929b);
                break;
        }
        if (this.f934g != null) {
            sb.append(" tint=");
            sb.append(this.f934g);
        }
        if (this.f935h != j) {
            sb.append(" mode=");
            sb.append(this.f935h);
        }
        sb.append(")");
        return sb.toString();
    }
}
