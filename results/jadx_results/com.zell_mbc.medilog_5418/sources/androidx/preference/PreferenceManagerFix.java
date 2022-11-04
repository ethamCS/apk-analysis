package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.collection.ArraySet;
import com.takisoft.preferencex.BuildConfig;
import java.lang.reflect.Field;
import java.util.Set;
/* loaded from: classes2.dex */
public class PreferenceManagerFix extends PreferenceManager {
    private static Field editorField;
    private static Set<String> packages = new ArraySet();
    private boolean inflateInProgress;
    private boolean noCommit;

    public static int getDefaultSharedPreferencesMode() {
        return 0;
    }

    static {
        Field[] declaredFields = PreferenceManager.class.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Field field = declaredFields[i];
            if (field.getType() == SharedPreferences.Editor.class) {
                editorField = field;
                field.setAccessible(true);
                break;
            }
            i++;
        }
        registerPreferencePackage(BuildConfig.LIBRARY_PACKAGE_NAME);
    }

    public PreferenceManagerFix(Context context) {
        super(context);
    }

    @Override // androidx.preference.PreferenceManager
    public PreferenceScreen inflateFromResource(Context context, int i, PreferenceScreen preferenceScreen) {
        Throwable th;
        PreferenceScreen preferenceScreen2;
        try {
            this.inflateInProgress = true;
            setNoCommitFix(true);
            PreferenceInflater preferenceInflater = new PreferenceInflater(context, this);
            String[] defaultPackages = preferenceInflater.getDefaultPackages();
            String[] strArr = new String[defaultPackages.length + packages.size()];
            packages.toArray(strArr);
            System.arraycopy(defaultPackages, 0, strArr, packages.size(), defaultPackages.length);
            preferenceInflater.setDefaultPackages(strArr);
            preferenceScreen2 = (PreferenceScreen) preferenceInflater.inflate(i, preferenceScreen);
            try {
                preferenceScreen2.onAttachedToHierarchy(this);
                setNoCommitFix(false);
                return preferenceScreen2;
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                    this.inflateInProgress = false;
                    return super.inflateFromResource(context, i, preferenceScreen2);
                } finally {
                    this.inflateInProgress = false;
                }
            }
        } catch (Throwable th3) {
            preferenceScreen2 = preferenceScreen;
            th = th3;
        }
    }

    @Override // androidx.preference.PreferenceManager
    public SharedPreferences.Editor getEditor() {
        Field field;
        SharedPreferences.Editor editor;
        if (!this.inflateInProgress || (field = editorField) == null) {
            return super.getEditor();
        }
        if (this.noCommit) {
            SharedPreferences.Editor editor2 = null;
            try {
                editor = (SharedPreferences.Editor) field.get(this);
            } catch (IllegalAccessException unused) {
            }
            if (editor != null) {
                return editor;
            }
            try {
                editor2 = getSharedPreferences().edit();
                editorField.set(this, editor2);
            } catch (IllegalAccessException unused2) {
                editor2 = editor;
            }
            return editor2;
        }
        return getSharedPreferences().edit();
    }

    @Override // androidx.preference.PreferenceManager
    public boolean shouldCommit() {
        if (!this.inflateInProgress) {
            return super.shouldCommit();
        }
        return this.noCommit;
    }

    private void setNoCommitFix(boolean z) throws IllegalAccessException {
        SharedPreferences.Editor editor = (SharedPreferences.Editor) editorField.get(this);
        if (!z && editor != null) {
            editor.apply();
        }
        this.noCommit = z;
    }

    public static void registerPreferencePackage(Class<Preference> cls) {
        registerPreferencePackage(cls.getPackage().getName());
    }

    public static void registerPreferencePackage(String str) {
        Set<String> set = packages;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".";
        if (str.endsWith(str2)) {
            str2 = "";
        }
        sb.append(str2);
        set.add(sb.toString());
    }

    public static String getDefaultSharedPreferencesName(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public static void setDefaultValues(Context context, int i, boolean z) {
        setDefaultValues(context, getDefaultSharedPreferencesName(context), getDefaultSharedPreferencesMode(), i, z);
    }

    public static void setDefaultValues(Context context, String str, int i, int i2, boolean z) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PreferenceManager.KEY_HAS_SET_DEFAULT_VALUES, 0);
        if (z || !sharedPreferences.getBoolean(PreferenceManager.KEY_HAS_SET_DEFAULT_VALUES, false)) {
            PreferenceManagerFix preferenceManagerFix = new PreferenceManagerFix(context);
            preferenceManagerFix.setSharedPreferencesName(str);
            preferenceManagerFix.setSharedPreferencesMode(i);
            preferenceManagerFix.inflateFromResource(context, i2, null);
            sharedPreferences.edit().putBoolean(PreferenceManager.KEY_HAS_SET_DEFAULT_VALUES, true).apply();
        }
    }
}
