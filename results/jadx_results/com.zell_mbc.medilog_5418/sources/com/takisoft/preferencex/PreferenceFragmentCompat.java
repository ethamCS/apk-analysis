package com.takisoft.preferencex;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.preference.EditTextPreferenceDialogFragmentCompat;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceManager;
import androidx.preference.PreferenceManagerFix;
import java.lang.reflect.Field;
import java.util.HashMap;
/* loaded from: classes2.dex */
public abstract class PreferenceFragmentCompat extends androidx.preference.PreferenceFragmentCompat {
    private static final String FRAGMENT_DIALOG_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    protected static HashMap<Class<? extends Preference>, Class<? extends Fragment>> dialogPreferences;
    private static Field preferenceManagerField;

    @Override // androidx.preference.PreferenceFragmentCompat
    @Deprecated
    public void onCreatePreferences(Bundle bundle, String str) {
    }

    public abstract void onCreatePreferencesFix(Bundle bundle, String str);

    static {
        Field[] declaredFields = androidx.preference.PreferenceFragmentCompat.class.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Field field = declaredFields[i];
            if (field.getType() == PreferenceManager.class) {
                preferenceManagerField = field;
                field.setAccessible(true);
                break;
            }
            i++;
        }
        dialogPreferences = new HashMap<>();
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        PreferenceManagerFix preferenceManagerFix = new PreferenceManagerFix(new ContextThemeWrapper(getActivity(), i));
        preferenceManagerFix.setOnNavigateToScreenListener(this);
        try {
            preferenceManagerField.set(this, preferenceManagerFix);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        onCreatePreferencesFix(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        traverseAndRefreshPrefs(getPreferenceScreen());
    }

    private void traverseAndRefreshPrefs(PreferenceGroup preferenceGroup) {
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            Preference preference = preferenceGroup.getPreference(i);
            if (preference instanceof SwitchPreferenceCompat) {
                ((SwitchPreferenceCompat) preference).refresh();
            } else if (preference instanceof PreferenceGroup) {
                traverseAndRefreshPrefs((PreferenceGroup) preference);
            }
        }
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    public void onDisplayPreferenceDialog(Preference preference) {
        if (requireFragmentManager().findFragmentByTag(FRAGMENT_DIALOG_TAG) == null) {
            if (preference instanceof EditTextPreference) {
                displayPreferenceDialog(new EditTextPreferenceDialogFragmentCompat(), preference.getKey());
            } else if (dialogPreferences.containsKey(preference.getClass())) {
                try {
                    displayPreferenceDialog(dialogPreferences.get(preference.getClass()).newInstance(), preference.getKey());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e2) {
                    e2.printStackTrace();
                }
            } else {
                super.onDisplayPreferenceDialog(preference);
            }
        }
    }

    protected void displayPreferenceDialog(Fragment fragment, String str) {
        displayPreferenceDialog(fragment, str, null);
    }

    protected void displayPreferenceDialog(Fragment fragment, String str, Bundle bundle) {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        if (bundle == null) {
            bundle = new Bundle(1);
        }
        bundle.putString("key", str);
        fragment.setArguments(bundle);
        fragment.setTargetFragment(this, 0);
        if (fragment instanceof DialogFragment) {
            ((DialogFragment) fragment).show(fragmentManager, FRAGMENT_DIALOG_TAG);
        } else {
            fragmentManager.beginTransaction().add(fragment, FRAGMENT_DIALOG_TAG).commit();
        }
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.preference.PreferenceManager.OnPreferenceTreeClickListener
    public boolean onPreferenceTreeClick(Preference preference) {
        boolean z = false;
        if (preference.getFragment() != null) {
            if (getCallbackFragment() instanceof PreferenceFragmentCompat.OnPreferenceStartFragmentCallback) {
                z = ((PreferenceFragmentCompat.OnPreferenceStartFragmentCallback) getCallbackFragment()).onPreferenceStartFragment(this, preference);
            }
            if (!z && (getActivity() instanceof PreferenceFragmentCompat.OnPreferenceStartFragmentCallback)) {
                z = ((PreferenceFragmentCompat.OnPreferenceStartFragmentCallback) getActivity()).onPreferenceStartFragment(this, preference);
            }
            if (!z) {
                z = onPreferenceStartFragment(this, preference);
            }
        }
        if (!z) {
            z = super.onPreferenceTreeClick(preference);
        }
        if (!z && (preference instanceof PreferenceActivityResultListener)) {
            ((PreferenceActivityResultListener) preference).onPreferenceClick(this, preference);
        }
        return z;
    }

    protected boolean onPreferenceStartFragment(PreferenceFragmentCompat preferenceFragmentCompat, Preference preference) {
        FragmentManager requireFragmentManager = preferenceFragmentCompat.requireFragmentManager();
        Bundle extras = preference.getExtras();
        Fragment instantiate = requireFragmentManager.getFragmentFactory().instantiate(requireActivity().getClassLoader(), preference.getFragment());
        instantiate.setArguments(extras);
        instantiate.setTargetFragment(this, 0);
        requireFragmentManager.beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(((View) getView().getParent()).getId(), instantiate).addToBackStack(preference.getKey()).commit();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        onActivityResult(getPreferenceScreen(), i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    protected void onActivityResult(PreferenceGroup preferenceGroup, int i, int i2, Intent intent) {
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i3 = 0; i3 < preferenceCount; i3++) {
            Preference preference = preferenceGroup.getPreference(i3);
            if (preference instanceof PreferenceActivityResultListener) {
                ((PreferenceActivityResultListener) preference).onActivityResult(i, i2, intent);
            }
            if (preference instanceof PreferenceGroup) {
                onActivityResult((PreferenceGroup) preference, i, i2, intent);
            }
        }
    }

    public static void registerPreferenceFragment(Class<? extends Preference> cls, Class<? extends Fragment> cls2) {
        dialogPreferences.put(cls, cls2);
    }
}
