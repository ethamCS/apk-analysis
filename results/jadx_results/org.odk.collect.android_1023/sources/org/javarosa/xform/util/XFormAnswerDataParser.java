package org.javarosa.xform.util;

import java.util.Date;
import java.util.Vector;
import org.javarosa.core.model.QuestionDef;
import org.javarosa.core.model.SelectChoice;
import org.javarosa.core.model.data.BooleanData;
import org.javarosa.core.model.data.DateData;
import org.javarosa.core.model.data.DateTimeData;
import org.javarosa.core.model.data.DecimalData;
import org.javarosa.core.model.data.GeoPointData;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.IntegerData;
import org.javarosa.core.model.data.LongData;
import org.javarosa.core.model.data.SelectMultiData;
import org.javarosa.core.model.data.SelectOneData;
import org.javarosa.core.model.data.StringData;
import org.javarosa.core.model.data.TimeData;
import org.javarosa.core.model.data.UncastData;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.core.model.utils.DateUtils;
/* loaded from: classes.dex */
public class XFormAnswerDataParser {
    public static IAnswerData getAnswerData(String str, int i) {
        return getAnswerData(str, i, null);
    }

    public static IAnswerData getAnswerData(String str, int i, QuestionDef questionDef) {
        Vector split;
        IntegerData integerData;
        String trim = str.trim();
        String str2 = trim.length() == 0 ? null : trim;
        switch (i) {
            case -1:
            case 0:
            case 1:
            case 11:
            case 12:
                return new StringData(str);
            case 2:
                if (str2 == null) {
                    integerData = null;
                } else {
                    try {
                        integerData = new IntegerData(Integer.parseInt(str2));
                    } catch (NumberFormatException e) {
                        return null;
                    }
                }
                return integerData;
            case 3:
                if (str2 == null) {
                    return null;
                }
                try {
                    return new DecimalData(Double.parseDouble(str2));
                } catch (NumberFormatException e2) {
                    return null;
                }
            case 4:
                Date parseDate = str2 == null ? null : DateUtils.parseDate(str2);
                if (parseDate == null) {
                    return null;
                }
                return new DateData(parseDate);
            case 5:
                Date parseTime = str2 == null ? null : DateUtils.parseTime(str2);
                if (parseTime == null) {
                    return null;
                }
                return new TimeData(parseTime);
            case 6:
                Date parseDateTime = str2 == null ? null : DateUtils.parseDateTime(str2);
                if (parseDateTime == null) {
                    return null;
                }
                return new DateTimeData(parseDateTime);
            case 7:
                Vector selections = getSelections(str, questionDef);
                if (selections.size() == 0) {
                    return null;
                }
                return new SelectOneData((Selection) selections.elementAt(0));
            case 8:
                return new SelectMultiData(getSelections(str, questionDef));
            case 9:
                if (str2 == null) {
                    return null;
                }
                if (str2.equals("1")) {
                    return new BooleanData(true);
                }
                if (str2.equals("0")) {
                    return new BooleanData(false);
                }
                return str2.equals("t") ? new BooleanData(true) : new BooleanData(false);
            case 10:
                if (str2 == null) {
                    split = null;
                } else {
                    try {
                        split = DateUtils.split(str2, XFormAnswerDataSerializer.DELIMITER, false);
                    } catch (NumberFormatException e3) {
                        return null;
                    }
                }
                int size = split.size();
                double[] dArr = new double[size];
                for (int i2 = 0; i2 < size; i2++) {
                    dArr[i2] = Double.parseDouble((String) split.elementAt(i2));
                }
                return new GeoPointData(dArr);
            case 13:
                if (str2 == null) {
                    return null;
                }
                try {
                    return new LongData(Long.parseLong(str2));
                } catch (NumberFormatException e4) {
                    return null;
                }
            default:
                return new UncastData(str2);
        }
    }

    private static Vector getSelections(String str, QuestionDef questionDef) {
        Vector vector = new Vector();
        Vector split = DateUtils.split(str, XFormAnswerDataSerializer.DELIMITER, true);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < split.size()) {
                Selection selection = getSelection((String) split.elementAt(i2), questionDef);
                if (selection != null) {
                    vector.addElement(selection);
                }
                i = i2 + 1;
            } else {
                return vector;
            }
        }
    }

    private static Selection getSelection(String str, QuestionDef questionDef) {
        if (questionDef == null || questionDef.getDynamicChoices() != null) {
            return new Selection(str);
        }
        SelectChoice choiceForValue = questionDef.getChoiceForValue(str);
        if (choiceForValue == null) {
            return null;
        }
        return choiceForValue.selection();
    }
}
