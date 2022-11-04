package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
@TargetApi(21)
/* loaded from: classes.dex */
class b implements a {

    /* renamed from: a */
    AudioAttributes f278a;

    /* renamed from: b */
    int f279b = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f278a.equals(((b) obj).f278a);
    }

    public int hashCode() {
        return this.f278a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f278a;
    }
}
