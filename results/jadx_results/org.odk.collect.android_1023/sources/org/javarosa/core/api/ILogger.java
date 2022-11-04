package org.javarosa.core.api;

import java.io.IOException;
import java.util.Date;
import org.javarosa.core.log.IFullLogSerializer;
import org.javarosa.core.log.StreamLogSerializer;
/* loaded from: classes.dex */
public interface ILogger {
    void clearLogs();

    void halt();

    void log(String str, String str2, Date date);

    int logSize();

    void panic();

    <T> T serializeLogs(IFullLogSerializer<T> iFullLogSerializer);

    void serializeLogs(StreamLogSerializer streamLogSerializer) throws IOException;

    void serializeLogs(StreamLogSerializer streamLogSerializer, int i) throws IOException;
}
