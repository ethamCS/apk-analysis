package androidx.camera.core;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes.dex */
public final /* synthetic */ class n implements RejectedExecutionHandler {

    /* renamed from: a */
    public static final /* synthetic */ n f2411a = new n();

    private /* synthetic */ n() {
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        s1.c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
