package org.odk.collect.android.logic;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.util.HashMap;
import java.util.Locale;
import java.util.Vector;
import org.javarosa.core.api.Constants;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.services.IPropertyManager;
import org.javarosa.core.services.properties.IPropertyRules;
import org.odk.collect.android.preferences.PreferencesActivity;
/* loaded from: classes.dex */
public class PropertyManager implements IPropertyManager {
    public static final String DEVICE_ID_PROPERTY = "deviceid";
    private static final String EMAIL = "email";
    public static final String OR_DEVICE_ID_PROPERTY = "uri:deviceid";
    public static final String OR_EMAIL = "uri:email";
    public static final String OR_PHONE_NUMBER_PROPERTY = "uri:phonenumber";
    public static final String OR_SIM_SERIAL_PROPERTY = "uri:simserial";
    public static final String OR_SUBSCRIBER_ID_PROPERTY = "uri:subscriberid";
    public static final String OR_USERNAME = "uri:username";
    private static final String PHONE_NUMBER_PROPERTY = "phonenumber";
    private static final String SIM_SERIAL_PROPERTY = "simserial";
    private static final String SUBSCRIBER_ID_PROPERTY = "subscriberid";
    private static final String USERNAME = "username";
    private Context mContext;
    private TelephonyManager mTelephonyManager;
    private String t = "PropertyManager";
    private HashMap<String, String> mProperties = new HashMap<>();

    public String getName() {
        return Constants.PROPERTY_MANAGER;
    }

    public PropertyManager(Context context) {
        Log.i(this.t, "calling constructor");
        this.mContext = context;
        this.mTelephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
        String deviceId = this.mTelephonyManager.getDeviceId();
        String orDeviceId = null;
        if (deviceId != null) {
            if (deviceId.contains(TreeReference.NAME_WILDCARD) || deviceId.contains("000000000000000")) {
                deviceId = Settings.Secure.getString(this.mContext.getContentResolver(), "android_id");
                orDeviceId = "android_id:" + deviceId;
            } else {
                orDeviceId = "imei:" + deviceId;
            }
        }
        if (deviceId == null) {
            WifiManager wifi = (WifiManager) this.mContext.getSystemService("wifi");
            WifiInfo info = wifi.getConnectionInfo();
            if (info != null) {
                deviceId = info.getMacAddress();
                orDeviceId = "mac:" + deviceId;
            }
        }
        if (deviceId == null) {
            deviceId = Settings.Secure.getString(this.mContext.getContentResolver(), "android_id");
            orDeviceId = "android_id:" + deviceId;
        }
        this.mProperties.put(DEVICE_ID_PROPERTY, deviceId);
        this.mProperties.put(OR_DEVICE_ID_PROPERTY, orDeviceId);
        String value = this.mTelephonyManager.getSubscriberId();
        if (value != null) {
            this.mProperties.put(SUBSCRIBER_ID_PROPERTY, value);
            this.mProperties.put(OR_SUBSCRIBER_ID_PROPERTY, "imsi:" + value);
        }
        String value2 = this.mTelephonyManager.getSimSerialNumber();
        if (value2 != null) {
            this.mProperties.put(SIM_SERIAL_PROPERTY, value2);
            this.mProperties.put(OR_SIM_SERIAL_PROPERTY, "simserial:" + value2);
        }
        String value3 = this.mTelephonyManager.getLine1Number();
        if (value3 != null) {
            this.mProperties.put(PHONE_NUMBER_PROPERTY, value3);
            this.mProperties.put(OR_PHONE_NUMBER_PROPERTY, "tel:" + value3);
        }
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this.mContext);
        String value4 = settings.getString("username", null);
        if (value4 != null) {
            this.mProperties.put("username", value4);
            this.mProperties.put(OR_USERNAME, "username:" + value4);
        }
        String value5 = settings.getString(PreferencesActivity.KEY_ACCOUNT, null);
        if (value5 != null) {
            this.mProperties.put(EMAIL, value5);
            this.mProperties.put(OR_EMAIL, "mailto:" + value5);
        }
    }

    @Override // org.javarosa.core.services.IPropertyManager
    public Vector<String> getProperty(String propertyName) {
        return null;
    }

    @Override // org.javarosa.core.services.IPropertyManager
    public String getSingularProperty(String propertyName) {
        return this.mProperties.get(propertyName.toLowerCase(Locale.ENGLISH));
    }

    @Override // org.javarosa.core.services.IPropertyManager
    public void setProperty(String propertyName, String propertyValue) {
    }

    @Override // org.javarosa.core.services.IPropertyManager
    public void setProperty(String propertyName, Vector propertyValue) {
    }

    @Override // org.javarosa.core.services.IPropertyManager
    public void addRules(IPropertyRules rules) {
    }

    @Override // org.javarosa.core.services.IPropertyManager
    public Vector<IPropertyRules> getRules() {
        return null;
    }
}
