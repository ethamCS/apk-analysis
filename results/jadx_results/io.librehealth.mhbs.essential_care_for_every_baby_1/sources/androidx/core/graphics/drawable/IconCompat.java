package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
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
    public int f229a;

    /* renamed from: b */
    Object f230b;

    /* renamed from: c */
    public byte[] f231c;

    /* renamed from: d */
    public Parcelable f232d;

    /* renamed from: e */
    public int f233e;
    public int f;
    public ColorStateList g;
    PorterDuff.Mode h;
    public String i;

    public IconCompat() {
        this.f229a = -1;
        this.f231c = null;
        this.f232d = null;
        this.f233e = 0;
        this.f = 0;
        this.g = null;
        this.h = j;
        this.i = null;
    }

    private IconCompat(int i) {
        this.f229a = -1;
        this.f231c = null;
        this.f232d = null;
        this.f233e = 0;
        this.f = 0;
        this.g = null;
        this.h = j;
        this.i = null;
        this.f229a = i;
    }

    static Bitmap b(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat c(Context context, int i) {
        if (context != null) {
            return d(context.getResources(), context.getPackageName(), i);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public static IconCompat d(Resources resources, String str, int i) {
        if (str != null) {
            if (i == 0) {
                throw new IllegalArgumentException("Drawable resource ID must not be 0");
            }
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f233e = i;
            if (resources != null) {
                try {
                    iconCompat.f230b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f230b = str;
            }
            return iconCompat;
        }
        throw new IllegalArgumentException("Package must not be null.");
    }

    private static int f(Icon icon) {
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

    private static String h(Icon icon) {
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

    private static Resources i(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo == null) {
                return null;
            }
            return packageManager.getResourcesForApplication(applicationInfo);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e2);
            return null;
        }
    }

    private static int k(Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e4) {
            e = e4;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        }
    }

    private static Uri m(Icon icon) {
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

    private InputStream n(Context context) {
        StringBuilder sb;
        String str;
        Uri l = l();
        String scheme = l.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(l);
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f230b));
            } catch (FileNotFoundException e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(l);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    private Drawable p(Context context) {
        switch (this.f229a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f230b);
            case 2:
                String g = g();
                if (TextUtils.isEmpty(g)) {
                    g = context.getPackageName();
                }
                try {
                    return b.c.f.c.a.a(i(context, g), this.f233e, context.getTheme());
                } catch (RuntimeException e2) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f233e), this.f230b), e2);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f230b, this.f233e, this.f));
            case 4:
                InputStream n = n(context);
                if (n != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(n));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), b((Bitmap) this.f230b, false));
            case 6:
                InputStream n2 = n(context);
                if (n2 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? new AdaptiveIconDrawable(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(n2))) : new BitmapDrawable(context.getResources(), b(BitmapFactory.decodeStream(n2), false));
                }
                break;
        }
        return null;
    }

    private static String u(int i) {
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

    public void a(Context context) {
        if (this.f229a == 2) {
            String str = (String) this.f230b;
            if (!str.contains(":")) {
                return;
            }
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            int identifier = i(context, str5).getIdentifier(str4, str3, str5);
            if (this.f233e == identifier) {
                return;
            }
            Log.i("IconCompat", "Id has changed for " + str5 + "/" + str4);
            this.f233e = identifier;
        }
    }

    public int e() {
        int i = this.f229a;
        if (i != -1 || Build.VERSION.SDK_INT < 23) {
            if (i == 2) {
                return this.f233e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        return f((Icon) this.f230b);
    }

    public String g() {
        int i = this.f229a;
        if (i != -1 || Build.VERSION.SDK_INT < 23) {
            if (i == 2) {
                return ((String) this.f230b).split(":", -1)[0];
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return h((Icon) this.f230b);
    }

    public int j() {
        int i = this.f229a;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : k((Icon) this.f230b);
    }

    public Uri l() {
        int i = this.f229a;
        if (i != -1 || Build.VERSION.SDK_INT < 23) {
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.f230b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        return m((Icon) this.f230b);
    }

    public Drawable o(Context context) {
        a(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return t(context).loadDrawable(context);
        }
        Drawable p = p(context);
        if (p != null && (this.g != null || this.h != j)) {
            p.mutate();
            a.a(p, this.g);
            a.b(p, this.h);
        }
        return p;
    }

    public void q() {
        Parcelable parcelable;
        this.h = PorterDuff.Mode.valueOf(this.i);
        switch (this.f229a) {
            case -1:
                parcelable = this.f232d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f232d;
                if (parcelable == null) {
                    byte[] bArr = this.f231c;
                    this.f230b = bArr;
                    this.f229a = 3;
                    this.f233e = 0;
                    this.f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                this.f230b = new String(this.f231c, Charset.forName("UTF-16"));
                return;
            case 3:
                this.f230b = this.f231c;
                return;
        }
        this.f230b = parcelable;
    }

    public void r(boolean z) {
        this.i = this.h.name();
        switch (this.f229a) {
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
                    ((Bitmap) this.f230b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f231c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f231c = ((String) this.f230b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f231c = (byte[]) this.f230b;
                return;
            case 4:
            case 6:
                this.f231c = this.f230b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f232d = (Parcelable) this.f230b;
    }

    @Deprecated
    public Icon s() {
        return t(null);
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
        r5 = b(r5, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Icon t(android.content.Context r5) {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r4.f229a
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
            java.io.InputStream r5 = r4.n(r5)
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
            android.net.Uri r1 = r4.l()
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
            android.net.Uri r1 = r4.l()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L57:
            java.lang.Object r5 = r4.f230b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r0 < r3) goto L62
        L5d:
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5)
            goto L90
        L62:
            android.graphics.Bitmap r5 = b(r5, r2)
            goto L8c
        L67:
            java.lang.Object r5 = r4.f230b
            java.lang.String r5 = (java.lang.String) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
            goto L90
        L70:
            java.lang.Object r5 = r4.f230b
            byte[] r5 = (byte[]) r5
            int r0 = r4.f233e
            int r1 = r4.f
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
            goto L90
        L7d:
            java.lang.String r5 = r4.g()
            int r0 = r4.f233e
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
            goto L90
        L88:
            java.lang.Object r5 = r4.f230b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L8c:
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
        L90:
            android.content.res.ColorStateList r0 = r4.g
            if (r0 == 0) goto L97
            r5.setTintList(r0)
        L97:
            android.graphics.PorterDuff$Mode r0 = r4.h
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.j
            if (r0 == r1) goto La0
            r5.setTintMode(r0)
        La0:
            return r5
        La1:
            java.lang.Object r5 = r4.f230b
            android.graphics.drawable.Icon r5 = (android.graphics.drawable.Icon) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.t(android.content.Context):android.graphics.drawable.Icon");
    }

    public String toString() {
        int i;
        if (this.f229a == -1) {
            return String.valueOf(this.f230b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(u(this.f229a));
        switch (this.f229a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f230b).getWidth());
                sb.append("x");
                i = ((Bitmap) this.f230b).getHeight();
                sb.append(i);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(g());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f233e);
                if (this.f != 0) {
                    sb.append(" off=");
                    i = this.f;
                    sb.append(i);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f230b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != j) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}
