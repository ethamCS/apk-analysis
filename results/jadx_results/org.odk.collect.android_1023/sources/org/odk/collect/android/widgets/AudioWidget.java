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
public class AudioWidget extends QuestionWidget implements IBinaryWidget {
    private static final String t = "MediaWidget";
    private String mBinaryName;
    private Button mChooseButton;
    private Button mPlayButton;
    private String mInstanceFolder = Collect.getInstance().getFormController().getInstancePath().getParent();
    private Button mCaptureButton = new Button(getContext());

    public AudioWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        setOrientation(1);
        TableLayout.LayoutParams params = new TableLayout.LayoutParams();
        params.setMargins(7, 5, 7, 5);
        this.mCaptureButton.setId(QuestionWidget.newUniqueId());
        this.mCaptureButton.setText(getContext().getString(R.string.capture_audio));
        this.mCaptureButton.setTextSize(1, this.mAnswerFontsize);
        this.mCaptureButton.setPadding(20, 20, 20, 20);
        this.mCaptureButton.setEnabled(!prompt.isReadOnly());
        this.mCaptureButton.setLayoutParams(params);
        this.mCaptureButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.AudioWidget.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "captureButton", "click", AudioWidget.this.mPrompt.getIndex());
                Intent i = new Intent("android.provider.MediaStore.RECORD_SOUND");
                i.putExtra(DrawActivity.EXTRA_OUTPUT, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString());
                try {
                    Collect.getInstance().getFormController().setIndexWaitingForData(AudioWidget.this.mPrompt.getIndex());
                    ((Activity) AudioWidget.this.getContext()).startActivityForResult(i, 3);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(AudioWidget.this.getContext(), AudioWidget.this.getContext().getString(R.string.activity_not_found, "audio capture"), 0).show();
                    Collect.getInstance().getFormController().setIndexWaitingForData(null);
                }
            }
        });
        this.mChooseButton = new Button(getContext());
        this.mChooseButton.setId(QuestionWidget.newUniqueId());
        this.mChooseButton.setText(getContext().getString(R.string.choose_sound));
        this.mChooseButton.setTextSize(1, this.mAnswerFontsize);
        this.mChooseButton.setPadding(20, 20, 20, 20);
        this.mChooseButton.setEnabled(!prompt.isReadOnly());
        this.mChooseButton.setLayoutParams(params);
        this.mChooseButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.AudioWidget.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "chooseButton", "click", AudioWidget.this.mPrompt.getIndex());
                Intent i = new Intent("android.intent.action.GET_CONTENT");
                i.setType("audio/*");
                try {
                    Collect.getInstance().getFormController().setIndexWaitingForData(AudioWidget.this.mPrompt.getIndex());
                    ((Activity) AudioWidget.this.getContext()).startActivityForResult(i, 8);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(AudioWidget.this.getContext(), AudioWidget.this.getContext().getString(R.string.activity_not_found, "choose audio"), 0).show();
                    Collect.getInstance().getFormController().setIndexWaitingForData(null);
                }
            }
        });
        this.mPlayButton = new Button(getContext());
        this.mPlayButton.setId(QuestionWidget.newUniqueId());
        this.mPlayButton.setText(getContext().getString(R.string.play_audio));
        this.mPlayButton.setTextSize(1, this.mAnswerFontsize);
        this.mPlayButton.setPadding(20, 20, 20, 20);
        this.mPlayButton.setLayoutParams(params);
        this.mPlayButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.widgets.AudioWidget.3
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "playButton", "click", AudioWidget.this.mPrompt.getIndex());
                Intent i = new Intent("android.intent.action.VIEW");
                File f = new File(AudioWidget.this.mInstanceFolder + File.separator + AudioWidget.this.mBinaryName);
                i.setDataAndType(Uri.fromFile(f), "audio/*");
                try {
                    ((Activity) AudioWidget.this.getContext()).startActivity(i);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(AudioWidget.this.getContext(), AudioWidget.this.getContext().getString(R.string.activity_not_found, "play audio"), 0).show();
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
        int del = MediaUtils.deleteAudioFileFromMediaProvider(this.mInstanceFolder + File.separator + name);
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
        String[] audioProjection = {"_data"};
        String audioPath = null;
        Cursor c = null;
        try {
            c = getContext().getContentResolver().query(uri, audioProjection, null, null, null);
            int column_index = c.getColumnIndexOrThrow("_data");
            if (c.getCount() > 0) {
                c.moveToFirst();
                audioPath = c.getString(column_index);
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
        String destAudioPath = this.mInstanceFolder + File.separator + System.currentTimeMillis() + extension;
        File source = new File(binaryPath);
        File newAudio = new File(destAudioPath);
        FileUtils.copyFile(source, newAudio);
        if (newAudio.exists()) {
            ContentValues values = new ContentValues(6);
            values.put(FileUtils.TITLE, newAudio.getName());
            values.put("_display_name", newAudio.getName());
            values.put("date_added", Long.valueOf(System.currentTimeMillis()));
            values.put("_data", newAudio.getAbsolutePath());
            Uri AudioURI = getContext().getContentResolver().insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, values);
            Log.i(t, "Inserting AUDIO returned uri = " + AudioURI.toString());
            this.mBinaryName = newAudio.getName();
            Log.i(t, "Setting current answer to " + newAudio.getName());
        } else {
            Log.e(t, "Inserting Audio file FAILED");
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
