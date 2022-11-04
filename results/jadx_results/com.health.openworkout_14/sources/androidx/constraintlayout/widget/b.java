package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    String f757a;

    /* renamed from: b */
    private EnumC0012b f758b;

    /* renamed from: c */
    private int f759c;

    /* renamed from: d */
    private float f760d;

    /* renamed from: e */
    private String f761e;

    /* renamed from: f */
    boolean f762f;

    /* renamed from: g */
    private int f763g;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f764a;

        static {
            int[] iArr = new int[EnumC0012b.values().length];
            f764a = iArr;
            try {
                iArr[EnumC0012b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f764a[EnumC0012b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f764a[EnumC0012b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f764a[EnumC0012b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f764a[EnumC0012b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f764a[EnumC0012b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f764a[EnumC0012b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    /* loaded from: classes.dex */
    public enum EnumC0012b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public b(b bVar, Object obj) {
        this.f757a = bVar.f757a;
        this.f758b = bVar.f758b;
        d(obj);
    }

    public b(String str, EnumC0012b enumC0012b, Object obj) {
        this.f757a = str;
        this.f758b = enumC0012b;
        d(obj);
    }

    public static HashMap<String, b> a(HashMap<String, b> hashMap, View view) {
        HashMap<String, b> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = hashMap.get(str);
            try {
                hashMap2.put(str, str.equals("BackgroundColor") ? new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap<String, b> hashMap) {
        EnumC0012b enumC0012b;
        Object string;
        int integer;
        float f2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.k2);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC0012b enumC0012b2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == j.l2) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == j.m2) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC0012b2 = EnumC0012b.BOOLEAN_TYPE;
            } else {
                if (index == j.o2) {
                    enumC0012b = EnumC0012b.COLOR_TYPE;
                } else if (index == j.n2) {
                    enumC0012b = EnumC0012b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == j.s2) {
                        enumC0012b = EnumC0012b.DIMENSION_TYPE;
                        f2 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == j.p2) {
                        enumC0012b = EnumC0012b.DIMENSION_TYPE;
                        f2 = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == j.q2) {
                        enumC0012b = EnumC0012b.FLOAT_TYPE;
                        f2 = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == j.r2) {
                        enumC0012b = EnumC0012b.INT_TYPE;
                        integer = obtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        Object obj2 = string;
                        enumC0012b2 = enumC0012b;
                        obj = obj2;
                    } else if (index == j.t2) {
                        enumC0012b = EnumC0012b.STRING_TYPE;
                        string = obtainStyledAttributes.getString(index);
                        Object obj22 = string;
                        enumC0012b2 = enumC0012b;
                        obj = obj22;
                    }
                    string = Float.valueOf(f2);
                    Object obj222 = string;
                    enumC0012b2 = enumC0012b;
                    obj = obj222;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj2222 = string;
                enumC0012b2 = enumC0012b;
                obj = obj2222;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new b(str, enumC0012b2, obj));
        }
        obtainStyledAttributes.recycle();
    }

    public static void c(View view, HashMap<String, b> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = hashMap.get(str);
            String str2 = "set" + str;
            try {
                switch (a.f764a[bVar.f758b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f763g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f763g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f759c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f760d));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, bVar.f761e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f762f));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f760d));
                        break;
                }
            } catch (IllegalAccessException e2) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                Log.e("TransitionLayout", e3.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e4) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e4.printStackTrace();
            }
        }
    }

    public void d(Object obj) {
        switch (a.f764a[this.f758b.ordinal()]) {
            case 1:
            case 2:
                this.f763g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f759c = ((Integer) obj).intValue();
                return;
            case 4:
            case 7:
                this.f760d = ((Float) obj).floatValue();
                return;
            case 5:
                this.f761e = (String) obj;
                return;
            case 6:
                this.f762f = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
