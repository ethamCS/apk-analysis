package org.odk.collect.android.activities;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.io.IOException;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.preferences.PreferencesActivity;
/* loaded from: classes.dex */
public class AccountInfo extends Activity {
    static final int WAITING_ID = 1;
    static final String authString = "gather";
    boolean shownDialog = false;

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        AccountManager accountManager = AccountManager.get(getApplicationContext());
        Account account = (Account) intent.getExtras().get(PreferencesActivity.KEY_ACCOUNT);
        accountManager.getAuthToken(account, authString, false, new AuthTokenCallback(), null);
        showDialog(1);
    }

    /* loaded from: classes.dex */
    private class AuthTokenCallback implements AccountManagerCallback<Bundle> {
        private AuthTokenCallback() {
            AccountInfo.this = r1;
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(AccountManagerFuture<Bundle> result) {
            try {
                Bundle bundle = result.getResult();
                Intent intent = (Intent) bundle.get("intent");
                if (intent != null && AccountInfo.this.shownDialog) {
                    AccountInfo.this.failedAuthToken();
                } else if (intent != null) {
                    AccountInfo.this.startActivity(intent);
                    AccountInfo.this.shownDialog = true;
                } else {
                    AccountInfo.this.gotAuthToken(bundle);
                }
            } catch (AuthenticatorException e) {
                AccountInfo.this.failedAuthToken();
            } catch (OperationCanceledException e2) {
                AccountInfo.this.failedAuthToken();
            } catch (IOException e3) {
                AccountInfo.this.failedAuthToken();
            }
        }
    }

    protected void failedAuthToken() {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        SharedPreferences.Editor editor = settings.edit();
        editor.remove(PreferencesActivity.KEY_ACCOUNT);
        editor.remove(PreferencesActivity.KEY_AUTH);
        editor.commit();
        Collect.getInstance().getActivityLogger().logAction(this, "failedAuthToken", settings.getString(PreferencesActivity.KEY_ACCOUNT, ""));
        dismissDialog(1);
        finish();
    }

    protected void gotAuthToken(Bundle bundle) {
        String auth_token = bundle.getString("authtoken");
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(PreferencesActivity.KEY_AUTH, auth_token);
        editor.commit();
        Collect.getInstance().getActivityLogger().logAction(this, "gotAuthToken", settings.getString(PreferencesActivity.KEY_ACCOUNT, ""));
        dismissDialog(1);
        finish();
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case 1:
                Collect.getInstance().getActivityLogger().logAction(this, "onCreateDialog.waitingForAuthentication", "show");
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Waiting on authentication").setCancelable(false);
                AlertDialog alert = builder.create();
                return alert;
            default:
                return null;
        }
    }
}
