package org.opendatakit.httpclientandroidlib.impl.client;

import java.util.HashMap;
import java.util.Map;
import org.opendatakit.httpclientandroidlib.client.BackoffManager;
import org.opendatakit.httpclientandroidlib.conn.routing.HttpRoute;
import org.opendatakit.httpclientandroidlib.pool.ConnPoolControl;
/* loaded from: classes.dex */
public class AIMDBackoffManager implements BackoffManager {
    private double backoffFactor;
    private int cap;
    private final Clock clock;
    private final ConnPoolControl<HttpRoute> connPerRoute;
    private long coolDown;
    private final Map<HttpRoute, Long> lastRouteBackoffs;
    private final Map<HttpRoute, Long> lastRouteProbes;

    public AIMDBackoffManager(ConnPoolControl<HttpRoute> connPerRoute) {
        this(connPerRoute, new SystemClock());
    }

    AIMDBackoffManager(ConnPoolControl<HttpRoute> connPerRoute, Clock clock) {
        this.coolDown = 5000L;
        this.backoffFactor = 0.5d;
        this.cap = 2;
        this.clock = clock;
        this.connPerRoute = connPerRoute;
        this.lastRouteProbes = new HashMap();
        this.lastRouteBackoffs = new HashMap();
    }

    @Override // org.opendatakit.httpclientandroidlib.client.BackoffManager
    public void backOff(HttpRoute route) {
        synchronized (this.connPerRoute) {
            int curr = this.connPerRoute.getMaxPerRoute(route);
            Long lastUpdate = getLastUpdate(this.lastRouteBackoffs, route);
            long now = this.clock.getCurrentTime();
            if (now - lastUpdate.longValue() >= this.coolDown) {
                this.connPerRoute.setMaxPerRoute(route, getBackedOffPoolSize(curr));
                this.lastRouteBackoffs.put(route, Long.valueOf(now));
            }
        }
    }

    private int getBackedOffPoolSize(int curr) {
        if (curr <= 1) {
            return 1;
        }
        return (int) Math.floor(this.backoffFactor * curr);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.BackoffManager
    public void probe(HttpRoute route) {
        synchronized (this.connPerRoute) {
            int curr = this.connPerRoute.getMaxPerRoute(route);
            int max = curr >= this.cap ? this.cap : curr + 1;
            Long lastProbe = getLastUpdate(this.lastRouteProbes, route);
            Long lastBackoff = getLastUpdate(this.lastRouteBackoffs, route);
            long now = this.clock.getCurrentTime();
            if (now - lastProbe.longValue() >= this.coolDown && now - lastBackoff.longValue() >= this.coolDown) {
                this.connPerRoute.setMaxPerRoute(route, max);
                this.lastRouteProbes.put(route, Long.valueOf(now));
            }
        }
    }

    private Long getLastUpdate(Map<HttpRoute, Long> updates, HttpRoute route) {
        Long lastUpdate = updates.get(route);
        if (lastUpdate == null) {
            return 0L;
        }
        return lastUpdate;
    }

    public void setBackoffFactor(double d) {
        if (d <= 0.0d || d >= 1.0d) {
            throw new IllegalArgumentException("backoffFactor must be 0.0 < f < 1.0");
        }
        this.backoffFactor = d;
    }

    public void setCooldownMillis(long l) {
        if (this.coolDown <= 0) {
            throw new IllegalArgumentException("cooldownMillis must be positive");
        }
        this.coolDown = l;
    }

    public void setPerHostConnectionCap(int cap) {
        if (cap < 1) {
            throw new IllegalArgumentException("perHostConnectionCap must be >= 1");
        }
        this.cap = cap;
    }
}
