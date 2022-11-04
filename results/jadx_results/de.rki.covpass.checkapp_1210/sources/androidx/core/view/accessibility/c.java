package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;
/* loaded from: classes.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static boolean a(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC0039c(bVar));
        }

        static boolean b(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC0039c(bVar));
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onTouchExplorationStateChanged(boolean z10);
    }

    /* renamed from: androidx.core.view.accessibility.c$c */
    /* loaded from: classes.dex */
    public static final class accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC0039c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        final b f3609a;

        accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC0039c(b bVar) {
            this.f3609a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC0039c) {
                return this.f3609a.equals(((accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC0039c) obj).f3609a);
            }
            return false;
        }

        public int hashCode() {
            return this.f3609a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            this.f3609a.onTouchExplorationStateChanged(z10);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, b bVar) {
        return a.a(accessibilityManager, bVar);
    }

    public static boolean b(AccessibilityManager accessibilityManager, b bVar) {
        return a.b(accessibilityManager, bVar);
    }
}
