package org.odk.collect.android.utilities;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class Base64Wrapper {
    private static final int FLAGS = 2;
    private Class<?> base64;

    public Base64Wrapper() throws ClassNotFoundException {
        this.base64 = null;
        this.base64 = getClass().getClassLoader().loadClass("android.util.Base64");
    }

    public String encodeToString(byte[] ba) {
        Class<?>[] argClassList = {byte[].class, Integer.TYPE};
        try {
            Method m = this.base64.getDeclaredMethod("encode", argClassList);
            Object[] argList = {ba, 2};
            Object o = m.invoke(null, argList);
            byte[] outArray = (byte[]) o;
            String s = new String(outArray, "UTF-8");
            return s;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e.toString());
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            throw new IllegalArgumentException(e2.toString());
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            throw new IllegalArgumentException(e3.toString());
        } catch (SecurityException e4) {
            e4.printStackTrace();
            throw new IllegalArgumentException(e4.toString());
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
            throw new IllegalArgumentException(e5.toString());
        }
    }

    public byte[] decode(String base64String) {
        Class<?>[] argClassList = {String.class, Integer.TYPE};
        try {
            Method m = this.base64.getDeclaredMethod("decode", argClassList);
            Object[] argList = {base64String, 2};
            Object o = m.invoke(null, argList);
            return (byte[]) o;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e.toString());
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            throw new IllegalArgumentException(e2.toString());
        } catch (SecurityException e3) {
            e3.printStackTrace();
            throw new IllegalArgumentException(e3.toString());
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            throw new IllegalArgumentException(e4.toString());
        }
    }
}
