package org.joda.time;
/* loaded from: classes.dex */
public interface ReadableDuration extends Comparable<ReadableDuration> {
    boolean equals(Object obj);

    long getMillis();

    int hashCode();

    boolean isEqual(ReadableDuration readableDuration);

    boolean isLongerThan(ReadableDuration readableDuration);

    boolean isShorterThan(ReadableDuration readableDuration);

    Duration toDuration();

    Period toPeriod();

    String toString();
}
