package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
/* loaded from: classes.dex */
public interface InstantConverter extends Converter {
    Chronology getChronology(Object obj, Chronology chronology);

    Chronology getChronology(Object obj, DateTimeZone dateTimeZone);

    long getInstantMillis(Object obj, Chronology chronology);
}
