package org.javarosa.core.model.instance.utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Vector;
import org.javarosa.core.model.FormDef;
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
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.InvalidReferenceException;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.services.storage.StorageManager;
import org.javarosa.core.services.storage.WrappingStorageUtility;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapBase;
import org.javarosa.core.util.externalizable.ExtWrapList;
import org.javarosa.core.util.externalizable.ExtWrapNullable;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.ExternalizableWrapper;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.kxml2.wap.Wbxml;
/* loaded from: classes.dex */
public class CompactInstanceWrapper implements WrappingStorageUtility.SerializationWrapper {
    public static final int CHOICE_INDEX = 1;
    public static final int CHOICE_MODE = 1;
    public static final int CHOICE_VALUE = 0;
    private FormInstance instance;
    private InstanceTemplateManager templateMgr;

    public CompactInstanceWrapper() {
        this(null);
    }

    public CompactInstanceWrapper(InstanceTemplateManager instanceTemplateManager) {
        this.templateMgr = instanceTemplateManager;
    }

    @Override // org.javarosa.core.services.storage.WrappingStorageUtility.SerializationWrapper
    public Class baseType() {
        return FormInstance.class;
    }

    @Override // org.javarosa.core.services.storage.WrappingStorageUtility.SerializationWrapper
    public void setData(Externalizable externalizable) {
        this.instance = (FormInstance) externalizable;
    }

    @Override // org.javarosa.core.services.storage.WrappingStorageUtility.SerializationWrapper
    public Externalizable getData() {
        return this.instance;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.instance = getTemplateInstance(ExtUtil.readInt(dataInputStream)).clone();
        this.instance.setID(ExtUtil.readInt(dataInputStream));
        this.instance.setDateSaved((Date) ExtUtil.read(dataInputStream, new ExtWrapNullable(Date.class)));
        readTreeElement(this.instance.getRoot(), dataInputStream, prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        if (this.instance == null) {
            throw new RuntimeException("instance has not yet been set via setData()");
        }
        ExtUtil.writeNumeric(dataOutputStream, this.instance.getFormId());
        ExtUtil.writeNumeric(dataOutputStream, this.instance.getID());
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(this.instance.getDateSaved()));
        writeTreeElement(dataOutputStream, this.instance.getRoot());
    }

    private FormInstance getTemplateInstance(int i) {
        if (this.templateMgr != null) {
            return this.templateMgr.getTemplateInstance(i);
        }
        FormInstance loadTemplateInstance = loadTemplateInstance(i);
        if (loadTemplateInstance == null) {
            throw new RuntimeException("no formdef found for form id [" + i + "]");
        }
        return loadTemplateInstance;
    }

    public static FormInstance loadTemplateInstance(int i) {
        FormDef formDef = (FormDef) StorageManager.getStorage(FormDef.STORAGE_KEY).read(i);
        if (formDef != null) {
            return formDef.getMainInstance();
        }
        return null;
    }

    private void readTreeElement(TreeElement treeElement, DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        TreeReference invalidReference;
        TreeElement templatePath = this.instance.getTemplatePath(treeElement.getRef());
        if (!templatePath.isLeaf()) {
            Vector vector = new Vector();
            for (int i = 0; i < templatePath.getNumChildren(); i++) {
                String name = templatePath.getChildAt(i).getName();
                if (!vector.contains(name)) {
                    vector.addElement(name);
                }
            }
            for (int i2 = 0; i2 < vector.size(); i2++) {
                String str = (String) vector.elementAt(i2);
                TreeElement templatePath2 = this.instance.getTemplatePath(treeElement.getRef().extendRef(str, 0));
                boolean z = templatePath2.repeatable;
                int readInt = ExtUtil.readInt(dataInputStream);
                boolean z2 = readInt > 0;
                if (!z && readInt > 1) {
                    throw new DeserializationException("Detected repeated instances of a non-repeatable node");
                }
                if (z) {
                    for (int childMultiplicity = treeElement.getChildMultiplicity(str) - 1; childMultiplicity >= 0; childMultiplicity--) {
                        treeElement.removeChild(str, childMultiplicity);
                    }
                    for (int i3 = 0; i3 < readInt; i3++) {
                        try {
                            this.instance.copyNode(templatePath2, treeElement.getRef().extendRef(str, i3));
                            TreeElement child = treeElement.getChild(str, i3);
                            child.setRelevant(true);
                            readTreeElement(child, dataInputStream, prototypeFactory);
                        } catch (InvalidReferenceException e) {
                            if (e.getInvalidReference() == null) {
                                throw new DeserializationException("Null Reference while attempting to deserialize! " + e.getMessage());
                            }
                            throw new DeserializationException("Invalid Reference while attemtping to deserialize! Reference: " + invalidReference.toString(true) + " | " + e.getMessage());
                        }
                    }
                    continue;
                } else {
                    TreeElement child2 = treeElement.getChild(str, 0);
                    child2.setRelevant(z2);
                    if (z2) {
                        readTreeElement(child2, dataInputStream, prototypeFactory);
                    }
                }
            }
            return;
        }
        treeElement.setValue((IAnswerData) ExtUtil.read(dataInputStream, new ExtWrapAnswerData(treeElement.dataType)));
    }

    private void writeTreeElement(DataOutputStream dataOutputStream, TreeElement treeElement) throws IOException {
        TreeElement templatePath = this.instance.getTemplatePath(treeElement.getRef());
        if (!templatePath.isLeaf()) {
            Vector vector = new Vector();
            for (int i = 0; i < templatePath.getNumChildren(); i++) {
                String name = templatePath.getChildAt(i).getName();
                if (!vector.contains(name)) {
                    vector.addElement(name);
                    int childMultiplicity = treeElement.getChildMultiplicity(name);
                    if (childMultiplicity > 0 && !treeElement.getChild(name, 0).isRelevant()) {
                        childMultiplicity = 0;
                    }
                    ExtUtil.writeNumeric(dataOutputStream, childMultiplicity);
                    for (int i2 = 0; i2 < childMultiplicity; i2++) {
                        writeTreeElement(dataOutputStream, treeElement.getChild(name, i2));
                    }
                }
            }
            return;
        }
        ExtUtil.write(dataOutputStream, new ExtWrapAnswerData(treeElement.dataType, treeElement.getValue()));
    }

    /* loaded from: classes.dex */
    public class ExtWrapAnswerData extends ExternalizableWrapper {
        int dataType;

        public ExtWrapAnswerData(int i, IAnswerData iAnswerData) {
            CompactInstanceWrapper.this = r1;
            this.val = iAnswerData;
            this.dataType = i;
        }

        public ExtWrapAnswerData(int i) {
            CompactInstanceWrapper.this = r1;
            this.dataType = i;
        }

        @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
        public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
            byte readByte = dataInputStream.readByte();
            if (readByte == 0) {
                this.val = null;
                return;
            }
            Class classForDataType = CompactInstanceWrapper.classForDataType(this.dataType);
            if (classForDataType == null) {
                this.val = ExtUtil.read(dataInputStream, new ExtWrapTagged(), prototypeFactory);
            } else if (classForDataType == SelectOneData.class) {
                this.val = CompactInstanceWrapper.this.getSelectOne(ExtUtil.read(dataInputStream, Integer.class));
            } else if (classForDataType == SelectMultiData.class) {
                this.val = CompactInstanceWrapper.this.getSelectMulti((Vector) ExtUtil.read(dataInputStream, new ExtWrapList(Integer.class)));
            } else {
                switch (readByte) {
                    case 64:
                        classForDataType = StringData.class;
                        break;
                    case Wbxml.EXT_I_1 /* 65 */:
                        classForDataType = IntegerData.class;
                        break;
                    case Wbxml.EXT_I_2 /* 66 */:
                        classForDataType = DecimalData.class;
                        break;
                    case Wbxml.PI /* 67 */:
                        classForDataType = DateData.class;
                        break;
                    case Wbxml.LITERAL_C /* 68 */:
                        classForDataType = BooleanData.class;
                        break;
                }
                this.val = (IAnswerData) ExtUtil.read(dataInputStream, classForDataType);
            }
        }

        @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
        public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
            int i;
            Object obj;
            if (this.val == null) {
                dataOutputStream.writeByte(0);
                return;
            }
            if (this.dataType < 0 || this.dataType >= 100) {
                obj = new ExtWrapTagged(this.val);
                i = 1;
            } else if (this.val instanceof SelectOneData) {
                obj = new ExtWrapBase(CompactInstanceWrapper.this.compactSelectOne((SelectOneData) this.val));
                i = 1;
            } else if (this.val instanceof SelectMultiData) {
                obj = new ExtWrapList(CompactInstanceWrapper.this.compactSelectMulti((SelectMultiData) this.val));
                i = 1;
            } else {
                obj = (IAnswerData) this.val;
                if (this.val.getClass() == CompactInstanceWrapper.classForDataType(this.dataType)) {
                    i = 1;
                } else if (this.val instanceof StringData) {
                    i = 64;
                } else if (this.val instanceof IntegerData) {
                    i = 65;
                } else if (this.val instanceof DecimalData) {
                    i = 66;
                } else if (this.val instanceof DateData) {
                    i = 67;
                } else if (this.val instanceof BooleanData) {
                    i = 68;
                } else {
                    throw new RuntimeException("divergent data type not allowed");
                }
            }
            dataOutputStream.writeByte(i);
            ExtUtil.write(dataOutputStream, obj);
        }

        @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
        public ExternalizableWrapper clone(Object obj) {
            throw new RuntimeException("not supported");
        }

        @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
        public void metaReadExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
            throw new RuntimeException("not supported");
        }

        @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
        public void metaWriteExternal(DataOutputStream dataOutputStream) throws IOException {
            throw new RuntimeException("not supported");
        }
    }

    public Object compactSelectOne(SelectOneData selectOneData) {
        return extractSelection((Selection) selectOneData.getValue());
    }

    public Vector compactSelectMulti(SelectMultiData selectMultiData) {
        Vector vector = (Vector) selectMultiData.getValue();
        Vector vector2 = new Vector();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < vector.size()) {
                vector2.addElement(extractSelection((Selection) vector.elementAt(i2)));
                i = i2 + 1;
            } else {
                return vector2;
            }
        }
    }

    public SelectOneData getSelectOne(Object obj) {
        return new SelectOneData(makeSelection(obj));
    }

    public SelectMultiData getSelectMulti(Vector vector) {
        Vector vector2 = new Vector();
        for (int i = 0; i < vector.size(); i++) {
            vector2.addElement(makeSelection(vector.elementAt(i)));
        }
        return new SelectMultiData(vector2);
    }

    private Object extractSelection(Selection selection) {
        switch (1) {
            case 0:
                return selection.getValue();
            case 1:
                if (selection.index == -1) {
                    throw new RuntimeException("trying to serialize in choice-index mode but selections do not have indexes set!");
                }
                return new Integer(selection.index);
            default:
                throw new IllegalArgumentException();
        }
    }

    private Selection makeSelection(Object obj) {
        if (obj instanceof String) {
            return new Selection((String) obj);
        }
        if (obj instanceof Integer) {
            return new Selection(((Integer) obj).intValue());
        }
        throw new RuntimeException();
    }

    public static Class classForDataType(int i) {
        switch (i) {
            case 0:
                return StringData.class;
            case 1:
                return StringData.class;
            case 2:
                return IntegerData.class;
            case 3:
                return DecimalData.class;
            case 4:
                return DateData.class;
            case 5:
                return TimeData.class;
            case 6:
                return DateTimeData.class;
            case 7:
                return SelectOneData.class;
            case 8:
                return SelectMultiData.class;
            case 9:
                return BooleanData.class;
            case 10:
                return GeoPointData.class;
            case 11:
            case 12:
            default:
                return null;
            case 13:
                return LongData.class;
        }
    }
}
