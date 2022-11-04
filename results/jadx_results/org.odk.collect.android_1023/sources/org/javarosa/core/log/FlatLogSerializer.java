package org.javarosa.core.log;
/* loaded from: classes.dex */
public class FlatLogSerializer implements IFullLogSerializer<String> {
    private String serializeLog(LogEntry logEntry) {
        return "[" + logEntry.getType() + "] " + logEntry.getTime().toString() + ": " + logEntry.message + "\n";
    }

    @Override // org.javarosa.core.log.IFullLogSerializer
    public String serializeLogs(LogEntry[] logEntryArr) {
        String str = "";
        for (int i = 0; i < logEntryArr.length; i++) {
            str = str + serializeLog(logEntryArr[i]);
        }
        return str;
    }
}
