package org.opendatakit.httpclientandroidlib.params;

import java.util.Set;
/* loaded from: classes.dex */
public abstract class AbstractHttpParams implements HttpParams, HttpParamsNames {
    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public long getLongParameter(String name, long defaultValue) {
        Object param = getParameter(name);
        if (param == null) {
            return defaultValue;
        }
        long defaultValue2 = ((Long) param).longValue();
        return defaultValue2;
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public HttpParams setLongParameter(String name, long value) {
        setParameter(name, new Long(value));
        return this;
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public int getIntParameter(String name, int defaultValue) {
        Object param = getParameter(name);
        if (param == null) {
            return defaultValue;
        }
        int defaultValue2 = ((Integer) param).intValue();
        return defaultValue2;
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public HttpParams setIntParameter(String name, int value) {
        setParameter(name, new Integer(value));
        return this;
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public double getDoubleParameter(String name, double defaultValue) {
        Object param = getParameter(name);
        if (param == null) {
            return defaultValue;
        }
        double defaultValue2 = ((Double) param).doubleValue();
        return defaultValue2;
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public HttpParams setDoubleParameter(String name, double value) {
        setParameter(name, new Double(value));
        return this;
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public boolean getBooleanParameter(String name, boolean defaultValue) {
        Object param = getParameter(name);
        if (param == null) {
            return defaultValue;
        }
        boolean defaultValue2 = ((Boolean) param).booleanValue();
        return defaultValue2;
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public HttpParams setBooleanParameter(String name, boolean value) {
        setParameter(name, value ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public boolean isParameterTrue(String name) {
        return getBooleanParameter(name, false);
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParams
    public boolean isParameterFalse(String name) {
        return !getBooleanParameter(name, false);
    }

    @Override // org.opendatakit.httpclientandroidlib.params.HttpParamsNames
    public Set<String> getNames() {
        throw new UnsupportedOperationException();
    }
}
