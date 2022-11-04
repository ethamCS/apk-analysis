package androidx.camera.lifecycle;

import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.v;
import java.util.Objects;
import z.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends LifecycleCameraRepository.a {

    /* renamed from: a */
    private final v f2595a;

    /* renamed from: b */
    private final e.b f2596b;

    public a(v vVar, e.b bVar) {
        Objects.requireNonNull(vVar, "Null lifecycleOwner");
        this.f2595a = vVar;
        Objects.requireNonNull(bVar, "Null cameraId");
        this.f2596b = bVar;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.a
    public e.b b() {
        return this.f2596b;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.a
    public v c() {
        return this.f2595a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.a)) {
            return false;
        }
        LifecycleCameraRepository.a aVar = (LifecycleCameraRepository.a) obj;
        return this.f2595a.equals(aVar.c()) && this.f2596b.equals(aVar.b());
    }

    public int hashCode() {
        return ((this.f2595a.hashCode() ^ 1000003) * 1000003) ^ this.f2596b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f2595a + ", cameraId=" + this.f2596b + "}";
    }
}
