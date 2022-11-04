package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    private final Object f3642a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final e f3643a;

        a(e eVar) {
            this.f3643a = eVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            d b10 = this.f3643a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.x0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<d> c10 = this.f3643a.c(str, i10);
            if (c10 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c10.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(c10.get(i11).x0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f3643a.f(i10, i11, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends a {
        b(e eVar) {
            super(eVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            d d10 = this.f3643a.d(i10);
            if (d10 == null) {
                return null;
            }
            return d10.x0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends b {
        c(e eVar) {
            super(eVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f3643a.a(i10, d.y0(accessibilityNodeInfo), str, bundle);
        }
    }

    public e() {
        this.f3642a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public e(Object obj) {
        this.f3642a = obj;
    }

    public void a(int i10, d dVar, String str, Bundle bundle) {
    }

    public d b(int i10) {
        return null;
    }

    public List<d> c(String str, int i10) {
        return null;
    }

    public d d(int i10) {
        return null;
    }

    public Object e() {
        return this.f3642a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }
}
