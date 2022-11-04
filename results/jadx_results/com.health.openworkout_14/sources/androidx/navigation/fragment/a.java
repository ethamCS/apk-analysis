package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.navigation.l;
import androidx.navigation.u;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
@u.b("fragment")
/* loaded from: classes.dex */
public class a extends u<C0021a> {

    /* renamed from: a */
    private final Context f1309a;

    /* renamed from: b */
    private final m f1310b;

    /* renamed from: c */
    private final int f1311c;

    /* renamed from: d */
    private ArrayDeque<Integer> f1312d = new ArrayDeque<>();

    /* renamed from: androidx.navigation.fragment.a$a */
    /* loaded from: classes.dex */
    public static class C0021a extends l {
        private String j;

        public C0021a(u<? extends C0021a> uVar) {
            super(uVar);
        }

        @Override // androidx.navigation.l
        public void n(Context context, AttributeSet attributeSet) {
            super.n(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, c.f1316c);
            String string = obtainAttributes.getString(c.f1317d);
            if (string != null) {
                u(string);
            }
            obtainAttributes.recycle();
        }

        public final String t() {
            String str = this.j;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Fragment class was not set");
        }

        @Override // androidx.navigation.l
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.j;
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            return sb.toString();
        }

        public final C0021a u(String str) {
            this.j = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements u.a {

        /* renamed from: a */
        private final LinkedHashMap<View, String> f1313a;

        public Map<View, String> a() {
            return Collections.unmodifiableMap(this.f1313a);
        }
    }

    public a(Context context, m mVar, int i) {
        this.f1309a = context;
        this.f1310b = mVar;
        this.f1311c = i;
    }

    private String g(int i, int i2) {
        return i + "-" + i2;
    }

    @Override // androidx.navigation.u
    public void c(Bundle bundle) {
        int[] intArray;
        if (bundle == null || (intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds")) == null) {
            return;
        }
        this.f1312d.clear();
        for (int i : intArray) {
            this.f1312d.add(Integer.valueOf(i));
        }
    }

    @Override // androidx.navigation.u
    public Bundle d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f1312d.size()];
        Iterator<Integer> it = this.f1312d.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // androidx.navigation.u
    public boolean e() {
        if (this.f1312d.isEmpty()) {
            return false;
        }
        if (this.f1310b.t0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        this.f1310b.E0(g(this.f1312d.size(), this.f1312d.peekLast().intValue()), 1);
        this.f1312d.removeLast();
        return true;
    }

    /* renamed from: f */
    public C0021a a() {
        return new C0021a(this);
    }

    @Deprecated
    public Fragment h(Context context, m mVar, String str, Bundle bundle) {
        return mVar.e0().a(context.getClassLoader(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134 A[RETURN] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.navigation.l b(androidx.navigation.fragment.a.C0021a r9, android.os.Bundle r10, androidx.navigation.r r11, androidx.navigation.u.a r12) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.a.b(androidx.navigation.fragment.a$a, android.os.Bundle, androidx.navigation.r, androidx.navigation.u$a):androidx.navigation.l");
    }
}
