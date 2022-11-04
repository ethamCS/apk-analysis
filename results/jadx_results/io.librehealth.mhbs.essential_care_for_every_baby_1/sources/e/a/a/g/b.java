package e.a.a.g;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class b extends l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f839a;

        static {
            int[] iArr = new int[e.a.a.e.e.e.values().length];
            f839a = iArr;
            try {
                iArr[e.a.a.e.e.e.Resource.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f839a[e.a.a.e.e.e.File.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f839a[e.a.a.e.e.e.Asset.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f839a[e.a.a.e.e.e.Network.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f839a[e.a.a.e.e.e.Unknown.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static String a(String str) {
        if (str != null) {
            Pattern compile = Pattern.compile("^https?:\\/\\/", 2);
            Pattern compile2 = Pattern.compile("^(asset:\\/\\/)(.*)", 2);
            Pattern compile3 = Pattern.compile("^(file:\\/\\/)(.*)", 2);
            Pattern compile4 = Pattern.compile("^(resource:\\/\\/)(.*)", 2);
            if (compile.matcher(str).find()) {
                return str;
            }
            if (compile2.matcher(str).find()) {
                return compile2.matcher(str).replaceAll("$2");
            }
            if (compile3.matcher(str).find()) {
                return compile3.matcher(str).replaceAll("/$2");
            }
            if (!compile4.matcher(str).find()) {
                return null;
            }
            return compile4.matcher(str).replaceAll("$2");
        }
        return null;
    }

    public static Bitmap e(Context context, String str) {
        InputStream inputStream;
        String a2 = a(str);
        if (a2 == null) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                AssetManager assets = context.getAssets();
                inputStream = assets.open("flutter_assets/" + a2);
            } else {
                inputStream = context.getAssets().openFd(io.flutter.view.d.a(a2)).createInputStream();
            }
            return BitmapFactory.decodeStream(inputStream);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static Bitmap f(String str) {
        try {
            return BitmapFactory.decodeFile(new File(a(str)).getAbsolutePath());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Bitmap g(Context context, String str) {
        int j = j(context, str);
        if (j <= 0) {
            return null;
        }
        return BitmapFactory.decodeResource(context.getResources(), j);
    }

    public static Bitmap h(Context context, String str) {
        int i = a.f839a[l.b(str).ordinal()];
        if (i != 1) {
            if (i == 2) {
                return f(str);
            }
            if (i == 3) {
                return e(context, str);
            }
            if (i == 4) {
                return i(a(str));
            }
            return null;
        }
        return g(context, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.InputStream] */
    private static Bitmap i(String str) {
        BufferedInputStream bufferedInputStream;
        Exception e2;
        BufferedInputStream bufferedInputStream2;
        Throwable th;
        ?? e3 = a(str);
        Bitmap bitmap = null;
        try {
            try {
                try {
                    URLConnection openConnection = new URL(e3).openConnection();
                    openConnection.connect();
                    e3 = openConnection.getInputStream();
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    bufferedInputStream2 = new BufferedInputStream(e3, 8192);
                    try {
                        bitmap = BitmapFactory.decodeStream(bufferedInputStream2);
                        try {
                            bufferedInputStream2.close();
                            bufferedInputStream = bufferedInputStream2;
                        } catch (IOException e4) {
                            e4.printStackTrace();
                            bufferedInputStream = e4;
                        }
                    } catch (Exception e5) {
                        e2 = e5;
                        e2.printStackTrace();
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream2 != null) {
                            try {
                                bufferedInputStream2.close();
                                bufferedInputStream = bufferedInputStream2;
                            } catch (IOException e6) {
                                e6.printStackTrace();
                                bufferedInputStream = e6;
                            }
                        }
                        if (e3 != 0) {
                            e3.close();
                            bufferedInputStream = bufferedInputStream;
                            e3 = e3;
                        }
                        return bitmap;
                    }
                } catch (Exception e7) {
                    e2 = e7;
                    bufferedInputStream2 = null;
                } catch (Throwable th3) {
                    bufferedInputStream = null;
                    th = th3;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    if (e3 != 0) {
                        try {
                            e3.close();
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e10) {
                e2 = e10;
                e3 = 0;
                bufferedInputStream2 = null;
            } catch (Throwable th4) {
                bufferedInputStream = null;
                th = th4;
                e3 = 0;
            }
            if (e3 != 0) {
                e3.close();
                bufferedInputStream = bufferedInputStream;
                e3 = e3;
            }
        } catch (IOException e11) {
            e3 = e11;
            e3.printStackTrace();
        }
        return bitmap;
    }

    public static int j(Context context, String str) {
        String[] split = a(str).split("\\/");
        try {
            String str2 = split[0];
            String str3 = split[1];
            int identifier = context.getResources().getIdentifier(String.format("res_%1s", str3), str2, context.getPackageName());
            return identifier == 0 ? context.getResources().getIdentifier(str3, str2, context.getPackageName()) : identifier;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static Boolean k(Context context, String str) {
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        if (str != null) {
            if (l.d("^https?:\\/\\/", str, bool).booleanValue() || l.c("^file?:\\/\\/", str).booleanValue()) {
                return bool2;
            }
            if (l.c("^resource?:\\/\\/", str).booleanValue()) {
                return l(context, str);
            }
            if (l.c("^asset?:\\/\\/", str).booleanValue()) {
                return bool2;
            }
        }
        return bool;
    }

    private static Boolean l(Context context, String str) {
        if (str != null) {
            return Boolean.valueOf(j(context, str) > 0);
        }
        return Boolean.FALSE;
    }
}
