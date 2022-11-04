package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
@TargetApi(21)
/* loaded from: classes.dex */
class b implements a {

    /* renamed from: a */
    AudioAttributes f1265a;

    /* renamed from: b */
    int f1266b = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f1265a.equals(((b) obj).f1265a);
    }

    public int hashCode() {
        return this.f1265a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1265a;
    }
}
