package org.odk.collect.android.preferences;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
/* loaded from: classes.dex */
public class PasswordDialogPreference extends DialogPreference implements DialogInterface.OnClickListener {
    private EditText passwordEditText;
    private EditText verifyEditText;

    public PasswordDialogPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        setDialogLayoutResource(R.layout.password_dialog_layout);
    }

    @Override // android.preference.DialogPreference
    public void onBindDialogView(View view) {
        this.passwordEditText = (EditText) view.findViewById(R.id.pwd_field);
        this.verifyEditText = (EditText) view.findViewById(R.id.verify_field);
        String adminPW = getPersistedString("");
        if (!adminPW.equalsIgnoreCase("")) {
            this.passwordEditText.setText(adminPW);
            this.passwordEditText.setSelection(this.passwordEditText.getText().length());
            this.verifyEditText.setText(adminPW);
        }
        Button positiveButton = (Button) view.findViewById(R.id.positive_button);
        positiveButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.preferences.PasswordDialogPreference.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                String pw = PasswordDialogPreference.this.passwordEditText.getText().toString();
                String ver = PasswordDialogPreference.this.verifyEditText.getText().toString();
                if (!pw.equalsIgnoreCase("") && !ver.equalsIgnoreCase("") && pw.equals(ver)) {
                    PasswordDialogPreference.this.persistString(pw);
                    Toast.makeText(PasswordDialogPreference.this.getContext(), (int) R.string.admin_password_changed, 0).show();
                    PasswordDialogPreference.this.getDialog().dismiss();
                    Collect.getInstance().getActivityLogger().logAction(this, "AdminPasswordDialog", "CHANGED");
                } else if (pw.equalsIgnoreCase("") && ver.equalsIgnoreCase("")) {
                    PasswordDialogPreference.this.persistString("");
                    Toast.makeText(PasswordDialogPreference.this.getContext(), (int) R.string.admin_password_disabled, 0).show();
                    PasswordDialogPreference.this.getDialog().dismiss();
                    Collect.getInstance().getActivityLogger().logAction(this, "AdminPasswordDialog", "DISABLED");
                } else {
                    Toast.makeText(PasswordDialogPreference.this.getContext(), (int) R.string.admin_password_mismatch, 0).show();
                    Collect.getInstance().getActivityLogger().logAction(this, "AdminPasswordDialog", "MISMATCH");
                }
            }
        });
        Button negativeButton = (Button) view.findViewById(R.id.negative_button);
        negativeButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.preferences.PasswordDialogPreference.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                PasswordDialogPreference.this.getDialog().dismiss();
                Collect.getInstance().getActivityLogger().logAction(this, "AdminPasswordDialog", "CANCELLED");
            }
        });
        super.onBindDialogView(view);
    }

    @Override // android.preference.DialogPreference, android.preference.Preference
    protected void onClick() {
        super.onClick();
        getDialog().getWindow().setSoftInputMode(5);
    }

    @Override // android.preference.DialogPreference
    protected void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton((CharSequence) null, (DialogInterface.OnClickListener) null);
        super.onPrepareDialogBuilder(builder);
    }
}
