package org.javarosa.core.util.externalizable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.UTFDataFormatException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.services.PrototypeManager;
import org.javarosa.core.util.OrderedHashtable;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
/* loaded from: classes.dex */
public class ExtUtil {
    public static byte[] serialize(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            write(new DataOutputStream(byteArrayOutputStream), obj);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("IOException writing to ByteArrayOutputStream; shouldn't happen!");
        }
    }

    public static Object deserialize(byte[] bArr, Class cls) throws DeserializationException {
        try {
            return read(new DataInputStream(new ByteArrayInputStream(bArr)), cls);
        } catch (EOFException e) {
            throw new DeserializationException("Unexpectedly reached end of stream when deserializing");
        } catch (UTFDataFormatException e2) {
            throw new DeserializationException("Unexpectedly reached end of stream when deserializing");
        } catch (IOException e3) {
            throw new RuntimeException("Unknown IOException reading from ByteArrayInputStream; shouldn't happen!");
        }
    }

    public static Object deserialize(byte[] bArr, ExternalizableWrapper externalizableWrapper) throws DeserializationException {
        try {
            return read(new DataInputStream(new ByteArrayInputStream(bArr)), externalizableWrapper);
        } catch (EOFException e) {
            throw new DeserializationException("Unexpectedly reached end of stream when deserializing");
        } catch (UTFDataFormatException e2) {
            throw new DeserializationException("Unexpectedly reached end of stream when deserializing");
        } catch (IOException e3) {
            throw new RuntimeException("Unknown IOException reading from ByteArrayInputStream; shouldn't happen!");
        }
    }

    public static int getSize(Object obj) {
        return serialize(obj).length;
    }

    public static PrototypeFactory defaultPrototypes() {
        return PrototypeManager.getDefault();
    }

    public static void write(DataOutputStream dataOutputStream, Object obj) throws IOException {
        if (obj instanceof Externalizable) {
            ((Externalizable) obj).writeExternal(dataOutputStream);
        } else if (obj instanceof Byte) {
            writeNumeric(dataOutputStream, ((Byte) obj).byteValue());
        } else if (obj instanceof Short) {
            writeNumeric(dataOutputStream, ((Short) obj).shortValue());
        } else if (obj instanceof Integer) {
            writeNumeric(dataOutputStream, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            writeNumeric(dataOutputStream, ((Long) obj).longValue());
        } else if (obj instanceof Character) {
            writeChar(dataOutputStream, ((Character) obj).charValue());
        } else if (obj instanceof Float) {
            writeDecimal(dataOutputStream, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            writeDecimal(dataOutputStream, ((Double) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            writeBool(dataOutputStream, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            writeString(dataOutputStream, (String) obj);
        } else if (obj instanceof Date) {
            writeDate(dataOutputStream, (Date) obj);
        } else if (obj instanceof byte[]) {
            writeBytes(dataOutputStream, (byte[]) obj);
        } else {
            throw new ClassCastException("Not a serializable datatype: " + obj.getClass().getName());
        }
    }

    public static void writeNumeric(DataOutputStream dataOutputStream, long j) throws IOException {
        writeNumeric(dataOutputStream, j, new ExtWrapIntEncodingUniform());
    }

    public static void writeNumeric(DataOutputStream dataOutputStream, long j, ExtWrapIntEncoding extWrapIntEncoding) throws IOException {
        write(dataOutputStream, extWrapIntEncoding.clone(new Long(j)));
    }

    public static void writeChar(DataOutputStream dataOutputStream, char c) throws IOException {
        dataOutputStream.writeChar(c);
    }

    public static void writeDecimal(DataOutputStream dataOutputStream, double d) throws IOException {
        dataOutputStream.writeDouble(d);
    }

    public static void writeBool(DataOutputStream dataOutputStream, boolean z) throws IOException {
        dataOutputStream.writeBoolean(z);
    }

    public static void writeString(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeUTF(str);
    }

    public static void writeDate(DataOutputStream dataOutputStream, Date date) throws IOException {
        writeNumeric(dataOutputStream, date.getTime());
    }

    public static void writeBytes(DataOutputStream dataOutputStream, byte[] bArr) throws IOException {
        writeNumeric(dataOutputStream, bArr.length);
        if (bArr.length > 0) {
            dataOutputStream.write(bArr);
        }
    }

    public static void writeInts(DataOutputStream dataOutputStream, int[] iArr) throws IOException {
        writeNumeric(dataOutputStream, iArr.length);
        for (int i : iArr) {
            writeNumeric(dataOutputStream, i);
        }
    }

    public static void writeAttributes(DataOutputStream dataOutputStream, Vector<TreeElement> vector) throws IOException {
        writeNumeric(dataOutputStream, vector.size());
        Iterator<TreeElement> it = vector.iterator();
        while (it.hasNext()) {
            TreeElement next = it.next();
            write(dataOutputStream, next.getNamespace());
            write(dataOutputStream, next.getName());
            write(dataOutputStream, next.getAttributeValue());
        }
    }

    public static Object read(DataInputStream dataInputStream, Class cls) throws IOException, DeserializationException {
        return read(dataInputStream, cls, (PrototypeFactory) null);
    }

    public static Object read(DataInputStream dataInputStream, Class cls, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        if (Externalizable.class.isAssignableFrom(cls)) {
            Externalizable externalizable = (Externalizable) PrototypeFactory.getInstance(cls);
            if (prototypeFactory == null) {
                prototypeFactory = defaultPrototypes();
            }
            externalizable.readExternal(dataInputStream, prototypeFactory);
            return externalizable;
        } else if (cls == Byte.class) {
            return new Byte(readByte(dataInputStream));
        } else {
            if (cls == Short.class) {
                return new Short(readShort(dataInputStream));
            }
            if (cls == Integer.class) {
                return new Integer(readInt(dataInputStream));
            }
            if (cls == Long.class) {
                return new Long(readNumeric(dataInputStream));
            }
            if (cls == Character.class) {
                return new Character(readChar(dataInputStream));
            }
            if (cls == Float.class) {
                return new Float((float) readDecimal(dataInputStream));
            }
            if (cls == Double.class) {
                return new Double(readDecimal(dataInputStream));
            }
            if (cls == Boolean.class) {
                return new Boolean(readBool(dataInputStream));
            }
            if (cls == String.class) {
                return readString(dataInputStream);
            }
            if (cls == Date.class) {
                return readDate(dataInputStream);
            }
            if (cls == byte[].class) {
                return readBytes(dataInputStream);
            }
            throw new ClassCastException("Not a deserializable datatype: " + cls.getName());
        }
    }

    public static Object read(DataInputStream dataInputStream, ExternalizableWrapper externalizableWrapper) throws IOException, DeserializationException {
        return read(dataInputStream, externalizableWrapper, (PrototypeFactory) null);
    }

    public static Object read(DataInputStream dataInputStream, ExternalizableWrapper externalizableWrapper, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        if (prototypeFactory == null) {
            prototypeFactory = defaultPrototypes();
        }
        externalizableWrapper.readExternal(dataInputStream, prototypeFactory);
        return externalizableWrapper.val;
    }

    public static long readNumeric(DataInputStream dataInputStream) throws IOException {
        return readNumeric(dataInputStream, new ExtWrapIntEncodingUniform());
    }

    public static long readNumeric(DataInputStream dataInputStream, ExtWrapIntEncoding extWrapIntEncoding) throws IOException {
        try {
            return ((Long) read(dataInputStream, extWrapIntEncoding)).longValue();
        } catch (DeserializationException e) {
            throw new RuntimeException("Shouldn't happen: Base-type encoding wrappers should never touch prototypes");
        }
    }

    public static int readInt(DataInputStream dataInputStream) throws IOException {
        return toInt(readNumeric(dataInputStream));
    }

    public static short readShort(DataInputStream dataInputStream) throws IOException {
        return toShort(readNumeric(dataInputStream));
    }

    public static byte readByte(DataInputStream dataInputStream) throws IOException {
        return toByte(readNumeric(dataInputStream));
    }

    public static char readChar(DataInputStream dataInputStream) throws IOException {
        return dataInputStream.readChar();
    }

    public static double readDecimal(DataInputStream dataInputStream) throws IOException {
        return dataInputStream.readDouble();
    }

    public static boolean readBool(DataInputStream dataInputStream) throws IOException {
        return dataInputStream.readBoolean();
    }

    public static String readString(DataInputStream dataInputStream) throws IOException {
        return dataInputStream.readUTF();
    }

    public static Date readDate(DataInputStream dataInputStream) throws IOException {
        return new Date(readNumeric(dataInputStream));
    }

    public static byte[] readBytes(DataInputStream dataInputStream) throws IOException {
        int readNumeric = (int) readNumeric(dataInputStream);
        byte[] bArr = new byte[readNumeric];
        int i = readNumeric;
        int i2 = 0;
        while (i2 != readNumeric) {
            i2 = dataInputStream.read(bArr, 0, i);
            i -= i2;
        }
        return bArr;
    }

    public static int[] readInts(DataInputStream dataInputStream) throws IOException {
        int readNumeric = (int) readNumeric(dataInputStream);
        int[] iArr = new int[readNumeric];
        for (int i = 0; i < readNumeric; i++) {
            iArr[i] = (int) readNumeric(dataInputStream);
        }
        return iArr;
    }

    public static Vector<TreeElement> readAttributes(DataInputStream dataInputStream, TreeElement treeElement) throws IOException {
        int readNumeric = (int) readNumeric(dataInputStream);
        Vector<TreeElement> vector = new Vector<>();
        for (int i = 0; i < readNumeric; i++) {
            TreeElement constructAttributeElement = TreeElement.constructAttributeElement(readString(dataInputStream), readString(dataInputStream), readString(dataInputStream));
            constructAttributeElement.setParent(treeElement);
            vector.addElement(constructAttributeElement);
        }
        return vector;
    }

    public static int toInt(long j) {
        if (j < -2147483648L || j > 2147483647L) {
            throw new ArithmeticException("Value (" + j + ") cannot fit into int");
        }
        return (int) j;
    }

    public static short toShort(long j) {
        if (j < -32768 || j > 32767) {
            throw new ArithmeticException("Value (" + j + ") cannot fit into short");
        }
        return (short) j;
    }

    public static byte toByte(long j) {
        if (j < -128 || j > 127) {
            throw new ArithmeticException("Value (" + j + ") cannot fit into byte");
        }
        return (byte) j;
    }

    public static long toLong(Object obj) {
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        if (obj instanceof Short) {
            return ((Short) obj).shortValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof Character) {
            return ((Character) obj).charValue();
        }
        throw new ClassCastException();
    }

    public static byte[] nullIfEmpty(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return bArr;
    }

    public static String nullIfEmpty(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static Vector nullIfEmpty(Vector vector) {
        if (vector == null || vector.size() == 0) {
            return null;
        }
        return vector;
    }

    public static Hashtable nullIfEmpty(Hashtable hashtable) {
        if (hashtable == null || hashtable.size() == 0) {
            return null;
        }
        return hashtable;
    }

    public static byte[] emptyIfNull(byte[] bArr) {
        return bArr == null ? new byte[0] : bArr;
    }

    public static String emptyIfNull(String str) {
        return str == null ? "" : str;
    }

    public static Vector emptyIfNull(Vector vector) {
        return vector == null ? new Vector() : vector;
    }

    public static Hashtable emptyIfNull(Hashtable hashtable) {
        return hashtable == null ? new Hashtable() : hashtable;
    }

    public static Object unwrap(Object obj) {
        return obj instanceof ExternalizableWrapper ? ((ExternalizableWrapper) obj).baseValue() : obj;
    }

    public static boolean equals(Object obj, Object obj2) {
        Object unwrap = unwrap(obj);
        Object unwrap2 = unwrap(obj2);
        if (unwrap == null) {
            return unwrap2 == null;
        } else if (unwrap instanceof Vector) {
            return (unwrap2 instanceof Vector) && vectorEquals((Vector) unwrap, (Vector) unwrap2);
        } else if (!(unwrap instanceof Hashtable)) {
            return unwrap.equals(unwrap2);
        } else {
            return (unwrap2 instanceof Hashtable) && hashtableEquals((Hashtable) unwrap, (Hashtable) unwrap2);
        }
    }

    public static boolean vectorEquals(Vector vector, Vector vector2) {
        if (vector.size() != vector2.size()) {
            return false;
        }
        for (int i = 0; i < vector.size(); i++) {
            if (!equals(vector.elementAt(i), vector2.elementAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean arrayEquals(Object[] objArr, Object[] objArr2) {
        if (objArr.length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (!equals(objArr[i], objArr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean hashtableEquals(Hashtable hashtable, Hashtable hashtable2) {
        if (hashtable.size() == hashtable2.size() && (hashtable instanceof OrderedHashtable) == (hashtable2 instanceof OrderedHashtable)) {
            Enumeration keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                Object nextElement = keys.nextElement();
                if (!equals(hashtable.get(nextElement), hashtable2.get(nextElement))) {
                    return false;
                }
            }
            if ((hashtable instanceof OrderedHashtable) && (hashtable2 instanceof OrderedHashtable)) {
                Enumeration keys2 = hashtable.keys();
                Enumeration keys3 = hashtable2.keys();
                while (keys2.hasMoreElements()) {
                    if (!keys2.nextElement().equals(keys3.nextElement())) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static String printBytes(byte[] bArr) {
        String substring;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            if (hexString.length() == 1) {
                substring = "0" + hexString;
            } else {
                substring = hexString.substring(hexString.length() - 2);
            }
            stringBuffer.append(substring);
            if (i < bArr.length - 1) {
                if ((i + 1) % 30 == 0) {
                    stringBuffer.append("\n ");
                } else if ((i + 1) % 10 == 0) {
                    stringBuffer.append("  ");
                } else {
                    stringBuffer.append(XFormAnswerDataSerializer.DELIMITER);
                }
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public static void deserialize(byte[] bArr, Externalizable externalizable) throws IOException, DeserializationException {
        externalizable.readExternal(new DataInputStream(new ByteArrayInputStream(bArr)), defaultPrototypes());
    }

    public static Object deserialize(byte[] bArr, Class cls, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        return read(new DataInputStream(new ByteArrayInputStream(bArr)), cls, prototypeFactory);
    }
}
