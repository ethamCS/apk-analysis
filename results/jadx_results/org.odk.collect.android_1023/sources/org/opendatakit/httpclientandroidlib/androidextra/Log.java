package org.opendatakit.httpclientandroidlib.androidextra;
/* loaded from: classes.dex */
public class Log {
    private boolean debugEnabled;
    private boolean errorEnabled;
    private boolean infoEnabled;
    private String logTag;
    private boolean traceEnabled;
    private boolean warnEnabled;

    public Log(String name, Log parent) {
        this.logTag = name;
        if (parent != null) {
            this.debugEnabled = parent.debugEnabled;
            this.errorEnabled = parent.errorEnabled;
            this.traceEnabled = parent.traceEnabled;
            this.warnEnabled = parent.warnEnabled;
            this.infoEnabled = parent.infoEnabled;
            return;
        }
        this.debugEnabled = false;
        this.errorEnabled = false;
        this.traceEnabled = false;
        this.warnEnabled = false;
        this.infoEnabled = false;
    }

    public void enableDebug(boolean enable) {
        this.debugEnabled = enable;
    }

    public boolean isDebugEnabled() {
        return this.debugEnabled;
    }

    public void debug(Object message) {
        if (isDebugEnabled()) {
            android.util.Log.d(this.logTag, message.toString());
        }
    }

    public void debug(Object message, Throwable t) {
        if (isDebugEnabled()) {
            android.util.Log.d(this.logTag, message.toString(), t);
        }
    }

    public void enableError(boolean enable) {
        this.errorEnabled = enable;
    }

    public boolean isErrorEnabled() {
        return this.errorEnabled;
    }

    public void error(Object message) {
        if (isErrorEnabled()) {
            android.util.Log.e(this.logTag, message.toString());
        }
    }

    public void error(Object message, Throwable t) {
        if (isErrorEnabled()) {
            android.util.Log.e(this.logTag, message.toString(), t);
        }
    }

    public void enableWarn(boolean enable) {
        this.warnEnabled = enable;
    }

    public boolean isWarnEnabled() {
        return this.warnEnabled;
    }

    public void warn(Object message) {
        if (isWarnEnabled()) {
            android.util.Log.w(this.logTag, message.toString());
        }
    }

    public void warn(Object message, Throwable t) {
        if (isWarnEnabled()) {
            android.util.Log.w(this.logTag, message.toString(), t);
        }
    }

    public void enableInfo(boolean enable) {
        this.infoEnabled = enable;
    }

    public boolean isInfoEnabled() {
        return this.infoEnabled;
    }

    public void info(Object message) {
        if (isInfoEnabled()) {
            android.util.Log.i(this.logTag, message.toString());
        }
    }

    public void info(Object message, Throwable t) {
        if (isInfoEnabled()) {
            android.util.Log.i(this.logTag, message.toString(), t);
        }
    }

    public void enableTrace(boolean enable) {
        this.traceEnabled = enable;
    }

    public boolean isTraceEnabled() {
        return this.traceEnabled;
    }

    public void trace(Object message) {
        if (isTraceEnabled()) {
            android.util.Log.i(this.logTag, message.toString());
        }
    }

    public void trace(Object message, Throwable t) {
        if (isTraceEnabled()) {
            android.util.Log.i(this.logTag, message.toString(), t);
        }
    }
}
