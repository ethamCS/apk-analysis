package u1;

import android.app.Notification;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private final int f22553a;

    /* renamed from: b */
    private final int f22554b;

    /* renamed from: c */
    private final Notification f22555c;

    public f(int i10, Notification notification, int i11) {
        this.f22553a = i10;
        this.f22555c = notification;
        this.f22554b = i11;
    }

    public int a() {
        return this.f22554b;
    }

    public Notification b() {
        return this.f22555c;
    }

    public int c() {
        return this.f22553a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f22553a != fVar.f22553a || this.f22554b != fVar.f22554b) {
            return false;
        }
        return this.f22555c.equals(fVar.f22555c);
    }

    public int hashCode() {
        return (((this.f22553a * 31) + this.f22554b) * 31) + this.f22555c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f22553a + ", mForegroundServiceType=" + this.f22554b + ", mNotification=" + this.f22555c + '}';
    }
}
