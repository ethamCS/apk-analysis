package org.odk.collect.android.widgets;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.Date;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.StringData;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.R;
import org.odk.collect.android.activities.DrawActivity;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.utilities.FileUtils;
import org.odk.collect.android.utilities.MediaUtils;
/* loaded from: classes.dex */
public class ImageWebViewWidget extends QuestionWidget implements IBinaryWidget {
    private static final String t = "MediaWidget";
    private String mBinaryName;
    private Button mChooseButton;
    private TextView mErrorTextView;
    private WebView mImageDisplay;
    private String mInstanceFolder = Collect.getInstance().getFormController().getInstancePath().getParent();
    private Button mCaptureButton = new Button(getContext());

    private String constructImageElement() {
        File f = new File(this.mInstanceFolder + File.separator + this.mBinaryName);
        Display display = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        int screenWidth = display.getWidth();
        if (!f.exists()) {
            return "";
        }
        String imgElement = "<img align=\"middle\" src=\"file:///" + f.getAbsolutePath() + "?" + new Date().getTime() + "\" width=\"" + Integer.toString(screenWidth - 10) + "\" >";
        return imgElement;
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public boolean suppressFlingGesture(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        if (this.mImageDisplay == null || this.mImageDisplay.getVisibility() != 0) {
            return false;
        }
        Rect rect = new Rect();
        this.mImageDisplay.getHitRect(rect);
        return rect.contains((int) e1.getRawX(), (int) e1.getRawY()) || rect.contains((int) e2.getRawX(), (int) e2.getRawY()) || rect.contains((int) (((double) (e1.getRawX() + e2.getRawX())) / 2.0d), (int) (((double) (e1.getRawY() + e2.getRawY())) / 2.0d));
    }

    public ImageWebViewWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        setOrientation(1);
        TableLayout.LayoutParams params = new TableLayout.LayoutParams();
        params.setMargins(7, 5, 7, 5);
        this.mErrorTextView = new TextView(context);
        this.mErrorTextView.setId(QuestionWidget.newUniqueId());
        this.mErrorTextView.setText("Selected file is not a valid image");
        this.mCaptureButton.setId(QuestionWidget.newUniqueId());
        this.mCaptureButton.setText(getContext().getString(R.string.capture_image));
        this.mCaptureButton.setTextSize(1, this.mAnswerFontsize);
        this.mCaptureButton.setPadding(20, 20, 20, 20);
        this.mCaptureButton.setEnabled(!prompt.isReadOnly());
        this.mCaptureButton.setLayoutParams(params);
        this.mCaptureButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.ImageWebViewWidget.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "captureButton", "click", ImageWebViewWidget.this.mPrompt.getIndex());
                ImageWebViewWidget.this.mErrorTextView.setVisibility(8);
                Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
                i.putExtra(DrawActivity.EXTRA_OUTPUT, Uri.fromFile(new File(Collect.TMPFILE_PATH)));
                try {
                    Collect.getInstance().getFormController().setIndexWaitingForData(ImageWebViewWidget.this.mPrompt.getIndex());
                    ((Activity) ImageWebViewWidget.this.getContext()).startActivityForResult(i, 1);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(ImageWebViewWidget.this.getContext(), ImageWebViewWidget.this.getContext().getString(R.string.activity_not_found, "image capture"), 0).show();
                    Collect.getInstance().getFormController().setIndexWaitingForData(null);
                }
            }
        });
        this.mChooseButton = new Button(getContext());
        this.mChooseButton.setId(QuestionWidget.newUniqueId());
        this.mChooseButton.setText(getContext().getString(R.string.choose_image));
        this.mChooseButton.setTextSize(1, this.mAnswerFontsize);
        this.mChooseButton.setPadding(20, 20, 20, 20);
        this.mChooseButton.setEnabled(!prompt.isReadOnly());
        this.mChooseButton.setLayoutParams(params);
        this.mChooseButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.ImageWebViewWidget.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "chooseButton", "click", ImageWebViewWidget.this.mPrompt.getIndex());
                ImageWebViewWidget.this.mErrorTextView.setVisibility(8);
                Intent i = new Intent("android.intent.action.GET_CONTENT");
                i.setType("image/*");
                try {
                    Collect.getInstance().getFormController().setIndexWaitingForData(ImageWebViewWidget.this.mPrompt.getIndex());
                    ((Activity) ImageWebViewWidget.this.getContext()).startActivityForResult(i, 7);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(ImageWebViewWidget.this.getContext(), ImageWebViewWidget.this.getContext().getString(R.string.activity_not_found, "choose image"), 0).show();
                    Collect.getInstance().getFormController().setIndexWaitingForData(null);
                }
            }
        });
        addView(this.mCaptureButton);
        addView(this.mChooseButton);
        addView(this.mErrorTextView);
        if (prompt.isReadOnly()) {
            this.mCaptureButton.setVisibility(8);
            this.mChooseButton.setVisibility(8);
        }
        this.mErrorTextView.setVisibility(8);
        this.mBinaryName = prompt.getAnswerText();
        if (this.mBinaryName != null) {
            this.mImageDisplay = new WebView(getContext());
            this.mImageDisplay.setId(QuestionWidget.newUniqueId());
            this.mImageDisplay.getSettings().setCacheMode(2);
            this.mImageDisplay.getSettings().setBuiltInZoomControls(true);
            this.mImageDisplay.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
            this.mImageDisplay.setVisibility(0);
            this.mImageDisplay.setLayoutParams(params);
            String html = "<body>" + constructImageElement() + "</body>";
            this.mImageDisplay.loadDataWithBaseURL("file:///" + this.mInstanceFolder + File.separator, html, "text/html", "utf-8", "");
            addView(this.mImageDisplay);
        }
    }

    private void deleteMedia() {
        String name = this.mBinaryName;
        this.mBinaryName = null;
        int del = MediaUtils.deleteImageFileFromMediaProvider(this.mInstanceFolder + File.separator + name);
        Log.i(t, "Deleted " + del + " rows from media content provider");
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        deleteMedia();
        if (this.mImageDisplay != null) {
            this.mImageDisplay.loadDataWithBaseURL("file:///" + this.mInstanceFolder + File.separator, "<body></body>", "text/html", "utf-8", "");
            this.mImageDisplay.setVisibility(4);
        }
        this.mErrorTextView.setVisibility(8);
        this.mCaptureButton.setText(getContext().getString(R.string.capture_image));
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        if (this.mBinaryName != null) {
            return new StringData(this.mBinaryName.toString());
        }
        return null;
    }

    @Override // org.odk.collect.android.widgets.IBinaryWidget
    public void setBinaryData(Object newImageObj) {
        if (this.mBinaryName != null) {
            deleteMedia();
        }
        File newImage = (File) newImageObj;
        if (newImage.exists()) {
            ContentValues values = new ContentValues(6);
            values.put(FileUtils.TITLE, newImage.getName());
            values.put("_display_name", newImage.getName());
            values.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            values.put("mime_type", "image/jpeg");
            values.put("_data", newImage.getAbsolutePath());
            Uri imageURI = getContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
            Log.i(t, "Inserting image returned uri = " + imageURI.toString());
            this.mBinaryName = newImage.getName();
            Log.i(t, "Setting current answer to " + newImage.getName());
        } else {
            Log.e(t, "NO IMAGE EXISTS at: " + newImage.getAbsolutePath());
        }
        Collect.getInstance().getFormController().setIndexWaitingForData(null);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        inputManager.hideSoftInputFromWindow(getWindowToken(), 0);
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
        this.mCaptureButton.setOnLongClickListener(l);
        this.mChooseButton.setOnLongClickListener(l);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.mCaptureButton.cancelLongPress();
        this.mChooseButton.cancelLongPress();
    }
}
