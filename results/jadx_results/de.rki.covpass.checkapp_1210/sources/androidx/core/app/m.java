package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a */
    private final Context f3377a;

    /* renamed from: b */
    private final Intent f3378b;

    /* renamed from: c */
    private ArrayList<String> f3379c;

    /* renamed from: d */
    private ArrayList<String> f3380d;

    /* renamed from: e */
    private ArrayList<String> f3381e;

    /* renamed from: f */
    private ArrayList<Uri> f3382f;

    public m(Context context) {
        Activity activity;
        this.f3377a = (Context) androidx.core.util.h.g(context);
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.f3378b = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.addFlags(524288);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            this.f3378b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            this.f3378b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }

    private void b(String str, ArrayList<String> arrayList) {
        String[] stringArrayExtra = this.f3378b.getStringArrayExtra(str);
        int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
        String[] strArr = new String[arrayList.size() + length];
        arrayList.toArray(strArr);
        if (stringArrayExtra != null) {
            System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
        }
        this.f3378b.putExtra(str, strArr);
    }

    public m a(Uri uri) {
        if (this.f3382f == null) {
            this.f3382f = new ArrayList<>();
        }
        this.f3382f.add(uri);
        return this;
    }

    public Intent c() {
        ArrayList<String> arrayList = this.f3379c;
        if (arrayList != null) {
            b("android.intent.extra.EMAIL", arrayList);
            this.f3379c = null;
        }
        ArrayList<String> arrayList2 = this.f3380d;
        if (arrayList2 != null) {
            b("android.intent.extra.CC", arrayList2);
            this.f3380d = null;
        }
        ArrayList<String> arrayList3 = this.f3381e;
        if (arrayList3 != null) {
            b("android.intent.extra.BCC", arrayList3);
            this.f3381e = null;
        }
        ArrayList<Uri> arrayList4 = this.f3382f;
        boolean z10 = true;
        if (arrayList4 == null || arrayList4.size() <= 1) {
            z10 = false;
        }
        if (!z10) {
            this.f3378b.setAction("android.intent.action.SEND");
            ArrayList<Uri> arrayList5 = this.f3382f;
            if (arrayList5 == null || arrayList5.isEmpty()) {
                this.f3378b.removeExtra("android.intent.extra.STREAM");
                l.c(this.f3378b);
                return this.f3378b;
            }
            this.f3378b.putExtra("android.intent.extra.STREAM", this.f3382f.get(0));
        } else {
            this.f3378b.setAction("android.intent.action.SEND_MULTIPLE");
            this.f3378b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f3382f);
        }
        l.b(this.f3378b, this.f3382f);
        return this.f3378b;
    }

    public m d(Uri uri) {
        this.f3382f = null;
        if (uri != null) {
            a(uri);
        }
        return this;
    }

    public m e(String str) {
        this.f3378b.setType(str);
        return this;
    }
}
