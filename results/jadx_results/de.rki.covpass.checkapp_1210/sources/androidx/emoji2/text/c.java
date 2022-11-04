package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final b f3816a;

        public a(b bVar) {
            this.f3816a = bVar == null ? e() : bVar;
        }

        private d.c a(Context context, androidx.core.provider.e eVar) {
            if (eVar == null) {
                return null;
            }
            return new i(context, eVar);
        }

        private List<List<byte[]>> b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        private androidx.core.provider.e d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new androidx.core.provider.e(str, str2, "emojicompat-emoji-font", b(this.f3816a.b(packageManager, str2)));
        }

        private static b e() {
            return Build.VERSION.SDK_INT >= 28 ? new d() : new C0045c();
        }

        private boolean f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        private ProviderInfo g(PackageManager packageManager) {
            for (ResolveInfo resolveInfo : this.f3816a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                ProviderInfo a10 = this.f3816a.a(resolveInfo);
                if (f(a10)) {
                    return a10;
                }
            }
            return null;
        }

        public d.c c(Context context) {
            return a(context, h(context));
        }

        androidx.core.provider.e h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            androidx.core.util.h.h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g10 = g(packageManager);
            if (g10 == null) {
                return null;
            }
            try {
                return d(g10, packageManager);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            throw null;
        }

        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i10) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.c$c */
    /* loaded from: classes.dex */
    public static class C0045c extends b {
        @Override // androidx.emoji2.text.c.b
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.c.b
        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i10) {
            return packageManager.queryIntentContentProviders(intent, i10);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends C0045c {
        @Override // androidx.emoji2.text.c.b
        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static i a(Context context) {
        return (i) new a(null).c(context);
    }
}
