package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.navigation.u;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@u.b("activity")
/* loaded from: classes.dex */
public class b extends u<a> {

    /* renamed from: a */
    private Context f1282a;

    /* renamed from: b */
    private Activity f1283b;

    /* loaded from: classes.dex */
    public static class a extends l {
        private Intent j;
        private String k;

        public a(u<? extends a> uVar) {
            super(uVar);
        }

        public final a A(String str) {
            this.k = str;
            return this;
        }

        public final a B(String str) {
            if (this.j == null) {
                this.j = new Intent();
            }
            this.j.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.l
        public void n(Context context, AttributeSet attributeSet) {
            super.n(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, x.f1391a);
            String string = obtainAttributes.getString(x.f1396f);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            B(string);
            String string2 = obtainAttributes.getString(x.f1392b);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                y(new ComponentName(context, string2));
            }
            x(obtainAttributes.getString(x.f1393c));
            String string3 = obtainAttributes.getString(x.f1394d);
            if (string3 != null) {
                z(Uri.parse(string3));
            }
            A(obtainAttributes.getString(x.f1395e));
            obtainAttributes.recycle();
        }

        @Override // androidx.navigation.l
        boolean s() {
            return false;
        }

        public final String t() {
            Intent intent = this.j;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }

        @Override // androidx.navigation.l
        public String toString() {
            String t;
            ComponentName u = u();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (u == null) {
                t = t();
                if (t != null) {
                    sb.append(" action=");
                }
                return sb.toString();
            }
            sb.append(" class=");
            t = u.getClassName();
            sb.append(t);
            return sb.toString();
        }

        public final ComponentName u() {
            Intent intent = this.j;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        public final String v() {
            return this.k;
        }

        public final Intent w() {
            return this.j;
        }

        public final a x(String str) {
            if (this.j == null) {
                this.j = new Intent();
            }
            this.j.setAction(str);
            return this;
        }

        public final a y(ComponentName componentName) {
            if (this.j == null) {
                this.j = new Intent();
            }
            this.j.setComponent(componentName);
            return this;
        }

        public final a z(Uri uri) {
            if (this.j == null) {
                this.j = new Intent();
            }
            this.j.setData(uri);
            return this;
        }
    }

    /* renamed from: androidx.navigation.b$b */
    /* loaded from: classes.dex */
    public static final class C0020b implements u.a {

        /* renamed from: a */
        private final int f1284a;

        /* renamed from: b */
        private final androidx.core.app.b f1285b;

        public androidx.core.app.b a() {
            return this.f1285b;
        }

        public int b() {
            return this.f1284a;
        }
    }

    public b(Context context) {
        this.f1282a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f1283b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    @Override // androidx.navigation.u
    public boolean e() {
        Activity activity = this.f1283b;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public a a() {
        return new a(this);
    }

    /* renamed from: g */
    public l b(a aVar, Bundle bundle, r rVar, u.a aVar2) {
        androidx.core.app.b a2;
        Intent intent;
        int intExtra;
        if (aVar.w() == null) {
            throw new IllegalStateException("Destination " + aVar.i() + " does not have an Intent set.");
        }
        Intent intent2 = new Intent(aVar.w());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String v = aVar.v();
            if (!TextUtils.isEmpty(v)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(v);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (!bundle.containsKey(group)) {
                        throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + v);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z = aVar2 instanceof C0020b;
        if (z) {
            intent2.addFlags(((C0020b) aVar2).b());
        }
        if (!(this.f1282a instanceof Activity)) {
            intent2.addFlags(268435456);
        }
        if (rVar != null && rVar.g()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.f1283b;
        int i = 0;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar.i());
        if (rVar != null) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", rVar.c());
            intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", rVar.d());
        }
        if (z && (a2 = ((C0020b) aVar2).a()) != null) {
            a2.a();
            throw null;
        }
        this.f1282a.startActivity(intent2);
        if (rVar != null && this.f1283b != null) {
            int a3 = rVar.a();
            int b2 = rVar.b();
            if (a3 != -1 || b2 != -1) {
                if (a3 == -1) {
                    a3 = 0;
                }
                if (b2 != -1) {
                    i = b2;
                }
                this.f1283b.overridePendingTransition(a3, i);
            }
        }
        return null;
    }
}
