package org.odk.collect.android.activities;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.preferences.PreferencesActivity;
/* loaded from: classes.dex */
public class AccountList extends ListActivity {
    protected AccountManager accountManager;

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(R.string.app_name) + " > " + getString(R.string.google_account));
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Collect.getInstance().getActivityLogger().logOnStart(this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        Collect.getInstance().getActivityLogger().logOnStop(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.accountManager = AccountManager.get(getApplicationContext());
        final Account[] accounts = this.accountManager.getAccountsByType("com.google");
        setListAdapter(new ArrayAdapter<Account>(this, R.layout.account_chooser, accounts) { // from class: org.odk.collect.android.activities.AccountList.1
            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int position, View convertView, ViewGroup parent) {
                View row;
                if (convertView == null) {
                    row = ((LayoutInflater) AccountList.this.getSystemService("layout_inflater")).inflate(R.layout.account_chooser, (ViewGroup) null);
                } else {
                    row = convertView;
                }
                TextView vw = (TextView) row.findViewById(16908308);
                vw.setTextSize(Collect.getQuestionFontsize());
                SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(AccountList.this.getBaseContext());
                String selected = settings.getString(PreferencesActivity.KEY_ACCOUNT, "");
                if (accounts[position].name.equals(selected)) {
                    vw.setBackgroundColor(-3355444);
                } else {
                    vw.setBackgroundColor(-1);
                }
                vw.setText(getItem(position).name);
                return row;
            }
        });
    }

    @Override // android.app.ListActivity
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Account account = (Account) getListView().getItemAtPosition(position);
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        SharedPreferences.Editor editor = settings.edit();
        editor.remove(PreferencesActivity.KEY_AUTH);
        editor.putString(PreferencesActivity.KEY_ACCOUNT, account.name);
        editor.commit();
        Collect.getInstance().getActivityLogger().logAction(this, "select", account.name);
        Intent intent = new Intent(this, AccountInfo.class);
        intent.putExtra(PreferencesActivity.KEY_ACCOUNT, account);
        startActivity(intent);
        finish();
    }
}
