package org.javarosa.core.services;

import java.util.Date;
import org.javarosa.core.api.ILogger;
import org.javarosa.core.log.FatalException;
import org.javarosa.core.log.WrappedException;
import org.javarosa.core.services.properties.JavaRosaPropertyRules;
/* loaded from: classes.dex */
public class Logger {
    public static final int MAX_MSG_LENGTH = 2048;
    private static ILogger logger;

    public static void registerLogger(ILogger iLogger) {
        logger = iLogger;
    }

    public static ILogger _() {
        return logger;
    }

    public static void log(String str, String str2) {
        if (isLoggingEnabled()) {
            logForce(str, str2);
        }
    }

    protected static void logForce(String str, String str2) {
        System.err.println("logger> " + str + ": " + str2);
        if (str2.length() > 2048) {
            System.err.println("  (message truncated)");
        }
        String substring = str2.substring(0, Math.min(str2.length(), (int) MAX_MSG_LENGTH));
        if (logger != null) {
            try {
                logger.log(str, substring, new Date());
            } catch (RuntimeException e) {
                System.err.println("exception when trying to write log message! " + WrappedException.printException(e));
                logger.panic();
            }
        }
    }

    public static boolean isLoggingEnabled() {
        boolean z = false;
        boolean z2 = true;
        try {
            String singularProperty = PropertyManager._().getSingularProperty(JavaRosaPropertyRules.LOGS_ENABLED);
            if (singularProperty != null) {
                if (!singularProperty.equals(JavaRosaPropertyRules.LOGS_ENABLED_YES)) {
                    z2 = false;
                }
            }
        } catch (Exception e) {
            z = true;
        }
        if (z) {
            logForce("log-error", "could not read 'logging enabled' flag");
        }
        return z2;
    }

    public static void exception(Exception exc) {
        exception(null, exc);
    }

    public static void exception(String str, Exception exc) {
        exc.printStackTrace();
        log("exception", (str != null ? str + ": " : "") + WrappedException.printException(exc));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [org.javarosa.core.services.Logger$1] */
    public static void die(String str, Exception exc) {
        exception("unhandled exception at top level", exc);
        exc.printStackTrace();
        final FatalException fatalException = new FatalException("unhandled exception in " + str, exc);
        new Thread() { // from class: org.javarosa.core.services.Logger.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                throw fatalException;
            }
        }.start();
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
        }
        throw fatalException;
    }

    public static void crashTest(String str) {
        if (str == null) {
            str = "shit has hit the fan";
        }
        throw new FatalException(str);
    }

    public static void halt() {
        if (logger != null) {
            logger.halt();
        }
    }
}
