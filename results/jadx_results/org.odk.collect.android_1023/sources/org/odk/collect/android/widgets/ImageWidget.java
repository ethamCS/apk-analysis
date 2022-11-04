package org.odk.collect.android.widgets;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.StringData;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.R;
import org.odk.collect.android.activities.DrawActivity;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.utilities.FileUtils;
import org.odk.collect.android.utilities.MediaUtils;
/* loaded from: classes.dex */
public class ImageWidget extends QuestionWidget implements IBinaryWidget {
    private static final String t = "MediaWidget";
    private String mBinaryName;
    private Button mChooseButton;
    private TextView mErrorTextView;
    private ImageView mImageView;
    private String mInstanceFolder = Collect.getInstance().getFormController().getInstancePath().getParent();
    private Button mCaptureButton = new Button(getContext());

    public ImageWidget(Context context, FormEntryPrompt prompt) {
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
        this.mCaptureButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.ImageWidget.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "captureButton", "click", ImageWidget.this.mPrompt.getIndex());
                ImageWidget.this.mErrorTextView.setVisibility(8);
                Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
                i.putExtra(DrawActivity.EXTRA_OUTPUT, Uri.fromFile(new File(Collect.TMPFILE_PATH)));
                try {
                    Collect.getInstance().getFormController().setIndexWaitingForData(ImageWidget.this.mPrompt.getIndex());
                    ((Activity) ImageWidget.this.getContext()).startActivityForResult(i, 1);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(ImageWidget.this.getContext(), ImageWidget.this.getContext().getString(R.string.activity_not_found, "image capture"), 0).show();
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
        this.mChooseButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.ImageWidget.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "chooseButton", "click", ImageWidget.this.mPrompt.getIndex());
                ImageWidget.this.mErrorTextView.setVisibility(8);
                Intent i = new Intent("android.intent.action.GET_CONTENT");
                i.setType("image/*");
                try {
                    Collect.getInstance().getFormController().setIndexWaitingForData(ImageWidget.this.mPrompt.getIndex());
                    ((Activity) ImageWidget.this.getContext()).startActivityForResult(i, 7);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(ImageWidget.this.getContext(), ImageWidget.this.getContext().getString(R.string.activity_not_found, "choose image"), 0).show();
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
            this.mImageView = new ImageView(getContext());
            this.mImageView.setId(QuestionWidget.newUniqueId());
            Display display = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
            int screenWidth = display.getWidth();
            int screenHeight = display.getHeight();
            File f = new File(this.mInstanceFolder + File.separator + this.mBinaryName);
            if (f.exists()) {
                Bitmap bmp = FileUtils.getBitmapScaledToDisplay(f, screenHeight, screenWidth);
                if (bmp == null) {
                    this.mErrorTextView.setVisibility(0);
                }
                this.mImageView.setImageBitmap(bmp);
            } else {
                this.mImageView.setImageBitmap(null);
            }
            this.mImageView.setPadding(10, 10, 10, 10);
            this.mImageView.setAdjustViewBounds(true);
            this.mImageView.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.ImageWidget.3
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    Collect.getInstance().getActivityLogger().logInstanceAction(this, "viewButton", "click", ImageWidget.this.mPrompt.getIndex());
                    Intent i = new Intent("android.intent.action.VIEW");
                    Uri uri = MediaUtils.getImageUriFromMediaProvider(ImageWidget.this.mInstanceFolder + File.separator + ImageWidget.this.mBinaryName);
                    if (uri != null) {
                        Log.i(ImageWidget.t, "setting view path to: " + uri);
                        i.setDataAndType(uri, "image/*");
                        try {
                            ImageWidget.this.getContext().startActivity(i);
                        } catch (ActivityNotFoundException e) {
                            Toast.makeText(ImageWidget.this.getContext(), ImageWidget.this.getContext().getString(R.string.activity_not_found, "view image"), 0).show();
                        }
                    }
                }
            });
            addView(this.mImageView);
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
        this.mImageView.setImageBitmap(null);
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
        if (this.mImageView != null) {
            this.mImageView.setOnLongClickListener(l);
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.mCaptureButton.cancelLongPress();
        this.mChooseButton.cancelLongPress();
        if (this.mImageView != null) {
            this.mImageView.cancelLongPress();
        }
    }
}
