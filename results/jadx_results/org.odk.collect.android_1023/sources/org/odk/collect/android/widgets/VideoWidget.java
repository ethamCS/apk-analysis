package org.odk.collect.android.widgets;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TableLayout;
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
public class VideoWidget extends QuestionWidget implements IBinaryWidget {
    private static final String t = "MediaWidget";
    private String mBinaryName;
    private Button mChooseButton;
    private Button mPlayButton;
    private String mInstanceFolder = Collect.getInstance().getFormController().getInstancePath().getParent();
    private Button mCaptureButton = new Button(getContext());

    public VideoWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        setOrientation(1);
        TableLayout.LayoutParams params = new TableLayout.LayoutParams();
        params.setMargins(7, 5, 7, 5);
        this.mCaptureButton.setId(QuestionWidget.newUniqueId());
        this.mCaptureButton.setText(getContext().getString(R.string.capture_video));
        this.mCaptureButton.setTextSize(1, this.mAnswerFontsize);
        this.mCaptureButton.setPadding(20, 20, 20, 20);
        this.mCaptureButton.setEnabled(!prompt.isReadOnly());
        this.mCaptureButton.setLayoutParams(params);
        this.mCaptureButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.VideoWidget.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(VideoWidget.this, "captureButton", "click", VideoWidget.this.mPrompt.getIndex());
                Intent i = new Intent("android.media.action.VIDEO_CAPTURE");
                i.putExtra(DrawActivity.EXTRA_OUTPUT, MediaStore.Video.Media.EXTERNAL_CONTENT_URI.toString());
                try {
                    Collect.getInstance().getFormController().setIndexWaitingForData(VideoWidget.this.mPrompt.getIndex());
                    ((Activity) VideoWidget.this.getContext()).startActivityForResult(i, 4);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(VideoWidget.this.getContext(), VideoWidget.this.getContext().getString(R.string.activity_not_found, "capture video"), 0).show();
                    Collect.getInstance().getFormController().setIndexWaitingForData(null);
                }
            }
        });
        this.mChooseButton = new Button(getContext());
        this.mChooseButton.setId(QuestionWidget.newUniqueId());
        this.mChooseButton.setText(getContext().getString(R.string.choose_video));
        this.mChooseButton.setTextSize(1, this.mAnswerFontsize);
        this.mChooseButton.setPadding(20, 20, 20, 20);
        this.mChooseButton.setEnabled(!prompt.isReadOnly());
        this.mChooseButton.setLayoutParams(params);
        this.mChooseButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.VideoWidget.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(VideoWidget.this, "chooseButton", "click", VideoWidget.this.mPrompt.getIndex());
                Intent i = new Intent("android.intent.action.GET_CONTENT");
                i.setType("video/*");
                try {
                    Collect.getInstance().getFormController().setIndexWaitingForData(VideoWidget.this.mPrompt.getIndex());
                    ((Activity) VideoWidget.this.getContext()).startActivityForResult(i, 9);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(VideoWidget.this.getContext(), VideoWidget.this.getContext().getString(R.string.activity_not_found, "choose video "), 0).show();
                    Collect.getInstance().getFormController().setIndexWaitingForData(null);
                }
            }
        });
        this.mPlayButton = new Button(getContext());
        this.mPlayButton.setId(QuestionWidget.newUniqueId());
        this.mPlayButton.setText(getContext().getString(R.string.play_video));
        this.mPlayButton.setTextSize(1, this.mAnswerFontsize);
        this.mPlayButton.setPadding(20, 20, 20, 20);
        this.mPlayButton.setLayoutParams(params);
        this.mPlayButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.VideoWidget.3
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(VideoWidget.this, "playButton", "click", VideoWidget.this.mPrompt.getIndex());
                Intent i = new Intent("android.intent.action.VIEW");
                File f = new File(VideoWidget.this.mInstanceFolder + File.separator + VideoWidget.this.mBinaryName);
                i.setDataAndType(Uri.fromFile(f), "video/*");
                try {
                    ((Activity) VideoWidget.this.getContext()).startActivity(i);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(VideoWidget.this.getContext(), VideoWidget.this.getContext().getString(R.string.activity_not_found, "video video"), 0).show();
                }
            }
        });
        this.mBinaryName = prompt.getAnswerText();
        if (this.mBinaryName != null) {
            this.mPlayButton.setEnabled(true);
        } else {
            this.mPlayButton.setEnabled(false);
        }
        addView(this.mCaptureButton);
        addView(this.mChooseButton);
        addView(this.mPlayButton);
        if (this.mPrompt.isReadOnly()) {
            this.mCaptureButton.setVisibility(8);
            this.mChooseButton.setVisibility(8);
        }
    }

    private void deleteMedia() {
        String name = this.mBinaryName;
        this.mBinaryName = null;
        int del = MediaUtils.deleteVideoFileFromMediaProvider(this.mInstanceFolder + File.separator + name);
        Log.i(t, "Deleted " + del + " rows from media content provider");
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        deleteMedia();
        this.mPlayButton.setEnabled(false);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        if (this.mBinaryName != null) {
            return new StringData(this.mBinaryName.toString());
        }
        return null;
    }

    private String getPathFromUri(Uri uri) {
        if (uri.toString().startsWith("file")) {
            return uri.toString().substring(6);
        }
        String[] videoProjection = {"_data"};
        Cursor c = null;
        try {
            c = getContext().getContentResolver().query(uri, videoProjection, null, null, null);
            int column_index = c.getColumnIndexOrThrow("_data");
            String videoPath = null;
            if (c.getCount() > 0) {
                c.moveToFirst();
                videoPath = c.getString(column_index);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }

    @Override // org.odk.collect.android.widgets.IBinaryWidget
    public void setBinaryData(Object binaryuri) {
        if (this.mBinaryName != null) {
            deleteMedia();
        }
        String binaryPath = getPathFromUri((Uri) binaryuri);
        String extension = binaryPath.substring(binaryPath.lastIndexOf("."));
        String destVideoPath = this.mInstanceFolder + File.separator + System.currentTimeMillis() + extension;
        File source = new File(binaryPath);
        File newVideo = new File(destVideoPath);
        FileUtils.copyFile(source, newVideo);
        if (newVideo.exists()) {
            ContentValues values = new ContentValues(6);
            values.put(FileUtils.TITLE, newVideo.getName());
            values.put("_display_name", newVideo.getName());
            values.put("date_added", Long.valueOf(System.currentTimeMillis()));
            values.put("_data", newVideo.getAbsolutePath());
            Uri VideoURI = getContext().getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, values);
            Log.i(t, "Inserting VIDEO returned uri = " + VideoURI.toString());
        } else {
            Log.e(t, "Inserting Video file FAILED");
        }
        this.mBinaryName = newVideo.getName();
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
        this.mPlayButton.setOnLongClickListener(l);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.mCaptureButton.cancelLongPress();
        this.mChooseButton.cancelLongPress();
        this.mPlayButton.cancelLongPress();
    }
}
