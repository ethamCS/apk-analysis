package w;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends h0 {

    /* renamed from: a */
    private final Executor f24403a;

    /* renamed from: b */
    private final Handler f24404b;

    public a(Executor executor, Handler handler) {
        Objects.requireNonNull(executor, "Null cameraExecutor");
        this.f24403a = executor;
        Objects.requireNonNull(handler, "Null schedulerHandler");
        this.f24404b = handler;
    }

    @Override // w.h0
    public Executor b() {
        return this.f24403a;
    }

    @Override // w.h0
    public Handler c() {
        return this.f24404b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f24403a.equals(h0Var.b()) && this.f24404b.equals(h0Var.c());
    }

    public int hashCode() {
        return ((this.f24403a.hashCode() ^ 1000003) * 1000003) ^ this.f24404b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f24403a + ", schedulerHandler=" + this.f24404b + "}";
    }
}
