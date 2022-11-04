package org.junit.runners.model;
/* loaded from: classes3.dex */
public interface RunnerScheduler {
    void finished();

    void schedule(Runnable runnable);
}
