package net.lingala.zip4j.tasks;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.progress.ProgressMonitor;
/* loaded from: classes2.dex */
public abstract class AsyncZipTask<T> {
    private final ExecutorService executorService;
    private final ProgressMonitor progressMonitor;
    private final boolean runInThread;

    protected abstract long calculateTotalWork(T t) throws ZipException;

    protected abstract void executeTask(T t, ProgressMonitor progressMonitor) throws IOException;

    protected abstract ProgressMonitor.Task getTask();

    public AsyncZipTask(AsyncTaskParameters asyncTaskParameters) {
        this.progressMonitor = asyncTaskParameters.progressMonitor;
        this.runInThread = asyncTaskParameters.runInThread;
        this.executorService = asyncTaskParameters.executorService;
    }

    public void execute(final T t) throws ZipException {
        if (this.runInThread && ProgressMonitor.State.BUSY.equals(this.progressMonitor.getState())) {
            throw new ZipException("invalid operation - Zip4j is in busy state");
        }
        initProgressMonitor();
        if (this.runInThread) {
            this.progressMonitor.setTotalWork(calculateTotalWork(t));
            this.executorService.execute(new Runnable() { // from class: net.lingala.zip4j.tasks.AsyncZipTask.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AsyncZipTask asyncZipTask = AsyncZipTask.this;
                        asyncZipTask.performTaskWithErrorHandling(t, asyncZipTask.progressMonitor);
                    } catch (ZipException unused) {
                    } catch (Throwable th) {
                        AsyncZipTask.this.executorService.shutdown();
                        throw th;
                    }
                    AsyncZipTask.this.executorService.shutdown();
                }
            });
            return;
        }
        performTaskWithErrorHandling(t, this.progressMonitor);
    }

    public void performTaskWithErrorHandling(T t, ProgressMonitor progressMonitor) throws ZipException {
        try {
            executeTask(t, progressMonitor);
            progressMonitor.endProgressMonitor();
        } catch (ZipException e) {
            progressMonitor.endProgressMonitor(e);
            throw e;
        } catch (Exception e2) {
            progressMonitor.endProgressMonitor(e2);
            throw new ZipException(e2);
        }
    }

    public void verifyIfTaskIsCancelled() throws ZipException {
        if (!this.progressMonitor.isCancelAllTasks()) {
            return;
        }
        this.progressMonitor.setResult(ProgressMonitor.Result.CANCELLED);
        this.progressMonitor.setState(ProgressMonitor.State.READY);
        throw new ZipException("Task cancelled", ZipException.Type.TASK_CANCELLED_EXCEPTION);
    }

    private void initProgressMonitor() {
        this.progressMonitor.fullReset();
        this.progressMonitor.setState(ProgressMonitor.State.BUSY);
        this.progressMonitor.setCurrentTask(getTask());
    }

    /* loaded from: classes2.dex */
    public static class AsyncTaskParameters {
        private final ExecutorService executorService;
        private final ProgressMonitor progressMonitor;
        private final boolean runInThread;

        public AsyncTaskParameters(ExecutorService executorService, boolean z, ProgressMonitor progressMonitor) {
            this.executorService = executorService;
            this.runInThread = z;
            this.progressMonitor = progressMonitor;
        }
    }
}
