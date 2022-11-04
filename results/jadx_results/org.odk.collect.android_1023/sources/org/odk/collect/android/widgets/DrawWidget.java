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
public class DrawWidget extends QuestionWidget implements IBinaryWidget {
    private static final String t = "DrawWidget";
    private String mBinaryName;
    private TextView mErrorTextView;
    private ImageView mImageView;
    private String mInstanceFolder = Collect.getInstance().getFormController().getInstancePath().getParent();
    private Button mDrawButton = new Button(getContext());

    public DrawWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        this.mErrorTextView = new TextView(context);
        this.mErrorTextView.setId(QuestionWidget.newUniqueId());
        this.mErrorTextView.setText("Selected file is not a valid image");
        setOrientation(1);
        TableLayout.LayoutParams params = new TableLayout.LayoutParams();
        params.setMargins(7, 5, 7, 5);
        this.mDrawButton.setId(QuestionWidget.newUniqueId());
        this.mDrawButton.setText(getContext().getString(R.string.draw_image));
        this.mDrawButton.setTextSize(1, this.mAnswerFontsize);
        this.mDrawButton.setPadding(20, 20, 20, 20);
        this.mDrawButton.setEnabled(!prompt.isReadOnly());
        this.mDrawButton.setLayoutParams(params);
        this.mDrawButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.DrawWidget.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "drawButton", "click", DrawWidget.this.mPrompt.getIndex());
                DrawWidget.this.launchDrawActivity();
            }
        });
        addView(this.mDrawButton);
        addView(this.mErrorTextView);
        if (this.mPrompt.isReadOnly()) {
            this.mDrawButton.setVisibility(8);
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
            this.mImageView.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.DrawWidget.2
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    Collect.getInstance().getActivityLogger().logInstanceAction(this, "viewImage", "click", DrawWidget.this.mPrompt.getIndex());
                    DrawWidget.this.launchDrawActivity();
                }
            });
            addView(this.mImageView);
        }
    }

    public void launchDrawActivity() {
        this.mErrorTextView.setVisibility(8);
        Intent i = new Intent(getContext(), DrawActivity.class);
        i.putExtra(DrawActivity.OPTION, DrawActivity.OPTION_DRAW);
        if (this.mBinaryName != null) {
            File f = new File(this.mInstanceFolder + File.separator + this.mBinaryName);
            i.putExtra(DrawActivity.REF_IMAGE, Uri.fromFile(f));
        }
        i.putExtra(DrawActivity.EXTRA_OUTPUT, Uri.fromFile(new File(Collect.TMPFILE_PATH)));
        try {
            Collect.getInstance().getFormController().setIndexWaitingForData(this.mPrompt.getIndex());
            ((Activity) getContext()).startActivityForResult(i, 13);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(getContext(), getContext().getString(R.string.activity_not_found, "draw image"), 0).show();
            Collect.getInstance().getFormController().setIndexWaitingForData(null);
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
        this.mDrawButton.setText(getContext().getString(R.string.draw_image));
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        if (this.mBinaryName != null) {
            return new StringData(this.mBinaryName.toString());
        }
        return null;
    }

    @Override // org.odk.collect.android.widgets.IBinaryWidget
    public void setBinaryData(Object answer) {
        if (this.mBinaryName != null) {
            deleteMedia();
        }
        File newImage = (File) answer;
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
        this.mDrawButton.setOnLongClickListener(l);
        if (this.mImageView != null) {
            this.mImageView.setOnLongClickListener(l);
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.mDrawButton.cancelLongPress();
        if (this.mImageView != null) {
            this.mImageView.cancelLongPress();
        }
    }
}
