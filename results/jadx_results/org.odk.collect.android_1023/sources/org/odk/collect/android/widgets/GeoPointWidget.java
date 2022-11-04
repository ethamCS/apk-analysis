package org.odk.collect.android.widgets;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import org.javarosa.core.model.data.GeoPointData;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.form.api.FormEntryPrompt;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.odk.collect.android.R;
import org.odk.collect.android.activities.GeoPointActivity;
import org.odk.collect.android.activities.GeoPointMapActivity;
import org.odk.collect.android.application.Collect;
/* loaded from: classes.dex */
public class GeoPointWidget extends QuestionWidget implements IBinaryWidget {
    public static final String ACCURACY_THRESHOLD = "accuracyThreshold";
    public static final double DEFAULT_LOCATION_ACCURACY = 5.0d;
    public static final String LOCATION = "gp";
    private double mAccuracyThreshold;
    private TextView mAnswerDisplay;
    private String mAppearance;
    private Button mGetLocationButton;
    private TextView mStringAnswer;
    private boolean mUseMaps;
    private Button mViewButton;

    public GeoPointWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        this.mUseMaps = false;
        this.mAppearance = prompt.getAppearanceHint();
        String acc = prompt.getQuestion().getAdditionalAttribute(null, ACCURACY_THRESHOLD);
        if (acc != null && acc.length() != 0) {
            this.mAccuracyThreshold = Double.parseDouble(acc);
        } else {
            this.mAccuracyThreshold = 5.0d;
        }
        setOrientation(1);
        TableLayout.LayoutParams params = new TableLayout.LayoutParams();
        params.setMargins(7, 5, 7, 5);
        this.mGetLocationButton = new Button(getContext());
        this.mGetLocationButton.setId(QuestionWidget.newUniqueId());
        this.mGetLocationButton.setPadding(20, 20, 20, 20);
        this.mGetLocationButton.setText(getContext().getString(R.string.get_location));
        this.mGetLocationButton.setTextSize(1, this.mAnswerFontsize);
        this.mGetLocationButton.setEnabled(!prompt.isReadOnly());
        this.mGetLocationButton.setLayoutParams(params);
        if (prompt.isReadOnly()) {
            this.mGetLocationButton.setVisibility(8);
        }
        this.mViewButton = new Button(getContext());
        this.mViewButton.setId(QuestionWidget.newUniqueId());
        this.mViewButton.setText(getContext().getString(R.string.show_location));
        this.mViewButton.setTextSize(1, this.mAnswerFontsize);
        this.mViewButton.setPadding(20, 20, 20, 20);
        this.mViewButton.setLayoutParams(params);
        this.mViewButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.GeoPointWidget.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "showLocation", "click", GeoPointWidget.this.mPrompt.getIndex());
                String s = GeoPointWidget.this.mStringAnswer.getText().toString();
                String[] sa = s.split(XFormAnswerDataSerializer.DELIMITER);
                double[] gp = {Double.valueOf(sa[0]).doubleValue(), Double.valueOf(sa[1]).doubleValue(), Double.valueOf(sa[2]).doubleValue(), Double.valueOf(sa[3]).doubleValue()};
                Intent i = new Intent(GeoPointWidget.this.getContext(), GeoPointMapActivity.class);
                i.putExtra(GeoPointWidget.LOCATION, gp);
                i.putExtra(GeoPointWidget.ACCURACY_THRESHOLD, GeoPointWidget.this.mAccuracyThreshold);
                ((Activity) GeoPointWidget.this.getContext()).startActivity(i);
            }
        });
        this.mStringAnswer = new TextView(getContext());
        this.mStringAnswer.setId(QuestionWidget.newUniqueId());
        this.mAnswerDisplay = new TextView(getContext());
        this.mAnswerDisplay.setId(QuestionWidget.newUniqueId());
        this.mAnswerDisplay.setTextSize(1, this.mAnswerFontsize);
        this.mAnswerDisplay.setGravity(17);
        String s = prompt.getAnswerText();
        if (s != null && !s.equals("")) {
            this.mGetLocationButton.setText(getContext().getString(R.string.replace_location));
            setBinaryData(s);
            this.mViewButton.setEnabled(true);
        } else {
            this.mViewButton.setEnabled(false);
        }
        if (this.mAppearance != null && this.mAppearance.equalsIgnoreCase("maps")) {
            try {
                Class.forName("com.google.android.maps.MapActivity");
                this.mUseMaps = true;
            } catch (ClassNotFoundException e) {
                this.mUseMaps = false;
            }
        }
        this.mGetLocationButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.GeoPointWidget.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Intent i;
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "recordLocation", "click", GeoPointWidget.this.mPrompt.getIndex());
                if (GeoPointWidget.this.mUseMaps) {
                    i = new Intent(GeoPointWidget.this.getContext(), GeoPointMapActivity.class);
                } else {
                    i = new Intent(GeoPointWidget.this.getContext(), GeoPointActivity.class);
                }
                i.putExtra(GeoPointWidget.ACCURACY_THRESHOLD, GeoPointWidget.this.mAccuracyThreshold);
                Collect.getInstance().getFormController().setIndexWaitingForData(GeoPointWidget.this.mPrompt.getIndex());
                ((Activity) GeoPointWidget.this.getContext()).startActivityForResult(i, 5);
            }
        });
        addView(this.mGetLocationButton);
        if (this.mUseMaps) {
            addView(this.mViewButton);
        }
        addView(this.mAnswerDisplay);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        this.mStringAnswer.setText((CharSequence) null);
        this.mAnswerDisplay.setText((CharSequence) null);
        this.mGetLocationButton.setText(getContext().getString(R.string.get_location));
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        String s = this.mStringAnswer.getText().toString();
        if (s == null || s.equals("")) {
            return null;
        }
        try {
            String[] sa = s.split(XFormAnswerDataSerializer.DELIMITER);
            double[] gp = {Double.valueOf(sa[0]).doubleValue(), Double.valueOf(sa[1]).doubleValue(), Double.valueOf(sa[2]).doubleValue(), Double.valueOf(sa[3]).doubleValue()};
            return new GeoPointData(gp);
        } catch (Exception e) {
            return null;
        }
    }

    private String truncateDouble(String s) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(Double.valueOf(s));
    }

    private String formatGps(double coordinates, String type) {
        String location = Double.toString(coordinates);
        String degree = location.substring(0, location.indexOf(".")) + "°";
        double temp = Double.valueOf("0." + location.substring(location.indexOf(".") + 1)).doubleValue() * 60.0d;
        String location2 = Double.toString(temp);
        String mins = location2.substring(0, location2.indexOf(".")) + "'";
        double temp2 = Double.valueOf("0." + location2.substring(location2.indexOf(".") + 1)).doubleValue() * 60.0d;
        String location3 = Double.toString(temp2);
        String secs = location3.substring(0, location3.indexOf(".")) + '\"';
        if (type.equalsIgnoreCase("lon")) {
            if (degree.startsWith("-")) {
                return "W " + degree.replace("-", "") + mins + secs;
            }
            return "E " + degree.replace("-", "") + mins + secs;
        } else if (degree.startsWith("-")) {
            return "S " + degree.replace("-", "") + mins + secs;
        } else {
            return "N " + degree.replace("-", "") + mins + secs;
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        inputManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    @Override // org.odk.collect.android.widgets.IBinaryWidget
    public void setBinaryData(Object answer) {
        String s = (String) answer;
        this.mStringAnswer.setText(s);
        String[] sa = s.split(XFormAnswerDataSerializer.DELIMITER);
        this.mAnswerDisplay.setText(getContext().getString(R.string.latitude) + ": " + formatGps(Double.parseDouble(sa[0]), "lat") + "\n" + getContext().getString(R.string.longitude) + ": " + formatGps(Double.parseDouble(sa[1]), "lon") + "\n" + getContext().getString(R.string.altitude) + ": " + truncateDouble(sa[2]) + "m\n" + getContext().getString(R.string.accuracy) + ": " + truncateDouble(sa[3]) + "m");
        Collect.getInstance().getFormController().setIndexWaitingForData(null);
    }

    @Override // org.odk.collect.android.widgets.IBinaryWidget
    public boolean isWaitingForBinaryData() {
        return this.mPrompt.getIndex().equals(Collect.getInstance().getFormController().getIndexWaitingForData());
    }

    @Override // org.odk.collect.android.widgets.IBinaryWidget
    public void cancelWaitingForBinaryData() {
        Collect.getInstance().getFormController().setIndexWaitingForData(null);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l) {
        this.mViewButton.setOnLongClickListener(l);
        this.mGetLocationButton.setOnLongClickListener(l);
        this.mStringAnswer.setOnLongClickListener(l);
        this.mAnswerDisplay.setOnLongClickListener(l);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.mViewButton.cancelLongPress();
        this.mGetLocationButton.cancelLongPress();
        this.mStringAnswer.cancelLongPress();
        this.mAnswerDisplay.cancelLongPress();
    }
}
