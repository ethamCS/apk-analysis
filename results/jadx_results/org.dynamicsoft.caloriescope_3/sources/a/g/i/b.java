package a.g.i;

import a.g.d.c.f;
import a.g.e.i;
import a.g.i.c;
import a.g.k.h;
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
    static final a.d.e<String, Typeface> f188a = new a.d.e<>(16);

    /* renamed from: b */
    private static final a.g.i.c f189b = new a.g.i.c("fonts", 10, 10000);

    /* renamed from: c */
    static final Object f190c = new Object();
    static final a.d.g<String, ArrayList<c.d<g>>> d = new a.d.g<>();
    private static final Comparator<byte[]> e = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Callable<g> {

        /* renamed from: a */
        final /* synthetic */ Context f191a;

        /* renamed from: b */
        final /* synthetic */ a.g.i.a f192b;

        /* renamed from: c */
        final /* synthetic */ int f193c;
        final /* synthetic */ String d;

        a(Context context, a.g.i.a aVar, int i, String str) {
            this.f191a = context;
            this.f192b = aVar;
            this.f193c = i;
            this.d = str;
        }

        @Override // java.util.concurrent.Callable
        public g call() {
            g a2 = b.a(this.f191a, this.f192b, this.f193c);
            Typeface typeface = a2.f202a;
            if (typeface != null) {
                b.f188a.a(this.d, typeface);
            }
            return a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.i.b$b */
    /* loaded from: classes.dex */
    public static class C0009b implements c.d<g> {

        /* renamed from: a */
        final /* synthetic */ f.a f194a;

        /* renamed from: b */
        final /* synthetic */ Handler f195b;

        C0009b(f.a aVar, Handler handler) {
            this.f194a = aVar;
            this.f195b = handler;
        }

        public void a(g gVar) {
            int i;
            f.a aVar;
            if (gVar == null) {
                aVar = this.f194a;
                i = 1;
            } else {
                i = gVar.f203b;
                if (i == 0) {
                    this.f194a.a(gVar.f202a, this.f195b);
                    return;
                }
                aVar = this.f194a;
            }
            aVar.a(i, this.f195b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements c.d<g> {

        /* renamed from: a */
        final /* synthetic */ String f196a;

        c(String str) {
            this.f196a = str;
        }

        public void a(g gVar) {
            synchronized (b.f190c) {
                ArrayList<c.d<g>> arrayList = b.d.get(this.f196a);
                if (arrayList == null) {
                    return;
                }
                b.d.remove(this.f196a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).a(gVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static class d implements Comparator<byte[]> {
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
        private final int f197a;

        /* renamed from: b */
        private final f[] f198b;

        public e(int i, f[] fVarArr) {
            this.f197a = i;
            this.f198b = fVarArr;
        }

        public f[] a() {
            return this.f198b;
        }

        public int b() {
            return this.f197a;
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        private final Uri f199a;

        /* renamed from: b */
        private final int f200b;

        /* renamed from: c */
        private final int f201c;
        private final boolean d;
        private final int e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            h.a(uri);
            this.f199a = uri;
            this.f200b = i;
            this.f201c = i2;
            this.d = z;
            this.e = i3;
        }

        public int a() {
            return this.e;
        }

        public int b() {
            return this.f200b;
        }

        public Uri c() {
            return this.f199a;
        }

        public int d() {
            return this.f201c;
        }

        public boolean e() {
            return this.d;
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        final Typeface f202a;

        /* renamed from: b */
        final int f203b;

        g(Typeface typeface, int i) {
            this.f202a = typeface;
            this.f203b = i;
        }
    }

    public static e a(Context context, CancellationSignal cancellationSignal, a.g.i.a aVar) {
        ProviderInfo a2 = a(context.getPackageManager(), aVar, context.getResources());
        return a2 == null ? new e(1, null) : new e(0, a(context, aVar, a2.authority, cancellationSignal));
    }

    static g a(Context context, a.g.i.a aVar, int i) {
        try {
            e a2 = a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a2.b() != 0) {
                if (a2.b() == 1) {
                    i2 = -2;
                }
                return new g(null, i2);
            }
            Typeface a3 = a.g.e.c.a(context, null, a2.a(), i);
            if (a3 != null) {
                i2 = 0;
            }
            return new g(a3, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    public static ProviderInfo a(PackageManager packageManager, a.g.i.a aVar, Resources resources) {
        String d2 = aVar.d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d2, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d2);
        } else if (!resolveContentProvider.packageName.equals(aVar.e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + d2 + ", but package was not " + aVar.e());
        } else {
            List<byte[]> a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, e);
            List<List<byte[]>> a3 = a(aVar, resources);
            for (int i = 0; i < a3.size(); i++) {
                ArrayList arrayList = new ArrayList(a3.get(i));
                Collections.sort(arrayList, e);
                if (a(a2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
    }

    public static Typeface a(Context context, a.g.i.a aVar, f.a aVar2, Handler handler, boolean z, int i, int i2) {
        String str = aVar.c() + "-" + i2;
        Typeface b2 = f188a.b(str);
        if (b2 != null) {
            if (aVar2 != null) {
                aVar2.a(b2);
            }
            return b2;
        } else if (z && i == -1) {
            g a2 = a(context, aVar, i2);
            if (aVar2 != null) {
                int i3 = a2.f203b;
                if (i3 == 0) {
                    aVar2.a(a2.f202a, handler);
                } else {
                    aVar2.a(i3, handler);
                }
            }
            return a2.f202a;
        } else {
            a aVar3 = new a(context, aVar, i2, str);
            if (z) {
                try {
                    return ((g) f189b.a(aVar3, i)).f202a;
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            C0009b c0009b = aVar2 == null ? null : new C0009b(aVar2, handler);
            synchronized (f190c) {
                ArrayList<c.d<g>> arrayList = d.get(str);
                if (arrayList != null) {
                    if (c0009b != null) {
                        arrayList.add(c0009b);
                    }
                    return null;
                }
                if (c0009b != null) {
                    ArrayList<c.d<g>> arrayList2 = new ArrayList<>();
                    arrayList2.add(c0009b);
                    d.put(str, arrayList2);
                }
                f189b.a(aVar3, new c(str));
                return null;
            }
        }
    }

    private static List<List<byte[]>> a(a.g.i.a aVar, Resources resources) {
        return aVar.a() != null ? aVar.a() : a.g.d.c.c.a(resources, aVar.b());
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static Map<Uri, ByteBuffer> a(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.a() == 0) {
                Uri c2 = fVar.c();
                if (!hashMap.containsKey(c2)) {
                    hashMap.put(c2, i.a(context, cancellationSignal, c2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private static boolean a(List<byte[]> list, List<byte[]> list2) {
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

    static f[] a(Context context, a.g.i.a aVar, String str, CancellationSignal cancellationSignal) {
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
}
