package org.opendatakit.httpclientandroidlib.conn.routing;

import org.opendatakit.httpclientandroidlib.annotation.Immutable;
@Immutable
/* loaded from: classes.dex */
public class BasicRouteDirector implements HttpRouteDirector {
    @Override // org.opendatakit.httpclientandroidlib.conn.routing.HttpRouteDirector
    public int nextStep(RouteInfo plan, RouteInfo fact) {
        if (plan == null) {
            throw new IllegalArgumentException("Planned route may not be null.");
        }
        if (fact == null || fact.getHopCount() < 1) {
            int step = firstStep(plan);
            return step;
        } else if (plan.getHopCount() > 1) {
            int step2 = proxiedStep(plan, fact);
            return step2;
        } else {
            int step3 = directStep(plan, fact);
            return step3;
        }
    }

    protected int firstStep(RouteInfo plan) {
        return plan.getHopCount() > 1 ? 2 : 1;
    }

    protected int directStep(RouteInfo plan, RouteInfo fact) {
        if (fact.getHopCount() <= 1 && plan.getTargetHost().equals(fact.getTargetHost()) && plan.isSecure() == fact.isSecure()) {
            return (plan.getLocalAddress() == null || plan.getLocalAddress().equals(fact.getLocalAddress())) ? 0 : -1;
        }
        return -1;
    }

    protected int proxiedStep(RouteInfo plan, RouteInfo fact) {
        int phc;
        int fhc;
        if (fact.getHopCount() > 1 && plan.getTargetHost().equals(fact.getTargetHost()) && (phc = plan.getHopCount()) >= (fhc = fact.getHopCount())) {
            for (int i = 0; i < fhc - 1; i++) {
                if (!plan.getHopTarget(i).equals(fact.getHopTarget(i))) {
                    return -1;
                }
            }
            if (phc > fhc) {
                return 4;
            }
            if (fact.isTunnelled() && !plan.isTunnelled()) {
                return -1;
            }
            if (fact.isLayered() && !plan.isLayered()) {
                return -1;
            }
            if (plan.isTunnelled() && !fact.isTunnelled()) {
                return 3;
            }
            if (plan.isLayered() && !fact.isLayered()) {
                return 5;
            }
            return plan.isSecure() == fact.isSecure() ? 0 : -1;
        }
        return -1;
    }
}
