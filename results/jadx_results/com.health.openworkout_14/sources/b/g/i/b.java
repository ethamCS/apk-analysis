package b.g.i;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import b.g.d.c.f;
import b.g.e.k;
import b.g.i.c;
import b.g.k.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    static final b.d.e<String, Typeface> f2410a = new b.d.e<>(16);

    /* renamed from: b */
    private static final b.g.i.c f2411b = new b.g.i.c("fonts", 10, 10000);

    /* renamed from: c */
    static final Object f2412c = new Object();

    /* renamed from: d */
    static final b.d.g<String, ArrayList<c.d<g>>> f2413d = new b.d.g<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f2414e = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<g> {

        /* renamed from: a */
        final /* synthetic */ Context f2415a;

        /* renamed from: b */
        final /* synthetic */ b.g.i.a f2416b;

        /* renamed from: c */
        final /* synthetic */ int f2417c;

        /* renamed from: d */
        final /* synthetic */ String f2418d;

        a(Context context, b.g.i.a aVar, int i, String str) {
            this.f2415a = context;
            this.f2416b = aVar;
            this.f2417c = i;
            this.f2418d = str;
        }

        /* renamed from: a */
        public g call() {
            g f2 = b.f(this.f2415a, this.f2416b, this.f2417c);
            Typeface typeface = f2.f2429a;
            if (typeface != null) {
                b.f2410a.d(this.f2418d, typeface);
            }
            return f2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.g.i.b$b */
    /* loaded from: classes.dex */
    public class C0046b implements c.d<g> {

        /* renamed from: a */
        final /* synthetic */ f.a f2419a;

        /* renamed from: b */
        final /* synthetic */ Handler f2420b;

        C0046b(f.a aVar, Handler handler) {
            this.f2419a = aVar;
            this.f2420b = handler;
        }

        /* renamed from: b */
        public void a(g gVar) {
            int i;
            f.a aVar;
            if (gVar == null) {
                aVar = this.f2419a;
                i = 1;
            } else {
                i = gVar.f2430b;
                if (i == 0) {
                    this.f2419a.b(gVar.f2429a, this.f2420b);
                    return;
                }
                aVar = this.f2419a;
            }
            aVar.a(i, this.f2420b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements c.d<g> {

        /* renamed from: a */
        final /* synthetic */ String f2421a;

        c(String str) {
            this.f2421a = str;
        }

        /* renamed from: b */
        public void a(g gVar) {
            synchronized (b.f2412c) {
                b.d.g<String, ArrayList<c.d<g>>> gVar2 = b.f2413d;
                ArrayList<c.d<g>> arrayList = gVar2.get(this.f2421a);
                if (arrayList == null) {
                    return;
                }
                gVar2.remove(this.f2421a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).a(gVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Comparator<byte[]> {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length == bArr2.length) {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i = bArr[i3];
                        i2 = bArr2[i3];
                    }
                }
                return 0;
            }
            i = bArr.length;
            i2 = bArr2.length;
            return i - i2;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        private final int f2422a;

        /* renamed from: b */
        private final f[] f2423b;

        public e(int i, f[] fVarArr) {
            this.f2422a = i;
            this.f2423b = fVarArr;
        }

        public f[] a() {
            return this.f2423b;
        }

        public int b() {
            return this.f2422a;
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        private final Uri f2424a;

        /* renamed from: b */
        private final int f2425b;

        /* renamed from: c */
        private final int f2426c;

        /* renamed from: d */
        private final boolean f2427d;

        /* renamed from: e */
        private final int f2428e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            h.c(uri);
            this.f2424a = uri;
            this.f2425b = i;
            this.f2426c = i2;
            this.f2427d = z;
            this.f2428e = i3;
        }

        public int a() {
            return this.f2428e;
        }

        public int b() {
            return this.f2425b;
        }

        public Uri c() {
            return this.f2424a;
        }

        public int d() {
            return this.f2426c;
        }

        public boolean e() {
            return this.f2427d;
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        final Typeface f2429a;

        /* renamed from: b */
        final int f2430b;

        g(Typeface typeface, int i) {
            this.f2429a = typeface;
            this.f2430b = i;
        }
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static e c(Context context, CancellationSignal cancellationSignal, b.g.i.a aVar) {
        ProviderInfo h2 = h(context.getPackageManager(), aVar, context.getResources());
        return h2 == null ? new e(1, null) : new e(0, e(context, aVar, h2.authority, cancellationSignal));
    }

    private static List<List<byte[]>> d(b.g.i.a aVar, Resources resources) {
        return aVar.a() != null ? aVar.a() : b.g.d.c.c.c(resources, aVar.b());
    }

    static f[] e(Context context, b.g.i.a aVar, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, null, cancellationSignal) : context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    arrayList2.add(new f(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (f[]) arrayList.toArray(new f[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    static g f(Context context, b.g.i.a aVar, int i) {
        try {
            e c2 = c(context, null, aVar);
            int i2 = -3;
            if (c2.b() != 0) {
                if (c2.b() == 1) {
                    i2 = -2;
                }
                return new g(null, i2);
            }
            Typeface b2 = b.g.e.d.b(context, null, c2.a(), i);
            if (b2 != null) {
                i2 = 0;
            }
            return new g(b2, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    public static Typeface g(Context context, b.g.i.a aVar, f.a aVar2, Handler handler, boolean z, int i, int i2) {
        String str = aVar.c() + "-" + i2;
        Typeface c2 = f2410a.c(str);
        if (c2 != null) {
            if (aVar2 != null) {
                aVar2.d(c2);
            }
            return c2;
        } else if (z && i == -1) {
            g f2 = f(context, aVar, i2);
            if (aVar2 != null) {
                int i3 = f2.f2430b;
                if (i3 == 0) {
                    aVar2.b(f2.f2429a, handler);
                } else {
                    aVar2.a(i3, handler);
                }
            }
            return f2.f2429a;
        } else {
            a aVar3 = new a(context, aVar, i2, str);
            if (z) {
                try {
                    return ((g) f2411b.e(aVar3, i)).f2429a;
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            C0046b c0046b = aVar2 == null ? null : new C0046b(aVar2, handler);
            synchronized (f2412c) {
                b.d.g<String, ArrayList<c.d<g>>> gVar = f2413d;
                ArrayList<c.d<g>> arrayList = gVar.get(str);
                if (arrayList != null) {
                    if (c0046b != null) {
                        arrayList.add(c0046b);
                    }
                    return null;
                }
                if (c0046b != null) {
                    ArrayList<c.d<g>> arrayList2 = new ArrayList<>();
                    arrayList2.add(c0046b);
                    gVar.put(str, arrayList2);
                }
                f2411b.d(aVar3, new c(str));
                return null;
            }
        }
    }

    public static ProviderInfo h(PackageManager packageManager, b.g.i.a aVar, Resources resources) {
        String d2 = aVar.d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d2, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d2);
        } else if (!resolveContentProvider.packageName.equals(aVar.e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + d2 + ", but package was not " + aVar.e());
        } else {
            List<byte[]> a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, f2414e);
            List<List<byte[]>> d3 = d(aVar, resources);
            for (int i = 0; i < d3.size(); i++) {
                ArrayList arrayList = new ArrayList(d3.get(i));
                Collections.sort(arrayList, f2414e);
                if (b(a2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
    }

    public static Map<Uri, ByteBuffer> i(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.a() == 0) {
                Uri c2 = fVar.c();
                if (!hashMap.containsKey(c2)) {
                    hashMap.put(c2, k.f(context, cancellationSignal, c2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
