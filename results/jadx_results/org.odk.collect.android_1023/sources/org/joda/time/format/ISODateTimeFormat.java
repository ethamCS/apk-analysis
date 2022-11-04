package org.joda.time.format;

import java.util.Collection;
import java.util.HashSet;
import org.joda.time.DateTimeFieldType;
/* loaded from: classes.dex */
public class ISODateTimeFormat {
    private static DateTimeFormatter bd;
    private static DateTimeFormatter bdt;
    private static DateTimeFormatter bdtx;
    private static DateTimeFormatter bod;
    private static DateTimeFormatter bodt;
    private static DateTimeFormatter bodtx;
    private static DateTimeFormatter bt;
    private static DateTimeFormatter btt;
    private static DateTimeFormatter bttx;
    private static DateTimeFormatter btx;
    private static DateTimeFormatter bwd;
    private static DateTimeFormatter bwdt;
    private static DateTimeFormatter bwdtx;
    private static DateTimeFormatter dh;
    private static DateTimeFormatter dhm;
    private static DateTimeFormatter dhms;
    private static DateTimeFormatter dhmsf;
    private static DateTimeFormatter dhmsl;
    private static DateTimeFormatter dme;
    private static DateTimeFormatter dotp;
    private static DateTimeFormatter dp;
    private static DateTimeFormatter dpe;
    private static DateTimeFormatter dt;
    private static DateTimeFormatter dtp;
    private static DateTimeFormatter dtx;
    private static DateTimeFormatter dwe;
    private static DateTimeFormatter dye;
    private static DateTimeFormatter fse;
    private static DateTimeFormatter hde;
    private static DateTimeFormatter hm;
    private static DateTimeFormatter hms;
    private static DateTimeFormatter hmsf;
    private static DateTimeFormatter hmsl;
    private static DateTimeFormatter ldotp;
    private static DateTimeFormatter ldp;
    private static DateTimeFormatter lte;
    private static DateTimeFormatter ltp;
    private static DateTimeFormatter mhe;
    private static DateTimeFormatter mye;
    private static DateTimeFormatter od;
    private static DateTimeFormatter odt;
    private static DateTimeFormatter odtx;
    private static DateTimeFormatter sme;
    private static DateTimeFormatter t;
    private static DateTimeFormatter tp;
    private static DateTimeFormatter tpe;
    private static DateTimeFormatter tt;
    private static DateTimeFormatter ttx;
    private static DateTimeFormatter tx;
    private static DateTimeFormatter wdt;
    private static DateTimeFormatter wdtx;
    private static DateTimeFormatter we;
    private static DateTimeFormatter ww;
    private static DateTimeFormatter wwd;
    private static DateTimeFormatter wwe;
    private static DateTimeFormatter ye;
    private static DateTimeFormatter ym;
    private static DateTimeFormatter ymd;
    private static DateTimeFormatter ze;

    protected ISODateTimeFormat() {
    }

    public static DateTimeFormatter forFields(Collection<DateTimeFieldType> collection, boolean z, boolean z2) {
        boolean z3;
        if (collection == null || collection.size() == 0) {
            throw new IllegalArgumentException("The fields must not be null or empty");
        }
        HashSet hashSet = new HashSet(collection);
        int size = hashSet.size();
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        if (hashSet.contains(DateTimeFieldType.monthOfYear())) {
            z3 = dateByMonth(dateTimeFormatterBuilder, hashSet, z, z2);
        } else if (hashSet.contains(DateTimeFieldType.dayOfYear())) {
            z3 = dateByOrdinal(dateTimeFormatterBuilder, hashSet, z, z2);
        } else if (hashSet.contains(DateTimeFieldType.weekOfWeekyear())) {
            z3 = dateByWeek(dateTimeFormatterBuilder, hashSet, z, z2);
        } else if (hashSet.contains(DateTimeFieldType.dayOfMonth())) {
            z3 = dateByMonth(dateTimeFormatterBuilder, hashSet, z, z2);
        } else if (hashSet.contains(DateTimeFieldType.dayOfWeek())) {
            z3 = dateByWeek(dateTimeFormatterBuilder, hashSet, z, z2);
        } else if (hashSet.remove(DateTimeFieldType.year())) {
            dateTimeFormatterBuilder.append(yearElement());
            z3 = true;
        } else if (hashSet.remove(DateTimeFieldType.weekyear())) {
            dateTimeFormatterBuilder.append(weekyearElement());
            z3 = true;
        } else {
            z3 = false;
        }
        time(dateTimeFormatterBuilder, hashSet, z, z2, z3, hashSet.size() < size);
        if (!dateTimeFormatterBuilder.canBuildFormatter()) {
            throw new IllegalArgumentException("No valid format for fields: " + collection);
        }
        try {
            collection.retainAll(hashSet);
        } catch (UnsupportedOperationException e) {
        }
        return dateTimeFormatterBuilder.toFormatter();
    }

    private static boolean dateByMonth(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2) {
        if (!collection.remove(DateTimeFieldType.year())) {
            if (!collection.remove(DateTimeFieldType.monthOfYear())) {
                if (!collection.remove(DateTimeFieldType.dayOfMonth())) {
                    return false;
                }
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendDayOfMonth(2);
                return false;
            }
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendMonthOfYear(2);
            if (!collection.remove(DateTimeFieldType.dayOfMonth())) {
                return true;
            }
            appendSeparator(dateTimeFormatterBuilder, z);
            dateTimeFormatterBuilder.appendDayOfMonth(2);
            return false;
        }
        dateTimeFormatterBuilder.append(yearElement());
        if (collection.remove(DateTimeFieldType.monthOfYear())) {
            if (collection.remove(DateTimeFieldType.dayOfMonth())) {
                appendSeparator(dateTimeFormatterBuilder, z);
                dateTimeFormatterBuilder.appendMonthOfYear(2);
                appendSeparator(dateTimeFormatterBuilder, z);
                dateTimeFormatterBuilder.appendDayOfMonth(2);
                return false;
            }
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendMonthOfYear(2);
            return true;
        } else if (!collection.remove(DateTimeFieldType.dayOfMonth())) {
            return true;
        } else {
            checkNotStrictISO(collection, z2);
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendDayOfMonth(2);
            return false;
        }
    }

    private static boolean dateByOrdinal(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2) {
        if (!collection.remove(DateTimeFieldType.year())) {
            if (!collection.remove(DateTimeFieldType.dayOfYear())) {
                return false;
            }
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendDayOfYear(3);
            return false;
        }
        dateTimeFormatterBuilder.append(yearElement());
        if (collection.remove(DateTimeFieldType.dayOfYear())) {
            appendSeparator(dateTimeFormatterBuilder, z);
            dateTimeFormatterBuilder.appendDayOfYear(3);
            return false;
        }
        return true;
    }

    private static boolean dateByWeek(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2) {
        if (!collection.remove(DateTimeFieldType.weekyear())) {
            if (!collection.remove(DateTimeFieldType.weekOfWeekyear())) {
                if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
                    return false;
                }
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendLiteral('W');
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendDayOfWeek(1);
                return false;
            }
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendLiteral('W');
            dateTimeFormatterBuilder.appendWeekOfWeekyear(2);
            if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
                return true;
            }
            appendSeparator(dateTimeFormatterBuilder, z);
            dateTimeFormatterBuilder.appendDayOfWeek(1);
            return false;
        }
        dateTimeFormatterBuilder.append(weekyearElement());
        if (collection.remove(DateTimeFieldType.weekOfWeekyear())) {
            appendSeparator(dateTimeFormatterBuilder, z);
            dateTimeFormatterBuilder.appendLiteral('W');
            dateTimeFormatterBuilder.appendWeekOfWeekyear(2);
            if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
                return true;
            }
            appendSeparator(dateTimeFormatterBuilder, z);
            dateTimeFormatterBuilder.appendDayOfWeek(1);
            return false;
        } else if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
            return true;
        } else {
            checkNotStrictISO(collection, z2);
            appendSeparator(dateTimeFormatterBuilder, z);
            dateTimeFormatterBuilder.appendLiteral('W');
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendDayOfWeek(1);
            return false;
        }
    }

    private static void time(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean remove = collection.remove(DateTimeFieldType.hourOfDay());
        boolean remove2 = collection.remove(DateTimeFieldType.minuteOfHour());
        boolean remove3 = collection.remove(DateTimeFieldType.secondOfMinute());
        boolean remove4 = collection.remove(DateTimeFieldType.millisOfSecond());
        if (remove || remove2 || remove3 || remove4) {
            if (remove || remove2 || remove3 || remove4) {
                if (z2 && z3) {
                    throw new IllegalArgumentException("No valid ISO8601 format for fields because Date was reduced precision: " + collection);
                }
                if (z4) {
                    dateTimeFormatterBuilder.appendLiteral('T');
                }
            }
            if ((!remove || !remove2 || !remove3) && (!remove || remove3 || remove4)) {
                if (z2 && z4) {
                    throw new IllegalArgumentException("No valid ISO8601 format for fields because Time was truncated: " + collection);
                }
                if ((remove || ((!remove2 || !remove3) && ((!remove2 || remove4) && !remove3))) && z2) {
                    throw new IllegalArgumentException("No valid ISO8601 format for fields: " + collection);
                }
            }
            if (remove) {
                dateTimeFormatterBuilder.appendHourOfDay(2);
            } else if (remove2 || remove3 || remove4) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            if (z && remove && remove2) {
                dateTimeFormatterBuilder.appendLiteral(':');
            }
            if (remove2) {
                dateTimeFormatterBuilder.appendMinuteOfHour(2);
            } else if (remove3 || remove4) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            if (z && remove2 && remove3) {
                dateTimeFormatterBuilder.appendLiteral(':');
            }
            if (remove3) {
                dateTimeFormatterBuilder.appendSecondOfMinute(2);
            } else if (remove4) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            if (remove4) {
                dateTimeFormatterBuilder.appendLiteral('.');
                dateTimeFormatterBuilder.appendMillisOfSecond(3);
            }
        }
    }

    private static void checkNotStrictISO(Collection<DateTimeFieldType> collection, boolean z) {
        if (z) {
            throw new IllegalArgumentException("No valid ISO8601 format for fields: " + collection);
        }
    }

    private static void appendSeparator(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z) {
        if (z) {
            dateTimeFormatterBuilder.appendLiteral('-');
        }
    }

    public static DateTimeFormatter dateParser() {
        if (dp == null) {
            dp = new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').append(offsetElement()).toParser()).toFormatter();
        }
        return dp;
    }

    public static DateTimeFormatter localDateParser() {
        if (ldp == null) {
            ldp = dateElementParser().withZoneUTC();
        }
        return ldp;
    }

    public static DateTimeFormatter dateElementParser() {
        if (dpe == null) {
            dpe = new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(yearElement()).appendOptional(new DateTimeFormatterBuilder().append(monthElement()).appendOptional(dayOfMonthElement().getParser()).toParser()).toParser(), new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).appendOptional(dayOfWeekElement().getParser()).toParser(), new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toParser()}).toFormatter();
        }
        return dpe;
    }

    public static DateTimeFormatter timeParser() {
        if (tp == null) {
            tp = new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).appendOptional(offsetElement().getParser()).toFormatter();
        }
        return tp;
    }

    public static DateTimeFormatter localTimeParser() {
        if (ltp == null) {
            ltp = new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).toFormatter().withZoneUTC();
        }
        return ltp;
    }

    public static DateTimeFormatter timeElementParser() {
        if (tpe == null) {
            DateTimeParser parser = new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().appendLiteral('.').toParser(), new DateTimeFormatterBuilder().appendLiteral(',').toParser()}).toParser();
            tpe = new DateTimeFormatterBuilder().append(hourElement()).append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(minuteElement()).append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(secondElement()).appendOptional(new DateTimeFormatterBuilder().append(parser).appendFractionOfSecond(1, 9).toParser()).toParser(), new DateTimeFormatterBuilder().append(parser).appendFractionOfMinute(1, 9).toParser(), null}).toParser(), new DateTimeFormatterBuilder().append(parser).appendFractionOfHour(1, 9).toParser(), null}).toFormatter();
        }
        return tpe;
    }

    public static DateTimeFormatter dateTimeParser() {
        if (dtp == null) {
            dtp = new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).appendOptional(offsetElement().getParser()).toParser(), dateOptionalTimeParser().getParser()}).toFormatter();
        }
        return dtp;
    }

    public static DateTimeFormatter dateOptionalTimeParser() {
        if (dotp == null) {
            dotp = new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').appendOptional(timeElementParser().getParser()).appendOptional(offsetElement().getParser()).toParser()).toFormatter();
        }
        return dotp;
    }

    public static DateTimeFormatter localDateOptionalTimeParser() {
        if (ldotp == null) {
            ldotp = new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).toParser()).toFormatter().withZoneUTC();
        }
        return ldotp;
    }

    public static DateTimeFormatter date() {
        return yearMonthDay();
    }

    public static DateTimeFormatter time() {
        if (t == null) {
            t = new DateTimeFormatterBuilder().append(hourMinuteSecondFraction()).append(offsetElement()).toFormatter();
        }
        return t;
    }

    public static DateTimeFormatter timeNoMillis() {
        if (tx == null) {
            tx = new DateTimeFormatterBuilder().append(hourMinuteSecond()).append(offsetElement()).toFormatter();
        }
        return tx;
    }

    public static DateTimeFormatter tTime() {
        if (tt == null) {
            tt = new DateTimeFormatterBuilder().append(literalTElement()).append(time()).toFormatter();
        }
        return tt;
    }

    public static DateTimeFormatter tTimeNoMillis() {
        if (ttx == null) {
            ttx = new DateTimeFormatterBuilder().append(literalTElement()).append(timeNoMillis()).toFormatter();
        }
        return ttx;
    }

    public static DateTimeFormatter dateTime() {
        if (dt == null) {
            dt = new DateTimeFormatterBuilder().append(date()).append(tTime()).toFormatter();
        }
        return dt;
    }

    public static DateTimeFormatter dateTimeNoMillis() {
        if (dtx == null) {
            dtx = new DateTimeFormatterBuilder().append(date()).append(tTimeNoMillis()).toFormatter();
        }
        return dtx;
    }

    public static DateTimeFormatter ordinalDate() {
        if (od == null) {
            od = new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toFormatter();
        }
        return od;
    }

    public static DateTimeFormatter ordinalDateTime() {
        if (odt == null) {
            odt = new DateTimeFormatterBuilder().append(ordinalDate()).append(tTime()).toFormatter();
        }
        return odt;
    }

    public static DateTimeFormatter ordinalDateTimeNoMillis() {
        if (odtx == null) {
            odtx = new DateTimeFormatterBuilder().append(ordinalDate()).append(tTimeNoMillis()).toFormatter();
        }
        return odtx;
    }

    public static DateTimeFormatter weekDate() {
        return weekyearWeekDay();
    }

    public static DateTimeFormatter weekDateTime() {
        if (wdt == null) {
            wdt = new DateTimeFormatterBuilder().append(weekDate()).append(tTime()).toFormatter();
        }
        return wdt;
    }

    public static DateTimeFormatter weekDateTimeNoMillis() {
        if (wdtx == null) {
            wdtx = new DateTimeFormatterBuilder().append(weekDate()).append(tTimeNoMillis()).toFormatter();
        }
        return wdtx;
    }

    public static DateTimeFormatter basicDate() {
        if (bd == null) {
            bd = new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.monthOfYear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 2).toFormatter();
        }
        return bd;
    }

    public static DateTimeFormatter basicTime() {
        if (bt == null) {
            bt = new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendLiteral('.').appendFractionOfSecond(3, 9).appendTimeZoneOffset("Z", false, 2, 2).toFormatter();
        }
        return bt;
    }

    public static DateTimeFormatter basicTimeNoMillis() {
        if (btx == null) {
            btx = new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendTimeZoneOffset("Z", false, 2, 2).toFormatter();
        }
        return btx;
    }

    public static DateTimeFormatter basicTTime() {
        if (btt == null) {
            btt = new DateTimeFormatterBuilder().append(literalTElement()).append(basicTime()).toFormatter();
        }
        return btt;
    }

    public static DateTimeFormatter basicTTimeNoMillis() {
        if (bttx == null) {
            bttx = new DateTimeFormatterBuilder().append(literalTElement()).append(basicTimeNoMillis()).toFormatter();
        }
        return bttx;
    }

    public static DateTimeFormatter basicDateTime() {
        if (bdt == null) {
            bdt = new DateTimeFormatterBuilder().append(basicDate()).append(basicTTime()).toFormatter();
        }
        return bdt;
    }

    public static DateTimeFormatter basicDateTimeNoMillis() {
        if (bdtx == null) {
            bdtx = new DateTimeFormatterBuilder().append(basicDate()).append(basicTTimeNoMillis()).toFormatter();
        }
        return bdtx;
    }

    public static DateTimeFormatter basicOrdinalDate() {
        if (bod == null) {
            bod = new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.dayOfYear(), 3).toFormatter();
        }
        return bod;
    }

    public static DateTimeFormatter basicOrdinalDateTime() {
        if (bodt == null) {
            bodt = new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTime()).toFormatter();
        }
        return bodt;
    }

    public static DateTimeFormatter basicOrdinalDateTimeNoMillis() {
        if (bodtx == null) {
            bodtx = new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTimeNoMillis()).toFormatter();
        }
        return bodtx;
    }

    public static DateTimeFormatter basicWeekDate() {
        if (bwd == null) {
            bwd = new DateTimeFormatterBuilder().appendWeekyear(4, 4).appendLiteral('W').appendFixedDecimal(DateTimeFieldType.weekOfWeekyear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfWeek(), 1).toFormatter();
        }
        return bwd;
    }

    public static DateTimeFormatter basicWeekDateTime() {
        if (bwdt == null) {
            bwdt = new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTime()).toFormatter();
        }
        return bwdt;
    }

    public static DateTimeFormatter basicWeekDateTimeNoMillis() {
        if (bwdtx == null) {
            bwdtx = new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTimeNoMillis()).toFormatter();
        }
        return bwdtx;
    }

    public static DateTimeFormatter year() {
        return yearElement();
    }

    public static DateTimeFormatter yearMonth() {
        if (ym == null) {
            ym = new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).toFormatter();
        }
        return ym;
    }

    public static DateTimeFormatter yearMonthDay() {
        if (ymd == null) {
            ymd = new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).append(dayOfMonthElement()).toFormatter();
        }
        return ymd;
    }

    public static DateTimeFormatter weekyear() {
        return weekyearElement();
    }

    public static DateTimeFormatter weekyearWeek() {
        if (ww == null) {
            ww = new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).toFormatter();
        }
        return ww;
    }

    public static DateTimeFormatter weekyearWeekDay() {
        if (wwd == null) {
            wwd = new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).append(dayOfWeekElement()).toFormatter();
        }
        return wwd;
    }

    public static DateTimeFormatter hour() {
        return hourElement();
    }

    public static DateTimeFormatter hourMinute() {
        if (hm == null) {
            hm = new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).toFormatter();
        }
        return hm;
    }

    public static DateTimeFormatter hourMinuteSecond() {
        if (hms == null) {
            hms = new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).toFormatter();
        }
        return hms;
    }

    public static DateTimeFormatter hourMinuteSecondMillis() {
        if (hmsl == null) {
            hmsl = new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).appendLiteral('.').appendFractionOfSecond(3, 3).toFormatter();
        }
        return hmsl;
    }

    public static DateTimeFormatter hourMinuteSecondFraction() {
        if (hmsf == null) {
            hmsf = new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).append(fractionElement()).toFormatter();
        }
        return hmsf;
    }

    public static DateTimeFormatter dateHour() {
        if (dh == null) {
            dh = new DateTimeFormatterBuilder().append(date()).append(literalTElement()).append(hour()).toFormatter();
        }
        return dh;
    }

    public static DateTimeFormatter dateHourMinute() {
        if (dhm == null) {
            dhm = new DateTimeFormatterBuilder().append(date()).append(literalTElement()).append(hourMinute()).toFormatter();
        }
        return dhm;
    }

    public static DateTimeFormatter dateHourMinuteSecond() {
        if (dhms == null) {
            dhms = new DateTimeFormatterBuilder().append(date()).append(literalTElement()).append(hourMinuteSecond()).toFormatter();
        }
        return dhms;
    }

    public static DateTimeFormatter dateHourMinuteSecondMillis() {
        if (dhmsl == null) {
            dhmsl = new DateTimeFormatterBuilder().append(date()).append(literalTElement()).append(hourMinuteSecondMillis()).toFormatter();
        }
        return dhmsl;
    }

    public static DateTimeFormatter dateHourMinuteSecondFraction() {
        if (dhmsf == null) {
            dhmsf = new DateTimeFormatterBuilder().append(date()).append(literalTElement()).append(hourMinuteSecondFraction()).toFormatter();
        }
        return dhmsf;
    }

    private static DateTimeFormatter yearElement() {
        if (ye == null) {
            ye = new DateTimeFormatterBuilder().appendYear(4, 9).toFormatter();
        }
        return ye;
    }

    private static DateTimeFormatter monthElement() {
        if (mye == null) {
            mye = new DateTimeFormatterBuilder().appendLiteral('-').appendMonthOfYear(2).toFormatter();
        }
        return mye;
    }

    private static DateTimeFormatter dayOfMonthElement() {
        if (dme == null) {
            dme = new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfMonth(2).toFormatter();
        }
        return dme;
    }

    private static DateTimeFormatter weekyearElement() {
        if (we == null) {
            we = new DateTimeFormatterBuilder().appendWeekyear(4, 9).toFormatter();
        }
        return we;
    }

    private static DateTimeFormatter weekElement() {
        if (wwe == null) {
            wwe = new DateTimeFormatterBuilder().appendLiteral("-W").appendWeekOfWeekyear(2).toFormatter();
        }
        return wwe;
    }

    private static DateTimeFormatter dayOfWeekElement() {
        if (dwe == null) {
            dwe = new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfWeek(1).toFormatter();
        }
        return dwe;
    }

    private static DateTimeFormatter dayOfYearElement() {
        if (dye == null) {
            dye = new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfYear(3).toFormatter();
        }
        return dye;
    }

    private static DateTimeFormatter literalTElement() {
        if (lte == null) {
            lte = new DateTimeFormatterBuilder().appendLiteral('T').toFormatter();
        }
        return lte;
    }

    private static DateTimeFormatter hourElement() {
        if (hde == null) {
            hde = new DateTimeFormatterBuilder().appendHourOfDay(2).toFormatter();
        }
        return hde;
    }

    private static DateTimeFormatter minuteElement() {
        if (mhe == null) {
            mhe = new DateTimeFormatterBuilder().appendLiteral(':').appendMinuteOfHour(2).toFormatter();
        }
        return mhe;
    }

    private static DateTimeFormatter secondElement() {
        if (sme == null) {
            sme = new DateTimeFormatterBuilder().appendLiteral(':').appendSecondOfMinute(2).toFormatter();
        }
        return sme;
    }

    private static DateTimeFormatter fractionElement() {
        if (fse == null) {
            fse = new DateTimeFormatterBuilder().appendLiteral('.').appendFractionOfSecond(3, 9).toFormatter();
        }
        return fse;
    }

    private static DateTimeFormatter offsetElement() {
        if (ze == null) {
            ze = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 2, 4).toFormatter();
        }
        return ze;
    }
}
