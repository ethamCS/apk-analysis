package org.javarosa.xpath.expr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import me.regexp.RE;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.condition.IFunctionHandler;
import org.javarosa.core.model.condition.pivot.UnpivotableExpressionException;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.model.utils.DateUtils;
import org.javarosa.core.util.MathUtils;
import org.javarosa.core.util.PropertyUtils;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapListPoly;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.javarosa.xpath.IExprDataType;
import org.javarosa.xpath.XPathNodeset;
import org.javarosa.xpath.XPathTypeMismatchException;
import org.javarosa.xpath.XPathUnhandledException;
/* loaded from: classes.dex */
public class XPathFuncExpr extends XPathExpression {
    public XPathExpression[] args;
    public XPathQName id;

    public XPathFuncExpr() {
    }

    public XPathFuncExpr(XPathQName xPathQName, XPathExpression[] xPathExpressionArr) {
        this.id = xPathQName;
        this.args = xPathExpressionArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{func-expr:");
        stringBuffer.append(this.id.toString());
        stringBuffer.append(",{");
        for (int i = 0; i < this.args.length; i++) {
            stringBuffer.append(this.args[i].toString());
            if (i < this.args.length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append("}}");
        return stringBuffer.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof XPathFuncExpr) {
            XPathFuncExpr xPathFuncExpr = (XPathFuncExpr) obj;
            if (this.id.equals(xPathFuncExpr.id) && this.args.length == xPathFuncExpr.args.length) {
                return ExtUtil.arrayEquals(this.args, xPathFuncExpr.args);
            }
            return false;
        }
        return false;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.id = (XPathQName) ExtUtil.read(dataInputStream, XPathQName.class);
        Vector vector = (Vector) ExtUtil.read(dataInputStream, new ExtWrapListPoly(), prototypeFactory);
        this.args = new XPathExpression[vector.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.args.length) {
                this.args[i2] = (XPathExpression) vector.elementAt(i2);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        Vector vector = new Vector();
        for (int i = 0; i < this.args.length; i++) {
            vector.addElement(this.args[i]);
        }
        ExtUtil.write(dataOutputStream, this.id);
        ExtUtil.write(dataOutputStream, new ExtWrapListPoly(vector));
    }

    @Override // org.javarosa.xpath.expr.XPathExpression
    public Object eval(FormInstance formInstance, EvaluationContext evaluationContext) {
        String xPathQName = this.id.toString();
        Object[] objArr = new Object[this.args.length];
        Hashtable functionHandlers = evaluationContext.getFunctionHandlers();
        if (xPathQName.equals("if") && this.args.length == 3) {
            return ifThenElse(formInstance, evaluationContext, this.args, objArr);
        }
        if (xPathQName.equals("coalesce") && this.args.length == 2) {
            objArr[0] = unpack(this.args[0].eval(formInstance, evaluationContext));
            if (!isNull(objArr[0])) {
                return objArr[0];
            }
            objArr[1] = this.args[1].eval(formInstance, evaluationContext);
            return objArr[1];
        }
        for (int i = 0; i < this.args.length; i++) {
            objArr[i] = this.args[i].eval(formInstance, evaluationContext);
        }
        if (xPathQName.equals("true") && this.args.length == 0) {
            return Boolean.TRUE;
        }
        if (xPathQName.equals("false") && this.args.length == 0) {
            return Boolean.FALSE;
        }
        if (xPathQName.equals("boolean") && this.args.length == 1) {
            return toBoolean(objArr[0]);
        }
        if (xPathQName.equals("number") && this.args.length == 1) {
            return toNumeric(objArr[0]);
        }
        if (xPathQName.equals("int") && this.args.length == 1) {
            return toInt(objArr[0]);
        }
        if (xPathQName.equals("round") && this.args.length == 2) {
            return round(toNumeric(objArr[0]).doubleValue(), toInt(objArr[1]).doubleValue());
        } else if (xPathQName.equals("string") && this.args.length == 1) {
            return toString(objArr[0]);
        } else {
            if (xPathQName.equals("date") && this.args.length == 1) {
                return toDate(objArr[0]);
            }
            if (xPathQName.equals("not") && this.args.length == 1) {
                return boolNot(objArr[0]);
            }
            if (xPathQName.equals("boolean-from-string") && this.args.length == 1) {
                return boolStr(objArr[0]);
            }
            if (xPathQName.equals("format-date") && this.args.length == 2) {
                return dateStr(objArr[0], objArr[1]);
            }
            if ((xPathQName.equals("selected") || xPathQName.equals("is-selected")) && this.args.length == 2) {
                return multiSelected(objArr[0], objArr[1]);
            }
            if (xPathQName.equals("count-selected") && this.args.length == 1) {
                return countSelected(objArr[0]);
            }
            if (xPathQName.equals("selected-at") && this.args.length == 2) {
                return selectedAt(objArr[0], objArr[1]);
            }
            if (xPathQName.equals("position") && (this.args.length == 0 || this.args.length == 1)) {
                if (this.args.length == 1) {
                    return position(((XPathNodeset) objArr[0]).getRefAt(0));
                }
                if (evaluationContext.getContextPosition() != -1) {
                    return new Double(evaluationContext.getContextPosition() + 1);
                }
                return position(evaluationContext.getContextRef());
            } else if (xPathQName.equals("count") && this.args.length == 1) {
                return count(objArr[0]);
            } else {
                if (xPathQName.equals("sum") && this.args.length == 1) {
                    if (objArr[0] instanceof XPathNodeset) {
                        return sum(((XPathNodeset) objArr[0]).toArgList());
                    }
                    throw new XPathTypeMismatchException("not a nodeset");
                } else if (xPathQName.equals("max")) {
                    if (objArr[0] instanceof XPathNodeset) {
                        return max(((XPathNodeset) objArr[0]).toArgList());
                    }
                    return max(objArr);
                } else if (xPathQName.equals("min")) {
                    if (objArr[0] instanceof XPathNodeset) {
                        return min(((XPathNodeset) objArr[0]).toArgList());
                    }
                    return min(objArr);
                } else if (xPathQName.equals("today") && this.args.length == 0) {
                    return DateUtils.roundDate(new Date());
                } else {
                    if (xPathQName.equals("now") && this.args.length == 0) {
                        return new Date();
                    }
                    if (xPathQName.equals("concat")) {
                        if (this.args.length == 1 && (objArr[0] instanceof XPathNodeset)) {
                            return join("", ((XPathNodeset) objArr[0]).toArgList());
                        }
                        return join("", objArr);
                    } else if (xPathQName.equals("join") && this.args.length >= 1) {
                        if (this.args.length == 2 && (objArr[1] instanceof XPathNodeset)) {
                            return join(objArr[0], ((XPathNodeset) objArr[1]).toArgList());
                        }
                        return join(objArr[0], subsetArgList(objArr, 1));
                    } else if (xPathQName.equals("substr") && (this.args.length == 2 || this.args.length == 3)) {
                        return substring(objArr[0], objArr[1], this.args.length == 3 ? objArr[2] : null);
                    } else if (xPathQName.equals("string-length") && this.args.length == 1) {
                        return stringLength(objArr[0]);
                    } else {
                        if (xPathQName.equals("checklist") && this.args.length >= 2) {
                            if (this.args.length == 3 && (objArr[2] instanceof XPathNodeset)) {
                                return checklist(objArr[0], objArr[1], ((XPathNodeset) objArr[2]).toArgList());
                            }
                            return checklist(objArr[0], objArr[1], subsetArgList(objArr, 2));
                        } else if (xPathQName.equals("weighted-checklist") && this.args.length >= 2 && this.args.length % 2 == 0) {
                            if (this.args.length == 4 && (objArr[2] instanceof XPathNodeset) && (objArr[3] instanceof XPathNodeset)) {
                                Object[] argList = ((XPathNodeset) objArr[2]).toArgList();
                                Object[] argList2 = ((XPathNodeset) objArr[3]).toArgList();
                                if (argList.length != argList2.length) {
                                    throw new XPathTypeMismatchException("weighted-checklist: nodesets not same length");
                                }
                                return checklistWeighted(objArr[0], objArr[1], argList, argList2);
                            }
                            return checklistWeighted(objArr[0], objArr[1], subsetArgList(objArr, 2, 2), subsetArgList(objArr, 3, 2));
                        } else if (xPathQName.equals("regex") && this.args.length == 2) {
                            return regex(objArr[0], objArr[1]);
                        } else {
                            if (xPathQName.equals("depend") && this.args.length >= 1) {
                                return objArr[0];
                            }
                            if (xPathQName.equals("random") && this.args.length == 0) {
                                return new Double(MathUtils.getRand().nextDouble());
                            }
                            if (xPathQName.equals("uuid") && (this.args.length == 0 || this.args.length == 1)) {
                                if (this.args.length == 0) {
                                    return PropertyUtils.genUUID();
                                }
                                return PropertyUtils.genGUID(toInt(objArr[0]).intValue());
                            }
                            IFunctionHandler iFunctionHandler = (IFunctionHandler) functionHandlers.get(xPathQName);
                            if (iFunctionHandler != null) {
                                return evalCustomFunction(iFunctionHandler, objArr, evaluationContext);
                            }
                            throw new XPathUnhandledException("function '" + xPathQName + "'");
                        }
                    }
                }
            }
        }
    }

    private static Object evalCustomFunction(IFunctionHandler iFunctionHandler, Object[] objArr, EvaluationContext evaluationContext) {
        Enumeration elements = iFunctionHandler.getPrototypes().elements();
        Object[] objArr2 = null;
        while (objArr2 == null && elements.hasMoreElements()) {
            objArr2 = matchPrototype(objArr, (Class[]) elements.nextElement());
        }
        if (objArr2 != null) {
            return iFunctionHandler.eval(objArr2, evaluationContext);
        }
        if (iFunctionHandler.rawArgs()) {
            return iFunctionHandler.eval(objArr, evaluationContext);
        }
        throw new XPathTypeMismatchException("for function '" + iFunctionHandler.getName() + "'");
    }

    private static Object[] matchPrototype(Object[] objArr, Class[] clsArr) {
        Object[] objArr2;
        if (clsArr.length == objArr.length) {
            Object[] objArr3 = new Object[objArr.length];
            for (int i = 0; i < clsArr.length; i++) {
                objArr3[i] = null;
                if (clsArr[i].isAssignableFrom(objArr[i].getClass())) {
                    objArr3[i] = objArr[i];
                } else {
                    try {
                        if (clsArr[i] == Boolean.class) {
                            objArr3[i] = toBoolean(objArr[i]);
                        } else if (clsArr[i] == Double.class) {
                            objArr3[i] = toNumeric(objArr[i]);
                        } else if (clsArr[i] == String.class) {
                            objArr3[i] = toString(objArr[i]);
                        } else if (clsArr[i] == Date.class) {
                            objArr3[i] = toDate(objArr[i]);
                        }
                    } catch (XPathTypeMismatchException e) {
                    }
                }
                if (objArr3[i] == null) {
                    return null;
                }
            }
            objArr2 = objArr3;
        } else {
            objArr2 = null;
        }
        return objArr2;
    }

    public static boolean isNull(Object obj) {
        if (obj == null) {
            return true;
        }
        if ((obj instanceof String) && ((String) obj).length() == 0) {
            return true;
        }
        return (obj instanceof Double) && ((Double) obj).isNaN();
    }

    public static Double stringLength(Object obj) {
        String xPathFuncExpr = toString(obj);
        return xPathFuncExpr == null ? new Double(0.0d) : new Double(xPathFuncExpr.length());
    }

    public static Boolean toBoolean(Object obj) {
        Boolean bool;
        boolean z = true;
        Object unpack = unpack(obj);
        if (unpack instanceof Boolean) {
            bool = (Boolean) unpack;
        } else if (unpack instanceof Double) {
            double doubleValue = ((Double) unpack).doubleValue();
            bool = new Boolean(Math.abs(doubleValue) > 1.0E-12d && !Double.isNaN(doubleValue));
        } else if (unpack instanceof String) {
            if (((String) unpack).length() <= 0) {
                z = false;
            }
            bool = new Boolean(z);
        } else if (unpack instanceof Date) {
            bool = Boolean.TRUE;
        } else if (!(unpack instanceof IExprDataType)) {
            bool = null;
        } else {
            bool = ((IExprDataType) unpack).toBoolean();
        }
        if (bool != null) {
            return bool;
        }
        throw new XPathTypeMismatchException("converting to boolean");
    }

    public static Double toNumeric(Object obj) {
        Double d;
        Object unpack = unpack(obj);
        if (unpack instanceof Boolean) {
            d = new Double(((Boolean) unpack).booleanValue() ? 1.0d : 0.0d);
        } else if (unpack instanceof Double) {
            d = (Double) unpack;
        } else if (unpack instanceof String) {
            try {
                String trim = ((String) unpack).trim();
                for (int i = 0; i < trim.length(); i++) {
                    char charAt = trim.charAt(i);
                    if (charAt != '-' && charAt != '.' && (charAt < '0' || charAt > '9')) {
                        throw new NumberFormatException();
                    }
                }
                d = new Double(Double.parseDouble(trim));
            } catch (NumberFormatException e) {
                d = new Double(Double.NaN);
            }
        } else if (unpack instanceof Date) {
            d = new Double(DateUtils.daysSinceEpoch((Date) unpack));
        } else if (!(unpack instanceof IExprDataType)) {
            d = null;
        } else {
            d = ((IExprDataType) unpack).toNumeric();
        }
        if (d != null) {
            return d;
        }
        throw new XPathTypeMismatchException("converting to numeric");
    }

    public static Double toInt(Object obj) {
        Double numeric = toNumeric(obj);
        if (numeric.isInfinite() || numeric.isNaN()) {
            return numeric;
        }
        if (numeric.doubleValue() >= 9.223372036854776E18d || numeric.doubleValue() <= -9.223372036854776E18d) {
            return numeric;
        }
        long longValue = numeric.longValue();
        Double d = new Double(longValue);
        if (longValue != 0) {
            return d;
        }
        if (numeric.doubleValue() < 0.0d || numeric.equals(new Double(-0.0d))) {
            return new Double(-0.0d);
        }
        return d;
    }

    public static String toString(Object obj) {
        String str;
        Object unpack = unpack(obj);
        if (unpack instanceof Boolean) {
            str = ((Boolean) unpack).booleanValue() ? "true" : "false";
        } else if (unpack instanceof Double) {
            double doubleValue = ((Double) unpack).doubleValue();
            if (Double.isNaN(doubleValue)) {
                str = "NaN";
            } else if (Math.abs(doubleValue) < 1.0E-12d) {
                str = "0";
            } else if (Double.isInfinite(doubleValue)) {
                str = (doubleValue < 0.0d ? "-" : "") + "Infinity";
            } else if (Math.abs(doubleValue - ((int) doubleValue)) < 1.0E-12d) {
                str = String.valueOf((int) doubleValue);
            } else {
                str = String.valueOf(doubleValue);
            }
        } else if (unpack instanceof String) {
            str = (String) unpack;
        } else if (unpack instanceof Date) {
            str = DateUtils.formatDate((Date) unpack, 1);
        } else if (!(unpack instanceof IExprDataType)) {
            str = null;
        } else {
            str = ((IExprDataType) unpack).toString();
        }
        if (str != null) {
            return str;
        }
        throw new XPathTypeMismatchException("converting to string");
    }

    public static Object toDate(Object obj) {
        Object unpack = unpack(obj);
        if (unpack instanceof Double) {
            Double d = toInt(unpack);
            if (!d.isNaN()) {
                if (d.isInfinite() || d.doubleValue() > 2.147483647E9d || d.doubleValue() < -2.147483648E9d) {
                    throw new XPathTypeMismatchException("converting out-of-range value to date");
                }
                return DateUtils.dateAdd(DateUtils.getDate(1970, 1, 1), d.intValue());
            }
            return d;
        } else if (unpack instanceof String) {
            String str = (String) unpack;
            if (str.length() != 0) {
                Date parseDateTime = DateUtils.parseDateTime(str);
                if (parseDateTime == null) {
                    throw new XPathTypeMismatchException("converting to date");
                }
                return parseDateTime;
            }
            return str;
        } else if (unpack instanceof Date) {
            return DateUtils.roundDate((Date) unpack);
        } else {
            throw new XPathTypeMismatchException("converting to date");
        }
    }

    public static Boolean boolNot(Object obj) {
        return new Boolean(!toBoolean(obj).booleanValue());
    }

    public static Boolean boolStr(Object obj) {
        String xPathFuncExpr = toString(obj);
        return (xPathFuncExpr.equalsIgnoreCase("true") || xPathFuncExpr.equals("1")) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static String dateStr(Object obj, Object obj2) {
        Object date = toDate(obj);
        return date instanceof Date ? DateUtils.format((Date) date, toString(obj2)) : "";
    }

    private Double position(TreeReference treeReference) {
        return new Double(treeReference.getMultLast() + 1);
    }

    public static Object ifThenElse(FormInstance formInstance, EvaluationContext evaluationContext, XPathExpression[] xPathExpressionArr, Object[] objArr) {
        objArr[0] = xPathExpressionArr[0].eval(formInstance, evaluationContext);
        return toBoolean(objArr[0]).booleanValue() ? xPathExpressionArr[1].eval(formInstance, evaluationContext) : xPathExpressionArr[2].eval(formInstance, evaluationContext);
    }

    public static Boolean multiSelected(Object obj, Object obj2) {
        return new Boolean(new StringBuilder().append(XFormAnswerDataSerializer.DELIMITER).append((String) unpack(obj)).append(XFormAnswerDataSerializer.DELIMITER).toString().indexOf(new StringBuilder().append(XFormAnswerDataSerializer.DELIMITER).append(((String) unpack(obj2)).trim()).append(XFormAnswerDataSerializer.DELIMITER).toString()) != -1);
    }

    public static Double countSelected(Object obj) {
        return new Double(DateUtils.split((String) unpack(obj), XFormAnswerDataSerializer.DELIMITER, true).size());
    }

    public static String selectedAt(Object obj, Object obj2) {
        return (String) DateUtils.split((String) unpack(obj), XFormAnswerDataSerializer.DELIMITER, true).elementAt(toInt(obj2).intValue());
    }

    public static Double count(Object obj) {
        if (obj instanceof XPathNodeset) {
            return new Double(((XPathNodeset) obj).size());
        }
        throw new XPathTypeMismatchException("not a nodeset");
    }

    public static Double sum(Object[] objArr) {
        double d = 0.0d;
        for (Object obj : objArr) {
            d += toNumeric(obj).doubleValue();
        }
        return new Double(d);
    }

    private static Double round(double d, double d2) {
        double d3;
        double d4;
        long j = 0;
        if (d == Double.NaN || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY) {
            return new Double(d);
        }
        if (d2 > 30.0d || d2 < -30.0d) {
            return new Double(Double.NaN);
        }
        if (d2 < 0.0d) {
            d3 = d;
            while (d2 <= -0.5d) {
                d3 /= 10.0d;
                j++;
                d2 += 1.0d;
            }
        } else {
            d3 = d;
            while (d2 >= 0.5d) {
                d3 *= 10.0d;
                j--;
                d2 -= 1.0d;
            }
        }
        double d5 = (long) (d3 + 0.5d);
        if (j < 0) {
            long j2 = j;
            d4 = d5;
            long j3 = j2;
            while (j3 < 0) {
                j3 = 1 + j3;
                d4 /= 10.0d;
            }
        } else {
            long j4 = j;
            d4 = d5;
            long j5 = j4;
            while (j5 > 0) {
                j5--;
                d4 = 10.0d * d4;
            }
        }
        return new Double(d4);
    }

    private static Object max(Object[] objArr) {
        double d = Double.MIN_VALUE;
        for (Object obj : objArr) {
            d = Math.max(d, toNumeric(obj).doubleValue());
        }
        return new Double(d);
    }

    private static Object min(Object[] objArr) {
        double d = Double.MAX_VALUE;
        for (Object obj : objArr) {
            d = Math.min(d, toNumeric(obj).doubleValue());
        }
        return new Double(d);
    }

    public static String join(Object obj, Object[] objArr) {
        String xPathFuncExpr = toString(obj);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < objArr.length; i++) {
            stringBuffer.append(toString(objArr[i]));
            if (i < objArr.length - 1) {
                stringBuffer.append(xPathFuncExpr);
            }
        }
        return stringBuffer.toString();
    }

    public static String substring(Object obj, Object obj2, Object obj3) {
        String xPathFuncExpr = toString(obj);
        int intValue = toInt(obj2).intValue();
        int length = xPathFuncExpr.length();
        int intValue2 = obj3 != null ? toInt(obj3).intValue() : length;
        if (intValue < 0) {
            intValue += length;
        }
        if (intValue2 < 0) {
            intValue2 += length;
        }
        int min = Math.min(Math.max(0, intValue), intValue2);
        int min2 = Math.min(Math.max(0, intValue2), intValue2);
        return min <= min2 ? xPathFuncExpr.substring(min, min2) : "";
    }

    public static Boolean checklist(Object obj, Object obj2, Object[] objArr) {
        boolean z = false;
        int intValue = toNumeric(obj).intValue();
        int intValue2 = toNumeric(obj2).intValue();
        int i = 0;
        for (Object obj3 : objArr) {
            if (toBoolean(obj3).booleanValue()) {
                i++;
            }
        }
        if ((intValue < 0 || i >= intValue) && (intValue2 < 0 || i <= intValue2)) {
            z = true;
        }
        return new Boolean(z);
    }

    public static Boolean checklistWeighted(Object obj, Object obj2, Object[] objArr, Object[] objArr2) {
        boolean z = false;
        double doubleValue = toNumeric(obj).doubleValue();
        double doubleValue2 = toNumeric(obj2).doubleValue();
        double d = 0.0d;
        for (int i = 0; i < objArr.length; i++) {
            boolean booleanValue = toBoolean(objArr[i]).booleanValue();
            double doubleValue3 = toNumeric(objArr2[i]).doubleValue();
            if (booleanValue) {
                d += doubleValue3;
            }
        }
        if (d >= doubleValue && d <= doubleValue2) {
            z = true;
        }
        return new Boolean(z);
    }

    public static Boolean regex(Object obj, Object obj2) {
        return new Boolean(new RE(toString(obj2)).match(toString(obj)));
    }

    private static Object[] subsetArgList(Object[] objArr, int i) {
        return subsetArgList(objArr, i, 1);
    }

    private static Object[] subsetArgList(Object[] objArr, int i, int i2) {
        if (i > objArr.length || i2 < 1) {
            throw new RuntimeException("error in subsetting arglist");
        }
        Object[] objArr2 = new Object[((int) MathUtils.divLongNotSuck((objArr.length - i) - 1, i2)) + 1];
        int i3 = 0;
        while (i < objArr.length) {
            objArr2[i3] = objArr[i];
            i += i2;
            i3++;
        }
        return objArr2;
    }

    public static Object unpack(Object obj) {
        if (obj instanceof XPathNodeset) {
            return ((XPathNodeset) obj).unpack();
        }
        return obj;
    }

    @Override // org.javarosa.xpath.expr.XPathExpression
    public Object pivot(FormInstance formInstance, EvaluationContext evaluationContext, Vector<Object> vector, Object obj) throws UnpivotableExpressionException {
        String xPathQName = this.id.toString();
        Object[] objArr = new Object[this.args.length];
        boolean z = false;
        for (String str : new String[]{"string-length"}) {
            if (str.equals(xPathQName)) {
                z = true;
            }
        }
        for (int i = 0; i < this.args.length; i++) {
            objArr[i] = this.args[i].pivot(formInstance, evaluationContext, vector, obj);
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            if (objArr[i2] == null) {
                z2 = true;
            } else if (obj.equals(objArr[i2])) {
                if (!z) {
                    throw new UnpivotableExpressionException();
                }
                return obj;
            }
        }
        if (z2) {
            if (z) {
                return null;
            }
            throw new UnpivotableExpressionException();
        }
        return eval(formInstance, evaluationContext);
    }
}
