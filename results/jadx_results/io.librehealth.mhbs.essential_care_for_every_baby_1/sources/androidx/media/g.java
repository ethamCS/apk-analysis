package androidx.media;

import android.media.session.MediaSessionManager;
/* loaded from: classes.dex */
final class g implements f {

    /* renamed from: a */
    final MediaSessionManager.RemoteUserInfo f285a;

    public g(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f285a = remoteUserInfo;
    }

    public g(String str, int i, int i2) {
        this.f285a = new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f285a.equals(((g) obj).f285a);
        }
        return false;
    }

    public int hashCode() {
        return b.c.g.a.a(this.f285a);
    }
}
