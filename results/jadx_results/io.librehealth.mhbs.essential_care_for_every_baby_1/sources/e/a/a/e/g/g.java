package e.a.a.e.g;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import e.a.a.e.h.b;
import e.a.a.g.m;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class g<T extends e.a.a.e.h.b> {

    /* renamed from: d */
    private static String f800d = "SharedManager";

    /* renamed from: a */
    private Class<T> f801a;

    /* renamed from: b */
    private String f802b;

    /* renamed from: c */
    private String f803c;

    /* loaded from: classes.dex */
    public static class a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        final /* synthetic */ SharedPreferences.Editor f804a;

        /* renamed from: b */
        final /* synthetic */ String f805b;

        a(SharedPreferences.Editor editor, String str) {
            this.f804a = editor;
            this.f805b = str;
        }

        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            return Boolean.valueOf(this.f804a.commit());
        }

        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            if (!bool.booleanValue()) {
                d.a.b.a(this.f805b, "shared data could not be saved");
            }
        }
    }

    public g(String str, Class<T> cls) {
        this.f803c = "default";
        this.f801a = cls;
        this.f802b = "sharedManager." + str + "." + this.f801a.getName();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(this.f802b.getBytes(), 0, this.f802b.length());
            this.f803c = new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (Exception e2) {
            this.f802b = str;
            String str2 = f800d;
            d.a.b.b(str2, "SharedManager could not be initialized: " + e2.getMessage());
            e2.printStackTrace();
        }
    }

    private static void b(String str, SharedPreferences.Editor editor) {
        new a(editor, str).execute(new Void[0]);
    }

    private String c(String str, String str2) {
        return str + '_' + str2;
    }

    private SharedPreferences f(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".");
        String str = this.f803c;
        if (str == null) {
            str = this.f802b;
        }
        sb.append(str);
        SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new e.a.a.e.f.a("SharedPreferences.getSharedPreferences return null");
    }

    public void a(Context context) {
        try {
            b(this.f802b, f(context).edit());
        } catch (Exception e2) {
            e2.printStackTrace();
            d.a.b.b(f800d, e2.toString());
        }
    }

    public T d(Context context, String str, String str2) {
        try {
            String string = f(context).getString(c(str, str2), null);
            if (m.c(string).booleanValue()) {
                return null;
            }
            T t = (T) this.f801a.newInstance().a(string);
            if (t == null) {
                return null;
            }
            return t;
        } catch (e.a.a.e.f.a e2) {
            e2.printStackTrace();
            d.a.b.b(f800d, e2.toString());
            return null;
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public List<T> e(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Map<String, ?> all = f(context).getAll();
            if (all != null) {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    Object value = entry.getValue();
                    if (entry.getKey().startsWith(str) && (value instanceof String)) {
                        arrayList.add(this.f801a.newInstance().a((String) value));
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            d.a.b.b(f800d, e2.toString());
        }
        return arrayList;
    }

    public Boolean g(Context context, String str, String str2) {
        try {
            SharedPreferences f = f(context);
            String c2 = c(str, str2);
            SharedPreferences.Editor edit = f.edit();
            edit.remove(c2);
            edit.apply();
            return Boolean.TRUE;
        } catch (e.a.a.e.f.a e2) {
            e2.printStackTrace();
            d.a.b.b(f800d, e2.toString());
            return Boolean.FALSE;
        }
    }

    public Boolean h(Context context, String str, String str2, T t) {
        try {
            SharedPreferences f = f(context);
            String c2 = c(str, str2);
            String g = t.g();
            SharedPreferences.Editor edit = f.edit();
            edit.putString(c2, g);
            edit.apply();
            return Boolean.TRUE;
        } catch (e.a.a.e.f.a e2) {
            e2.printStackTrace();
            d.a.b.b(f800d, e2.toString());
            return Boolean.FALSE;
        }
    }
}
