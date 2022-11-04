package org.junit.runner.manipulation;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.junit.runner.Description;
/* loaded from: classes.dex */
public final class Orderer {
    private final Ordering ordering;

    public Orderer(Ordering ordering) {
        this.ordering = ordering;
    }

    public List<Description> order(Collection<Description> collection) throws InvalidOrderingException {
        List<Description> orderItems = this.ordering.orderItems(Collections.unmodifiableCollection(collection));
        if (!this.ordering.validateOrderingIsCorrect()) {
            return orderItems;
        }
        HashSet hashSet = new HashSet(collection);
        if (!hashSet.containsAll(orderItems)) {
            throw new InvalidOrderingException("Ordering added items");
        }
        HashSet hashSet2 = new HashSet(orderItems);
        if (hashSet2.size() != orderItems.size()) {
            throw new InvalidOrderingException("Ordering duplicated items");
        }
        if (!hashSet2.containsAll(hashSet)) {
            throw new InvalidOrderingException("Ordering removed items");
        }
        return orderItems;
    }

    public void apply(Object obj) throws InvalidOrderingException {
        if (obj instanceof Orderable) {
            ((Orderable) obj).order(this);
        }
    }
}
