package org.odk.collect.android.activities;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;
import java.text.DecimalFormat;
import java.util.List;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.widgets.GeoPointWidget;
/* loaded from: classes.dex */
public class GeoPointMapActivity extends MapActivity implements LocationListener {
    private Button mAcceptLocation;
    private Button mCancelLocation;
    private GeoPoint mGeoPoint;
    private Overlay mGeoPointOverlay;
    private Location mLocation;
    private double mLocationAccuracy;
    private LocationManager mLocationManager;
    private Overlay mLocationOverlay;
    private TextView mLocationStatus;
    private MapController mMapController;
    private MapView mMapView;
    private Button mShowLocation;
    private boolean mCaptureLocation = true;
    private boolean mGPSOn = false;
    private boolean mNetworkOn = false;

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(R.layout.geopoint_layout);
        Intent intent = getIntent();
        this.mLocationAccuracy = 5.0d;
        if (intent != null && intent.getExtras() != null) {
            if (intent.hasExtra(GeoPointWidget.LOCATION)) {
                double[] location = intent.getDoubleArrayExtra(GeoPointWidget.LOCATION);
                this.mGeoPoint = new GeoPoint((int) (location[0] * 1000000.0d), (int) (location[1] * 1000000.0d));
                this.mCaptureLocation = false;
            }
            if (intent.hasExtra(GeoPointWidget.ACCURACY_THRESHOLD)) {
                this.mLocationAccuracy = intent.getDoubleExtra(GeoPointWidget.ACCURACY_THRESHOLD, 5.0d);
            }
        }
        this.mMapView = findViewById(R.id.mapview);
        this.mCancelLocation = (Button) findViewById(R.id.cancel_location);
        this.mCancelLocation.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.GeoPointMapActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "cancelLocation", "cancel");
                GeoPointMapActivity.this.finish();
            }
        });
        this.mMapController = this.mMapView.getController();
        this.mLocationManager = (LocationManager) getSystemService("location");
        this.mMapView.setBuiltInZoomControls(true);
        this.mMapView.setSatellite(false);
        this.mMapController.setZoom(16);
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
        this.mLocationOverlay = new MyLocationOverlay(this, this.mMapView);
        this.mMapView.getOverlays().add(this.mLocationOverlay);
        if (this.mCaptureLocation) {
            this.mLocationStatus = (TextView) findViewById(R.id.location_status);
            this.mAcceptLocation = (Button) findViewById(R.id.accept_location);
            this.mAcceptLocation.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.GeoPointMapActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    Collect.getInstance().getActivityLogger().logInstanceAction(this, "acceptLocation", "OK");
                    GeoPointMapActivity.this.returnLocation();
                }
            });
            return;
        }
        this.mGeoPointOverlay = new Marker(this.mGeoPoint);
        this.mMapView.getOverlays().add(this.mGeoPointOverlay);
        ((Button) findViewById(R.id.accept_location)).setVisibility(8);
        ((TextView) findViewById(R.id.location_status)).setVisibility(8);
        this.mShowLocation = (Button) findViewById(R.id.show_location);
        this.mShowLocation.setVisibility(0);
        this.mShowLocation.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.GeoPointMapActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "showLocation", "onClick");
                GeoPointMapActivity.this.mMapController.animateTo(GeoPointMapActivity.this.mGeoPoint);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onStart() {
        super.onStart();
        Collect.getInstance().getActivityLogger().logOnStart(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onStop() {
        Collect.getInstance().getActivityLogger().logOnStop(this);
        super.onStop();
    }

    public void returnLocation() {
        if (this.mLocation != null) {
            Intent i = new Intent();
            i.putExtra(FormEntryActivity.LOCATION_RESULT, this.mLocation.getLatitude() + XFormAnswerDataSerializer.DELIMITER + this.mLocation.getLongitude() + XFormAnswerDataSerializer.DELIMITER + this.mLocation.getAltitude() + XFormAnswerDataSerializer.DELIMITER + this.mLocation.getAccuracy());
            setResult(-1, i);
        }
        finish();
    }

    private String truncateFloat(float f) {
        return new DecimalFormat("#.##").format(f);
    }

    protected void onPause() {
        super.onPause();
        this.mLocationManager.removeUpdates(this);
        this.mLocationOverlay.disableMyLocation();
    }

    protected void onResume() {
        super.onResume();
        this.mLocationOverlay.enableMyLocation();
        if (this.mGPSOn) {
            this.mLocationManager.requestLocationUpdates("gps", 0L, 0.0f, this);
        }
        if (this.mNetworkOn) {
            this.mLocationManager.requestLocationUpdates("network", 0L, 0.0f, this);
        }
    }

    protected boolean isRouteDisplayed() {
        return false;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (this.mCaptureLocation) {
            this.mLocation = location;
            if (this.mLocation != null) {
                this.mLocationStatus.setText(getString(R.string.location_provider_accuracy, new Object[]{this.mLocation.getProvider(), truncateFloat(this.mLocation.getAccuracy())}));
                this.mGeoPoint = new GeoPoint((int) (this.mLocation.getLatitude() * 1000000.0d), (int) (this.mLocation.getLongitude() * 1000000.0d));
                this.mMapController.animateTo(this.mGeoPoint);
                if (this.mLocation.getAccuracy() <= this.mLocationAccuracy) {
                    returnLocation();
                }
            }
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String provider) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String provider) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

    /* loaded from: classes.dex */
    class Marker extends Overlay {
        GeoPoint gp;

        public Marker(GeoPoint gp) {
            GeoPointMapActivity.this = r2;
            this.gp = null;
            this.gp = gp;
        }

        public void draw(Canvas canvas, MapView mapView, boolean shadow) {
            super.draw(canvas, mapView, shadow);
            Point screenPoint = new Point();
            GeoPointMapActivity.this.mMapView.getProjection().toPixels(this.gp, screenPoint);
            canvas.drawBitmap(BitmapFactory.decodeResource(GeoPointMapActivity.this.getResources(), R.drawable.ic_maps_indicator_current_position), screenPoint.x, screenPoint.y - 8, (Paint) null);
        }
    }
}
