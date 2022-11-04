package s;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final c f21326a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s.a$a */
    /* loaded from: classes.dex */
    public static class C0348a implements c {

        /* renamed from: a */
        private final InputConfiguration f21327a;

        C0348a(Object obj) {
            this.f21327a = (InputConfiguration) obj;
        }

        @Override // s.a.c
        public Object b() {
            return this.f21327a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return Objects.equals(this.f21327a, ((c) obj).b());
        }

        public int hashCode() {
            return this.f21327a.hashCode();
        }

        public String toString() {
            return this.f21327a.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends C0348a {
        b(Object obj) {
            super(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        Object b();
    }

    private a(c cVar) {
        this.f21326a = cVar;
    }

    public static a b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new a(new b(obj)) : new a(new C0348a(obj));
    }

    public Object a() {
        return this.f21326a.b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f21326a.equals(((a) obj).f21326a);
    }

    public int hashCode() {
        return this.f21326a.hashCode();
    }

    public String toString() {
        return this.f21326a.toString();
    }
}
