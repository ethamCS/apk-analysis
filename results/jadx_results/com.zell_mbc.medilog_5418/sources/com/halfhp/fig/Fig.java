package com.halfhp.fig;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes2.dex */
public abstract class Fig {
    private static final String CFG_ELEMENT_NAME = "config";
    private static final String COLOR_TRANSPARENT_COMPRESSED_HEX = "#0";
    private static final String DOT_SEPARATOR = ".";
    private static final String GETTER_PREFIX = "get";
    private static final String PATH_SEPARATOR = "/";
    private static final String RESOURCE_ID_PREFIX = "@";
    private static final String SETTER_PREFIX = "set";

    private static int parseResId(Context context, String str) {
        if (str.startsWith(RESOURCE_ID_PREFIX)) {
            if (str.contains("/")) {
                String[] split = str.split("/");
                String replace = split[0].replace(RESOURCE_ID_PREFIX, "");
                return context.getResources().getIdentifier(split[1], replace, context.getPackageName());
            }
            return Integer.parseInt(str.substring(1));
        }
        throw new IllegalArgumentException();
    }

    private static int parseIntAttr(String str) {
        if (Character.isDigit(str.charAt(0))) {
            return Integer.parseInt(str);
        }
        if (str.startsWith(RESOURCE_ID_PREFIX)) {
            return Color.parseColor(str);
        }
        if (!str.equalsIgnoreCase(COLOR_TRANSPARENT_COMPRESSED_HEX)) {
            return Color.parseColor(str);
        }
        return 0;
    }

    private static float parseFloatAttr(Context context, String str) {
        try {
            try {
                return context.getResources().getDimension(parseResId(context, str));
            } catch (IllegalArgumentException unused) {
                return FigUtils.stringToDimension(context, str);
            }
        } catch (Exception unused2) {
            return Float.parseFloat(str);
        }
    }

    private static String parseStringAttr(Context context, String str) {
        try {
            return context.getResources().getString(parseResId(context, str));
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }

    private static Method getMethodByName(Class cls, String str) throws NoSuchMethodException {
        Method[] methods;
        for (Method method : cls.getMethods()) {
            if (method.getName().equalsIgnoreCase(str)) {
                return method;
            }
        }
        throw new NoSuchMethodException("No such public method (case insensitive): " + str + " in " + cls);
    }

    private static Method getSetter(Class cls, String str) throws NoSuchMethodException {
        return getMethodByName(cls, SETTER_PREFIX + str);
    }

    private static Method getGetter(Class cls, String str) throws NoSuchMethodException {
        return getMethodByName(cls, GETTER_PREFIX + str);
    }

    static Object getObjectContaining(Object obj, String str) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        if (obj == null) {
            throw new NullPointerException("Attempt to call getObjectContaining(...) on a null Object instance.  Path was: " + str);
        }
        int indexOf = str.indexOf(DOT_SEPARATOR);
        if (indexOf <= 0) {
            return obj;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1, str.length());
        Method getter = getGetter(obj.getClass(), substring);
        if (getter == null) {
            throw new NoSuchMethodException("No getter found for field: " + substring + " within " + obj.getClass());
        }
        return getObjectContaining(getter.invoke(obj, new Object[0]), substring2);
    }

    private static Object[] inflateParams(Context context, Class[] clsArr, String[] strArr) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object[] objArr = new Object[clsArr.length];
        int i = 0;
        for (Class cls : clsArr) {
            if (Enum.class.isAssignableFrom(cls)) {
                objArr[i] = cls.getMethod("valueOf", String.class).invoke(null, strArr[i].toUpperCase());
            } else if (cls.equals(Float.TYPE) || cls == Float.class) {
                objArr[i] = Float.valueOf(parseFloatAttr(context, strArr[i]));
            } else if (cls.equals(Integer.TYPE) || cls == Integer.class) {
                objArr[i] = Integer.valueOf(parseIntAttr(strArr[i]));
            } else if (cls.equals(Boolean.TYPE) || cls == Boolean.class) {
                objArr[i] = Boolean.valueOf(strArr[i]);
            } else if (cls.equals(String.class)) {
                objArr[i] = parseStringAttr(context, strArr[i]);
            } else {
                throw new IllegalArgumentException("Error inflating XML: Setter requires param of unsupported type: " + cls);
            }
            i++;
        }
        return objArr;
    }

    public static void configure(Context context, Object obj, File file) throws FigException {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(new FileInputStream(file), null);
            configure(context, obj, newPullParser);
        } catch (FileNotFoundException e) {
            throw new FigException("Failed to open file for parsing", e);
        } catch (XmlPullParserException e2) {
            throw new FigException("Error while parsing file", e2);
        }
    }

    public static void configure(Context context, Object obj, HashMap<String, String> hashMap) throws FigException {
        for (String str : hashMap.keySet()) {
            configure(context, obj, str, hashMap.get(str));
        }
    }

    private static void configure(Context context, Object obj, XmlPullParser xmlPullParser) throws FigException {
        try {
            HashMap hashMap = new HashMap();
            while (true) {
                if (xmlPullParser.getEventType() == 1) {
                    break;
                }
                xmlPullParser.next();
                String name = xmlPullParser.getName();
                if (xmlPullParser.getEventType() == 2) {
                    if (name.equalsIgnoreCase(CFG_ELEMENT_NAME)) {
                        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                            hashMap.put(xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                        }
                    }
                }
            }
            configure(context, obj, hashMap);
        } catch (IOException e) {
            throw new FigException("Error while parsing XML configuration", e);
        } catch (XmlPullParserException e2) {
            throw new FigException("Error while parsing XML configuration", e2);
        }
    }

    public static void configure(Context context, Object obj, int i) throws FigException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            configure(context, obj, xml);
        } finally {
            xml.close();
        }
    }

    private static void configure(Context context, Object obj, String str, String str2) throws FigException {
        try {
            Object objectContaining = getObjectContaining(obj, str);
            if (objectContaining == null) {
                return;
            }
            int lastIndexOf = str.lastIndexOf(DOT_SEPARATOR);
            String substring = lastIndexOf > 0 ? str.substring(lastIndexOf + 1, str.length()) : str;
            Method setter = getSetter(objectContaining.getClass(), substring);
            Class<?>[] parameterTypes = setter.getParameterTypes();
            if (parameterTypes.length >= 1) {
                String[] split = str2.split("\\|");
                if (split.length == parameterTypes.length) {
                    setter.invoke(objectContaining, inflateParams(context, parameterTypes, split));
                    return;
                }
                throw new IllegalArgumentException("Error inflating XML: Unexpected number of argments passed to \"" + setter.getName() + "\".  Expected: " + parameterTypes.length + " Got: " + split.length);
            }
            throw new IllegalArgumentException("Error inflating XML: no setter method found for param \"" + substring + "\".");
        } catch (IllegalAccessException e) {
            throw new FigException("Error while parsing key: " + str + " value: " + str2, e);
        } catch (NoSuchMethodException e2) {
            throw new FigException("Error while parsing key: " + str + " value: " + str2, e2);
        } catch (InvocationTargetException e3) {
            throw new FigException("Error while parsing key: " + str + " value: " + str2, e3);
        }
    }
}
