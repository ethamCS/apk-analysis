package de.rki.covpass.logging;

import hc.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import timber.log.a;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J,\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lde/rki/covpass/logging/LogRecorder;", "Ltimber/log/a$a;", "Ltb/e0;", "reset", "print", org.conscrypt.BuildConfig.FLAVOR, "priority", org.conscrypt.BuildConfig.FLAVOR, "tag", "message", org.conscrypt.BuildConfig.FLAVOR, "t", "log", org.conscrypt.BuildConfig.FLAVOR, "logs", "Ljava/util/List;", "getLogs", "()Ljava/util/List;", "<init>", "()V", "covpass-logging_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class LogRecorder extends a.C0395a {
    private final List<String> logs = new ArrayList();

    public final List<String> getLogs() {
        return this.logs;
    }

    @Override // timber.log.a.C0395a, timber.log.a.c
    protected void log(int i10, String str, String str2, Throwable th2) {
        t.e(str2, "message");
        List<String> list = this.logs;
        list.add(str + ": " + str2);
    }

    public final void print() {
        for (Object obj : this.logs) {
            System.out.println(obj);
        }
        this.logs.clear();
    }

    public final void reset() {
        this.logs.clear();
    }
}
