package org.javarosa.core.model.util.restorable;

import java.util.Date;
import java.util.Vector;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.data.DateData;
import org.javarosa.core.model.data.DateTimeData;
import org.javarosa.core.model.data.DecimalData;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.IntegerData;
import org.javarosa.core.model.data.LongData;
import org.javarosa.core.model.data.SelectMultiData;
import org.javarosa.core.model.data.StringData;
import org.javarosa.core.model.data.TimeData;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.services.storage.IStorageIterator;
import org.javarosa.core.services.storage.IStorageUtility;
import org.javarosa.core.services.storage.Persistable;
import org.javarosa.core.services.transport.payload.ByteArrayPayload;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class RestoreUtils {
    public static final String RECORD_ID_TAG = "rec-id";
    public static IXFormyFactory xfFact;

    public static TreeReference ref(String str) {
        return xfFact.ref(str);
    }

    public static TreeReference absRef(String str, FormInstance formInstance) {
        TreeReference ref = ref(str);
        if (!ref.isAbsolute()) {
            return ref.parent(topRef(formInstance));
        }
        return ref;
    }

    public static TreeReference topRef(FormInstance formInstance) {
        return ref("/" + formInstance.getRoot().getName());
    }

    public static TreeReference childRef(String str, TreeReference treeReference) {
        return ref(str).parent(treeReference);
    }

    private static FormInstance newDataModel(String str) {
        FormInstance formInstance = new FormInstance();
        formInstance.addNode(ref("/" + str));
        return formInstance;
    }

    public static FormInstance createDataModel(Restorable restorable) {
        FormInstance newDataModel = newDataModel(restorable.getRestorableType());
        if (restorable instanceof Persistable) {
            addData(newDataModel, RECORD_ID_TAG, new Integer(((Persistable) restorable).getID()));
        }
        return newDataModel;
    }

    public static FormInstance createRootDataModel(Restorable restorable) {
        FormInstance createDataModel = createDataModel(restorable);
        createDataModel.schema = "http://openrosa.org/backup";
        addData(createDataModel, "timestamp", new Date(), 6);
        return createDataModel;
    }

    public static void addData(FormInstance formInstance, String str, Object obj) {
        addData(formInstance, str, obj, getDataType(obj));
    }

    public static void addData(FormInstance formInstance, String str, Object obj, int i) {
        IAnswerData iAnswerData;
        if (obj == null) {
            i = -1;
        }
        switch (i) {
            case -1:
                iAnswerData = null;
                break;
            case 0:
            case 7:
            case 10:
            case 11:
            case 12:
            default:
                throw new IllegalArgumentException("Don't know how to handle data type [" + i + "]");
            case 1:
                iAnswerData = new StringData((String) obj);
                break;
            case 2:
                iAnswerData = new IntegerData((Integer) obj);
                break;
            case 3:
                iAnswerData = new DecimalData((Double) obj);
                break;
            case 4:
                iAnswerData = new DateData((Date) obj);
                break;
            case 5:
                iAnswerData = new TimeData((Date) obj);
                break;
            case 6:
                iAnswerData = new DateTimeData((Date) obj);
                break;
            case 8:
                iAnswerData = (SelectMultiData) obj;
                break;
            case 9:
                iAnswerData = new StringData(((Boolean) obj).booleanValue() ? "t" : "f");
                break;
            case 13:
                iAnswerData = new LongData((Long) obj);
                break;
        }
        if (formInstance.addNode(absRef(str, formInstance), iAnswerData, i) == null) {
            throw new RuntimeException("error setting value during object backup [" + str + "]");
        }
    }

    public static int getDataType(Object obj) {
        if (obj instanceof String) {
            return 1;
        }
        if (obj instanceof Integer) {
            return 2;
        }
        if (obj instanceof Long) {
            return 13;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 3;
        }
        if (obj instanceof Date) {
            return 4;
        }
        if (obj instanceof Boolean) {
            return 9;
        }
        if (!(obj instanceof SelectMultiData)) {
            return -1;
        }
        return 8;
    }

    public static int getDataType(Class cls) {
        if (cls == String.class) {
            return 1;
        }
        if (cls == Integer.class) {
            return 2;
        }
        if (cls == Long.class) {
            return 13;
        }
        if (cls == Float.class || cls == Double.class) {
            return 3;
        }
        if (cls == Date.class) {
            return 4;
        }
        if (cls == Boolean.class) {
            return 1;
        }
        throw new RuntimeException("Can't handle data type " + cls.getName());
    }

    public static Object getValue(String str, FormInstance formInstance) {
        return getValue(str, topRef(formInstance), formInstance);
    }

    public static Object getValue(String str, TreeReference treeReference, FormInstance formInstance) {
        IAnswerData value;
        TreeElement resolveReference = formInstance.resolveReference(ref(str).contextualize(treeReference));
        if (resolveReference == null) {
            throw new RuntimeException("Could not find node [" + str + "] when parsing saved instance!");
        }
        if (resolveReference.isRelevant() && (value = resolveReference.getValue()) != null) {
            return value.getValue();
        }
        return null;
    }

    public static void applyDataType(FormInstance formInstance, String str, TreeReference treeReference, Class cls) {
        applyDataType(formInstance, str, treeReference, getDataType(cls));
    }

    public static void applyDataType(FormInstance formInstance, String str, TreeReference treeReference, int i) {
        Vector<TreeReference> expandReference = new EvaluationContext(formInstance).expandReference(childRef(str, treeReference));
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < expandReference.size()) {
                formInstance.resolveReference(expandReference.elementAt(i3)).dataType = i;
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    public static void templateChild(FormInstance formInstance, String str, TreeReference treeReference, Restorable restorable) {
        if (str != null) {
            treeReference = childRef(str, treeReference);
        }
        templateData(restorable, formInstance, childRef(restorable.getRestorableType(), treeReference));
    }

    public static void templateData(Restorable restorable, FormInstance formInstance, TreeReference treeReference) {
        if (treeReference == null) {
            treeReference = topRef(formInstance);
            applyDataType(formInstance, "timestamp", treeReference, Date.class);
        }
        if (restorable instanceof Persistable) {
            applyDataType(formInstance, RECORD_ID_TAG, treeReference, Integer.class);
        }
        restorable.templateData(formInstance, treeReference);
    }

    public static void mergeDataModel(FormInstance formInstance, FormInstance formInstance2, String str) {
        mergeDataModel(formInstance, formInstance2, absRef(str, formInstance));
    }

    public static void mergeDataModel(FormInstance formInstance, FormInstance formInstance2, TreeReference treeReference) {
        TreeElement resolveReference = formInstance.resolveReference(treeReference);
        if (resolveReference == null) {
            resolveReference = formInstance.resolveReference(formInstance.addNode(treeReference));
        }
        TreeElement root = formInstance2.getRoot();
        root.setMult(resolveReference.getChildMultiplicity(root.getName()));
        resolveReference.addChild(root);
    }

    public static FormInstance exportRMS(IStorageUtility iStorageUtility, Class cls, String str, IRecordFilter iRecordFilter) {
        if (!Externalizable.class.isAssignableFrom(cls) || !Restorable.class.isAssignableFrom(cls)) {
            return null;
        }
        FormInstance newDataModel = newDataModel(str);
        IStorageIterator iterate = iStorageUtility.iterate();
        while (iterate.hasMore()) {
            Externalizable nextRecord = iterate.nextRecord();
            if (iRecordFilter == null || iRecordFilter.filter(nextRecord)) {
                mergeDataModel(newDataModel, ((Restorable) nextRecord).exportData(), topRef(newDataModel));
            }
        }
        return newDataModel;
    }

    public static FormInstance subDataModel(TreeElement treeElement) {
        TreeElement shallowCopy = treeElement.shallowCopy();
        shallowCopy.setMult(0);
        return new FormInstance(shallowCopy);
    }

    public static void exportRMS(FormInstance formInstance, Class cls, String str, IStorageUtility iStorageUtility, IRecordFilter iRecordFilter) {
        mergeDataModel(formInstance, exportRMS(iStorageUtility, cls, str, iRecordFilter), ".");
    }

    public static void importRMS(FormInstance formInstance, IStorageUtility iStorageUtility, Class cls, String str) {
        if (Externalizable.class.isAssignableFrom(cls) && Restorable.class.isAssignableFrom(cls)) {
            boolean isAssignableFrom = Persistable.class.isAssignableFrom(cls);
            Vector<TreeElement> childrenWithName = formInstance.resolveReference(absRef(str, formInstance)).getChildrenWithName(((Restorable) PrototypeFactory.getInstance(cls)).getRestorableType());
            for (int i = 0; i < childrenWithName.size(); i++) {
                FormInstance subDataModel = subDataModel(childrenWithName.elementAt(i));
                Restorable restorable = (Restorable) PrototypeFactory.getInstance(cls);
                int i2 = -1;
                if (isAssignableFrom) {
                    int intValue = ((Integer) getValue(RECORD_ID_TAG, subDataModel)).intValue();
                    ((Persistable) restorable).setID(intValue);
                    i2 = intValue;
                }
                restorable.importData(subDataModel);
                if (isAssignableFrom) {
                    try {
                        iStorageUtility.write((Persistable) restorable);
                        continue;
                    } catch (Exception e) {
                        throw new RuntimeException("Error importing RMS during restore! [" + cls.getName() + ":" + i2 + "]; " + e.getMessage());
                    }
                } else {
                    iStorageUtility.add((Externalizable) restorable);
                    continue;
                }
            }
        }
    }

    public static ByteArrayPayload dispatch(FormInstance formInstance) {
        return (ByteArrayPayload) xfFact.serializeInstance(formInstance);
    }

    public static FormInstance receive(byte[] bArr, Class cls) {
        return xfFact.parseRestore(bArr, cls);
    }

    public static boolean getBoolean(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if ("t".equals(str)) {
                return true;
            }
            if ("f".equals(str)) {
                return false;
            }
            throw new RuntimeException("boolean string must be t or f");
        }
        throw new RuntimeException("booleans are encoded as strings");
    }
}
