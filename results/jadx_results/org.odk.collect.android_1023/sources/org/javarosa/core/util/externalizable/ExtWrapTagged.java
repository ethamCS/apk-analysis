package org.javarosa.core.util.externalizable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
/* loaded from: classes.dex */
public class ExtWrapTagged extends ExternalizableWrapper {
    public static final byte[] WRAPPER_TAG = {-1, -1, -1, -1};
    public static Hashtable WRAPPER_CODES = new Hashtable();

    static {
        WRAPPER_CODES.put(ExtWrapNullable.class, new Integer(0));
        WRAPPER_CODES.put(ExtWrapList.class, new Integer(32));
        WRAPPER_CODES.put(ExtWrapListPoly.class, new Integer(33));
        WRAPPER_CODES.put(ExtWrapMap.class, new Integer(34));
        WRAPPER_CODES.put(ExtWrapMapPoly.class, new Integer(35));
        WRAPPER_CODES.put(ExtWrapIntEncodingUniform.class, new Integer(64));
        WRAPPER_CODES.put(ExtWrapIntEncodingSmall.class, new Integer(65));
    }

    public ExtWrapTagged(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        if (obj instanceof ExtWrapTagged) {
            throw new IllegalArgumentException("Wrapping tagged with tagged is redundant");
        }
        this.val = obj;
    }

    public ExtWrapTagged() {
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public ExternalizableWrapper clone(Object obj) {
        return new ExtWrapTagged(obj);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.val = ExtUtil.read(dataInputStream, readTag(dataInputStream, prototypeFactory), prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        writeTag(dataOutputStream, this.val);
        ExtUtil.write(dataOutputStream, this.val);
    }

    public static ExternalizableWrapper readTag(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        ExternalizableWrapper externalizableWrapper;
        byte[] bArr = new byte[4];
        dataInputStream.read(bArr, 0, bArr.length);
        if (PrototypeFactory.compareHash(bArr, WRAPPER_TAG)) {
            int readInt = ExtUtil.readInt(dataInputStream);
            ExternalizableWrapper externalizableWrapper2 = null;
            Enumeration keys = WRAPPER_CODES.keys();
            while (keys.hasMoreElements()) {
                Class cls = (Class) keys.nextElement();
                if (((Integer) WRAPPER_CODES.get(cls)).intValue() == readInt) {
                    try {
                        externalizableWrapper = (ExternalizableWrapper) PrototypeFactory.getInstance(cls);
                    } catch (CannotCreateObjectException e) {
                        throw new CannotCreateObjectException("Serious problem: cannot create built-in ExternalizableWrapper [" + cls.getName() + "]");
                    }
                } else {
                    externalizableWrapper = externalizableWrapper2;
                }
                externalizableWrapper2 = externalizableWrapper;
            }
            if (externalizableWrapper2 == null) {
                throw new DeserializationException("Unrecognized ExternalizableWrapper type [" + readInt + "]");
            }
            externalizableWrapper2.metaReadExternal(dataInputStream, prototypeFactory);
            return externalizableWrapper2;
        }
        Class cls2 = prototypeFactory.getClass(bArr);
        if (cls2 == null) {
            throw new DeserializationException("No datatype registered to serialization code " + ExtUtil.printBytes(bArr));
        }
        return new ExtWrapBase(cls2);
    }

    public static void writeTag(DataOutputStream dataOutputStream, Object obj) throws IOException {
        Class<?> cls;
        if ((obj instanceof ExternalizableWrapper) && !(obj instanceof ExtWrapBase)) {
            dataOutputStream.write(WRAPPER_TAG, 0, 4);
            ExtUtil.writeNumeric(dataOutputStream, ((Integer) WRAPPER_CODES.get(obj.getClass())).intValue());
            ((ExternalizableWrapper) obj).metaWriteExternal(dataOutputStream);
            return;
        }
        if (!(obj instanceof ExtWrapBase)) {
            cls = null;
        } else {
            ExtWrapBase extWrapBase = (ExtWrapBase) obj;
            if (extWrapBase.val != null) {
                obj = extWrapBase.val;
                cls = null;
            } else {
                cls = extWrapBase.type;
            }
        }
        if (cls == null) {
            cls = obj.getClass();
        }
        byte[] classHash = PrototypeFactory.getClassHash(cls);
        dataOutputStream.write(classHash, 0, classHash.length);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaReadExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) {
        throw new RuntimeException("Tagged wrapper should never be tagged");
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaWriteExternal(DataOutputStream dataOutputStream) {
        throw new RuntimeException("Tagged wrapper should never be tagged");
    }
}
