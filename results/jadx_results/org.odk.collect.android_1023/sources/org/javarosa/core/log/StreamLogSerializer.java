package org.javarosa.core.log;

import java.io.IOException;
import org.javarosa.core.util.SortedIntSet;
/* loaded from: classes.dex */
public abstract class StreamLogSerializer {
    Purger purger = null;
    SortedIntSet logIDs = new SortedIntSet();

    /* loaded from: classes.dex */
    public interface Purger {
        void purge(SortedIntSet sortedIntSet);
    }

    protected abstract void serializeLog(LogEntry logEntry) throws IOException;

    public final void serializeLog(int i, LogEntry logEntry) throws IOException {
        this.logIDs.add(i);
        serializeLog(logEntry);
    }

    public void setPurger(Purger purger) {
        this.purger = purger;
    }

    public void purge() {
        this.purger.purge(this.logIDs);
    }
}
