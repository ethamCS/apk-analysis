package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    f f284a;

    public e(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f284a = new g(remoteUserInfo);
    }

    public e(String str, int i, int i2) {
        this.f284a = Build.VERSION.SDK_INT >= 28 ? new g(str, i, i2) : new h(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f284a.equals(((e) obj).f284a);
        }
        return false;
    }

    public int hashCode() {
        return this.f284a.hashCode();
    }
}
