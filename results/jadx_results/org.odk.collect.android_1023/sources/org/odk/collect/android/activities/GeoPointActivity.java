package org.odk.collect.android.activities;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;
import java.text.DecimalFormat;
import java.util.List;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.widgets.GeoPointWidget;
/* loaded from: classes.dex */
public class GeoPointActivity extends Activity implements LocationListener {
    private Location mLocation;
    private double mLocationAccuracy;
    private ProgressDialog mLocationDialog;
    private LocationManager mLocationManager;
    private boolean mGPSOn = false;
    private boolean mNetworkOn = false;

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        this.mLocationAccuracy = 5.0d;
        if (intent != null && intent.getExtras() != null && intent.hasExtra(GeoPointWidget.ACCURACY_THRESHOLD)) {
            this.mLocationAccuracy = intent.getDoubleExtra(GeoPointWidget.ACCURACY_THRESHOLD, 5.0d);
        }
        setTitle(getString(R.string.app_name) + " > " + getString(R.string.get_location));
        this.mLocationManager = (LocationManager) getSystemService("location");
        List<String> providers = this.mLocationManager.getProviders(true);
        for (String provider : providers) {
            if (provider.equalsIgnoreCase("gps")) {
                this.mGPSOn = true;
            }
            if (provider.equalsIgnoreCase("network")) {
                this.mNetworkOn = true;
            }
        }
        if (!this.mGPSOn && !this.mNetworkOn) {
            Toast.makeText(getBaseContext(), getString(R.string.provider_disabled_error), 0).show();
            finish();
        }
        setupLocationDialog();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mLocationManager.removeUpdates(this);
        if (this.mLocationDialog != null && this.mLocationDialog.isShowing()) {
            this.mLocationDialog.dismiss();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.mGPSOn) {
            this.mLocationManager.requestLocationUpdates("gps", 0L, 0.0f, this);
        }
        if (this.mNetworkOn) {
            this.mLocationManager.requestLocationUpdates("network", 0L, 0.0f, this);
        }
        this.mLocationDialog.show();
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

    private void setupLocationDialog() {
        Collect.getInstance().getActivityLogger().logInstanceAction(this, "setupLocationDialog", "show");
        this.mLocationDialog = new ProgressDialog(this);
        DialogInterface.OnClickListener geopointButtonListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.GeoPointActivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case -2:
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "cancelLocation", "cancel");
                        GeoPointActivity.this.mLocation = null;
                        GeoPointActivity.this.finish();
                        return;
                    case -1:
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "acceptLocation", "OK");
                        GeoPointActivity.this.returnLocation();
                        return;
                    default:
                        return;
                }
            }
        };
        this.mLocationDialog.setCancelable(false);
        this.mLocationDialog.setIndeterminate(true);
        this.mLocationDialog.setIcon(17301659);
        this.mLocationDialog.setTitle(getString(R.string.getting_location));
        this.mLocationDialog.setMessage(getString(R.string.please_wait_long));
        this.mLocationDialog.setButton(-1, getString(R.string.accept_location), geopointButtonListener);
        this.mLocationDialog.setButton(-2, getString(R.string.cancel_location), geopointButtonListener);
    }

    public void returnLocation() {
        if (this.mLocation != null) {
            Intent i = new Intent();
            i.putExtra(FormEntryActivity.LOCATION_RESULT, this.mLocation.getLatitude() + XFormAnswerDataSerializer.DELIMITER + this.mLocation.getLongitude() + XFormAnswerDataSerializer.DELIMITER + this.mLocation.getAltitude() + XFormAnswerDataSerializer.DELIMITER + this.mLocation.getAccuracy());
            setResult(-1, i);
        }
        finish();
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        this.mLocation = location;
        if (this.mLocation != null) {
            this.mLocationDialog.setMessage(getString(R.string.location_provider_accuracy, new Object[]{this.mLocation.getProvider(), truncateDouble(this.mLocation.getAccuracy())}));
            if (this.mLocation.getAccuracy() <= this.mLocationAccuracy) {
                returnLocation();
            }
        }
    }

    private String truncateDouble(float number) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(number);
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String provider) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String provider) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String provider, int status, Bundle extras) {
        switch (status) {
            case 0:
            case 1:
            default:
                return;
            case 2:
                if (this.mLocation != null) {
                    this.mLocationDialog.setMessage(getString(R.string.location_accuracy, new Object[]{Float.valueOf(this.mLocation.getAccuracy())}));
                    return;
                }
                return;
        }
    }
}
