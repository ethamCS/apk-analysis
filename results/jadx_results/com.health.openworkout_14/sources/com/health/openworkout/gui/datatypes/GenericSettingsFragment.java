package com.health.openworkout.gui.datatypes;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import androidx.navigation.t;
import com.health.openworkout.R;
/* loaded from: classes.dex */
public abstract class GenericSettingsFragment extends Fragment {
    private SETTING_MODE X = SETTING_MODE.EDIT;

    @Keep
    /* loaded from: classes.dex */
    public enum SETTING_MODE {
        EDIT,
        ADD
    }

    public GenericSettingsFragment() {
        p1(true);
    }

    protected abstract void A1(SETTING_MODE setting_mode);

    protected abstract boolean B1(SETTING_MODE setting_mode);

    public void C1(SETTING_MODE setting_mode) {
        this.X = setting_mode;
        A1(setting_mode);
    }

    @Override // androidx.fragment.app.Fragment
    public void l0(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.fragment_menu, menu);
        menu.findItem(R.id.edit).setVisible(false);
        super.l0(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean w0(MenuItem menuItem) {
        if (m().getCurrentFocus() != null) {
            ((InputMethodManager) m().getSystemService("input_method")).hideSoftInputFromWindow(m().getCurrentFocus().getWindowToken(), 0);
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.reset) {
            Toast.makeText(t(), String.format(N(R.string.label_reset_toast), z1()), 0).show();
            A1(this.X);
            return true;
        } else if (itemId != R.id.save) {
            return super.w0(menuItem);
        } else {
            if (B1(this.X)) {
                Toast.makeText(t(), String.format(N(R.string.label_save_toast), z1()), 0).show();
                t.a(m(), R.id.nav_host_fragment).s();
            }
            return true;
        }
    }

    protected abstract String z1();
}
