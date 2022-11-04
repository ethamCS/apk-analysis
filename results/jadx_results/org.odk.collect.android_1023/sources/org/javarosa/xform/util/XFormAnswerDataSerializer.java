package org.javarosa.xform.util;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;
import org.javarosa.core.data.IDataPointer;
import org.javarosa.core.model.IAnswerDataSerializer;
import org.javarosa.core.model.data.BooleanData;
import org.javarosa.core.model.data.DateData;
import org.javarosa.core.model.data.DateTimeData;
import org.javarosa.core.model.data.DecimalData;
import org.javarosa.core.model.data.GeoPointData;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.IntegerData;
import org.javarosa.core.model.data.LongData;
import org.javarosa.core.model.data.MultiPointerAnswerData;
import org.javarosa.core.model.data.PointerAnswerData;
import org.javarosa.core.model.data.SelectMultiData;
import org.javarosa.core.model.data.SelectOneData;
import org.javarosa.core.model.data.StringData;
import org.javarosa.core.model.data.TimeData;
import org.javarosa.core.model.data.UncastData;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.core.model.utils.DateUtils;
import org.kxml2.kdom.Element;
/* loaded from: classes.dex */
public class XFormAnswerDataSerializer implements IAnswerDataSerializer {
    public static final String DELIMITER = " ";
    Vector additionalSerializers = new Vector();

    @Override // org.javarosa.core.model.IAnswerDataSerializer
    public void registerAnswerSerializer(IAnswerDataSerializer iAnswerDataSerializer) {
        this.additionalSerializers.addElement(iAnswerDataSerializer);
    }

    @Override // org.javarosa.core.model.IAnswerDataSerializer
    public boolean canSerialize(IAnswerData iAnswerData) {
        return (iAnswerData instanceof StringData) || (iAnswerData instanceof DateData) || (iAnswerData instanceof TimeData) || (iAnswerData instanceof SelectMultiData) || (iAnswerData instanceof SelectOneData) || (iAnswerData instanceof IntegerData) || (iAnswerData instanceof DecimalData) || (iAnswerData instanceof PointerAnswerData) || (iAnswerData instanceof MultiPointerAnswerData) || (iAnswerData instanceof GeoPointData) || (iAnswerData instanceof LongData) || (iAnswerData instanceof DateTimeData) || (iAnswerData instanceof UncastData);
    }

    public Object serializeAnswerData(UncastData uncastData) {
        return uncastData.getString();
    }

    public Object serializeAnswerData(StringData stringData) {
        return (String) stringData.getValue();
    }

    public Object serializeAnswerData(DateData dateData) {
        return DateUtils.formatDate((Date) dateData.getValue(), 1);
    }

    public Object serializeAnswerData(DateTimeData dateTimeData) {
        return DateUtils.formatDateTime((Date) dateTimeData.getValue(), 1);
    }

    public Object serializeAnswerData(TimeData timeData) {
        return DateUtils.formatTime((Date) timeData.getValue(), 1);
    }

    public Object serializeAnswerData(PointerAnswerData pointerAnswerData) {
        return ((IDataPointer) pointerAnswerData.getValue()).getDisplayText();
    }

    public Object serializeAnswerData(MultiPointerAnswerData multiPointerAnswerData) {
        IDataPointer[] iDataPointerArr = (IDataPointer[]) multiPointerAnswerData.getValue();
        if (iDataPointerArr.length == 1) {
            return iDataPointerArr[0].getDisplayText();
        }
        Element element = new Element();
        for (IDataPointer iDataPointer : iDataPointerArr) {
            Element element2 = new Element();
            element2.setName("data");
            element2.addChild(4, iDataPointer.getDisplayText());
            element.addChild(2, element2);
        }
        return element;
    }

    public Object serializeAnswerData(SelectMultiData selectMultiData) {
        Enumeration elements = ((Vector) selectMultiData.getValue()).elements();
        StringBuffer stringBuffer = new StringBuffer();
        while (elements.hasMoreElements()) {
            Selection selection = (Selection) elements.nextElement();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(DELIMITER);
            }
            stringBuffer.append(selection.getValue());
        }
        return stringBuffer.toString();
    }

    public Object serializeAnswerData(SelectOneData selectOneData) {
        return ((Selection) selectOneData.getValue()).getValue();
    }

    public Object serializeAnswerData(IntegerData integerData) {
        return ((Integer) integerData.getValue()).toString();
    }

    public Object serializeAnswerData(LongData longData) {
        return ((Long) longData.getValue()).toString();
    }

    public Object serializeAnswerData(DecimalData decimalData) {
        return ((Double) decimalData.getValue()).toString();
    }

    public Object serializeAnswerData(GeoPointData geoPointData) {
        return geoPointData.getDisplayText();
    }

    public Object serializeAnswerData(BooleanData booleanData) {
        return ((Boolean) booleanData.getValue()).booleanValue() ? "1" : "0";
    }

    @Override // org.javarosa.core.model.IAnswerDataSerializer
    public Object serializeAnswerData(IAnswerData iAnswerData, int i) {
        Enumeration elements = this.additionalSerializers.elements();
        while (elements.hasMoreElements()) {
            IAnswerDataSerializer iAnswerDataSerializer = (IAnswerDataSerializer) elements.nextElement();
            if (iAnswerDataSerializer.canSerialize(iAnswerData)) {
                return iAnswerDataSerializer.serializeAnswerData(iAnswerData, i);
            }
        }
        return serializeAnswerData(iAnswerData);
    }

    @Override // org.javarosa.core.model.IAnswerDataSerializer
    public Object serializeAnswerData(IAnswerData iAnswerData) {
        if (iAnswerData instanceof StringData) {
            return serializeAnswerData((StringData) iAnswerData);
        }
        if (iAnswerData instanceof SelectMultiData) {
            return serializeAnswerData((SelectMultiData) iAnswerData);
        }
        if (iAnswerData instanceof SelectOneData) {
            return serializeAnswerData((SelectOneData) iAnswerData);
        }
        if (iAnswerData instanceof IntegerData) {
            return serializeAnswerData((IntegerData) iAnswerData);
        }
        if (iAnswerData instanceof LongData) {
            return serializeAnswerData((LongData) iAnswerData);
        }
        if (iAnswerData instanceof DecimalData) {
            return serializeAnswerData((DecimalData) iAnswerData);
        }
        if (iAnswerData instanceof DateData) {
            return serializeAnswerData((DateData) iAnswerData);
        }
        if (iAnswerData instanceof TimeData) {
            return serializeAnswerData((TimeData) iAnswerData);
        }
        if (iAnswerData instanceof PointerAnswerData) {
            return serializeAnswerData((PointerAnswerData) iAnswerData);
        }
        if (iAnswerData instanceof MultiPointerAnswerData) {
            return serializeAnswerData((MultiPointerAnswerData) iAnswerData);
        }
        if (iAnswerData instanceof GeoPointData) {
            return serializeAnswerData((GeoPointData) iAnswerData);
        }
        if (iAnswerData instanceof DateTimeData) {
            return serializeAnswerData((DateTimeData) iAnswerData);
        }
        if (iAnswerData instanceof BooleanData) {
            return serializeAnswerData((BooleanData) iAnswerData);
        }
        if (iAnswerData instanceof UncastData) {
            return serializeAnswerData((UncastData) iAnswerData);
        }
        return null;
    }

    @Override // org.javarosa.core.model.IAnswerDataSerializer
    public Boolean containsExternalData(IAnswerData iAnswerData) {
        Enumeration elements = this.additionalSerializers.elements();
        while (elements.hasMoreElements()) {
            Boolean containsExternalData = ((IAnswerDataSerializer) elements.nextElement()).containsExternalData(iAnswerData);
            if (containsExternalData != null) {
                return containsExternalData;
            }
        }
        if ((iAnswerData instanceof PointerAnswerData) || (iAnswerData instanceof MultiPointerAnswerData)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // org.javarosa.core.model.IAnswerDataSerializer
    public IDataPointer[] retrieveExternalDataPointer(IAnswerData iAnswerData) {
        Enumeration elements = this.additionalSerializers.elements();
        while (elements.hasMoreElements()) {
            IAnswerDataSerializer iAnswerDataSerializer = (IAnswerDataSerializer) elements.nextElement();
            if (iAnswerDataSerializer.containsExternalData(iAnswerData) != null) {
                return iAnswerDataSerializer.retrieveExternalDataPointer(iAnswerData);
            }
        }
        if (iAnswerData instanceof PointerAnswerData) {
            return new IDataPointer[]{(IDataPointer) ((PointerAnswerData) iAnswerData).getValue()};
        }
        if (iAnswerData instanceof MultiPointerAnswerData) {
            return (IDataPointer[]) ((MultiPointerAnswerData) iAnswerData).getValue();
        }
        return null;
    }
}
