package org.odk.collect.android.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import java.io.File;
import java.io.IOException;
import org.javarosa.core.model.FormIndex;
import org.javarosa.core.reference.InvalidReferenceException;
import org.javarosa.core.reference.ReferenceManager;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
/* loaded from: classes.dex */
public class AudioButton extends ImageButton implements View.OnClickListener {
    private static final String t = "AudioButton";
    AudioHandler handler;

    /* loaded from: classes.dex */
    public static class AudioHandler {
        private String URI;
        private FormIndex index;
        private MediaPlayer player = null;
        private String selectionDesignator;

        public AudioHandler(FormIndex index, String selectionDesignator, String URI) {
            this.index = index;
            this.selectionDesignator = selectionDesignator;
            this.URI = URI;
        }

        public void playAudio(Context c) {
            Collect.getInstance().getActivityLogger().logInstanceAction(this, "onClick.playAudioPrompt", this.selectionDesignator, this.index);
            if (this.URI == null) {
                Log.e(AudioButton.t, "No audio file was specified");
                Toast.makeText(c, c.getString(R.string.audio_file_error), 1).show();
                return;
            }
            String audioFilename = "";
            try {
                audioFilename = ReferenceManager._().DeriveReference(this.URI).getLocalURI();
            } catch (InvalidReferenceException e) {
                Log.e(AudioButton.t, "Invalid reference exception");
                e.printStackTrace();
            }
            File audioFile = new File(audioFilename);
            if (!audioFile.exists()) {
                String errorMsg = c.getString(R.string.file_missing, audioFile);
                Log.e(AudioButton.t, errorMsg);
                Toast.makeText(c, errorMsg, 1).show();
                return;
            }
            stopPlaying();
            this.player = new MediaPlayer();
            try {
                this.player.setDataSource(audioFilename);
                this.player.prepare();
                this.player.start();
                this.player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: org.odk.collect.android.views.AudioButton.AudioHandler.1
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
            } catch (IOException e2) {
                String errorMsg2 = c.getString(R.string.audio_file_invalid);
                Log.e(AudioButton.t, errorMsg2);
                Toast.makeText(c, errorMsg2, 1).show();
                e2.printStackTrace();
            }
        }

        public void stopPlaying() {
            if (this.player != null) {
                this.player.release();
            }
        }
    }

    public AudioButton(Context context, FormIndex index, String selectionDesignator, String URI) {
        super(context);
        setOnClickListener(this);
        this.handler = new AudioHandler(index, selectionDesignator, URI);
        Bitmap b = BitmapFactory.decodeResource(context.getResources(), 17301554);
        setImageBitmap(b);
    }

    public void playAudio() {
        this.handler.playAudio(getContext());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        playAudio();
    }

    public void stopPlaying() {
        this.handler.stopPlaying();
    }
}
