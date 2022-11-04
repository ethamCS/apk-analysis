package org.opendatakit.httpclientandroidlib.impl;

import java.util.HashMap;
import java.util.Map;
import org.opendatakit.httpclientandroidlib.HttpConnectionMetrics;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.io.HttpTransportMetrics;
@NotThreadSafe
/* loaded from: classes.dex */
public class HttpConnectionMetricsImpl implements HttpConnectionMetrics {
    public static final String RECEIVED_BYTES_COUNT = "http.received-bytes-count";
    public static final String REQUEST_COUNT = "http.request-count";
    public static final String RESPONSE_COUNT = "http.response-count";
    public static final String SENT_BYTES_COUNT = "http.sent-bytes-count";
    private final HttpTransportMetrics inTransportMetric;
    private Map<String, Object> metricsCache;
    private final HttpTransportMetrics outTransportMetric;
    private long requestCount = 0;
    private long responseCount = 0;

    public HttpConnectionMetricsImpl(HttpTransportMetrics inTransportMetric, HttpTransportMetrics outTransportMetric) {
        this.inTransportMetric = inTransportMetric;
        this.outTransportMetric = outTransportMetric;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpConnectionMetrics
    public long getReceivedBytesCount() {
        if (this.inTransportMetric != null) {
            return this.inTransportMetric.getBytesTransferred();
        }
        return -1L;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpConnectionMetrics
    public long getSentBytesCount() {
        if (this.outTransportMetric != null) {
            return this.outTransportMetric.getBytesTransferred();
        }
        return -1L;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpConnectionMetrics
    public long getRequestCount() {
        return this.requestCount;
    }

    public void incrementRequestCount() {
        this.requestCount++;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpConnectionMetrics
    public long getResponseCount() {
        return this.responseCount;
    }

    public void incrementResponseCount() {
        this.responseCount++;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpConnectionMetrics
    public Object getMetric(String metricName) {
        Object value = null;
        if (this.metricsCache != null) {
            value = this.metricsCache.get(metricName);
        }
        if (value == null) {
            if (REQUEST_COUNT.equals(metricName)) {
                return new Long(this.requestCount);
            }
            if (RESPONSE_COUNT.equals(metricName)) {
                return new Long(this.responseCount);
            }
            if (RECEIVED_BYTES_COUNT.equals(metricName)) {
                if (this.inTransportMetric == null) {
                    return null;
                }
                return new Long(this.inTransportMetric.getBytesTransferred());
            } else if (SENT_BYTES_COUNT.equals(metricName)) {
                if (this.outTransportMetric == null) {
                    return null;
                }
                return new Long(this.outTransportMetric.getBytesTransferred());
            } else {
                return value;
            }
        }
        return value;
    }

    public void setMetric(String metricName, Object obj) {
        if (this.metricsCache == null) {
            this.metricsCache = new HashMap();
        }
        this.metricsCache.put(metricName, obj);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpConnectionMetrics
    public void reset() {
        if (this.outTransportMetric != null) {
            this.outTransportMetric.reset();
        }
        if (this.inTransportMetric != null) {
            this.inTransportMetric.reset();
        }
        this.requestCount = 0L;
        this.responseCount = 0L;
        this.metricsCache = null;
    }
}
