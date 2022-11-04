package org.javarosa.core.model.utils;

import java.util.Date;
import java.util.Vector;
import org.javarosa.core.model.data.DateData;
import org.javarosa.core.model.data.DecimalData;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.IntegerData;
import org.javarosa.core.model.data.LongData;
import org.javarosa.core.model.data.SelectMultiData;
import org.javarosa.core.model.data.StringData;
/* loaded from: classes.dex */
public class PreloadUtils {
    public static IAnswerData wrapIndeterminedObject(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return new StringData((String) obj);
        }
        if (obj instanceof Date) {
            return new DateData((Date) obj);
        }
        if (obj instanceof Integer) {
            return new IntegerData((Integer) obj);
        }
        if (obj instanceof Long) {
            return new LongData((Long) obj);
        }
        if (obj instanceof Double) {
            return new DecimalData((Double) obj);
        }
        if (obj instanceof Vector) {
            return new SelectMultiData((Vector) obj);
        }
        if (obj instanceof IAnswerData) {
            return (IAnswerData) obj;
        }
        return new StringData(obj.toString());
    }
}
